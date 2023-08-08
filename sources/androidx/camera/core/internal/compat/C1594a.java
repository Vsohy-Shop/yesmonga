package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(26)
/* renamed from: androidx.camera.core.internal.compat.a */
public final class C1594a {
    @C0359n0
    /* renamed from: a */
    public static ImageWriter m6619a(@C0359n0 Surface surface, @C0337f0(from = 1) int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            return C1595b.m6620a(surface, i, i2);
        }
        if (i3 >= 29) {
            return C1597d.m6622a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }
}
