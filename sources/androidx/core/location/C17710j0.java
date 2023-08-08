package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.j0 */
public final /* synthetic */ class C17710j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17744i f46072a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46073b;

    public /* synthetic */ C17710j0(C17735w.C17744i iVar, Executor executor) {
        this.f46072a = iVar;
        this.f46073b = executor;
    }

    public final void run() {
        this.f46072a.m81043f(this.f46073b);
    }
}
