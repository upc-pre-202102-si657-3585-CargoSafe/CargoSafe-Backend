Feature: Recepción de pedidos

Como operador logístico
Quiero registrar nuevos pedidos de transporte
Para gestionar y asignar eficientemente las entregas

  Scenario: Registro exitoso de un pedido
    Given que el operador llena todos los campos requeridos del formulario
    When hace clic en "Registrar pedido"
    Then el sistema debe guardar el pedido y mostrarlo en la lista de pendientes

  Scenario: Error al registrar pedido por datos incompletos
    Given que el operador deja campos requeridos vacíos
    When intenta registrar el pedido
    Then el sistema debe mostrar errores indicando los campos faltantes
