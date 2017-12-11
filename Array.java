/**
 * Array
 * Author : M A Hakeem MK
 * Date : 10/12/2017
 */
public class Array {
    int[] array;
    SearchResult searchResult;
    public Array(int length,int[] arr) {
        array = new int[length];
        for(int i=0;i<arr.length;i++) {
            array[i] = arr[i];
        }
    }
    public void traverse() {
        for(int i:array) {
            System.out.println(i);
        }
    }
    // public Type insert() {
        
    // }
    // public Type delete() {
        
    // }
    public SearchResult search(int key) {
        searchResult = new SearchResult();
        for(int i=0;i<array.length;i++) {
            if (array[i]==key) {
                   searchResult.value = array[i];
                   searchResult.isValue = true;
                   searchResult.position = i+1;
                   return searchResult;
            } 
        }
        searchResult.value = key;
        searchResult.isValue = false;
        return searchResult;
    }
    // public Type update() {
        
    // }
    public static void traverse(int[] array) {
        for(int i:array) {
            System.out.println(i);
        }
    }
    public static boolean search(int[] array,int key) {
        for(int i:array) {
            if (i==key) {
                return true;   
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1,4,3,6,2,8,2};
        Array obj = new Array(array.length,array);
       System.out.println(obj.search(5));
       System.out.println(obj.search(6));
       int[] arr2 = {5,4,6,8};
       System.out.println(Array.search(arr2,1)); 
    }
}

/**
 * SearchResult
 */
class SearchResult {

    int value;
    boolean isValue;
    int position;
    public String toString() {
        if (this.isValue) {
            return this.value+" is found at "+this.position+"th position.";
        } else {
            return this.value+" not found!";
        }
    }
}