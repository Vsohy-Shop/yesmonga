package androidx.work.impl;

import androidx.work.C21414w;
import kotlin.jvm.functions.C11289a;

/* renamed from: androidx.work.impl.l0 */
public final /* synthetic */ class C21204l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21191g0 f54724a;

    /* renamed from: b */
    public final /* synthetic */ String f54725b;

    /* renamed from: c */
    public final /* synthetic */ C21282o f54726c;

    /* renamed from: d */
    public final /* synthetic */ C11289a f54727d;

    /* renamed from: e */
    public final /* synthetic */ C21414w f54728e;

    public /* synthetic */ C21204l0(C21191g0 g0Var, String str, C21282o oVar, C11289a aVar, C21414w wVar) {
        this.f54724a = g0Var;
        this.f54725b = str;
        this.f54726c = oVar;
        this.f54727d = aVar;
        this.f54728e = wVar;
    }

    public final void run() {
        WorkerUpdater.m97682e(this.f54724a, this.f54725b, this.f54726c, this.f54727d, this.f54728e);
    }
}
