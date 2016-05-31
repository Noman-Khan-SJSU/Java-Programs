package DataStructures.Hashmap;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompactAndSortTest {

    @Test
    public void TestCases() {

        CompactAndSort obj = new CompactAndSort();                              // for static methods// just assert with ClassName.staticMethodName
        assertEquals("1:30",obj.compactAndSort("1:30"));                        // assertEquals(expected value, actual value);
        assertEquals("1:10",obj.compactAndSort("6:10 , 1:5"));
        assertEquals("1:5,10:20",obj.compactAndSort("10:20 , 1:5"));
        assertEquals("1:20",obj.compactAndSort("10:20  ,  1:5 , 6: 9"));
        assertEquals("1:5,20:60",obj.compactAndSort("50:60, 40:50 , 30:40, 20:30,1:5"));
        assertEquals("1:15,17:30",obj.compactAndSort("1:10,17:30,5:15"));
        assertEquals("1:20",obj.compactAndSort("3:5,4:6,5:7,1:20"));
        assertEquals("",obj.compactAndSort(""));
        assertEquals("",obj.compactAndSort(null));
        assertEquals("1325376000000:1338508800000,1343779200000:1417392000000",obj.compactAndSort("1325376000000: 1330560000000, 1328054400000: 1338508800000, 1343779200000: 1354320000000, 1354320000000: 1417392000000"));
    }

}
