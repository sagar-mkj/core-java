class Fan {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Fan is ON");
        } else {
            isOn = false;
            System.out.println("Fan is OFF");
        }
        return isOn;
    }
}