class Mobile {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Mobile is ON");
        } else {
            isOn = false;
            System.out.println("Mobile is OFF");
        }
        return isOn;
    }
}