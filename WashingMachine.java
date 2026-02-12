class WashingMachine {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Washing Machine is ON");
        } else {
            isOn = false;
            System.out.println("Washing Machine is OFF");
        }
        return isOn;
    }
}