class Problem {
    public static void main(String[] args) {
        String modeValue = "default";

        for (int i = 0; i < args.length - 1; i += 2) {
            if (args[i].equals("mode")) {
                modeValue = args[i + 1];
                break;
            }
        }

        System.out.println(modeValue);
    }
}