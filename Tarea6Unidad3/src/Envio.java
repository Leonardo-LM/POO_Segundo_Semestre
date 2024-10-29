public abstract class Envio {
    private Double costoBase;
    private Double peso;

    public Envio(Double costoBase, Double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public abstract String calcularTiempoYCostoEntrega();

    public void validarPeso() {
        if (peso <= 0) {
            System.out.println("El peso no es valido, no puede pesar: " + peso);
        } else {
            System.out.println("Peso aceptable.");
        }

    }

    public Double getCostoBase() {
        return costoBase;
    }

    public Double getPeso() {
        return peso;
    }
}
