package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class GuestList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_list);

        ArrayList<Contact> contacts_club_01 = new ArrayList<>();
        ArrayList<Contact> contacts_club_02 = new ArrayList<>();
        ArrayList<Contact> contacts_club_03 = new ArrayList<>();
        ArrayList<Contact> contacts_club_04 = new ArrayList<>();

        // TODO: get images and names

        contacts_club_01.add(new Contact(this, R.drawable.face_01, getString(R.string.name_01)));
        contacts_club_01.add(new Contact(this, R.drawable.face_02, getString(R.string.name_02)));
        contacts_club_01.add(new Contact(this, R.drawable.face_03, getString(R.string.name_03)));
        contacts_club_02.add(new Contact(this, R.drawable.face_04, getString(R.string.name_01)));
        contacts_club_02.add(new Contact(this, R.drawable.face_05, getString(R.string.name_02)));
        contacts_club_03.add(new Contact(this, R.drawable.face_06, getString(R.string.name_03)));
        contacts_club_03.add(new Contact(this, R.drawable.face_07, getString(R.string.name_01)));
        contacts_club_03.add(new Contact(this, R.drawable.face_08, getString(R.string.name_02)));
        contacts_club_03.add(new Contact(this, R.drawable.face_09, getString(R.string.name_03)));
        contacts_club_03.add(new Contact(this, R.drawable.face_10, getString(R.string.name_01)));
        contacts_club_03.add(new Contact(this, R.drawable.face_11, getString(R.string.name_02)));
        contacts_club_03.add(new Contact(this, R.drawable.face_12, getString(R.string.name_03)));
        contacts_club_04.add(new Contact(this, R.drawable.face_13, getString(R.string.name_01)));

        int[] gridIds = { R.id.gridClub_01, R.id.gridClub_02, R.id.gridClub_03, R.id.gridClub_04 };

        // TODO

        ArrayList<ArrayList<Contact>> contact_all_clubs = new ArrayList<>();
        contact_all_clubs.add(contacts_club_01);
        contact_all_clubs.add(contacts_club_02);
        contact_all_clubs.add(contacts_club_03);
        contact_all_clubs.add(contacts_club_04);

        for (int i = 0; i < contact_all_clubs.size(); i++)
        {

            ArrayList<Contact> contacts = contact_all_clubs.get(i);
            GridLayout grid = (GridLayout) findViewById(gridIds[i]);
            for (Contact contact : contacts)
            {
                grid.addView(contact.getVerticalLayout());
            }

        }
    }

}
