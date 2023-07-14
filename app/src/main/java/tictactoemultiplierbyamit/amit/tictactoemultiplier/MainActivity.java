package tictactoemultiplierbyamit.amit.tictactoemultiplier;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button playervscomputer,playervsplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playervscomputer = findViewById(R.id.playervscomputer);
        playervscomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayerVsComputer();
            }
        });

        playervsplayer = findViewById(R.id.playervsplayer);
        playervsplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayerVsPlayer();
            }
        });

    }

    private void PlayerVsComputer() {

        Dialog dialog;
        //Create the Dialog here
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.playervscomputer);
        dialog.getWindow().setBackgroundDrawable(MainActivity.this.getDrawable(R.drawable.custom_dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        EditText editText = dialog.findViewById(R.id.user_name);



        Button Okay = dialog.findViewById(R.id.btn_okay);
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                String st = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this,GameActivity.class);
                intent.putExtra("UserOne",st);
                intent.putExtra("UserTwo","Computer");
                intent.putExtra("Computer",true);
                startActivity(intent);

            }
        });
        dialog.show();

    }

    private void PlayerVsPlayer() {

        Dialog dialog;
        //Create the Dialog here
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.playervsplayer);
        dialog.getWindow().setBackgroundDrawable(MainActivity.this.getDrawable(R.drawable.custom_dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        EditText editText1 = dialog.findViewById(R.id.user_name1);
        EditText editText2 = dialog.findViewById(R.id.user_name2);



        Button Okay = dialog.findViewById(R.id.btn_okay);
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                String st1 = editText1.getText().toString();
                String st2 = editText2.getText().toString();

                Intent intent = new Intent(MainActivity.this,GameActivity.class);
                intent.putExtra("UserOne",st1);
                intent.putExtra("UserTwo",st2);
                intent.putExtra("Computer",false);

                if (st1.equals("") && st2.equals("")){
                    Toast.makeText(MainActivity.this, "Enter Player Name", Toast.LENGTH_SHORT).show();
                }
                else if (st1.equals("")){
                    Toast.makeText(MainActivity.this, "Enter Player Name 1", Toast.LENGTH_SHORT).show();
                }
                else if (st2.equals("")){
                    Toast.makeText(MainActivity.this, "Enter Player Name 2", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(intent);
                }

            }
        });
        dialog.show();

    }
}