// 현재시간, 결과값이 오프닝에 포함되는 시간인지

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_time=changeTime(video_len);
        int pos_time = changeTime(pos);
        int op_startTime = changeTime(op_start);
        int op_endTime = changeTime(op_end);
        
        for(int i =0; i < commands.length; i++) { //사용자 명령만큼 반복
            
            pos_time = checkTime(pos_time, op_startTime, op_endTime);
            
            if (commands[i].equals("next")) {
                pos_time = Math.min(video_time, pos_time + 10);
            }
            if (commands[i].equals("prev") && pos_time < 10) {
                 pos_time = 0;
            } else if(commands[i].equals("prev")) {
                pos_time = Math.max(0, pos_time - 10);
            }
            
            pos_time = checkTime(pos_time, op_startTime, op_endTime);
        }
         return convertToTime(pos_time);   
            
    }
public static int changeTime (String time) {
            
        String[] op_time = time.split(":");
        int minutes = Integer.parseInt(op_time[0]);
        int seconds = Integer.parseInt(op_time[1]); 
        
        return minutes * 60 + seconds;
}

public static String convertToTime(int time) {
        int minutes = time / 60;
        int seconds = time % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    
public static int checkTime(int pos_time, int op_startTime, int op_endTime) {
        if(pos_time >= op_startTime && pos_time <= op_endTime) {
            pos_time = op_endTime;
        }
    return pos_time;
    }
}