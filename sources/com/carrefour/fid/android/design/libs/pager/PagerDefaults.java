package com.carrefour.fid.android.design.libs.pager;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.libs.pager.snapper.C37469a;
import com.carrefour.fid.android.design.libs.pager.snapper.C37472d;
import com.carrefour.fid.android.design.libs.pager.snapper.SnapOffsets;
import com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior;
import com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehaviorDefaults;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,367:1\n154#2:368\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerDefaults\n*L\n75#1:368\n*E\n"})
public final class PagerDefaults {
    @C12579k

    /* renamed from: a */
    public static final PagerDefaults f94070a = new PagerDefaults();
    @C12579k

    /* renamed from: b */
    public static final C11305q<C37472d, Integer, Integer, Integer> f94071b = PagerDefaults$singlePageSnapIndex$1.f94073f;

    /* renamed from: c */
    public static final int f94072c = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2195g mo114084a(@C12579k PagerState pagerState, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, float f, @C12580l C11305q<? super C37472d, ? super Integer, ? super Integer, Integer> qVar, @C12580l C8592o oVar, int i, int i2) {
        C2013v<Float> vVar2;
        C1968g<Float> gVar2;
        float f2;
        C11305q qVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        PagerState pagerState2 = pagerState;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        oVar2.mo14918M(-2013092786);
        if ((i2 & 2) != 0) {
            vVar2 = C2046v.m8765b(oVar2, 0);
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 4) != 0) {
            gVar2 = SnapperFlingBehaviorDefaults.f94117a.mo114167d();
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            f2 = C16483g.m74435M((float) 0);
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            qVar2 = f94071b;
        } else {
            qVar2 = qVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2013092786, i3, -1, "com.carrefour.fid.android.design.libs.pager.PagerDefaults.flingBehavior (Pager.kt:70)");
        }
        SnapperFlingBehavior b = C37469a.m153771b(pagerState.mo114119w(), SnapOffsets.f94102a.mo114148c(), f2, vVar2, gVar2, qVar2, oVar, ((i3 >> 3) & 896) | 36912 | ((i3 << 3) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C12579k
    /* renamed from: b */
    public final C11305q<C37472d, Integer, Integer, Integer> mo114085b() {
        return f94071b;
    }
}
