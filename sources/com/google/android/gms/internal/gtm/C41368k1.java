package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.manager.C22509f;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.google.android.gms.analytics.C40371a;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.analytics.C40398j;
import com.google.android.gms.analytics.C40405q;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.firebase.crashlytics.C32648f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.k1 */
public final class C41368k1 extends C41535r0 {

    /* renamed from: X */
    public boolean f104728X;

    /* renamed from: c */
    public boolean f104729c;

    /* renamed from: d */
    public final C41223e1 f104730d;

    /* renamed from: e */
    public final C41274g4 f104731e;

    /* renamed from: f */
    public final C41226e4 f104732f;

    /* renamed from: g */
    public final C41175c1 f104733g;

    /* renamed from: v */
    public long f104734v = Long.MIN_VALUE;

    /* renamed from: w */
    public final C41632v1 f104735w;

    /* renamed from: x */
    public final C41632v1 f104736x;

    /* renamed from: y */
    public final C41515q4 f104737y;

    /* renamed from: z */
    public long f104738z;

    public C41368k1(C41607u0 u0Var, C41631v0 v0Var) {
        super(u0Var);
        C40843u.m166202l(v0Var);
        this.f104732f = new C41226e4(u0Var);
        this.f104730d = new C41223e1(u0Var);
        this.f104731e = new C41274g4(u0Var);
        this.f104733g = new C41175c1(u0Var);
        this.f104737y = new C41515q4(mo135748j());
        this.f104735w = new C41271g1(this, u0Var);
        this.f104736x = new C41295h1(this, u0Var);
    }

    /* renamed from: A0 */
    public static /* bridge */ /* synthetic */ void m167904A0(C41368k1 k1Var) {
        try {
            k1Var.f104730d.mo135319Z();
            k1Var.mo135567e0();
        } catch (SQLiteException e) {
            k1Var.mo135763z("Failed to delete stale hits", e);
        }
        C41632v1 v1Var = k1Var.f104736x;
        k1Var.mo135742P();
        v1Var.mo135957g(86400000);
    }

    /* renamed from: D0 */
    public final void mo135552D0(C41704y1 y1Var) {
        mo135553E0(y1Var, this.f104738z);
    }

