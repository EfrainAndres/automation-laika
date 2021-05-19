Feature: Inicio de Sesión en Laika
  Como usuario web, con este feature se busca iniciar sesion los diferentes tipos de autenticacion en Laika

  Background:
    Given el usuario ingresa a "https://webcol-stg.laika.com.co"
    When el usuario da clic en el boton de "Crear cuenta"
    And el usuario da clic en el boton de "Iniciar Sesión"

  Scenario: Login con credenciales correctas
    When el usuario ingresa su correo "test@test.com" en el campo de Correo
    And el usuario ingresa su contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check de Aceptar terminos y condiciones
    And el usuario da clic en el boton de "Iniciar Sesión"
    Then el usuario debe iniciar sesion
    And el usuario verifica que su nombre aparezca "Test" en el apartado del perfil

  Scenario: Login con email incorrecto
    When el usuario ingresa su correo "testnovalido@test.com" en el campo de Correo
    And el usuario ingresa su contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check de Aceptar terminos y condiciones
    And el usuario da clic en el boton de "Iniciar Sesión"
    Then debe mostrarse el siguiente mensaje "El usuario no está registrado en el sistema. 1"

  Scenario: Login con contraseña incorrecta
    When el usuario ingresa su correo "test@test.com" en el campo de Correo
    And el usuario ingresa su contraseña "testnovalido" en el campo de contraseña
    And el usuario da clic en el check de Aceptar terminos y condiciones
    And el usuario da clic en el boton de "Iniciar Sesión"
    Then debe mostrarse el siguiente mensaje "Sus credenciales para iniciar sesión no son correctas."

  Scenario: Login sin aceptar terminos y condiciones
    When el usuario ingresa su correo "test@test.com" en el campo de Correo
    And el usuario ingresa su contraseña "testnovalido" en el campo de contraseña
    And el usuario da clic en el boton de "Iniciar Sesión"
    Then debe mostrarse el siguiente mensaje "Debes aceptar los términos y condiciones"

  Scenario: Login con Facebook
    When el usuario da clic en el boton de iniciar Sesión Con Facebook
    And el usuario da clic en el check de Aceptar terminos y condiciones
    And el usuario ingresa el email y contraseña de Facebook
    Then el usuario debe iniciar sesion
    And el usuario verifica que su nombre aparezca "Test" en el apartado del perfil

  Scenario: Login con Facebook sin aceptar terminos y condiciones
    When el usuario da clic en el boton de iniciar Sesión Con Facebook
    Then debe mostrarse el siguiente mensaje "Debes aceptar los términos y condiciones"

