package pio.daw.MCM.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PWServiceMiguelChacon {
    
    private BasicPasswordEncryptor passwordEncryptor;
    
    public PWServiceMiguelChacon() {
        this.passwordEncryptor = new BasicPasswordEncryptor();
    }
   
    	 public String encriptarContrasena(String contrasena){
    	        return passwordEncryptor.encryptPassword(contrasena);
    	    }
        
    	  public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
    	        return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
    	    }
    
    }
    
