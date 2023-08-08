package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.v */
public final /* synthetic */ class C1705v implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4744a;

    /* renamed from: b */
    public final /* synthetic */ Context f4745b;

    public /* synthetic */ C1705v(CameraX cameraX, Context context) {
        this.f4744a = cameraX;
        this.f4745b = context;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4744a.m5340K(this.f4745b, aVar);
    }
}
