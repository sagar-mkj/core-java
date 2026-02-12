class Microwave {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Microwave is ON");
        } else {
            isOn = false;
            System.out.println("Microwave is OFF");
        }
        return isOn;
    }
}