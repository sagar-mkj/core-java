class Light {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light is ON");
        } else {
            isOn = false;
            System.out.println("Light is OFF");
        }
        return isOn;
    }
}