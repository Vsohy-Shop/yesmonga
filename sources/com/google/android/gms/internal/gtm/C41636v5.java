package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import java.util.Random;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.v5 */
public final class C41636v5 {

    /* renamed from: a */
    public final Context f105147a;

    /* renamed from: b */
    public final Random f105148b;

    /* renamed from: c */
    public final String f105149c;

    public C41636v5(Context context, String str) {
        Random random = new Random();
        this.f105147a = (Context) C40843u.m166202l(context);
        this.f105149c = (String) C40843u.m166202l(str);
        this.f105148b = random;
    }

    /* renamed from: a */
    public final long mo135965a() {
        if (Math.max(0, mo135972h().getLong("FORBIDDEN_COUNT", 0)) == 0) {
            return 0;
        }
        return mo135971g(10000, 600000) + 10000;
    }

    /* renamed from: b */
    public final long mo135966b() {
        return mo135971g(7200000, 259200000) + 43200000;
    }

    /* renamed from: c */
    public final long mo135967c() {
        return mo135971g(600000, 86400000) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: d */
    public final void mo135968d() {
        long j;
        SharedPreferences h = mo135972h();
        long j2 = h.getLong("FORBIDDEN_COUNT", 0);
        long j3 = h.getLong("SUCCESSFUL_COUNT", 0);
        SharedPreferences.Editor edit = h.edit();
        if (j2 == 0) {
            j = 3;
        } else {
            j = Math.min(10, j2 + 1);
        }
        long max = Math.max(0, Math.min(j3, 10 - j));
        edit.putLong("FORBIDDEN_COUNT", j);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: e */
    public final void mo135969e() {
        SharedPreferences h = mo135972h();
        long j = h.getLong("SUCCESSFUL_COUNT", 0);
        long j2 = h.getLong("FORBIDDEN_COUNT", 0);
        long min = Math.min(10, j + 1);
        long max = Math.max(0, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = h.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }

    /* renamed from: f */
    public final boolean mo135970f() {
        if (Math.max(0, mo135972h().getLong("FORBIDDEN_COUNT", 0)) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final long mo135971g(long j, long j2) {
        SharedPreferences h = mo135972h();
        long max = Math.max(0, h.getLong("FORBIDDEN_COUNT", 0));
        return (long) (this.f105148b.nextFloat() * ((float) (j + ((long) ((((float) max) / ((float) ((max + Math.max(0, h.getLong("SUCCESSFUL_COUNT", 0))) + 1))) * ((float) (j2 - j)))))));
    }

    /* renamed from: h */
    public final SharedPreferences mo135972h() {
        String str;
        Context context = this.f105147a;
        String valueOf = String.valueOf(this.f105149c);
        if (valueOf.length() != 0) {
            str = "v5_gtmContainerRefreshPolicy_".concat(valueOf);
        } else {
            str = new String("v5_gtmContainerRefreshPolicy_");
        }
        return context.getSharedPreferences(str, 0);
    }
}
