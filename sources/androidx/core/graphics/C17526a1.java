package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.a1 */
public final class C17526a1 {
    /* renamed from: a */
    public static final void m80345a(@C12579k Shader shader, @C12579k C11300l<? super Matrix, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(shader, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
