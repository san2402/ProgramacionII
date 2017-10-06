package modelos;

/**
 *
 */
public class Usuario extends Persona {
    
    private String nombreUsuario;
    private String passsword;

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the passsword
     */
    public String getPasssword() {
        return passsword;
    }

    /**
     * @param passsword the passsword to set
     */
    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
    
    
    
}
