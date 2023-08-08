package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.i1 */
public final /* synthetic */ class C1416i1 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4079a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1320p f4080b;

    public /* synthetic */ C1416i1(ImageCapture imageCapture, ImageCapture.C1320p pVar) {
        this.f4079a = imageCapture;
        this.f4080b = pVar;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4079a.m5397K0(this.f4080b, aVar);
    }
}
