package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.m */
public abstract class C31320m<S> extends Fragment {

    /* renamed from: a */
    public final LinkedHashSet<C31319l<S>> f75488a = new LinkedHashSet<>();

    /* renamed from: I0 */
    public boolean mo89310I0(C31319l<S> lVar) {
        return this.f75488a.add(lVar);
    }

    /* renamed from: J0 */
    public void mo89460J0() {
        this.f75488a.clear();
    }

    /* renamed from: K0 */
    public abstract DateSelector<S> mo89311K0();

    /* renamed from: L0 */
    public boolean mo89461L0(C31319l<S> lVar) {
        return this.f75488a.remove(lVar);
    }
}
