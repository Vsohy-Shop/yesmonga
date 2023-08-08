package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.firebase.remoteconfig.C33564m;
import com.google.firebase.remoteconfig.C33565n;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.n */
public class C33538n {
    @C0344h1

    /* renamed from: d */
    public static final long f81623d = -1;

    /* renamed from: e */
    public static final Date f81624e = new Date(-1);
    @C0344h1

    /* renamed from: f */
    public static final int f81625f = 0;

    /* renamed from: g */
    public static final long f81626g = -1;
    @C0344h1

    /* renamed from: h */
    public static final Date f81627h = new Date(-1);

    /* renamed from: i */
    public static final String f81628i = "fetch_timeout_in_seconds";

    /* renamed from: j */
    public static final String f81629j = "minimum_fetch_interval_in_seconds";

    /* renamed from: k */
    public static final String f81630k = "last_fetch_status";

    /* renamed from: l */
    public static final String f81631l = "last_fetch_time_in_millis";

    /* renamed from: m */
    public static final String f81632m = "last_fetch_etag";

    /* renamed from: n */
    public static final String f81633n = "backoff_end_time_in_millis";

    /* renamed from: o */
    public static final String f81634o = "num_failed_fetches";

    /* renamed from: a */
    public final SharedPreferences f81635a;

    /* renamed from: b */
    public final Object f81636b = new Object();

    /* renamed from: c */
    public final Object f81637c = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.n$a */
    public static class C33539a {

        /* renamed from: a */
        public int f81638a;

        /* renamed from: b */
        public Date f81639b;

        public C33539a(int i, Date date) {
            this.f81638a = i;
            this.f81639b = date;
        }

        /* renamed from: a */
        public Date mo97363a() {
            return this.f81639b;
        }

        /* renamed from: b */
        public int mo97364b() {
            return this.f81638a;
        }
    }

    public C33538n(SharedPreferences sharedPreferences) {
        this.f81635a = sharedPreferences;
    }

    @C0348i1
    /* renamed from: a */
    public void mo97347a() {
        synchronized (this.f81636b) {
            this.f81635a.edit().clear().commit();
        }
    }

    /* renamed from: b */
    public C33539a mo97348b() {
        C33539a aVar;
        synchronized (this.f81637c) {
            aVar = new C33539a(this.f81635a.getInt(f81634o, 0), new Date(this.f81635a.getLong(f81633n, -1)));
        }
        return aVar;
    }

    /* renamed from: c */
    public long mo97349c() {
        return this.f81635a.getLong(f81628i, 60);
    }

    /* renamed from: d */
    public C33564m mo97350d() {
        C33542q a;
        synchronized (this.f81636b) {
            long j = this.f81635a.getLong(f81631l, -1);
            int i = this.f81635a.getInt(f81630k, 0);
            a = C33542q.m135230d().mo97374c(i).mo97375d(j).mo97373b(new C33565n.C33567b().mo97412f(this.f81635a.getLong(f81628i, 60)).mo97413g(this.f81635a.getLong(f81629j, C33533k.f81593j)).mo97409c()).mo97372a();
        }
        return a;
    }

    @C0363p0
    /* renamed from: e */
    public String mo97351e() {
        return this.f81635a.getString(f81632m, (String) null);
    }

    /* renamed from: f */
    public int mo97352f() {
        return this.f81635a.getInt(f81630k, 0);
    }

    /* renamed from: g */
    public Date mo97353g() {
        return new Date(this.f81635a.getLong(f81631l, -1));
    }

    /* renamed from: h */
    public long mo97354h() {
        return this.f81635a.getLong(f81629j, C33533k.f81593j);
    }

    /* renamed from: i */
    public void mo97355i() {
        mo97356j(0, f81627h);
    }

    /* renamed from: j */
    public void mo97356j(int i, Date date) {
        synchronized (this.f81637c) {
            this.f81635a.edit().putInt(f81634o, i).putLong(f81633n, date.getTime()).apply();
        }
    }

    @C0348i1
    /* renamed from: k */
    public void mo97357k(C33565n nVar) {
        synchronized (this.f81636b) {
            this.f81635a.edit().putLong(f81628i, nVar.mo97406a()).putLong(f81629j, nVar.mo97407b()).commit();
        }
    }

    /* renamed from: l */
    public void mo97358l(C33565n nVar) {
        synchronized (this.f81636b) {
            this.f81635a.edit().putLong(f81628i, nVar.mo97406a()).putLong(f81629j, nVar.mo97407b()).apply();
        }
    }

    /* renamed from: m */
    public void mo97359m(String str) {
        synchronized (this.f81636b) {
            this.f81635a.edit().putString(f81632m, str).apply();
        }
    }

    /* renamed from: n */
    public void mo97360n() {
        synchronized (this.f81636b) {
            this.f81635a.edit().putInt(f81630k, 1).apply();
        }
    }

    /* renamed from: o */
    public void mo97361o(Date date) {
        synchronized (this.f81636b) {
            this.f81635a.edit().putInt(f81630k, -1).putLong(f81631l, date.getTime()).apply();
        }
    }

    /* renamed from: p */
    public void mo97362p() {
        synchronized (this.f81636b) {
            this.f81635a.edit().putInt(f81630k, 2).apply();
        }
    }
}
