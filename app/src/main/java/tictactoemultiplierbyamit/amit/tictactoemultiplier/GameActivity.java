package tictactoemultiplierbyamit.amit.tictactoemultiplier;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    HashMap<String, String> boxFilled = new HashMap<String, String>();

    String user1 = "";
    String user2 = "";

    int count = 0;

    boolean isCompute = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        Intent intent = getIntent();
        user1 = intent.getStringExtra("UserOne");
        user2 = intent.getStringExtra("UserTwo");
        isCompute = intent.getBooleanExtra("Computer", false);

        TextView us1 = findViewById(R.id.user_01);
        us1.setText(user1+" (X)");
        TextView us2 = findViewById(R.id.user_02);
        us2.setText(user2+" (O)");

        TextView b_00 = findViewById(R.id.game_00);
        TextView b_01 = findViewById(R.id.game_01);
        TextView b_02 = findViewById(R.id.game_02);
        TextView b_10 = findViewById(R.id.game_10);
        TextView b_11 = findViewById(R.id.game_11);
        TextView b_12 = findViewById(R.id.game_12);
        TextView b_20 = findViewById(R.id.game_20);
        TextView b_21 = findViewById(R.id.game_21);
        TextView b_22 = findViewById(R.id.game_22);


        b_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("00")) {
                    if (count % 2 == 0) {
                        boxFilled.put("00", "X");
                        b_00.setText("X");
                        b_00.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("00", "O");
                        b_00.setText("O");
                        b_00.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("01")) {
                    if (count % 2 == 0) {
                        boxFilled.put("01", "X");
                        b_01.setText("X");
                        b_01.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("01", "O");
                        b_01.setText("O");
                        b_01.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();


                }
            }
        });
        b_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("02")) {
                    if (count % 2 == 0) {
                        boxFilled.put("02", "X");
                        b_02.setText("X");
                        b_02.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("02", "O");
                        b_02.setText("O");
                        b_02.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("10")) {
                    if (count % 2 == 0) {
                        boxFilled.put("10", "X");
                        b_10.setText("X");
                        b_10.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("10", "O");
                        b_10.setText("O");
                        b_10.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("11")) {
                    if (count % 2 == 0) {
                        boxFilled.put("11", "X");
                        b_11.setText("X");
                        b_11.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("11", "O");
                        b_11.setText("O");
                        b_10.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("12")) {
                    if (count % 2 == 0) {
                        boxFilled.put("12", "X");
                        b_12.setText("X");
                        b_12.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("12", "O");
                        b_12.setText("O");
                        b_12.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("20")) {
                    if (count % 2 == 0) {
                        boxFilled.put("20", "X");
                        b_20.setText("X");
                        b_20.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("20", "O");
                        b_20.setText("O");
                        b_20.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("21")) {
                    if (count % 2 == 0) {
                        boxFilled.put("21", "X");
                        b_21.setText("X");
                        b_21.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("21", "O");
                        b_21.setText("O");
                        b_21.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });
        b_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!boxFilled.containsKey("22")) {
                    if (count % 2 == 0) {
                        boxFilled.put("22", "X");
                        b_22.setText("X");
                        b_22.setTextColor(Color.parseColor("#0148A4"));
                    } else {
                        boxFilled.put("22", "O");
                        b_22.setText("O");
                        b_22.setTextColor(Color.parseColor("#0F9D58"));
                    }

                    count++;
                    if (isValid()) {
                        if ((count - 1) % 2 == 0) winner("X");
                        else winner("O");
                    } else if (isFinish()) noWinner();
                    else if (isCompute) compute();

                }
            }
        });


    }

    private void noWinner() {

       no_win();

    }

    private void compute() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Your task it will execute at 1 time only...
                compute_helper();
            }
        }, 2000);//
    }

    private void compute_helper() {


        HashMap<Integer, String> compute = new HashMap<Integer, String>();
        int amit = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String a = String.valueOf(i) + String.valueOf(j);
                if (!boxFilled.containsKey(a)) {
                    compute.put(amit, a);
                    amit++;
                }
            }
        }

        Random rand = new Random();
        int random_integer = rand.nextInt(amit);

        if (count % 2 == 0) {
            boxFilled.put(compute.get(random_integer), "X");
            String temp = "game_" + String.valueOf(compute.get(random_integer));
            int resID = getResources().getIdentifier(temp, "id", getPackageName());
            TextView txt = findViewById(resID);
            txt.setText("X");
            txt.setTextColor(Color.parseColor("#0148A4"));

        } else {
            boxFilled.put(compute.get(random_integer), "O");
            String temp = "game_" + String.valueOf(compute.get(random_integer));
            int resID = getResources().getIdentifier(temp, "id", getPackageName());
            TextView txt = findViewById(resID);
            txt.setText("O");
            txt.setTextColor(Color.parseColor("#0F9D58"));
        }

        if (isValid()) {
            if (count % 2 == 0) winner("X");
            else winner("O");
        }

        count++;

    }

    private boolean isFinish() {

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String a = String.valueOf(i) + String.valueOf(j);
                if (boxFilled.containsKey(a)) cnt++;
            }
        }

        return cnt == 9;
    }

    private void winner(String x) {

        if(x.equals("X")) x_win();
        else o_win();

    }

    private Boolean isValid() {

        //Row Wise
        for (int i = 0; i < 3; i++) {
            int cnt = 1;
            for (int j = 1; j < 3; j++) {
                String a = String.valueOf(i) + String.valueOf(j - 1);
                String b = String.valueOf(i) + String.valueOf(j);
                if (boxFilled.containsKey(a) && boxFilled.containsKey(b) && Objects.equals(boxFilled.get(a), boxFilled.get(b))) {
                    cnt++;
                }
            }
            if (cnt == 3) return true;
        }

        //Column Wise
        for (int i = 0; i < 3; i++) {
            int cnt = 1;
            for (int j = 1; j < 3; j++) {
                String a = String.valueOf(j - 1) + String.valueOf(i);
                String b = String.valueOf(j) + String.valueOf(i);
                if (boxFilled.containsKey(a) && boxFilled.containsKey(b) && Objects.equals(boxFilled.get(a), boxFilled.get(b))) {
                    cnt++;
                }
            }
            if (cnt == 3) return true;
        }

        //Diagonal
        String a = "00", b = "11", c = "22";
        String d = "02", e = "11", f = "20";

        if (boxFilled.containsKey(a) && boxFilled.containsKey(b) && boxFilled.containsKey(c) &&
                Objects.equals(boxFilled.get(a), boxFilled.get(b)) && Objects.equals(boxFilled.get(b), boxFilled.get(c))) {
            return true;
        }

        if (boxFilled.containsKey(d) && boxFilled.containsKey(e) && boxFilled.containsKey(f) &&
                Objects.equals(boxFilled.get(d), boxFilled.get(e)) && Objects.equals(boxFilled.get(e), boxFilled.get(f))) {
            return true;
        }


        return false;

    }


    private void x_win() {

        Dialog dialog;
        //Create the Dialog here
        dialog = new Dialog(GameActivity.this);
        dialog.setContentView(R.layout.x_win);
        dialog.getWindow().setBackgroundDrawable(GameActivity.this.getDrawable(R.drawable.custom_dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        TextView txt = dialog.findViewById(R.id.textView);
        txt.setText(user1+" Win");

        Button Okay = dialog.findViewById(R.id.btn_okay);
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent loginIntent = new Intent (GameActivity.this, MainActivity.class  );
                loginIntent.addFlags ( Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity ( loginIntent );
                finish ();

            }
        });
        dialog.show();
    }

    private void o_win() {

        Dialog dialog;
        //Create the Dialog here
        dialog = new Dialog(GameActivity.this);
        dialog.setContentView(R.layout.o_win);
        dialog.getWindow().setBackgroundDrawable(GameActivity.this.getDrawable(R.drawable.custom_dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog
        TextView txt = dialog.findViewById(R.id.textView);
        txt.setText(user2+" Win");
        Button Okay = dialog.findViewById(R.id.btn_okay);
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent loginIntent = new Intent (GameActivity.this, MainActivity.class  );
                loginIntent.addFlags ( Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity ( loginIntent );
                finish ();

            }
        });
        dialog.show();
    }


    private void no_win() {

        Dialog dialog;
        //Create the Dialog here
        dialog = new Dialog(GameActivity.this);
        dialog.setContentView(R.layout.no_win);
        dialog.getWindow().setBackgroundDrawable(GameActivity.this.getDrawable(R.drawable.custom_dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog


        Button Okay = dialog.findViewById(R.id.btn_okay);
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent loginIntent = new Intent (GameActivity.this, MainActivity.class  );
                loginIntent.addFlags ( Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity ( loginIntent );
                finish ();

            }
        });
        dialog.show();
    }


    }



