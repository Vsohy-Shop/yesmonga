package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.u0 */
public final /* synthetic */ class C17732u0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17748m f46103a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46104b;

    /* renamed from: c */
    public final /* synthetic */ int f46105c;

    public /* synthetic */ C17732u0(C17735w.C17748m mVar, Executor executor, int i) {
        this.f46103a = mVar;
        this.f46104b = executor;
        this.f46105c = i;
    }

    public final void run() {
        this.f46103a.m81066e(this.f46104b, this.f46105c);
    }
}
