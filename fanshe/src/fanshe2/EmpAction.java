package fanshe2;

/**
 * 操作Emp的类，提供给用户使用
 *
 * @ClassName: EmpAction
 * @Author: Mr.Ye
 * @Data: 2018-12-03 18:26
 **/
public class EmpAction {
    // 最终要操作的真正的类
    private Emp emp = new Emp();

    // 提供一个对外的方法
    public void setEmpValue(String str) throws Exception{
        // this指的是当前调用Emp的对象（EmpAction）
        BeanUtil.setBeanValue(this, str);
    }

    // 返回信息
    public Emp getEmp() {
        return this.emp;
    }
}
