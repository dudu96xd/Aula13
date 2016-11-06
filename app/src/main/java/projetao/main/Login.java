package projetao.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    public final static String EXTRA_MESSAGE =
            "projetao.main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view)
    {
        //agencia
        Intent intent = new Intent(this, LoginActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //conta
        editText = (EditText) findViewById(R.id.editText3);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //senha
        editText = (EditText) findViewById(R.id.editText2);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
