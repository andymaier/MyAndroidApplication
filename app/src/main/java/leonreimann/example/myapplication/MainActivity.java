package leonreimann.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void umrechnen(View view){
        Log.i("Info","Button wurde gedrückt");

        //hole Textfeld
        EditText editText = findViewById(R.id.editTextTextPersonName2);

        //hole den Inhalt aus dem Textfeld
        String amountInDollars = editText.getText().toString();

        //wandle von Text in Zahl um
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        //wende Umrechnungskurs an
        double amountInEuroDouble = amountInDollarsDouble * 1.2;

        //wandle Zahl in Text zurück
        String amountInEuroString = String.valueOf(amountInEuroDouble);

        //esse einen toast
        Toast.makeText(this, amountInEuroString, Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.textView2);
        textView.setText(amountInEuroString);
    }
}
