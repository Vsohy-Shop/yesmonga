package androidx.camera.core.impl.utils;

import androidx.camera.core.C1417i2;

/* renamed from: androidx.camera.core.impl.utils.c */
public final class C1515c {

    /* renamed from: a */
    public static final String f4333a = "CameraOrientationUtil";

    /* renamed from: a */
    public static int m6373a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalStateException("Invalid sensor rotation: " + i);
    }

    /* renamed from: b */
    public static int m6374b(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C1417i2.m5917g(f4333a)) {
            C1417i2.m5911a(f4333a, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)}));
        }
        return i3;
    }

    /* renamed from: c */
    public static int m6375c(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
