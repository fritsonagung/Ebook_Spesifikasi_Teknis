package id.co.telkom.ebookspesifikasiteknis.ui.OverviewFTTH;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OverviewFTTHViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OverviewFTTHViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is overview ftth fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}