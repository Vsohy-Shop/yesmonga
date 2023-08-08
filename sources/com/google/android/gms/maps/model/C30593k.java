package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.maps.C41827h;

/* renamed from: com.google.android.gms.maps.model.k */
public final class C30593k {

    /* renamed from: a */
    public final C41827h f73140a;

    public C30593k(C41827h hVar) {
        this.f73140a = (C41827h) C40843u.m166202l(hVar);
    }

    /* renamed from: a */
    public void mo86644a() {
        try {
            this.f73140a.mo136400j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public boolean mo86645b() {
        try {
            return this.f73140a.mo136405u();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo86646c() {
        try {
            return this.f73140a.mo136399h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public float mo86647d() {
        try {
            return this.f73140a.mo136396e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public float mo86648e() {
        try {
            return this.f73140a.mo136397f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30593k)) {
            return false;
        }
        try {
            return this.f73140a.mo136393F1(((C30593k) obj).f73140a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public boolean mo86650f() {
        try {
            return this.f73140a.mo136394M();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public void mo86651g() {
        try {
            this.f73140a.mo136401k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public void mo86652h(boolean z) {
        try {
            this.f73140a.mo136395Z5(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73140a.mo136404o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void mo86654i(float f) {
        try {
            this.f73140a.mo136402l6(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public void mo86655j(boolean z) {
        try {
            this.f73140a.mo136403n0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public void mo86656k(float f) {
        try {
            this.f73140a.mo136398g5(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
