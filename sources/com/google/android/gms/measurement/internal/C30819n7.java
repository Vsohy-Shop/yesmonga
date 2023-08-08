package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.collection.C1866a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41955ff;
import com.google.android.gms.internal.measurement.C42164rd;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
public final class C30819n7 extends C30665b4 {
    @C40974d0

    /* renamed from: c */
    public C30807m7 f73772c;

    /* renamed from: d */
    public C30745h6 f73773d;

    /* renamed from: e */
    public final Set f73774e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f73775f;

    /* renamed from: g */
    public final AtomicReference f73776g = new AtomicReference();

    /* renamed from: h */
    public final Object f73777h = new Object();
    @C0323b0("consentLock")

    /* renamed from: i */
    public C30738h f73778i = new C30738h((Boolean) null, (Boolean) null);
    @C0323b0("consentLock")

    /* renamed from: j */
    public int f73779j = 100;

    /* renamed from: k */
    public final AtomicLong f73780k = new AtomicLong(0);

    /* renamed from: l */
    public long f73781l = -1;

    /* renamed from: m */
    public int f73782m = 100;

    /* renamed from: n */
    public final C30659ab f73783n;
    @C40974d0

    /* renamed from: o */
    public boolean f73784o = true;

    /* renamed from: p */
    public final C30894ta f73785p = new C30668b7(this);

