package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.of */
public class C14601of {

    /* renamed from: a */
    public final C14213b7 f36150a;

    public C14601of(C14213b7 b7Var) {
        this.f36150a = b7Var;
    }

    /* renamed from: a */
    public synchronized int mo36126a() {
        return this.f36150a.mo34670b(C14477k8.SCREEN_NUMBER, 0);
    }

    /* renamed from: b */
    public synchronized void mo36127b() {
        C14213b7 b7Var = this.f36150a;
        C14477k8 k8Var = C14477k8.SCREEN_NUMBER;
        this.f36150a.mo34679k(k8Var, b7Var.mo34670b(k8Var, 0) + 1);
    }
}
