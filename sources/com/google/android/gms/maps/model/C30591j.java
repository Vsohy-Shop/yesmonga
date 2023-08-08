package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41821e;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.j */
public final class C30591j {

    /* renamed from: a */
    public final C41821e f73139a;

    public C30591j(C41821e eVar) {
        this.f73139a = (C41821e) C40843u.m166202l(eVar);
    }

    /* renamed from: a */
    public int mo86614a() {
        try {
            return this.f73139a.mo136374o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public Cap mo86615b() {
        try {
            return this.f73139a.mo136375p().mo86290M();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo86616c() {
        try {
            return this.f73139a.mo136377q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public int mo86617d() {
        try {
            return this.f73139a.mo136370h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: e */
    public List<PatternItem> mo86618e() {
        try {
            return PatternItem.m123081M(this.f73139a.mo136378r());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30591j)) {
            return false;
        }
        try {
            return this.f73139a.mo136364L7(((C30591j) obj).f73139a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: f */
    public List<LatLng> mo86620f() {
        try {
            return this.f73139a.mo136379s();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: g */
    public Cap mo86621g() {
        try {
            return this.f73139a.mo136380t().mo86290M();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: h */
    public Object mo86622h() {
        try {
            return C41019f.m166810O0(this.f73139a.mo136372k());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73139a.mo136371j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public float mo86624i() {
        try {
            return this.f73139a.mo136368e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public float mo86625j() {
        try {
            return this.f73139a.mo136369f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public boolean mo86626k() {
        try {
            return this.f73139a.mo136386y();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public boolean mo86627l() {
        try {
            return this.f73139a.mo136384w();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public boolean mo86628m() {
        try {
            return this.f73139a.mo136385x();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public void mo86629n() {
        try {
            this.f73139a.mo136383u();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86630o(boolean z) {
        try {
            this.f73139a.mo136373n(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86631p(int i) {
        try {
            this.f73139a.mo136365O(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86632q(@C0359n0 Cap cap) {
        C40843u.m166203m(cap, "endCap must not be null");
        try {
            this.f73139a.mo136361G2(cap);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86633r(boolean z) {
        try {
            this.f73139a.mo136376p2(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86634s(int i) {
        try {
            this.f73139a.mo136362H2(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void mo86635t(@C0363p0 List<PatternItem> list) {
        try {
            this.f73139a.mo136366P4(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86636u(@C0359n0 List<LatLng> list) {
        C40843u.m166203m(list, "points must not be null");
        try {
            this.f73139a.mo136382t4(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public void mo86637v(@C0359n0 Cap cap) {
        C40843u.m166203m(cap, "startCap must not be null");
        try {
            this.f73139a.mo136387y7(cap);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public void mo86638w(@C0363p0 Object obj) {
        try {
            this.f73139a.mo136360A0(C41019f.m166811T6(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: x */
    public void mo86639x(boolean z) {
        try {
            this.f73139a.mo136367Z2(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: y */
    public void mo86640y(float f) {
        try {
            this.f73139a.mo136381t3(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: z */
    public void mo86641z(float f) {
        try {
            this.f73139a.mo136363I(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
