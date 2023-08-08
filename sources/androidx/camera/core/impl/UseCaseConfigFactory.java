package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.InitializationException;

public interface UseCaseConfigFactory {

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$a */
    public interface C1428a {
        @C0359n0
        /* renamed from: a */
        UseCaseConfigFactory mo4086a(@C0359n0 Context context) throws InitializationException;
    }

    @C0363p0
    /* renamed from: a */
    Config mo4721a(@C0359n0 CaptureType captureType);
}
