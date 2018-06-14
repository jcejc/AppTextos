package android.usuario.apptextos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela extends AppCompatActivity {

    EditText ct1, ct2;
    Button btCopia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        ct1 = (EditText)findViewById(R.id.ct1);
        ct2 = (EditText)findViewById(R.id.ct2);
        btCopia = (Button)findViewById(R.id.btCopia);

        btCopia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               ct2.setText(ct1.getText());
            }

        });
    }
}
