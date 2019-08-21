@activityStream
Feature: Task module performance
  As a user I should be able to create a task from activity stream

   Background:
     Given user is on the landing page
     Then user logs with marketing user credentials
     Then user navigate to Activity Stream and Task module
     Then user fills Task Title


  @1
  Scenario: Verify that user can create new task by clicking on tasks on activity stream
    Then user clicks Send button to Add Task


  @2
  Scenario: Verify that user can upload a file and image or link or add checklist regarding to new task
    Then user clicks Upload Files and clicks Select document from Bitrix24
    And user chooses a file from Company Drive
    Then user clicks Link button and writes Link Text and Link URL
    And user clicks Checklist to add Things to do
    Then user clicks Send button to Add Task


  @3
  Scenario: Verify that user should be able to set up a deadline for new task
    Then user clicks Deadline and Select time
    Then user clicks Send button to Add Task






