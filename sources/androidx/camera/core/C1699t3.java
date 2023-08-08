package androidx.camera.core;

import androidx.camera.core.C1363b4;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.t3 */
public final /* synthetic */ class C1699t3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1363b4 f4728a;

    /* renamed from: b */
    public final /* synthetic */ C1363b4.C1369f f4729b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4730c;

    /* renamed from: d */
    public final /* synthetic */ C1363b4.C1368e f4731d;

    public /* synthetic */ C1699t3(C1363b4 b4Var, C1363b4.C1369f fVar, Executor executor, C1363b4.C1368e eVar) {
        this.f4728a = b4Var;
        this.f4729b = fVar;
        this.f4730c = executor;
        this.f4731d = eVar;
    }

    public final void run() {
        this.f4728a.m5755a0(this.f4729b, this.f4730c, this.f4731d);
    }
}
