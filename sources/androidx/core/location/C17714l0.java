package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.l0 */
public final /* synthetic */ class C17714l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17744i f46077a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46078b;

    /* renamed from: c */
    public final /* synthetic */ C17677a f46079c;

    public /* synthetic */ C17714l0(C17735w.C17744i iVar, Executor executor, C17677a aVar) {
        this.f46077a = iVar;
        this.f46078b = executor;
        this.f46079c = aVar;
    }

    public final void run() {
        this.f46077a.m81045h(this.f46078b, this.f46079c);
    }
}
