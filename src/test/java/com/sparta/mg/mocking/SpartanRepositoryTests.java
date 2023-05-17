package com.sparta.mg.mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.inOrder;

public class SpartanRepositoryTests {
    Spartan mockSpartan;
    Spartan spySpartan;

    @BeforeEach
    void setup() {
        mockSpartan=Mockito.mock(Spartan.class);
        Spartan spartan=new Spartan(1,"Manish","Java",LocalDate.now());
        spySpartan=Mockito.spy(spartan); //partial Mock
    }

    @Test
    @DisplayName("Check that the repository can print all Spartans")
    void checkThatTheRepositoryCanPrintAllSpartans() {
        Spartan spartan = new Spartan(12, "Manish","Java", LocalDate.now());
        Spartan mySpartan = Mockito.mock(Spartan.class);
        System.out.println(mySpartan.getClass());
    }

    @Test
    @DisplayName("Testing Spartan Repository Print Method")
    void testingSpartanRepositoryPrintMethod(){
        SpartanRepository.addSpartan(mockSpartan);
        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
        assertEquals("Found Mock Spartan"+"\n",SpartanRepository.getAllSpartans());
    }

    @Test
    @DisplayName("Testing Method Order")
    void testingMethodOrder(){
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);

        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());
    }

    @Test
    @DisplayName("Check that the getId method is called on our mock")
    void checkThatTheGetIdMethodIsCalledOnOurMock(){
        SpartanRepository.addSpartan(mockSpartan);
        boolean present = SpartanRepository.findSpartan(1).isPresent();
        Mockito.verify(mockSpartan,Mockito.times(1)).getId();
    }

    @Test
    @DisplayName("Check that spartan method are called in the right order")
    void checkThatSpartanMethodAreCalledInTheRightOrder() {
        mockSpartan.setName("Manish");
        mockSpartan.setCourse("C#");
        System.out.println(mockSpartan.getName() + " " + mockSpartan.getCourse());

        InOrder inOrder = inOrder(mockSpartan);
        inOrder.verify(mockSpartan).setName("Manish");
        inOrder.verify(mockSpartan).setCourse("C#");
        inOrder.verify(mockSpartan).getName();
        inOrder.verify(mockSpartan).getCourse();
    }

}
