package fanshe2;

/**
 * 员工信息类
 * @ClassName: Emp
 * @Author: Mr.Ye
 * @Data: 2018-12-03 18:21
 **/
public class Emp {
    private String name ;
    private String job ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
