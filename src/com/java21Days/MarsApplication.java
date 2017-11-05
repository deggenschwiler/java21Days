class MarsApplication {

    public static void main(String[] arguments) {

        final int SPEED = 2;

        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = SPEED;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "Beep nop";
        opportunity.speed = 2;
        opportunity.temperature = -10.072;
        opportunity.checkTemperature();
        opportunity.showAttributes();
    }
}
