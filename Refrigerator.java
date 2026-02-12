class Refrigerator {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Refrigerator is ON");
        } else {
            isOn = false;
            System.out.println("Refrigerator is OFF");
        }
        return isOn;
    }
}