    public C30819n7(C30731g5 g5Var) {
        super(g5Var);
        this.f73783n = new C30659ab(g5Var);
    }

    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m123962c0(C30819n7 n7Var, C30738h hVar, C30738h hVar2) {
        boolean z;
        zzah[] zzahArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzah = zzahArr[i];
            if (!hVar2.mo87142i(zzah) && hVar.mo87142i(zzah)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = hVar.mo87144l(hVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || l) {
            n7Var.f74136a.mo87099B().mo87249v();
        }
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m123963d0(C30819n7 n7Var, C30738h hVar, int i, long j, boolean z, boolean z2) {
        n7Var.mo86866h();
        n7Var.mo86890i();
        if (j > n7Var.f73781l || !C30738h.m123797j(n7Var.f73782m, i)) {
            C30780k4 F = n7Var.f74136a.mo87103F();
            C30731g5 g5Var = F.f74136a;
            F.mo86866h();
            if (F.mo87199w(i)) {
                SharedPreferences.Editor edit = F.mo87191o().edit();
                edit.putString("consent_settings", hVar.mo87140h());
                edit.putInt("consent_source", i);
                edit.apply();
                n7Var.f73781l = j;
                n7Var.f73782m = i;
                n7Var.f74136a.mo87108L().mo87042t(z);
                if (z2) {
                    n7Var.f74136a.mo87108L().mo87031S(new AtomicReference());
                    return;
                }
                return;
            }
            n7Var.f74136a.mo86903d().mo87492u().mo87464b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        n7Var.f74136a.mo86903d().mo87492u().mo87464b("Dropped out-of-date consent setting, proposed settings", hVar);
    }

    /* renamed from: A */
    public final void mo87299A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f74136a.mo86904f().mo86950z(new C30866r6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    public final void mo87300B(String str, String str2, long j, Object obj) {
        this.f74136a.mo86904f().mo86950z(new C30878s6(this, str, str2, obj, j));
    }

    /* renamed from: C */
    public final void mo87301C(String str) {
        this.f73776g.set(str);
    }

    /* renamed from: D */
    public final void mo87302D(Bundle bundle) {
        mo87303E(bundle, this.f74136a.mo86900a().mo134768a());
    }

    /* renamed from: E */
    public final void mo87303E(Bundle bundle, long j) {
        C40843u.m166202l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f74136a.mo86903d().mo87494w().mo87463a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C40843u.m166202l(bundle2);
        Class<String> cls = String.class;
        C30680c6.m123533a(bundle2, "app_id", cls, (Object) null);
        C30680c6.m123533a(bundle2, "origin", cls, (Object) null);
        C30680c6.m123533a(bundle2, "name", cls, (Object) null);
        C30680c6.m123533a(bundle2, "value", Object.class, (Object) null);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73195d, cls, (Object) null);
        Class<Long> cls2 = Long.class;
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73196e, cls2, 0L);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73197f, cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73198g, cls3, (Object) null);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73199h, cls, (Object) null);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73200i, cls3, (Object) null);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73201j, cls2, 0L);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73202k, cls, (Object) null);
        C30680c6.m123533a(bundle2, C30638a.C30639a.f73203l, cls3, (Object) null);
        C40843u.m166198h(bundle2.getString("name"));
        C40843u.m166198h(bundle2.getString("origin"));
        C40843u.m166202l(bundle2.get("value"));
        bundle2.putLong(C30638a.C30639a.f73204m, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f74136a.mo87110N().mo87535p0(string) != 0) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Invalid conditional user property name", this.f74136a.mo87101D().mo87412f(string));
        } else if (this.f74136a.mo87110N().mo87529l0(string, obj) == 0) {
            Object p = this.f74136a.mo87110N().mo87534p(string, obj);
            if (p == null) {
                this.f74136a.mo86903d().mo87489r().mo87465c("Unable to normalize conditional user property value", this.f74136a.mo87101D().mo87412f(string), obj);
                return;
            }
            C30680c6.m123534b(bundle2, p);
            long j2 = bundle2.getLong(C30638a.C30639a.f73196e);
            if (!TextUtils.isEmpty(bundle2.getString(C30638a.C30639a.f73195d))) {
                this.f74136a.mo87130z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f74136a.mo86903d().mo87489r().mo87465c("Invalid conditional user property timeout", this.f74136a.mo87101D().mo87412f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong(C30638a.C30639a.f73201j);
            this.f74136a.mo87130z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f74136a.mo86903d().mo87489r().mo87465c("Invalid conditional user property time to live", this.f74136a.mo87101D().mo87412f(string), Long.valueOf(j3));
            } else {
                this.f74136a.mo86904f().mo86950z(new C30914v6(this, bundle2));
            }
        } else {
            this.f74136a.mo86903d().mo87489r().mo87465c("Invalid conditional user property value", this.f74136a.mo87101D().mo87412f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo87304F(Bundle bundle, int i, long j) {
        mo86890i();
        String g = C30738h.m123796g(bundle);
        if (g != null) {
            this.f74136a.mo86903d().mo87495x().mo87464b("Ignoring invalid consent setting", g);
            this.f74136a.mo86903d().mo87495x().mo87463a("Valid consent values are 'granted', 'denied'");
        }
        mo87305G(C30738h.m123794a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo87305G(C30738h hVar, int i, long j) {
        C30738h hVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C30738h hVar3 = hVar;
        int i2 = i;
        mo86890i();
        if (i2 != -10 && hVar.mo87137e() == null && hVar.mo87139f() == null) {
            this.f74136a.mo86903d().mo87495x().mo87463a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f73777h) {
            hVar2 = this.f73778i;
            z = false;
            if (C30738h.m123797j(i2, this.f73779j)) {
                z3 = hVar3.mo87143k(this.f73778i);
                zzah zzah = zzah.ANALYTICS_STORAGE;
                if (hVar3.mo87142i(zzah) && !this.f73778i.mo87142i(zzah)) {
                    z = true;
                }
                hVar3 = hVar3.mo87136d(this.f73778i);
                this.f73778i = hVar3;
                this.f73779j = i2;
                z2 = z;
                z = true;
            } else {
                z3 = false;
                z2 = false;
            }
        }
        if (!z) {
            this.f74136a.mo86903d().mo87492u().mo87464b("Ignoring lower-priority consent settings, proposed settings", hVar3);
            return;
        }
        long andIncrement = this.f73780k.getAndIncrement();
        if (z3) {
            this.f73776g.set((Object) null);
            this.f74136a.mo86904f().mo86942A(new C30759i7(this, hVar3, j, i, andIncrement, z2, hVar2));
            return;
        }
        C30771j7 j7Var = new C30771j7(this, hVar3, i, andIncrement, z2, hVar2);
        if (i2 == 30 || i2 == -10) {
            this.f74136a.mo86904f().mo86942A(j7Var);
        } else {
            this.f74136a.mo86904f().mo86950z(j7Var);
        }
    }

    @C0348i1
    /* renamed from: H */
    public final void mo87306H(C30745h6 h6Var) {
        C30745h6 h6Var2;
        boolean z;
        mo86866h();
        mo86890i();
        if (!(h6Var == null || h6Var == (h6Var2 = this.f73773d))) {
            if (h6Var2 == null) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "EventInterceptor already set.");
        }
        this.f73773d = h6Var;
    }

    /* renamed from: I */
    public final void mo87307I(Boolean bool) {
        mo86890i();
        this.f74136a.mo86904f().mo86950z(new C30746h7(this, bool));
    }

    @C0348i1
    /* renamed from: J */
    public final void mo87308J(C30738h hVar) {
        boolean z;
        Boolean bool;
        mo86866h();
        if ((!hVar.mo87142i(zzah.ANALYTICS_STORAGE) || !hVar.mo87142i(zzah.AD_STORAGE)) && !this.f74136a.mo87108L().mo87019A()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f74136a.mo87124p()) {
            this.f74136a.mo87120l(z);
            C30780k4 F = this.f74136a.mo87103F();
            C30731g5 g5Var = F.f74136a;
            F.mo86866h();
            if (F.mo87191o().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(F.mo87191o().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                mo87313O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo87309K(String str, String str2, Object obj, boolean z) {
        mo87310L("auto", "_ldl", obj, true, this.f74136a.mo86900a().mo134768a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87310L(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L_0x0017
            com.google.android.gms.measurement.internal.g5 r4 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r4 = r4.mo87110N()
            int r4 = r4.mo87535p0(r2)
        L_0x0015:
            r12 = r4
            goto L_0x0041
        L_0x0017:
            com.google.android.gms.measurement.internal.g5 r4 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r4 = r4.mo87110N()
            java.lang.String r5 = "user property"
            boolean r7 = r4.mo87519S(r5, r2)
            r8 = 6
            if (r7 != 0) goto L_0x0028
        L_0x0026:
            r12 = r8
            goto L_0x0041
        L_0x0028:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.C30732g6.f73458a
            r9 = 0
            boolean r7 = r4.mo87516P(r5, r7, r9, r2)
            if (r7 != 0) goto L_0x0034
            r4 = 15
            goto L_0x0015
        L_0x0034:
            com.google.android.gms.measurement.internal.g5 r7 = r4.f74136a
            r7.mo87130z()
            boolean r4 = r4.mo87514N(r5, r3, r2)
            if (r4 != 0) goto L_0x0040
            goto L_0x0026
        L_0x0040:
            r12 = r1
        L_0x0041:
            r4 = 1
            if (r12 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.g5 r0 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r0 = r0.mo87110N()
            com.google.android.gms.measurement.internal.g5 r5 = r6.f74136a
            r5.mo87130z()
            java.lang.String r14 = r0.mo87538r(r2, r3, r4)
            if (r2 == 0) goto L_0x0059
            int r1 = r18.length()
        L_0x0059:
            r15 = r1
            com.google.android.gms.measurement.internal.g5 r0 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r9 = r0.mo87110N()
            com.google.android.gms.measurement.internal.ta r10 = r6.f73785p
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.mo87503C(r10, r11, r12, r13, r14, r15)
            return
        L_0x0069:
            if (r17 != 0) goto L_0x006e
            java.lang.String r5 = "app"
            goto L_0x0070
        L_0x006e:
            r5 = r17
        L_0x0070:
            if (r0 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.g5 r7 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r7 = r7.mo87110N()
            int r11 = r7.mo87529l0(r2, r0)
            if (r11 == 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.g5 r5 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r5 = r5.mo87110N()
            com.google.android.gms.measurement.internal.g5 r7 = r6.f74136a
            r7.mo87130z()
            java.lang.String r13 = r5.mo87538r(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x0095
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L_0x009d
        L_0x0095:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
        L_0x009d:
            r14 = r1
            com.google.android.gms.measurement.internal.g5 r0 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r8 = r0.mo87110N()
            com.google.android.gms.measurement.internal.ta r9 = r6.f73785p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.mo87503C(r9, r10, r11, r12, r13, r14)
            return
        L_0x00ad:
            com.google.android.gms.measurement.internal.g5 r1 = r6.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            java.lang.Object r7 = r1.mo87534p(r2, r0)
            if (r7 == 0) goto L_0x00c4
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.mo87300B(r1, r2, r3, r5)
        L_0x00c4:
            return
        L_0x00c5:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.mo87300B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30819n7.mo87310L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    @androidx.annotation.C0348i1
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87311M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C40843u.m166198h(r9)
            com.google.android.gms.common.internal.C40843u.m166198h(r10)
            r8.mo86866h()
            r8.mo86890i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.g5 r10 = r8.f74136a
            com.google.android.gms.measurement.internal.k4 r10 = r10.mo87103F()
            com.google.android.gms.measurement.internal.j4 r10 = r10.f73657m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo87180b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.g5 r10 = r8.f74136a
            com.google.android.gms.measurement.internal.k4 r10 = r10.mo87103F()
            com.google.android.gms.measurement.internal.j4 r10 = r10.f73657m
            java.lang.String r0 = "unset"
            r10.mo87180b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.g5 r10 = r8.f74136a
            boolean r10 = r10.mo87123o()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.g5 r9 = r8.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87493v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo87463a(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.g5 r10 = r8.f74136a
            boolean r10 = r10.mo87126r()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzli r10 = new com.google.android.gms.measurement.internal.zzli
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.g5 r9 = r8.f74136a
            com.google.android.gms.measurement.internal.d9 r9 = r9.mo87108L()
            r9.mo87047y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30819n7.mo87311M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo87312N(C30758i6 i6Var) {
        mo86890i();
        C40843u.m166202l(i6Var);
        if (!this.f73774e.remove(i6Var)) {
            this.f74136a.mo86903d().mo87494w().mo87463a("OnEventListener had not been registered");
        }
    }

    @C0348i1
    /* renamed from: O */
    public final void mo87313O(Boolean bool, boolean z) {
        mo86866h();
        mo86890i();
        this.f74136a.mo86903d().mo87488q().mo87464b("Setting app measurement enabled (FE)", bool);
        this.f74136a.mo87103F().mo87195s(bool);
        if (z) {
            C30780k4 F = this.f74136a.mo87103F();
            C30731g5 g5Var = F.f74136a;
            F.mo86866h();
            SharedPreferences.Editor edit = F.mo87191o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f74136a.mo87124p() || (bool != null && !bool.booleanValue())) {
            mo87314P();
        }
    }

    @C0348i1
    /* renamed from: P */
    public final void mo87314P() {
        long j;
        mo86866h();
        String a = this.f74136a.mo87103F().f73657m.mo87179a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo87311M(FirebaseMessaging.f80405r, "_npa", (Object) null, this.f74136a.mo86900a().mo134768a());
            } else {
                if (true != C13758b.f33436b.equals(a)) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo87311M(FirebaseMessaging.f80405r, "_npa", Long.valueOf(j), this.f74136a.mo86900a().mo134768a());
            }
        }
        if (!this.f74136a.mo87123o() || !this.f73784o) {
            this.f74136a.mo86903d().mo87488q().mo87463a("Updating Scion state (FE)");
            this.f74136a.mo87108L().mo87045w();
            return;
        }
        this.f74136a.mo86903d().mo87488q().mo87463a("Recording app launch after enabling measurement for the first time (FE)");
        mo87327g0();
        C42164rd.m170787b();
        if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73536h0)) {
            this.f74136a.mo87109M().f74005d.mo87481a();
        }
        this.f74136a.mo86904f().mo86950z(new C30842p6(this));
    }

    /* renamed from: Q */
    public final int mo87315Q(String str) {
        C40843u.m166198h(str);
        this.f74136a.mo87130z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo87316R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f74136a.mo86904f().mo86946r(atomicReference, 15000, "boolean test flag value", new C30950y6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo87317S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f74136a.mo86904f().mo86946r(atomicReference, 15000, "double test flag value", new C30733g7(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo87318T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f74136a.mo86904f().mo86946r(atomicReference, 15000, "int test flag value", new C30720f7(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo87319U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f74136a.mo86904f().mo86946r(atomicReference, 15000, "long test flag value", new C30694d7(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo87320V() {
        return (String) this.f73776g.get();
    }

    /* renamed from: W */
    public final String mo87321W() {
        C30903u7 r = this.f74136a.mo87107K().mo86921r();
        if (r != null) {
            return r.f73994b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo87322X() {
        C30903u7 r = this.f74136a.mo87107K().mo86921r();
        if (r != null) {
            return r.f73993a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo87323Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f74136a.mo86904f().mo86946r(atomicReference, 15000, "String test flag value", new C30681c7(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo87324Z(String str, String str2) {
        if (this.f74136a.mo86904f().mo86943C()) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f74136a.mo86901b();
        if (C30673c.m123531a()) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f74136a.mo86904f().mo86946r(atomicReference, 5000, "get conditional user properties", new C30938x6(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C30906ua.m124217v(list);
        }
        this.f74136a.mo86903d().mo87489r().mo87464b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final List mo87325a0(boolean z) {
        mo86890i();
        this.f74136a.mo86903d().mo87493v().mo87463a("Getting user properties (FE)");
        if (!this.f74136a.mo86904f().mo86943C()) {
            this.f74136a.mo86901b();
            if (C30673c.m123531a()) {
                this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.f74136a.mo86904f().mo86946r(atomicReference, 5000, "get user properties", new C30890t6(this, atomicReference, z));
            List list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            this.f74136a.mo86903d().mo87489r().mo87464b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    /* renamed from: b0 */
    public final Map mo87326b0(String str, String str2, boolean z) {
        if (this.f74136a.mo86904f().mo86943C()) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f74136a.mo86901b();
        if (C30673c.m123531a()) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f74136a.mo86904f().mo86946r(atomicReference, 5000, "get user properties", new C30962z6(this, atomicReference, (String) null, str, str2, z));
        List<zzli> list = (List) atomicReference.get();
        if (list == null) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C1866a aVar = new C1866a(list.size());
        for (zzli zzli : list) {
            Object M = zzli.mo87644M();
            if (M != null) {
                aVar.put(zzli.f74168b, M);
            }
        }
        return aVar;
    }

    @C0348i1
    /* renamed from: g0 */
    public final void mo87327g0() {
        mo86866h();
        mo86890i();
        if (this.f74136a.mo87126r()) {
            if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73524b0)) {
                C30725g z = this.f74136a.mo87130z();
                z.f74136a.mo86901b();
                Boolean t = z.mo87087t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f74136a.mo86903d().mo87488q().mo87463a("Deferred Deep Link feature enabled.");
                    this.f74136a.mo86904f().mo86950z(new C30830o6(this));
                }
            }
            this.f74136a.mo87108L().mo87027O();
            this.f73784o = false;
            C30780k4 F = this.f74136a.mo87103F();
            F.mo86866h();
            String string = F.mo87191o().getString("previous_os_version", (String) null);
            F.f74136a.mo87098A().mo86873k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo87191o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f74136a.mo87098A().mo86873k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo87334u("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: n */
    public final boolean mo86895n() {
        return false;
    }

    /* renamed from: o */
    public final void mo87328o(String str, String str2, Bundle bundle) {
        long a = this.f74136a.mo86900a().mo134768a();
        C40843u.m166198h(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(C30638a.C30639a.f73204m, a);
        if (str2 != null) {
            bundle2.putString(C30638a.C30639a.f73202k, str2);
            bundle2.putBundle(C30638a.C30639a.f73203l, bundle);
        }
        this.f74136a.mo86904f().mo86950z(new C30926w6(this, bundle2));
    }

    /* renamed from: p */
    public final void mo87329p() {
        if ((this.f74136a.mo86902c().getApplicationContext() instanceof Application) && this.f73772c != null) {
            ((Application) this.f74136a.mo86902c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f73772c);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo87330q(Bundle bundle) {
        if (bundle == null) {
            this.f74136a.mo87103F().f73668x.mo87057b(new Bundle());
            return;
        }
        Bundle a = this.f74136a.mo87103F().f73668x.mo87056a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f74136a.mo87110N().mo87522V(obj)) {
                    this.f74136a.mo87110N().mo87503C(this.f73785p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f74136a.mo86903d().mo87495x().mo87465c("Invalid default event parameter type. Name, value", next, obj);
            } else if (C30906ua.m124206Y(next)) {
                this.f74136a.mo86903d().mo87495x().mo87464b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a.remove(next);
            } else {
                C30906ua N = this.f74136a.mo87110N();
                this.f74136a.mo87130z();
                if (N.mo87517Q("param", next, 100, obj)) {
                    this.f74136a.mo87110N().mo87504D(a, next, obj);
                }
            }
        }
        this.f74136a.mo87110N();
        int m = this.f74136a.mo87130z().mo87080m();
        if (a.size() > m) {
            int i = 0;
            for (String str : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str);
                }
            }
            this.f74136a.mo87110N().mo87503C(this.f73785p, (String) null, 26, (String) null, (String) null, 0);
            this.f74136a.mo86903d().mo87495x().mo87463a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f74136a.mo87103F().f73668x.mo87057b(a);
        this.f74136a.mo87108L().mo87044v(a);
    }

    /* renamed from: r */
    public final void mo87331r(String str, String str2, Bundle bundle) {
        mo87332s(str, str2, bundle, true, true, this.f74136a.mo86900a().mo134768a());
    }

    /* renamed from: s */
    public final void mo87332s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2;
        String str3 = str2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str3 == FirebaseAnalytics.C32531a.f78878A || (str3 != null && str2.equals(FirebaseAnalytics.C32531a.f78878A))) {
            this.f74136a.mo87107K().mo86916E(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.f73773d != null && !C30906ua.m124206Y(str2)) {
            z3 = false;
        }
        mo87299A(str == null ? FirebaseMessaging.f80405r : str, str2, j, bundle2, z2, z3, z, (String) null);
    }

    /* renamed from: t */
    public final void mo87333t(String str, String str2, Bundle bundle, String str3) {
        C30731g5.m123742t();
        mo87299A("auto", str2, this.f74136a.mo86900a().mo134768a(), bundle, false, true, true, str3);
    }

    @C0348i1
    /* renamed from: u */
    public final void mo87334u(String str, String str2, Bundle bundle) {
        mo86866h();
        mo87335v(str, str2, this.f74136a.mo86900a().mo134768a(), bundle);
    }

    @C0348i1
    /* renamed from: v */
    public final void mo87335v(String str, String str2, long j, Bundle bundle) {
        boolean z;
        mo86866h();
        if (this.f73773d == null || C30906ua.m124206Y(str2)) {
            z = true;
        } else {
            z = false;
        }
        mo87336w(str, str2, j, bundle, true, z, true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0348i1
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87336w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            com.google.android.gms.common.internal.C40843u.m166198h(r20)
            com.google.android.gms.common.internal.C40843u.m166202l(r24)
            r19.mo86866h()
            r19.mo86890i()
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            boolean r0 = r0.mo87123o()
            if (r0 == 0) goto L_0x04f2
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo87099B()
            java.util.List r0 = r0.mo87248u()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo87465c(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.f73775f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.f73775f = r15
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.mo87127s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.mo86902c()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r14] = r3     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo86902c()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87494w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo87464b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87492u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo87463a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo86901b()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.common.util.g r0 = r0.mo86900a()
            long r5 = r0.mo134768a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo87311M(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            r0.mo86901b()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C30906ua.m124210c0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r0 = r0.mo87110N()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.f4 r1 = r1.f73668x
            android.os.Bundle r1 = r1.mo87056a()
            r0.mo87550z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo86901b()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo87519S(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.C30706e6.f73358a
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C30706e6.f73359b
            boolean r3 = r1.mo87516P(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.g5 r3 = r1.f74136a
            r3.mo87130z()
            boolean r1 = r1.mo87514N(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = r14
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87490s()
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo87101D()
            java.lang.String r2 = r2.mo87410d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo87464b(r3, r2)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            r2.mo87130z()
            java.lang.String r0 = r1.mo87538r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            com.google.android.gms.measurement.internal.ta r2 = r7.f73785p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo87503C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo86901b()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.c8 r1 = r1.mo87107K()
            com.google.android.gms.measurement.internal.u7 r1 = r1.mo86922s(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f73996d = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = r15
            goto L_0x0199
        L_0x0198:
            r3 = r14
        L_0x0199:
            com.google.android.gms.measurement.internal.C30906ua.m124218y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C30906ua.m124206Y(r21)
            if (r25 == 0) goto L_0x01e9
            com.google.android.gms.measurement.internal.h6 r4 = r7.f73773d
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = r15
            goto L_0x01eb
        L_0x01b3:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo87101D()
            java.lang.String r1 = r1.mo87410d(r9)
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo87101D()
            java.lang.String r2 = r2.mo87408b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo87465c(r3, r1, r2)
            com.google.android.gms.measurement.internal.h6 r0 = r7.f73773d
            com.google.android.gms.common.internal.C40843u.m166202l(r0)
            com.google.android.gms.measurement.internal.h6 r1 = r7.f73773d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo86738a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            boolean r1 = r1.mo87126r()
            if (r1 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            int r1 = r1.mo87530m0(r9)
            if (r1 == 0) goto L_0x0249
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87490s()
            com.google.android.gms.measurement.internal.g5 r3 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo87464b(r4, r3)
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            com.google.android.gms.measurement.internal.g5 r3 = r7.f74136a
            r3.mo87130z()
            java.lang.String r0 = r2.mo87538r(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            com.google.android.gms.measurement.internal.ta r3 = r7.f73785p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo87503C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_sn"
            java.lang.String r1 = "_si"
            java.lang.String r6 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2, r1}
            java.util.List r5 = com.google.android.gms.common.util.C40981h.m166623d(r0)
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r0.mo87110N()
            r2 = r28
            r3 = r21
            r4 = r24
            r0 = r6
            r6 = r27
            android.os.Bundle r12 = r1.mo87548x0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.C40843u.m166202l(r12)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo86901b()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.c8 r1 = r1.mo87107K()
            com.google.android.gms.measurement.internal.u7 r1 = r1.mo86922s(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02af
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02af
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u9 r1 = r1.mo87109M()
            com.google.android.gms.measurement.internal.s9 r1 = r1.f74006e
            com.google.android.gms.measurement.internal.u9 r2 = r1.f73954d
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.common.util.g r2 = r2.mo86900a()
            long r14 = r2.mo134770c()
            long r3 = r1.f73952b
            long r2 = r14 - r3
            r1.f73952b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02af
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            r1.mo87545w(r12, r2)
        L_0x02af:
            com.google.android.gms.internal.measurement.C41935ed.m169830b()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.g r1 = r1.mo87130z()
            com.google.android.gms.measurement.internal.g3 r2 = com.google.android.gms.measurement.internal.C30742h3.f73534g0
            boolean r1 = r1.mo87070B(r13, r2)
            if (r1 == 0) goto L_0x0339
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0318
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0318
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C40966b0.m166592b(r2)
            if (r3 == 0) goto L_0x02e4
            r2 = r13
            goto L_0x02ea
        L_0x02e4:
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = r2.trim()
        L_0x02ea:
            com.google.android.gms.measurement.internal.g5 r3 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r3 = r3.mo87103F()
            com.google.android.gms.measurement.internal.j4 r3 = r3.f73665u
            java.lang.String r3 = r3.mo87179a()
            boolean r3 = com.google.android.gms.measurement.internal.C30882sa.m124169a(r2, r3)
            if (r3 != 0) goto L_0x0308
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.j4 r1 = r1.f73665u
            r1.mo87180b(r2)
            goto L_0x0339
        L_0x0308:
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo87463a(r1)
            return
        L_0x0318:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0339
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.j4 r1 = r1.f73665u
            java.lang.String r1 = r1.mo87179a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0339
            r12.putString(r2, r1)
        L_0x0339:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.g4 r1 = r1.f73659o
            long r1 = r1.mo87096a()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            boolean r1 = r1.mo87198v(r10)
            if (r1 == 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.e4 r1 = r1.f73662r
            boolean r1 = r1.mo87052b()
            if (r1 == 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo87463a(r2)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.common.util.g r1 = r1.mo86900a()
            long r17 = r1.mo134768a()
            java.lang.String r2 = "auto"
            java.lang.String r6 = "_sid"
            r15 = 0
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r6
            r4 = r15
            r15 = r5
            r5 = r17
            r1.mo87311M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.common.util.g r1 = r1.mo86900a()
            long r5 = r1.mo134768a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r4 = 0
            r1 = r19
            r1.mo87311M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.common.util.g r1 = r1.mo86900a()
            long r5 = r1.mo134768a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo87311M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.g4 r1 = r1.f73660p
            r1.mo87097b(r13)
            goto L_0x03cf
        L_0x03cb:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03cf:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo87463a(r2)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u9 r1 = r1.mo87109M()
            com.google.android.gms.measurement.internal.t9 r1 = r1.f74005d
            r2 = 1
            r1.mo87482b(r10, r2)
        L_0x03f6:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0407:
            if (r3 >= r2) goto L_0x0455
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0452
            com.google.android.gms.measurement.internal.g5 r5 = r7.f74136a
            r5.mo87110N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0427
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x044d
        L_0x0427:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0438
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044d
        L_0x0438:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x044c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044d
        L_0x044c:
            r13 = 0
        L_0x044d:
            if (r13 == 0) goto L_0x0452
            r12.putParcelableArray(r4, r13)
        L_0x0452:
            int r3 = r3 + 1
            goto L_0x0407
        L_0x0455:
            r12 = 0
        L_0x0456:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04c3
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0469
            java.lang.String r2 = "_ep"
            goto L_0x046a
        L_0x0469:
            r2 = r9
        L_0x046a:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0479
            com.google.android.gms.measurement.internal.g5 r3 = r7.f74136a
            com.google.android.gms.measurement.internal.ua r3 = r3.mo87110N()
            android.os.Bundle r1 = r3.mo87546w0(r1)
        L_0x0479:
            r14 = r1
            com.google.android.gms.measurement.internal.zzaw r5 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r17 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo87108L()
            r5 = r28
            r1.mo87037o(r0, r5)
            if (r16 != 0) goto L_0x04bc
            java.util.Set r0 = r7.f73774e
            java.util.Iterator r0 = r0.iterator()
        L_0x049f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04bc
            java.lang.Object r1 = r0.next()
            com.google.android.gms.measurement.internal.i6 r1 = (com.google.android.gms.measurement.internal.C30758i6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo86739a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049f
        L_0x04bc:
            int r12 = r12 + 1
            r24 = r13
            r0 = r17
            goto L_0x0456
        L_0x04c3:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            r0.mo86901b()
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.c8 r0 = r0.mo87107K()
            r1 = 0
            com.google.android.gms.measurement.internal.u7 r0 = r0.mo86922s(r1)
            if (r0 == 0) goto L_0x04f1
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u9 r0 = r0.mo87109M()
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.common.util.g r1 = r1.mo86900a()
            long r1 = r1.mo134770c()
            com.google.android.gms.measurement.internal.s9 r0 = r0.f74006e
            r3 = 1
            r0.mo87474d(r3, r3, r1)
        L_0x04f1:
            return
        L_0x04f2:
            com.google.android.gms.measurement.internal.g5 r0 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo87463a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30819n7.mo87336w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo87337x(C30758i6 i6Var) {
        mo86890i();
        C40843u.m166202l(i6Var);
        if (!this.f73774e.add(i6Var)) {
            this.f74136a.mo86903d().mo87494w().mo87463a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo87338y(long j) {
        this.f73776g.set((Object) null);
        this.f74136a.mo86904f().mo86950z(new C30902u6(this, j));
    }

    /* renamed from: z */
    public final void mo87339z(long j, boolean z) {
        mo86866h();
        mo86890i();
        this.f74136a.mo86903d().mo87488q().mo87463a("Resetting analytics data (FE)");
        C30905u9 M = this.f74136a.mo87109M();
        M.mo86866h();
        M.f74006e.mo87471a();
        C41955ff.m169896b();
        if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73552p0)) {
            this.f74136a.mo87099B().mo87249v();
        }
        boolean o = this.f74136a.mo87123o();
        C30780k4 F = this.f74136a.mo87103F();
        F.f73649e.mo87097b(j);
        if (!TextUtils.isEmpty(F.f74136a.mo87103F().f73665u.mo87179a())) {
            F.f73665u.mo87180b((String) null);
        }
        C42164rd.m170787b();
        C30725g z2 = F.f74136a.mo87130z();
        C30729g3 g3Var = C30742h3.f73536h0;
        if (z2.mo87070B((String) null, g3Var)) {
            F.f73659o.mo87097b(0);
        }
        F.f73660p.mo87097b(0);
        if (!F.f74136a.mo87130z().mo87073E()) {
            F.mo87196t(!o);
        }
        F.f73666v.mo87180b((String) null);
        F.f73667w.mo87097b(0);
        F.f73668x.mo87057b((Bundle) null);
        if (z) {
            this.f74136a.mo87108L().mo87039q();
        }
        C42164rd.m170787b();
        if (this.f74136a.mo87130z().mo87070B((String) null, g3Var)) {
            this.f74136a.mo87109M().f74005d.mo87481a();
        }
        this.f73784o = !o;
    }
}
