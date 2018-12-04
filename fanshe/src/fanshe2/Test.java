package fanshe2;

/**
 * @ClassName: Test
 * @Author: Mr.Ye
 * @Data: 2018-12-03 18:20
 **/
public class Test {
    public static void main(String[] args) throws Exception{
        String str = "emp.name:heizi|emp.job:boos";
        EmpAction empAction = new EmpAction();
        empAction.setEmpValue(str);
        System.out.println(empAction.getEmp());
    }
}
