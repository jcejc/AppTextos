package android.usuario.apptextos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAbrir = (Button) findViewById(R.id.btAbrir);
        btAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,Tela.class);
                startActivity(i);
            }
        });

    }

    public void onClick(View view){
        Intent i = new Intent( MainActivity.this,CalcActivity.class);
        startActivity(i);
    }
}

