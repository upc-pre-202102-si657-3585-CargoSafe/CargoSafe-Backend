Feature: Seguimiento en tiempo real

Como cliente
Quiero ver la ubicación en tiempo real de mi carga
Para tener visibilidad del estado de mi envío

  Scenario: Visualización de ubicación actual del camión
    Given que el transportista está en ruta y la carga está en tránsito
    When el cliente accede al panel de seguimiento
    Then debe visualizar la ubicación actual en el mapa en tiempo real

  Scenario: Visualización de estado entregado
    Given que la carga ha sido entregada
    When el cliente accede al panel de seguimiento
    Then debe ver el estado como "Entregado" y la hora de entrega
