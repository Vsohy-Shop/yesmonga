package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.installations.C33124s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.q3 */
public final class C40613q3 extends C40639v3 {

    /* renamed from: f */
    public final SparseArray f103547f = new SparseArray();

    public C40613q3(C40587m mVar) {
        super(mVar, C40713g.m165640x());
        this.f103291a.mo133930o("AutoManageHelper", this);
    }

    /* renamed from: u */
    public static C40613q3 m165347u(C40582l lVar) {
        C40587m e = LifecycleCallback.m164867e(lVar);
        C40613q3 q3Var = (C40613q3) e.mo133938x("AutoManageHelper", C40613q3.class);
        if (q3Var != null) {
            return q3Var;
        }
        return new C40613q3(e);
    }

    /* renamed from: a */
    public final void mo133801a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f103547f.size(); i++) {
            C40608p3 x = mo134016x(i);
            if (x != null) {
                printWriter.append(str).append("GoogleApiClient #").print(x.f103539n);
                printWriter.println(C33124s.f80355c);
                x.f103540o.mo133751j(String.valueOf(str).concat(GlideException.C22148a.f56917d), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: k */
    public final void mo133808k() {
        super.mo133808k();
        boolean z = this.f103603b;
        String valueOf = String.valueOf(this.f103547f);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.f103604c.get() == null) {
            for (int i = 0; i < this.f103547f.size(); i++) {
                C40608p3 x = mo134016x(i);
                if (x != null) {
                    x.f103540o.mo133748g();
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo87750l() {
        super.mo87750l();
        for (int i = 0; i < this.f103547f.size(); i++) {
            C40608p3 x = mo134016x(i);
            if (x != null) {
                x.f103540o.mo133750i();
            }
        }
    }

    /* renamed from: n */
    public final void mo133960n(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C40608p3 p3Var = (C40608p3) this.f103547f.get(i);
        if (p3Var != null) {
            mo134015w(i);
            C40507i.C40510c cVar = p3Var.f103541p;
            if (cVar != null) {
                cVar.mo133896O0(connectionResult);
            }
        }
    }

    /* renamed from: o */
    public final void mo133961o() {
        for (int i = 0; i < this.f103547f.size(); i++) {
            C40608p3 x = mo134016x(i);
            if (x != null) {
                x.f103540o.mo133748g();
            }
        }
    }

    /* renamed from: v */
    public final void mo134014v(int i, C40507i iVar, @C0363p0 C40507i.C40510c cVar) {
        boolean z;
        C40843u.m166203m(iVar, "GoogleApiClient instance cannot be null");
        if (this.f103547f.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "Already managing a GoogleApiClient with id " + i);
        C40623s3 s3Var = (C40623s3) this.f103604c.get();
        boolean z2 = this.f103603b;
        String valueOf = String.valueOf(s3Var);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(" ");
        sb.append(z2);
        sb.append(" ");
        sb.append(valueOf);
        C40608p3 p3Var = new C40608p3(this, i, iVar, cVar);
        iVar.mo133738C(p3Var);
        this.f103547f.put(i, p3Var);
        if (this.f103603b && s3Var == null) {
            "connecting ".concat(iVar.toString());
            iVar.mo133748g();
        }
    }

    /* renamed from: w */
    public final void mo134015w(int i) {
        C40608p3 p3Var = (C40608p3) this.f103547f.get(i);
        this.f103547f.remove(i);
        if (p3Var != null) {
            p3Var.f103540o.mo133742G(p3Var);
            p3Var.f103540o.mo133750i();
        }
    }

    @C0363p0
    /* renamed from: x */
    public final C40608p3 mo134016x(int i) {
        if (this.f103547f.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f103547f;
        return (C40608p3) sparseArray.get(sparseArray.keyAt(i));
    }
}
