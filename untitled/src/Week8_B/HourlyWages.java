package Week8_B;

public class HourlyWages extends Employee{
    int numberOfHours;
    double hourlyRate;

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calSalary() {
        double totalSalary=0;
        if(numberOfHours<40)
        {
            totalSalary=numberOfHours*hourlyRate;
        }
        else
        {
            int temp=numberOfHours-40;
            totalSalary = (numberOfHours-40)*hourlyRate*2+ 40 *hourlyRate;
        }

        return totalSalary;
    }

}
