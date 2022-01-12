public class LogLevels {
        public static String message(String logLine) {
        String words[]=logLine.split("\\W+");
        String answer="";
        for(int i=2;i<words.length-1;i++)
        {
            answer+=words[i]+" ";
        }
        answer+=words[words.length-1];
        return answer;
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("[ERROR]"))
            return "error";
        else if(logLine.contains("[WARNING]"))
            return "warning";
        return "info";
    }

    public static String reformat(String logLine) {
        String answer = message(logLine);
        if(logLine.contains("[ERROR]"))
             answer+=" (error)";
        else if(logLine.contains("[WARNING]"))
            answer+=" (warning)";
        else
            answer+=" (info)";
        
        return answer;
    }
}
