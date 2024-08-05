package Chapter5;

public class Assume {
    public static void main(String []args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;
        if (i==1)
            System.out.println(i);
        else
            System.out.println(false);

        if (j==3)
            System.out.println(true);
        else
            System.out.println(false);

        if ((i>=1) && (j<4))
            System.out.println(true);
        else
            System.out.println(false);

        if ((m<=99) & (k<m))
            System.out.println(true);
        else
            System.out.println(false);

        if ((j>=i) || (k==m))
            System.out.println(true);
        else
            System.out.println(false);

        if ((k+m<j) | (3-j>=k))
            System.out.println(true);
        else
            System.out.println(false);

        if (!(k>m))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
