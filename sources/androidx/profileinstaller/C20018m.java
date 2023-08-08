package androidx.profileinstaller;

import android.view.Choreographer;

/* renamed from: androidx.profileinstaller.m */
public final /* synthetic */ class C20018m implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f51252a;

    public /* synthetic */ C20018m(Runnable runnable) {
        this.f51252a = runnable;
    }

    public final void doFrame(long j) {
        this.f51252a.run();
    }
}
