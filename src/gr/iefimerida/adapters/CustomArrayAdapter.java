package gr.iefimerida.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import gr.iefimerida.app.R;


public class CustomArrayAdapter extends ArrayAdapter<String> {
	  private final Context context;
	  private final String[] values;

	  public CustomArrayAdapter(Context context, int resource, String[] values) {
	    super(context, resource, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.list_row, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
	    textView.setText(values[position]);
	    // Change the icon for Windows and iPhone
	    String s = values[position];
	    if (s.startsWith("iPhone")) {
	      imageView.setImageResource(android.R.drawable.star_on);
	    } else {
	      imageView.setImageResource(android.R.drawable.star_off);
	    }

	    return rowView;
	  }
	} 
