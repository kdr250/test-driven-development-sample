package com.example.tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void 前準備() {
    fizzBuzz = new FizzBuzz();
  }

  @Nested
  class 数を文字列に変換する {
    @Test
    void _1を渡すと文字列1を返す() throws Exception {
      assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void _2を渡すと文字列2を返す() throws Exception {
      assertEquals("2", fizzBuzz.convert(2));
    }
  }

  @Nested
  class _3の倍数の時は数の代わりにFizzに変換する {
    @Test
    void _3を渡すと文字列Fizzを返す() throws Exception {
      assertEquals("Fizz", fizzBuzz.convert(3));
    }
  }

  @Nested
  class _5の倍数の時は数の代わりにBuzzに変換する {
    @Test
    void _5を渡すと文字列Buzzを返す() throws Exception {
      assertEquals("Buzz", fizzBuzz.convert(5));
    }
  }
}
