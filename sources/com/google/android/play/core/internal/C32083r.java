package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.r */
public final class C32083r extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ IBinder f78283b;

    /* renamed from: c */
    public final /* synthetic */ C32089t f78284c;

    public C32083r(C32089t tVar, IBinder iBinder) {
        this.f78284c = tVar;
        this.f78283b = iBinder;
    }

    /* renamed from: a */
    public final void mo92420a() {
        C32092u uVar = this.f78284c.f78287c;
        uVar.f78302k = (IInterface) uVar.f78298g.mo92419a(this.f78283b);
        C32092u.m129945j(this.f78284c.f78287c);
        this.f78284c.f78287c.f78296e = false;
        for (Runnable run : this.f78284c.f78287c.f78295d) {
            run.run();
        }
        this.f78284c.f78287c.f78295d.clear();
    }
}
