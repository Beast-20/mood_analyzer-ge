package ma;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyze() throws MoodAnalysisException{
        if(this.message==null){
            throw new MoodAnalysisException(ErrorEnum.NULL, "Input message is Null");
        }
        if(this.message.contains("Sad")){
            return "SAD";
        }
        if(this.message.isEmpty()==true){
            throw new MoodAnalysisException(ErrorEnum.EMPTY, "Input message is Empty");
        }
        else{
            return "HAPPY";
        }
    }

}
