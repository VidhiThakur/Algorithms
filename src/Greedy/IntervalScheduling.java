package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntervalScheduling {
    public void performIntervalScheduling(ArrayList<Job>jobs){
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        ArrayList<Job> scheduledJobs=new ArrayList<Job>();
        scheduledJobs.add(jobs.get(0));
        for(int i=1;i<jobs.size();i++)
        {
            if(scheduledJobs.get(scheduledJobs.size()-1).getFinishTime()<=jobs.get(i).getStartTime()){
                scheduledJobs.add(jobs.get(i));
            }
        }
        System.out.println(scheduledJobs);




    }

    }




