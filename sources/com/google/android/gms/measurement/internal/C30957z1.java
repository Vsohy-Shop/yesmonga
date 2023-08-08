package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.collection.C1866a;
import com.google.android.gms.common.internal.C40843u;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z1 */
public final class C30957z1 extends C30651a3 {

    /* renamed from: b */
    public final Map f74124b = new C1866a();

    /* renamed from: c */
    public final Map f74125c = new C1866a();

    /* renamed from: d */
    public long f74126d;

    public C30957z1(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: i */
    public static /* synthetic */ void m124348i(C30957z1 z1Var, String str, long j) {
        z1Var.mo86866h();
        C40843u.m166198h(str);
        if (z1Var.f74125c.isEmpty()) {
            z1Var.f74126d = j;
        }
        Integer num = (Integer) z1Var.f74125c.get(str);
        if (num != null) {
            z1Var.f74125c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (z1Var.f74125c.size() >= 100) {
            z1Var.f74136a.mo86903d().mo87494w().mo87463a("Too many ads visible");
        } else {
            z1Var.f74125c.put(str, 1);
            z1Var.f74124b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m124349j(C30957z1 z1Var, String str, long j) {
        z1Var.mo86866h();
        C40843u.m166198h(str);
        Integer num = (Integer) z1Var.f74125c.get(str);
        if (num != null) {
            C30903u7 s = z1Var.f74136a.mo87107K().mo86922s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                z1Var.f74125c.remove(str);
                Long l = (Long) z1Var.f74124b.get(str);
                if (l == null) {
                    z1Var.f74136a.mo86903d().mo87489r().mo87463a("First ad unit exposure time was never set");
                } else {
                    z1Var.f74124b.remove(str);
                    z1Var.mo87620p(str, j - l.longValue(), s);
                }
                if (z1Var.f74125c.isEmpty()) {
                    long j2 = z1Var.f74126d;
                    if (j2 == 0) {
                        z1Var.f74136a.mo86903d().mo87489r().mo87463a("First ad exposure time was never set");
                        return;
                    }
                    z1Var.mo87619o(j - j2, s);
                    z1Var.f74126d = 0;
                    return;
                }
                return;
            }
            z1Var.f74125c.put(str, Integer.valueOf(intValue));
            return;
        }
        z1Var.f74136a.mo86903d().mo87489r().mo87464b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: l */
    public final void mo87616l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Ad unit id must be a non-empty string");
        } else {
            this.f74136a.mo86904f().mo86950z(new C30647a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo87617m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Ad unit id must be a non-empty string");
        } else {
            this.f74136a.mo86904f().mo86950z(new C30931x(this, str, j));
        }
    }

    @C0348i1
    /* renamed from: n */
    public final void mo87618n(long j) {
        C30903u7 s = this.f74136a.mo87107K().mo86922s(false);
        for (String str : this.f74124b.keySet()) {
            mo87620p(str, j - ((Long) this.f74124b.get(str)).longValue(), s);
        }
        if (!this.f74124b.isEmpty()) {
            mo87619o(j - this.f74126d, s);
        }
        mo87621q(j);
    }

    @C0348i1
    /* renamed from: o */
    public final void mo87619o(long j, C30903u7 u7Var) {
        if (u7Var == null) {
            this.f74136a.mo86903d().mo87493v().mo87463a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f74136a.mo86903d().mo87493v().mo87464b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C30906ua.m124218y(u7Var, bundle, true);
            this.f74136a.mo87105I().mo87334u("am", "_xa", bundle);
        }
    }

    @C0348i1
    /* renamed from: p */
    public final void mo87620p(String str, long j, C30903u7 u7Var) {
        if (u7Var == null) {
            this.f74136a.mo86903d().mo87493v().mo87463a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f74136a.mo86903d().mo87493v().mo87464b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C30906ua.m124218y(u7Var, bundle, true);
            this.f74136a.mo87105I().mo87334u("am", "_xu", bundle);
        }
    }

    @C0348i1
    /* renamed from: q */
    public final void mo87621q(long j) {
        for (String put : this.f74124b.keySet()) {
            this.f74124b.put(put, Long.valueOf(j));
        }
        if (!this.f74124b.isEmpty()) {
            this.f74126d = j;
        }
    }
}
