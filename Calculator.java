public class Calculator {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("Menu Driven Calculator");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter your choice:");
                
                int choice = scanner.nextInt();
                
                if (choice == 5) {
                    System.out.println("Exiting the program.");
                    break;
                }
                
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result;
                
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                     
            }
            
        }
    }
}

