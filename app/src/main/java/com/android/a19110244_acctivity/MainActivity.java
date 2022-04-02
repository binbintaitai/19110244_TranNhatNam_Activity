package com.android.a19110244_acctivity;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.thuchanh.extra.MESSAGE";
    private EditText mMessageEditText;

    EditText tienGuiEditText;
    EditText laiSuatEditText;
    EditText kiHanEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tienGuiEditText = (EditText) findViewById(R.id.tienGuiEditView);
        laiSuatEditText = (EditText) findViewById(R.id.laiGuiEditView);
        kiHanEditText = (EditText) findViewById(R.id.kyHanGuiEditText);
    }

    public void xemKetQuaClick(View view) {
        Intent intent = new Intent(this, KetQua.class);


        double soTienGui = Double.parseDouble(tienGuiEditText.getText().toString());
        double laiSuatGui = Double.parseDouble(laiSuatEditText.getText().toString());
        double kiHanGui = Double.parseDouble(kiHanEditText.getText().toString());

        double soTienLai = soTienGui * laiSuatGui * kiHanGui /12;
        soTienLai /=100;




        intent.putExtra("tienLai", Double.toString(soTienLai) );
        intent.putExtra("tongTien", Double.toString(soTienGui + soTienLai ));

        startActivity(intent);


    }

}


