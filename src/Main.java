//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Usuario usuario = new Usuario("lucas_dev", "lucas@email.com", "clave123");

System.out.println("===Cambio de contraseña erróneo===");
usuario.cambiarPassword("clave124", "clave321");
    System.out.println();


System.out.println("===Cambio exitoso de contraseña===");
usuario.cambiarPassword("clave123", "clave321");
    System.out.println();


System.out.println("===Verificando inicio de sesión===");
    boolean loginViejo = usuario.validarCredenciales("clave123");
    System.out.println("Login con contraseña vieja ('clave123'): " + (loginViejo ? "Acceso concedido" : "Acceso denegado "));

    boolean loginNuevo = usuario.validarCredenciales("clave321");
    System.out.println("Login con contraseña nueva ('clave321'): " + (loginNuevo ? "Acceso concedido " : "Acceso denegado"));
}
