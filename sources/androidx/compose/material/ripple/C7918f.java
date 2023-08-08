package androidx.compose.material.ripple;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n155#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
/* renamed from: androidx.compose.material.ripple.f */
public final class C7918f {

    /* renamed from: a */
    public static final float f19038a = C16483g.m74435M((float) 10);

    /* renamed from: b */
    public static final int f19039b = 75;

    /* renamed from: c */
    public static final int f19040c = 225;

    /* renamed from: d */
    public static final int f19041d = 150;

    /* renamed from: a */
    public static final float m25271a(@C12579k C16479d dVar, boolean z, long j) {
        Intrinsics.checkNotNullParameter(dVar, "$this$getRippleEndRadius");
        float m = C15094f.m64877m(C15096g.m64898a(C15104m.m65023t(j), C15104m.m65016m(j))) / 2.0f;
        if (z) {
            return m + dVar.mo7425g5(f19038a);
        }
        return m;
    }

    /* renamed from: b */
    public static final float m25272b(long j) {
        return Math.max(C15104m.m65023t(j), C15104m.m65016m(j)) * 0.3f;
    }
}
