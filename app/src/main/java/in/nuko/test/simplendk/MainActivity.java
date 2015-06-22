package in.nuko.test.simplendk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("hello");
    }
    public native String helloWorld();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 文字列を取得して
        String text = helloWorld();

        TextView textView = (TextView) findViewById(R.id.text);
        // 表示

        textView.setText(text);
    }
}
