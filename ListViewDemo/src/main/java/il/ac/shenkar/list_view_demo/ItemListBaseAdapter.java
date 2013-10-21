package il.ac.shenkar.list_view_demo;


import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tomerweller on 10/21/13.
 */
public class ItemListBaseAdapter extends BaseAdapter {
    private static ArrayList<ItemDetails> itemDetailsrrayList;

    private Integer[] imgid = {
            R.drawable.p1,
            R.drawable.bb2,
            R.drawable.p2,
            R.drawable.bb5,
            R.drawable.bb6,
            R.drawable.d1
    };

    private LayoutInflater l_Inflater;

    public ItemListBaseAdapter(Context context, ArrayList<ItemDetails> results) {
        itemDetailsrrayList = results;
        l_Inflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return itemDetailsrrayList.size();
    }

    public Object getItem(int position) {
        return itemDetailsrrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = l_Inflater.inflate(R.layout.item_details_view, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.name);
            holder.tvDescription = (TextView) convertView.findViewById(R.id.itemDescription);
            holder.tcPrice = (TextView) convertView.findViewById(R.id.price);
            holder.imageView = (ImageView) convertView.findViewById(R.id.photo);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvName.setText(itemDetailsrrayList.get(position).getName());
        holder.tvDescription.setText(itemDetailsrrayList.get(position).getItemDescription());
        holder.tcPrice.setText(itemDetailsrrayList.get(position).getPrice());
        holder.imageView.setImageResource(imgid[itemDetailsrrayList.get(position).getImageNumber() - 1]);

        return convertView;
    }

    private static class ViewHolder {
        TextView tvName;
        TextView tvDescription;
        TextView tcPrice;
        ImageView imageView;
    }
}