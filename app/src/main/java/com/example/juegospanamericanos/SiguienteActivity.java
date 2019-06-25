package com.example.juegospanamericanos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SiguienteActivity extends AppCompatActivity {
    private Button botonSpeet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);

        botonSpeet=(Button)findViewById(R.id.button_speak);

        botonSpeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SiguienteActivity.this,SpeetActivity.class);
                SiguienteActivity.this.startActivity(intent);

            }
        });

    }
}
