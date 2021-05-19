package co.com.laika.stepDefinitions.user.login;

import co.com.laika.pages.user.FacebookPage;
import co.com.laika.pages.user.login.LoginPage;
import co.com.laika.util.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps extends TestBase {

    LoginPage loginpage;
    FacebookPage facebookPage;

    @Given("el usuario ingresa a {string}")
    public void elUsuarioIngresaA(String url) {
        TestBase.initialization("https://webcol-stg.laika.com.co");
    }

    @When("el usuario da clic en el menu de {string}")
    public void elUsuarioDaClicEnElMenuDe(String arg0) {
        loginpage = new LoginPage();
        loginpage = loginpage.openMenuLink();
    }

    @And("el usuario da clic en la opcion de {string}")
    public void elUsuarioDaClicEnLaOpcionDe(String arg0) {
        loginpage = loginpage.OpenModalLogin();
    }

    @When("el usuario ingresa su correo {string} en el campo de Correo")
    public void elUsuarioIngresaSuCorreoEnElCampoDeCorreo(String email) {
        loginpage = loginpage.SendEmailInput(email);
    }

    @And("el usuario ingresa su contraseña {string} en el campo de contraseña")
    public void elUsuarioIngresaSuContraseñaEnElCampoDeContraseña(String password) {
        loginpage = loginpage.SendPasswordInput(password);
    }

    @And("el usuario da clic en el check de Aceptar terminos y condiciones")
    public void elUsuarioDaClicEnElCheckDeAceptarTerminosYCondiciones() {
        loginpage = loginpage.ClickCheck();
    }

    @And("el usuario da clic en el boton de {string}")
    public void elUsuarioDaClicEnElBotonDe(String arg0) throws InterruptedException {
        loginpage = loginpage.ClickButtonSignIn();
        Thread.sleep(10000);
    }

    @Then("el usuario debe iniciar sesion")
    public void elUsuarioDebeIniciarSesion() {
        System.out.println("soy el mas pro");
    }

    @And("el usuario verifica que su nombre aparezca {string} en el apartado del perfil")
    public void elUsuarioVerificaQueSuNombreAparezcaEnElApartadoDelPerfil(String name) {
        String UsrName = loginpage.GetLabelUserName();
        assertThat(UsrName, containsString(name));
        driver.close();
    }

    @Then("debe mostrarse el siguiente mensaje {string}")
    public void debeMostrarseElSiguienteMensaje(String error) {
        String alertMsg = loginpage.GetAlertErrorEmail();
        assertThat(alertMsg, containsString(error));
        driver.close();
    }

    @When("el usuario da clic en el boton de iniciar Sesión Con Facebook")
    public void elUsuarioDaClicEnElBotonDeIniciarSesiónConFacebook() throws InterruptedException {
        facebookPage = new FacebookPage();
        facebookPage = facebookPage.ClicButtonFacebook();
    }

    @And("el usuario ingresa el email y contraseña de Facebook")
    public void elUsuarioIngresaElEmailYContraseñaDeFacebook() {
        System.out.println("soy el mas pro");
    }


}
