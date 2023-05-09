package com.sparta.mg;

import com.sparta.mg.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//write tests against acceptance criteria
//Red - failing test
//Green - write only enough code to pass the test
//Refactor - change without breaking previous tests
public class MyTestFile {
   @Test
   @DisplayName("Given that the input is zero, return zero")
   void givenThatTheInputIsZeroReturnZero() {
       assertEquals("0", FizzBuzz.fizzbuzz(0));
   }

   @Test
   @DisplayName("Given that the input is one, return one")
   void givenThatTheInputIsOneReturnOne() {
       assertEquals("1", FizzBuzz.fizzbuzz(1));
   }

   @Test
   @DisplayName("Given that the input is 3, return fizz")
   void givenThatTheInputIs3ReturnFizz() {
       assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
   }
}
