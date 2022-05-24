package cntt.thien61134397;

import android.os.Bundle;
import android.support.appcompat.app.FloatingActionButton;
import android.support.design.widget.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    EditText chieudai, chieurong, chieucao;
    Button tinhChuVi, tinhDienTich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        chieudai = (EditText)findViewById(R.id.chieudai);
        chieurong = (EditText)findViewById(R.id.chieurong);
        chieucao = (EditText)findViewById(R.id.chieucao);
        tinhChuVi = (Button)findViewById(R.id.tinhChuVi);
        tinhDienTich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);
        tinhChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int crong = Integer.parseInt(chieurong.getText().toString());
                int kqua = (cdai + crong) * 2;
                ketqua.setText("Chu vi hình bình hành là: " + kqua);
            }
        });
        tinhDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int ccao = Integer.parseInt(chieucao.getText().toString());
                int kqua = cdai * ccao;
                ketqua.setText("Diện tích hình bình hành là: " + kqua);

            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

