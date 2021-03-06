package ru.myitschool.appgameball02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends Activity {

    //объект нужен для открытия новых активностей и передачи между ними данных
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClick(View view){
       switch (view.getId()){
           case R.id.btn_new_game:
               //окно начала игры
               intent = new Intent(this, MainActivity.class);
               startActivity(intent);
               break;
           case R.id.btn_continue_game:
               //продолжить игру

               break;
           case R.id.btn_exit:
               //выход из игры
               finish();
               break;
       }
    }
}
