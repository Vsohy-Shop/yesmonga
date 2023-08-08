package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.google.android.gms.ads.identifier.C40365a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
public final class C30722f9 extends C30965z9 {

    /* renamed from: d */
    public final Map f73395d = new HashMap();

    /* renamed from: e */
    public final C30730g4 f73396e;

    /* renamed from: f */
    public final C30730g4 f73397f;

    /* renamed from: g */
    public final C30730g4 f73398g;

    /* renamed from: h */
    public final C30730g4 f73399h;

    /* renamed from: i */
    public final C30730g4 f73400i;

    public C30722f9(C30822na naVar) {
        super(naVar);
        C30780k4 F = this.f74136a.mo87103F();
        F.getClass();
        this.f73396e = new C30730g4(F, "last_delete_stale", 0);
        C30780k4 F2 = this.f74136a.mo87103F();
        F2.getClass();
        this.f73397f = new C30730g4(F2, "backoff", 0);
        C30780k4 F3 = this.f74136a.mo87103F();
        F3.getClass();
        this.f73398g = new C30730g4(F3, "last_upload", 0);
        C30780k4 F4 = this.f74136a.mo87103F();
        F4.getClass();
        this.f73399h = new C30730g4(F4, "last_upload_attempt", 0);
        C30780k4 F5 = this.f74136a.mo87103F();
        F5.getClass();
        this.f73400i = new C30730g4(F5, "midnight_offset", 0);
    }

    /* renamed from: l */
    public final boolean mo86867l() {
        return false;
    }

    @C0348i1
    @Deprecated
    /* renamed from: m */
    public final Pair mo87061m(String str) {
        C30709e9 e9Var;
        C40365a.C40366a aVar;
        mo86866h();
        long c = this.f74136a.mo86900a().mo134770c();
        C30709e9 e9Var2 = (C30709e9) this.f73395d.get(str);
        if (e9Var2 != null && c < e9Var2.f73370c) {
            return new Pair(e9Var2.f73368a, Boolean.valueOf(e9Var2.f73369b));
        }
        C40365a.m164198d(true);
        long r = this.f74136a.mo87130z().mo87085r(str, C30742h3.f73525c) + c;
        try {
            long r2 = this.f74136a.mo87130z().mo87085r(str, C30742h3.f73527d);
            if (r2 > 0) {
                try {
                    aVar = C40365a.m164196a(this.f74136a.mo86902c());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (e9Var2 != null) {
                        if (c < e9Var2.f73370c + r2) {
                            return new Pair(e9Var2.f73368a, Boolean.valueOf(e9Var2.f73369b));
                        }
                    }
                    aVar = null;
                }
            } else {
                aVar = C40365a.m164196a(this.f74136a.mo86902c());
            }
            if (aVar == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String a = aVar.mo133250a();
            if (a != null) {
                e9Var = new C30709e9(a, aVar.mo133251b(), r);
            } else {
                e9Var = new C30709e9("", aVar.mo133251b(), r);
            }
            this.f73395d.put(str, e9Var);
            C40365a.m164198d(false);
            return new Pair(e9Var.f73368a, Boolean.valueOf(e9Var.f73369b));
        } catch (Exception e) {
            this.f74136a.mo86903d().mo87488q().mo87464b("Unable to get advertising id", e);
            e9Var = new C30709e9("", false, r);
        }
    }

    @C0348i1
    /* renamed from: n */
    public final Pair mo87062n(String str, C30738h hVar) {
        if (hVar.mo87142i(zzah.AD_STORAGE)) {
            return mo87061m(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    @C0348i1
    @Deprecated
    /* renamed from: o */
    public final String mo87063o(String str, boolean z) {
        String str2;
        mo86866h();
        if (z) {
            str2 = (String) mo87061m(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest t = C30906ua.m124216t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
