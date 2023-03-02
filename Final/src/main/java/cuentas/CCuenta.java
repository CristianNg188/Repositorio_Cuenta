package cuentas;

/**
 * Clase CCuenta
 * @author Cristian Novillo Gomez
 * @since 01/03/2023
 * @version 1.0
 */
public class CCuenta {

	/**
	 * Atributos de la clase
	 * nombre-nombre del propietario de la cuenta
	 * cuenta-nombre de la cuenta
	 * saldo-saldo de la cuenta
	 * tipoInteres- es el tipo interes de la cuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     *Constructor vacio 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parametros
     * @param nom-nombre del propietario de la cuenta
     * @param cue-nombre d ela cuenta
     * @param sal-saldo de la cuenta
     * @param tipo-es el tipo interes de la cuenta
     * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * @return nombre-nombre del propietario de la cuenta
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * @param nombre-nombre del propietario de la cuenta
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * @return cuenta-nombre de la cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
     * @param cuenta-nombre de la cuenta
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
     * @return saldo-saldo de la cuenta
     */
	public double getSaldo() {
		return saldo;
	}

	/**
     * @param saldo-saldo de la cuenta
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * @return tipoInteres- es el tipo interes de la cuenta
     */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
     * @param tipoInteres- es el tipo interes de la cuenta
     */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	/**
	 * metodo publico
     * @param cantidad- es la cantidad con la que opera
     */
	public void operativa_cuenta(float cantidad){
		try {
            retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	/**
     * @return saldo-saldo de la cuenta
     */
	public double estado()
    {
        return saldo;
    }

	/**
	 * metodo publico
     * @param cantidad- es la cantidad con la que opera
     * @throws Exception cuando se ingresa una cantidad negativa
     */
    public void ingresar(float cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
	 * metodo publico
     * @param cantidad- es la cantidad con la que opera
     * @throws Exception cuando se ingresa una cantidad negativa o no hay suficiente saldo
     */
    public void retirar(float cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
