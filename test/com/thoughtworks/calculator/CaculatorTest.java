package com.thoughtworks.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dhwang on 17/10/2017.
 */
public class CaculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    //the method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
    @Test
    public void should_calculator_sum_when_given_one_paramter() throws Exception {

        int result = calculator.add("1");

        assertEquals(1,result);
    }

    @Test
    public void should_calculator_sum_when_given_another_paramter() throws Exception {

        int result = calculator.add("2");

        assertEquals(2,result);
    }

    @Test
    public void should_calculator_sum_when_given_two_paramter_by_comma() throws Exception {

        int result = calculator.add("1,2");

        assertEquals(3,result);
    }

    @Test
    public void should_calculator_sum_when_given_three_paramter_by_comma() throws Exception {

        int result = calculator.add("1,2,3");

        assertEquals(6,result);
    }

    @Test
    public void should_return_o_when_given_a_empty_string_paramater() throws Exception {

        int result = calculator.add("");

        assertEquals(0,result);
    }


    //Allow the Add method to handle an unknown amount of numbers

    @Test
    public void should_calculator_sum_when_given_unknow_amount_numbers() throws Exception {

        int result = calculator.add("1,2,3,4,5");

        assertEquals(15,result);
    }

    //Allow the Add method to handle new lines between numbers (instead of commas).
    @Test
    public void should_calculator_sum_when_given_new_line_in_numbers() throws Exception {

        int result = calculator.add("1n2,3");

        assertEquals(7,result);
    }

    //Support different delimiters
    //the beginning of the string will contain a separate line that looks like this:
    // “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three
//    @Test
//    public void should_calculator_sum_when_delimiter_is_different_Then_it_is_used_to_separate_numbers() throws Exception {
//
//        int result = calculator.add("//;n1;2;9");
//
//        assertEquals(12,result);
//    }

    //have two way of describe this test method logic
    @Test(expected = NegativeNumberNotValidException.class)
    public void should_throw_exception_when_given_numbers_have_negative_numbers() throws Exception {
        int result = calculator.add("1,-2,3");

    }

    //another way of writing
    @Test
    public void should_throw_exception_another_writing_when_given_numbers_have_negative_numbers() throws Exception {
        NegativeNumberNotValidException exception = null;
        try{
            int result = calculator.add("1,-2,3");
        }catch (NegativeNumberNotValidException e){
            exception = e;
        }

        assertNotNull(exception);
    }
}
