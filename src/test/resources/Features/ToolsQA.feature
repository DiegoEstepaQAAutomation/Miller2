# language: es

Característica: Realiza adicion de usuario y establecimiento de fecha y alertas
  como nuevo usuario
  quiero ingresar a la pagina www.abc.com
  para realizar la compra del articulo



@EscenarioSinValor
 Escenario: agregar un nuevo usuario y eliminar uno antiguo
  Dado que un usuario accede a la web de toolsqa
  Cuando el agrega Diego,Estepa,Destepa@gmail.com,30,180005665,Administracion de usuario
  Entonces el ve el menu de web tables

@EscenarioSinValor
Escenario: agregar una nueva fecha
  Dado que un usuario accede a la web de toolsqa
  Cuando el agrega 12/10/2009,10/11/2012 3:00PM en Widgets
  Entonces el ve el menu de Widgets



  @EscenarioSinValor
  Escenario: realizar las alertas de toolsqa
    Dado que un usuario accede a la web de toolsqa
    Cuando el agrega Antony en alerts
    Entonces el ve el titulo toolsqa