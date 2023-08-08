package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import androidx.collection.C1866a;
import androidx.collection.C1879j;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41869b1;
import com.google.android.gms.internal.measurement.C41926e4;
import com.google.android.gms.internal.measurement.C41944f4;
import com.google.android.gms.internal.measurement.C41980h4;
import com.google.android.gms.internal.measurement.C41998i4;
import com.google.android.gms.internal.measurement.C42070m4;
import com.google.android.gms.internal.measurement.C42115of;
import com.google.android.gms.internal.measurement.C42224v5;
import com.google.android.gms.internal.measurement.C42258x5;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzll;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.channel.C9029l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final class C30936x4 extends C30965z9 implements C30712f {

    /* renamed from: d */
    public final Map f74068d = new C1866a();
    @C40974d0

    /* renamed from: e */
    public final Map f74069e = new C1866a();
    @C40974d0

    /* renamed from: f */
    public final Map f74070f = new C1866a();
    @C40974d0

    /* renamed from: g */
    public final Map f74071g = new C1866a();

    /* renamed from: h */
    public final Map f74072h = new C1866a();

    /* renamed from: i */
    public final Map f74073i = new C1866a();
    @C40974d0

    /* renamed from: j */
    public final C1879j f74074j = new C30900u4(this, 20);

    /* renamed from: k */
    public final C42115of f74075k = new C30912v4(this);

    /* renamed from: l */
    public final Map f74076l = new C1866a();

    /* renamed from: m */
    public final Map f74077m = new C1866a();

    /* renamed from: n */
    public final Map f74078n = new C1866a();

    public C30936x4(C30822na naVar) {
        super(naVar);
    }

    /* renamed from: q */
    public static final Map m124281q(C41998i4 i4Var) {
        C1866a aVar = new C1866a();
        if (i4Var != null) {
            for (C42070m4 m4Var : i4Var.mo137026P()) {
                aVar.put(m4Var.mo137141C(), m4Var.mo137142D());
            }
        }
        return aVar;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ C41869b1 m124282s(C30936x4 x4Var, String str) {
        x4Var.mo87627i();
        C40843u.m166198h(str);
        if (!x4Var.mo87571C(str)) {
            return null;
        }
        if (!x4Var.f74072h.containsKey(str) || x4Var.f74072h.get(str) == null) {
            x4Var.mo87585o(str);
        } else {
            x4Var.mo87586p(str, (C41998i4) x4Var.f74072h.get(str));
        }
        return (C41869b1) x4Var.f74074j.mo6256q().get(str);
    }

    @C0348i1
    /* renamed from: A */
    public final void mo87569A(String str) {
        mo86866h();
        this.f74072h.remove(str);
    }

    @C0348i1
    /* renamed from: B */
    public final boolean mo87570B(String str) {
        mo86866h();
        C41998i4 t = mo87588t(str);
        if (t == null) {
            return false;
        }
        return t.mo137027S();
    }

    /* renamed from: C */
    public final boolean mo87571C(String str) {
        C41998i4 i4Var;
        if (TextUtils.isEmpty(str) || (i4Var = (C41998i4) this.f74072h.get(str)) == null || i4Var.mo137015B() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean mo87572D(String str) {
        return "1".equals(mo87050e(str, "measurement.upload.blacklist_internal"));
    }

    @C0348i1
    /* renamed from: E */
    public final boolean mo87573E(String str, String str2) {
        Boolean bool;
        mo86866h();
        mo87585o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f74071g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @C0348i1
    /* renamed from: F */
    public final boolean mo87574F(String str, String str2) {
        Boolean bool;
        mo86866h();
        mo87585o(str);
        if (mo87572D(str) && C30906ua.m124206Y(str2)) {
            return true;
        }
        if (mo87575G(str) && C30906ua.m124207Z(str2)) {
            return true;
        }
        Map map = (Map) this.f74070f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final boolean mo87575G(String str) {
        return "1".equals(mo87050e(str, "measurement.upload.blacklist_public"));
    }

    @C0348i1
    /* renamed from: H */
    public final boolean mo87576H(String str, byte[] bArr, String str2, String str3) {
        mo87627i();
        mo86866h();
        C40843u.m166198h(str);
        C41980h4 h4Var = (C41980h4) mo87583m(str, bArr).mo137278k();
        mo87584n(str, h4Var);
        mo87586p(str, (C41998i4) h4Var.mo137180s());
        this.f74072h.put(str, (C41998i4) h4Var.mo137180s());
        this.f74076l.put(str, h4Var.mo136937D());
        this.f74077m.put(str, str2);
        this.f74078n.put(str, str3);
        this.f74068d.put(str, m124281q((C41998i4) h4Var.mo137180s()));
        this.f74119b.mo87360W().mo87231n(str, new ArrayList(h4Var.mo136938E()));
        try {
            h4Var.mo136935B();
            bArr = ((C41998i4) h4Var.mo137180s()).mo136762g();
        } catch (RuntimeException e) {
            this.f74136a.mo86903d().mo87494w().mo87465c("Unable to serialize reduced-size config. Storing full config instead. appId", C30899u3.m124186z(str), e);
        }
        C30787l W = this.f74119b.mo87360W();
        C40843u.m166198h(str);
        W.mo86866h();
        W.mo87627i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) W.mo87212P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f74136a.mo86903d().mo87489r().mo87464b("Failed to update remote config (got 0). appId", C30899u3.m124186z(str));
            }
        } catch (SQLiteException e2) {
            W.f74136a.mo86903d().mo87489r().mo87465c("Error storing remote config. appId", C30899u3.m124186z(str), e2);
        }
        this.f74072h.put(str, (C41998i4) h4Var.mo137180s());
        return true;
    }

    @C0348i1
    /* renamed from: I */
    public final boolean mo87577I(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null || !((Set) this.f74069e.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: J */
    public final boolean mo87578J(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null) {
            return false;
        }
        if (((Set) this.f74069e.get(str)).contains(C9029l.f24302e1)) {
            return true;
        }
        if (!((Set) this.f74069e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: K */
    public final boolean mo87579K(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null || !((Set) this.f74069e.get(str)).contains("enhanced_user_id")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: L */
    public final boolean mo87580L(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null || !((Set) this.f74069e.get(str)).contains("google_signals")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: M */
    public final boolean mo87581M(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null) {
            return false;
        }
        if (((Set) this.f74069e.get(str)).contains(C35554i.f87765Z)) {
            return true;
        }
        if (!((Set) this.f74069e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: N */
    public final boolean mo87582N(String str) {
        mo86866h();
        mo87585o(str);
        if (this.f74069e.get(str) == null || !((Set) this.f74069e.get(str)).contains("user_id")) {
            return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: e */
    public final String mo87050e(String str, String str2) {
        mo86866h();
        mo87585o(str);
        Map map = (Map) this.f74068d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo86867l() {
        return false;
    }

    @C0348i1
    /* renamed from: m */
    public final C41998i4 mo87583m(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C41998i4.m170258H();
        }
        try {
            C41998i4 i4Var = (C41998i4) ((C41980h4) C30846pa.m124112C(C41998i4.m170256F(), bArr)).mo137180s();
            C30875s3 v = this.f74136a.mo86903d().mo87493v();
            String str2 = null;
            if (i4Var.mo137029U()) {
                l = Long.valueOf(i4Var.mo137017D());
            } else {
                l = null;
            }
            if (i4Var.mo137028T()) {
                str2 = i4Var.mo137019I();
            }
            v.mo87465c("Parsed config. version, gmp_app_id", l, str2);
            return i4Var;
        } catch (zzll e) {
            this.f74136a.mo86903d().mo87494w().mo87465c("Unable to merge remote config. appId", C30899u3.m124186z(str), e);
            return C41998i4.m170258H();
        } catch (RuntimeException e2) {
            this.f74136a.mo86903d().mo87494w().mo87465c("Unable to merge remote config. appId", C30899u3.m124186z(str), e2);
            return C41998i4.m170258H();
        }
    }

    /* renamed from: n */
    public final void mo87584n(String str, C41980h4 h4Var) {
        HashSet hashSet = new HashSet();
        C1866a aVar = new C1866a();
        C1866a aVar2 = new C1866a();
        C1866a aVar3 = new C1866a();
        for (C41926e4 C : h4Var.mo136939F()) {
            hashSet.add(C.mo136709C());
        }
        for (int i = 0; i < h4Var.mo136940x(); i++) {
            C41944f4 f4Var = (C41944f4) h4Var.mo136934A(i).mo137278k();
            if (f4Var.mo136752B().isEmpty()) {
                this.f74136a.mo86903d().mo87494w().mo87463a("EventConfig contained null event name");
            } else {
                String B = f4Var.mo136752B();
                String b = C30706e6.m123695b(f4Var.mo136752B());
                if (!TextUtils.isEmpty(b)) {
                    f4Var.mo136751A(b);
                    h4Var.mo136936C(i, f4Var);
                }
                if (f4Var.mo136755E() && f4Var.mo136753C()) {
                    aVar.put(B, Boolean.TRUE);
                }
                if (f4Var.mo136756F() && f4Var.mo136754D()) {
                    aVar2.put(f4Var.mo136752B(), Boolean.TRUE);
                }
                if (f4Var.mo136757G()) {
                    if (f4Var.mo136758x() < 2 || f4Var.mo136758x() > 65535) {
                        this.f74136a.mo86903d().mo87494w().mo87465c("Invalid sampling rate. Event name, sample rate", f4Var.mo136752B(), Integer.valueOf(f4Var.mo136758x()));
                    } else {
                        aVar3.put(f4Var.mo136752B(), Integer.valueOf(f4Var.mo136758x()));
                    }
                }
            }
        }
        this.f74069e.put(str, hashSet);
        this.f74070f.put(str, aVar);
        this.f74071g.put(str, aVar2);
        this.f74073i.put(str, aVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0118  */
    @androidx.annotation.C0348i1
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87585o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo87627i()
            r12.mo86866h()
            com.google.android.gms.common.internal.C40843u.m166198h(r13)
            java.util.Map r0 = r12.f74072h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.na r0 = r12.f74119b
            com.google.android.gms.measurement.internal.l r0 = r0.mo87360W()
            com.google.android.gms.common.internal.C40843u.m166198h(r13)
            r0.mo86866h()
            r0.mo87627i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo87212P()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r5 = "app_id=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r3 != 0) goto L_0x0047
            goto L_0x0096
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0079 }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r6 == 0) goto L_0x006d
            com.google.android.gms.measurement.internal.g5 r6 = r0.f74136a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87489r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r13)     // Catch:{ SQLiteException -> 0x0079 }
            r6.mo87464b(r7, r8)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            com.google.android.gms.measurement.internal.i r6 = new com.google.android.gms.measurement.internal.i     // Catch:{ SQLiteException -> 0x0079 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0079 }
            r2.close()
            goto L_0x009a
        L_0x0079:
            r3 = move-exception
            goto L_0x0081
        L_0x007b:
            r13 = move-exception
            goto L_0x0116
        L_0x007e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0081:
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r13)     // Catch:{ all -> 0x0114 }
            r0.mo87465c(r4, r5, r3)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0099
        L_0x0096:
            r2.close()
        L_0x0099:
            r6 = r1
        L_0x009a:
            if (r6 != 0) goto L_0x00ca
            java.util.Map r0 = r12.f74068d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74070f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74069e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74071g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74072h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74076l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74077m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74078n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74073i
            r0.put(r13, r1)
            return
        L_0x00ca:
            byte[] r0 = r6.f73587a
            com.google.android.gms.internal.measurement.i4 r0 = r12.mo87583m(r13, r0)
            com.google.android.gms.internal.measurement.n9 r0 = r0.mo137278k()
            com.google.android.gms.internal.measurement.h4 r0 = (com.google.android.gms.internal.measurement.C41980h4) r0
            r12.mo87584n(r13, r0)
            java.util.Map r1 = r12.f74068d
            com.google.android.gms.internal.measurement.s9 r2 = r0.mo137180s()
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C41998i4) r2
            java.util.Map r2 = m124281q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f74072h
            com.google.android.gms.internal.measurement.s9 r2 = r0.mo137180s()
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C41998i4) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.s9 r1 = r0.mo137180s()
            com.google.android.gms.internal.measurement.i4 r1 = (com.google.android.gms.internal.measurement.C41998i4) r1
            r12.mo87586p(r13, r1)
            java.util.Map r1 = r12.f74076l
            java.lang.String r0 = r0.mo136937D()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f74077m
            java.lang.String r1 = r6.f73588b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f74078n
            java.lang.String r1 = r6.f73589c
            r0.put(r13, r1)
            return
        L_0x0114:
            r13 = move-exception
            r1 = r2
        L_0x0116:
            if (r1 == 0) goto L_0x011b
            r1.close()
        L_0x011b:
            throw r13
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30936x4.mo87585o(java.lang.String):void");
    }

    @C0348i1
    /* renamed from: p */
    public final void mo87586p(String str, C41998i4 i4Var) {
        if (i4Var.mo137015B() != 0) {
            this.f74136a.mo86903d().mo87493v().mo87464b("EES programs found", Integer.valueOf(i4Var.mo137015B()));
            C42258x5 x5Var = (C42258x5) i4Var.mo137025O().get(0);
            try {
                C41869b1 b1Var = new C41869b1();
                b1Var.mo136601d("internal.remoteConfig", new C30864r4(this, str));
                b1Var.mo136601d("internal.appMetadata", new C30876s4(this, str));
                b1Var.mo136601d("internal.logger", new C30888t4(this));
                b1Var.mo136600c(x5Var);
                this.f74074j.mo6250j(str, b1Var);
                this.f74136a.mo86903d().mo87493v().mo87465c("EES program loaded for appId, activities", str, Integer.valueOf(x5Var.mo137451B().mo137304B()));
                for (C42224v5 C : x5Var.mo137451B().mo137305E()) {
                    this.f74136a.mo86903d().mo87493v().mo87464b("EES program activity", C.mo137371C());
                }
            } catch (zzd unused) {
                this.f74136a.mo86903d().mo87489r().mo87464b("Failed to load EES program. appId", str);
            }
        } else {
            this.f74074j.mo6252l(str);
        }
    }

    @C0348i1
    /* renamed from: r */
    public final int mo87587r(String str, String str2) {
        Integer num;
        mo86866h();
        mo87585o(str);
        Map map = (Map) this.f74073i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @C0348i1
    /* renamed from: t */
    public final C41998i4 mo87588t(String str) {
        mo87627i();
        mo86866h();
        C40843u.m166198h(str);
        mo87585o(str);
        return (C41998i4) this.f74072h.get(str);
    }

    @C0348i1
    /* renamed from: u */
    public final String mo87589u(String str) {
        mo86866h();
        return (String) this.f74078n.get(str);
    }

    @C0348i1
    /* renamed from: v */
    public final String mo87590v(String str) {
        mo86866h();
        return (String) this.f74077m.get(str);
    }

    @C0348i1
    /* renamed from: w */
    public final String mo87591w(String str) {
        mo86866h();
        mo87585o(str);
        return (String) this.f74076l.get(str);
    }

    @C0348i1
    /* renamed from: y */
    public final Set mo87592y(String str) {
        mo86866h();
        mo87585o(str);
        return (Set) this.f74069e.get(str);
    }

    @C0348i1
    /* renamed from: z */
    public final void mo87593z(String str) {
        mo86866h();
        this.f74077m.put(str, (Object) null);
    }
}
