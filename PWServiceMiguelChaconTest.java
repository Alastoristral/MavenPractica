package pio.daw.MCM.encriptador;

public class PWServiceMiguelChaconTest {
	 public static void main(String[] args) {
		 PWServiceMiguelChacon pwService = new PWServiceMiguelChacon();

	        // Ejemplo de uso
	        String contrasena = "miContrasena123";
	        String contrasenaEncriptada = pwService.encriptarContrasena(contrasena);

	        System.out.println("Prueba del alumno Miguel Chacón Muñiz: ");
	        
	        System.out.println("La contraseña encriptada: " + contrasenaEncriptada);

	        boolean esCorrecta = pwService.verificarContrasena("miContrasena123", contrasenaEncriptada);
	        System.out.println("¿La contraseña encriptada es valida? " + esCorrecta);

	    }
	}
