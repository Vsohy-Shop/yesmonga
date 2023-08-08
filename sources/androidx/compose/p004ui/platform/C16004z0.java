package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15256l0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.z0 */
public final class C16004z0<T> {
    @C12579k

    /* renamed from: a */
    public final C11304p<T, Matrix, C11079d2> f39690a;
    @C12580l

    /* renamed from: b */
    public Matrix f39691b;
    @C12580l

    /* renamed from: c */
    public Matrix f39692c;
    @C12580l

    /* renamed from: d */
    public float[] f39693d;
    @C12580l

    /* renamed from: e */
    public float[] f39694e;

    /* renamed from: f */
    public boolean f39695f = true;

    /* renamed from: g */
    public boolean f39696g = true;

    /* renamed from: h */
    public boolean f39697h = true;

    public C16004z0(@C12579k C11304p<? super T, ? super Matrix, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "getMatrix");
        this.f39690a = pVar;
    }

    @C12580l
    /* renamed from: a */
    public final float[] mo45983a(T t) {
        float[] fArr = this.f39694e;
        if (fArr == null) {
            fArr = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f39694e = fArr;
        }
        if (this.f39696g) {
            this.f39697h = C15993x0.m71801a(mo45984b(t), fArr);
            this.f39696g = false;
        }
        if (this.f39697h) {
            return fArr;
        }
        return null;
    }

    @C12579k
    /* renamed from: b */
    public final float[] mo45984b(T t) {
        float[] fArr = this.f39693d;
        if (fArr == null) {
            fArr = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f39693d = fArr;
        }
        if (!this.f39695f) {
            return fArr;
        }
        Matrix matrix = this.f39691b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f39691b = matrix;
        }
        this.f39690a.invoke(t, matrix);
        Matrix matrix2 = this.f39692c;
        if (matrix2 == null || !Intrinsics.areEqual((Object) matrix, (Object) matrix2)) {
            C15256l0.m66174b(fArr, matrix);
            this.f39691b = matrix2;
            this.f39692c = matrix;
        }
        this.f39695f = false;
        return fArr;
    }

    /* renamed from: c */
    public final void mo45985c() {
        this.f39695f = true;
        this.f39696g = true;
    }
}
