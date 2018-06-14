package android.usuario.apptextos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    EditText ctN1, ctN2;
    Button btSomar;
    TextView rtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ctN1 = (EditText) findViewById(R.id.ctN1);
        ctN2 = (EditText) findViewById(R.id.ctN2);
        rtResult = (TextView) findViewById(R.id.rtResult);
    }
    public void somar(View view){
        try {
            double n1 = Double.parseDouble(ctN1.getText().toString());
            double n2 = Double.parseDouble(ctN2.getText().toString());
            rtResult.setText(String.valueOf(n1 + n2));
        } catch (Exception e){
            Toast.makeText(getBaseContext(), "Valores invalidos nos campos", Toast.LENGTH_LONG).show();
        }
    }

    public void subtrair(View view){
        try{
            double n1 = Double.parseDouble(ctN1.getText().toString());
            double n2 = Double.parseDouble(ctN2.getText().toString());
            if (n2 > n1){
                rtResult.setText(String.valueOf(n2 - n1));
            } else{
                rtResult.setText(String.valueOf(n1 - n2));
            }
        } catch (Exception e){
            Toast.makeText(getBaseContext(), "Valores invalidos nos campos", Toast.LENGTH_LONG).show();
        }
    }

    public void multiplicar(View view){
        try{
            double n1 = Double.parseDouble(ctN1.getText().toString());
            double n2 = Double.parseDouble(ctN2.getText().toString());
                rtResult.setText(String.valueOf(n1 * n2));
        } catch (Exception e){
            Toast.makeText(getBaseContext(), "Valores invalidos nos campos", Toast.LENGTH_LONG).show();
        }
    }

    public void dividir(View view){
        try{
            double n1 = Double.parseDouble(ctN1.getText().toString());
            double n2 = Double.parseDouble(ctN2.getText().toString());

            if (n2 > 0){
                rtResult.setText(String.valueOf(n1 / n2));
            } else{
                Toast.makeText(getBaseContext(), "Impossivel dividir por Zero", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e){
            Toast.makeText(getBaseContext(), "Valores invalidos nos campos", Toast.LENGTH_LONG).show();
        }
    }
}
