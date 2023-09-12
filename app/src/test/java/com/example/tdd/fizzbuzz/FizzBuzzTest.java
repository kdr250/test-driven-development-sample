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
}
