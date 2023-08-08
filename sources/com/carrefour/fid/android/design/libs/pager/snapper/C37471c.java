package com.carrefour.fid.android.design.libs.pager.snapper;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapperFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapperFlingBehavior.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/SnapperFlingBehaviorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,587:1\n83#2,3:588\n1114#3,6:591\n*S KotlinDebug\n*F\n+ 1 SnapperFlingBehavior.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/SnapperFlingBehaviorKt\n*L\n69#1:588,3\n69#1:591,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.libs.pager.snapper.c */
public final class C37471c {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final SnapperFlingBehavior m153775a(@C12579k C37472d dVar, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12579k C11305q<? super C37472d, ? super Integer, ? super Integer, Integer> qVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(dVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
        oVar.mo14918M(67946402);
        if ((i2 & 2) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        if ((i2 & 4) != 0) {
            gVar = SnapperFlingBehaviorDefaults.f94117a.mo114167d();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(67946402, i, -1, "com.carrefour.fid.android.design.libs.pager.snapper.rememberSnapperFlingBehavior (SnapperFlingBehavior.kt:63)");
        }
        Object[] objArr = {dVar, vVar, gVar, qVar};
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= oVar.mo15006n0(objArr[i3]);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = new SnapperFlingBehavior(dVar, vVar, gVar, qVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return snapperFlingBehavior;
    }
}
