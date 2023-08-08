package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.maps.internal.C30487h;
import com.google.android.gms.maps.internal.C30503l;
import com.google.android.gms.maps.internal.C30513n1;
import com.google.android.gms.maps.model.RuntimeRemoteException;

@C40974d0
/* renamed from: com.google.android.gms.maps.m0 */
public final class C30567m0 implements C30503l {

    /* renamed from: a */
    public final Fragment f72987a;

    /* renamed from: b */
    public final C30487h f72988b;

    public C30567m0(Fragment fragment, C30487h hVar) {
        this.f72988b = (C30487h) C40843u.m166202l(hVar);
        this.f72987a = (Fragment) C40843u.m166202l(fragment);
    }

    /* renamed from: L */
    public final void mo85958L() {
        try {
            this.f72988b.mo86158L();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: M */
    public final void mo85959M(Activity activity, Bundle bundle, @C0363p0 Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            C30513n1.m122777b(bundle2, bundle3);
            this.f72988b.mo86159P6(C41019f.m166811T6(activity), (StreetViewPanoramaOptions) null, bundle3);
            C30513n1.m122777b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: N */
    public final View mo85960N(LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            C41016d y0 = this.f72988b.mo86170y0(C41019f.m166811T6(layoutInflater), C41019f.m166811T6(viewGroup), bundle2);
            C30513n1.m122777b(bundle2, bundle);
            return (View) C41019f.m166810O0(y0);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo85961a() {
        try {
            this.f72988b.mo86161a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo85962b() {
        try {
            this.f72988b.mo86162b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo85963c() {
        try {
            this.f72988b.mo86163c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void mo85964d(C30453h hVar) {
        try {
            this.f72988b.mo86160T0(new C30564l0(this, hVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo85965g() {
        try {
            this.f72988b.mo86164g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo85966i(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            Bundle arguments = this.f72987a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                C30513n1.m122778c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f72988b.mo86165i(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void mo85967m(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f72988b.mo86166m(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f72988b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final void mo85969v() {
        try {
            this.f72988b.mo86168v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
