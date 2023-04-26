package codewars.seven;

/*
https://www.codewars.com/kata/56576f82ab83ee8268000059/train/java
 */

public class RunningOutOfSpace {
    public static String[] spacey(String[] array) {
        String[] result = new String[array.length];
        StringBuilder sb = new StringBuilder();
        result[0] = array[0];
        sb.append(array[0]);

        for (int i = 1; i < array.length; i++) {
            sb.append(array[i]);
            result[i] = array[i].contains(array[i - 1]) ? array[i] : sb.toString();
        }
        return result;
    }
}

//        Better solution:
//        for (int i=1;i<array.length;i++)
//            array[i]=array[i-1]+array[i];
//        return array;

