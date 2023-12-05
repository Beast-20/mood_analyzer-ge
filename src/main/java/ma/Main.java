package ma;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analysis Program!");

        MoodAnalyzer m1 = new MoodAnalyzer("");
        MoodAnalyzer m2 = new MoodAnalyzer("I am in Sad Mood");
        MoodAnalyzer m3 = new MoodAnalyzer("I am in Any Mood");
        MoodAnalyzer m4 = new MoodAnalyzer(null);

        try{
            System.out.println("Mood of m1 is "+m1.analyze());
        }
        catch(MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
         try{
            System.out.println("Mood of m1 is "+m2.analyze());
        }
        catch(MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
         try{
            System.out.println("Mood of m1 is "+m3.analyze());
        }
        catch(MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
         try{
            System.out.println("Mood of m1 is "+m4.analyze());
        }
        catch(MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
    }
}
