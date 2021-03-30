Feature: Consulta
  Scenario: Search Lili Reinhart
    Given access Wikipedia in Portuguese
    When search for "Lili Reinhart"
    Then shows the text "Lili Reinhart" on title