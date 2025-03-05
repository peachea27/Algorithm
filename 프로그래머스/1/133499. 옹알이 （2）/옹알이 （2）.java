class Solution{
    public int solution(String[] babbling) {
        int answer = 0;
        String[] niece = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;
            String lastRemoved = ""; 

            while (true) {
                boolean changed = false;
                for (String n : niece) {
                    if (temp.startsWith(n) && !n.equals(lastRemoved)) {
                        temp = temp.substring(n.length()); 
                        lastRemoved = n; 
                        changed = true;
                        break;
                    }
                }

                if (!changed) {
                    break;
                }
            }

            if (temp.equals("")) {
                answer++;
            }
        }

        return answer;
    }
}

//정확성 55.0 // 아하, 연속되면 발음 못하지만 단순 중복은 발음 가능!

        // int answer = 0;  
        // String[] niece = {"aya","ye","woo","ma"}; // babbling에서 niece를 뺐을때 0이 남은 개수
        // for(int i = 0; i < babbling.length; i++) {
        //     for(String n : niece) {
        //         int index = babbling[i].indexOf(n); // 없으면 -1 반환
        //         if(index != -1) 
        //             babbling[i] = babbling[i].substring(0,index) 
        //             +babbling[i].substring(index+n.length(), babbling[i].length());               
        //     }
        // }
        // for(String b : babbling) {
        //     if(b.equals("")) answer++;
        // }
        // return answer;