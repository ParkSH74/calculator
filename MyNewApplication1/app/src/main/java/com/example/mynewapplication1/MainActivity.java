package com.example.mynewapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btndel;
    private Button btncc;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnequ;
    private Button btnchan;
    private Button btngen;
    private Button btnbai;
    private Button btnpoint;

    private TextView tv_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn6 = (Button) findViewById(R.id.button6);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);

        btndel = (Button) findViewById(R.id.buttondel);
        btncc = (Button) findViewById(R.id.buttoncc);
        btnadd = (Button) findViewById(R.id.buttonadd);
        btnsub = (Button) findViewById(R.id.buttonjian);
        btnmul = (Button) findViewById(R.id.buttonmul);
        btndiv = (Button) findViewById(R.id.buttonchu);
        btnequ = (Button) findViewById(R.id.buttondeng);
        btnchan = (Button) findViewById(R.id.buttonchange);
        btngen = (Button) findViewById(R.id.buttonhun);
        btnbai = (Button) findViewById(R.id.buttonbai);
        btnpoint = (Button) findViewById(R.id.buttonpoint);

        tv_view=(TextView) findViewById(R.id.aatextView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"0");

            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()) {
                    aa = aa.substring(0, aa.length() - 1);
                    tv_view.setText(aa);
                }

            }
        });

        btncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_view.setText("");
            }
        });

        btngen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(aa.isEmpty()){
                    tv_view.setText(aa+"√");
                }else{
                    char cca=aa.charAt(aa.length()-1);
                    if(cca>'9'&&cca<'0')
                        tv_view.setText(aa+"√");
                    else
                    {
                        Toast.makeText(getApplicationContext(), "根号前不能为数字", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag=false;
                String aa= (String) tv_view.getText();
                for(int i=0;i<aa.length();i++){
                    if(aa.charAt(i)=='.'){
                        flag=true;
                    }
                    if((aa.charAt(i)=='+')){
                        flag=false;
                    }
                    if((aa.charAt(i)=='-')){
                        flag=false;
                    }
                    if((aa.charAt(i)=='x')){
                        flag=false;
                    }
                    if((aa.charAt(i)=='÷')){
                        flag=false;
                    }
                }
                if(flag==true){
                    tv_view.setText(aa);
                }
                else {
                    tv_view.setText(aa + ".");
                }
            }
        });

        btnbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                tv_view.setText(aa+"%");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()){
                    if(aa.charAt(aa.length()-1)!='+') {
                        if (aa.charAt(aa.length() - 1) >= '0' && aa.charAt(aa.length() - 1) <= '9')
                            tv_view.setText(aa + "+");
                        else {
                            aa = aa.substring(0, aa.length() - 1);
                            tv_view.setText(aa + "+");
                        }
                    }
                }else tv_view.setText("+");

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()){
                    if(aa.charAt(aa.length()-1)!='-') {
                        if (aa.charAt(aa.length() - 1) >= '0' && aa.charAt(aa.length() - 1) <= '9')
                            if(aa.isEmpty()){
                                tv_view.setText(aa+"-");
                            }else{
                                char cca=aa.charAt(aa.length()-1);
                                if(cca!='√')
                                    tv_view.setText(aa+"-");
                                else
                                {
                                    Toast.makeText(getApplicationContext(), "根号前不能为数字", Toast.LENGTH_SHORT).show();
                                }
                            }

                        else {
                            aa = aa.substring(0, aa.length() - 1);
                            if(aa.isEmpty()){
                                tv_view.setText(aa+"-");
                            }else{
                                char cca=aa.charAt(aa.length()-1);
                                if(cca!='√')
                                    tv_view.setText(aa+"-");
                                else
                                {
                                    Toast.makeText(getApplicationContext(), "根号前不能为数字", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    }
                }else tv_view.setText("-");
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()){
                    if(aa.charAt(aa.length()-1)!='x') {
                        if (aa.charAt(aa.length() - 1) >= '0' && aa.charAt(aa.length() - 1) <= '9')
                            tv_view.setText(aa + "x");
                        else {
                            aa = aa.substring(0, aa.length() - 1);
                            tv_view.setText(aa + "x");
                        }
                    }
                }else tv_view.setText("");
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()){
                    if(aa.charAt(aa.length()-1)!='÷') {
                        if (aa.charAt(aa.length() - 1) >= '0' && aa.charAt(aa.length() - 1) <= '9')
                            tv_view.setText(aa + "÷");
                        else {
                            aa = aa.substring(0, aa.length() - 1);
                            tv_view.setText(aa + "÷");
                        }
                    }
                }else tv_view.setText("");
            }
        });

        btnchan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                if(!aa.isEmpty()){
                    if(aa.charAt(aa.length()-1)=='+'){
                        aa=aa.substring(0,aa.length()-1);
                        tv_view.setText(aa+'-');
                    }else if(aa.charAt(aa.length()-1)=='-'){
                        aa=aa.substring(0,aa.length()-1);
                        tv_view.setText(aa+'+');
                    }else
                        tv_view.setText(aa+"-");
                }else tv_view.setText(aa+"+");

            }
        });
        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa= (String) tv_view.getText();
                String bb="";
                boolean choice=true;
                LinkedList<Double> nunn = new LinkedList<>();
                LinkedList<Character> ccs = new LinkedList<>();
                int pos1=0;
                int pos2=0;
                double num1=0;
                boolean ft=true;

                int afterp=0;//判断是否在.后
                int numbb=0;//在.后的第几位

                if(aa.charAt(0)=='-'){
                    ft=false;
                    aa=aa.substring(1,aa.length());
                }else if(aa.charAt(0)=='+'){
                    aa=aa.substring(1,aa.length());
                }

                for(int i=0;i<aa.length();i++){//识别数字和运算符
                    char cc=aa.charAt(i);
                    if(cc<='9'&&cc>='0'){
                        if(afterp==0){
                            num1=num1*10+cc-'0';
                            System.out.println("notafter");
                        }

                        else{
                            System.out.println("after");
                            numbb++;
                            double cc11=cc-'0';

                            for(int a=0;a<numbb;a++){
                                cc11= (Double) (cc11/10);

                            }
                            num1=num1+cc11;
                        }

                    }else if(cc=='.'){
                        afterp=1;
                        System.out.println("changeafter");
                    }
                    else {
                        afterp=0;
                        numbb=0;
                        if(pos1==0&&ft==false){
                            nunn.add(pos1,-1.0*num1);
                            bb+="bain";

                        }else{
                            nunn.add(pos1,num1);
                        }
                        pos1++;
                        num1=0;
                        bb+=String.valueOf(nunn.getLast());
                        ccs.add(pos2,cc);
                        pos2++;
                        bb+=String.valueOf(ccs.getLast());
                    }
                }
                if(pos1==0&&ft==false){
                    nunn.add(pos1,-1.0*num1);
                    bb+="bain";
                }else nunn.add(pos1,num1);
                bb+=String.valueOf(nunn.getLast());

                if(!ccs.isEmpty()){
                    bb+="not";
                    bb+=String.valueOf(ccs.size());

                    for(int i=0;i<ccs.size();i++){

                        if(ccs.get(i)=='%'){
                            Double n1=nunn.get(i);
                            nunn.set(i,n1/100);
                            ccs.remove(i);
                            i--;
                        }else if(ccs.get(i)=='√'){
                            Double n2=nunn.get(i+1);

                            System.out.println("cishu"+n2);
                            nunn.set(i,Math.sqrt(n2));
                            ccs.remove(i);
                            i--;
                        }

                    }

                    for(int i=0;i<ccs.size();i++){
                        if(ccs.get(i)=='x'){
                            System.out.println("乘");
                            Double n1=nunn.get(i);
                            Double n2=nunn.get(i+1);
                            nunn.remove(i+1);
                            nunn.set(i,n1*n2);
                            ccs.remove(i);
                            bb+=String.valueOf(i);
                            i--;
                        }else if(ccs.get(i)=='÷'){
                            Double n1=nunn.get(i);
                            Double n2=nunn.get(i+1);
                            if(n2!=0){
                                nunn.remove(i+1);
                                nunn.set(i,n1/n2);
                                ccs.remove(i);
                                i--;
                            }else {
                                Toast.makeText(getApplicationContext(), "除数为0", Toast.LENGTH_SHORT).show();
                                choice=false;
                            }

                        }

                    }
                    for(int i=0;i<ccs.size();i++){
                        if(ccs.get(i)=='+'){
                            System.out.println("加");
                            Double n1=nunn.get(i);
                            Double n2=nunn.get(i+1);
                            nunn.remove(i+1);
                            nunn.set(i,n1+n2);
                            ccs.remove(i);
                            i--;
                        }else if(ccs.get(i)=='-'){
                            Double n1=nunn.get(i);
                            Double n2=nunn.get(i+1);
                            nunn.remove(i+1);
                            nunn.set(i,n1-n2);
                            ccs.remove(i);
                            i--;
                        }

                    }
                }
                bb+="=";
                bb=String.valueOf(nunn.get(0));
                if(choice)
                    tv_view.setText(bb);

            }
        });

    }
}