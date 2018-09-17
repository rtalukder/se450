/*
    Raquib Talukder
    Homework 1
    SE 450
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    // Test that a class gets added to the student's Classes list
    // Create a student, add a class, and make sure the class that
    // was added exists in the student's classes.
    @Test
    public void testAddClass(){
        // Arrange
        Student testStudent = new Student(1);
        Class newClass = new Class("SE 450");

        // Act
        testStudent.addClass(newClass);

        // Assert
        assertEquals("SE 450" + "\r\n", testStudent.getFormattedSchedule());
    }

    // Test that a class does not get added if maxNumberOfClasses
    // has been reached. Create a student with a max number of classes
    // of 2, add three classes, make sure the first two were added but
    // the third was not.
    @Test
    public void testAddClassDoesntAddClassesIfMaxed(){

        // Arrange
        Student testStudent = new Student(2);
        Class firstClass = new Class("SE 450");
        Class secondClass = new Class("SE 550");
        Class thirdClass = new Class("SE 650");

        // Act
        testStudent.addClass(firstClass);
        testStudent.addClass(secondClass);
        testStudent.addClass(thirdClass);

        String expected = "";
        expected+= firstClass.getName() + "\r\n" + secondClass.getName() + "\r\n";

        // Assert
        assertEquals(expected,testStudent.getFormattedSchedule());
    }

    // Test the formatting of the schedule when getFormattedSchedule is called.
    // Add a couple classes to student, then make sure the string returned by
    // getFormattedSchedule is in the format {ClassName1}\r\n{ClassName2}\r\n
    @Test
    public void testGetFormattedSchedule(){

        // Arrange
        Student testStudent = new Student(2);
        Class firstClass = new Class("SE 450");
        Class secondClass = new Class("SE 550");

        // Act
        testStudent.addClass(firstClass);
        testStudent.addClass(secondClass);

        // Assert
        String expected = "";
        expected+= firstClass.getName() + "\r\n" + secondClass.getName() + "\r\n";

        assertEquals(expected, testStudent.getFormattedSchedule());
    }

    // Test that if a student has no classes, when getFormattedSchedule is called
    // the string "No classes added." gets returned.
    @Test
    public void testGetFormattedScheduleReturnsNoClassesAddedIfNoClasses(){

        // Arrange
        Student testStudent = new Student(0);

        // Act
        testStudent.getFormattedSchedule();

        // Assert
        assertEquals("No classes added.", testStudent.getFormattedSchedule());
    }
}