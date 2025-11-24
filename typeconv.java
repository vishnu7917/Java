import java.util.Scanner;
class typeconv
{
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        sobj.useDelimiter("\\\n");
        String str= sobj.next();
        String[] str1= str.split(" ");
        for(String x: str1)
        {
            System.out.println(x);
        }
        System.out.println(str.replace('l','u'));
        // comareTo
        String s= "Hello";
        System.out.println(s.compareTo(str));
        // substring

        System.out.println(str.substring(4,10));

        //Concatination
        System.out.println("conactinated string" + str+str1+s);
    }
}