package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.i0 */
public final /* synthetic */ class C17708i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17744i f46070a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46071b;

    public /* synthetic */ C17708i0(C17735w.C17744i iVar, Executor executor) {
        this.f46070a = iVar;
        this.f46071b = executor;
    }

    public final void run() {
        this.f46070a.m81042e(this.f46071b);
    }
}
