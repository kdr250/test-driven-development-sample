package com.example.tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("FizzBuzz数列と変換規則を扱うFizzBuzzクラス")
class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void 前準備() {
    fizzBuzz = new FizzBuzz();
  }

  @Nested
  class convertメソッドは数を文字列に変換する {

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

    @Nested
    class その他の数の場合は数を文字列に変換する {
      @Test
      void _1を渡すと文字列1を返す() throws Exception {
        assertEquals("1", fizzBuzz.convert(1));
      }
    }
  }
}
