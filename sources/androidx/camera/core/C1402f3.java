package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.camera.core.f3 */
public class C1402f3 extends C1654n2 {

    /* renamed from: b */
    public final float f4061b;

    /* renamed from: c */
    public final float f4062c;

    public C1402f3(float f, float f2) {
        this.f4061b = f;
        this.f4062c = f2;
    }

    @C0363p0
    /* renamed from: e */
    public static Rational m5893e(@C0363p0 UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        Size b = useCase.mo4951b();
        if (b != null) {
            return new Rational(b.getWidth(), b.getHeight());
        }
        throw new IllegalStateException("UseCase " + useCase + " is not bound.");
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public PointF mo5078a(float f, float f2) {
        return new PointF(f / this.f4061b, f2 / this.f4062c);
    }

    public C1402f3(float f, float f2, @C0359n0 UseCase useCase) {
        super(m5893e(useCase));
        this.f4061b = f;
        this.f4062c = f2;
    }
}
