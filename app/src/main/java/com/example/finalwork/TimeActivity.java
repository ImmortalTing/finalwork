package com.example.finalwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {

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
    private String mon1t = null;    private String mon2t = null;    private String mon3t = null;    private String mon4t= null;
    private String mon5t = null;    private String mon6t = null;    private String mon7t = null;    private String mon8t = null;
    private String mon9t = null;    private String mon10t = null;   private String mon11t = null;   private String mon12t = null;
    private String tue1t = null;    private String tue2t = null;    private String tue3t = null;    private String tue4t = null;
    private String tue5t = null;    private String tue6t = null;    private String tue7t = null;    private String tue8t = null;
    private String tue9t = null;    private String tue10t = null;   private String tue11t = null;   private String tue12t = null;
    private String wed1t = null;    private String wed2t = null;    private String wed3t = null;    private String wed4t = null;
    private String wed5t = null;    private String wed6t = null;    private String wed7t = null;    private String wed8t = null;
    private String wed9t = null;    private String wed10t = null;   private String wed11t = null;   private String wed12t = null;
    private String thu1t = null;    private String thu2t = null;    private String thu3t = null;    private String thu4t = null;
    private String thu5t = null;    private String thu6t = null;    private String thu7t = null;    private String thu8t = null;
    private String thu9t = null;    private String thu10t = null;   private String thu11t = null;   private String thu12t = null;
    private String fri1t = null;    private String fri2t = null;    private String fri3t = null;    private String fri4t = null;
    private String fri5t = null;    private String fri6t = null;    private String fri7t = null;    private String fri8t = null;
    private String fri9t = null;    private String fri10t = null;   private String fri11t = null;   private String fri12t = null;

    String day;
    EditText course;
    EditText teacher;
    TextView time;
    String timee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent intent = getIntent();
        day = intent.getStringExtra("day");
        timee = intent.getStringExtra("time");
        time = findViewById(R.id.time);
        time.setText(timee);
        course = findViewById(R.id.course);
        teacher = findViewById(R.id.teacher);

        SharedPreferences sharedPreferences = getSharedPreferences("coursetable", Activity.MODE_PRIVATE);
        if ("Monday".equals(day)){
            if ("8:30-9:15".equals(timee)){
                mon1 = sharedPreferences.getString("mon1","null");
                course.setText(mon1);
                mon1t = sharedPreferences.getString("mon1t","null");
                teacher.setText(mon1t);
            }else if ("9:25-10:10".equals(timee)){
                mon2 = sharedPreferences.getString("mon2","null");
                course.setText(mon2);
                mon2t = sharedPreferences.getString("mon2t","null");
                teacher.setText(mon2t);
            }else if ("10:20-11:05".equals(timee)){
                mon3 = sharedPreferences.getString("mon3","null");
                course.setText(mon3);
                mon3t = sharedPreferences.getString("mon3t","null");
                teacher.setText(mon3t);
            }else if ("11:15-12:00".equals(timee)){
                mon4 = sharedPreferences.getString("mon4","null");
                course.setText(mon4);
                mon4t = sharedPreferences.getString("mon4t","null");
                teacher.setText(mon4t);
            }else if ("13:00-13:45".equals(timee)){
                mon5 = sharedPreferences.getString("mon5","null");
                course.setText(mon5);
                mon5t = sharedPreferences.getString("mon5t","null");
                teacher.setText(mon5t);
            }else if ("13:55-14:40".equals(timee)){
                mon6 = sharedPreferences.getString("mon6","null");
                course.setText(mon6);
                mon6t = sharedPreferences.getString("mon6t","null");
                teacher.setText(mon6t);
            }else if ("14:50-15:35".equals(timee)){
                mon7 = sharedPreferences.getString("mon7","null");
                course.setText(mon7);
                mon7t = sharedPreferences.getString("mon7t","null");
                teacher.setText(mon7t);
            }else if ("15:45-16:30".equals(timee)){
                mon8 = sharedPreferences.getString("mon8","null");
                course.setText(mon8);
                mon8t = sharedPreferences.getString("mon8t","null");
                teacher.setText(mon8t);
            }else if ("16:40-17:25".equals(timee)){
                mon9 = sharedPreferences.getString("mon9","null");
                course.setText(mon9);
                mon9t = sharedPreferences.getString("mon9t","null");
                teacher.setText(mon9t);
            }else if ("18:30-19:15".equals(timee)){
                mon10 = sharedPreferences.getString("mon10","null");
                course.setText(mon10);
                mon10t = sharedPreferences.getString("mon10t","null");
                teacher.setText(mon10t);
            }else if ("19:25-20:10".equals(timee)){
                mon11 = sharedPreferences.getString("mon11","null");
                course.setText(mon11);
                mon11t = sharedPreferences.getString("mon11t","null");
                teacher.setText(mon11t);
            }else if ("20:20-21:05".equals(timee)){
                mon12 = sharedPreferences.getString("mon12","null");
                course.setText(mon12);
                mon12t = sharedPreferences.getString("mon12t","null");
                teacher.setText(mon12t);
            }

        }else if ("Tuesday".equals(day)){
            if ("8:30-9:15".equals(timee)){
                tue1 = sharedPreferences.getString("tue1","null");
                course.setText(tue1);
                tue1t = sharedPreferences.getString("tue1t","null");
                teacher.setText(tue1t);
            }else if ("9:25-10:10".equals(timee)){
                tue2 = sharedPreferences.getString("tue2","null");
                course.setText(tue2);
                tue2t = sharedPreferences.getString("tue2t","null");
                teacher.setText(tue2t);
            }else if ("10:20-11:05".equals(timee)){
                tue3 = sharedPreferences.getString("tue3","null");
                course.setText(tue3);
                tue3t = sharedPreferences.getString("tue3t","null");
                teacher.setText(tue3t);
            }else if ("11:15-12:00".equals(timee)){
                tue4 = sharedPreferences.getString("tue4","null");
                course.setText(tue4);
                tue4t = sharedPreferences.getString("tue4t","null");
                teacher.setText(tue4t);
            }else if ("13:00-13:45".equals(timee)){
                tue5 = sharedPreferences.getString("tue5","null");
                course.setText(tue5);
                tue5t = sharedPreferences.getString("tue5t","null");
                teacher.setText(tue5t);
            }else if ("13:55-14:40".equals(timee)){
                tue6 = sharedPreferences.getString("tue6","null");
                course.setText(tue6);
                tue6t = sharedPreferences.getString("tue6t","null");
                teacher.setText(tue6t);
            }else if ("14:50-15:35".equals(timee)){
                tue7 = sharedPreferences.getString("tue7","null");
                course.setText(tue7);
                tue7t = sharedPreferences.getString("tue7t","null");
                teacher.setText(tue7t);
            }else if ("15:45-16:30".equals(timee)){
                tue8 = sharedPreferences.getString("tue8","null");
                course.setText(tue8);
                tue8t = sharedPreferences.getString("tue8t","null");
                teacher.setText(tue8t);
            }else if ("16:40-17:25".equals(timee)){
                tue9 = sharedPreferences.getString("tue9","null");
                course.setText(tue9);
                tue9t = sharedPreferences.getString("tue9t","null");
                teacher.setText(tue9t);
            }else if ("18:30-19:15".equals(timee)){
                tue10 = sharedPreferences.getString("tue10","null");
                course.setText(tue10);
                tue10t = sharedPreferences.getString("tue10t","null");
                teacher.setText(tue10t);
            }else if ("19:25-20:10".equals(timee)){
                tue11 = sharedPreferences.getString("tue11","null");
                course.setText(tue11);
                tue11t = sharedPreferences.getString("tue11t","null");
                teacher.setText(tue11t);
            }else if ("20:20-21:05".equals(timee)){
                tue12 = sharedPreferences.getString("tue12","null");
                course.setText(tue12);
                tue12t = sharedPreferences.getString("tue12t","null");
                teacher.setText(tue12t);
            }


        }else if ("Wednesday".equals(day)){
            if ("8:30-9:15".equals(timee)){
                wed1 = sharedPreferences.getString("wed1","null");
                course.setText(wed1);
                wed1t = sharedPreferences.getString("wed1t","null");
                teacher.setText(wed1t);
            }else if ("9:25-10:10".equals(timee)){
                wed2 = sharedPreferences.getString("wed2","null");
                course.setText(wed2);
                wed2t = sharedPreferences.getString("wed2t","null");
                teacher.setText(wed2t);
            }else if ("10:20-11:05".equals(timee)){
                wed3 = sharedPreferences.getString("wed3","null");
                course.setText(wed3);
                wed3t = sharedPreferences.getString("wed3t","null");
                teacher.setText(wed3t);
            }else if ("11:15-12:00".equals(timee)){
                wed4 = sharedPreferences.getString("wed4","null");
                course.setText(wed4);
                wed4t = sharedPreferences.getString("wed4t","null");
                teacher.setText(wed4t);
            }else if ("13:00-13:45".equals(timee)){
                wed5 = sharedPreferences.getString("wed5","null");
                course.setText(wed5);
                wed5t = sharedPreferences.getString("wed5t","null");
                teacher.setText(wed5t);
            }else if ("13:55-14:40".equals(timee)){
                wed6 = sharedPreferences.getString("wed6","null");
                course.setText(wed6);
                wed6t = sharedPreferences.getString("wed6t","null");
                teacher.setText(wed6t);
            }else if ("14:50-15:35".equals(timee)){
                wed7 = sharedPreferences.getString("wed7","null");
                course.setText(wed7);
                wed7t = sharedPreferences.getString("wed7t","null");
                teacher.setText(wed7t);
            }else if ("15:45-16:30".equals(timee)){
                wed8 = sharedPreferences.getString("wed8","null");
                course.setText(wed8);
                wed8t = sharedPreferences.getString("wed8t","null");
                teacher.setText(wed8t);
            }else if ("16:40-17:25".equals(timee)){
                wed9 = sharedPreferences.getString("wed9","null");
                course.setText(wed9);
                wed9t = sharedPreferences.getString("wed9t","null");
                teacher.setText(wed9t);
            }else if ("18:30-19:15".equals(timee)){
                wed10 = sharedPreferences.getString("wed10","null");
                course.setText(wed10);
                wed10t = sharedPreferences.getString("wed10t","null");
                teacher.setText(wed10t);
            }else if ("19:25-20:10".equals(timee)){
                wed11 = sharedPreferences.getString("wed11","null");
                course.setText(wed11);
                wed11t = sharedPreferences.getString("wed11t","null");
                teacher.setText(wed11t);
            }else if ("20:20-21:05".equals(timee)){
                wed12 = sharedPreferences.getString("wed12","null");
                course.setText(wed12);
                wed12t = sharedPreferences.getString("wed12t","null");
                teacher.setText(wed12t);
            }

        }else if ("Thursday".equals(day)){
            if ("8:30-9:15".equals(timee)){
                thu1 = sharedPreferences.getString("thu1","null");
                course.setText(thu1);
                thu1t = sharedPreferences.getString("thu1t","null");
                teacher.setText(thu1t);
            }else if ("9:25-10:10".equals(timee)){
                thu2 = sharedPreferences.getString("thu2","null");
                course.setText(thu2);
                thu2t = sharedPreferences.getString("thu2t","null");
                teacher.setText(thu2t);
            }else if ("10:20-11:05".equals(timee)){
                thu3 = sharedPreferences.getString("thu3","null");
                course.setText(thu3);
                thu3t = sharedPreferences.getString("thu3t","null");
                teacher.setText(thu3t);
            }else if ("11:15-12:00".equals(timee)){
                thu4 = sharedPreferences.getString("thu4","null");
                course.setText(thu4);
                thu4t = sharedPreferences.getString("thu4t","null");
                teacher.setText(thu4t);
            }else if ("13:00-13:45".equals(timee)){
                thu5 = sharedPreferences.getString("thu5","null");
                course.setText(thu5);
                thu5t = sharedPreferences.getString("thu5t","null");
                teacher.setText(thu5t);
            }else if ("13:55-14:40".equals(timee)){
                thu6 = sharedPreferences.getString("thu6","null");
                course.setText(thu6);
                thu6t = sharedPreferences.getString("thu6t","null");
                teacher.setText(thu6t);
            }else if ("14:50-15:35".equals(timee)){
                thu7 = sharedPreferences.getString("thu7","null");
                course.setText(thu7);
                thu7t = sharedPreferences.getString("thu7t","null");
                teacher.setText(thu7t);
            }else if ("15:45-16:30".equals(timee)){
                thu8 = sharedPreferences.getString("thu8","null");
                course.setText(thu8);
                thu8t = sharedPreferences.getString("thu8t","null");
                teacher.setText(thu8t);
            }else if ("16:40-17:25".equals(timee)){
                thu9 = sharedPreferences.getString("thu9","null");
                course.setText(thu9);
                thu9t = sharedPreferences.getString("thu9t","null");
                teacher.setText(thu9t);
            }else if ("18:30-19:15".equals(timee)){
                thu10 = sharedPreferences.getString("thu10","null");
                course.setText(thu10);
                thu10t = sharedPreferences.getString("thu10t","null");
                teacher.setText(thu10t);
            }else if ("19:25-20:10".equals(timee)){
                thu11 = sharedPreferences.getString("thu11","null");
                course.setText(thu11);
                thu11t = sharedPreferences.getString("thu11t","null");
                teacher.setText(thu11t);
            }else if ("20:20-21:05".equals(timee)){
                thu12 = sharedPreferences.getString("thu12","null");
                course.setText(thu12);
                thu12t = sharedPreferences.getString("thu12t","null");
                teacher.setText(thu12t);
            }

        }else if ("Friday".equals(day)){
            if ("8:30-9:15".equals(timee)){
                fri1 = sharedPreferences.getString("fri1","null");
                course.setText(fri1);
                fri1t = sharedPreferences.getString("fri1t","null");
                teacher.setText(fri1t);
            }else if ("9:25-10:10".equals(timee)){
                fri2 = sharedPreferences.getString("fri2","null");
                course.setText(fri2);
                fri2t = sharedPreferences.getString("fri2t","null");
                teacher.setText(fri2t);
            }else if ("10:20-11:05".equals(timee)){
                fri3 = sharedPreferences.getString("fri3","null");
                course.setText(fri3);
                fri3t = sharedPreferences.getString("fri3t","null");
                teacher.setText(fri3t);
            }else if ("11:15-12:00".equals(timee)){
                fri4 = sharedPreferences.getString("fri4","null");
                course.setText(fri4);
                fri4t = sharedPreferences.getString("fri4t","null");
                teacher.setText(fri4t);
            }else if ("13:00-13:45".equals(timee)){
                fri5 = sharedPreferences.getString("fri5","null");
                course.setText(fri5);
                fri5t = sharedPreferences.getString("fri5t","null");
                teacher.setText(fri5t);
            }else if ("13:55-14:40".equals(timee)){
                fri6 = sharedPreferences.getString("fri6","null");
                course.setText(fri6);
                fri6t = sharedPreferences.getString("fri6t","null");
                teacher.setText(fri6t);
            }else if ("14:50-15:35".equals(timee)){
                fri7 = sharedPreferences.getString("fri7","null");
                course.setText(fri7);
                fri7t = sharedPreferences.getString("fri7t","null");
                teacher.setText(fri7t);
            }else if ("15:45-16:30".equals(timee)){
                fri8 = sharedPreferences.getString("fri8","null");
                course.setText(fri8);
                fri8t = sharedPreferences.getString("fri8t","null");
                teacher.setText(fri8t);
            }else if ("16:40-17:25".equals(timee)){
                fri9 = sharedPreferences.getString("fri9","null");
                course.setText(fri9);
                fri9t = sharedPreferences.getString("fri9t","null");
                teacher.setText(fri9t);
            }else if ("18:30-19:15".equals(timee)){
                fri10 = sharedPreferences.getString("fri10","null");
                course.setText(fri10);
                fri10t = sharedPreferences.getString("fri10t","null");
                teacher.setText(fri10t);
            }else if ("19:25-20:10".equals(timee)){
                fri11 = sharedPreferences.getString("fri11","null");
                course.setText(fri11);
                fri11t = sharedPreferences.getString("fri11t","null");
                teacher.setText(fri11t);
            }else if ("20:20-21:05".equals(timee)){
                fri12 = sharedPreferences.getString("fri12","null");
                course.setText(fri12);
                fri12t = sharedPreferences.getString("fri12t","null");
                teacher.setText(fri12t);
            }

        }

    }

    public void save(View btn){

        course = findViewById(R.id.course);
        teacher = findViewById(R.id.teacher);
        String cname = course.getText().toString();
        String cteacher = teacher.getText().toString();
        Intent intent = getIntent();

        intent.putExtra("name",cname);
        intent.putExtra("teacher",cteacher);
        setResult(1,intent);

        finish();
    }
}
