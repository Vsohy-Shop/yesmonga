package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.q1 */
public final /* synthetic */ class C1671q1 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4650a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1330w f4651b;

    public /* synthetic */ C1671q1(ImageCapture imageCapture, ImageCapture.C1330w wVar) {
        this.f4650a = imageCapture;
        this.f4651b = wVar;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4650a.m5388D0(this.f4651b, aVar);
    }
}
