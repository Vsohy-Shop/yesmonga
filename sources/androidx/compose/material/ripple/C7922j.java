package androidx.compose.material.ripple;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2234b;
import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,355:1\n50#2:356\n49#2:357\n1057#3,6:358\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:356\n83#1:357\n83#1:358,6\n*E\n"})
/* renamed from: androidx.compose.material.ripple.j */
public final class C7922j {
    @C12579k

    /* renamed from: a */
    public static final C2023z0<Float> f19046a = new C2023z0(15, 0, C1947b0.m8291c(), 2, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C1968g<Float> m25283c(C2240d dVar) {
        if (dVar instanceof C2237c.C2238a) {
            return f19046a;
        }
        if (dVar instanceof C2234b.C2235a) {
            return new C2023z0(45, 0, C1947b0.m8291c(), 2, (DefaultConstructorMarker) null);
        }
        if (dVar instanceof C2230a.C2232b) {
            return new C2023z0(45, 0, C1947b0.m8291c(), 2, (DefaultConstructorMarker) null);
        }
        return f19046a;
    }

    /* renamed from: d */
    public static final C1968g<Float> m25284d(C2240d dVar) {
        if (dVar instanceof C2237c.C2238a) {
            return f19046a;
        }
        if (dVar instanceof C2234b.C2235a) {
            return f19046a;
        }
        if (dVar instanceof C2230a.C2232b) {
            return new C2023z0(150, 0, C1947b0.m8291c(), 2, (DefaultConstructorMarker) null);
        }
        return f19046a;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public static final C2104a0 m25285e(boolean z, float f, long j, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i2 & 4) != 0) {
            j = C15240j2.f37547b.mo42851u();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        C8578k2 t = C8415c2.m30251t(C15240j2.m66071n(j), oVar, (i >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z);
        C16483g w = C16483g.m74451w(f);
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(valueOf) | oVar.mo15006n0(w);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C7915c(z, f, t, (DefaultConstructorMarker) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C7915c cVar = (C7915c) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return cVar;
    }
}
