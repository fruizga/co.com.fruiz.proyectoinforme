#Author: fruizga

@stories
Feature: About Banco
  As user, I want to access to the Bancolombia's page and download the document called “Políticas
  de tratamiento y de protección de datos personales de proveedores"
  @scenario1
  Scenario: Search for teh needed document
    Given than faber wants to download the document Politicas de tratamiento y de proteccion de datos personales de proveedores
    When he searches for the document Politicas de tratamiento y de proteccion de datos personales de proveedores on the Bancolombia page
    Then he finds the document called resources Politicas de tratamiento y de proteccion de datos personales de proveedores