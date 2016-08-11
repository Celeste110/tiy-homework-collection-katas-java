    import java.util.ArrayList;
    import java.util.HashMap;

    /**
     * Created by katherine_celeste on 8/11/16.
     */
    public class Main {

        public static void main (String[] args)
        {
            // 1. call firstLast6
            ArrayList <Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(6);
            boolean result = Kata.firstLast6(list1);
            System.out.printf("firstLast6(%s) -> %s\n" ,list1, result);

            ArrayList <Integer> list2 = new ArrayList<>();
            list2.add(6);
            list2.add(1);
            list2.add(2);
            list2.add(3);
            boolean result2 = Kata.firstLast6(list2);
            System.out.printf("firstLast6(%s) -> %s\n" ,list2, result2);

            ArrayList <Integer> list3 = new ArrayList<>();
            list3.add(13);
            list3.add(6);
            list3.add(1);
            list3.add(2);
            list3.add(3);
            boolean result3 = Kata.firstLast6(list3);
            System.out.printf("firstLast6(%s) -> %s\n" ,list3, result3 + "\n");

            // *****************************************************************************
            // 2. call sameFirstLast
            ArrayList <Integer> list4 = new ArrayList<>();
            list4.add(1);
            list4.add(2);
            list4.add(3);
            boolean result4 = Kata.sameFirstLast(list4);
            System.out.printf("sameFirstLast(%s) -> %s\n" , list4, result4);

            ArrayList <Integer> list5 = new ArrayList<>();
            list5.add(1);
            list5.add(2);
            list5.add(3);
            list5.add(1);
            boolean result5 = Kata.sameFirstLast(list5);
            System.out.printf("sameFirstLast(%s) -> %s\n" , list5, result5);

            ArrayList <Integer> list6 = new ArrayList<>();
            list6.add(1);
            list6.add(2);
            list6.add(1);
            boolean result6 = Kata.sameFirstLast(list6);
            System.out.printf("sameFirstLast(%s) -> %s\n" , list6, result6 + "\n");

            // *****************************************************************************
            // 3. call rotateLeft3
            ArrayList <Integer> list7 = new ArrayList<>();
            list7.add(1);
            list7.add(2);
            list7.add(3);
            ArrayList<Integer> result7 = Kata.rotateLeft3(list7);
            System.out.printf("rotateLeft3(%s) -> %s\n" ,list7, result7);

            ArrayList <Integer> list8 = new ArrayList<>();
            list8.add(5);
            list8.add(11);
            list8.add(9);
            ArrayList<Integer> result8 = Kata.rotateLeft3(list8);
            System.out.println("rotateLeft3([5, 11, 9]) -> " + result8);

            ArrayList <Integer> list9 = new ArrayList<>();
            list9.add(7);
            list9.add(0);
            list9.add(0);
            ArrayList<Integer> result9 = Kata.rotateLeft3(list9);
            System.out.println("rotateLeft3([0, 0, 7]) -> " + result9 + "\n");

            // *****************************************************************************
            // 4. call reverse3
            ArrayList <Integer> list10 = new ArrayList<>();
            list10.add(1);
            list10.add(2);
            list10.add(3);
            ArrayList<Integer> result10 = Kata.reverse3(list10);
            System.out.println("reverse3([1, 2, 3]) -> " + result10);

            ArrayList <Integer> list11 = new ArrayList<>();
            list11.add(5);
            list11.add(11);
            list11.add(9);
            ArrayList<Integer> result11 = Kata.reverse3(list11);
            System.out.println("reverse3([5, 11, 9]) -> " + result11);

            ArrayList <Integer> list12 = new ArrayList<>();
            list12.add(7);
            list12.add(0);
            list12.add(0);
            ArrayList<Integer> result12 = Kata.reverse3(list12);
            System.out.println("reverse3([7, 0, 0]) -> " + result12 + "\n");

            // *****************************************************************************
            // 5. call sumFirstPenultimate
            ArrayList <Integer> list13 = new ArrayList<>();
            list13.add(1);
            list13.add(2);
            list13.add(3);
            int result13 = Kata.sumFirstPenultimate(list13);
            System.out.println("sumFirstPenultimate([1,2,3]) -> " + result13);

            ArrayList <Integer> list14 = new ArrayList<>();
            list14.add(1);
            list14.add(1);
            int result14 = Kata.sumFirstPenultimate(list14);
            System.out.println("sumFirstPenultimate([1,1]) -> " + result14);

            ArrayList <Integer> list15 = new ArrayList<>();
            list15.add(1);
            list15.add(1);
            list15.add(1);
            list15.add(1);
            int result15 = Kata.sumFirstPenultimate(list15);
            System.out.println("sumFirstPenultimate([1,1,1,1]) -> " + result15);

            ArrayList <Integer> list16 = new ArrayList<>();
            list16.add(1);
            list16.add(2);
            list16.add(3);
            list16.add(4);
            int result16 = Kata.sumFirstPenultimate(list16);
            System.out.println("sumFirstPenultimate([1,2,3,4]) -> " + result16 + "\n");

            // *****************************************************************************
            // 6. call mapBully
            HashMap<String, String> data1 = new HashMap<>();
            data1.put("b", "dirt");
            data1.put("a", "candy");
            HashMap result17 = Kata.mapBully(data1);
            System.out.printf("Kata.mapBully(%s) -> %s\n", data1, result17);

            HashMap<String, String> data2 = new HashMap<>();
            data2.put("a", "candy");
            HashMap result18 = Kata.mapBully(data2);
            System.out.printf("Kata.mapBully(%s) -> %s\n", data2, result18);


            HashMap<String, String> data3 = new HashMap<>();
            data3.put("b", "carrot");
            data3.put("c", "meh");
            data3.put("a", "candy");
            HashMap result19 = Kata.mapBully(data3);
            System.out.printf("Kata.mapBully(%s) -> %s\n", data3, result19 +"\n");

            // *****************************************************************************
            // 7. call mapShare
            HashMap<String, String> data4 = new HashMap<>();
            data4.put("b", "bbb");
            data4.put("c", "ccc");
            data4.put("a", "aaa");
            HashMap result20 = Kata.mapShare(data4);
            System.out.printf("Kata.mapShare(%s) -> %s\n", data4, result20);

            HashMap<String, String> data5 = new HashMap<>();
            data5.put("b", "xyz");
            data5.put("c", "ccc");
            HashMap result21 = Kata.mapShare(data5);
            System.out.printf("Kata.mapShare(%s) -> %s\n", data5, result21);

            HashMap<String, String> data6 = new HashMap<>();
            data6.put("d", "hi");
            data6.put("c", "meh");
            data6.put("a", "aaa");
            HashMap result22 = Kata.mapShare(data6);
            System.out.printf("Kata.mapShare(%s) -> %s\n", data6, result22 + "\n");

            // *****************************************************************************
            // 8. call mapAB
            HashMap<String, String> data7 = new HashMap<>();
            data7.put("b", "There");
            data7.put("a", "Hi");
            HashMap result23 = Kata.mapAB(data7);
            System.out.printf("Kata.mapAB(%s) -> %s\n", data7, result23);

            HashMap<String, String> data8 = new HashMap<>();
            data8.put("a", "Hi");
            HashMap result24 = Kata.mapAB(data8);
            System.out.printf("Kata.mapAB(%s) -> %s\n", data8, result24);

            HashMap<String, String> data9 = new HashMap<>();
            data9.put("b", "There");
            HashMap result25 = Kata.mapAB(data9);
            System.out.printf("Kata.mapAB(%s) -> %s\n", data9, result25 + "\n");

            // *****************************************************************************
            // 9. call wordLen
            ArrayList <String> aList = new ArrayList<>();
            aList.add("a");
            aList.add("bb");
            aList.add("a");
            aList.add("bb");
            HashMap <String, Integer> result26 = Kata.wordLen(aList);
            System.out.printf("Kata.wordLen(%s) -> %s\n", aList, result26);

            ArrayList <String> aList2 = new ArrayList<>();
            aList2.add("this");
            aList2.add("and");
            aList2.add("that");
            aList2.add("and");
            HashMap <String, Integer> result27 = Kata.wordLen(aList2);
            System.out.printf("Kata.wordLen(%s) -> %s\n", aList2, result27);

            ArrayList <String> aList3 = new ArrayList<>();
            aList3.add("code");
            aList3.add("code");
            aList3.add("code");
            aList3.add("bug");
            HashMap <String, Integer> result28 = Kata.wordLen(aList3);
            System.out.printf("Kata.wordLen(%s) -> %s\n", aList3, result28 + "\n");

            // *****************************************************************************
            // 10. call indexWords
            ArrayList <String> words = new ArrayList<>();
            words.add("aardvark");
            words.add("apple");
            words.add("zamboni");
            words.add("phone");
            HashMap <String, ArrayList<String>> result29 = Kata.indexWords(words);
            System.out.printf("Kata.indexWords(%s) -> %s\n", words, result29);

            ArrayList <String> words2 = new ArrayList<>();
            words2.add("elephant");
            HashMap <String, ArrayList<String>> result30 = Kata.indexWords(words2);
            System.out.printf("Kata.indexWords(%s) -> %s\n", words2, result30);

            ArrayList <String> words3 = new ArrayList<>();
            HashMap <String, ArrayList<String>> result31 = Kata.indexWords(words3);
            System.out.printf("Kata.indexWords(%s) -> %s\n", words3, result31);

            ArrayList <String> words4 = new ArrayList<>();
            words4.add("");
            HashMap <String, ArrayList<String>> result32 = Kata.indexWords(words4);
            System.out.printf("Kata.indexWords(%s) -> %s\n", words4, result32);
        }
    }
