package id.co.telkom.ebookspesifikasiteknis;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_RecyclerView_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_Thumbnail_Item;
import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;


public class MenuUtama  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    private RecyclerView rvThumb1,rvThumb2;
    private ArrayList<Model_Thumbnail> list;
    private ImageButton viewall, viewall2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        rvThumb1= findViewById(R.id.rv_jadwal_shalat);
        rvThumb2 = findViewById(R.id.rv2_jadwal_shalat);
        rvThumb1.setHasFixedSize(true);
        rvThumb2.setHasFixedSize(true);

        //Implementasi dan memanggil data ArrayList
        list = new ArrayList<>();
        list.addAll(Adapter_Thumbnail_Item.getListData());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        viewall = findViewById(R.id.arrow1);

        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, NextActivity.class);
                startActivity(intent);
            }
        });

        viewall2 = findViewById(R.id.arrow2);

        viewall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, NextActivity.class);
                startActivity(intent);
            }
        });

        showRecyclerListThumbnail();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_about) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showRecyclerListThumbnail() {

        rvThumb1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Adapter_RecyclerView_Thumbnail listSolat = new Adapter_RecyclerView_Thumbnail(this);
        rvThumb2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Adapter_RecyclerView_Thumbnail list2Solat = new Adapter_RecyclerView_Thumbnail(this);
        listSolat.setListSolat(list);
        list2Solat.setListSolat(list);
        rvThumb1.setAdapter(listSolat);
        rvThumb2.setAdapter(listSolat);
    }

}
