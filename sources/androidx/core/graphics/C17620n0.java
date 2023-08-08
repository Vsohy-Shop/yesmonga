package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.n0 */
public final class C17620n0 {
    @C12579k
    /* renamed from: a */
    public static final Matrix m80706a(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    /* renamed from: b */
    public static /* synthetic */ Matrix m80707b(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return m80706a(f, f2, f3);
    }

    @C12579k
    /* renamed from: c */
    public static final Matrix m80708c(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    /* renamed from: d */
    public static /* synthetic */ Matrix m80709d(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return m80708c(f, f2);
    }

    @C12579k
    /* renamed from: e */
    public static final Matrix m80710e(@C12579k Matrix matrix, @C12579k Matrix matrix2) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(matrix2, "m");
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @C12579k
    /* renamed from: f */
    public static final Matrix m80711f(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    /* renamed from: g */
    public static /* synthetic */ Matrix m80712g(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m80711f(f, f2);
    }

    @C12579k
    /* renamed from: h */
    public static final float[] m80713h(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
