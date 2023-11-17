package com.rio.koversivolume211220079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {
    private TextView hasilTextView;

    private static final int LITER_TO_CC_REQUEST_CODE = 1;
    private static final int LITER_TO_M_REQUEST_CODE = 2;
    private static final int LITER_TO_FT_REQUEST_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasilTextView = findViewById(R.id.hasil);
    }

    public void launchLiterToCc(View view) {
        Intent intent = new Intent(MainActivity.this, LiterToCc.class);
        startActivityForResult(intent, LITER_TO_CC_REQUEST_CODE);
    }

    public void launchLiterToM(View view) {
        Intent intent = new Intent(MainActivity.this, LiterToM3.class);
        startActivityForResult(intent, LITER_TO_M_REQUEST_CODE);
    }

    public void launchLiterToFt(View view) {
        Intent intent = new Intent(MainActivity.this, LiterToft3.class);
        startActivityForResult(intent, LITER_TO_FT_REQUEST_CODE);
    }

    public void launchTentang(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == LITER_TO_CC_REQUEST_CODE && resultCode == RESULT_OK) {
            int nilaiLiterCc = data.getIntExtra("NILAI_LITER_CC", 0);
            int hasilKonversiLiterToCc = data.getIntExtra("HASIL_KONVERSI_CC", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("HASIL : " + nilaiLiterCc + " Liter" + " Sama Dengan " + hasilKonversiLiterToCc + " CC");
            hasilTextView.setVisibility(View.VISIBLE);
        } else if (requestCode == LITER_TO_M_REQUEST_CODE && resultCode == RESULT_OK) {
            double nilaiLiterM = data.getDoubleExtra("NILAI_LITER_M", 0);
            double hasilKonversiLiterToM = data.getDoubleExtra("HASIL_KONVERSI_M", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("HASIL : " + nilaiLiterM + " Liter" + " Sama Dengan " + hasilKonversiLiterToM + " M^3");
            hasilTextView.setVisibility(View.VISIBLE);
        } else if (requestCode == LITER_TO_FT_REQUEST_CODE && resultCode == RESULT_OK) {
            double nilaiLiterFt = data.getDoubleExtra("NILAI_LITER_FT", 0);
            double hasilKonversiLiterToFt = data.getDoubleExtra("HASIL_KONVERSI_FT", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("HASIL : " + nilaiLiterFt + " Liter" + " Sama Dengan " + hasilKonversiLiterToFt + " Ft^3");
            hasilTextView.setVisibility(View.VISIBLE);
        }
    }
}