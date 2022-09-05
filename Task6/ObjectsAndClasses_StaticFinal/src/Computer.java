public class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Monitor monitor;
    private KeyBoard keyBoard;

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    /**
     * @return Возвращает общий вес всех комплектующих созданного компьтера
     */
    public double getWeightComputer() {
        return processor.getWeight() +
                ram.getWeight() +
                storage.getWeight() +
                monitor.getWeight() +
                keyBoard.getWeight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public String toString() {
        return "Производитель: " + vendor + " / "+ "Имя компьютера: " + name + "\n" +
                "Процессор:" + "\n" +
                " Частота процессовар: " + processor.getFrequency() + "\n" +
                " Кол-во ядер: " + processor.getNumberOfCores() + "\n" +
                " Производитель: " + processor.getManufacturer() + "\n" +
                " Вес: " + processor.getWeight() + "\n" +
                "Оперативная память: " + "\n" +
                " Тип: " + ram.getType() + "\n" +
                " Объем: " + ram.getVolume() + "\n" +
                " Вес: " + ram.getWeight() + "\n" +
                "Накопитель информации: " + "\n" +
                " Тип: " + storage.getTypeStorage() + "\n" +
                " Объем памяти: " + storage.getMemoryCapacity() + "\n" +
                " Вес: " + storage.getWeight() + "\n" +
                "Экран: " + "\n" +
                " Диогональ: " + monitor.getDiagonal() + "\n" +
                " Тип: " + monitor.getTypeMonitor() + "\n" +
                " Вес: " + monitor.getWeight() + "\n" +
                "Клавиатура: " + "\n" +
                " Тип: " + keyBoard.getType() + "\n" +
                " Наличие подсветки: " + keyBoard.isBacklight() + "\n" +
                " Вес: " + keyBoard.getWeight() + "\n" +

                "Общий вес всех комплектующих: " + getWeightComputer()
                 ;
    }
}
