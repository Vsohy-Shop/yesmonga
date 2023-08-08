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
/* renamed from: com.google.android.gms.maps.e */
public class C30444e extends Fragment {

    /* renamed from: a */
    public final C30621t f72954a = new C30621t(this);

    @C0359n0
    /* renamed from: b */
    public static C30444e m122452b() {
        return new C30444e();
    }

    @C0359n0
    /* renamed from: c */
    public static C30444e m122453c(@C0363p0 GoogleMapOptions googleMapOptions) {
        C30444e eVar = new C30444e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* renamed from: a */
    public void mo85979a(@C0359n0 C30447f fVar) {
        C40843u.m166197g("getMapAsync must be called on the main thread.");
        C40843u.m166203m(fVar, "callback must not be null.");
        this.f72954a.mo86709w(fVar);
    }

    /* renamed from: d */
    public final void mo85980d(@C0363p0 Bundle bundle) {
        C40843u.m166197g("onEnterAmbient must be called on the main thread.");
        C30621t tVar = this.f72954a;
        if (tVar.mo134796b() != null) {
            ((C30619s) tVar.mo134796b()).mo86707f(bundle);
        }
    }

    /* renamed from: e */
    public final void mo85981e() {
        C40843u.m166197g("onExitAmbient must be called on the main thread.");
        C30621t tVar = this.f72954a;
        if (tVar.mo134796b() != null) {
            ((C30619s) tVar.mo134796b()).mo86708h();
        }
    }

    public void onActivityCreated(@C0363p0 Bundle bundle) {
        ClassLoader classLoader = C30444e.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@C0359n0 Activity activity) {
        super.onAttach(activity);
        C30621t.m123361v(this.f72954a, activity);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f72954a.mo134798d(bundle);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        View e = this.f72954a.mo134799e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f72954a.mo134800f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f72954a.mo134801g();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(@C0359n0 Activity activity, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C30621t.m123361v(this.f72954a, activity);
            GoogleMapOptions e0 = GoogleMapOptions.m122236e0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", e0);
            this.f72954a.mo134802h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f72954a.mo134803i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f72954a.mo134804j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f72954a.mo134805k();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        ClassLoader classLoader = C30444e.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f72954a.mo134806l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f72954a.mo134807m();
    }

    public void onStop() {
        this.f72954a.mo134808n();
        super.onStop();
    }

    public void setArguments(@C0363p0 Bundle bundle) {
        super.setArguments(bundle);
    }
}
