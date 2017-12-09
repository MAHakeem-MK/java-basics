/* 
*  HelloWorld
*  Author : M A Hakeem MK
*  Date : 09/12/2017
*/
public class HelloWorld {
    // constant welcome message
    private final String WELCOME_MESSAGE = "Hello World!";
    // return welcome message as string
    public String toString() {
		return WELCOME_MESSAGE;        
    }
    // main method
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        // print to console
        System.out.println(helloWorld);
    }
}