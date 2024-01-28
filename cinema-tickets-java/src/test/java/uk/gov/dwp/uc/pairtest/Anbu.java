package uk.gov.dwp.uc.pairtest;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;


public class Anbu {

    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        System.out.println(mockList.size());
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
        System.out.println(mockList.size());

    }

    @Mock
    HashMap<String, Integer> mockHashMap;

    @Test
    public void saveTest() {
        mockHashMap.put("A", 1);
        System.out.println(mockHashMap.get("A"));
        Mockito.verify(mockHashMap, times(1)).put("A", 1);
        Mockito.verify(mockHashMap, times(0)).get("A");
        assertEquals(0, mockHashMap.size());
    }

}
