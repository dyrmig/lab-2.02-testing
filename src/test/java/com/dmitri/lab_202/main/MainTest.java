package com.dmitri.lab_202.main;

import static com.dmitri.lab_202.main.Main.javaKeywords;
import static com.dmitri.lab_202.main.Main.oddInts;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void oddInts_oddInt_intArray() {
        int[] solution = {1,3,5,7};
        assertArrayEquals(solution,oddInts(7));
    }
    @org.junit.jupiter.api.Test
    void oddInts_evenInt_intArray() {
        int[] solution = {1,3,5};
        assertArrayEquals(solution,oddInts(6));
    }
    @org.junit.jupiter.api.Test
    void oddInts_one_intArray() {
        int[] solution = {1};
        assertArrayEquals(solution,oddInts(1));
    }
    @org.junit.jupiter.api.Test
    void oddInts_zero_intArray() {
        assertThrows(IllegalArgumentException.class, () -> oddInts(0));
    }
    @org.junit.jupiter.api.Test
    void oddInts_negativeInt_intArray() {
        assertThrows(IllegalArgumentException.class, () -> oddInts(-3));
    }
    @org.junit.jupiter.api.Test
    void javaKeywords_noJavaKeyWord_false() {
        assertEquals(false,javaKeywords("hola dodo adsa da sdasd"));
    }
    @org.junit.jupiter.api.Test
    void javaKeywords_JavaKeyWord_true() {
        assertEquals(true,javaKeywords("Don't break my heart"));
    }
    @org.junit.jupiter.api.Test
    void javaKeywords_emptyString_true() {
        assertThrows(IllegalArgumentException.class, () -> javaKeywords(""));
    }
}