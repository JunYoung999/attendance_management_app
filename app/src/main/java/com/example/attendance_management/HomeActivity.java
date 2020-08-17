package com.example.attendance_management;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button btn_selfdiagnosis, btn_attendancecheck, btn_emergencycall, btn_realtimeinformation, btn_privacy, btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.home_xml);

        //자기진단 버튼을 클릭하면 자기진단화면으로 전환
        btn_selfdiagnosis=findViewById(R.id.btn_selfdaignosis2);
        btn_selfdiagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,SelfdiagnosisActivity.class);
                startActivity(intent);
            }
        });

        //출석관리 버튼을 클릭하면 출석체크화면으로 전환
        btn_attendancecheck=findViewById(R.id.btn_attendancecheck2);
        btn_attendancecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,AttendancecheckActivity.class);
                startActivity(intent);
            }
        });

        //긴급연락 버튼을 클릭하면 긴급연락화면으로 전환
        btn_emergencycall=findViewById(R.id.btn_emergenctycall2);
        btn_emergencycall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,Emergencycall.class);
                startActivity(intent);
            }
        });

        //실시간 확진자 정보를 알수 있는 사이트로 이동
        btn_realtimeinformation=findViewById(R.id.btn_realtimeinformation);
        btn_realtimeinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_sug.top&where=m&query=%EC%BD%94%EB%A1%9C%EB%82%98+%ED%99%95%EC%A7%84%EC%9E%90&acq=%EC%BD%94&acr=1&qdt=0"));
                startActivity(intent);
            }
        });

        //로그아웃 기능
        btn_logout=findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        //개인정보관리 버튼을 클릭하면 개인정보 화면으로 전환
        btn_privacy=findViewById(R.id.btn_privacy);
        btn_privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,PrivacyActivity.class);
                startActivity(intent);
            }
        });
    }
}
