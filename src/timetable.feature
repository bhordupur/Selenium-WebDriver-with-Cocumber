//author : bhordupur
//Date : September 2014
//Plae : Turku University

Feature: 
  As a user, I would like to access
  
  to certain timetable from the front page given departure
  and destination 
  
  when I am at Matkahuolto.fi front page.

  Scenario: Selecting the timetable
    Given the timetable is visible
    When user write turku as departure
    And helsinki as destination
    And chooses the departure date 
    And "submit" button is pushed
    Then timetable from turku to helsinki on a chosen date is shown
