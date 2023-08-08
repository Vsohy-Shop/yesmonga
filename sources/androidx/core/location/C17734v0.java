package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.v0 */
public final /* synthetic */ class C17734v0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17748m f46107a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46108b;

    public /* synthetic */ C17734v0(C17735w.C17748m mVar, Executor executor) {
        this.f46107a = mVar;
        this.f46108b = executor;
    }

    public final void run() {
        this.f46107a.m81069h(this.f46108b);
    }
}
