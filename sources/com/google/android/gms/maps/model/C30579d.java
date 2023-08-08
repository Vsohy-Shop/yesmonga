package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41847y;

/* renamed from: com.google.android.gms.maps.model.d */
public final class C30579d {

    /* renamed from: a */
    public final C41847y f73127a;

    public C30579d(C41847y yVar) {
        this.f73127a = (C41847y) C40843u.m166202l(yVar);
    }

    /* renamed from: a */
    public float mo86510a() {
        try {
            return this.f73127a.mo136478e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public LatLngBounds mo86511b() {
        try {
            return this.f73127a.mo136488q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public float mo86512c() {
        try {
            return this.f73127a.mo136479f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: d */
    public String mo86513d() {
        try {
            return this.f73127a.mo136490r();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public LatLng mo86514e() {
        try {
            return this.f73127a.mo136492t();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30579d)) {
            return false;
        }
        try {
            return this.f73127a.mo136493v4(((C30579d) obj).f73127a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: f */
    public Object mo86516f() {
        try {
            return C41019f.m166810O0(this.f73127a.mo136487p());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public float mo86517g() {
        try {
            return this.f73127a.mo136486o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public float mo86518h() {
        try {
            return this.f73127a.mo136480h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73127a.mo136484k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public float mo86520i() {
        try {
            return this.f73127a.mo136483j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public boolean mo86521j() {
        try {
            return this.f73127a.mo136470D();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public boolean mo86522k() {
        try {
            return this.f73127a.mo136474P();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public void mo86523l() {
        try {
            this.f73127a.mo136491s();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public void mo86524m(float f) {
        try {
            this.f73127a.mo136472N0(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public void mo86525n(boolean z) {
        try {
            this.f73127a.mo136485n(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86526o(float f) {
        try {
            this.f73127a.mo136482i7(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86527p(float f, float f2) {
        try {
            this.f73127a.mo136469C7(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86528q(@C0359n0 C30573a aVar) {
        C40843u.m166203m(aVar, "imageDescriptor must not be null");
        try {
            this.f73127a.mo136476c0(aVar.mo86479a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86529r(@C0359n0 LatLng latLng) {
        try {
            this.f73127a.mo136481h3(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86530s(@C0359n0 LatLngBounds latLngBounds) {
        try {
            this.f73127a.mo136477d1(latLngBounds);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void mo86531t(@C0363p0 Object obj) {
        try {
            this.f73127a.mo136489q0(C41019f.m166811T6(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86532u(float f) {
        try {
            this.f73127a.mo136475U1(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public void mo86533v(boolean z) {
        try {
            this.f73127a.mo136471M4(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public void mo86534w(float f) {
        try {
            this.f73127a.mo136473N4(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
