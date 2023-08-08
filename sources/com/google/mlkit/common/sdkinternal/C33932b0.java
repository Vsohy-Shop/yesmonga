package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.C31027a;
import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.Callable;

/* renamed from: com.google.mlkit.common.sdkinternal.b0 */
public final /* synthetic */ class C33932b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33950m f82341a;

    /* renamed from: b */
    public final /* synthetic */ C31027a f82342b;

    /* renamed from: c */
    public final /* synthetic */ C31029b f82343c;

    /* renamed from: d */
    public final /* synthetic */ Callable f82344d;

    /* renamed from: e */
    public final /* synthetic */ C31049l f82345e;

    public /* synthetic */ C33932b0(C33950m mVar, C31027a aVar, C31029b bVar, Callable callable, C31049l lVar) {
        this.f82341a = mVar;
        this.f82342b = aVar;
        this.f82343c = bVar;
        this.f82344d = callable;
        this.f82345e = lVar;
    }

    public final void run() {
        this.f82341a.mo98732g(this.f82342b, this.f82343c, this.f82344d, this.f82345e);
    }
}
