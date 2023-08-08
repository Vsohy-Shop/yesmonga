package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.o */
public final class C32074o extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ C32092u f78281b;

    public C32074o(C32092u uVar) {
        this.f78281b = uVar;
    }

    /* renamed from: a */
    public final void mo92420a() {
        if (this.f78281b.f78302k != null) {
            this.f78281b.f78293b.mo92778d("Unbind from service.", new Object[0]);
            this.f78281b.f78292a.unbindService(this.f78281b.f78301j);
            this.f78281b.f78296e = false;
            this.f78281b.f78302k = null;
            this.f78281b.f78301j = null;
        }
    }
}
