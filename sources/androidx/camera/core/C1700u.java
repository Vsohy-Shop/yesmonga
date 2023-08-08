package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.u */
public final /* synthetic */ class C1700u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4732a;

    /* renamed from: b */
    public final /* synthetic */ Context f4733b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4734c;

    /* renamed from: d */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4735d;

    /* renamed from: e */
    public final /* synthetic */ long f4736e;

    public /* synthetic */ C1700u(CameraX cameraX, Context context, Executor executor, CallbackToFutureAdapter.C16559a aVar, long j) {
        this.f4732a = cameraX;
        this.f4733b = context;
        this.f4734c = executor;
        this.f4735d = aVar;
        this.f4736e = j;
    }

    public final void run() {
        this.f4732a.m5339J(this.f4733b, this.f4734c, this.f4735d, this.f4736e);
    }
}
