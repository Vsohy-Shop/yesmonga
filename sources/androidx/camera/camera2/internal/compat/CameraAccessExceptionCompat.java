package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: a */
    public static final int f3223a = 4;

    /* renamed from: b */
    public static final int f3224b = 5;

    /* renamed from: c */
    public static final int f3225c = 1;

    /* renamed from: d */
    public static final int f3226d = 2;

    /* renamed from: e */
    public static final int f3227e = 3;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: f */
    public static final int f3228f = 1000;
    @C0344h1

    /* renamed from: g */
    public static final Set<Integer> f3229g = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));

    /* renamed from: v */
    public static final int f3230v = 10001;

    /* renamed from: w */
    public static final int f3231w = 10002;
    @C0344h1

    /* renamed from: x */
    public static final Set<Integer> f3232x = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(f3230v), Integer.valueOf(f3231w)})));
    private final CameraAccessException mCameraAccessException;
    private final int mReason;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat$a */
    public @interface C1047a {
    }

    public CameraAccessExceptionCompat(int i) {
        super(m4626b(i));
        this.mReason = i;
        this.mCameraAccessException = f3229g.contains(Integer.valueOf(i)) ? new CameraAccessException(i) : null;
    }

    /* renamed from: a */
    public static String m4625a(int i, String str) {
        return String.format("%s (%d): %s", new Object[]{m4627c(i), Integer.valueOf(i), str});
    }

    @C0363p0
    /* renamed from: b */
    public static String m4626b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    @C0359n0
    /* renamed from: c */
    public static String m4627c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    @C0359n0
    /* renamed from: f */
    public static CameraAccessExceptionCompat m4628f(@C0359n0 CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: d */
    public final int mo4283d() {
        return this.mReason;
    }

    @C0363p0
    /* renamed from: e */
    public CameraAccessException mo4284e() {
        return this.mCameraAccessException;
    }

    public CameraAccessExceptionCompat(int i, @C0363p0 String str) {
        super(m4625a(i, str));
        this.mReason = i;
        this.mCameraAccessException = f3229g.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str) : null;
    }

    public CameraAccessExceptionCompat(int i, @C0363p0 String str, @C0363p0 Throwable th) {
        super(m4625a(i, str), th);
        this.mReason = i;
        this.mCameraAccessException = f3229g.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    public CameraAccessExceptionCompat(int i, @C0363p0 Throwable th) {
        super(m4626b(i), th);
        this.mReason = i;
        this.mCameraAccessException = f3229g.contains(Integer.valueOf(i)) ? new CameraAccessException(i, (String) null, th) : null;
    }

    public CameraAccessExceptionCompat(@C0359n0 CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
