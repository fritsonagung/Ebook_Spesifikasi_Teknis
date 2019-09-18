package id.co.telkom.ebookspesifikasiteknis.ui.SegmentDrop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SegmentDropViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SegmentDropViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is segment drop fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}