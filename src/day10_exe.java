public class day10_exe {
    static void main() {
        String name = null;
        try {
            System.out.println(name.charAt(3));
            System.out.println(9/0);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out OfBounds Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Executed Successfully");
            name="";
        }
        System.out.println("running");
        System.out.println("Name :"+name);


    }

}
