public class ExceptionHandling{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        try{
            int ans = 50/0;
            System.out.println(ans);
            int val = a[8];
            System.out.println(val);
        }catch(ArithmeticException e){
            System.out.println("Your hhsd");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("Excecuted always");
        }
        System.out.println("Rest of the code");
    }
}