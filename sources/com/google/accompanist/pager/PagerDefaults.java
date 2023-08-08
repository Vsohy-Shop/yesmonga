package com.google.accompanist.pager;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import dev.chrisbanes.snapper.C10359a;
import dev.chrisbanes.snapper.C10360b;
import dev.chrisbanes.snapper.C10368f;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n*L\n139#1:581\n180#1:582\n220#1:583\n*E\n"})
public final class PagerDefaults {
    @C12579k

    /* renamed from: a */
    public static final PagerDefaults f37132a = new PagerDefaults();
    @C12579k

    /* renamed from: b */
    public static final C11300l<C10368f, Float> f37133b = PagerDefaults$singlePageFlingDistance$1.f37136f;
    @C12579k

    /* renamed from: c */
    public static final C11305q<C10368f, Integer, Integer, Integer> f37134c = PagerDefaults$singlePageSnapIndex$1.f37137f;

    /* renamed from: d */
    public static final int f37135d = 0;

    @C11395k(message = "MaximumFlingDistance has been deprecated in Snapper")
    @C10359a
    /* renamed from: e */
    public static /* synthetic */ void m64366e() {
    }

    @C10359a
    /* renamed from: g */
    public static /* synthetic */ void m64367g() {
    }

    @C11395k(message = "\naccompanist/pager is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @C11587t0(expression = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior(state = state)", imports = {"androidx.compose.foundation.pager.PagerDefaults"}))
    @C8540g
    @C10359a
    @C12579k
    /* renamed from: a */
    public final C2195g mo41989a(@C12579k PagerState pagerState, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, float f, @C12580l C8592o oVar, int i, int i2) {
        C2013v<Float> vVar2;
        C1968g<Float> gVar2;
        float f2;
        C8592o oVar2 = oVar;
        int i3 = i;
        PagerState pagerState2 = pagerState;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        oVar.mo14918M(132228799);
        if ((i2 & 2) != 0) {
            vVar2 = C2046v.m8765b(oVar, 0);
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 4) != 0) {
            gVar2 = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            f2 = C16483g.m74435M((float) 0);
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(132228799, i3, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:215)");
        }
        C2195g c = mo41991c(pagerState, vVar2, gVar2, f2, f37134c, oVar, (i3 & 14) | 576 | (i3 & 7168) | ((i3 << 3) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C11395k(message = "\n            accompanist/pager is deprecated.\n            The androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\n            For more migration information, please visit https://google.github.io/accompanist/pager/#migration\n    ")
    @C8540g
    @C10359a
    @C12579k
    /* renamed from: b */
    public final C2195g mo41990b(@C12579k PagerState pagerState, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super C10368f, Float> lVar, float f, @C12580l C8592o oVar, int i, int i2) {
        C2013v<Float> vVar2;
        C1968g<Float> gVar2;
        C11300l lVar2;
        float f2;
        C8592o oVar2 = oVar;
        int i3 = i;
        PagerState pagerState2 = pagerState;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        oVar2.mo14918M(1345971532);
        if ((i2 & 2) != 0) {
            vVar2 = C2046v.m8765b(oVar2, 0);
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 4) != 0) {
            gVar2 = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            lVar2 = f37133b;
        } else {
            lVar2 = lVar;
        }
        if ((i2 & 16) != 0) {
            f2 = C16483g.m74435M((float) 0);
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1345971532, i3, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:133)");
        }
        SnapperFlingBehavior c = C10360b.m38619c(pagerState.mo42017v(), SnapOffsets.f27992a.mo21770c(), f2, vVar2, gVar2, lVar2, oVar, ((i3 >> 6) & 896) | 36864 | ((i3 << 6) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    @C8540g
    @C10359a
    @C12579k
    /* renamed from: c */
    public final C2195g mo41991c(@C12579k PagerState pagerState, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, float f, @C12579k C11305q<? super C10368f, ? super Integer, ? super Integer, Integer> qVar, @C12580l C8592o oVar, int i, int i2) {
        C2013v<Float> vVar2;
        C1968g<Float> gVar2;
        float f2;
        C8592o oVar2 = oVar;
        int i3 = i;
        PagerState pagerState2 = pagerState;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        C11305q<? super C10368f, ? super Integer, ? super Integer, Integer> qVar2 = qVar;
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
        oVar2.mo14918M(-776119664);
        if ((i2 & 2) != 0) {
            vVar2 = C2046v.m8765b(oVar2, 0);
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 4) != 0) {
            gVar2 = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            f2 = C16483g.m74435M((float) 0);
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-776119664, i3, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:175)");
        }
        SnapperFlingBehavior d = C10360b.m38620d(pagerState.mo42017v(), SnapOffsets.f27992a.mo21770c(), f2, vVar2, gVar2, qVar, oVar, ((i3 >> 3) & 896) | 36864 | ((i3 << 3) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    @C12579k
    /* renamed from: d */
    public final C11300l<C10368f, Float> mo41992d() {
        return f37133b;
    }

    @C12579k
    /* renamed from: f */
    public final C11305q<C10368f, Integer, Integer, Integer> mo41993f() {
        return f37134c;
    }
}
