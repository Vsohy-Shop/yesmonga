package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;

@TargetApi(11)
/* renamed from: com.google.android.gms.maps.l */
public class C30563l extends Fragment {

    /* renamed from: a */
    public final C30442d0 f72983a = new C30442d0(this);

    @C0359n0
    /* renamed from: b */
    public static C30563l m122975b() {
        return new C30563l();
    }

    @C0359n0
    /* renamed from: c */
    public static C30563l m122976c(@C0363p0 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        C30563l lVar = new C30563l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        lVar.setArguments(bundle);
        return lVar;
    }

    /* renamed from: a */
    public void mo86264a(@C0359n0 C30453h hVar) {
        C40843u.m166197g("getStreetViewPanoramaAsync() must be called on the main thread");
        C40843u.m166203m(hVar, "callback must not be null.");
        this.f72983a.mo85975w(hVar);
    }

    public void onActivityCreated(@C0363p0 Bundle bundle) {
        ClassLoader classLoader = C30563l.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@C0359n0 Activity activity) {
        super.onAttach(activity);
        C30442d0.m122446v(this.f72983a, activity);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f72983a.mo134798d(bundle);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        return this.f72983a.mo134799e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f72983a.mo134800f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f72983a.mo134801g();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(@C0359n0 Activity activity, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C30442d0.m122446v(this.f72983a, activity);
            this.f72983a.mo134802h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f72983a.mo134803i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f72983a.mo134804j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f72983a.mo134805k();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        ClassLoader classLoader = C30563l.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f72983a.mo134806l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f72983a.mo134807m();
    }

    public void onStop() {
        this.f72983a.mo134808n();
        super.onStop();
    }

    public void setArguments(@C0363p0 Bundle bundle) {
        super.setArguments(bundle);
    }
}
