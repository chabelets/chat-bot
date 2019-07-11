package com.example.bestapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.labiba.bot.Activities.ChatBotSplashActivity;
import com.labiba.bot.Others.Options;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(this, ChatBotSplashActivity.class));
        finish();

        Options options = new Options(this);
        options.setRecipientId("b474192c-a618-4c49-a5ee-663414fd75e5"); // Your bot id (Required)
        options.setStatusBarColor("a9a9a9"); // To change status bar color .
        options.setToolbarBackground("FFECECEC"); // To change ToolBar color .
        options.setSplashLogo("https://ImageLink.png"); // To change splash screen main logo.
    }
}
