package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.C1500r0;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.c */
public final /* synthetic */ class C1374c implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C1381d f4002a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4003b;

    /* renamed from: c */
    public final /* synthetic */ C1500r0.C1501a f4004c;

    public /* synthetic */ C1374c(C1381d dVar, Executor executor, C1500r0.C1501a aVar) {
        this.f4002a = dVar;
        this.f4003b = executor;
        this.f4004c = aVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f4002a.m5865k(this.f4003b, this.f4004c, imageReader);
    }
}
