package tallergrupalpoo;

class Problema2_Materia {

    public String nombre;
    public double acd; // 3.5 pts
    public double ape; // 3.5 pts
    public double aa;  // 3.0 pts

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double calcularNotaTotal() {
        return acd + ape + aa;
    }

    public boolean determinarAprobado() {
        double total = calcularNotaTotal();
        return (total / 10.0) >= 0.7;
    }

    public double notaRecuperacion(double examenRecuperacion) {
        double parcial = calcularNotaTotal() * 0.6;
        return parcial + examenRecuperacion;
    }

    @Override
    public String toString() {
        return "Materia: " + nombre
                + "\nACD: " + acd + "/3.5"
                + "\nAPE: " + ape + "/3.5"
                + "\nAA: " + aa + "/3.0"
                + "\nNota Total: " + calcularNotaTotal() + "/10.0";
    }

}
