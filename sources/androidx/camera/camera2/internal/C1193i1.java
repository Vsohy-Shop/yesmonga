package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.C1541a;
import com.google.common.util.concurrent.C32487a;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.i1 */
public final /* synthetic */ class C1193i1 implements C1541a {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f3435a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f3436b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f3437c;

    public /* synthetic */ C1193i1(CaptureSession captureSession, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        this.f3435a = captureSession;
        this.f3436b = sessionConfig;
        this.f3437c = cameraDevice;
    }

    public final C32487a apply(Object obj) {
        return this.f3435a.m4495p(this.f3436b, this.f3437c, (List) obj);
    }
}
