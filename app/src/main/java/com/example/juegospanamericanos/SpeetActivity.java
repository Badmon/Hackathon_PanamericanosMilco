package com.example.juegospanamericanos;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class SpeetActivity extends AppCompatActivity {
    private TextToSpeech mTTS;
    private TextToSpeech mTTS2;
    private TextToSpeech mTTS3;
    private TextToSpeech mTTS4;
    private TextToSpeech mTTSST;
    private TextToSpeech  mTTSING;

    private SeekBar mSeekBarPitch;
    private SeekBar mSeekBarSpeed;
    private Button mButtonSpeak;
    private  Button mButtonSpeak2;
    private  Button mButtonSpeak3;

    private  Button mButtonSpeak4;
    private  Button mButtonSpeakStop;
    private  Button mButtonSpeakingles;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speet_main);
        mButtonSpeak =  findViewById(R.id.button_speak);
        mButtonSpeak2=findViewById(R.id.button_speak2);
        mButtonSpeak3=findViewById(R.id.button_speak3);

        mButtonSpeak4=findViewById(R.id.button_speak4);
        mButtonSpeakStop=findViewById(R.id.button_speak4ingles);
        mButtonSpeakingles=findViewById(R.id.button_speakingles);




        mTTSING = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTSING.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeakingles.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });

        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.getDefault());

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });

        mTTS2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS2.setLanguage(Locale.getDefault());

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak2.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });

        mTTS3 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS3.setLanguage(Locale.getDefault());

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak3.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });

        mTTS4 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS4.setLanguage(Locale.getDefault());

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak4.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
        mTTSST = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTSST.setLanguage(Locale.getDefault());

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeakStop.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });


        mSeekBarPitch = findViewById(R.id.seek_bar_pitch);
        mSeekBarSpeed = findViewById(R.id.seek_bar_speed);

        mButtonSpeakingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mTTS!=null && mTTS2!=null&& mTTS3!=null && mTTS4!=null){
                    mTTS2.stop();
                    mTTS3.stop();
                    mTTS4.stop();
                    mTTS.stop();
                }
                speakIng();


            }
        });


        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mTTSING !=null&& mTTS2!=null&& mTTS3!=null && mTTS4!=null){
                    mTTS2.stop();
                    mTTS3.stop();
                    mTTS4.stop();
                    mTTSING.stop();


                }
                speak();


            }
        });


        mButtonSpeak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mTTSING !=null&& mTTS!=null && mTTS3!=null && mTTS4!=null){
                    mTTS.stop();
                    mTTS3.stop();
                    mTTS4.stop();
                    mTTSING.stop();


                }
                speak2();

            }
        });

        mButtonSpeak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTTSING !=null&& mTTS!=null && mTTS2!=null && mTTS4!=null){
                    mTTS2.stop();
                    mTTS.stop();
                    mTTS4.stop();
                    mTTSING.stop();




                }
                speak3();

            }
        });

        mButtonSpeak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTTSING !=null&& mTTS!=null && mTTS2!=null && mTTS3!=null){
                    mTTS3.stop();
                    mTTS2.stop();
                    mTTS.stop();
                    mTTSING.stop();
                }
                speak4();

            }
        });
        mButtonSpeakStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTTSING !=null&& mTTS!=null && mTTS2!=null && mTTS3!=null){
                    mTTS2.stop();
                    mTTS3.stop();
                    mTTS4.stop();
                    mTTS.stop();
                    mTTSING.stop();
                }
                speakStop();

            }
        });





    }

    private void speakIng() {

        String text = " Built around 1700, as a religious nucleus of the town of Lurín. It is a temple of colonial architecture of baroque style and has been converted into a historical monument in 1972. ";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;



        mTTSING.setPitch(pitch);
        mTTSING.setSpeechRate(speed);

        mTTSING.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


    private void speak() {

        String text = " Construida hacia 1700, como núcleo religioso del Pueblo de Lurín. Es un Templo de arquitectura colonial de estilo barroco y ha sido declarado monumento histórico en 1972. En 1998 el entonces Papa Juan Pablo II decide crear en Lima tres nuevas Diócesis de Lurín que comprende a todos los pueblos y parroquias del Cono Sur de Lima, por lo cual el antiguo Templo Rural fue elevado a la categoría de Catedral.";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;



        mTTS.setPitch(pitch);
        mTTS.setSpeechRate(speed);

        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


    private void speak2() {
        String text = " El refugio de vida silvestre de los Pantanos de Villa es un área natural protegida que se encuentra en el litoral del distrito de Chorrillos en la provincia de Lima, departamento de Lima en el Perú.";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;

        mTTS2.setPitch(pitch);
        mTTS2.setSpeechRate(speed);

        mTTS2.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    private void speak3() {
        String text = " El Parque Zona Huáscar se encuentra  en el distrito de Villa el Salvador, y es considerado el segundo parque zonal más grande de la capital.";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;

        mTTS3.setPitch(pitch);
        mTTS3.setSpeechRate(speed);

        mTTS3.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    private void speak4() {
        String text = " Villa María se alzaba uno de los sistemas de lomas más grandes de Lima, que a decir del Maestro Daniel López Mazzotti se extendía desde Pamplona hasta Pachacamác (Lomas de Lúcumo) conocido antaño como \"Las Lomas de Atocongo\". Hoy este sistema se ha reducido y queda encerrado en lo que hoy se conoce como \"Lomas de Villa María\" ó \"Lomas de Paraíso\", con repetidos intentos de convertirlo en área de conservación a fin de transformarlo en refugio de la flora y fauna silvestre (vizcachas, lechuzas, zorros, águilas, etc.).";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;

        mTTS4.setPitch(pitch);
        mTTS4.setSpeechRate(speed);

        mTTS4.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
    private void speakStop() {
        String text = " ";
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;
        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;

        mTTSST.setPitch(pitch);
        mTTSST.setSpeechRate(speed);

        mTTSST.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }


    @Override
    protected void onDestroy() {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }
}