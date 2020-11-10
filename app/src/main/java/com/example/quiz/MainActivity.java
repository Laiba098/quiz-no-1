package com.example.quiz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton r1,r2,r3,r4;
    LinearLayout linearLayout;
    EditText ed1;
    Button b1;
    TextView text;
    String s1;
    int vowels = 0;
    int count=0;

    char ch[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.id1);
        r1=findViewById(R.id.apple);
        r2=findViewById(R.id.banana);
        r3=findViewById(R.id.mango);
        r4=findViewById(R.id.grape);
        linearLayout=findViewById(R.id.linierlayout);
        ed1=findViewById(R.id.id2);
        b1=findViewById(R.id.id3);
        text=findViewById(R.id.id4);





    }

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void func(View view)
    {
        if(r1.isChecked())
        {

            linearLayout.setBackground(getResources().getDrawable(R.drawable.apple, getTheme()));


        }
        if(r2.isChecked())
        {

            linearLayout.setBackground(getResources().getDrawable(R.drawable.banana, getTheme()));
        }
        if(r3.isChecked())
        {
            linearLayout.setBackground(getResources().getDrawable(R.drawable.mango, getTheme()));
        }
        if(r4.isChecked())
        {
            linearLayout.setBackground(getResources().getDrawable(R.drawable.grapes, getTheme()));
        }

    }
    public void Button(View view) {
        s1 = ed1.getText().toString();
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); ++i) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;

            }

        }
       ch=new char[s1.length()];
        for(int k=0;k<s1.length();k++)
        {
            ch[k]= s1.charAt(k);
            if( ((k>0)&&(ch[k]!=' ')&&(ch[k-1]==' ')) || ((ch[0]!=' ')&&(k==0)) )
                count++;
        }
        int length = ed1.length();
        String ch1 = String.valueOf(length);
        text.setText("Number of Vowels are: "+vowels+ "\nNumber of Characters are: "+ch1+ "\nNumber of Words are: "+count);

    }


}