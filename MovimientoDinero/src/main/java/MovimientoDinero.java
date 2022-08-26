public class MovimientoDinero {
    /* Atributos */
        private String ventaContado;
        private String pagoDeudores;
        private String ventasCredito;
        private String prestamosObtenidos;
        private String compraMateriaprima;
        private String pagoProvehedores;
        private String pagoNomina;
        private String pagoPrestamos;
        private String compraInsumos;

        /* Constructores*/

        public MovimientoDinero() {
        }

        public MovimientoDinero(String ventaContado, String pagoDeudores, String ventasCredito, String prestamosObtenidos, String compraMateriaprima, String pagoProvehedores, String pagoomina, String pagoPrestamos, String compraInsumos) {
            this.ventaContado = ventaContado;
            this.pagoDeudores = pagoDeudores;
            this.ventasCredito = ventasCredito;
            this.prestamosObtenidos = prestamosObtenidos;
            this.compraMateriaprima = compraMateriaprima;
            this.pagoProvehedores = pagoProvehedores;
            this.pagoNomina = pagoomina;
            this.pagoPrestamos = pagoPrestamos;
            this.compraInsumos = compraInsumos;
        }

        // Getter and Setter


        public String getVentaContado() {
            return ventaContado;
        }

        public void setVentaContado(String ventaContado) {
            this.ventaContado = ventaContado;
        }

        public String getPagoDeudores() {
            return pagoDeudores;
        }

        public void setPagoDeudores(String pagoDeudores) {
            this.pagoDeudores = pagoDeudores;
        }

        public String getVentasCredito() {
            return ventasCredito;
        }

        public void setVentasCredito(String ventasCredito) {
            this.ventasCredito = ventasCredito;
        }

        public String getPrestamosObtenidos() {
            return prestamosObtenidos;
        }

        public void setPrestamosObtenidos(String prestamosObtenidos) {
            this.prestamosObtenidos = prestamosObtenidos;
        }

        public String getCompraMateriaprima() {
            return compraMateriaprima;
        }

        public void setCompraMateriaprima(String compraMateriaprima) {
            this.compraMateriaprima = compraMateriaprima;
        }

        public String getPagoProvehedores() {
            return pagoProvehedores;
        }

        public void setPagoProvehedores(String pagoProvehedores) {
            this.pagoProvehedores = pagoProvehedores;
        }

        public String getPagoNomina() {
            return pagoNomina;
        }

        public void setPagoNomina(String pagoNomina) {
            this.pagoNomina = pagoNomina;
        }

        public String getPagoPrestamos() {
            return pagoPrestamos;
        }

        public void setPagoPrestamos(String pagoPrestamos) {
            this.pagoPrestamos = pagoPrestamos;
        }

        public String getCompraInsumos() {
            return compraInsumos;
        }

        public void setCompraInsumos(String compraInsumos) {
            this.compraInsumos = compraInsumos;
        }



}
