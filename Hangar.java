class Hangar {

    public static void main(String[] args) {
        Car renault = new Car("Mégane");
        Boat quicksilver = new Boat("Hors-Bord");

        System.out.println(renault.doStuff());
        System.out.println(quicksilver.doStuff());
    }

}