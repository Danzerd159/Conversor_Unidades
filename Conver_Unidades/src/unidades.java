public class unidades {
    private double km, millas, cel, fahren;

    // Constructores
    public unidades() {

    }

    public unidades(double km, double millas, double cel, double fahren) {
        this.km = km;
        this.millas = millas;
        this.cel = cel;
        this.fahren = fahren;
    }

    // Setters y Getters
    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double getCel() {
        return cel;
    }

    public void setCel(double cel) {
        this.cel = cel;
    }

    public double getFahren() {
        return fahren;
    }

    public void setFahren(double fahren) {
        this.fahren = fahren;
    }

    // Metodos Convertor de Unidades

    public double convertir_M_Km() {
        return this.getMillas() * 1.60934;
    }

    public double convertir_Km_M() {
        return this.getKm() * 0.62137;
    }

    public double conve_C_F() {
        return ((this.getCel() * (9 / 5)) + 32);
    }

    public double conve_F_C() {
        return ((this.getFahren() - 32) * (5 / 9));
    }

    @Override
    public String toString() {
        return "unidades [km=" + km + ", millas=" + millas + ", cel=" + cel + ", fahren=" + fahren + "]";
    }

    // Imprimir
    public void impValores() {
        System.out.println(toString());
    }

    public void impConvertor() {
        System.out.println("Convertir de Milla a Kilometros es: " + this.convertir_M_Km() +
                "\nConvertir de Kilometros a Milla es: " + this.convertir_Km_M() +
                "\nConvertir de Celcius a Fahrenheit es: " + this.conve_C_F() +
                "\nConvertir de Fahrenheit a Celcius es: " + this.conve_F_C());
    }

}