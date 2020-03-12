package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.LatihanAdapter;
import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.models.News;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LatihanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<News> teams =  new ArrayList<>();
        teams.add(new News( "https://1000logos.net/wp-content/uploads/2018/08/rbc-logo.png","RBC NEWS","A city living under the shadow"));
        teams.add(new News( "https://static01.nyt.com/images/2018/10/21/magazine/21mag-cover/21mag-cover-blog480.jpg","NY Times","One Problem For Democratic System"));
        teams.add(new News("https://cdn.freebiesupply.com/logos/large/2x/bbc-world-news-logo-png-transparent.png","BBC World","The golden secret to better breakfast"));
        teams.add(new News("https://images-na.ssl-images-amazon.com/images/I/61oIDqslsTL._SY355_.png","NBC Nightly","How To Plan Your First Ski Vacation"));
        teams.add(new News("https://cdn.dribbble.com/users/603228/screenshots/2315038/royalbankappicon-01.png","RBC News","How Social Isolation Is Killing Us"));
        teams.add(new News("https://cdn.freebiesupply.com/logos/large/2x/bbc-world-news-logo-png-transparent.png","BBC World","Use Labels to short message in facebook"));

        LatihanAdapter adapter =new LatihanAdapter(this,teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        teamsView.setLayoutManager(layoutManager);

    }
}
