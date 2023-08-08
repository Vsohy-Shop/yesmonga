package androidx.camera.view;

import androidx.annotation.C0359n0;
import androidx.lifecycle.C19406e0;
import androidx.lifecycle.LiveData;

/* renamed from: androidx.camera.view.i */
public final class C1792i<T> extends C19406e0<T> {

    /* renamed from: n */
    public LiveData<T> f4940n;

    /* renamed from: f */
    public T mo4610f() {
        LiveData<T> liveData = this.f4940n;
        if (liveData == null) {
            return null;
        }
        return liveData.mo4610f();
    }

    /* renamed from: u */
    public void mo5940u(@C0359n0 LiveData<T> liveData) {
        LiveData<T> liveData2 = this.f4940n;
        if (liveData2 != null) {
            super.mo57571t(liveData2);
        }
        this.f4940n = liveData;
        super.mo4611s(liveData, new C1790h(this));
    }
}
