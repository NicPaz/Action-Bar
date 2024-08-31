package com.example.exercicio6;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.act_add){
            Toast.makeText(this,R.string.act_add, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.act_delete){
            Toast.makeText(this,R.string.act_delete, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.act_edit){
            Toast.makeText(this,R.string.act_edit, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.act_help){
            Toast.makeText(this,R.string.act_help, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}