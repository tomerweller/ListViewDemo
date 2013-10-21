package il.ac.shenkar.list_view_demo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListViewImagesActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ListView listView = (ListView) findViewById(R.id.listV_main);
        listView.setAdapter(new ItemListBaseAdapter(this, getItems()));
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ItemDetails selectedItem = (ItemDetails) listView.getItemAtPosition(position);
                Toast.makeText(ListViewImagesActivity.this, "You have chosen : " + " " +
                        selectedItem.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }
    
    private ArrayList<ItemDetails> getItems(){
    	ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
    	
    	ItemDetails itemDetails = new ItemDetails();
    	itemDetails.setName("Pizza");
    	itemDetails.setItemDescription("Spicy Chiken Pizza");
    	itemDetails.setPrice("RS 310.00");
    	itemDetails.setImageNumber(1);
    	results.add(itemDetails);
    	
    	itemDetails = new ItemDetails();
    	itemDetails.setName("Burger");
    	itemDetails.setItemDescription("Beef Burger");
    	itemDetails.setPrice("RS 350.00");
    	itemDetails.setImageNumber(2);
    	results.add(itemDetails);
    	
    	itemDetails = new ItemDetails();
    	itemDetails.setName("Pizza");
    	itemDetails.setItemDescription("Chiken Pizza");
    	itemDetails.setPrice("RS 250.00");
    	itemDetails.setImageNumber(3);
    	results.add(itemDetails);
    	
    	itemDetails = new ItemDetails();
    	itemDetails.setName("Burger");
    	itemDetails.setItemDescription("Chicken Burger");
    	itemDetails.setPrice("RS 350.00");
    	itemDetails.setImageNumber(4);
    	results.add(itemDetails);
    	
    	itemDetails = new ItemDetails();
    	itemDetails.setName("Burger");
    	itemDetails.setItemDescription("Fish Burger");
    	itemDetails.setPrice("RS 310.00");
    	itemDetails.setImageNumber(5);
    	results.add(itemDetails);
    	
    	itemDetails = new ItemDetails();
    	itemDetails.setName("Mango");
    	itemDetails.setItemDescription("Mango Juice");
    	itemDetails.setPrice("RS 250.00");
    	itemDetails.setImageNumber(6);
    	results.add(itemDetails);
    	
    	
    	return results;
    }
}