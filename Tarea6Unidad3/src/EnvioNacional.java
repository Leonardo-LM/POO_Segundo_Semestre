public class EnvioNacional extends Envio {
    private int distanciaKm;

    public EnvioNacional(Double costoBase, Double peso, int kilometros) {
        super(costoBase, peso);
        this.distanciaKm = kilometros;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        //Calcula el tiempo en que sera entregado
        int tiempoEntrega = (distanciaKm / 200) + 1;

        //Calcula el costo extra
        double costoEntrega = getCostoBase();
        if (super.getPeso() > 5) {
            costoEntrega += getCostoBase() * .05;

        }
        return String.format("Peso válido: %.2f kg\n" +
                        "Envío nacional - Costo Total: %.2f, Tiempo de entrega: %d días",
                getPeso(), costoEntrega, tiempoEntrega);

    }


}
