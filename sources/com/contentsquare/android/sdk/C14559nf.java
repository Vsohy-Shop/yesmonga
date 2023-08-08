package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.contentsquare.android.sdk.nf */
public class C14559nf {

    /* renamed from: a */
    public final SharedPreferences f36029a;

    public C14559nf(Context context, String str) {
        this.f36029a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: g */
    public static String m62762g(String str) {
        return new C14539n1(str).mo35957a();
    }

    /* renamed from: a */
    public int mo35994a(String str, int i) {
        return C14358g3.m61811e(str) ? i : this.f36029a.getInt(m62762g(str), i);
    }

    /* renamed from: b */
    public long mo35995b(String str, long j) {
        return C14358g3.m61811e(str) ? j : this.f36029a.getLong(m62762g(str), j);
    }

    /* renamed from: c */
    public SharedPreferences mo35996c() {
        return this.f36029a;
    }

    /* renamed from: d */
    public String mo35997d(String str, String str2) {
        return C14358g3.m61811e(str) ? str2 : this.f36029a.getString(m62762g(str), str2);
    }

    /* renamed from: e */
    public boolean mo35998e(String str) {
        return !C14358g3.m61811e(str) && this.f36029a.contains(m62762g(str));
    }

    /* renamed from: f */
    public boolean mo35999f(String str, boolean z) {
        return C14358g3.m61811e(str) ? z : this.f36029a.getBoolean(m62762g(str), z);
    }

    /* renamed from: h */
    public void mo36000h(String str, int i) {
        if (!C14358g3.m61811e(str)) {
            SharedPreferences.Editor edit = this.f36029a.edit();
            edit.putInt(m62762g(str), i);
            edit.apply();
        }
    }

    /* renamed from: i */
    public void mo36001i(String str, long j) {
        if (!C14358g3.m61811e(str)) {
            SharedPreferences.Editor edit = this.f36029a.edit();
            edit.putLong(m62762g(str), j);
            edit.apply();
        }
    }

    /* renamed from: j */
    public void mo36002j(String str, String str2) {
        if (!C14358g3.m61811e(str)) {
            SharedPreferences.Editor edit = this.f36029a.edit();
            edit.putString(m62762g(str), str2);
            edit.apply();
        }
    }

    /* renamed from: k */
    public void mo36003k(String str, boolean z) {
        if (!C14358g3.m61811e(str)) {
            SharedPreferences.Editor edit = this.f36029a.edit();
            edit.putBoolean(m62762g(str), z);
            edit.apply();
        }
    }

    /* renamed from: l */
    public void mo36004l(String str) {
        SharedPreferences.Editor edit = this.f36029a.edit();
        edit.remove(m62762g(str));
        edit.apply();
    }
}