    /* renamed from: E0 */
    public final void mo135553E0(C41704y1 y1Var, long j) {
        long j2;
        C40372a0.m164215h();
        mo135794T();
        long Z = mo135746g().mo135505Z();
        if (Z != 0) {
            j2 = Math.abs(mo135748j().mo134768a() - Z);
        } else {
            j2 = -1;
        }
        mo135751n("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        mo135742P();
        mo135555H0();
        try {
            mo135568f0();
            mo135746g().mo135510f0();
            mo135567e0();
            if (y1Var != null) {
                y1Var.mo135503a((Throwable) null);
            }
            if (this.f104738z != j) {
                this.f104732f.mo135331b();
            }
        } catch (Exception e) {
            mo135755r("Local dispatch failed", e);
            mo135746g().mo135510f0();
            mo135567e0();
            if (y1Var != null) {
                y1Var.mo135503a(e);
            }
        }
    }

    /* renamed from: F0 */
    public final void mo135554F0() {
        C40372a0.m164215h();
        mo135794T();
        mo135742P();
        mo135759v("Delete all hits from local store");
        try {
            C41223e1 e1Var = this.f104730d;
            C40372a0.m164215h();
            e1Var.mo135794T();
            e1Var.mo135329p0().delete("hits2", (String) null, (String[]) null);
            C41223e1 e1Var2 = this.f104730d;
            C40372a0.m164215h();
            e1Var2.mo135794T();
            e1Var2.mo135329p0().delete("properties", (String) null, (String[]) null);
            mo135567e0();
        } catch (SQLiteException e) {
            mo135763z("Failed to delete hits from store", e);
        }
        mo135555H0();
        if (this.f104733g.mo135155b0()) {
            mo135759v("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    /* renamed from: H0 */
    public final void mo135555H0() {
        if (!this.f104728X) {
            mo135742P();
            if (C41560s1.m168325l() && !this.f104733g.mo135157d0()) {
                mo135742P();
                if (this.f104737y.mo135771c(C41634v3.f105111P.mo135909b().longValue())) {
                    this.f104737y.mo135770b();
                    mo135759v("Connecting to service");
                    if (this.f104733g.mo135156c0()) {
                        mo135759v("Connected to service");
                        this.f104737y.mo135769a();
                        mo135559O0();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017e, code lost:
        if (r2 != null) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0197 A[Catch:{ SQLiteException -> 0x0203 }] */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135556K0(com.google.android.gms.internal.gtm.C41706y3 r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "hit_id"
            com.google.android.gms.common.internal.C40843u.m166202l(r21)
            com.google.android.gms.analytics.C40372a0.m164215h()
            r20.mo135794T()
            boolean r3 = r1.f104728X
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"
            r1.mo135750m(r3)
            goto L_0x001e
        L_0x0019:
            java.lang.String r3 = "Delivering hit"
            r1.mo135760w(r3, r0)
        L_0x001e:
            java.lang.String r3 = r21.mo136095f()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0077
            com.google.android.gms.internal.gtm.j4 r3 = r20.mo135746g()
            com.google.android.gms.internal.gtm.i4 r3 = r3.mo135506b0()
            android.util.Pair r3 = r3.mo135481a()
            if (r3 == 0) goto L_0x0077
            java.lang.Object r5 = r3.second
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r3 = r3.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + r4
            int r6 = r6 + r7
            r8.<init>(r6)
            r8.append(r5)
            java.lang.String r5 = ":"
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            java.util.HashMap r5 = new java.util.HashMap
            java.util.Map r6 = r21.mo136096g()
            r5.<init>(r6)
            java.lang.String r6 = "_m"
            r5.put(r6, r3)
            com.google.android.gms.internal.gtm.y3 r0 = com.google.android.gms.internal.gtm.C41706y3.m168836e(r1, r0, r5)
        L_0x0077:
            r3 = r0
            r20.mo135555H0()
            com.google.android.gms.internal.gtm.c1 r0 = r1.f104733g
            boolean r0 = r0.mo135158e0(r3)
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "Hit sent to the device AnalyticsService for delivery"
            r1.mo135750m(r0)
            return
        L_0x0089:
            r20.mo135742P()
            com.google.android.gms.internal.gtm.e1 r5 = r1.f104730d     // Catch:{ SQLiteException -> 0x0203 }
            com.google.android.gms.common.internal.C40843u.m166202l(r3)     // Catch:{ SQLiteException -> 0x0203 }
            com.google.android.gms.analytics.C40372a0.m164215h()     // Catch:{ SQLiteException -> 0x0203 }
            r5.mo135794T()     // Catch:{ SQLiteException -> 0x0203 }
            com.google.android.gms.common.internal.C40843u.m166202l(r3)     // Catch:{ SQLiteException -> 0x0203 }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ SQLiteException -> 0x0203 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0203 }
            java.util.Map r6 = r3.mo136096g()     // Catch:{ SQLiteException -> 0x0203 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ SQLiteException -> 0x0203 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ SQLiteException -> 0x0203 }
        L_0x00ab:
            boolean r7 = r6.hasNext()     // Catch:{ SQLiteException -> 0x0203 }
            if (r7 == 0) goto L_0x00df
            java.lang.Object r7 = r6.next()     // Catch:{ SQLiteException -> 0x0203 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r9 = "ht"
            boolean r9 = r9.equals(r8)     // Catch:{ SQLiteException -> 0x0203 }
            if (r9 != 0) goto L_0x00ab
            java.lang.String r9 = "qt"
            boolean r9 = r9.equals(r8)     // Catch:{ SQLiteException -> 0x0203 }
            if (r9 != 0) goto L_0x00ab
            java.lang.String r9 = "AppUID"
            boolean r9 = r9.equals(r8)     // Catch:{ SQLiteException -> 0x0203 }
            if (r9 != 0) goto L_0x00ab
            java.lang.Object r7 = r7.getValue()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SQLiteException -> 0x0203 }
            r0.appendQueryParameter(r8, r7)     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x00ab
        L_0x00df:
            android.net.Uri r0 = r0.build()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r0 = r0.getEncodedQuery()     // Catch:{ SQLiteException -> 0x0203 }
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = ""
        L_0x00eb:
            r6 = r0
            int r0 = r6.length()     // Catch:{ SQLiteException -> 0x0203 }
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r0 <= r7) goto L_0x00ff
            com.google.android.gms.internal.gtm.d4 r0 = r5.mo135745S()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r2 = "Hit length exceeds the maximum allowed size"
            r0.mo135211Z(r3, r2)     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x01ff
        L_0x00ff:
            r5.mo135742P()     // Catch:{ SQLiteException -> 0x0203 }
            com.google.android.gms.internal.gtm.u3<java.lang.Integer> r0 = com.google.android.gms.internal.gtm.C41634v3.f105121g     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Object r0 = r0.mo135909b()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x0203 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x0203 }
            long r7 = r5.mo135326f0()     // Catch:{ SQLiteException -> 0x0203 }
            int r9 = r0 + -1
            long r9 = (long) r9     // Catch:{ SQLiteException -> 0x0203 }
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 <= 0) goto L_0x019b
            long r11 = (long) r0     // Catch:{ SQLiteException -> 0x0203 }
            long r7 = r7 - r11
            r11 = 1
            long r7 = r7 + r11
            com.google.android.gms.analytics.C40372a0.m164215h()     // Catch:{ SQLiteException -> 0x0203 }
            r5.mo135794T()     // Catch:{ SQLiteException -> 0x0203 }
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0130
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x0182
        L_0x0130:
            android.database.sqlite.SQLiteDatabase r11 = r5.mo135329p0()     // Catch:{ SQLiteException -> 0x0203 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0203 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            r4 = 0
            r0[r4] = r2     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            java.lang.String r12 = "hits2"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r2 = "%s ASC"
            java.lang.String r18 = java.lang.String.format(r2, r0)     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            java.lang.String r19 = java.lang.Long.toString(r7)     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            android.database.Cursor r2 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0177, all -> 0x0175 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0173 }
            if (r0 == 0) goto L_0x016f
        L_0x015e:
            long r7 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x0173 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0173 }
            r9.add(r0)     // Catch:{ SQLiteException -> 0x0173 }
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0173 }
            if (r0 != 0) goto L_0x015e
        L_0x016f:
            r2.close()     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x0181
        L_0x0173:
            r0 = move-exception
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            goto L_0x0195
        L_0x0177:
            r0 = move-exception
            r2 = r10
        L_0x0179:
            java.lang.String r4 = "Error selecting hit ids"
            r5.mo135763z(r4, r0)     // Catch:{ all -> 0x0193 }
            if (r2 == 0) goto L_0x0181
            goto L_0x016f
        L_0x0181:
            r0 = r9
        L_0x0182:
            java.lang.String r2 = "Store full, deleting hits to make room, count"
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0203 }
            r5.mo135763z(r2, r4)     // Catch:{ SQLiteException -> 0x0203 }
            r5.mo135318X(r0)     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x019b
        L_0x0193:
            r0 = move-exception
            r10 = r2
        L_0x0195:
            if (r10 == 0) goto L_0x019a
            r10.close()     // Catch:{ SQLiteException -> 0x0203 }
        L_0x019a:
            throw r0     // Catch:{ SQLiteException -> 0x0203 }
        L_0x019b:
            android.database.sqlite.SQLiteDatabase r0 = r5.mo135329p0()     // Catch:{ SQLiteException -> 0x0203 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0203 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = "hit_string"
            r2.put(r4, r6)     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = "hit_time"
            long r6 = r3.mo136094d()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0203 }
            r2.put(r4, r6)     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = "hit_app_id"
            int r6 = r3.mo136091a()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0203 }
            r2.put(r4, r6)     // Catch:{ SQLiteException -> 0x0203 }
            boolean r4 = r3.mo136097h()     // Catch:{ SQLiteException -> 0x0203 }
            if (r4 == 0) goto L_0x01d1
            r5.mo135742P()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = com.google.android.gms.internal.gtm.C41560s1.m168322i()     // Catch:{ SQLiteException -> 0x0203 }
            goto L_0x01d8
        L_0x01d1:
            r5.mo135742P()     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = com.google.android.gms.internal.gtm.C41560s1.m168324k()     // Catch:{ SQLiteException -> 0x0203 }
        L_0x01d8:
            java.lang.String r6 = "hit_url"
            r2.put(r6, r4)     // Catch:{ SQLiteException -> 0x0203 }
            java.lang.String r4 = "hits2"
            long r6 = r0.insert(r4, r10, r2)     // Catch:{ SQLiteException -> 0x01f9 }
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = "Failed to insert a hit (got -1)"
            r5.mo135754q(r0)     // Catch:{ SQLiteException -> 0x01f9 }
            goto L_0x01ff
        L_0x01ef:
            java.lang.String r0 = "Hit saved to database. db-id, hit"
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x01f9 }
            r5.mo135752o(r0, r2, r3)     // Catch:{ SQLiteException -> 0x01f9 }
            goto L_0x01ff
        L_0x01f9:
            r0 = move-exception
            java.lang.String r2 = "Error storing a hit"
            r5.mo135755r(r2, r0)     // Catch:{ SQLiteException -> 0x0203 }
        L_0x01ff:
            r20.mo135567e0()     // Catch:{ SQLiteException -> 0x0203 }
            return
        L_0x0203:
            r0 = move-exception
            java.lang.String r2 = "Delivery failed to save hit to a database"
            r1.mo135755r(r2, r0)
            com.google.android.gms.internal.gtm.d4 r0 = r20.mo135745S()
            java.lang.String r2 = "deliver: failed to insert hit to database"
            r0.mo135211Z(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41368k1.mo135556K0(com.google.android.gms.internal.gtm.y3):void");
    }

    /* renamed from: L0 */
    public final void mo135557L0(C41655w0 w0Var) {
        C40372a0.m164215h();
        mo135751n("Sending first hit to property", w0Var.mo136010c());
        C41515q4 c0 = mo135746g().mo135507c0();
        mo135742P();
        if (!c0.mo135771c(C41560s1.m168316c())) {
            String d0 = mo135746g().mo135508d0();
            if (!TextUtils.isEmpty(d0)) {
                C41630v b = C41611u4.m168466b(mo135745S(), d0);
                mo135751n("Found relevant installation campaign", b);
                mo135572q0(w0Var, b);
            }
        }
    }

    /* renamed from: N0 */
    public final void mo135558N0() {
        C40372a0.m164215h();
        this.f104738z = mo135748j().mo134768a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[LOOP:1: B:14:0x004d->B:22:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080 A[SYNTHETIC, Splitter:B:26:0x0080] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135559O0() {
        /*
            r5 = this;
            com.google.android.gms.analytics.C40372a0.m164215h()
            r5.mo135742P()
            com.google.android.gms.analytics.C40372a0.m164215h()
            r5.mo135794T()
            r5.mo135749l()
            r5.mo135742P()
            boolean r0 = com.google.android.gms.internal.gtm.C41560s1.m168325l()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.mo135762y(r0)
        L_0x001d:
            com.google.android.gms.internal.gtm.c1 r0 = r5.f104733g
            boolean r0 = r0.mo135157d0()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "Service not connected"
            r5.mo135759v(r0)
            return
        L_0x002b:
            com.google.android.gms.internal.gtm.e1 r0 = r5.f104730d
            boolean r0 = r0.mo135322c0()
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.mo135759v(r0)
        L_0x0039:
            com.google.android.gms.internal.gtm.e1 r0 = r5.f104730d     // Catch:{ SQLiteException -> 0x0084 }
            r5.mo135742P()     // Catch:{ SQLiteException -> 0x0084 }
            int r1 = com.google.android.gms.internal.gtm.C41560s1.m168321h()     // Catch:{ SQLiteException -> 0x0084 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0084 }
            java.util.List r0 = r0.mo135313A0(r1)     // Catch:{ SQLiteException -> 0x0084 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0084 }
            if (r1 != 0) goto L_0x0080
        L_0x004d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0039
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.gtm.y3 r1 = (com.google.android.gms.internal.gtm.C41706y3) r1
            com.google.android.gms.internal.gtm.c1 r2 = r5.f104733g
            boolean r2 = r2.mo135158e0(r1)
            if (r2 != 0) goto L_0x0066
            r5.mo135567e0()
            return
        L_0x0066:
            r0.remove(r1)
            com.google.android.gms.internal.gtm.e1 r2 = r5.f104730d     // Catch:{ SQLiteException -> 0x0073 }
            long r3 = r1.mo136092b()     // Catch:{ SQLiteException -> 0x0073 }
            r2.mo135317F0(r3)     // Catch:{ SQLiteException -> 0x0073 }
            goto L_0x004d
        L_0x0073:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.mo135755r(r1, r0)
            r5.mo135570n0()
            r5.mo135569g0()
            return
        L_0x0080:
            r5.mo135567e0()     // Catch:{ SQLiteException -> 0x0084 }
            return
        L_0x0084:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.mo135755r(r1, r0)
            r5.mo135570n0()
            r5.mo135569g0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41368k1.mo135559O0():void");
    }

    /* renamed from: R0 */
    public final void mo135560R0(String str) {
        boolean z;
        String str2 = str;
        C40843u.m166198h(str);
        C40372a0.m164215h();
        mo135749l();
        C41630v b = C41611u4.m168466b(mo135745S(), str2);
        if (b == null) {
            mo135763z("Parsing failed. Ignoring invalid campaign data", str2);
            return;
        }
        String d0 = mo135746g().mo135508d0();
        if (str2.equals(d0)) {
            mo135762y("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(d0)) {
            mo135756s("Ignoring multiple install campaigns. original, new", d0, str2);
        } else {
            mo135746g().mo135509e0(str2);
            C41515q4 c0 = mo135746g().mo135507c0();
            mo135742P();
            if (c0.mo135771c(C41560s1.m168316c())) {
                mo135763z("Campaign received too late, ignoring", b);
                return;
            }
            mo135751n("Received installation campaign", b);
            C41223e1 e1Var = this.f104730d;
            e1Var.mo135794T();
            C40372a0.m164215h();
            SQLiteDatabase p0 = e1Var.mo135329p0();
            Cursor cursor = null;
            try {
                String[] strArr = {"cid", "tid", "adid", "hits_count", C32648f.f79206e};
                e1Var.mo135742P();
                int intValue = C41634v3.f105123i.mo135909b().intValue();
                Cursor query = p0.query("properties", strArr, "app_uid=?", new String[]{"0"}, (String) null, (String) null, (String) null, String.valueOf(intValue));
                ArrayList<C41655w0> arrayList = new ArrayList<>();
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        if (query.getInt(2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long j = (long) query.getInt(3);
                        Map<String, String> D0 = e1Var.mo135315D0(query.getString(4));
                        if (!TextUtils.isEmpty(string)) {
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList.add(new C41655w0(0, string, string2, z, j, D0));
                            }
                        }
                        e1Var.mo135731B("Read property with empty client id or tracker id", string, string2);
                    } while (query.moveToNext());
                }
                if (arrayList.size() >= intValue) {
                    e1Var.mo135762y("Sending hits to too many properties. Campaign report might be incorrect");
                }
                query.close();
                for (C41655w0 q0 : arrayList) {
                    mo135572q0(q0, b);
                }
            } catch (SQLiteException e) {
                e1Var.mo135755r("Error loading hits from the database", e);
                throw e;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: W */
    public final void mo133294W() {
        this.f104730d.mo135795U();
        this.f104731e.mo135795U();
        this.f104733g.mo135795U();
    }

    /* renamed from: X */
    public final void mo135561X(long j) {
        C40372a0.m164215h();
        mo135794T();
        if (j < 0) {
            j = 0;
        }
        this.f104734v = j;
        mo135567e0();
    }

    /* renamed from: Z */
    public final long mo135562Z() {
        long j = this.f104734v;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        mo135742P();
        long longValue = C41634v3.f105124j.mo135909b().longValue();
        C41635v4 i = mo135747i();
        i.mo135794T();
        if (!i.f105143e) {
            return longValue;
        }
        C41635v4 i2 = mo135747i();
        i2.mo135794T();
        return ((long) i2.f105144f) * 1000;
    }

    /* renamed from: a0 */
    public final void mo135563a0() {
        mo135794T();
        C40843u.m166209s(!this.f104729c, "Analytics backend already started");
        this.f104729c = true;
        mo135736J().mo133262i(new C41319i1(this));
    }

    /* renamed from: b0 */
    public final void mo135564b0() {
        mo135794T();
        mo135742P();
        C40372a0.m164215h();
        Context a = mo135739M().mo135891a();
        if (!C41371k4.m167930a(a)) {
            mo135762y("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C41491p4.m168141h(a)) {
            mo135754q("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C40371a.m164210b(a)) {
            mo135762y("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo135746g().mo135504X();
        if (!mo135573t0(C22509f.f57696b)) {
            mo135754q("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            mo135566d0();
        }
        if (!mo135573t0("android.permission.INTERNET")) {
            mo135754q("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            mo135566d0();
        }
        if (C41491p4.m168141h(mo135734G())) {
            mo135759v("AnalyticsService registered in the app manifest and enabled");
        } else {
            mo135742P();
            mo135762y("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f104728X) {
            mo135742P();
            if (!this.f104730d.mo135322c0()) {
                mo135555H0();
            }
        }
        mo135567e0();
    }

    /* renamed from: c0 */
    public final void mo135565c0() {
        C40372a0.m164215h();
        mo135794T();
        mo135750m("Sync dispatching local hits");
        long j = this.f104738z;
        mo135742P();
        mo135555H0();
        try {
            mo135568f0();
            mo135746g().mo135510f0();
            mo135567e0();
            if (this.f104738z != j) {
                this.f104732f.mo135331b();
            }
        } catch (Exception e) {
            mo135755r("Sync local dispatch failed", e);
            mo135567e0();
        }
    }

    /* renamed from: d0 */
    public final void mo135566d0() {
        mo135794T();
        C40372a0.m164215h();
        this.f104728X = true;
        this.f104733g.mo135154a0();
        mo135567e0();
    }

    /* renamed from: e0 */
    public final void mo135567e0() {
        long j;
        C40372a0.m164215h();
        mo135794T();
        if (!this.f104728X) {
            mo135742P();
            if (mo135562Z() > 0) {
                if (this.f104730d.mo135322c0()) {
                    this.f104732f.mo135332c();
                    mo135570n0();
                    mo135569g0();
                    return;
                }
                if (!C41634v3.f105106K.mo135909b().booleanValue()) {
                    this.f104732f.mo135330a();
                    if (!this.f104732f.mo135333d()) {
                        mo135570n0();
                        mo135569g0();
                        mo135571p0();
                        return;
                    }
                }
                mo135571p0();
                long Z = mo135562Z();
                long Z2 = mo135746g().mo135505Z();
                if (Z2 != 0) {
                    j = Z - Math.abs(mo135748j().mo134768a() - Z2);
                    if (j <= 0) {
                        mo135742P();
                        j = Math.min(C41560s1.m168318e(), Z);
                    }
                } else {
                    mo135742P();
                    j = Math.min(C41560s1.m168318e(), Z);
                }
                mo135760w("Dispatch scheduled (ms)", Long.valueOf(j));
                if (this.f104735w.mo135958h()) {
                    this.f104735w.mo135955e(Math.max(1, j + this.f104735w.mo135954b()));
                    return;
                }
                this.f104735w.mo135957g(j);
                return;
            }
        }
        this.f104732f.mo135332c();
        mo135570n0();
        mo135569g0();
    }

    /* renamed from: f0 */
    public final boolean mo135568f0() {
        boolean z;
        C40372a0.m164215h();
        mo135794T();
        mo135759v("Dispatching a batch of local hits");
        if (!this.f104733g.mo135157d0()) {
            mo135742P();
            z = true;
        } else {
            z = false;
        }
        boolean b0 = true ^ this.f104731e.mo135397b0();
        if (!z || !b0) {
            mo135742P();
            int h = C41560s1.m168321h();
            mo135742P();
            long max = (long) Math.max(h, C41560s1.m168320g());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                try {
                    this.f104730d.mo135316E0();
                    arrayList.clear();
                    try {
                        List<C41706y3> A0 = this.f104730d.mo135313A0(max);
                        if (A0.isEmpty()) {
                            mo135759v("Store is empty, nothing to dispatch");
                            mo135570n0();
                            mo135569g0();
                            try {
                                this.f104730d.mo135321b0();
                                this.f104730d.mo135320a0();
                                return false;
                            } catch (SQLiteException e) {
                                mo135755r("Failed to commit local dispatch transaction", e);
                                mo135570n0();
                                mo135569g0();
                                return false;
                            }
                        } else {
                            mo135760w("Hits loaded from store. count", Integer.valueOf(A0.size()));
                            for (C41706y3 b : A0) {
                                if (b.mo136092b() == j) {
                                    mo135756s("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(A0.size()));
                                    mo135570n0();
                                    mo135569g0();
                                    try {
                                        this.f104730d.mo135321b0();
                                        this.f104730d.mo135320a0();
                                        return false;
                                    } catch (SQLiteException e2) {
                                        mo135755r("Failed to commit local dispatch transaction", e2);
                                        mo135570n0();
                                        mo135569g0();
                                        return false;
                                    }
                                }
                            }
                            if (this.f104733g.mo135157d0()) {
                                mo135742P();
                                mo135759v("Service connected, sending hits to the service");
                                while (true) {
                                    if (!A0.isEmpty()) {
                                        C41706y3 y3Var = A0.get(0);
                                        if (!this.f104733g.mo135158e0(y3Var)) {
                                            break;
                                        }
                                        j = Math.max(j, y3Var.mo136092b());
                                        A0.remove(y3Var);
                                        mo135751n("Hit sent do device AnalyticsService for delivery", y3Var);
                                        this.f104730d.mo135317F0(y3Var.mo136092b());
                                        arrayList.add(Long.valueOf(y3Var.mo136092b()));
                                    }
                                }
                            }
                            if (this.f104731e.mo135397b0()) {
                                List<Long> a0 = this.f104731e.mo135396a0(A0);
                                for (Long longValue : a0) {
                                    j = Math.max(j, longValue.longValue());
                                }
                                try {
                                    this.f104730d.mo135318X(a0);
                                    arrayList.addAll(a0);
                                } catch (SQLiteException e3) {
                                    mo135755r("Failed to remove successfully uploaded hits", e3);
                                    mo135570n0();
                                    mo135569g0();
                                    try {
                                        this.f104730d.mo135321b0();
                                        this.f104730d.mo135320a0();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        mo135755r("Failed to commit local dispatch transaction", e4);
                                        mo135570n0();
                                        mo135569g0();
                                        return false;
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                try {
                                    this.f104730d.mo135321b0();
                                    this.f104730d.mo135320a0();
                                    return false;
                                } catch (SQLiteException e5) {
                                    mo135755r("Failed to commit local dispatch transaction", e5);
                                    mo135570n0();
                                    mo135569g0();
                                    return false;
                                }
                            } else {
                                try {
                                    this.f104730d.mo135321b0();
                                    this.f104730d.mo135320a0();
                                } catch (SQLiteException e6) {
                                    mo135755r("Failed to commit local dispatch transaction", e6);
                                    mo135570n0();
                                    mo135569g0();
                                    return false;
                                }
                            }
                        }
                    } catch (SQLiteException e7) {
                        mo135763z("Failed to read hits from persisted store", e7);
                        mo135570n0();
                        mo135569g0();
                        try {
                            this.f104730d.mo135321b0();
                            this.f104730d.mo135320a0();
                            return false;
                        } catch (SQLiteException e8) {
                            mo135755r("Failed to commit local dispatch transaction", e8);
                            mo135570n0();
                            mo135569g0();
                            return false;
                        }
                    }
                } catch (SQLiteException e9) {
                    mo135755r("Failed to remove hit that was send for delivery", e9);
                    mo135570n0();
                    mo135569g0();
                    try {
                        this.f104730d.mo135321b0();
                        this.f104730d.mo135320a0();
                        return false;
                    } catch (SQLiteException e10) {
                        mo135755r("Failed to commit local dispatch transaction", e10);
                        mo135570n0();
                        mo135569g0();
                        return false;
                    }
                } catch (Throwable th) {
                    try {
                        this.f104730d.mo135321b0();
                        this.f104730d.mo135320a0();
                        throw th;
                    } catch (SQLiteException e11) {
                        mo135755r("Failed to commit local dispatch transaction", e11);
                        mo135570n0();
                        mo135569g0();
                        return false;
                    }
                }
            }
        } else {
            mo135759v("No network or service available. Will retry later");
            return false;
        }
    }

    /* renamed from: g0 */
    public final void mo135569g0() {
        C41680x1 R = mo135744R();
        if (R.mo136032b0()) {
            R.mo136029X();
        }
    }

    /* renamed from: n0 */
    public final void mo135570n0() {
        if (this.f104735w.mo135958h()) {
            mo135759v("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f104735w.mo135956f();
    }

    /* renamed from: p0 */
    public final void mo135571p0() {
        long j;
        C41680x1 R = mo135744R();
        if (R.mo136031a0() && !R.mo136032b0()) {
            C40372a0.m164215h();
            mo135794T();
            try {
                j = this.f104730d.mo135327g0();
            } catch (SQLiteException e) {
                mo135755r("Failed to get min/max hit times from local store", e);
                j = 0;
            }
            if (j != 0) {
                long abs = Math.abs(mo135748j().mo134768a() - j);
                mo135742P();
                if (abs <= C41634v3.f105129o.mo135909b().longValue()) {
                    mo135742P();
                    mo135760w("Dispatch alarm scheduled (ms)", Long.valueOf(C41560s1.m168317d()));
                    R.mo136030Z();
                }
            }
        }
    }

    /* renamed from: q0 */
    public final void mo135572q0(C41655w0 w0Var, C41630v vVar) {
        C40843u.m166202l(w0Var);
        C40843u.m166202l(vVar);
        C40398j jVar = new C40398j(mo135739M());
        jVar.mo133419f(w0Var.mo136010c());
        jVar.mo133420g(w0Var.mo136013f());
        C40405q d = jVar.mo133417d();
        C41198d0 d0Var = (C41198d0) d.mo133431b(C41198d0.class);
        d0Var.mo135199l("data");
        d0Var.mo135200m(true);
        d.mo133436g(vVar);
        C41702y yVar = (C41702y) d.mo133431b(C41702y.class);
        C41606u uVar = (C41606u) d.mo133431b(C41606u.class);
        for (Map.Entry next : w0Var.mo136011d().entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if ("an".equals(str)) {
                uVar.mo135888l(str2);
            } else if ("av".equals(str)) {
                uVar.mo135889m(str2);
            } else if ("aid".equals(str)) {
                uVar.mo135886j(str2);
            } else if ("aiid".equals(str)) {
                uVar.mo135887k(str2);
            } else if ("uid".equals(str)) {
                d0Var.mo135201n(str2);
            } else {
                yVar.mo136088f(str, str2);
            }
        }
        mo135752o("Sending installation campaign to", w0Var.mo136010c(), vVar);
        d.mo133439j(mo135746g().mo135504X());
        d.mo133440k();
    }

    /* renamed from: t0 */
    public final boolean mo135573t0(String str) {
        return C41008d.m166715a(mo135734G()).mo134779a(str) == 0;
    }

    /* renamed from: x0 */
    public final long mo135574x0(C41655w0 w0Var, boolean z) {
        C40843u.m166202l(w0Var);
        mo135794T();
        C40372a0.m164215h();
        try {
            this.f104730d.mo135316E0();
            C41223e1 e1Var = this.f104730d;
            String b = w0Var.mo136009b();
            C40843u.m166198h(b);
            e1Var.mo135794T();
            C40372a0.m164215h();
            int delete = e1Var.mo135329p0().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", b});
            if (delete > 0) {
                e1Var.mo135760w("Deleted property records", Integer.valueOf(delete));
            }
            long n0 = this.f104730d.mo135328n0(0, w0Var.mo136009b(), w0Var.mo136010c());
            w0Var.mo136012e(1 + n0);
            C41223e1 e1Var2 = this.f104730d;
            C40843u.m166202l(w0Var);
            e1Var2.mo135794T();
            C40372a0.m164215h();
            SQLiteDatabase p0 = e1Var2.mo135329p0();
            Map<String, String> d = w0Var.mo136011d();
            C40843u.m166202l(d);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry next : d.entrySet()) {
                builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(ActivityKt.f70308d, 0L);
            contentValues.put("cid", w0Var.mo136009b());
            contentValues.put("tid", w0Var.mo136010c());
            contentValues.put("adid", Integer.valueOf(w0Var.mo136013f() ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(w0Var.mo136008a()));
            contentValues.put(C32648f.f79206e, encodedQuery);
            try {
                if (p0.insertWithOnConflict("properties", (String) null, contentValues, 5) == -1) {
                    e1Var2.mo135754q("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                e1Var2.mo135755r("Error storing a property", e);
            }
            this.f104730d.mo135321b0();
            try {
                this.f104730d.mo135320a0();
            } catch (SQLiteException e2) {
                mo135755r("Failed to end transaction", e2);
            }
            return n0;
        } catch (SQLiteException e3) {
            mo135755r("Failed to update Analytics property", e3);
            try {
                this.f104730d.mo135320a0();
            } catch (SQLiteException e4) {
                mo135755r("Failed to end transaction", e4);
            }
            return -1;
        } catch (Throwable th) {
            try {
                this.f104730d.mo135320a0();
            } catch (SQLiteException e5) {
                mo135755r("Failed to end transaction", e5);
            }
            throw th;
        }
    }
}
