public class B {
    int a;
    int b;
    public B(){}
    public int sum(){
        return a+b;
    }





    public static void main(String[] args) {
        System.out.println("생성자,합수 복습");
        new B();
        new B().sum();
        int sum=new B().sum();
        System.out.println(sum);

        B b=new B();




        }
}
