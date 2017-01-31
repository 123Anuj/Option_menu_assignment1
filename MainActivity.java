package acadgild.com.option_menu_assignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        text=(TextView) findViewById(R.id.Text_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Color.parseColor("#FF0000");

        int color = 0xFFFF0000;
        if(item.getItemId()==R.id.red){
            text.setTextColor(color);
        }
        else if(item.getItemId()==R.id.blue){

            text.setTextColor(0xff0000ff);
        }
        else if(item.getItemId()==R.id.green){
             text.setTextColor(0xff00ff00);

        }
        return super.onOptionsItemSelected(item);
    }
}
