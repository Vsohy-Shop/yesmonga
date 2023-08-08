package androidx.compose.animation.core;

import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.b */
public final class C1946b {
    @C12579k
    /* renamed from: a */
    public static final Animatable<Float, C1983k> m8287a(float f, float f2) {
        return new Animatable(Float.valueOf(f), VectorConvertersKt.m8224i(C11377x.f28521a), Float.valueOf(f2), (String) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ Animatable m8288b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return m8287a(f, f2);
    }
}
