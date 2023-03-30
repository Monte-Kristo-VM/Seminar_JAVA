package Lesson6;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class NoteBook {
    /* 1.Подумать над структурой класса Ноутбук для магазина техники
    - выделить поля и методы. Реализовать в java.
   2.Создать множество ноутбуков (ArrayList).
   3.Отфильтровать ноутбуки их первоначального множества
    и вывести проходящие по условиям.
    Например, спросить у пользователя минимальный размер
    оперативной памяти или конкретный цвет.
    Выводить только те ноутбуки, что соответствуют условию
 */
    String manufacturerNotebook;
    String color;
    String manufacturerProcessor;
    int numberOfCores;
    int processorFrequency;
    int screenDiagonal;
    int sizeRAM;
    int sizeSSD;
    int numberOfUSB;
    boolean cdROM;
    boolean webCam;

    public NoteBook randomLaptopConfiguration() {
        String[] manufacturerNotebook = {"ACER", "ASUS", "GIGABYTE", "HP", "LENOVO", "MSI"};
        int[] screenDiagonal = {13, 14, 15, 17, 19, 21, 25};
        String[] color = {"black", "blue", "gold", "pink", "white"};
        String[] manufacturerProcessor = {"AMD", "Intel"};
        int[] numberOfCores = {1, 2, 4, 8, 16};
        int[] processorFrequency = {2000, 2200, 2400, 2600, 2800, 3000, 3200, 3500, 4000};
        int[] sizeRAM = {2, 4, 8, 16, 32};
        int[] sizeSSD = {64, 128, 256, 512, 1024};
        int[] numberOfUSB = {2, 3, 4};
        boolean[] cdROM = {true, false};
        boolean[] webCam = {true, false};
        NoteBook laptop = new NoteBook();
        Random rnd = new Random();
        laptop.manufacturerNotebook = manufacturerNotebook[rnd.nextInt(manufacturerNotebook.length)];
        laptop.screenDiagonal = screenDiagonal[rnd.nextInt(screenDiagonal.length)];
        laptop.color = color[rnd.nextInt(color.length)];
        laptop.manufacturerProcessor = manufacturerProcessor[rnd.nextInt(manufacturerProcessor.length)];
        laptop.numberOfCores = numberOfCores[rnd.nextInt(numberOfCores.length)];
        laptop.processorFrequency = processorFrequency[rnd.nextInt(processorFrequency.length)];
        laptop.sizeRAM = sizeRAM[rnd.nextInt(sizeRAM.length)];
        laptop.sizeSSD = sizeSSD[rnd.nextInt(sizeSSD.length)];
        laptop.numberOfUSB = numberOfUSB[rnd.nextInt(numberOfUSB.length)];
        laptop.cdROM = cdROM[rnd.nextInt(cdROM.length)];
        laptop.webCam = webCam[rnd.nextInt(webCam.length)];
        return laptop;
    }

    public void showLaptopConfigurationMin(NoteBook laptop) {
        System.out.printf("%s %s\" %s, %s %d Core %dМГц, RAM %dГБ, SSD %dГБ, %d USB," +
                        " CDRom: %s, Вебкамера: %s%n",
                laptop.manufacturerNotebook, laptop.screenDiagonal, laptop.color, laptop.manufacturerProcessor,
                laptop.numberOfCores, laptop.processorFrequency, laptop.sizeRAM, laptop.sizeSSD, laptop.numberOfUSB,
                laptop.cdROM ? "есть" : "нет", laptop.webCam ? "есть" : "нет");
    }

    public void showLaptopConfigurationMax(NoteBook laptop) {
        System.out.printf("Производитель ноутбука: %s%nРазмер диагонали: %s%nЦвет: %s%nПроизводитель процессора: %s%n" +
                        "Число ядер процессора: %s%nЧастота процессора: %s МГц%nОбъем оперативной памяти: %s ГБ%n" +
                        "Объем жесткого диска SSD: %s ГБ%nКоличество разъемов USB: %s%nНаличие CDRom: %s%n" +
                        "Наличие вебкамеры: %s%n",
                laptop.manufacturerNotebook, laptop.screenDiagonal, laptop.color, laptop.manufacturerProcessor,
                laptop.numberOfCores, laptop.processorFrequency, laptop.sizeRAM, laptop.sizeSSD, laptop.numberOfUSB,
                laptop.cdROM ? "Да" : "Нет", laptop.webCam ? "Да" : "Нет");
    }

    public int priceLaptop(NoteBook laptop) {
        Map<String, Integer> priceManufacturerNotebook = Map.of(
                "ACER", 10000,
                "ASUS", 14000,
                "GIGABYTE", 12000,
                "HP", 13000,
                "LENOVO", 90000,
                "MSI", 17000);

        Map<Integer, Integer> priceScreenDiagonal = Map.of(
                13, 10000,
                14, 12000,
                15, 13000,
                17, 15000,
                19, 17000,
                21, 20000,
                25, 23000);

        Map<Integer, Integer> priceNumberOfCores = Map.of(
                1, 2000,
                2, 3000,
                4, 4000,
                8, 6000,
                16, 8000);

        Map<Integer, Integer> priceSizeRAM = Map.of(
                2, 1000,
                4, 2000,
                8, 5000,
                16, 8000,
                32, 15000);

        Map<Integer, Integer> priceSizeSSD = Map.of(
                64, 4000,
                128, 5000,
                256, 6000,
                512, 10000,
                1024, 13000);

        int price = priceManufacturerNotebook.get(laptop.manufacturerNotebook) +
                priceScreenDiagonal.get(laptop.screenDiagonal) +
                (int) (priceNumberOfCores.get(laptop.numberOfCores) *
                        ((Objects.equals(laptop.manufacturerProcessor, "AMD")) ? 1 : 1.5) *
                        (laptop.processorFrequency / 1000.0)) +
                priceSizeRAM.get(laptop.sizeRAM) +
                priceSizeSSD.get(laptop.sizeSSD) +
                ((Objects.equals(laptop.color, "gold")) || (Objects.equals(laptop.color, "pink")) ? 1000 : 0) +
                (laptop.numberOfUSB > 2 ? 1000 : 0) +
                (laptop.cdROM ? 2000 : 0) +
                (laptop.webCam ? 2000 : 0);
        return price;
    }
}
