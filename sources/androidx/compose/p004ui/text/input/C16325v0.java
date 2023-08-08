package androidx.compose.p004ui.text.input;

import android.view.Choreographer;

/* renamed from: androidx.compose.ui.text.input.v0 */
public final /* synthetic */ class C16325v0 implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f40549a;

    public /* synthetic */ C16325v0(Runnable runnable) {
        this.f40549a = runnable;
    }

    public final void doFrame(long j) {
        C16329x0.m73569f(this.f40549a, j);
    }
}
