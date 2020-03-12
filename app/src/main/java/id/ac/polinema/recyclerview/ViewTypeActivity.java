package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.adapters.ReversedLogoAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class ViewTypeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_type);
		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams =  new ArrayList<>();
		teams.add(new TeamLogo( "Liverpool","https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png"));
		teams.add(new TeamLogo( "Man. City","https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png"));
		teams.add(new TeamLogo("Juventus","https://upload.wikimedia.org/wikipedia/id/a/ad/Logo_Juventus_svg.png"));

		ReversedLogoAdapter adapter =new ReversedLogoAdapter(this,teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		teamsView.setLayoutManager(layoutManager);
	}
}
