package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.analytics.C40372a0;

/* renamed from: com.google.android.gms.internal.gtm.j4 */
public final class C41346j4 extends C41535r0 {

    /* renamed from: c */
    public SharedPreferences f104701c;

    /* renamed from: d */
    public long f104702d;

    /* renamed from: e */
    public long f104703e = -1;

    /* renamed from: f */
    public final C41322i4 f104704f;

    public C41346j4(C41607u0 u0Var) {
        super(u0Var);
        mo135742P();
        this.f104704f = new C41322i4(this, "monitoring", C41634v3.f105112Q.mo135909b().longValue(), (C41298h4) null);
    }

    /* renamed from: W */
    public final void mo133294W() {
        this.f104701c = mo135734G().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: X */
    public final long mo135504X() {
        C40372a0.m164215h();
        mo135794T();
        long j = this.f104702d;
        if (j != 0) {
            return j;
        }
        long j2 = this.f104701c.getLong("first_run", 0);
        if (j2 != 0) {
            this.f104702d = j2;
            return j2;
        }
        long a = mo135748j().mo134768a();
        SharedPreferences.Editor edit = this.f104701c.edit();
        edit.putLong("first_run", a);
        if (!edit.commit()) {
            mo135762y("Failed to commit first run time");
        }
        this.f104702d = a;
        return a;
    }

    /* renamed from: Z */
    public final long mo135505Z() {
        C40372a0.m164215h();
        mo135794T();
        long j = this.f104703e;
        if (j != -1) {
            return j;
        }
        long j2 = this.f104701c.getLong("last_dispatch", 0);
        this.f104703e = j2;
        return j2;
    }

    /* renamed from: b0 */
    public final C41322i4 mo135506b0() {
        return this.f104704f;
    }

    /* renamed from: c0 */
    public final C41515q4 mo135507c0() {
        return new C41515q4(mo135748j(), mo135504X());
    }

    /* renamed from: d0 */
    public final String mo135508d0() {
        C40372a0.m164215h();
        mo135794T();
        String string = this.f104701c.getString("installation_campaign", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: e0 */
    public final void mo135509e0(String str) {
        C40372a0.m164215h();
        mo135794T();
        SharedPreferences.Editor edit = this.f104701c.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            mo135762y("Failed to commit campaign data");
        }
    }

    /* renamed from: f0 */
    public final void mo135510f0() {
        C40372a0.m164215h();
        mo135794T();
        long a = mo135748j().mo134768a();
        SharedPreferences.Editor edit = this.f104701c.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f104703e = a;
    }
}
