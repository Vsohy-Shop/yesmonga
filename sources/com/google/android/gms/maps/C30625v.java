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
import com.google.android.gms.maps.internal.C30475e;
import com.google.android.gms.maps.internal.C30499k;
import com.google.android.gms.maps.internal.C30513n1;
import com.google.android.gms.maps.model.RuntimeRemoteException;

@C40974d0
/* renamed from: com.google.android.gms.maps.v */
public final class C30625v implements C30499k {

    /* renamed from: a */
    public final ViewGroup f73167a;

    /* renamed from: b */
    public final C30475e f73168b;

    /* renamed from: c */
    public View f73169c;

    public C30625v(ViewGroup viewGroup, C30475e eVar) {
        this.f73168b = (C30475e) C40843u.m166202l(eVar);
        this.f73167a = (ViewGroup) C40843u.m166202l(viewGroup);
    }

    /* renamed from: L */
    public final void mo85958L() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    /* renamed from: M */
    public final void mo85959M(Activity activity, Bundle bundle, @C0363p0 Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    /* renamed from: N */
    public final View mo85960N(LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    /* renamed from: a */
    public final void mo85961a() {
        try {
            this.f73168b.mo86122a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo85962b() {
        try {
            this.f73168b.mo86123b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo85963c() {
        try {
            this.f73168b.mo86124c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final void mo86207e(C30447f fVar) {
        try {
            this.f73168b.mo86120K(new C30623u(this, fVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void mo86711f(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f73168b.mo86119G(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo85965g() {
        try {
            this.f73168b.mo86125g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final void mo86712h() {
        try {
            this.f73168b.mo86121N();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo85966i(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f73168b.mo86127i(bundle2);
            C30513n1.m122777b(bundle2, bundle);
            this.f73169c = (View) C41019f.m166810O0(this.f73168b.getView());
            this.f73167a.removeAllViews();
            this.f73167a.addView(this.f73169c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void mo85967m(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f73168b.mo86128m(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f73168b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final void mo85969v() {
        try {
            this.f73168b.mo86130v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
