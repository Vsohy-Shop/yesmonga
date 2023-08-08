package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import java.util.concurrent.Executor;

@C0376v0(28)
/* renamed from: androidx.camera.camera2.internal.compat.t */
public class C1151t extends C1153v {
    public C1151t(@C0359n0 Context context) {
        super(context, (Object) null);
    }

    /* renamed from: i */
    public static C1151t m4857i(@C0359n0 Context context) {
        return new C1151t(context);
    }

    /* renamed from: k */
    public static boolean m4858k(@C0359n0 Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: b */
    public void mo4424b(@C0359n0 Executor executor, @C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        this.f3362a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @C0359n0
    /* renamed from: c */
    public CameraCharacteristics mo4425c(@C0359n0 String str) throws CameraAccessExceptionCompat {
        try {
            return super.mo4425c(str);
        } catch (RuntimeException e) {
            if (mo4438j(e)) {
                mo4439l(e);
            }
            throw e;
        }
    }

    @C0380x0("android.permission.CAMERA")
    /* renamed from: d */
    public void mo4426d(@C0359n0 String str, @C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f3362a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        } catch (IllegalArgumentException | SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (mo4438j(e3)) {
                mo4439l(e3);
            }
            throw e3;
        }
    }

    /* renamed from: f */
    public void mo4428f(@C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        this.f3362a.unregisterAvailabilityCallback(availabilityCallback);
    }

    /* renamed from: j */
    public final boolean mo4438j(@C0359n0 Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m4858k(th);
    }

    /* renamed from: l */
    public final void mo4439l(@C0359n0 Throwable th) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat((int) CameraAccessExceptionCompat.f3230v, th);
    }
}
