import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    // Test that a class gets added to the student's Classes list
    // Create a student, add a class, and make sure the class that
    // was added exists in the student's classes.
    @Test
    public void testAddClass(){
        // Arrange

        // Act

        // Assert
        fail("Implement this test method");
    }

    // Test that a class does not get added if maxNumberOfClasses
    // has been reached. Create a student with a max number of classes
    // of 2, add three classes, make sure the first two were added but
    // the third was not.
    @Test
    public void testAddClassDoesntAddClassesIfMaxed(){

        // Arrange

        // Act

        // Assert
        fail("Implement this test method");
    }

    // Test the formatting of the schedule when getFormattedSchedule is called.
    // Add a couple classes to student, then make sure the string returned by
    // getFormattedSchedule is in the format {ClassName1}\r\n{ClassName2}\r\n
    @Test
    public void testGetFormattedSchedule(){

        // Arrange

        // Act

        // Assert
        fail("Implement this test method");
    }

    // Test that if a student has no classes, when getFormattedSchedule is called
    // the string "No classes added." gets returned.
    @Test
    public void testGetFormattedScheduleReturnsNoClassesAddedIfNoClasses(){

        // Arrange

        // Act

        // Assert
        fail("Implement this test method");
    }
}