package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C30847q {

    /* renamed from: a */
    public final String f73862a;

    /* renamed from: b */
    public final String f73863b;

    /* renamed from: c */
    public final String f73864c;

    /* renamed from: d */
    public final long f73865d;

    /* renamed from: e */
    public final long f73866e;

    /* renamed from: f */
    public final zzau f73867f;

    public C30847q(C30731g5 g5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        C40843u.m166198h(str2);
        C40843u.m166198h(str3);
        this.f73862a = str2;
        this.f73863b = str3;
        this.f73864c = true == TextUtils.isEmpty(str) ? null : str;
        this.f73865d = j;
        this.f73866e = j2;
        if (j2 != 0 && j2 > j) {
            g5Var.mo86903d().mo87494w().mo87464b("Event created with reverse previous/current timestamps. appId", C30899u3.m124186z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    g5Var.mo86903d().mo87489r().mo87463a("Param name can't be null");
                    it.remove();
                } else {
                    Object o = g5Var.mo87110N().mo87532o(next, bundle2.get(next));
                    if (o == null) {
                        g5Var.mo86903d().mo87494w().mo87464b("Param value can't be null", g5Var.mo87101D().mo87411e(next));
                        it.remove();
                    } else {
                        g5Var.mo87110N().mo87504D(bundle2, next, o);
                    }
                }
            }
            zzau = new zzau(bundle2);
        }
        this.f73867f = zzau;
    }

    /* renamed from: a */
    public final C30847q mo87434a(C30731g5 g5Var, long j) {
        return new C30847q(g5Var, this.f73864c, this.f73862a, this.f73863b, this.f73865d, j, this.f73867f);
    }

    public final String toString() {
        String str = this.f73862a;
        String str2 = this.f73863b;
        String obj = this.f73867f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    public C30847q(C30731g5 g5Var, String str, String str2, String str3, long j, long j2, zzau zzau) {
        C40843u.m166198h(str2);
        C40843u.m166198h(str3);
        C40843u.m166202l(zzau);
        this.f73862a = str2;
        this.f73863b = str3;
        this.f73864c = true == TextUtils.isEmpty(str) ? null : str;
        this.f73865d = j;
        this.f73866e = j2;
        if (j2 != 0 && j2 > j) {
            g5Var.mo86903d().mo87494w().mo87465c("Event created with reverse previous/current timestamps. appId, name", C30899u3.m124186z(str2), C30899u3.m124186z(str3));
        }
        this.f73867f = zzau;
    }
}
