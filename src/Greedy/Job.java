package Greedy;

public class Job implements Comparable<Job>{
    Integer jobId;
    Integer startTime;
    Integer finishTime;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                '}';
    }

    @Override
    public int compareTo(Job o) {
        return getFinishTime().compareTo(o.getFinishTime());
    }
}