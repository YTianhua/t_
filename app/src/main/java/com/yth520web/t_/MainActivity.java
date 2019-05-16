package com.yth520web.t_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View v){
        int id=v.getId();
        EditText editText=(EditText)findViewById(R.id.editText);
        TextView textview=(TextView)findViewById(R.id.textView);
        String getMoney=editText.getText().toString();
        try {
            Float money = Float.parseFloat(getMoney);
            Float meiyuan = money * 6;
            Float riyuan = money * 100;
            Float yingbang = money * 8;

            String m_meiyuan = meiyuan + "";
            String m_riyuan = riyuan + "";
            String m_yingbang = yingbang + "";

            switch (id) {
                case R.id.btu1:
                    textview.setText(money+" 人民币 折合："+m_meiyuan+"  美元");
                    editText.setText("");
                    break;
                case R.id.btu2:
                    editText.setText("");
                    textview.setText(money+" 人民币 折合："+m_riyuan+"  日元");
                    break;
                case R.id.btu3:
                    editText.setText("");
                    textview.setText(money+" 人民币 折合："+m_yingbang+"  英镑");
                    break;
                default:
                    break;

            }
        }
        catch(Exception e){
            Toast.makeText(this,"输入正确数值",Toast.LENGTH_SHORT);
        }
    }
}
