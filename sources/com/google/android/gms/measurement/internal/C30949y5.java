package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0339g;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.C40866k;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40968c0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41867b;
import com.google.android.gms.internal.measurement.C41869b1;
import com.google.android.gms.internal.measurement.zzd;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import com.google.firebase.messaging.C33180f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
public final class C30949y5 extends C30767j3 {

    /* renamed from: n */
    public final C30822na f74111n;

    /* renamed from: o */
    public Boolean f74112o;

    /* renamed from: p */
    public String f74113p = null;

    public C30949y5(C30822na naVar, String str) {
        C40843u.m166202l(naVar);
        this.f74111n = naVar;
    }

    /* renamed from: E8 */
    public final void mo87606E8(zzaw zzaw, zzq zzq) {
        C41869b1 b1Var;
        if (!this.f74111n.mo87364a0().mo87571C(zzq.f74188a)) {
            mo87609H0(zzaw, zzq);
            return;
        }
        this.f74111n.mo86903d().mo87493v().mo87464b("EES config found for", zzq.f74188a);
        C30936x4 a0 = this.f74111n.mo87364a0();
        String str = zzq.f74188a;
        if (TextUtils.isEmpty(str)) {
            b1Var = null;
        } else {
            b1Var = (C41869b1) a0.f74074j.mo6246f(str);
        }
        if (b1Var != null) {
            try {
                Map I = this.f74111n.mo87370g0().mo87424I(zzaw.f74164b.mo87634W(), true);
                String a = C30706e6.m123694a(zzaw.f74163a);
                if (a == null) {
                    a = zzaw.f74163a;
                }
                if (b1Var.mo136602e(new C41867b(a, zzaw.f74166d, I))) {
                    if (b1Var.mo136604g()) {
                        this.f74111n.mo86903d().mo87493v().mo87464b("EES edited event", zzaw.f74163a);
                        mo87609H0(this.f74111n.mo87370g0().mo87418A(b1Var.mo136598a().mo136641b()), zzq);
                    } else {
                        mo87609H0(zzaw, zzq);
                    }
                    if (b1Var.mo136603f()) {
                        for (C41867b bVar : b1Var.mo136598a().mo136642c()) {
                            this.f74111n.mo86903d().mo87493v().mo87464b("EES logging created event", bVar.mo136590d());
                            mo87609H0(this.f74111n.mo87370g0().mo87418A(bVar), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f74111n.mo86903d().mo87489r().mo87465c("EES error. appId, eventName", zzq.f74189b, zzaw.f74163a);
            }
            this.f74111n.mo86903d().mo87493v().mo87464b("EES was not applied to event", zzaw.f74163a);
            mo87609H0(zzaw, zzq);
            return;
        }
        this.f74111n.mo86903d().mo87493v().mo87464b("EES not loaded for", zzq.f74188a);
        mo87609H0(zzaw, zzq);
    }

    /* renamed from: F8 */
    public final /* synthetic */ void mo87607F8(String str, Bundle bundle) {
        C30787l W = this.f74111n.mo87360W();
        W.mo86866h();
        W.mo87627i();
        byte[] g = W.f74119b.mo87370g0().mo87419B(new C30847q(W.f74136a, "", str, "dep", 0, 0, bundle)).mo136762g();
        W.f74136a.mo86903d().mo87493v().mo87465c("Saving default event parameters, appId, data size", W.f74136a.mo87101D().mo87410d(str), Integer.valueOf(g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(C32659d.f79228c, g);
        try {
            if (W.mo87212P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f74136a.mo86903d().mo87489r().mo87464b("Failed to insert default event parameters (got -1). appId", C30899u3.m124186z(str));
            }
        } catch (SQLiteException e) {
            W.f74136a.mo86903d().mo87489r().mo87465c("Error storing default event parameters. appId", C30899u3.m124186z(str), e);
        }
    }

    @C40974d0
    /* renamed from: G8 */
    public final void mo87608G8(Runnable runnable) {
        C40843u.m166202l(runnable);
        if (this.f74111n.mo86904f().mo86943C()) {
            runnable.run();
        } else {
            this.f74111n.mo86904f().mo86950z(runnable);
        }
    }

    /* renamed from: H0 */
    public final void mo87609H0(zzaw zzaw, zzq zzq) {
        this.f74111n.mo87367e();
        this.f74111n.mo87375j(zzaw, zzq);
    }

    @C0339g
    /* renamed from: H5 */
    public final byte[] mo87152H5(zzaw zzaw, String str) {
        C40843u.m166198h(str);
        C40843u.m166202l(zzaw);
        mo87611I8(str, true);
        this.f74111n.mo86903d().mo87488q().mo87464b("Log and bundle. event", this.f74111n.mo87361X().mo87410d(zzaw.f74163a));
        long nanoTime = this.f74111n.mo86900a().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f74111n.mo86904f().mo86948t(new C30889t5(this, zzaw, str)).get();
            if (bArr == null) {
                this.f74111n.mo86903d().mo87489r().mo87464b("Log and bundle returned null. appId", C30899u3.m124186z(str));
                bArr = new byte[0];
            }
            this.f74111n.mo86903d().mo87488q().mo87466d("Log and bundle processed. event, size, time_ms", this.f74111n.mo87361X().mo87410d(zzaw.f74163a), Integer.valueOf(bArr.length), Long.valueOf((this.f74111n.mo86900a().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87466d("Failed to log and bundle. appId, event, error", C30899u3.m124186z(str), this.f74111n.mo87361X().mo87410d(zzaw.f74163a), e);
            return null;
        }
    }

    @C0339g
    /* renamed from: H8 */
    public final void mo87610H8(zzq zzq, boolean z) {
        C40843u.m166202l(zzq);
        C40843u.m166198h(zzq.f74188a);
        mo87611I8(zzq.f74188a, false);
        this.f74111n.mo87372h0().mo87513M(zzq.f74189b, zzq.f74175F0);
    }

    @C0339g
    /* renamed from: I8 */
    public final void mo87611I8(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f74112o == null) {
                        if (!"com.google.android.gms".equals(this.f74113p) && !C40968c0.m166599a(this.f74111n.mo86902c(), Binder.getCallingUid())) {
                            if (!C40866k.m166252a(this.f74111n.mo86902c()).mo134535d(Binder.getCallingUid())) {
                                z2 = false;
                                this.f74112o = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f74112o = Boolean.valueOf(z2);
                    }
                    if (this.f74112o.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f74111n.mo86903d().mo87489r().mo87464b("Measurement Service called with invalid calling package. appId", C30899u3.m124186z(str));
                    throw e;
                }
            }
            if (this.f74113p == null && C40864j.m166246t(this.f74111n.mo86902c(), Binder.getCallingUid(), str)) {
                this.f74113p = str;
            }
            if (!str.equals(this.f74113p)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f74111n.mo86903d().mo87489r().mo87463a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @C0339g
    /* renamed from: K3 */
    public final void mo87153K3(zzq zzq) {
        C40843u.m166198h(zzq.f74188a);
        C40843u.m166202l(zzq.f74180K0);
        C30853q5 q5Var = new C30853q5(this, zzq);
        C40843u.m166202l(q5Var);
        if (this.f74111n.mo86904f().mo86943C()) {
            q5Var.run();
        } else {
            this.f74111n.mo86904f().mo86942A(q5Var);
        }
    }

    @C0339g
    /* renamed from: M2 */
    public final void mo87154M2(zzaw zzaw, zzq zzq) {
        C40843u.m166202l(zzaw);
        mo87610H8(zzq, false);
        mo87608G8(new C30865r5(this, zzaw, zzq));
    }

    @C0339g
    /* renamed from: M5 */
    public final String mo87155M5(zzq zzq) {
        mo87610H8(zzq, false);
        return this.f74111n.mo87376j0(zzq);
    }

    @C40974d0
    /* renamed from: O0 */
    public final zzaw mo87612O0(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!C33180f.C33186f.f80639l.equals(zzaw.f74163a) || (zzau = zzaw.f74164b) == null || zzau.mo87633M() == 0)) {
            String n0 = zzaw.f74164b.mo87639n0("_cis");
            if ("referrer broadcast".equals(n0) || "referrer API".equals(n0)) {
                this.f74111n.mo86903d().mo87492u().mo87464b("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.f74164b, zzaw.f74165c, zzaw.f74166d);
            }
        }
        return zzaw;
    }

    @C0339g
    /* renamed from: S3 */
    public final List mo87156S3(String str, String str2, boolean z, zzq zzq) {
        mo87610H8(zzq, false);
        String str3 = zzq.f74188a;
        C40843u.m166202l(str3);
        try {
            List<C30870ra> list = (List) this.f74111n.mo86904f().mo86947s(new C30781k5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C30870ra raVar : list) {
                if (z || !C30906ua.m124206Y(raVar.f73924c)) {
                    arrayList.add(new zzli(raVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87465c("Failed to query user properties. appId", C30899u3.m124186z(zzq.f74188a), e);
            return Collections.emptyList();
        }
    }

    @C0339g
    /* renamed from: T2 */
    public final void mo87157T2(zzq zzq) {
        mo87610H8(zzq, false);
        mo87608G8(new C30925w5(this, zzq));
    }

    @C0339g
    /* renamed from: Z7 */
    public final void mo87158Z7(zzac zzac, zzq zzq) {
        C40843u.m166202l(zzac);
        C40843u.m166202l(zzac.f74149c);
        mo87610H8(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.f74147a = zzq.f74188a;
        mo87608G8(new C30757i5(this, zzac2, zzq));
    }

    @C0339g
    /* renamed from: a7 */
    public final List mo87159a7(String str, String str2, zzq zzq) {
        mo87610H8(zzq, false);
        String str3 = zzq.f74188a;
        C40843u.m166202l(str3);
        try {
            return (List) this.f74111n.mo86904f().mo86947s(new C30805m5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87464b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @C0339g
    /* renamed from: c4 */
    public final void mo87160c4(zzli zzli, zzq zzq) {
        C40843u.m166202l(zzli);
        mo87610H8(zzq, false);
        mo87608G8(new C30901u5(this, zzli, zzq));
    }

    @C0339g
    /* renamed from: e3 */
    public final void mo87161e3(long j, String str, String str2, String str3) {
        mo87608G8(new C30937x5(this, str2, str3, str, j));
    }

    @C0339g
    /* renamed from: f5 */
    public final void mo87162f5(zzq zzq) {
        mo87610H8(zzq, false);
        mo87608G8(new C30841p5(this, zzq));
    }

    @C0339g
    /* renamed from: h4 */
    public final void mo87163h4(zzq zzq) {
        C40843u.m166198h(zzq.f74188a);
        mo87611I8(zzq.f74188a, false);
        mo87608G8(new C30829o5(this, zzq));
    }

    @C0339g
    /* renamed from: o5 */
    public final void mo87164o5(Bundle bundle, zzq zzq) {
        mo87610H8(zzq, false);
        String str = zzq.f74188a;
        C40843u.m166202l(str);
        mo87608G8(new C30744h5(this, str, bundle));
    }

    @C0339g
    /* renamed from: o7 */
    public final void mo87165o7(zzaw zzaw, String str, String str2) {
        C40843u.m166202l(zzaw);
        C40843u.m166198h(str);
        mo87611I8(str, true);
        mo87608G8(new C30877s5(this, zzaw, str));
    }

    @C0339g
    /* renamed from: t5 */
    public final List mo87166t5(String str, String str2, String str3, boolean z) {
        mo87611I8(str, true);
        try {
            List<C30870ra> list = (List) this.f74111n.mo86904f().mo86947s(new C30793l5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C30870ra raVar : list) {
                if (z || !C30906ua.m124206Y(raVar.f73924c)) {
                    arrayList.add(new zzli(raVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87465c("Failed to get user properties as. appId", C30899u3.m124186z(str), e);
            return Collections.emptyList();
        }
    }

    @C0339g
    /* renamed from: u1 */
    public final void mo87167u1(zzac zzac) {
        C40843u.m166202l(zzac);
        C40843u.m166202l(zzac.f74149c);
        C40843u.m166198h(zzac.f74147a);
        mo87611I8(zzac.f74147a, true);
        mo87608G8(new C30769j5(this, new zzac(zzac)));
    }

    @C0339g
    /* renamed from: v0 */
    public final List mo87168v0(String str, String str2, String str3) {
        mo87611I8(str, true);
        try {
            return (List) this.f74111n.mo86904f().mo86947s(new C30817n5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87464b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @C0339g
    /* renamed from: z1 */
    public final List mo87169z1(zzq zzq, boolean z) {
        mo87610H8(zzq, false);
        String str = zzq.f74188a;
        C40843u.m166202l(str);
        try {
            List<C30870ra> list = (List) this.f74111n.mo86904f().mo86947s(new C30913v5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C30870ra raVar : list) {
                if (z || !C30906ua.m124206Y(raVar.f73924c)) {
                    arrayList.add(new zzli(raVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f74111n.mo86903d().mo87489r().mo87465c("Failed to get user properties. appId", C30899u3.m124186z(zzq.f74188a), e);
            return null;
        }
    }
}
