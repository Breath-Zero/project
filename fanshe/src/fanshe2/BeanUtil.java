package fanshe2;

import java.lang.reflect.Method;

/**
 * 操作简单类属性设置的工具类
 * @ClassName: BeanUtil
 * @Author: Mr.Ye
 * @Data: 2018-12-03 18:44
 **/
public class BeanUtil {
    private BeanUtil(){}

    /**
     *
     * @param actionObj 拿到提供给用户使用的XXAction类
     * @param beanValue 要设置的具体值
     * "emp.name:heizi|emp.job:boos";
     */
    public static void setBeanValue(Object actionObj, String beanValue) throws Exception{
        // 字符串拆分
        String[] temp = beanValue.split("\\|");
        // emp.name:heizi
        // emp.job:boos
        for (int i = 0; i < temp.length; i++) {
            // emp.name:heizi
            String[] result = temp[i].split(":");
            // emp.name
            // heizi
            String realValue = result[1]; // 取得真正要设置的值（第二个元素）
            // emp.name
            String className = result[0].split("\\.")[0]; // 取得类名
            String attrName = result[0].split("\\.")[1]; // 取得属性值

            // 根据XXAction类取得真正操作的主题类Emp
            // 通过反射调用getEmp()
            Object realObj = getRealObject(actionObj, className);
//            System.out.println(realObj);

            // 调用真正类的setter方法设置属性
            // 取得真正主题类的class对象
            Class<?> cls = realObj.getClass();
            // 拼装setter方法名
            String setName = "set" + initCap(attrName);
            // 取得setter方法的method对象
            Method setMethod = cls.getMethod(setName, String.class);
            // 调用invoke通过反射设置值
            setMethod.invoke(realObj, realValue);
        }
    }

    /**
     * 取得真正操作的对象
     * @param actionObj XXAction
     * @param className 要操作的类名称
     * @return
     */
    private static Object getRealObject (Object actionObj, String className) throws Exception{
        // 1. 取得XXAction Class对象
        Class<?> cls = actionObj.getClass();
        // 2. 拼装getXX()方法名称
        String methodName = "get"+initCap(className);
        // 3. 取得该方法名称的Method对象
        Method method = cls.getMethod(methodName);
        // 4. 通过反射调用该方法
        // 等同于empAction.getEmp();
        return method.invoke(actionObj);
    }
    private static String initCap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
