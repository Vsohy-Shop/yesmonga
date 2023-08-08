package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p073j$.time.ZoneOffset;
import p073j$.time.format.DateTimeFormatter;
import p073j$.util.DateRetargetClass;

/* renamed from: com.google.firebase.heartbeatinfo.k */
public class C33051k {

    /* renamed from: b */
    public static C33051k f80180b = null;

    /* renamed from: c */
    public static final String f80181c = "fire-global";

    /* renamed from: d */
    public static final String f80182d = "FirebaseAppHeartBeat";

    /* renamed from: e */
    public static final String f80183e = "FirebaseHeartBeat";

    /* renamed from: f */
    public static final String f80184f = "fire-count";

    /* renamed from: g */
    public static final String f80185g = "last-used-date";

    /* renamed from: h */
    public static final int f80186h = 30;

    /* renamed from: a */
    public final SharedPreferences f80187a;

    public C33051k(Context context, String str) {
        this.f80187a = context.getSharedPreferences(f80183e + str, 0);
    }

    /* renamed from: a */
    public final synchronized void mo95749a() {
        long j = this.f80187a.getLong(f80184f, 0);
        String str = "";
        String str2 = null;
        for (Map.Entry next : this.f80187a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f80187a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f80187a.edit().putStringSet(str, hashSet).putLong(f80184f, j - 1).commit();
    }

    /* renamed from: b */
    public synchronized void mo95750b() {
        SharedPreferences.Editor edit = this.f80187a.edit();
        for (Map.Entry next : this.f80187a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove(f80184f);
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<C33052l> mo95751c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f80187a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(C33052l.m133404a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo95762n(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String mo95752d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: e */
    public int mo95753e() {
        return (int) this.f80187a.getLong(f80184f, 0);
    }

    /* renamed from: f */
    public synchronized long mo95754f() {
        return this.f80187a.getLong(f80181c, -1);
    }

    /* renamed from: g */
    public final synchronized String mo95755g(String str) {
        for (Map.Entry next : this.f80187a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: h */
    public synchronized boolean mo95756h(long j, long j2) {
        return mo95752d(j).equals(mo95752d(j2));
    }

    /* renamed from: i */
    public synchronized void mo95757i() {
        String d = mo95752d(System.currentTimeMillis());
        this.f80187a.edit().putString(f80185g, d).commit();
        mo95758j(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95758j(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.mo95755g(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f80187a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f80187a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f80187a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.C33051k.mo95758j(java.lang.String):void");
    }

    /* renamed from: k */
    public synchronized boolean mo95759k(long j) {
        return mo95760l(f80181c, j);
    }

    /* renamed from: l */
    public synchronized boolean mo95760l(String str, long j) {
        if (!this.f80187a.contains(str)) {
            this.f80187a.edit().putLong(str, j).commit();
            return true;
        } else if (mo95756h(this.f80187a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f80187a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* renamed from: m */
    public synchronized void mo95761m(long j, String str) {
        String d = mo95752d(j);
        if (this.f80187a.getString(f80185g, "").equals(d)) {
            String g = mo95755g(d);
            if (g != null) {
                if (!g.equals(str)) {
                    mo95763o(str, d);
                    return;
                }
                return;
            }
            return;
        }
        long j2 = this.f80187a.getLong(f80184f, 0);
        if (j2 + 1 == 30) {
            mo95749a();
            j2 = this.f80187a.getLong(f80184f, 0);
        }
        HashSet hashSet = new HashSet(this.f80187a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f80187a.edit().putStringSet(str, hashSet).putLong(f80184f, j2 + 1).putString(f80185g, d).commit();
    }

    /* renamed from: n */
    public synchronized void mo95762n(long j) {
        this.f80187a.edit().putLong(f80181c, j).commit();
    }

    /* renamed from: o */
    public final synchronized void mo95763o(String str, String str2) {
        mo95758j(str2);
        HashSet hashSet = new HashSet(this.f80187a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f80187a.edit().putStringSet(str, hashSet).commit();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    public C33051k(SharedPreferences sharedPreferences) {
        this.f80187a = sharedPreferences;
    }
}
