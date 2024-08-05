class Problem {
    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException("Input should be two parts each");
        }

        for (int i = 0; i < args.length; i += 2) {
            String parameter1 = args[i];
            String parameter2 = args[i + 1];
            System.out.println(parameter1 + "=" + parameter2);
        }

    }
}