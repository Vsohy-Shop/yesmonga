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

public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    public final C30561k0 f72929a = new C30561k0(this);

    @C0359n0
    /* renamed from: J0 */
    public static SupportMapFragment m122321J0() {
        return new SupportMapFragment();
    }

    @C0359n0
    /* renamed from: K0 */
    public static SupportMapFragment m122322K0(@C0363p0 GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    /* renamed from: I0 */
    public void mo85862I0(@C0359n0 C30447f fVar) {
        C40843u.m166197g("getMapAsync must be called on the main thread.");
        C40843u.m166203m(fVar, "callback must not be null.");
        this.f72929a.mo86262w(fVar);
    }

    /* renamed from: L0 */
    public final void mo85863L0(@C0363p0 Bundle bundle) {
        C40843u.m166197g("onEnterAmbient must be called on the main thread.");
        C30561k0 k0Var = this.f72929a;
        if (k0Var.mo134796b() != null) {
            ((C30554j0) k0Var.mo134796b()).mo86234f(bundle);
        }
    }

    /* renamed from: M0 */
    public final void mo85864M0() {
        C40843u.m166197g("onExitAmbient must be called on the main thread.");
        C30561k0 k0Var = this.f72929a;
        if (k0Var.mo134796b() != null) {
            ((C30554j0) k0Var.mo134796b()).mo86235h();
        }
    }

    public void onActivityCreated(@C0363p0 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@C0359n0 Activity activity) {
        super.onAttach(activity);
        C30561k0.m122971v(this.f72929a, activity);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.f72929a.mo134798d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        View e = this.f72929a.mo134799e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f72929a.mo134800f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f72929a.mo134801g();
        super.onDestroyView();
    }

    public void onInflate(@C0359n0 Activity activity, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C30561k0.m122971v(this.f72929a, activity);
            GoogleMapOptions e0 = GoogleMapOptions.m122236e0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", e0);
            this.f72929a.mo134802h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f72929a.mo134803i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f72929a.mo134804j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f72929a.mo134805k();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f72929a.mo134806l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f72929a.mo134807m();
    }

    public void onStop() {
        this.f72929a.mo134808n();
        super.onStop();
    }

    public void setArguments(@C0363p0 Bundle bundle) {
        super.setArguments(bundle);
    }
}
