package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.w1 */
public final /* synthetic */ class C1712w1 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture.C1312k f4760a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1312k.C1314b f4761b;

    /* renamed from: c */
    public final /* synthetic */ long f4762c;

    /* renamed from: d */
    public final /* synthetic */ long f4763d;

    /* renamed from: e */
    public final /* synthetic */ Object f4764e;

    public /* synthetic */ C1712w1(ImageCapture.C1312k kVar, ImageCapture.C1312k.C1314b bVar, long j, long j2, Object obj) {
        this.f4760a = kVar;
        this.f4761b = bVar;
        this.f4762c = j;
        this.f4763d = j2;
        this.f4764e = obj;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4760a.m5530i(this.f4761b, this.f4762c, this.f4763d, this.f4764e, aVar);
    }
}
