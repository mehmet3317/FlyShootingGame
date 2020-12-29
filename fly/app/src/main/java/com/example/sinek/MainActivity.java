package com.example.sinek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SyncStatusObserver;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //MainActivity activity;

    Animation animation = new AlphaAnimation(1, 0); //to change visibility from visible to invisible

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    int sayi;
    TextView Score;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity = this;

        tanımla();

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn10.setVisibility(View.INVISIBLE);
        btn11.setVisibility(View.INVISIBLE);
        btn12.setVisibility(View.INVISIBLE);

        animation1();


        Thread MyThread = new Thread() {

            public void run() {

                while (true) {
                    try {
                        sleep(750);
                        sinekler();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    animation.cancel();
                    buttons();
                    Score.post(new Runnable() {
                        public void run() {
                            String skor = String.valueOf(score);
                            String skorr= "Score: "+skor;
                            Score.setText(skorr);
                        }
                    });
                }
            }
        };
        MyThread.start();
    }

    public void buttons() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                animation.cancel();

            }
        });
    }
    public void animation1() {

        animation.setDuration(4000); //1 second duration for each animation cycle
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); //repeating indefinitely
        animation.setRepeatMode(Animation.REVERSE); //animation will start from end point once ended.
    }

    public void sinekler() {

        sayi = (int) (1 + Math.random() *12);
        if (sayi == 1) {
            btn1.startAnimation(animation); //to start animation
        } else if (sayi == 2) {
            btn2.startAnimation(animation); //to start animation
        } else if (sayi == 3) {
            btn3.startAnimation(animation); //to start animation
        } else if (sayi == 4) {
            btn4.startAnimation(animation); //to start animation
        } else if (sayi == 5) {
            btn5.startAnimation(animation); //to start animation
        } else if (sayi == 6) {
            btn6.startAnimation(animation); //to start animation
        } else if (sayi == 7) {
            btn7.startAnimation(animation); //to start animation
        } else if (sayi == 8) {
            btn8.startAnimation(animation); //to start animation
        } else if (sayi == 9) {
            btn9.startAnimation(animation); //to start animation
        } else if (sayi == 10) {
            btn10.startAnimation(animation); //to start animation
        } else if (sayi == 11) {
            btn11.startAnimation(animation); //to start animation
        } else if (sayi == 12) {
            btn12.startAnimation(animation); //to start animation
        }

        //animation.cancel();
    }

    public void tanımla() {

        Score = findViewById(R.id.score);

        btn1 = findViewById(R.id.res1);
        btn2 = findViewById(R.id.res2);
        btn3 = findViewById(R.id.res3);
        btn4 = findViewById(R.id.res4);
        btn5 = findViewById(R.id.res5);
        btn6 = findViewById(R.id.res6);
        btn7 = findViewById(R.id.res7);
        btn8 = findViewById(R.id.res8);
        btn9 = findViewById(R.id.res9);
        btn10 = findViewById(R.id.res10);
        btn11 = findViewById(R.id.res11);
        btn12 = findViewById(R.id.res12);
    }
}

