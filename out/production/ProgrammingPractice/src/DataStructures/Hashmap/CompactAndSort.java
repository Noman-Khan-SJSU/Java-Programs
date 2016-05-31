// Given an input of ranges of strings in numbers. Compact and sort the range and return it as a new string.

package DataStructures.Hashmap;

import java.util.HashMap;
import java.util.TreeMap;

class CompactAndSort
{
    public String compactAndSort(String ranges)                 // Time : O(n log n) .  Space: O(n).
    {
        String result = "";

        if (ranges != null && !ranges.isEmpty())                // If given array is neither empty nor null
        {
            String[] arrayRanges = ranges.split(",");
            HashMap<Long, Long> map = new HashMap<>();
            for (String range : arrayRanges)
            {
                range = range.trim();
                String[] rangePart = range.split(":");
                long key = Long.parseLong(rangePart[0].trim());
                long value = Long.parseLong(rangePart[1].trim());
                if (map.containsKey(key))                       // For combining the ranges whose key already exists in the map.
                {
                    if (value > map.get(key))                   // If current value is greater than previous value
                        map.put(key, value);                    // New put value for the same key will override the value of previous key.
                }
                else
                    map.put(key, value);
            }

            TreeMap<Long, Long> sortedRanges = new TreeMap<>(map);      // sorts the HashMap in (n log n) time.

            boolean counter = true;
            long newValue = 0;

            for (long newKey : sortedRanges.keySet())
            {
                if (counter)                                    // initialization step for first key in the result // Will execute only once.
                {
                    newValue = sortedRanges.get(newKey);
                    counter = false;
                    result += newKey + ":";
                    continue;
                }
                long oldValue = newValue;
                if ((oldValue + 1) >= newKey)                   // Case 1:  if two ranges can be combined. E.g. 1:4,5:25  or 1:30,6:25.
                {
                    newValue = sortedRanges.get(newKey);
                    if (oldValue > newValue)                    // Checking if value of previous range should be taken or from the current range.
                        newValue = oldValue;
                }
                else                                            // Case 2: where two ranges can not be combined. // E.g 1:5 , 7:20
                {
                    result += newValue + "," + newKey + ":";
                    newValue = sortedRanges.get(newKey);
                }
            }
            result += newValue;                                 // Runs only for the last value of the last range in the result string.
        }
        return result;
    }

}