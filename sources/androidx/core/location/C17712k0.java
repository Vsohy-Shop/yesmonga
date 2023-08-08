package androidx.core.location;

import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.k0 */
public final /* synthetic */ class C17712k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17744i f46074a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46075b;

    /* renamed from: c */
    public final /* synthetic */ int f46076c;

    public /* synthetic */ C17712k0(C17735w.C17744i iVar, Executor executor, int i) {
        this.f46074a = iVar;
        this.f46075b = executor;
        this.f46076c = i;
    }

    public final void run() {
        this.f46074a.m81044g(this.f46075b, this.f46076c);
    }
}
