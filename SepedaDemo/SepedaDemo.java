public class SepedaDemo {
    public static void main(String[] args){
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerek("polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        spd2.setMerek("Klinee");
        spd2.tambahKecepatan(5);
        spd2.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd2.cetakStatus();
    }
}
