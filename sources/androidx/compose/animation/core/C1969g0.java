package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.g0 */
public final class C1969g0 {

    /* renamed from: a */
    public static final float f5488a = -4.2f;

    @C12579k
    /* renamed from: a */
    public static final C1950c<Float, C1983k> m8369a(@C12579k C1965f0 f0Var, float f, float f2) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return AnimationKt.m7990a(f0Var, f, f2);
    }

    /* renamed from: b */
    public static /* synthetic */ C1950c m8370b(C1965f0 f0Var, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m8369a(f0Var, f, f2);
    }
}
