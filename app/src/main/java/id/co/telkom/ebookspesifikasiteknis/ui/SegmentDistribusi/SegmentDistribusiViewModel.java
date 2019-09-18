package id.co.telkom.ebookspesifikasiteknis.ui.SegmentDistribusi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SegmentDistribusiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SegmentDistribusiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is segment distribusi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}