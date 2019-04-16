/**
 * @Author: wangzhuyi
 * @Date: 2019/3/28 15:23
 * @Version 1.0
 * @Describe
 */
public class Test1 {
    private int a = 1;

    public class aa {
        private int b=2;
        public void bb() {
            System.out.println("a:"+a+",b:"+b);
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        aa a = test1.new aa();
        a.bb();
    }
}
