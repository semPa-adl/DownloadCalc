public class Calculator
{
    //Size measurement mode
    private String mode;
    //Vars for size and speed values
    private double size;
    private double speed;

    //Vars for the time of the download
    private double time;
    private int mins;
    private double secs;
    private double hours;


    Calculator()
    {
        this.mode = "GB";
    }

    //Method to calculate the time to download, takes doubles for size and speed as parameters
    String calculate(double sz, double sp)
    {
        //TODO change later for additional modes of size/speed
        //times size by 1000 for GB mode
        this.size = sz * 1000;
        this.speed = sp;

        //Time is calculated to minutes
        this.time = (size/speed)/60;

        //Isolate minutes
        this.mins= (int) time;
        //Isolate seconds and round down to whole number
        this.secs = (time-mins)*60;
        secs = (int) secs;

        return "Approx " + mins + " minutes and " + ((int)secs) + " seconds.";
    }
}
