package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import android.content.res.Configuration;
import androidx.compose.animation.C2046v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerDefaults;
import com.google.accompanist.pager.PagerState;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nPickupListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupListComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupListComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,65:1\n154#2:66\n154#2:67\n174#2:69\n154#2:70\n154#2:71\n76#3:68\n*S KotlinDebug\n*F\n+ 1 PickupListComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupListComponentKt\n*L\n29#1:66\n30#1:67\n34#1:69\n41#1:70\n47#1:71\n31#1:68\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponentKt */
public final class PickupListComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105047a(@C12580l C8767m mVar, @C12579k PagerState pagerState, @C12579k List<C38080a> list, @C12579k C11300l<? super C38080a, String> lVar, @C12579k C11300l<? super C38080a, C11079d2> lVar2, @C12579k C11300l<? super C38080a, C11079d2> lVar3, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        List<C38080a> list2 = list;
        int i3 = i;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        Intrinsics.checkNotNullParameter(list2, "pickupList");
        Intrinsics.checkNotNullParameter(lVar, "priceFormatter");
        Intrinsics.checkNotNullParameter(lVar2, "onPickupSelected");
        Intrinsics.checkNotNullParameter(lVar3, "onSeeOpenings");
        C8592o o = oVar.mo15009o(-990967086);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-990967086, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponent (PickupListComponent.kt:20)");
        }
        float f = (float) 16;
        float M = C16483g.m74435M(f);
        float M2 = C16483g.m74435M((float) 330);
        C2366i0 e = PaddingKt.m10018e(M, 0.0f, C16483g.m74435M(C11479u.m44444t(((float) ((Configuration) o.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).screenWidthDp) - M2, M)), 0.0f, 10, (Object) null);
        C8767m n = SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null);
        int size = list.size();
        float M3 = C16483g.m74435M(f);
        C2195g c = PagerDefaults.f37132a.mo41991c(pagerState, C2046v.m8765b(o, 0), SnapperFlingBehaviorDefaults.f28007a.mo21789d(), C16483g.m74435M((float) 0), PickupListComponentKt$PickupListComponent$1.f59693f, o, ((i3 >> 3) & 14) | 28224 | (PagerDefaults.f37135d << 15), 0);
        PickupListComponentKt$PickupListComponent$2 pickupListComponentKt$PickupListComponent$2 = new PickupListComponentKt$PickupListComponent$2(list2);
        C8767m mVar3 = mVar2;
        C8592o oVar2 = o;
        C8592o oVar3 = oVar2;
        PickupListComponentKt$PickupListComponent$2 pickupListComponentKt$PickupListComponent$22 = pickupListComponentKt$PickupListComponent$2;
        Pager.m64354a(size, n, pagerState, false, M3, e, (C8734c.C8737c) null, c, pickupListComponentKt$PickupListComponent$22, false, C8553b.m31048b(oVar2, -889703315, true, new PickupListComponentKt$PickupListComponent$3(list, M2, lVar, lVar2, i, lVar3)), oVar3, ((i3 << 3) & 896) | C12888a.f31808q, 6, 584);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupListComponentKt$PickupListComponent$4(mVar3, pagerState, list, lVar, lVar2, lVar3, i, i2));
        }
    }
}
