package com.kmg.factoryobj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

  @Test
  void shouldExecuteWithoutException() {
    assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}

