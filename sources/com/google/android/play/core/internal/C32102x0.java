package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.x0 */
public final class C32102x0 extends C32093u0 {

    /* renamed from: a */
    public final C32099w0 f78316a = new C32099w0();

    /* renamed from: a */
    public final void mo92834a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f78316a.mo92840a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
