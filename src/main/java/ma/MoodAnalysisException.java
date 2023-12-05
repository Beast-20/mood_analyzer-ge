package ma;

public class MoodAnalysisException extends Exception {

    private ErrorEnum type;

    public MoodAnalysisException(ErrorEnum type, String message){
        super(message);
        this.type = type;
    }
    
    public ErrorEnum getType(){
        return this.type;
    }
    
}
