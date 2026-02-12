class Speaker {
    static boolean isOn;

    static boolean onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Speaker is ON");
        } else {
            isOn = false;
            System.out.println("Speaker is OFF");
        }
        return isOn;
    }
}