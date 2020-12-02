class DemoCO{
    int  value1;
    int  value2;
    DemoCO(){
     value1 = 10;
     value2 = 20;
     //System.out.println("Inside 1st Constructor");
   }
   DemoCO(int a){
    value1 = a;
   // System.out.println("Inside 2nd Constructor");
  }
  DemoCO(int a,int b){
  value1 = a;
  value2 = b;
  //System.out.println("Inside 3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
public static void main(String args[]){
  DemoCO d1 = new DemoCO();
  DemoCO d2 = new DemoCO(30);
  DemoCO d3 = new DemoCO(30,40);
  System.out.println("Inside 1st Constructor");
  d1.display();
  System.out.println("Inside 2nd Constructor");
  d2.display();
  System.out.println("Inside 3rd Constructor");
  d3.display();
}
}