Feature: Ebay Home Page Scenarios

  @launch
  Scenario: Advanced Search Link
    Given I am on the Ebay Home Page
    When I click on Advance Link
    Then I will be navigated to the advance search page



  @iphone11 @search 
  Scenario: search result for 11
    
    //parameterising 
    //Scenario tagged Hooks

    Given user is on the home page
    When User search for 'iphone 11'
    Then user validate atleast 1000  search items are present

  @iphone12
  Scenario: search result for 12
    
    //Using same step definition for 12 using parameterising
    

    Given user is on the home page
    When User search for 'iphone 12'
    Then user validate atleast 1000  search items are present

  @2String
  Scenario: searching and categorize using two String
    Given user is on the home page
    When User search for 'Toy car' in 'Baby' category

  @DataDriven
  Scenario Outline: Validating the title and url of the following link
    Given user is on the home page
    When user clicks on the '<Link>'
    Then validate that page navigates to the '<url>' and title contains '<title>'

    Examples: 
      | Link        | url                                                            | title                         |
      | Motors      | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334 | eBay Motors                   |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124               | Electronics products for sale |
      | Toys        | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497             | Toys & Hobbies                |
