package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40810s0;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
public final class C40620s0 extends C40656z0 {

    /* renamed from: b */
    public final Map f103557b;

    /* renamed from: c */
    public final /* synthetic */ C40515a1 f103558c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40620s0(C40515a1 a1Var, Map map) {
        super(a1Var, (C40651y0) null);
        this.f103558c = a1Var;
        this.f103557b = map;
    }

    @C0348i1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo134023a() {
        C40810s0 s0Var = new C40810s0(this.f103558c.f103302d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C40477a.C40489f fVar : this.f103557b.keySet()) {
            if (!fVar.mo133678l() || ((C40605p0) this.f103557b.get(fVar)).f103536c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = s0Var.mo134478b(this.f103558c.f103301c, (C40477a.C40489f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = s0Var.mo134478b(this.f103558c.f103301c, (C40477a.C40489f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            C40515a1 a1Var = this.f103558c;
            a1Var.f103299a.mo133998f(new C40610q0(this, a1Var, connectionResult));
            return;
        }
        C40515a1 a1Var2 = this.f103558c;
        if (a1Var2.f103311m && a1Var2.f103309k != null) {
            a1Var2.f103309k.mo87656k();
        }
        for (C40477a.C40489f fVar2 : this.f103557b.keySet()) {
            C40747e.C40750c cVar = (C40747e.C40750c) this.f103557b.get(fVar2);
            if (!fVar2.mo133678l() || s0Var.mo134478b(this.f103558c.f103301c, fVar2) == 0) {
                fVar2.mo133676h(cVar);
            } else {
                C40515a1 a1Var3 = this.f103558c;
                a1Var3.f103299a.mo133998f(new C40615r0(this, a1Var3, cVar));
            }
        }
    }
}
