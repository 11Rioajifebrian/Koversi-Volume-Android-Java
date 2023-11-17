package com.rio.koversivolume211220079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void visitInstagram(View view) {
        Uri webAdress = Uri.parse("https://instagram.com/rioajifebrian_12");
        Intent intent = new Intent(Intent.ACTION_VIEW, webAdress);
        startActivity(intent);
    }
    public void visitTelepon(View view) {
        Uri phoneNumber = Uri.parse("tel:+6281528412661");
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneNumber);
        startActivity(intent);
    }
    public void visitMaps(View view) {
        Uri latLng = Uri.parse("geo:-0.05385028525937341, 109.31396020641249");
        Intent intent = new Intent(Intent.ACTION_VIEW, latLng);
        startActivity(intent);
    }
}