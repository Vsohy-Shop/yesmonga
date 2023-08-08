package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C1254v;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.q1 */
public final /* synthetic */ class C1229q1 implements C1254v.C1257c {

    /* renamed from: a */
    public final /* synthetic */ int f3525a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3526b;

    public /* synthetic */ C1229q1(int i, CallbackToFutureAdapter.C16559a aVar) {
        this.f3525a = i;
        this.f3526b = aVar;
    }

    /* renamed from: a */
    public final boolean mo4229a(TotalCaptureResult totalCaptureResult) {
        return C1236r1.m5104g(this.f3525a, this.f3526b, totalCaptureResult);
    }
}
