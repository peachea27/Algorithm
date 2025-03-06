import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> race = new HashMap<>();//hashMap으로 정리해서 이름만으로 선수위치 찾기
        for(int i = 0; i < players.length; i++){
            race.put(players[i],i); //현재 인덱스를 넣기
        }
        
        for(String name : callings ) {
            int currentRank = race.get(name);
            
            String tmp = players[currentRank];
            players[currentRank] = players[currentRank-1];
            players[currentRank-1] = tmp;
            
            race.put(name, currentRank-1);
            race.put(players[currentRank], currentRank);
        }
        return players;
    }
}

// 정확성 68.8 시간초과

   // for(String name : callings) {// 이름을 부를 때마다
   //          for ( int i = 1; i <players.length; i++) {// 어차피 0번 주자는 안부르니까
   //              if(name.equals(players[i])) {
   //                  String tmp = players[i];
   //                  players[i] = players[i-1];
   //                  players[i-1] = tmp;
   //              }
   //          }
   //      }
   //      return players;


// 정확성 75.0 시간초과

        // for(String name : callings) {// 이름을 부를 때마다
        //     for ( int i = 1; i <players.length; i++) {// 어차피 0번 주자는 안부르니까
        //         if(name.equals(players[i])) {
        //             String tmp = players[i];
        //             players[i] = players[i-1];
        //             players[i-1] = tmp;
        //             break;
        //         }
        //     }
        // }
        // return players;

