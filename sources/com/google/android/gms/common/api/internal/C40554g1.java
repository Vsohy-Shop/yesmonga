package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.auth.api.signin.internal.C40424b;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.C40670s;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
public final class C40554g1 implements C40670s {

    /* renamed from: a */
    public final /* synthetic */ C40655z f103370a;

    /* renamed from: b */
    public final /* synthetic */ boolean f103371b;

    /* renamed from: c */
    public final /* synthetic */ C40507i f103372c;

    /* renamed from: d */
    public final /* synthetic */ C40572j1 f103373d;

    public C40554g1(C40572j1 j1Var, C40655z zVar, boolean z, C40507i iVar) {
        this.f103373d = j1Var;
        this.f103370a = zVar;
        this.f103371b = z;
        this.f103372c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo133903a(@C0359n0 C40669r rVar) {
        Status status = (Status) rVar;
        C40424b.m164572b(this.f103373d.f103441i).mo133517i();
        if (status.mo133655p0() && this.f103373d.mo133760u()) {
            C40572j1 j1Var = this.f103373d;
            j1Var.mo133750i();
            j1Var.mo133748g();
        }
        this.f103370a.mo133793o(status);
        if (this.f103371b) {
            this.f103372c.mo133750i();
        }
    }
}
