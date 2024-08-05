public class UserDefine {
    public static void main(String [] args){
        try {
            int i,j,k;
            i=5;
            j=4;
            k = i / j;
            if (k == 1)
                throw new myException("Ans should not be 1");
            System.out.println(k);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
class myException extends Exception{
    public myException(){

    }
    public myException(String msg){
        super(msg);
    }
}