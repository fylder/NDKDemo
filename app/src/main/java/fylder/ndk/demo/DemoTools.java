package fylder.ndk.demo;

/**
 * ndk引入和声明
 * Created by 剑指锁妖塔 on 2016/4/25.
 */
public class DemoTools {

    static {
        System.loadLibrary("demoNDK");
    }

    public native String test();


}
