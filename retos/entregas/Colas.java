public class Colas {
    public static void main(String[] args) {

        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0, cola = 0;
        int colaEnCero = 0, itemsTotal = 0, colaTotal = 0;
        double nuevoCliente;
        boolean modoDebug = false;
        for (int minuto = 1; minuto <= 720; minuto++) {
            nuevoCliente = Math.random();
            int items = 0;
            System.out.print("Minuto " + minuto);
            // llegada de un cliente
            if (nuevoCliente <= 0.4) {
                System.out.print(" - Llega 1 persona");
                cola = cola + 1;
                colaTotal = colaTotal + 1;
            } else {
                System.out.print(" - No llega nadie");
            }
            if (cola == 0) {
                colaEnCero = colaEnCero + 1;
            }
            // Configuracion de cajas
            // Caja 1
            if (caja1 == 0 && cola > 0) {
                cola = cola - 1;
                // Calculo de Items de la persona que entra
                items = (int) ((Math.random() * (15 - 5)) + 5);
                // cuenta items totales
                itemsTotal = itemsTotal + items;
                caja1 = items;

            } else if (caja1 > 0) {
                caja1 = caja1 - 1;
            }
            // Caja 2
            if (caja2 == 0 && cola > 0) {
                cola = cola - 1;
                // Calculo de Items de la persona que entra
                items = (int) ((Math.random() * (15 - 5)) + 5);
                // cuenta items totales
                itemsTotal = itemsTotal + items;
                caja2 = items;

            } else if (caja2 > 0) {
                caja2 = caja2 - 1;
            }
            // Caja 3
            if (caja3 == 0 && cola > 0) {
                cola = cola - 1;
                // Calculo de Items de la persona que entra
                items = (int) ((Math.random() * (15 - 5)) + 5);
                // cuenta items totales
                itemsTotal = itemsTotal + items;
                caja3 = items;

            } else if (caja3 > 0) {
                caja3 = caja3 - 1;
            }
            // Caja 4
            if (caja4 == 0 && cola > 0) {
                cola = cola - 1;
                // Calculo de Items de la persona que entra
                items = (int) ((Math.random() * (15 - 5)) + 5);
                // cuenta items totales
                itemsTotal = itemsTotal + items;
                caja4 = items;

            } else if (caja4 > 0) {
                caja4 = caja4 - 1;
            }
            // Cola
            System.out.println(" - En Cola: " + cola);
            System.out.print("  Caja 1:[" + caja1 + "]");
            System.out.print("  Caja 2:[" + caja2 + "]");
            System.out.print("  Caja 3:[" + caja3 + "]");
            System.out.println("  Caja 4:[" + caja4 + "]");
            System.out.println("----------------------------------------");

        }
        System.out.println("RESUMEN");
        System.out.println("========================================");
        System.out.println("Minutos con cola en cero      : " + colaEnCero);
        System.out.println("Personas en la cola al cierre : " + cola);
        System.out.println("Personas atendidas en el dia  : " + (colaTotal - cola));
        System.out.println("Articulos vendidos en el dia  : " + itemsTotal);
    }
}
