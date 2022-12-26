package n.rnu.isetr.tunisiatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class ExploreActivity extends AppCompatActivity {

    ShapeableImageView mainimage;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

         description=findViewById(R.id.tunisia_description);

         description.setText("Tunisia may be mainly known as a summer sun and sea travel destination, but off the beach there is much more to discover. In the south, the Sahara's swath of desert sand scattered with lonely oases offers landscapes of rolling dunes that are ripe for adventure tourism activities, while in the north, the ruins of ancient towns sit snug within fertile hill country and are easy historic day trips from Tunis.\n" +
                "\n" +
                "Tunisia's geographical situation laid it open from time immemorial to empire builders. The Roman amphitheater at El Djem is only the most famous of the country's historical sights, which take in Phoenician and Roman ruins, Roman and Byzantine mosaics, and Arab and Ottoman forts.\n" +
                "\n" +
                "For those who want to explore beyond its feted beaches, Tunisia's small size makes it simple to experience a mix of culture, history, and landscapes even on a short trip.");

    }
}