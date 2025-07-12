public class Main {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setKeyboard("Mechanical Keyboard")
                .build();

        System.out.println("Gaming PC: " + gamingPC);

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("Office PC: " + officePC);
    }
}
