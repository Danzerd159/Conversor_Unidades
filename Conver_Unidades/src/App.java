public class App {
    public static void main(String[] args) {
        // unidades vUnidades = new unidades(1, 1, 0, 32);
        unidades vUnidades = new unidades();
        vUnidades.setMillas(1);
        vUnidades.setKm(1);
        vUnidades.setCel(0);
        vUnidades.setFahren(32);

        vUnidades.impValores();
        vUnidades.impConvertor();
    }
}