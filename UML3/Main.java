public class Main {
    public static void main(String[] args) {
        Punt[] puntos1 = {
                new Punt(12, 12, 13),
                new Punt(2, 7, 8),
                new Punt(1, 2, 4),
        };
        Punt[] puntos2 = {
                new Punt(12, 12, 13),
                new Punt(2, 7, 8),
        };
        Linia linea1 = new Linia(12, puntos2);

        Area area1 = new Area(12, puntos1);

        };
    }