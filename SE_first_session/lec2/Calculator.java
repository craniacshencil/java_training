import java.util.Scanner;
class Function{
    Scanner sc = new Scanner(System.in);
    public void areaOfCircle(){
       System.out.println("Enter the radius: ");
       int r = sc.nextInt();
       System.out.println("The area of circle with radius " + r + " is " + (Math.PI * r * r));
    }

    public void circumferenceOfCircle(){
       System.out.println("Enter the radius: ");
       int r = sc.nextInt();
       System.out.println("The circumference of circle with radius " + r + " is " + (Math.PI * r * 2));
    }

    public void areaOfRectangle(){
       System.out.println("Enter the length: ");
       int l = sc.nextInt();
       System.out.println("Enter the width: ");
       int w = sc.nextInt();
       System.out.println("The area of rectangle with length " + l + " and width " + w + " is " + (l * w));
    }

    public void volumeOfSphere(){
       System.out.println("Enter the radius: ");
       int r = sc.nextInt();
       System.out.println("The volumen of sphere with radius " + r + " is " + (Math.PI * r * r * r * 4 / 3));
    }

    public void surfaceAreaOfSphere(){
       System.out.println("Enter the radius: ");
       int r = sc.nextInt();
       System.out.println("The surface area of sphere with radius " + r + " is " + (Math.PI * r * r * 4));
    }

    public void areaOfSquare(){
        System.out.println("Enter length of side: ");
        int side = sc.nextInt();
        System.out.println("The area of square " + "with side length " + side + " is: " + (side * side));
    }

    public void areaOfRightAngledTriangle(){
        System.out.println("Enter height of triangle: ");
        int h = sc.nextInt();
        System.out.println("Enter base of triangle: ");
        int b = sc.nextInt();
        System.out.println("The area of a right angled triangle with base " + b + " and height " + h + " is " + (0.5 * b * h));
    }

    public void areaOfEquilateralTriangle(){
        System.out.println("Enter the lenght of the triangle: ");
        int side = sc.nextInt();
        System.out.println("The area of an equilateral triangle with side " + side + " is " + (0.5 * side * Math.sqrt(3) / 2 * side));
    }

    public void perimeterOfRectangle(){
       System.out.println("Enter the length: ");
       int l = sc.nextInt();
       System.out.println("Enter the width: ");
       int w = sc.nextInt();
       System.out.println("The perimeter of rectangle with length " + l + " and width " + w + " is " + (2 * (l + w)));
    }

    public void areaOfTriangle(){
        System.out.println("Enter height of triangle: ");
        int h = sc.nextInt();
        System.out.println("Enter base of triangle: ");
        int b = sc.nextInt();
        System.out.println("The area of a right angled triangle with base " + b + " and height " + h + " is " + (0.5 * b * h));
    }

    public void simpleInterest(){
        System.out.println("Enter the principle amount: ");
        double amt = sc.nextDouble();
        System.out.println("Enter the No. of years: ");
        int years = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Amount: " + amt);
        System.out.println("No. of years: " + years);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Simple Interest: " + (amt * years * rate / 100));
    }
}

class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Function exe = new Function();
        System.out.println("==List of Operations==");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate circumference of circle");
        System.out.println("3. Calculate area of rectangle");
        System.out.println("4. Calculate volume of sphere");
        System.out.println("5. Find surface area of sphere");
        System.out.println("6. Find area of square");
        System.out.println("7. Find area of right angle triangle");
        System.out.println("8.find area of equilateral triangle");
        System.out.println("9. Find perimeter of rectangle");
        System.out.println("10. Find area of triangle ");
        System.out.println("11. Find Simple Interest");
        System.out.println("0. Exit");
        while(true){
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0); break;
                case 1: exe.areaOfCircle(); break;
                case 2: exe.circumferenceOfCircle(); break;
                case 3: exe.areaOfRectangle(); break;
                case 4: exe.volumeOfSphere(); break;
                case 5: exe.surfaceAreaOfSphere(); break;
                case 6: exe.areaOfSquare(); break;
                case 7: exe.areaOfRightAngledTriangle(); break;
                case 8: exe.areaOfEquilateralTriangle(); break;
                case 9: exe.perimeterOfRectangle(); break;
                case 10: exe.areaOfTriangle(); break;
                case 11: exe.simpleInterest(); break;
            }
        }
    }
    
}
