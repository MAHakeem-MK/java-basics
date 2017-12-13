/**
 * Array
 * Author : M A Hakeem MK
 * Date : 10/12/2017
 */
import java.util.Scanner;

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
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    public void insert(int value,int position) {
        position--;
        int[] tempArray = new int[array.length+1];
        for(int i=0;i<array.length;i++) {
            tempArray[i] = array[i];
        }
          for (int i = (tempArray.length-2);i>=position ;i-- ) {
            tempArray[i+1] = tempArray[i];
          }
          tempArray[position] = value;
          array = tempArray;
    }

    public void update(int value,int position) {
      position--;
      array[position] = value;
    }

    public void delete(int position) {
      position--;
      for (int i = position;i<(array.length-1) ;i++ ) {
        array[i] = array[i+1];
      }
      int[] tempArray = new int[array.length-1];
      for(int i=0;i<tempArray.length;i++) {
          tempArray[i] = array[i];
      }
      array = tempArray;
    }

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
        int selection;
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("************************************");
            menu.display();
            System.out.println("************************************");
            System.out.println("**enter 0 to quit");
            selection = sc.nextInt();
            menu.onSelect(selection);
        }while(selection!=0);
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
            return this.value+" is found at "+"position "+this.position;
        } else {
            return this.value+" not found!";
        }
    }
}
/**
 * Menu
 */
class Menu {

    final String menu1 = "1 : Create Array";
    final String menu2 = "2 : Traverse Array";
    final String menu3 = "3 : Insert value to Array";
    final String menu4 = "4 : Update value of Array"; 
    final String menu5 = "5 : Delete value from Array";
    final String menu6 = "6 : Search";

    Scanner scan = new Scanner(System.in);
    Array array;
    
    public void display() {
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(menu5);
        System.out.println(menu6);
    }
    public void onSelect(int key) {
        switch (key) {
            case 0 :
                break;
            case 1 : 
                    createArray();
                break;
            case 2 :
                    traverse();
                break;
            case 3 :
                    insert();
                break;
            case 4 :
                    update();
                break;
            case 5 :
                    delete();
                break;
            case 6 :
                    search();
                break;
            default:
                    System.out.println("Enter a valid key!");
                break;
        }
    }
    public void createArray() {
        int size;
        int[] tempArray;
        System.out.print("Enter size of array:");
        size = scan.nextInt();
        tempArray = new int[size];
        System.out.println("Enter values of array");
        for(int i=0;i<tempArray.length;i++) {
            tempArray[i] = scan.nextInt();
        }
        array = new Array(size,tempArray);
    }
    public void traverse() {
        if(array!=null) {
            array.traverse();
        } else {
            System.out.println("array is not available,please create one!");
        }
    }
    public void insert() {
        int position;
        int value;
        if(array!=null) {
            System.out.print("Enter the position the value to be inserted:");
            position = scan.nextInt();
            System.out.print("Enter the value to be inserted:");
            value = scan.nextInt();
            array.insert(value,position);
        } else {
            System.out.println("array is not available,please create one!");
        }
    }
    public void update() {
        int position;
        int value;
        if(array!=null) {
            System.out.print("Enter the position of value to be updated:");
            position = scan.nextInt();
            System.out.print("Enter value:");
            value = scan.nextInt();
            array.update(value,position);
        } else {
            System.out.println("array is not available,please create one!");
        }
    }
    public void delete() {
        int position;
        if(array!=null) {
            System.out.print("Enter position of value to be deleted:");
            position = scan.nextInt();
            array.delete(position);
        } else {
            System.out.println("array is not available,please create one!");
        }
    }
    public void search() {
        int key;
        if(array!=null) {
            System.out.print("Enter the value to be searched:");
            key = scan.nextInt();
            System.out.println(array.search(key)); 
        } else {
            System.out.println("array is not available,please create one!");
        }
    }
}