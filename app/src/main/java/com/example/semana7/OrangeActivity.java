package com.example.semana7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrangeActivity extends AppCompatActivity {
    Button butonOrange;
    TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orange);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        butonOrange= findViewById(R.id.btnRegresarOrange);

        butonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar MainActivity
                Intent intent1 = new Intent(OrangeActivity.this, MainActivity.class);
                // Iniciar la actividad principal
                startActivity(intent1);
                // Finalizar esta actividad (OrangeActivity) si deseas que al regresar a MainActivity, esta actividad se cierre
                finish();
            }
        });

        Bundle extras = getIntent().getExtras();
        String txt=(String)extras.get("DATA_FRASES_CELEBRES");
        txtData=findViewById(R.id.txtDataOrange);
        txtData.setText(txt);
    }
}