package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.maps.m */
public class C30566m extends Fragment {

    /* renamed from: a */
    public final C30610n0 f72986a = new C30610n0(this);

    @C0359n0
    /* renamed from: J0 */
    public static C30566m m122980J0() {
        return new C30566m();
    }

    @C0359n0
    /* renamed from: K0 */
    public static C30566m m122981K0(@C0363p0 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        C30566m mVar = new C30566m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        mVar.setArguments(bundle);
        return mVar;
    }

    /* renamed from: I0 */
    public void mo86279I0(@C0359n0 C30453h hVar) {
        C40843u.m166197g("getStreetViewPanoramaAsync() must be called on the main thread");
        C40843u.m166203m(hVar, "callback must not be null.");
        this.f72986a.mo86703w(hVar);
    }

    public void onActivityCreated(@C0363p0 Bundle bundle) {
        ClassLoader classLoader = C30566m.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@C0359n0 Activity activity) {
        super.onAttach(activity);
        C30610n0.m123333v(this.f72986a, activity);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f72986a.mo134798d(bundle);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        return this.f72986a.mo134799e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f72986a.mo134800f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f72986a.mo134801g();
        super.onDestroyView();
    }

    public void onInflate(@C0359n0 Activity activity, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C30610n0.m123333v(this.f72986a, activity);
            this.f72986a.mo134802h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f72986a.mo134803i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f72986a.mo134804j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f72986a.mo134805k();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        ClassLoader classLoader = C30566m.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f72986a.mo134806l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f72986a.mo134807m();
    }

    public void onStop() {
        this.f72986a.mo134808n();
        super.onStop();
    }

    public void setArguments(@C0363p0 Bundle bundle) {
        super.setArguments(bundle);
    }
}
