package gui.ceng.mu.edu.moviebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Movie movie = getIntent().getParcelableExtra("movie");
        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        DetailsFragment df = DetailsFragment.newInstance(movie);
        fts.add(R.id.container,df);
        fts.commit();
    }

    @Override
    public void onMovieSelected(Movie movie) {

        int display_mode = getResources().getConfiguration().orientation;
        if (display_mode == Configuration.ORIENTATION_PORTRAIT) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("movie", movie);
            startActivity(intent);
        }else{
            DetailsFragment df =
                    (DetailsFragment)getSupportFragmentManager().findFragmentByTag("details");
            if (df == null) {
                FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
                df = DetailsFragment.newInstance(movie);
                fts.add(R.id.container, df, "details");
                fts.commit();
            }else{
                df.setMovie(findViewById(R.id.container), movie);
            }
        }
    }


}