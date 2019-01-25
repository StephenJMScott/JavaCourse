package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size();i++){
            System.out.println((i+1)+ ": "+ groceryList.get(i));

        }

    }

    public void modifyGroceryItem(String currentItem,String newItem){
        int pos = findItem(currentItem);
        if(pos>=0){
            modifyGroceryItem(pos, newItem);
        }
    }

    public void modifyGroceryItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery Item " +(pos+1) + " has been modified");

    }

    public void removeGroceryItem(String item){
        int pos = findItem(item);
        if(pos>=0){
            removeGroceryItem(pos);
        }
    }

    private void removeGroceryItem(int pos){
        groceryList.remove(pos);
    }

    public int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int pos = findItem(searchItem) ;
        if(pos>=0){
            return true;
        }
        return false;
    }
}
