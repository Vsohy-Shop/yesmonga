package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41844v;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C30577c {

    /* renamed from: a */
    public final C41844v f73126a;

    public C30577c(C41844v vVar) {
        this.f73126a = (C41844v) C40843u.m166202l(vVar);
    }

    @C0359n0
    /* renamed from: a */
    public LatLng mo86484a() {
        try {
            return this.f73126a.mo136467t();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public int mo86485b() {
        try {
            return this.f73126a.mo136455h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo86486c() {
        try {
            return this.f73126a.mo136463q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public double mo86487d() {
        try {
            return this.f73126a.mo136451e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public int mo86488e() {
        try {
            return this.f73126a.mo136456j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30577c)) {
            return false;
        }
        try {
            return this.f73126a.mo136447J2(((C30577c) obj).f73126a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: f */
    public List<PatternItem> mo86490f() {
        try {
            return PatternItem.m123081M(this.f73126a.mo136465r());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public float mo86491g() {
        try {
            return this.f73126a.mo136453f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: h */
    public Object mo86492h() {
        try {
            return C41019f.m166810O0(this.f73126a.mo136461p());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f73126a.mo136458k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public float mo86494i() {
        try {
            return this.f73126a.mo136460o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public boolean mo86495j() {
        try {
            return this.f73126a.mo136446F();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public boolean mo86496k() {
        try {
            return this.f73126a.mo136445D();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public void mo86497l() {
        try {
            this.f73126a.mo136466s();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public void mo86498m(@C0359n0 LatLng latLng) {
        try {
            C40843u.m166203m(latLng, "center must not be null.");
            this.f73126a.mo136450V5(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public void mo86499n(boolean z) {
        try {
            this.f73126a.mo136459n(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86500o(int i) {
        try {
            this.f73126a.mo136448O(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86501p(double d) {
        try {
            this.f73126a.mo136468z7(d);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86502q(int i) {
        try {
            this.f73126a.mo136454f2(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86503r(@C0363p0 List<PatternItem> list) {
        try {
            this.f73126a.mo136452e0(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86504s(float f) {
        try {
            this.f73126a.mo136449R2(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void mo86505t(@C0363p0 Object obj) {
        try {
            this.f73126a.mo136464q0(C41019f.m166811T6(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86506u(boolean z) {
        try {
            this.f73126a.mo136462p4(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public void mo86507v(float f) {
        try {
            this.f73126a.mo136457j0(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
