class AC {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("AC is ON");
        } else {
            isOn = false;
            System.out.println("AC is OFF");
        }
        return isOn;
    }
}