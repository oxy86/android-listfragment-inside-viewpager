package gr.iefimerida.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


import gr.iefimerida.adapters.CustomArrayAdapter;
import gr.iefimerida.app.R;



/**
 * A custom list fragment extending a ListFragment
 */
public class CustomListFragment extends ListFragment {
	//Activity mActivity;
	private CustomArrayAdapter myCustomArrayAdapter;
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	public CustomListFragment() {
	}

	
	@Override
	public void onAttach(Activity activity){
	    super.onAttach(activity);
	  //  Activity mActivity = activity;
	}
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
	


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_dummy,
				container, false);

		return rootView;
	}
	
	  @Override
	  public void onActivityCreated(Bundle savedInstanceState) {
	    super.onActivityCreated(savedInstanceState);

	    //load data
	    String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
	        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	        "Linux", "OS/2", "Ubuntu", "PowerOS" };

	    myCustomArrayAdapter = new CustomArrayAdapter( getActivity(), R.layout.list_row, values) ;
	    
	    setListAdapter( myCustomArrayAdapter );
	  }


	  @Override
	  public void onListItemClick(ListView l, View v, int position, long id) {
	    // do something with the data when the user clicks
			    String item = (String) getListAdapter().getItem(position);
			    Toast.makeText( getActivity(), item , Toast.LENGTH_LONG).show();

	  }
}

