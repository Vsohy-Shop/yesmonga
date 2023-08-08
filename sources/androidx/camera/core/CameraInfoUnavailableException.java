package androidx.camera.core;

import androidx.annotation.RestrictTo;

public final class CameraInfoUnavailableException extends Exception {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInfoUnavailableException(String str, Throwable th) {
        super(str, th);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInfoUnavailableException(String str) {
        super(str);
    }
}
