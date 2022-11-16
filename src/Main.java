import java.util.Scanner;

class apples{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, rsquare, h, v;
        System.out.println("Please enter the radius");
        r= input.nextDouble();
        System.out.println("Please enter the height");
        h = input.nextDouble();
        rsquare = Math.pow(r, 2);
        v = Math.PI * rsquare * h;
        System.out.println("The answer is "+v);
}

}
