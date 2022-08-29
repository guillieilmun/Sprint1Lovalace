public class MovimientoDinero {
    /* Atributos */
    private String montoMovomiento;
    private String concptoMovimiento;
    private String encargadoMovimiento;
    private String montoPoNe;

    /* Constructores*/

    public MovimientoDinero() {
    }

    public MovimientoDinero(String montoMovomiento, String concptoMovimiento, String encargadoMovimiento, String montoPoNe) {
        this.montoMovomiento = montoMovomiento;
        this.concptoMovimiento = concptoMovimiento;
        this.encargadoMovimiento = encargadoMovimiento;
        this.montoPoNe = montoPoNe;
    }

    // Getter and Setter

    public String getMontoMovomiento() {
        return montoMovomiento;
    }

    public void setMontoMovomiento(String montoMovomiento) {
        this.montoMovomiento = montoMovomiento;
    }

    public String getConcptoMovimiento() {
        return concptoMovimiento;
    }

    public void setConcptoMovimiento(String concptoMovimiento) {
        this.concptoMovimiento = concptoMovimiento;
    }

    public String getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(String encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }

    public String getMontoPoNe() {
        return montoPoNe;
    }

    public void setMontoPoNe(String montoPoNe) {
        this.montoPoNe = montoPoNe;
    }
}