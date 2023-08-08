package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1994n;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ColorVectorConverterKt {
    @C12579k

    /* renamed from: a */
    public static final C11300l<C15138c, C1945a1<C15240j2, C1994n>> f5219a = ColorVectorConverterKt$ColorToVector$1.f5222f;
    @C12579k

    /* renamed from: b */
    public static final float[] f5220b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    @C12579k

    /* renamed from: c */
    public static final float[] f5221c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    @C12579k
    /* renamed from: d */
    public static final C11300l<C15138c, C1945a1<C15240j2, C1994n>> m7783d(@C12579k C15240j2.C15241a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5219a;
    }

    /* renamed from: e */
    public static final float m7784e(int i, float f, float f2, float f3, float[] fArr) {
        return (f * fArr[i]) + (f2 * fArr[i + 3]) + (f3 * fArr[i + 6]);
    }
}
