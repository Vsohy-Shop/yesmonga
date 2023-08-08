package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1647n;

public final class CameraValidator {

    /* renamed from: a */
    public static final String f4129a = "CameraValidator";

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(@C0363p0 String str, @C0363p0 Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public static void m5969a(@C0359n0 Context context, @C0359n0 C1504t tVar, @C0363p0 C1647n nVar) throws CameraIdListIncorrectException {
        Integer num;
        if (nVar != null) {
            try {
                num = nVar.mo5634d();
                if (num == null) {
                    C1417i2.m5924n(f4129a, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C1417i2.m5914d(f4129a, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            num = null;
        }
        C1417i2.m5911a(f4129a, "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + num);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (nVar == null || num.intValue() == 1)) {
                C1647n.f4605e.mo5635e(tVar.mo5322f());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (nVar == null || num.intValue() == 0) {
                C1647n.f4604d.mo5635e(tVar.mo5322f());
            }
        } catch (IllegalArgumentException e2) {
            C1417i2.m5913c(f4129a, "Camera LensFacing verification failed, existing cameras: " + tVar.mo5322f());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }
}
