class Problem {
    public static void main(String[] args) {
        int output = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                output = i;
                break;
            }
        }
        System.out.println(output);
    }
}