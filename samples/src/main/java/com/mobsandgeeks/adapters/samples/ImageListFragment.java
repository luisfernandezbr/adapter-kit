package com.mobsandgeeks.adapters.samples;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mobsandgeeks.adapters.InstantAdapter;

/**
 * Shows simple listview based on {@link com.mobsandgeeks.adapters.InstantAdapter}
 * 
 * @author Kapil
 * 
 */
public class ImageListFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.list_fragment, container, false);

		InstantAdapter<ImageBook> bookListAdapter = new InstantAdapter<ImageBook>(
				this.getActivity(), R.layout.list_image_layout, ImageBook.class,
				BooksDAO.getAllBooksWithImages());

		ListView bookListView = (ListView) view.findViewById(R.id.list);
		bookListView.setAdapter(bookListAdapter);

		return view;
	}
}
