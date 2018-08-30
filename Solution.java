class Solution {
    public int romanToInt(String s) {
        Map map = this.buildMap();
        
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            String combo = "" + prev + curr;
            
            System.out.println("--");
            
            
            // 2 char
            if(map.containsKey(combo)) {
                int comboVal = Integer.parseInt( map.get(combo).toString() );
                System.out.println("---");
                System.out.println(comboVal);
            } else {
                // 1 char, i-1
                if(map.containsKey(prev + "")) {
                    int prevVal = Integer.parseInt( map.get(prev).toString() );
                    
                    // test
                    System.out.println("---");
                    System.out.println(prevVal);
                    System.out.println(s);
                    
                    // str builder
                    StringBuilder sb = new StringBuilder(s);
                    //StringBuilder sbTmp = sb.deleteCharAt(i-1);

                    
                    // test
                    System.out.println("after delete");
                    System.out.println(s);
                    
                } else {
                    System.out.println("no key in map at all");
                    System.out.println(prev);
                    System.out.println(curr);
                    System.exit(0);
                }
            }

        } // end
        
        return 0;
    }
    
    public Map buildMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        
        return map;
    }
}
