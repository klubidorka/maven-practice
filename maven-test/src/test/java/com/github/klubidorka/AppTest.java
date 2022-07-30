package com.github.klubidorka;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void helloTest() {
        Assertions.assertThat(App.fibonacci(1)).isEqualTo(1);
        Assertions.assertThat(App.fibonacci(2)).isEqualTo(1);
    }

    @BeforeAll
    static void setUp() {
        System.out.println("Testing started");
    }

    @AfterAll
    static void Finalize() {
        System.out.println("Testing finished");
    }

    @BeforeEach
    void before() {
        System.out.println("This method is called before each test");
    }

    @AfterEach
    void after() {
        System.out.println("This method is called after each test");
    }

    @Test
    void exceptionTest() {
        assertThatThrownBy(() -> {
            List<String> list = Arrays.asList("String one", "String two");
            list.get(2);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 2 out of bounds for length 2");
    }

    @RepeatedTest(5)
    void repeatedTest() {
        System.out.println("You will see this message five times");
    }
}