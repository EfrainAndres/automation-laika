Feature: Registro de usuario en Laika
  Como usuario web, con este feature se busca registrarse a Laika con los diferentes tipos de registro

  Background:
    Given el usuario ingresa a "https://webcol-stg.laika.com.co"
    When el usuario da clic en el menu de "Crear cuenta"
    And el usuario da clic en la opcion de Crear cuenta

  #Scenario: Registro con credenciales correctas
  #  When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
  #  And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
  #  And el usuario ingresa contraseña "test2021@" en el campo de contraseña
  #  And el usuario da clic en el check de Aceptar terminos y condiciones del registro
  #  And el usuario da clic en el boton de Crear cuenta
  #  And el usuario ingresa su numero de celular "321546546352"
  #  Then el usuario recibe y digita el codigo de confirmacion "124578"
  #  And el usuario debe iniciar sesion
  #  And el usuario verifica que su nombre aparezca "test1" en el apartado del perfil

  #Scenario: Registro con credenciales correctas y eligiendo de mascota Perro y Gato
  #  When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
  #  And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
  #  And el usuario ingresa contraseña "test2021@" en el campo de contraseña
  #  And el usuario da clic en el check para elegir Perro
  #  And el usuario da clic en el check para elegir Gato
  #  And el usuario da clic en el check de Aceptar terminos y condiciones del registro
  #  And el usuario da clic en el boton de Crear cuenta
  #  And el usuario ingresa su numero de celular "321546546352"
  #  Then el usuario recibe y digita el codigo de confirmacion "124578"
  #  And el usuario debe iniciar sesion
  #  And el usuario verifica que su nombre aparezca "test1" en el apartado del perfil

  #Scenario: Registro con credenciales correctas y eligiendo de mascota Perro
  #  When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
  #  And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
  #  And el usuario ingresa contraseña "test2021@" en el campo de contraseña
  #  And el usuario da clic en el check para elegir Perro
  #  And el usuario da clic en el check de Aceptar terminos y condiciones del registro
  #  And el usuario da clic en el boton de Crear cuenta
  #  And el usuario ingresa su numero de celular "321546546352"
  #  Then el usuario recibe y digita el codigo de confirmacion "124578"
  #  And el usuario debe iniciar sesion
  #  And el usuario verifica que su nombre aparezca "test1" en el apartado del perfil

  #Scenario: Registro con credenciales correctas y eligiendo de mascota Gato
  #  When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
  #  And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
  #  And el usuario ingresa contraseña "test2021@" en el campo de contraseña
  #  And el usuario da clic en el check para elegir Gato
  #  And el usuario da clic en el check de Aceptar terminos y condiciones del registro
  #  And el usuario da clic en el boton de Crear cuenta
  #  And el usuario ingresa su numero de celular "321546546352"
  #  Then el usuario recibe y digita el codigo de confirmacion "124578"
  #  And el usuario debe iniciar sesion
  #  And el usuario verifica que su nombre aparezca "test1" en el apartado del perfil

  Scenario: Registro con credenciales correctas y enviando numero de celular ya registrado
    When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
    And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
    And el usuario ingresa contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check para elegir Perro
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el check de Aceptar terminos y condiciones del registro
    And el usuario da clic en el boton de Crear cuenta
    And el usuario ingresa su numero de celular "3102476957"
    Then debe mostrarse el siguiente mensaje "Este teléfono ha sido verificado por otro usuario"

  Scenario: Registro con credenciales correctas sin aceptar terminos y condiciones del registro
    When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
    And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
    And el usuario ingresa contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el boton de Crear cuenta
    Then debe mostrarse el siguiente mensaje "Por favor acepta los terminos y condiciones"

  Scenario: Registro con credenciales correctas dejando el input de Nombre completo vacio
    When el usuario ingresa su nombre completo "" en el campo de Nombre Completo
    And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
    And el usuario ingresa contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check para elegir Perro
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el check de Aceptar terminos y condiciones del registro
    And el usuario da clic en el boton de Crear cuenta
    Then debe mostrarse el siguiente mensaje "Por favor ingresa tu nombre"

  Scenario: Registro con credenciales correctas dejando el input de correo vacio
    When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
    And el usuario ingresa correo "" en el campo de Correo
    And el usuario ingresa contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check para elegir Perro
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el check de Aceptar terminos y condiciones del registro
    And el usuario da clic en el boton de Crear cuenta
    Then debe mostrarse el siguiente mensaje "Por favor ingresa un correo electrónico válido"

  Scenario: Registro con credenciales correctas, enviando un correo no valido
    When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
    And el usuario ingresa correo "test1gmail.com" en el campo de Correo
    And el usuario ingresa contraseña "test2021@" en el campo de contraseña
    And el usuario da clic en el check para elegir Perro
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el check de Aceptar terminos y condiciones del registro
    And el usuario da clic en el boton de Crear cuenta
    Then debe mostrarse el siguiente mensaje "Por favor ingresa un correo electrónico válido"

  Scenario: Registro con credenciales correctas, enviando el input de contraseña vacio
    When el usuario ingresa su nombre completo "test1" en el campo de Nombre Completo
    And el usuario ingresa correo "test1@gmail.com" en el campo de Correo
    And el usuario ingresa contraseña "" en el campo de contraseña
    And el usuario da clic en el check para elegir Perro
    And el usuario da clic en el check para elegir Gato
    And el usuario da clic en el check de Aceptar terminos y condiciones del registro
    And el usuario da clic en el boton de Crear cuenta
    Then debe mostrarse el siguiente mensaje "Por favor ingresa una contraseña"

  Scenario: Validar boton ver contraseña
    When el usuario ingresa contraseña "test2021@" en el campo de contraseña
    Then la contraseña debe ser visible "test2021@"