public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        //To prevent exception we can use a try-catch block
        try{
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}