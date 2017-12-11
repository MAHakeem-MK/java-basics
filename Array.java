/**
 * Array
 * Author : M A Hakeem MK
 * Date : 10/12/2017
 */
public class Array {
    int[] array;
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
    public boolean search(int key) {
        for(int i:array) {
            if (i==key) {
                return true;   
            } 
        }
        return false;
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