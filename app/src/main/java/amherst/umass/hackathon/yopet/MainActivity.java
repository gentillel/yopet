package amherst.umass.hackathon.yopet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openOwnerLogin(View view){
        Intent intent = new Intent(this,OwnerLoginActivity.class);
        startActivity(intent);
    }

    public void openSitterLogin(View view){
        Intent intent = new Intent(this,SitterLoginActivity.class);
        startActivity(intent);
    }

    public  void  newUser(View view){

    }




}
