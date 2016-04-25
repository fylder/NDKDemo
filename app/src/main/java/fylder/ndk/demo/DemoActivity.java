package fylder.ndk.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * demo
 * Created by 剑指锁妖塔 on 2016/4/25.
 */
public class DemoActivity extends AppCompatActivity {

    TextView demoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        demoText = (TextView) findViewById(R.id.demo_text);

        DemoTools tools = new DemoTools();
        String s = tools.test();
        Log.w("1234567", s);
        demoText.setText(s);
    }
}
