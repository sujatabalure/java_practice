public class data_types {

    public static void main(String[] args){
        //swap two numbers without using temp variable
        /*int a=5;
        int b= 10;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+ a  +  ",b = "+ b );*/
       /*print ascii of z

        char ch = 'Z';
        int ascii = ch;
        System.out.println(ascii);*/
        //convert fahrenheit into celsius
        /*double fahrenheit = 98.6;
        int celsius  = (int)(fahrenheit -32 )*5/9;
        System.out.println("conversion of Fahrenheit "+ fahrenheit +" to celsius is " +celsius);*/
        /*check number is even or odd using bitwise operator
        int num =25;
        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        }
        else
         {
            System.out.println(num+ " is odd");
          }*/
        /*print sum of given number
        int num = 1234;
        int sum =0;
        while (num!=0){
            int last_number = num%10;
            sum += last_number;
            num = num/10;
        }
        System.out.println(sum);*/
        /*conversion double to int

        double d =9.7;
        int i = ( int) d;
        System.out.println(i);*/

        /*count total bit set in integer
        int num =15;
        int count =0;
        while (num!=0){
            if ((num & 1)==1){
                count++;
            }num = num>>1;
        }
        System.out.println("total sum of bits in 15 is "+ count);
*/    //widening and narrowing
        int i= 150;
        byte b =(byte) i;
        System.out.println(b);
        }
    }

