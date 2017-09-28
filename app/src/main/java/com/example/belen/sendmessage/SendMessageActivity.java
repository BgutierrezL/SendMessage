package com.example.belen.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


/**
 * Esta clase envía un mensaje a un usuario
 *
 * @author Belen Gutierrez
 *         Conceptos aprendidos
 *         <ul>
 *         <li>Concepto Context</li>
 *         <li>Paso de parámetros mediante el objeto @see android.os.Bundle</li>
 *         <li>Paso de mensajes entre dos actividades, mediante la clase ver @see android.contentIntent</li>
 *         </ul>
 */
public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    private EditText edtUser;
    private Button btnOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) findViewById(R.id.editMessage);
        edtUser = (EditText) findViewById(R.id.editText2);
        btnOk = (Button) findViewById(R.id.btnOk);
        //1. Registrar un Listener o escuchar onClickListener
        btnOk.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         //1. Crear un obj Bundle y añadir el msj
                                         Bundle bundle = new Bundle();
                                         bundle.putString("message", edtMessage.getText().toString());
                                         bundle.putString("user", edtUser.getText().toString());
                                         //2. Crear un obj Intent
                                         Intent intent = new Intent(SendMessageActivity.this, ViewMesaggeActivity.class);
                                         intent.putExtras(bundle);
                                         //3. Iniciar la Activity ViewMessage
                                         startActivity(intent);
                                     }
                                 }
        );
    }

    /*public void getOnClick(View view){
        switch (view.getId()){
            case R.id.btnOk:
                //1. Recoger el mensaje
                //edtMessage.getText().toString();

                //2. Crear un obj Bundle y añadir el msj
                Bundle bundle= new Bundle();
                bundle.putString("message", edtMessage.getText().toString());
                bundle.putString("user", edtUser.getText().toString());

                //3. Crear un obj Intent
                Intent intent= new Intent(SendMessageActivity.this,ViewMesaggeActivity.class);

                intent.putExtras(bundle);

                //4. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }
    }*/
}
