public class Hospital {
    public static void main(String[] args) {

        System.out.println(getReport());
    }

    /**
     * @param count кол-во элементов в генерируемом массиве
     * @return Генерирует массив с заданым кол-ом элементов
     * и заполняет его значением сгенерированной температуры от 32 до 40
     */
    public static double[] generatePatientsTemperatures(int count) {

        double[] arr = new double[count];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = getRandomDoubleBetweenRange(32,40);
        }
        return arr;
    }

    /**
     * @return Возращает результат:
     * 1.Список температур пациентов
     * 2.Среднюю температуру всех пациентов
     * 3.Количесвто здоровых пациентов
     */
    public static StringBuilder getReport() {

        StringBuilder report = new StringBuilder();
        String[] patients = {"Иванов", "Петров", "Сидоров"};
        double[] temperatures = generatePatientsTemperatures(patients.length);
        double avgTmp = getAvgTemperatures(temperatures);
        int countHealthyPatients = getCountHealthyPatients(temperatures);

        report.append("Список температур пациентов: ").append(System.lineSeparator());

        for(int i = 0; i < patients.length; i++) {
            report.append("\t")
                    .append(patients[i])
                    .append(": ")
                    .append(String.format("%.1f",temperatures[i]))
                    .append(System.lineSeparator());
        }

        report.append("Средняя Температура: ")
                .append(System.lineSeparator())
                .append("\t")
                .append(String.format("%.1f",avgTmp))
                .append(System.lineSeparator())
                .append("Количесвто здоровых пациентов: ")
                .append(System.lineSeparator())
                .append("\t")
                .append(countHealthyPatients);
        return report;
    }

    /**
     * @param min мин значение температуры
     * @param max макс значение температуры
     * @return возвращает сгенерирование число от мин до макс включительно
     */
    public static double getRandomDoubleBetweenRange(double min, double max){

        return (Math.random()*((max-min)+1))+min;
    }

    /**
     * @param temp Принимает массив температуры
     * @return Возврощает среднуюю температуру
     */
    public static double getAvgTemperatures(double[] temp) {

        double temperaturesSum = 0.0;

        for(double i : temp) {
            temperaturesSum += i;
        }

        return temperaturesSum/temp.length;
    }

    /**
     * @param tempPatients Принимает массив температуры
     * @return Возвращает кол-во элементов подходящих под заданную температуру от 36.2 до 36.9
     */
    public static int getCountHealthyPatients(double[] tempPatients) {

        int count = 0;

        for(double i : tempPatients) {
            if(i >= 36.2 && i <= 36.9) {
                count++;
            }
        }
        return count;
    }
}
