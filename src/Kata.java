                    import java.util.ArrayList;
                    import java.util.HashMap;

                    /**
                     * Created by katherine_celeste on 8/11/16.
                     */

                    public class Kata {

                        //Given an ArrayList of ints, return true if 6 appears as either the first or last
                        // element in the ArrayList. The ArrayList will be length 1 or more.
                        public static boolean firstLast6(ArrayList<Integer> a)
                        {
                            if((a.get(0)==6)||(6==a.get(a.size()-1)))
                            {return true;}

                            else
                                {return false;}
                        }

                        //Given an ArrayList of Integers, return true if the ArrayList is length 1 or more,
                        // and the first element and the last element are equal.
                        public static boolean sameFirstLast(ArrayList<Integer> a)
                        {
                            if((a.size()>0)&& (a.get(0)==a.get(a.size()-1)))
                            {
                                return true;
                            }
                            else
                                {
                                    return false;
                                }
                        }

                        // Given an ArrayList of Integers length 3, return an ArrayList with the elements
                        // "rotated left" so [1, 2, 3] yields [2, 3, 1].
                        public static ArrayList<Integer> rotateLeft3 (ArrayList<Integer> a)
                        {
                            a.add(a.remove(0));
                            return a;

                        }

                        // Given an ArrayList of Integers length 3, return a new ArrayList with the elements
                        // in reverse order, so [1, 2, 3] becomes [3, 2, 1].
                        public static ArrayList<Integer> reverse3 (ArrayList<Integer> a)
                        {
                            ArrayList<Integer> temp = new ArrayList<>();
                            for(int i = a.size()-1; i<a.size() && i>=0 ; i--)
                            {
                                temp.add(a.get(i));
                            }

                            return temp;
                        }

                        // Given an ArrayList of Integers of at least length 2, return the
                        // sum of the first elements in the ArrayList and the second from last element.
                        // If the ArrayList length is less than 2, just sum up the elements that exist,
                        // returning 0 if the array is length 0.
                        public static int sumFirstPenultimate(ArrayList<Integer> a)
                        {
                            if(a.size()>=2) {
                                return a.get(0) + a.get(a.size() - 2);
                            }
                            else if (a.size()==1)
                            {
                                return a.get(0);
                            }
                            else
                                {
                                    return 0;
                                }
                        }

                        // Modify and return the given HashMap as follows: if the key "a" has a value,
                        // set the key "b" to have that value, and set the key "a" to have the value "".
                        // Basically "b" is a bully, taking the value of "a".
                        public static HashMap<String, String> mapBully(HashMap <String, String> a)
                        {
                                if (a.get("a")!=null)
                                {
                                   a.put("b", a.get("a"));
                                    a.put("a", "");
                                }
                            return a;
                        }

                        // Modify and return the given HashMap as follows: if the key "a" has a value, set
                        // the key "b" to have that same value. In all cases remove the key "c", leaving the
                        // rest of the map unchanged.
                        public static HashMap <String, String> mapShare (HashMap <String, String> a)
                        {
                            if (a.get("a")!=null)
                            {
                                a.put("b", a.get("a"));
                            }
                            a.remove("c");

                            return a;
                        }

                        // Modify and return the given HashMap as follows: for this problem the HashMap may or
                        // may not contain the "a" and "b" keys. If both keys are present, append their 2 string
                        // values together and store the result under the key "ab".
                        public static HashMap <String, String> mapAB(HashMap <String, String> a)
                        {
                            if (a.containsKey("a") && (a.containsKey("b")))
                            {
                                String temp = "" + a.get("a") + a.get("b");;
                                a.put("ab", temp);
                            }
                            return a;
                        }

                        // Given an ArrayList of strings, return a HashMap containing a key for every different
                        // string in the ArrayList, and the value is that string's length.
                        public static HashMap <String, Integer> wordLen(ArrayList <String> a)
                        {
                            HashMap<String, Integer> aMap = new HashMap<>();

                            for(String element: a)
                            {
                                aMap.put(element, element.length());
                            }

                            return aMap;

                        }

                        // Given an ArrayList of words, return a HashMap containing a keys for every word's first
                        // letter. The value for the key will be an ArrayList of all words in the list that start
                        // with that letter. An empty string has no first letter so don't add a key for it.
                        public static HashMap<String, ArrayList<String>> indexWords(ArrayList<String> a)
                        {
                            HashMap<String, ArrayList<String>> aMap = new HashMap<>();

                            if((a.size() > 0) && a.get(0)!="")
                            {
                                for (int i = 0; i < a.size(); i++) {

                                    ArrayList<String> tempList = new ArrayList<>();

                                    char theKey = a.get(i).charAt(0); // retrieves first letter of word in ArrayList

                                    for (String element : a) // looping through ArrayList to compare first letter...
                                    {
                                        if (element.length() <= 0) {
                                            //do nothing
                                        } else if (element.charAt(0) == theKey) {

                                            tempList.add(element);
                                        }

                                    }
                                    aMap.put("" + theKey, tempList); // add ArrayList as value of map
                                }
                            }

                            return aMap;
                        }

                    }
