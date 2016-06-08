package liquidfish.easion.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import liquidfish.easion.R;

public class HomeScreen extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

   private static String TAG = HomeScreen.class.getSimpleName();

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }*/

    /**
     * This will be activated once an option from the optionsmenu has been tapped
     * @param item is the MenuItem tapped
     * @return
     */
   /* @Override
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
    }*/

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    /**
     * This will activate when an item in the nav_bar has been tapped
     * @param position is the position of the item in the nav_bar that has been tapped
     * To add items go to res->values->strings.xml, link the items in this function
     */
    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new HomeFragment();
                title = getString(R.string.title_home);
                break;
            case 1:
                fragment = new TaskList();
                title = getString(R.string.title_task_list);
                break;
            case 2:
                fragment = new InfoFragment();
                title = getString(R.string.title_info);
                break;
            case 3:
                CharSequence text0 = "In development";
                Toast.makeText(this, text0, Toast.LENGTH_SHORT).show();
                break;
            case 4:
                CharSequence text = "In development";
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                CharSequence text1 = "In development";
                Toast.makeText(this, text1, Toast.LENGTH_SHORT).show();
                break;
            case 6:
                CharSequence text2 = "In development";
                Toast.makeText(this, text2, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

}
