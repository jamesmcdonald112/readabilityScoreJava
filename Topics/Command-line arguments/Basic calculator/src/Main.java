class Problem {
    public static void main(String[] args) {
        if (args.length != 3) { // Check if there are exactly three arguments
            throw new IllegalArgumentException("Must have an operator and 2 numbers");
        }

        String operator = args[0];
        String operatorRegex = "[+\\-*/]"; // Regex for allowed operators

        if (!operator.matches(operatorRegex)) {
            System.out.println("Unknown operator");
            return;
        }

        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(args[1]);
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            return;
        }

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }

        System.out.println(result);
    }
}