package com.example.finalwork;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {
    private String mon1 = null;     private String mon2 = null;     private String mon3 = null;     private String mon4 = null;
    private String mon5 = null;     private String mon6 = null;     private String mon7 = null;     private String mon8 = null;
    private String mon9 = null;     private String mon10 = null;    private String mon11 = null;    private String mon12 = null;
    private String tue1 = null;     private String tue2 = null;     private String tue3 = null;     private String tue4 = null;
    private String tue5 = null;     private String tue6 = null;     private String tue7 = null;     private String tue8 = null;
    private String tue9 = null;     private String tue10 = null;    private String tue11 = null;    private String tue12 = null;
    private String wed1 = null;     private String wed2 = null;     private String wed3 = null;     private String wed4 = null;
    private String wed5 = null;     private String wed6 = null;     private String wed7 = null;     private String wed8 = null;
    private String wed9 = null;     private String wed10 = null;    private String wed11 = null;    private String wed12 = null;
    private String thu1 = null;     private String thu2 = null;     private String thu3 = null;     private String thu4 = null;
    private String thu5 = null;     private String thu6 = null;     private String thu7 = null;     private String thu8 = null;
    private String thu9 = null;     private String thu10 = null;    private String thu11 = null;    private String thu12 = null;
    private String fri1 = null;     private String fri2 = null;     private String fri3 = null;     private String fri4 = null;
    private String fri5 = null;     private String fri6 = null;     private String fri7 = null;     private String fri8 = null;
    private String fri9 = null;     private String fri10 = null;    private String fri11 = null;    private String fri12 = null;

    String day;
    String time;
    TextView timee;
    private static final String TAG = "TableActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent intent =getIntent();
        day = intent.getStringExtra("day");
        SharedPreferences sharedPreferences = getSharedPreferences("coursetable", Activity.MODE_PRIVATE);
        TextView show1 = findViewById(R.id.first);
        TextView show2 = findViewById(R.id.second);
        TextView show3 = findViewById(R.id.third);
        TextView show4 = findViewById(R.id.forth);
        TextView show5 = findViewById(R.id.fifth);
        TextView show6 = findViewById(R.id.sixth);
        TextView show7 = findViewById(R.id.seventh);
        TextView show8 = findViewById(R.id.eighth);
        TextView show9 = findViewById(R.id.ninth);
        TextView show10 = findViewById(R.id.tenth);
        TextView show11 = findViewById(R.id.eleventh);
        TextView show12 = findViewById(R.id.twelfth);


        if ("Monday".equals(day)){
            mon1 = sharedPreferences.getString("mon1","null");
            show1.setText(mon1);
            mon2 = sharedPreferences.getString("mon2","null");
            show2.setText(mon2);
            mon3 = sharedPreferences.getString("mon3","null");
            show3.setText(mon3);
            mon4 = sharedPreferences.getString("mon4","null");
            show4.setText(mon4);
            mon5 = sharedPreferences.getString("mon5","null");
            show5.setText(mon5);
            mon6 = sharedPreferences.getString("mon6","null");
            show6.setText(mon6);
            mon7 = sharedPreferences.getString("mon7","null");
            show7.setText(mon7);
            mon8 = sharedPreferences.getString("mon8","null");
            show8.setText(mon8);
            mon9 = sharedPreferences.getString("mon9","null");
            show9.setText(mon9);
            mon10 = sharedPreferences.getString("mon10","null");
            show10.setText(mon10);
            mon11 = sharedPreferences.getString("mon11","null");
            show11.setText(mon11);
            mon12 = sharedPreferences.getString("mon12","null");
            show12.setText(mon12);
        }else if ("Tuesday".equals(day)){
            tue1 = sharedPreferences.getString("tue1","null");
            show1.setText(tue1);
            tue2 = sharedPreferences.getString("tue2","null");
            show2.setText(tue2);
            tue3 = sharedPreferences.getString("tue3","null");
            show3.setText(tue3);
            tue4 = sharedPreferences.getString("tue4","null");
            show4.setText(tue4);
            tue5 = sharedPreferences.getString("tue5","null");
            show5.setText(tue5);
            tue6 = sharedPreferences.getString("tue6","null");
            show6.setText(tue6);
            tue7 = sharedPreferences.getString("tue7","null");
            show7.setText(tue7);
            tue8 = sharedPreferences.getString("tue8","null");
            show8.setText(tue8);
            tue9 = sharedPreferences.getString("tue9","null");
            show9.setText(tue9);
            tue10 = sharedPreferences.getString("tue10","null");
            show10.setText(tue10);
            tue11 = sharedPreferences.getString("tue11","null");
            show11.setText(tue11);
            tue12 = sharedPreferences.getString("tue12","null");
            show12.setText(tue12);
        }else if ("Wednesday".equals(day)){
            wed1 = sharedPreferences.getString("wed1","null");
            show1.setText(wed1);
            wed2 = sharedPreferences.getString("wed2","null");
            show2.setText(wed2);
            wed3 = sharedPreferences.getString("wed3","null");
            show3.setText(wed3);
            wed4 = sharedPreferences.getString("wed4","null");
            show4.setText(wed4);
            wed5 = sharedPreferences.getString("wed5","null");
            show5.setText(wed5);
            wed6 = sharedPreferences.getString("wed6","null");
            show6.setText(wed6);
            wed7 = sharedPreferences.getString("wed7","null");
            show7.setText(wed7);
            wed8 = sharedPreferences.getString("wed8","null");
            show8.setText(wed8);
            wed9 = sharedPreferences.getString("wed9","null");
            show9.setText(wed9);
            wed10 = sharedPreferences.getString("wed10","null");
            show10.setText(wed10);
            wed11 = sharedPreferences.getString("wed11","null");
            show11.setText(wed11);
            wed12 = sharedPreferences.getString("wed12","null");
            show12.setText(wed12);
        }else if ("Thursday".equals(day)){
            thu1 = sharedPreferences.getString("thu1","null");
            show1.setText(thu1);
            thu2 = sharedPreferences.getString("thu2","null");
            show2.setText(thu2);
            thu3 = sharedPreferences.getString("thu3","null");
            show3.setText(thu3);
            thu4 = sharedPreferences.getString("thu4","null");
            show4.setText(thu4);
            thu5 = sharedPreferences.getString("thu5","null");
            show5.setText(thu5);
            thu6 = sharedPreferences.getString("thu6","null");
            show6.setText(thu6);
            thu7 = sharedPreferences.getString("thu7","null");
            show7.setText(thu7);
            thu8 = sharedPreferences.getString("thu8","null");
            show8.setText(thu8);
            thu9 = sharedPreferences.getString("thu9","null");
            show9.setText(thu9);
            thu10 = sharedPreferences.getString("thu10","null");
            show10.setText(thu10);
            thu11 = sharedPreferences.getString("thu11","null");
            show11.setText(thu11);
            thu12 = sharedPreferences.getString("thu12","null");
            show12.setText(thu12);
        }else if ("Friday".equals(day)){
            fri1 = sharedPreferences.getString("fri1","null");
            show1.setText(fri1);
            fri2 = sharedPreferences.getString("fri2","null");
            show2.setText(fri2);
            fri3 = sharedPreferences.getString("fri3","null");
            show3.setText(fri3);
            fri4 = sharedPreferences.getString("fri4","null");
            show4.setText(fri4);
            fri5 = sharedPreferences.getString("fri5","null");
            show5.setText(fri5);
            fri6 = sharedPreferences.getString("fri6","null");
            show6.setText(fri6);
            fri7 = sharedPreferences.getString("fri7","null");
            show7.setText(fri7);
            fri8 = sharedPreferences.getString("fri8","null");
            show8.setText(fri8);
            fri9 = sharedPreferences.getString("fri9","null");
            show9.setText(fri9);
            fri10 = sharedPreferences.getString("fri10","null");
            show10.setText(fri10);
            fri11 = sharedPreferences.getString("fri11","null");
            show11.setText(fri11);
            fri12 = sharedPreferences.getString("fri12","null");
            show12.setText(fri12);
        }



    }

    public void class1(View v){

        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,1);
    }

    public void class2(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,2);
    }

    public void class3(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,3);
    }

    public void class4(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,4);
    }

    public void class5(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,5);
    }

    public void class6(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,6);
    }

    public void class7(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,7);
    }

    public void class8(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,8);
    }

    public void class9(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,9);
    }

    public void class10(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,10);
    }

    public void class11(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,11);
    }

    public void class12(View v){
        timee = findViewById(R.id.class1);
        time = timee.getText().toString();
        Intent intent = new Intent(this,TimeActivity.class);
        intent.putExtra("day",day);
        intent.putExtra("time",time);
        startActivityForResult(intent,12);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Bundle bundle = data.getExtras();
        if ("Monday".equals(day)){
            if (requestCode==1 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon1",cname);
                editor.putString("mon1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.first);
                tv.setText(cname);
            }else if (requestCode==2 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon2",cname);
                editor.putString("mon2t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.second);
                tv.setText(cname);
            }else if (requestCode==3 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon3",cname);
                editor.putString("mon3t",cteacher);
                editor.commit();TextView tv = findViewById(R.id.third);
                tv.setText(cname);
            }else if (requestCode==4 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon4",cname);
                editor.putString("mon4t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.forth);
                tv.setText(cname);
            }else if (requestCode==5 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon5",cname);
                editor.putString("mon5t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.fifth);
                tv.setText(cname);
            }else if (requestCode==6 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon6",cname);
                editor.putString("mon6t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.sixth);
                tv.setText(cname);
            }else if (requestCode==7 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon7",cname);
                editor.putString("mon7t",cteacher);
                editor.commit();TextView tv = findViewById(R.id.seventh);
                tv.setText(cname);
            }else if (requestCode==8 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon8",cname);
                editor.putString("mon8t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eighth);
                tv.setText(cname);
            }else if (requestCode==9 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon1",cname);
                editor.putString("mon1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.ninth);
                tv.setText(cname);
            }else if (requestCode==10 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon10",cname);
                editor.putString("mon10t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.tenth);
                tv.setText(cname);
            }else if (requestCode==11 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon11",cname);
                editor.putString("mon11t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eleventh);
                tv.setText(cname);
            }else if (requestCode==12 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mon12",cname);
                editor.putString("mon12t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.twelfth);
                tv.setText(cname);
            }
        }else if ("Tuesday".equals(day)){
            if (requestCode==1 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue1",cname);
                editor.putString("tue1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.first);
                tv.setText(cname);
            }else if (requestCode==2 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue2",cname);
                editor.putString("tue2t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.second);
                tv.setText(cname);
            }else if (requestCode==3 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue3",cname);
                editor.putString("tue3t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.third);
                tv.setText(cname);
            }else if (requestCode==4 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue4",cname);
                editor.putString("tue4t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.forth);
                tv.setText(cname);
            }else if (requestCode==5 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue5",cname);
                editor.putString("tue5t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.fifth);
                tv.setText(cname);
            }else if (requestCode==6 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue6",cname);
                editor.putString("tue6t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.sixth);
                tv.setText(cname);
            }else if (requestCode==7 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue7",cname);
                editor.putString("tue7t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.seventh);
                tv.setText(cname);
            }else if (requestCode==8 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue8",cname);
                editor.putString("tue8t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eighth);
                tv.setText(cname);
            }else if (requestCode==9 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue1",cname);
                editor.putString("tue1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.ninth);
                tv.setText(cname);
            }else if (requestCode==10 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue10",cname);
                editor.putString("tue10t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.tenth);
                tv.setText(cname);
            }else if (requestCode==11 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue11",cname);
                editor.putString("tue11t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eleventh);
                tv.setText(cname);
            }else if (requestCode==12 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tue12",cname);
                editor.putString("tue12t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.twelfth);
                tv.setText(cname);
            }
        }else if ("Wednesday".equals(day)){
            if (requestCode==1 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed1",cname);
                editor.putString("wed1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.first);
                tv.setText(cname);
            }else if (requestCode==2 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed2",cname);
                editor.putString("wed2t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.second);
                tv.setText(cname);
            }else if (requestCode==3 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed3",cname);
                editor.putString("wed3t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.third);
                tv.setText(cname);
            }else if (requestCode==4 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed4",cname);
                editor.putString("wed4t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.forth);
                tv.setText(cname);
            }else if (requestCode==5 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed5",cname);
                editor.putString("wed5t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.fifth);
                tv.setText(cname);
            }else if (requestCode==6 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed6",cname);
                editor.putString("wed6t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.sixth);
                tv.setText(cname);
            }else if (requestCode==7 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed7",cname);
                editor.putString("wed7t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.seventh);
                tv.setText(cname);
            }else if (requestCode==8 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed8",cname);
                editor.putString("wed8t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eighth);
                tv.setText(cname);
            }else if (requestCode==9 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed1",cname);
                editor.putString("wed1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.ninth);
                tv.setText(cname);
            }else if (requestCode==10 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed10",cname);
                editor.putString("wed10t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.tenth);
                tv.setText(cname);
            }else if (requestCode==11 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed11",cname);
                editor.putString("wed11t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eleventh);
                tv.setText(cname);
            }else if (requestCode==12 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("wed12",cname);
                editor.putString("wed12t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.twelfth);
                tv.setText(cname);
            }
        }else if ("Thursday".equals(day)){
            if (requestCode==1 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu1",cname);
                editor.putString("thu1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.first);
                tv.setText(cname);
            }else if (requestCode==2 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu2",cname);
                editor.putString("thu2t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.second);
                tv.setText(cname);
            }else if (requestCode==3 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu3",cname);
                editor.putString("thu3t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.third);
                tv.setText(cname);
            }else if (requestCode==4 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu4",cname);
                editor.putString("thu4t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.forth);
                tv.setText(cname);
            }else if (requestCode==5 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu5",cname);
                editor.putString("thu5t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.fifth);
                tv.setText(cname);
            }else if (requestCode==6 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu6",cname);
                editor.putString("thu6t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.sixth);
                tv.setText(cname);
            }else if (requestCode==7 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu7",cname);
                editor.putString("thu7t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.seventh);
                tv.setText(cname);
            }else if (requestCode==8 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu8",cname);
                editor.putString("thu8t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eighth);
                tv.setText(cname);
            }else if (requestCode==9 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu1",cname);
                editor.putString("thu1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.ninth);
                tv.setText(cname);
            }else if (requestCode==10 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu10",cname);
                editor.putString("thu10t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.tenth);
                tv.setText(cname);
            }else if (requestCode==11 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu11",cname);
                editor.putString("thu11t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eleventh);
                tv.setText(cname);
            }else if (requestCode==12 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("thu12",cname);
                editor.putString("thu12t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.twelfth);
                tv.setText(cname);
            }
        }else if ("Friday".equals(day)){
            if (requestCode==1 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri1",cname);
                editor.putString("fri1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.first);
                tv.setText(cname);
            }else if (requestCode==2 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri2",cname);
                editor.putString("fri2t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.second);
                tv.setText(cname);
            }else if (requestCode==3 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri3",cname);
                editor.putString("fri3t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.third);
                tv.setText(cname);
            }else if (requestCode==4 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri4",cname);
                editor.putString("fri4t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.forth);
                tv.setText(cname);
            }else if (requestCode==5 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri5",cname);
                editor.putString("fri5t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.fifth);
                tv.setText(cname);
            }else if (requestCode==6 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri6",cname);
                editor.putString("fri6t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.sixth);
                tv.setText(cname);
            }else if (requestCode==7 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri7",cname);
                editor.putString("fri7t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.seventh);
                tv.setText(cname);
            }else if (requestCode==8 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri8",cname);
                editor.putString("fri8t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eighth);
                tv.setText(cname);
            }else if (requestCode==9 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri1",cname);
                editor.putString("fri1t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.ninth);
                tv.setText(cname);
            }else if (requestCode==10 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri10",cname);
                editor.putString("fri10t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.tenth);
                tv.setText(cname);
            }else if (requestCode==11 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri11",cname);
                editor.putString("fri11t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.eleventh);
                tv.setText(cname);
            }else if (requestCode==12 && resultCode==1){
                String cname = bundle.getString("name");
                String cteacher = bundle.getString("teacher");
                SharedPreferences sharedPreferences = getSharedPreferences("coursetable",Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("fri12",cname);
                editor.putString("fri12t",cteacher);
                editor.commit();
                TextView tv = findViewById(R.id.twelfth);
                tv.setText(cname);
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
