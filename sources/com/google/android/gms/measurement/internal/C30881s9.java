package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C42164rd;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
public final class C30881s9 {
    @C40974d0

    /* renamed from: a */
    public long f73951a;
    @C40974d0

    /* renamed from: b */
    public long f73952b;

    /* renamed from: c */
    public final C30823o f73953c;

    /* renamed from: d */
    public final /* synthetic */ C30905u9 f73954d;

    public C30881s9(C30905u9 u9Var) {
        this.f73954d = u9Var;
        this.f73953c = new C30869r9(this, u9Var.f74136a);
        long c = u9Var.f74136a.mo86900a().mo134770c();
        this.f73951a = c;
        this.f73952b = c;
    }

    /* renamed from: a */
    public final void mo87471a() {
        this.f73953c.mo87394b();
        this.f73951a = 0;
        this.f73952b = 0;
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87472b(long j) {
        this.f73953c.mo87394b();
    }

    @C0348i1
    /* renamed from: c */
    public final void mo87473c(long j) {
        this.f73954d.mo86866h();
        this.f73953c.mo87394b();
        this.f73951a = j;
        this.f73952b = j;
    }

    @C0348i1
    /* renamed from: d */
    public final boolean mo87474d(boolean z, boolean z2, long j) {
        this.f73954d.mo86866h();
        this.f73954d.mo86890i();
        C42164rd.m170787b();
        if (!this.f73954d.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73536h0)) {
            this.f73954d.f74136a.mo87103F().f73659o.mo87097b(this.f73954d.f74136a.mo86900a().mo134768a());
        } else if (this.f73954d.f74136a.mo87123o()) {
            this.f73954d.f74136a.mo87103F().f73659o.mo87097b(this.f73954d.f74136a.mo86900a().mo134768a());
        }
        long j2 = j - this.f73951a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f73952b;
                this.f73952b = j;
            }
            this.f73954d.f74136a.mo86903d().mo87493v().mo87464b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C30906ua.m124218y(this.f73954d.f74136a.mo87107K().mo86922s(!this.f73954d.f74136a.mo87130z().mo87072D()), bundle, true);
            if (!z2) {
                this.f73954d.f74136a.mo87105I().mo87334u("auto", "_e", bundle);
            }
            this.f73951a = j;
            this.f73953c.mo87394b();
            this.f73953c.mo87395d(3600000);
            return true;
        }
        this.f73954d.f74136a.mo86903d().mo87493v().mo87464b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
