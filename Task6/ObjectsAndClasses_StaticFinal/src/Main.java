public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("intel", "PC");
        computer.setProcessor(new Processor(144.2, 4, "Intel", 15.0));
        computer.setRam(new Ram("DDR5",32, 30.0));
        computer.setStorage(new Storage(TypeStorage.HDD, 500, 250.0));
        computer.setMonitor(new Monitor(22,TypeMonitor.IPS, 5000));
        computer.setKeyBoard(new KeyBoard("Membrane",true, 1200));

        System.out.println(computer.toString());

    }
}
