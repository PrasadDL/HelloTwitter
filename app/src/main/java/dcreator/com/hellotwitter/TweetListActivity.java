package dcreator.com.hellotwitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TweetListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);
        Intent intent1= getIntent();
        TextView textView1 = (TextView) findViewById(R.id.text1);
        textView1.setText(intent1.getStringExtra("Mytext"));
    }


}
