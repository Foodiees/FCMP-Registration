package com.example.login_fcmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DeliverActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap2;
    private GoogleMap mMap3;
    private Button takeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver);
        takeOrder=(Button)findViewById(R.id.b2);
        takeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeliverActivity.this,Role_assign.class));

            }
        });
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap2 = googleMap;
        mMap3 = googleMap;
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng Hassan = new LatLng(13.008582, 76.096635);
        mMap2.addMarker(new MarkerOptions().position(Hassan).title("Marker in Hassan in India"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLng(Hassan));

        LatLng Hassan1 = new LatLng(13.016102, 76.105823);
        mMap3.addMarker(new MarkerOptions().position(Hassan).title("Marker in Hassan in India"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLng(Hassan));
    }
}
