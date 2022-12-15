public class Main {
    public static void main(String[] args) {
        Boos boos = new Boos();
        boos.setZdorovie(100);
        boos.setUron(80);
        boos.setProtection("Magia");

        System.out.println("здоровье " + boos.getZdorovie()+ " урон "+ boos.getUron()+ " зашита " + boos.getProtection());

    }
}