package gui.ceng.mu.edu.moviebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import gui.ceng.mu.edu.moviebrowser.placeholder.OnMovieSelected;

public class MainActivity extends AppCompatActivity implements OnMovieSelected {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}