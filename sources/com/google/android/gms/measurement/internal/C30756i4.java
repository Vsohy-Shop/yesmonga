package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
public final class C30756i4 {

    /* renamed from: a */
    public final String f73593a;

    /* renamed from: b */
    public final String f73594b;

    /* renamed from: c */
    public final String f73595c;

    /* renamed from: d */
    public final long f73596d;

    /* renamed from: e */
    public final /* synthetic */ C30780k4 f73597e;

    public /* synthetic */ C30756i4(C30780k4 k4Var, String str, long j, C30743h4 h4Var) {
        boolean z;
        this.f73597e = k4Var;
        C40843u.m166198h("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        this.f73593a = "health_monitor:start";
        this.f73594b = "health_monitor:count";
        this.f73595c = "health_monitor:value";
        this.f73596d = j;
    }

    @C0348i1
    /* renamed from: a */
    public final Pair mo87170a() {
        long j;
        this.f73597e.mo86866h();
        this.f73597e.mo86866h();
        long c = mo87172c();
        if (c == 0) {
            mo87173d();
            j = 0;
        } else {
            j = Math.abs(c - this.f73597e.f74136a.mo86900a().mo134768a());
        }
        long j2 = this.f73596d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            mo87173d();
            return null;
        }
        String string = this.f73597e.mo87191o().getString(this.f73595c, (String) null);
        long j3 = this.f73597e.mo87191o().getLong(this.f73594b, 0);
        mo87173d();
        if (string == null || j3 <= 0) {
            return C30780k4.f73646y;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87171b(String str, long j) {
        this.f73597e.mo86866h();
        if (mo87172c() == 0) {
            mo87173d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f73597e.mo87191o().getLong(this.f73594b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f73597e.mo87191o().edit();
            edit.putString(this.f73595c, str);
            edit.putLong(this.f73594b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f73597e.mo87191o().edit();
        if ((this.f73597e.f74136a.mo87110N().mo87542u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f73595c, str);
        }
        edit2.putLong(this.f73594b, j3);
        edit2.apply();
    }

    @C0348i1
    /* renamed from: c */
    public final long mo87172c() {
        return this.f73597e.mo87191o().getLong(this.f73593a, 0);
    }

    @C0348i1
    /* renamed from: d */
    public final void mo87173d() {
        this.f73597e.mo86866h();
        long a = this.f73597e.f74136a.mo86900a().mo134768a();
        SharedPreferences.Editor edit = this.f73597e.mo87191o().edit();
        edit.remove(this.f73594b);
        edit.remove(this.f73595c);
        edit.putLong(this.f73593a, a);
        edit.apply();
    }
}
