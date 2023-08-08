package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41828h0;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C30587h {

    /* renamed from: a */
    public final C41828h0 f73136a;

    public C30587h(C41828h0 h0Var) {
        this.f73136a = (C41828h0) C40843u.m166202l(h0Var);
    }

    /* renamed from: A */
    public void mo86553A(float f) {
        try {
            this.f73136a.mo136408I(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: B */
    public void mo86554B() {
        try {
            this.f73136a.mo136412P();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public float mo86555a() {
        try {
            return this.f73136a.mo136417e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo86556b() {
        try {
            return this.f73136a.mo136425p();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public LatLng mo86557c() {
        try {
            return this.f73136a.mo136422k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public float mo86558d() {
        try {
            return this.f73136a.mo136418f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: e */
    public String mo86559e() {
        try {
            return this.f73136a.mo136429t();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30587h)) {
            return false;
        }
        try {
            return this.f73136a.mo136414W6(((C30587h) obj).f73136a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: f */
    public Object mo86561f() {
        try {
            return C41019f.m166810O0(this.f73136a.mo136421j());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: g */
    public String mo86562g() {
        try {
            return this.f73136a.mo136426q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public float mo86563h() {
        try {
            return this.f73136a.mo136424o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73136a.mo136420h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void mo86565i() {
        try {
            this.f73136a.mo136427r();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public boolean mo86566j() {
        try {
            return this.f73136a.mo136433w();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public boolean mo86567k() {
        try {
            return this.f73136a.mo136435x();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public boolean mo86568l() {
        try {
            return this.f73136a.mo136413S();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public boolean mo86569m() {
        try {
            return this.f73136a.mo136415X();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public void mo86570n() {
        try {
            this.f73136a.mo136428s();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86571o(float f) {
        try {
            this.f73136a.mo136411N0(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86572p(float f, float f2) {
        try {
            this.f73136a.mo136423n8(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86573q(boolean z) {
        try {
            this.f73136a.mo136430t7(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86574r(boolean z) {
        try {
            this.f73136a.mo136409J0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86575s(@C0363p0 C30573a aVar) {
        if (aVar == null) {
            try {
                this.f73136a.mo136416c0((C41016d) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f73136a.mo136416c0(aVar.mo86479a());
        }
    }

    /* renamed from: t */
    public void mo86576t(float f, float f2) {
        try {
            this.f73136a.mo136407A2(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86577u(@C0359n0 LatLng latLng) {
        if (latLng != null) {
            try {
                this.f73136a.mo136410J4(latLng);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    /* renamed from: v */
    public void mo86578v(float f) {
        try {
            this.f73136a.mo136431v1(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public void mo86579w(@C0363p0 String str) {
        try {
            this.f73136a.mo136434w6(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: x */
    public void mo86580x(@C0363p0 Object obj) {
        try {
            this.f73136a.mo136406A0(C41019f.m166811T6(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: y */
    public void mo86581y(@C0363p0 String str) {
        try {
            this.f73136a.mo136432v7(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: z */
    public void mo86582z(boolean z) {
        try {
            this.f73136a.mo136419f0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
