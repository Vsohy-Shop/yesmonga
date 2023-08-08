package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.h0 */
public final /* synthetic */ class C1458h0 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ List f4210a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f4211b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4212c;

    /* renamed from: d */
    public final /* synthetic */ long f4213d;

    /* renamed from: e */
    public final /* synthetic */ boolean f4214e;

    public /* synthetic */ C1458h0(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z) {
        this.f4210a = list;
        this.f4211b = scheduledExecutorService;
        this.f4212c = executor;
        this.f4213d = j;
        this.f4214e = z;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return C1461i0.m6131j(this.f4210a, this.f4211b, this.f4212c, this.f4213d, this.f4214e, aVar);
    }
}
