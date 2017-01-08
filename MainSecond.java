package comjosim74.github.rrfoundationtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        TextView essayWritting = (TextView)findViewById(R.id.textMainSecond);

        DomesticAnimal cow = new DomesticAnimal(" cow "," 4 "," grass ");
        cow.writeEssay();

        essayWritting.setText(cow.writeEssay());



        Students st = new Students("josim", "5");
        st.getName();
        st.getRoll();
    }
}
