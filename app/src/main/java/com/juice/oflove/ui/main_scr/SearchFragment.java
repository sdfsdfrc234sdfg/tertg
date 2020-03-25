package com.juice.oflove.ui.main_scr;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.juice.oflove.App;
import com.juice.oflove.R;
import com.juice.oflove.databinding.FragmentSearchBinding;
import com.juice.oflove.ui.main_scr.adapters.SearchRvAdapter;
import com.juice.oflove.util.AppData;


public class SearchFragment extends Fragment implements SearchRvAdapter.Interactor {

    FragmentSearchBinding binding;
    private AppData appData = App.getInstance().getAppData();
    private SearchRvAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (adapter == null) {
            adapter = new SearchRvAdapter(appData.searchList, this);
        }

        binding.searchRv.setAdapter(adapter);
        //binding.searchRv.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.searchRv.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
    }

    @Override
    public void interact(int id) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        Navigation.findNavController(getView()).navigate(R.id.action_mainFragment_to_profileFragment, bundle);
    }
}
