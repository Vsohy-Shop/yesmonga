package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i, @C0359n0 String str, @C0363p0 Throwable th) {
        super(str, th);
        this.mImageCaptureError = i;
    }

    /* renamed from: a */
    public int mo4905a() {
        return this.mImageCaptureError;
    }
}
