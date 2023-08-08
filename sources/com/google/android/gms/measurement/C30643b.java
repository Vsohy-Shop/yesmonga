package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.measurement.internal.C30731g5;
import com.google.android.gms.measurement.internal.C30745h6;
import com.google.android.gms.measurement.internal.C30758i6;
import com.google.android.gms.measurement.internal.C30819n7;
import com.google.android.gms.measurement.internal.zzli;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.b */
public final class C30643b extends C30646e {

    /* renamed from: a */
    public final C30731g5 f73207a;

    /* renamed from: b */
    public final C30819n7 f73208b;

    public C30643b(@C0359n0 C30731g5 g5Var) {
        super((C30645d) null);
        C40843u.m166202l(g5Var);
        this.f73207a = g5Var;
        this.f73208b = g5Var.mo87105I();
    }

    /* renamed from: a */
    public final int mo86793a(String str) {
        this.f73208b.mo87315Q(str);
        return 25;
    }

    /* renamed from: b */
    public final void mo86794b(String str, String str2, Bundle bundle, long j) {
        this.f73208b.mo87332s(str, str2, bundle, true, false, j);
    }

    /* renamed from: c */
    public final void mo86795c(String str, String str2, Bundle bundle) {
        this.f73208b.mo87331r(str, str2, bundle);
    }

    /* renamed from: d */
    public final void mo86796d(String str) {
        this.f73207a.mo87129y().mo87616l(str, this.f73207a.mo86900a().mo134770c());
    }

    /* renamed from: e */
    public final void mo86797e(C30745h6 h6Var) {
        this.f73208b.mo87306H(h6Var);
    }

    /* renamed from: f */
    public final void mo86798f(C30758i6 i6Var) {
        this.f73208b.mo87337x(i6Var);
    }

    /* renamed from: g */
    public final void mo86799g(String str) {
        this.f73207a.mo87129y().mo87617m(str, this.f73207a.mo86900a().mo134770c());
    }

    /* renamed from: h */
    public final List mo86800h(String str, String str2) {
        return this.f73208b.mo87324Z(str, str2);
    }

    /* renamed from: i */
    public final Map mo86801i(String str, String str2, boolean z) {
        return this.f73208b.mo87326b0(str, str2, z);
    }

    /* renamed from: j */
    public final String mo86802j() {
        return this.f73208b.mo87320V();
    }

    /* renamed from: k */
    public final String mo86803k() {
        return this.f73208b.mo87321W();
    }

    /* renamed from: l */
    public final void mo86804l(Bundle bundle) {
        this.f73208b.mo87302D(bundle);
    }

    /* renamed from: m */
    public final void mo86805m(C30758i6 i6Var) {
        this.f73208b.mo87312N(i6Var);
    }

    /* renamed from: n */
    public final void mo86806n(String str, String str2, Bundle bundle) {
        this.f73207a.mo87105I().mo87328o(str, str2, bundle);
    }

    /* renamed from: o */
    public final Boolean mo86807o() {
        return this.f73208b.mo87316R();
    }

    /* renamed from: p */
    public final String mo86808p() {
        return this.f73208b.mo87322X();
    }

    /* renamed from: q */
    public final Double mo86809q() {
        return this.f73208b.mo87317S();
    }

    /* renamed from: r */
    public final Integer mo86810r() {
        return this.f73208b.mo87318T();
    }

    /* renamed from: s */
    public final Long mo86811s() {
        return this.f73208b.mo87319U();
    }

    /* renamed from: t */
    public final String mo86812t() {
        return this.f73208b.mo87320V();
    }

    /* renamed from: u */
    public final String mo86813u() {
        return this.f73208b.mo87323Y();
    }

    /* renamed from: v */
    public final Object mo86814v(int i) {
        if (i == 0) {
            return this.f73208b.mo87323Y();
        }
        if (i == 1) {
            return this.f73208b.mo87319U();
        }
        if (i == 2) {
            return this.f73208b.mo87317S();
        }
        if (i != 3) {
            return this.f73208b.mo87316R();
        }
        return this.f73208b.mo87318T();
    }

    /* renamed from: w */
    public final Map mo86815w(boolean z) {
        List<zzli> a0 = this.f73208b.mo87325a0(z);
        C1866a aVar = new C1866a(a0.size());
        for (zzli zzli : a0) {
            Object M = zzli.mo87644M();
            if (M != null) {
                aVar.put(zzli.f74168b, M);
            }
        }
        return aVar;
    }

    public final long zzb() {
        return this.f73207a.mo87110N().mo87541t0();
    }
}
