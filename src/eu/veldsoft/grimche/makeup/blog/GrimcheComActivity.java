package eu.veldsoft.grimche.makeup.blog;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class GrimcheComActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grimche_com_activity);

		/*
		 * Activate JavaScript.
		 */
		((WebView) findViewById(R.id.blog)).getSettings().setJavaScriptEnabled(
				true);

		/*
		 * Load blog web page.
		 */
		((WebView) findViewById(R.id.blog))
				.loadUrl("http://grimche.com/");
	}
}
