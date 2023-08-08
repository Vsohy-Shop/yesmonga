package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41977h1;
import com.google.firebase.installations.C33124s;
import com.urbanairship.AirshipConfigOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@C40974d0
/* renamed from: com.google.android.gms.measurement.internal.d9 */
public final class C30696d9 extends C30665b4 {

    /* renamed from: c */
    public final C30683c9 f73338c;

    /* renamed from: d */
    public C30779k3 f73339d;

    /* renamed from: e */
    public volatile Boolean f73340e;

    /* renamed from: f */
    public final C30823o f73341f;

    /* renamed from: g */
    public final C30917v9 f73342g;

    /* renamed from: h */
    public final List f73343h = new ArrayList();

    /* renamed from: i */
    public final C30823o f73344i;

    public C30696d9(C30731g5 g5Var) {
        super(g5Var);
        this.f73342g = new C30917v9(g5Var.mo86900a());
        this.f73338c = new C30683c9(this);
        this.f73341f = new C30820n8(this, g5Var);
        this.f73344i = new C30844p8(this, g5Var);
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m123657M(C30696d9 d9Var, ComponentName componentName) {
        d9Var.mo86866h();
        if (d9Var.f73339d != null) {
            d9Var.f73339d = null;
            d9Var.f74136a.mo86903d().mo87493v().mo87464b("Disconnected from device MeasurementService", componentName);
            d9Var.mo86866h();
            d9Var.mo87028P();
        }
    }

    @C0348i1
    /* renamed from: A */
    public final boolean mo87019A() {
        mo86866h();
        mo86890i();
        if (!mo87020B() || this.f74136a.mo87110N().mo87537q0() >= ((Integer) C30742h3.f73540j0.mo87094a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    @androidx.annotation.C0348i1
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87020B() {
        /*
            r7 = this;
            r7.mo86866h()
            r7.mo86890i()
            java.lang.Boolean r0 = r7.f73340e
            if (r0 != 0) goto L_0x014b
            r7.mo86866h()
            r7.mo86890i()
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r0 = r0.mo87103F()
            r0.mo86866h()
            android.content.SharedPreferences r1 = r0.mo87191o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo87191o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0145
        L_0x003f:
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            r4.mo86901b()
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo87099B()
            int r4 = r4.mo87242o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = r1
            goto L_0x010d
        L_0x0053:
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87493v()
            java.lang.String r5 = "Checking service availability"
            r4.mo87463a(r5)
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r4 = r4.mo87110N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo87539r0(r5)
            if (r4 == 0) goto L_0x00fc
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo87464b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()
            java.lang.String r3 = "Service updating"
            r0.mo87463a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()
            java.lang.String r1 = "Service invalid"
            r0.mo87463a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()
            java.lang.String r1 = "Service disabled"
            r0.mo87463a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010d
        L_0x00c6:
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87488q()
            java.lang.String r5 = "Service container out of date"
            r4.mo87463a(r5)
            com.google.android.gms.measurement.internal.g5 r4 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r4 = r4.mo87110N()
            int r4 = r4.mo87537q0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x010d
        L_0x00ec:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()
            java.lang.String r4 = "Service missing"
            r0.mo87463a(r4)
            goto L_0x010d
        L_0x00fc:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()
            java.lang.String r3 = "Service available"
            r0.mo87463a(r3)
            goto L_0x0050
        L_0x010d:
            if (r3 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            boolean r0 = r0.mo87075G()
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo87463a(r1)
            goto L_0x0144
        L_0x012b:
            if (r1 == 0) goto L_0x0144
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r0 = r0.mo87103F()
            r0.mo86866h()
            android.content.SharedPreferences r0 = r0.mo87191o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0144:
            r1 = r3
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f73340e = r0
        L_0x014b:
            java.lang.Boolean r0 = r7.f73340e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30696d9.mo87020B():boolean");
    }

    @C0348i1
    /* renamed from: C */
    public final zzq mo87021C(boolean z) {
        Pair a;
        this.f74136a.mo86901b();
        C30791l3 B = this.f74136a.mo87099B();
        String str = null;
        if (z) {
            C30899u3 d = this.f74136a.mo86903d();
            if (!(d.f74136a.mo87103F().f73648d == null || (a = d.f74136a.mo87103F().f73648d.mo87170a()) == null || a == C30780k4.f73646y)) {
                str = String.valueOf(a.second) + C33124s.f80355c + ((String) a.first);
            }
        }
        return B.mo87244q(str);
    }

    @C0348i1
    /* renamed from: D */
    public final void mo87022D() {
        mo86866h();
        this.f74136a.mo86903d().mo87493v().mo87464b("Processing queued up service tasks", Integer.valueOf(this.f73343h.size()));
        for (Runnable run : this.f73343h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f74136a.mo86903d().mo87489r().mo87464b("Task exception while flushing queue", e);
            }
        }
        this.f73343h.clear();
        this.f73344i.mo87394b();
    }

    @C0348i1
    /* renamed from: E */
    public final void mo87023E() {
        mo86866h();
        this.f73342g.mo87559b();
        C30823o oVar = this.f73341f;
        this.f74136a.mo87130z();
        oVar.mo87395d(((Long) C30742h3.f73506L.mo87094a((Object) null)).longValue());
    }

    @C0348i1
    /* renamed from: F */
    public final void mo87024F(Runnable runnable) throws IllegalStateException {
        mo86866h();
        if (mo87048z()) {
            runnable.run();
            return;
        }
        this.f74136a.mo87130z();
        if (((long) this.f73343h.size()) >= 1000) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f73343h.add(runnable);
        this.f73344i.mo87395d(AirshipConfigOptions.f87111Y);
        mo87028P();
    }

    /* renamed from: G */
    public final boolean mo87025G() {
        this.f74136a.mo86901b();
        return true;
    }

    /* renamed from: J */
    public final Boolean mo87026J() {
        return this.f73340e;
    }

    @C0348i1
    /* renamed from: O */
    public final void mo87027O() {
        mo86866h();
        mo86890i();
        zzq C = mo87021C(true);
        this.f74136a.mo87100C().mo87289r();
        mo87024F(new C30784k8(this, C));
    }

    @C0348i1
    /* renamed from: P */
    public final void mo87028P() {
        mo86866h();
        mo86890i();
        if (!mo87048z()) {
            if (mo87020B()) {
                this.f73338c.mo86929c();
            } else if (!this.f74136a.mo87130z().mo87075G()) {
                this.f74136a.mo86901b();
                List<ResolveInfo> queryIntentServices = this.f74136a.mo86902c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f74136a.mo86902c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f74136a.mo86903d().mo87489r().mo87463a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context c = this.f74136a.mo86902c();
                this.f74136a.mo86901b();
                intent.setComponent(new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f73338c.mo86928b(intent);
            }
        }
    }

    @C0348i1
    /* renamed from: Q */
    public final void mo87029Q() {
        mo86866h();
        mo86890i();
        this.f73338c.mo86930d();
        try {
            C40954b.m166547b().mo134752c(this.f74136a.mo86902c(), this.f73338c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f73339d = null;
    }

    @C0348i1
    /* renamed from: R */
    public final void mo87030R(C41977h1 h1Var) {
        mo86866h();
        mo86890i();
        mo87024F(new C30772j8(this, mo87021C(false), h1Var));
    }

    @C0348i1
    /* renamed from: S */
    public final void mo87031S(AtomicReference atomicReference) {
        mo86866h();
        mo86890i();
        mo87024F(new C30760i8(this, atomicReference, mo87021C(false)));
    }

    @C0348i1
    /* renamed from: T */
    public final void mo87032T(C41977h1 h1Var, String str, String str2) {
        mo86866h();
        mo86890i();
        mo87024F(new C30916v8(this, str, str2, mo87021C(false), h1Var));
    }

    @C0348i1
    /* renamed from: U */
    public final void mo87033U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo86866h();
        mo86890i();
        mo87024F(new C30904u8(this, atomicReference, (String) null, str2, str3, mo87021C(false)));
    }

    @C0348i1
    /* renamed from: V */
    public final void mo87034V(AtomicReference atomicReference, boolean z) {
        mo86866h();
        mo86890i();
        mo87024F(new C30708e8(this, atomicReference, mo87021C(false), z));
    }

    @C0348i1
    /* renamed from: W */
    public final void mo87035W(C41977h1 h1Var, String str, String str2, boolean z) {
        mo86866h();
        mo86890i();
        mo87024F(new C30695d8(this, str, str2, mo87021C(false), z, h1Var));
    }

    @C0348i1
    /* renamed from: X */
    public final void mo87036X(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo86866h();
        mo86890i();
        mo87024F(new C30928w8(this, atomicReference, (String) null, str2, str3, mo87021C(false), z));
    }

    /* renamed from: n */
    public final boolean mo86895n() {
        return false;
    }

    @C0348i1
    /* renamed from: o */
    public final void mo87037o(zzaw zzaw, String str) {
        C40843u.m166202l(zzaw);
        mo86866h();
        mo86890i();
        mo87025G();
        mo87024F(new C30880s8(this, true, mo87021C(true), this.f74136a.mo87100C().mo87293v(zzaw), zzaw, str));
    }

    @C0348i1
    /* renamed from: p */
    public final void mo87038p(C41977h1 h1Var, zzaw zzaw, String str) {
        mo86866h();
        mo86890i();
        if (this.f74136a.mo87110N().mo87539r0(C40864j.f103985a) != 0) {
            this.f74136a.mo86903d().mo87494w().mo87463a("Not bundling data. Service unavailable or out of date");
            this.f74136a.mo87110N().mo87508H(h1Var, new byte[0]);
            return;
        }
        mo87024F(new C30832o8(this, zzaw, str, h1Var));
    }

    @C0348i1
    /* renamed from: q */
    public final void mo87039q() {
        mo86866h();
        mo86890i();
        zzq C = mo87021C(false);
        mo87025G();
        this.f74136a.mo87100C().mo87288q();
        mo87024F(new C30747h8(this, C));
    }

    @C0348i1
    @C40974d0
    /* renamed from: r */
    public final void mo87040r(C30779k3 k3Var, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        mo86866h();
        mo86890i();
        mo87025G();
        this.f74136a.mo87130z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f74136a.mo87100C().mo87287p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        k3Var.mo87154M2((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        this.f74136a.mo86903d().mo87489r().mo87464b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzli) {
                    try {
                        k3Var.mo87160c4((zzli) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        this.f74136a.mo86903d().mo87489r().mo87464b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        k3Var.mo87158Z7((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        this.f74136a.mo86903d().mo87489r().mo87464b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    @C0348i1
    /* renamed from: s */
    public final void mo87041s(zzac zzac) {
        C40843u.m166202l(zzac);
        mo86866h();
        mo86890i();
        this.f74136a.mo86901b();
        mo87024F(new C30892t8(this, true, mo87021C(true), this.f74136a.mo87100C().mo87292u(zzac), new zzac(zzac), zzac));
    }

    @C0348i1
    /* renamed from: t */
    public final void mo87042t(boolean z) {
        mo86866h();
        mo86890i();
        if (z) {
            mo87025G();
            this.f74136a.mo87100C().mo87288q();
        }
        if (mo87019A()) {
            mo87024F(new C30868r8(this, mo87021C(false)));
        }
    }

    @C0348i1
    /* renamed from: u */
    public final void mo87043u(C30903u7 u7Var) {
        mo86866h();
        mo86890i();
        mo87024F(new C30796l8(this, u7Var));
    }

    @C0348i1
    /* renamed from: v */
    public final void mo87044v(Bundle bundle) {
        mo86866h();
        mo86890i();
        mo87024F(new C30808m8(this, mo87021C(false), bundle));
    }

    @C0348i1
    /* renamed from: w */
    public final void mo87045w() {
        mo86866h();
        mo86890i();
        mo87024F(new C30856q8(this, mo87021C(true)));
    }

    @C0348i1
    @C40974d0
    /* renamed from: x */
    public final void mo87046x(C30779k3 k3Var) {
        mo86866h();
        C40843u.m166202l(k3Var);
        this.f73339d = k3Var;
        mo87023E();
        mo87022D();
    }

    @C0348i1
    /* renamed from: y */
    public final void mo87047y(zzli zzli) {
        mo86866h();
        mo86890i();
        mo87025G();
        mo87024F(new C30734g8(this, mo87021C(true), this.f74136a.mo87100C().mo87294w(zzli), zzli));
    }

    @C0348i1
    /* renamed from: z */
    public final boolean mo87048z() {
        mo86866h();
        mo86890i();
        if (this.f73339d != null) {
            return true;
        }
        return false;
    }
}
