package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.gtm.i4 */
public final class C41322i4 {

    /* renamed from: a */
    public final String f104670a;

    /* renamed from: b */
    public final long f104671b;

    /* renamed from: c */
    public final /* synthetic */ C41346j4 f104672c;

    public /* synthetic */ C41322i4(C41346j4 j4Var, String str, long j, C41298h4 h4Var) {
        boolean z;
        this.f104672c = j4Var;
        C40843u.m166198h("monitoring");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        this.f104670a = "monitoring";
        this.f104671b = j;
    }

    /* renamed from: a */
    public final Pair<String, Long> mo135481a() {
        long j;
        long d = mo135484d();
        if (d == 0) {
            j = 0;
        } else {
            j = Math.abs(d - this.f104672c.mo135748j().mo134768a());
        }
        long j2 = this.f104671b;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            mo135487g();
            return null;
        }
        String string = this.f104672c.f104701c.getString(mo135482b(), (String) null);
        long j3 = this.f104672c.f104701c.getLong(mo135485e(), 0);
        mo135487g();
        if (string == null || j3 <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    @C40974d0
    /* renamed from: b */
    public final String mo135482b() {
        return this.f104670a.concat(":value");
    }

    /* renamed from: c */
    public final void mo135483c(String str) {
        if (mo135484d() == 0) {
            mo135487g();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.f104672c.f104701c.getLong(mo135485e(), 0);
            if (j <= 0) {
                SharedPreferences.Editor edit = this.f104672c.f104701c.edit();
                edit.putString(mo135482b(), str);
                edit.putLong(mo135485e(), 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            SharedPreferences.Editor edit2 = this.f104672c.f104701c.edit();
            if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                edit2.putString(mo135482b(), str);
            }
            edit2.putLong(mo135485e(), j2);
            edit2.apply();
        }
    }

    /* renamed from: d */
    public final long mo135484d() {
        return this.f104672c.f104701c.getLong(mo135486f(), 0);
    }

    /* renamed from: e */
    public final String mo135485e() {
        return this.f104670a.concat(":count");
    }

    /* renamed from: f */
    public final String mo135486f() {
        return this.f104670a.concat(":start");
    }

    /* renamed from: g */
    public final void mo135487g() {
        long a = this.f104672c.mo135748j().mo134768a();
        SharedPreferences.Editor edit = this.f104672c.f104701c.edit();
        edit.remove(mo135485e());
        edit.remove(mo135482b());
        edit.putLong(mo135486f(), a);
        edit.commit();
    }
}
