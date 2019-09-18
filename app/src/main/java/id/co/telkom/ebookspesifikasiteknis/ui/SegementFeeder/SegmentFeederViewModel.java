package id.co.telkom.ebookspesifikasiteknis.ui.SegementFeeder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SegmentFeederViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SegmentFeederViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is segment feeder fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}