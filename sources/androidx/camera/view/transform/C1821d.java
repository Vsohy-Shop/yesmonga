package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.view.C1803j0;

@C1803j0
/* renamed from: androidx.camera.view.transform.d */
public final class C1821d {
    @C0359n0

    /* renamed from: a */
    public final Matrix f5006a;
    @C0359n0

    /* renamed from: b */
    public final Size f5007b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C1821d(@C0359n0 Matrix matrix, @C0359n0 Size size) {
        this.f5006a = matrix;
        this.f5007b = size;
    }

    @C0359n0
    /* renamed from: a */
    public Matrix mo5995a() {
        return this.f5006a;
    }

    @C0359n0
    /* renamed from: b */
    public Size mo5996b() {
        return this.f5007b;
    }
}
