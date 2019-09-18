package id.co.telkom.ebookspesifikasiteknis.ui.SimulasiPowerLink;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimulasiPoweLinkViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SimulasiPoweLinkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Simulasi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}