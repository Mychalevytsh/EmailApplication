package bankAccountApp;

public interface IBaseRate {
    //Method that returns base Rate
    default double getBaseRate(){
        return  2.5;
    }
}
