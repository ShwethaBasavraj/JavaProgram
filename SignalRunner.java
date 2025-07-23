class SignalRunner {
    public static void main(String[] args) {
        boolean collected = Signal.signalDetailsCollecting("Red", "Traffic", "30 seconds", "Main Street", true);

        if (collected) {
            Signal.getSignalInfo();
        } else {
            System.out.println("Signal details are incomplete.");
        }
    }
}
