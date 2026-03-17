@SignUp @Regression
Feature: Registro de usuarios

  Background:
    Given el usuario se encuentra en la pagina de sign up de ArtPlacer

  @Registro
  Scenario: Registro exitoso
    When el usuario completa el formulario de registro con datos validos
    And el usuario hace click en el boton "Continue"
    And el usuario selecciona el plan de subscripcion "Artist Advanced"
    And el usuario completa el formulario de pago con datos validos
    And el usuario hace click en el boton "Start free trial"
    Then se muestra el mensaje "Congratulations!"