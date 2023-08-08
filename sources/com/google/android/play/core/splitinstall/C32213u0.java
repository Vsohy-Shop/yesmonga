package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.C32183a;

/* renamed from: com.google.android.play.core.splitinstall.u0 */
public final class C32213u0 implements C32174i0 {

    /* renamed from: a */
    public final /* synthetic */ C32167f f78550a;

    /* renamed from: b */
    public final /* synthetic */ Intent f78551b;

    /* renamed from: c */
    public final /* synthetic */ Context f78552c;

    /* renamed from: d */
    public final /* synthetic */ C32217w0 f78553d;

    public C32213u0(C32217w0 w0Var, C32167f fVar, Intent intent, Context context) {
        this.f78553d = w0Var;
        this.f78550a = fVar;
        this.f78551b = intent;
        this.f78552c = context;
    }

    /* renamed from: a */
    public final void mo92974a() {
        this.f78553d.f78559g.post(new C32215v0(this.f78553d, this.f78550a, 5, 0));
    }

    /* renamed from: b */
    public final void mo92975b() {
        if (!this.f78551b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f78551b.putExtra("triggered_from_app_after_verification", true);
            this.f78552c.sendBroadcast(this.f78551b);
            return;
        }
        this.f78553d.f78323a.mo92776b("Splits copied and verified more than once.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo92976b(@C32183a int i) {
        this.f78553d.f78559g.post(new C32215v0(this.f78553d, this.f78550a, 6, i));
    }
}
