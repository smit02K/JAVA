class CommandLine_sum_2{
    public static void main(String args[]){

        try {

            for (int i = 0; i < args.length; i++) {
                System.out.println("Your argument " + (i + 1) + " is: " + Integer.parseInt(args[i]));
            }

            int sum = 0;

            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
            }

            System.out.println("\nSum of Command line Arguments is : " + sum);
        }

        catch (Exception e)
        {System.out.println("*Invalid input enter value as positive integers* \n TRY AGAIN "); }
    }
}
