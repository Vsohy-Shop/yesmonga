package androidx.camera.core;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CameraUnavailableException extends Exception {

    /* renamed from: a */
    public static final int f3685a = 0;

    /* renamed from: b */
    public static final int f3686b = 1;

    /* renamed from: c */
    public static final int f3687c = 2;

    /* renamed from: d */
    public static final int f3688d = 3;

    /* renamed from: e */
    public static final int f3689e = 4;

    /* renamed from: f */
    public static final int f3690f = 5;

    /* renamed from: g */
    public static final int f3691g = 6;
    private final int mReason;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraUnavailableException$a */
    public @interface C1299a {
    }

    public CameraUnavailableException(int i) {
        this.mReason = i;
    }

    /* renamed from: a */
    public int mo4769a() {
        return this.mReason;
    }

    public CameraUnavailableException(int i, @C0363p0 String str) {
        super(str);
        this.mReason = i;
    }

    public CameraUnavailableException(int i, @C0363p0 String str, @C0363p0 Throwable th) {
        super(str, th);
        this.mReason = i;
    }

    public CameraUnavailableException(int i, @C0363p0 Throwable th) {
        super(th);
        this.mReason = i;
    }
}
