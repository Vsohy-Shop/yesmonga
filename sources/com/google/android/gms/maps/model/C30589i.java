package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41815b;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.i */
public final class C30589i {

    /* renamed from: a */
    public final C41815b f73138a;

    public C30589i(C41815b bVar) {
        this.f73138a = (C41815b) C40843u.m166202l(bVar);
    }

    /* renamed from: a */
    public int mo86584a() {
        try {
            return this.f73138a.mo136343o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public List<List<LatLng>> mo86585b() {
        try {
            return this.f73138a.mo136346q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo86586c() {
        try {
            return this.f73138a.mo136349t();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: d */
    public List<LatLng> mo86587d() {
        try {
            return this.f73138a.mo136347r();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public int mo86588e() {
        try {
            return this.f73138a.mo136337h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30589i)) {
            return false;
        }
        try {
            return this.f73138a.mo136331Y0(((C30589i) obj).f73138a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public int mo86590f() {
        try {
            return this.f73138a.mo136338j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: g */
    public List<PatternItem> mo86591g() {
        try {
            return PatternItem.m123081M(this.f73138a.mo136348s());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public float mo86592h() {
        try {
            return this.f73138a.mo136333e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73138a.mo136340k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: i */
    public Object mo86594i() {
        try {
            return C41019f.m166810O0(this.f73138a.mo136345p());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public float mo86595j() {
        try {
            return this.f73138a.mo136335f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public boolean mo86596k() {
        try {
            return this.f73138a.mo136353y();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public boolean mo86597l() {
        try {
            return this.f73138a.mo136351w();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public boolean mo86598m() {
        try {
            return this.f73138a.mo136352x();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public void mo86599n() {
        try {
            this.f73138a.mo136350u();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86600o(boolean z) {
        try {
            this.f73138a.mo136342n(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86601p(int i) {
        try {
            this.f73138a.mo136329O(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86602q(boolean z) {
        try {
            this.f73138a.mo136327J0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86603r(@C0359n0 List<? extends List<LatLng>> list) {
        try {
            this.f73138a.mo136332b4(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86604s(@C0359n0 List<LatLng> list) {
        try {
            C40843u.m166203m(list, "points must not be null.");
            this.f73138a.mo136334e0(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void mo86605t(int i) {
        try {
            this.f73138a.mo136330S2(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86606u(int i) {
        try {
            this.f73138a.mo136341m1(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public void mo86607v(@C0363p0 List<PatternItem> list) {
        try {
            this.f73138a.mo136328N1(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public void mo86608w(float f) {
        try {
            this.f73138a.mo136339j0(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: x */
    public void mo86609x(@C0363p0 Object obj) {
        try {
            this.f73138a.mo136344o6(C41019f.m166811T6(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: y */
    public void mo86610y(boolean z) {
        try {
            this.f73138a.mo136336f0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: z */
    public void mo86611z(float f) {
        try {
            this.f73138a.mo136326I(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
