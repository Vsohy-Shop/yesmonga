package androidx.compose.p004ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(33)
/* renamed from: androidx.compose.ui.text.android.i0 */
public final class C16081i0 {
    @C12579k

    /* renamed from: a */
    public static final C16081i0 f39970a = new C16081i0();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final boolean m72463a(@C12579k StaticLayout staticLayout) {
        Intrinsics.checkNotNullParameter(staticLayout, "layout");
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @C0373u
    @C11384m
    /* renamed from: b */
    public static final void m72464b(@C12579k StaticLayout.Builder builder, int i, int i2) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        C16078h0.m72461a();
        LineBreakConfig a = C16075g0.m72456a().setLineBreakStyle(i).setLineBreakWordStyle(i2).build();
        Intrinsics.checkNotNullExpressionValue(a, "Builder()\n              …\n                .build()");
        StaticLayout.Builder unused = builder.setLineBreakConfig(a);
    }
}
