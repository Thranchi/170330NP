package kr.blogspot.httpcarelesssandbox.a170330np;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button top,mid,low,bottom;
    EditText x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init() {
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It's you.", Toast.LENGTH_SHORT).show();

            }
        });
    }






    Button.OnClickListener onClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {                               /*여기까지치면 밑에 자동*/
            Snackbar.make(v, "Message", 1000).setAction("confirm", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            }).show();
        }
    };
    //참고하기



    public void onClick(View v){
        if(v.getId()==R.id.a){
            AlertDialog.Builder dlg=new AlertDialog.Builder(this);
            dlg.setTitle("title")
                    .setMessage("info").setIcon(R.mipmap.ic_launcher).setPositiveButton("close",null)
                    .setNegativeButton("ok",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                Toast.makeText(getApplicationContext(),"yeah", Toast.LENGTH_SHORT).show();

        }});
            dlg.show();
        }
    }







}
