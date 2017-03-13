public enum Strategy implements IStrategy {

    CAPITALS {
        @Override
        public void doStuff(String output) {
            System.out.println(output.toUpperCase());
        }
    },
    LOWERCASE {
        @Override
        public void doStuff(String output) {
            System.out.println(output.toLowerCase());
        }
    }
}
