package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import org.jetbrains.annotations.C12579k;

public final class ElevationOverlayKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C3041f0> f7662a = CompositionLocalKt.m29859e(ElevationOverlayKt$LocalElevationOverlay$1.f7665f);
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C16483g> f7663b = CompositionLocalKt.m29858d((C8410b2) null, ElevationOverlayKt$LocalAbsoluteElevation$1.f7664f, 1, (Object) null);

    @C8540g
    @C8582l1
    /* renamed from: b */
    public static final long m13496b(long j, float f, C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long w = C15240j2.m66080w(ColorsKt.m13381b(j, oVar, i & 14), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return w;
    }

    @C12579k
    /* renamed from: c */
    public static final C8550i1<C16483g> m13497c() {
        return f7663b;
    }

    @C12579k
    /* renamed from: d */
    public static final C8550i1<C3041f0> m13498d() {
        return f7662a;
    }
}
