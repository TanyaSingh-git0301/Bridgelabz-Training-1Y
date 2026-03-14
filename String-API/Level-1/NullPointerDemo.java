public class NullPointerDemo {

    public static void main(String[] args) {
        NullPointerDemo demo = new NullPointerDemo();

        System.out.println("Checking :");
        demo.checkBeforeAccess();
    }

     
    public void generateException() {
        String text = null;
        System.out.println(text.toUpperCase()); 
    }

    
    public void checkBeforeAccess() {
        String text = null;

        if  (text != null) {
           System.out.println(text.length());
        } else {
            System.out.println("Variable 'text' is null.");
        }
    }
}