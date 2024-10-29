public class EnvioInternacional extends Envio {

    String envioInternacional;

    public EnvioInternacional(Double costoBase, Double peso, String envioInternacional) {
        super(costoBase, peso);
        this.envioInternacional = envioInternacional;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        //Asigna los dias extras dependiendo del peso
        int tiempoEntrega = 10;
        if (getPeso() > 10) {
            tiempoEntrega += 3;
        }

        //Le agrega el costo extra para cubrir impuestos y tramites
        double costoEntrega = getCostoBase();
        costoEntrega += getCostoBase() * .20;

        return String.format("Peso valido: %.2f kg\n" +
                "Envio internacional - Costo total: %.2f, Tiempo de entrega: %d", getPeso(), costoEntrega, tiempoEntrega);
    }
}
