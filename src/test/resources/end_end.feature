Feature: As a customer I wanted to buy product
  @smoke
  Scenario: want to buy product
  Given I am on home page
    And I am mouser hover on dresses
    And I click on casual dresses
    And I mouser hover on printed dress
    Then I click on add to cart Btn
    Then I should see your shopping-cart page
    And I click on proceed to checkout btn your shopping-cart page
    And I enter  e-mail address "binee123@gmail.com"
    And I enter valid password
    And I click on sign in button
    And I click on proceed to checkout btn on addresses page
    And I click on terms of service check box
    And I click on proceed to checkout btn on shipping page
    And I should see your payment method page
    And I click on pay by bank wire btn
    And I should see Bank-wire payment page
    And I click on confirm my order btn
    Then I should see Order confirmation page
    And I should see "Your order on My Store is complete."