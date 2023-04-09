package cn.edu.jnu.x2020101340;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate = this.findViewById(R.id.button_calculate);
        EditText editTextScores = this.findViewById(R.id.editText_frame_scores);
        TextView textViewScores = this.findViewById(R.id.textView_scores);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores = editTextScores.getText().toString();
                String []arrayScore = scores.split(",");
                BowlingGame game = new BowlingGame();
                for(int i = 0; i < arrayScore.length; i++)
                {
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScores.setText("Total score is:" + game.score());
            }
        });
    }
}