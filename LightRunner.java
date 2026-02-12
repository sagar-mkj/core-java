class LightRunner {
    public static void main(String[] args) {
        boolean ref = Light.onOrOff();
        System.out.println("Light current state: " + ref);
    }
}