package example.com.html5gametemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class GameActivity extends Activity {

    // Alter these for your game!
    private final boolean FULL_SCREEN = true;
    private final String GAME_URL = "http://www.example.com";

    private WebView gameView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setFullScreenContentView();

//        Get the WebView we want to manipulate from the XML
        gameView = (WebView) this.findViewById(R.id.webView);

//        Override the WebViewClient to prevent the device from opening the wep page outside of the app
        gameView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });

//        Get the WebView's Settings and Enable Javascript
        webSettings = gameView.getSettings();
        webSettings.setJavaScriptEnabled(true);


//        Load the URL of the game we want to play
        gameView.loadUrl(GAME_URL);


    }

    /**
     * Used with the final FULL_SCREEN variable to determine if you want the screen to appear full screen or not.
     */
    public void setFullScreenContentView(){
        if(FULL_SCREEN){
            // Remove title bar
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);

            // Remove notification bar
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

            // Set content view AFTER ABOVE sequence (to avoid crash)
            this.setContentView(R.layout.activity_game);
        }else{
            // Nothing needs to be removed, set the content view
            this.setContentView(R.layout.activity_game);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
