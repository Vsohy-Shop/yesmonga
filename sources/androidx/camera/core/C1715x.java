package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.x */
public final /* synthetic */ class C1715x implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4768a;

    /* renamed from: b */
    public final /* synthetic */ Context f4769b;

    public /* synthetic */ C1715x(CameraX cameraX, Context context) {
        this.f4768a = cameraX;
        this.f4769b = context;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return CameraX.m5343N(this.f4768a, this.f4769b, aVar);
    }
}
