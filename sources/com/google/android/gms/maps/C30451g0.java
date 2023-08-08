package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.maps.internal.C30491i;
import com.google.android.gms.maps.internal.C30503l;
import com.google.android.gms.maps.internal.C30513n1;
import com.google.android.gms.maps.model.RuntimeRemoteException;

@C40974d0
/* renamed from: com.google.android.gms.maps.g0 */
public final class C30451g0 implements C30503l {

    /* renamed from: a */
    public final ViewGroup f72958a;

    /* renamed from: b */
    public final C30491i f72959b;

    /* renamed from: c */
    public View f72960c;

    public C30451g0(ViewGroup viewGroup, C30491i iVar) {
        this.f72959b = (C30491i) C40843u.m166202l(iVar);
        this.f72958a = (ViewGroup) C40843u.m166202l(viewGroup);
    }

    /* renamed from: L */
    public final void mo85958L() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    /* renamed from: M */
    public final void mo85959M(Activity activity, Bundle bundle, @C0363p0 Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    /* renamed from: N */
    public final View mo85960N(LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    /* renamed from: a */
    public final void mo85961a() {
        try {
            this.f72959b.mo86173a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo85962b() {
        try {
            this.f72959b.mo86174b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo85963c() {
        try {
            this.f72959b.mo86175c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void mo85964d(C30453h hVar) {
        try {
            this.f72959b.mo86172T0(new C30448f0(this, hVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo85965g() {
        try {
            this.f72959b.mo86176g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo85966i(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f72959b.mo86178i(bundle2);
            C30513n1.m122777b(bundle2, bundle);
            this.f72960c = (View) C41019f.m166810O0(this.f72959b.getView());
            this.f72958a.removeAllViews();
            this.f72958a.addView(this.f72960c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void mo85967m(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f72959b.mo86179m(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f72959b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final void mo85969v() {
        try {
            this.f72959b.mo86181v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
