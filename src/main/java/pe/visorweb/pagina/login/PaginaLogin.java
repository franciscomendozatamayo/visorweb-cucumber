package pe.visorweb.pagina.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin {
	
	private By txtUsuario = By.id("txtUsuario");
	private By txtClave = By.id("txtClave");
	private By btnLogin = By.id("btnIniciarSesion");
	
	
	private WebDriver driver;
	
	public PaginaLogin(WebDriver driver) {
		
		this.driver = driver;
		
	}//end PaginaLogin
	
	public void cargarPagina(String url) {
		
		this.driver.get(url);
	}
	
	
	public void iniciarSesion(String Usuario, String clave) {
		
		this.driver.findElement(txtUsuario).clear();
		this.driver.findElement(txtUsuario).sendKeys(Usuario);
		
		this.driver.findElement(txtClave).clear();
		this.driver.findElement(txtClave).sendKeys(clave);
		
		this.driver.findElement(btnLogin).click();
	}
	
	

}//end PaginaLogin
