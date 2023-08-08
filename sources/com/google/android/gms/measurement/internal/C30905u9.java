package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0348i1;
import com.google.android.gms.internal.measurement.C42287z0;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
public final class C30905u9 extends C30665b4 {

    /* renamed from: c */
    public Handler f74004c;

    /* renamed from: d */
    public final C30893t9 f74005d = new C30893t9(this);

    /* renamed from: e */
    public final C30881s9 f74006e = new C30881s9(this);

    /* renamed from: f */
    public final C30857q9 f74007f = new C30857q9(this);

    public C30905u9(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m124202q(C30905u9 u9Var, long j) {
        u9Var.mo86866h();
        u9Var.mo87500s();
        u9Var.f74136a.mo86903d().mo87493v().mo87464b("Activity paused, time", Long.valueOf(j));
        u9Var.f74007f.mo87447a(j);
        if (u9Var.f74136a.mo87130z().mo87072D()) {
            u9Var.f74006e.mo87472b(j);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m124203r(C30905u9 u9Var, long j) {
        u9Var.mo86866h();
        u9Var.mo87500s();
        u9Var.f74136a.mo86903d().mo87493v().mo87464b("Activity resumed, time", Long.valueOf(j));
        if (u9Var.f74136a.mo87130z().mo87072D() || u9Var.f74136a.mo87103F().f73662r.mo87052b()) {
            u9Var.f74006e.mo87473c(j);
        }
        u9Var.f74007f.mo87448b();
        C30893t9 t9Var = u9Var.f74005d;
        t9Var.f73971a.mo86866h();
        if (t9Var.f73971a.f74136a.mo87123o()) {
            t9Var.mo87482b(t9Var.f73971a.f74136a.mo86900a().mo134768a(), false);
        }
    }

    /* renamed from: n */
    public final boolean mo86895n() {
        return false;
    }

    @C0348i1
    /* renamed from: s */
    public final void mo87500s() {
        mo86866h();
        if (this.f74004c == null) {
            this.f74004c = new C42287z0(Looper.getMainLooper());
        }
    }
}
