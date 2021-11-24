package com.ust.string20common;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesWithCountTest {

    @Test
    void findsDuplicates() {

        Map<Character, Integer> map = FindDuplicatesWithCount.duplicates("Programming");
        assertEquals(3, map.size());
        assertEquals(2, map.get('r'));
        assertEquals(2, map.get('m'));
        assertEquals(2, map.get('g'));

        map = FindDuplicatesWithCount.duplicates("repeated");
        assertEquals(1, map.size());
        assertEquals(3, map.get('e'));

        map = FindDuplicatesWithCount.duplicates("RrozooRo");
        assertEquals(2, map.size());
        assertEquals(3, map.get('r'));
        assertEquals(4, map.get('o'));

        map = FindDuplicatesWithCount.duplicates("13@jis3@333o3s");
        assertEquals(3, map.size());
        assertEquals(6, map.get('3'));
        assertEquals(2, map.get('@'));
        assertEquals(2, map.get('s'));

    }

    @Test
    void returnsEmptyMapFor_EmptyString_Null_SingleLetter() {
        Map<Character, Integer> map = FindDuplicatesWithCount.duplicates(null);
        assertEquals(0, map.size());

        map = FindDuplicatesWithCount.duplicates("");
        assertEquals(0, map.size());

        map = FindDuplicatesWithCount.duplicates("b");
        assertEquals(0, map.size());
    }





    }