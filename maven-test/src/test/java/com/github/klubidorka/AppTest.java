package com.github.klubidorka;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void helloTest() {
        Assertions.assertThat(App.fibonacci(1)).isEqualTo(1);
        Assertions.assertThat(App.fibonacci(2)).isEqualTo(1);
        Assertions.assertThat(App.fibonacci(5)).isEqualTo(5);
    }

//     @Test
//     void exceptionTest() {
//         assertThatThrownBy(() -> {App.fibonacci(-1);
//         }).isInstanceOf(IllegalArgumentException.class)
// ;
//     }
}