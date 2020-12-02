class A extends Thread
{
    int i;

        public void run(){
            try {
                for(i=0 ; i <= 5; i++){
                    System.out.println("I = "+i);
                    Thread.sleep(100);
                }
            }
            catch(Exception e){
                System.out.println("Error is: "+e);
            }
        }

}
class B extends Thread{
    int j;

        public void run() {
            try{
            for(j=0 ; j <= 5; j++){
                System.out.println("J = "+j);
                Thread.sleep(100);
            }
        }
        catch(Exception e){
            System.out.println("Error is:"+e);
        }
    
        }
    
}
class threadx{
    public static void main(String args[])
{
           A a1 = new A();
           B b1 = new B();
           a1.start();
           b1.start();

    }
}
