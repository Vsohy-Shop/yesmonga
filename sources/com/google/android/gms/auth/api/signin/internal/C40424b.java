package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.installations.C33124s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@C40473a
/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C40424b {

    /* renamed from: c */
    public static final Lock f103043c = new ReentrantLock();
    @C0363p0
    @GuardedBy("sLk")

    /* renamed from: d */
    public static C40424b f103044d;

    /* renamed from: a */
    public final Lock f103045a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    public final SharedPreferences f103046b;

    @C40974d0
    public C40424b(Context context) {
        this.f103046b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static C40424b m164572b(@C0359n0 Context context) {
        C40843u.m166202l(context);
        Lock lock = f103043c;
        lock.lock();
        try {
            if (f103044d == null) {
                f103044d = new C40424b(context.getApplicationContext());
            }
            C40424b bVar = f103044d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f103043c.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    public static final String m164573k(String str, String str2) {
        return str + C33124s.f80355c + str2;
    }

    @C40473a
    /* renamed from: a */
    public void mo133510a() {
        this.f103045a.lock();
        try {
            this.f103046b.edit().clear().apply();
        } finally {
            this.f103045a.unlock();
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: c */
    public GoogleSignInAccount mo133511c() {
        String g;
        String g2 = mo133515g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo133515g(m164573k("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m164510A1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: d */
    public GoogleSignInOptions mo133512d() {
        String g;
        String g2 = mo133515g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo133515g(m164573k("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m164530A0(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: e */
    public String mo133513e() {
        return mo133515g("refreshToken");
    }

    @C40473a
    /* renamed from: f */
    public void mo133514f(@C0359n0 GoogleSignInAccount googleSignInAccount, @C0359n0 GoogleSignInOptions googleSignInOptions) {
        C40843u.m166202l(googleSignInAccount);
        C40843u.m166202l(googleSignInOptions);
        mo133518j("defaultGoogleSignInAccount", googleSignInAccount.mo133454G1());
        C40843u.m166202l(googleSignInAccount);
        C40843u.m166202l(googleSignInOptions);
        String G1 = googleSignInAccount.mo133454G1();
        mo133518j(m164573k("googleSignInAccount", G1), googleSignInAccount.mo133456L1());
        mo133518j(m164573k("googleSignInOptions", G1), googleSignInOptions.mo133478j1());
    }

    @C0363p0
    /* renamed from: g */
    public final String mo133515g(@C0359n0 String str) {
        this.f103045a.lock();
        try {
            return this.f103046b.getString(str, (String) null);
        } finally {
            this.f103045a.unlock();
        }
    }

    /* renamed from: h */
    public final void mo133516h(@C0359n0 String str) {
        this.f103045a.lock();
        try {
            this.f103046b.edit().remove(str).apply();
        } finally {
            this.f103045a.unlock();
        }
    }

    /* renamed from: i */
    public final void mo133517i() {
        String g = mo133515g("defaultGoogleSignInAccount");
        mo133516h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g)) {
            mo133516h(m164573k("googleSignInAccount", g));
            mo133516h(m164573k("googleSignInOptions", g));
        }
    }

    /* renamed from: j */
    public final void mo133518j(@C0359n0 String str, @C0359n0 String str2) {
        this.f103045a.lock();
        try {
            this.f103046b.edit().putString(str, str2).apply();
        } finally {
            this.f103045a.unlock();
        }
    }
}
