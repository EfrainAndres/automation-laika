Feature: Flujo de compras en Laika
  Como usuario web, con este feature se busca cubrir los diferentes pasos para realizar una compra en laika

  Background:
    Given el usuario ingresa a "webcol-stg.laika.com.co"
    When el usuario da clic en el menu de "Crear cuenta"
    And el usuario da clic en la opcion de "Iniciar Sesión"
    And el usuario ingresa su correo "efrainvergara.udec@gmail.com" en el campo de Correo
    And el usuario ingresa su contraseña "ESfa_9669@" en el campo de contraseña
    And el usuario da clic en el check de Aceptar terminos y condiciones
    And el usuario da clic en el boton de "Iniciar Sesión"

  Scenario: Login con credenciales correctas
