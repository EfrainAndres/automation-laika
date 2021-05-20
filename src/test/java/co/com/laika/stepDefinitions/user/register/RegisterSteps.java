package co.com.laika.stepDefinitions.user.register;

import co.com.laika.pages.user.login.LoginPage;
import co.com.laika.pages.user.register.RegisterPage;
import co.com.laika.util.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps extends TestBase{
    RegisterPage registerPage;
    LoginPage loginPage;

    @Given("el usuario ingresa a {string}")
    public void el_usuario_ingresa_a(String url) {
        TestBase.initialization(url);
    }

    @When("el usuario da clic en el menu de {string}")
    public void el_usuario_da_clic_en_el_menu_de(String string) {
        loginPage = new LoginPage();
        loginPage = loginPage.openMenuLink();
    }

    @And("el usuario da clic en la opcion de Crear cuenta")
    public void elUsuarioDaClicEnLaOpcionDeCrearCuenta() {
        registerPage = new RegisterPage();
        registerPage = registerPage.OpenModalRegister();
    }

    @When("el usuario ingresa su nombre completo {string} en el campo de Nombre Completo")
    public void elUsuarioIngresaSuNombreCompletoEnElCampoDeNombreCompleto(String name) {
        registerPage = registerPage.SendInputFullName(name);
    }

    @And("el usuario ingresa correo {string} en el campo de Correo")
    public void elUsuarioIngresaCorreoEnElCampoDeCorreo(String email) {
        registerPage = registerPage.SendInputEmail(email);
    }

    @And("el usuario ingresa contraseña {string} en el campo de contraseña")
    public void elUsuarioIngresaContraseñaEnElCampoDeContraseña(String password) {
        registerPage = registerPage.SendInputPassword(password);
    }

    @And("el usuario da clic en el boton de Crear cuenta")
    public void elUsuarioDaClicEnElBotonDeCrearCuenta() throws InterruptedException {
        registerPage = registerPage.ClickButtonRegister();
    }

    @And("el usuario ingresa su numero de celular {string}")
    public void elUsuarioIngresaSuNumeroDeCelular(String cel) throws InterruptedException {
        registerPage = registerPage.SendInputCel(cel);
    }

    @Then("el usuario recibe y digita el codigo de confirmacion {string}")
    public void elUsuarioRecibeYDigitaElCodigoDeConfirmacion(String arg0) {
        System.out.println("test");
    }

    @And("el usuario da clic en el check para elegir Perro")
    public void elUsuarioDaClicEnElCheckParaElegirPerro() {
        registerPage = registerPage.ClickCheckDog();
    }

    @And("el usuario da clic en el check para elegir Gato")
    public void elUsuarioDaClicEnElCheckParaElegirGato() {
        registerPage = registerPage.ClickCheckCat();
    }

    @And("el usuario da clic en el check de Aceptar terminos y condiciones del registro")
    public void elUsuarioDaClicEnElCheckDeAceptarTerminosYCondicionesDelRegistro() {
        registerPage = registerPage.ClickCheck();
    }

    @Then("debe mostrarse el siguiente mensaje {string}")
    public void debe_mostrarse_el_siguiente_mensaje(String error) {
        String alertMsg = loginPage.GetAlertErrorEmail();
        assertThat(alertMsg, containsString(error));
        driver.close();
    }

    @Then("la contraseña debe ser visible {string}")
    public void laContraseñaDebeSerVisible(String arg0) {
        System.out.println("test");
    }
}
