package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.C31027a;
import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.Executor;

/* renamed from: com.google.mlkit.common.sdkinternal.c0 */
public final /* synthetic */ class C33934c0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Executor f82347a;

    /* renamed from: b */
    public final /* synthetic */ C31027a f82348b;

    /* renamed from: c */
    public final /* synthetic */ C31029b f82349c;

    /* renamed from: d */
    public final /* synthetic */ C31049l f82350d;

    public /* synthetic */ C33934c0(Executor executor, C31027a aVar, C31029b bVar, C31049l lVar) {
        this.f82347a = executor;
        this.f82348b = aVar;
        this.f82349c = bVar;
        this.f82350d = lVar;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f82347a;
        C31027a aVar = this.f82348b;
        C31029b bVar = this.f82349c;
        C31049l lVar = this.f82350d;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            if (aVar.mo87705a()) {
                bVar.mo87708a();
            } else {
                lVar.mo87742b(e);
            }
            throw e;
        }
    }
}
