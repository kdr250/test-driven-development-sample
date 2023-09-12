package com.example.tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void 前準備() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void _1を渡すと文字列1を返す() throws Exception {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  void _2を渡すと文字列2を返す() throws Exception {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  void _3を渡すと文字列Fizzを返す() throws Exception {
    assertEquals("Fizz", fizzBuzz.convert(3));
  }
}
