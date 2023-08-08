package androidx.compose.foundation.gestures;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.AndroidOverscrollKt;
import androidx.compose.foundation.C2253k0;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8773n;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n36#2:580\n1114#3,6:581\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n190#1:580\n190#1:581,6\n*E\n"})
/* renamed from: androidx.compose.foundation.gestures.m */
public final class C2202m {
    @C12579k

    /* renamed from: a */
    public static final C2202m f5935a = new C2202m();

    /* renamed from: b */
    public static final int f5936b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2195g mo7540a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1107739818);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:187)");
        }
        C2013v b = C2046v.m8765b(oVar, 0);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(b);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new DefaultFlingBehavior(b, (C8773n) null, 2, (DefaultConstructorMarker) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return defaultFlingBehavior;
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: b */
    public final C2253k0 mo7541b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1809802212);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:200)");
        }
        C2253k0 b = AndroidOverscrollKt.m8817b(oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    /* renamed from: c */
    public final boolean mo7542c(@C12579k LayoutDirection layoutDirection, @C12579k Orientation orientation, boolean z) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        boolean z2 = true;
        boolean z3 = !z;
        if (layoutDirection != LayoutDirection.Rtl) {
            z2 = false;
        }
        if (!z2 || orientation == Orientation.Vertical) {
            return z3;
        }
        return !z3;
    }
}
