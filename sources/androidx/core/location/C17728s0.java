package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.s0 */
public final /* synthetic */ class C17728s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17748m f46094a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46095b;

    public /* synthetic */ C17728s0(C17735w.C17748m mVar, Executor executor) {
        this.f46094a = mVar;
        this.f46095b = executor;
    }

    public final void run() {
        this.f46094a.m81068g(this.f46095b);
    }
}
