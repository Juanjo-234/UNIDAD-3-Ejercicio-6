public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean cambiarPassword(String passwordActual, String nuevaPassword) {

        if (this.password.equals(passwordActual)) {
            if (nuevaPassword != null && !nuevaPassword.trim().isEmpty()) {
                this.password = nuevaPassword;
                System.out.println(" Éxito: La contraseña ha sido actualizada correctamente.");
                return true;
            } else {
                System.out.println(" Advertencia: La nueva contraseña no puede estar vacía.");
                return false;
            }
        } else {
            System.out.println(" Error: La contraseña actual es incorrecta. Cambio denegado.");
            return false;
        }
    }
    public boolean validarCredenciales(String passwordIngresada) {
        return this.password.equals(passwordIngresada);
    }
}
