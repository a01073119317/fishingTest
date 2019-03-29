package com.example.fishingtest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button B_end;
    Button B9;
    FrameLayout Framemain;
    Button B_menu;
    int abc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B_end = (Button) findViewById(R.id.B_end);
        B9 = (Button) findViewById(R.id.B9);
        Framemain = (FrameLayout) findViewById(R.id.Framemain);

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffe();
            }
        });
        B_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 showMessage();
            }
        });

        B_menu = (Button) findViewById(R.id.B_menu);


        Button button = (Button) findViewById(R.id.B7);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.preparation); //  <<---preparation.xml을 보여주긴 함

                //LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //inflater.inflate(R.layout.preparation, Framemain, true);

            }
        });



//        B_menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, menu_Activity.class);
//            }
//        });
        // 메뉴 버튼 누르면 액티비티 전환 구현 실패 19.03.23

    }



    public void coffe() {
        AlertDialog.Builder givemecoffe = new AlertDialog.Builder(this);
        givemecoffe.setTitle("후원");
        givemecoffe.setMessage("목마른 개발자에게 커피값 후원을 통해 응원해주세요\n\n농협 352-0416-6629-93 김민준 :)");
        givemecoffe.setIcon(android.R.drawable.ic_dialog_alert);

        AlertDialog dialog = givemecoffe.create();
        dialog.show();
    }

     public void showMessage() {


         AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setTitle("안내?");
         builder.setMessage("종료하시겠습니까?");
         builder.setIcon(android.R.drawable.ic_menu_call);

         builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Snackbar.make(B_end,"예 버튼 눌림",Snackbar.LENGTH_LONG).show();
             }
         });

         builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Snackbar.make(B_end,"아니 버튼 눌림",Snackbar.LENGTH_LONG).show();

             }
         });

         AlertDialog dialog = builder.create();
         dialog.show();

    }
}
