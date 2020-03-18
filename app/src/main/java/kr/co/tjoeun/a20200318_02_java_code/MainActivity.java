package kr.co.tjoeun.a20200318_02_java_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Alt + Enter (에러줄에서) => 첫번째 => OK
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
