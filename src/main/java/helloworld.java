import java.util.Scanner;

public class helloworld
{

    //public double cgpaCalculator( String array[])
    public double cgpaCalculator( double value)
    {

        if(value<90)
            return 4;
        else if()
//        double[] arr = new double[array.length];
//        double[] gpa = new double[array.length];
//        double avg = 0.0;
//        for(int j=0;j< array.length;j++)
//        {
//            arr[j] = Integer.valueOf(array[j]);
//
//            if(arr[j] >= 90)
//            {
//                gpa[j]=4;
//            }
//            else if(arr[j] >= 80)
//            {
//                gpa[j]=3;
//            }
//            else if(arr[j] >= 70)
//            {
//                gpa[j]=2;
//            }
//            else if(arr[j] >= 60)
//            {
//                gpa[j]=1;
//            }
//            else
//            {
//                gpa[j]=0;
//            }
//            avg += gpa[j];
//        }
//
//        double result = avg/ gpa.length;
//
//        return result;
    }


    public static void main(String[] args) {


        //String arg1= args[0];
        int totalArgs = args.length;
        String[] argArray= new String[totalArgs];
        for(int i=0; i<totalArgs;i++)
        {
            argArray[i] = args[i];
        }

        //double result = cgpaCalculator(argArray);
       // System.out.println("your cgpa:"+ result);
    }
}
