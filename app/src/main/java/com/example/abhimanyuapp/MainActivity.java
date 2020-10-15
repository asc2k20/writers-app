package com.example.abhimanyuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=(TextView)findViewById(R.id.text2);
        String poly = " This section describes how to build a simple Android app. First, you learn how to create a \"Hello, World!\" project with Android Studio and run it. Then, you create a new interface for the app that takes user input and switches to a new screen in the app to display it.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Before you start, there are two fundamental concepts that you need to understand about Android apps: how they provide multiple entry points, and how they adapt to different devices.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Apps provide multiple entry points\n" +
                "\n" +
                "\n" +
                "\n" +
                "Android apps are built as a combination of components that can be invoked individually. For example, an activity is a type of app component that provides a user interface (UI).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The \"main\" activity starts when the user taps your app's icon. You can also direct the user to an activity from elsewhere, such as from a notification or even from a different app.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Other components, such as broadcast receivers and services, allow your app to perform background tasks without a UI.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "After you build your first app, you can learn more about the other app components at Application fundamentals.\n";

        textview.setText(poly);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}
