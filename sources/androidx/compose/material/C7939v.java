package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n154#2:103\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n71#1:103\n*E\n"})
/* renamed from: androidx.compose.material.v */
public final class C7939v implements C3041f0 {
    @C12579k

    /* renamed from: a */
    public static final C7939v f19086a = new C7939v();

    @C8540g
    @C8582l1
    /* renamed from: a */
    public long mo10754a(long j, float f, @C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        C7901q a = C7933t0.f19075a.mo11075a(oVar, 6);
        if (C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0 && !a.mo10976o()) {
            j = C15258l2.m66183h(ElevationOverlayKt.m13496b(j, f, oVar, (i & 112) | (i & 14)), j);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return j;
    }
}
