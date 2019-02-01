package com.company;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null){
            //The list is empty, so this becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison<0){
                //new item is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem =currentItem.next();
                }else{
                    //there is no next, insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if(comparison>0){
                //new item is less, insert before
                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    //the node without a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root =newItem;
                }
                return true;
            }else{
                //equal
                System.out.println(newItem.getValue()+" is already present. Not added");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
       if(item!=null){
           System.out.println("Deleting item "+item.getValue());
       }

       ListItem currentItem = this.root;

       while(currentItem!=null){
           int comparison = currentItem.compareTo(item);
           if(comparison==0){
               //found record to delete
               if(currentItem==this.root){
                   this.root = currentItem.next();
               }else{
                   currentItem.previous().setNext(currentItem.next());
                   if(currentItem.next()!=null){
                       currentItem.next().setPrevious(currentItem.previous());

                   }
               }
               return true;
           }else if(comparison<0){
               currentItem=currentItem.next();
           }else{
               //comparison >0
               //We are at an item greater than the one to be deleted, therefore item not in list!
               return false;
           }
       }
       return false; //reached end of list without finding the item to delete.
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("List is empty");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
