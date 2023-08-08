package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(29)
/* renamed from: androidx.camera.core.internal.compat.d */
public final class C1597d {
    @C0359n0
    /* renamed from: a */
    public static ImageWriter m6622a(@C0359n0 Surface surface, @C0337f0(from = 1) int i, int i2) {
        return ImageWriter.newInstance(surface, i, i2);
    }
}
