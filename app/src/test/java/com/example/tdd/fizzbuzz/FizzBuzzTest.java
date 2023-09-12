package com.example.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  @Test
  void _1を渡すと文字列1を返す() throws Exception {
    // 準備
    FizzBuzz fizzBuzz = new FizzBuzz();
    // 実行 & 検証
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  void _2を渡すと文字列2を返す() throws Exception {
    // 準備
    FizzBuzz fizzBuzz = new FizzBuzz();
    // 実行 & 検証
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  void _3を渡すと文字列Fizzを返す() throws Exception {
    // 準備
    FizzBuzz fizzBuzz = new FizzBuzz();
    // 実行 & 検証
    assertEquals("Fizz", fizzBuzz.convert(3));
  }
}
