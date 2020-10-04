import service.Job;
import service.SelectJob;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select your Job!");
        System.out.println("[1] -> Knight \n[2] -> Cleric");

        int typeJob = input.nextInt();

        SelectJob selectedJob = SelectJob.values()[typeJob - 1];
        Job jobs = selectedJob.getJob();

        System.out.println("Your Job: " + jobs.getJobName() + "\n" + "Your MAX HP: " + jobs.getMaxHP());
    }
}
