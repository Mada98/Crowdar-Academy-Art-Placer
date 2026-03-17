@Login @Regression
Feature: Login

  Background:
    Given el usuario se encuentra en la pagina de login de ArtPlacer

  @Smoke @LoginExitoso
  Scenario: Inicio de sesion exitoso de usuario con onboarding completo
    When el usuario con onboarding completo se autentica en la aplicacion
    Then se muestra el mensaje de bienvenida

  @LoginFallido
  Scenario Outline: Inicio de sesion fallido
    When el usuario ingresa "<email>" y "<password>" en los campos correspondientes
    And el usuario hace click en el boton "login"
    Then se muestra el mensaje "<error>"

    Examples:
      | email                      | password            | error                                |
      | email_incorrecto@gmail.com | password_incorrecto | The entered credentials are invalid. |
      | email_sin_dominio.com      | password            | The entered credentials are invalid. |
      | email@dominio_incorrecto   | passowrd            | The entered credentials are invalid. |
      |                            | passowrd            | The entered credentials are invalid. |
      |                            |                     | The entered credentials are invalid. |

  @ForgotPassword
  Scenario Outline: Validacion de recuperar contrasena
    When el usuario hace click en el enlace "Forgot password?"
    And el usuario ingresa "<email>" en el campo de recuperacion
    And el usuario hace click en el boton "Reset Password"
    Then se muestra el mensaje "<mensaje>"

    Examples:
      | email                      | mensaje                                          |
      | email_incorrecto@gmail.com | The email you entered does not belong to a user. |
      | artplacer.email            | We sent you an email                             |
      |                            | Email  is required.                              |