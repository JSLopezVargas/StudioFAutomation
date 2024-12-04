Feature: Automate Studio F

  @BuyAProduct

  Scenario Outline: Buy a product in Studio F

    Given The page '<url>' is opened
    When search for the product '<product>'
    And add product to cart '<product>'
    And fill billing data '<destinatario>' '<correo>'
    Then see purchase summary

    Examples:
      | url | product | correo  | nombre  | apellido | cedula | celular | n1 | n2 | n3 | destinatario |
##@externaldata@parameters/InputData.xlsx@InputData
   |https://www.studiof.com.co/   |bolso de mano tipo canasto   |jslv312@gmail.com   |Jeisson   |Lopez   |1007576092   |3224024150   |12B   |33   |4   |Jeisson Lopez|
