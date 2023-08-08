package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.FlowKt;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.SizeMode;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCouponsFlowRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsFlowRow.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsFlowRowKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n76#2:47\n154#3:48\n154#3:49\n*S KotlinDebug\n*F\n+ 1 CouponsFlowRow.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsFlowRowKt\n*L\n24#1:47\n25#1:48\n27#1:49\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsFlowRowKt */
public final class CouponsFlowRowKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105650a(@C12579k C8767m mVar, @C12579k List<CouponModel> list, @C12579k List<String> list2, boolean z, @C12579k C11300l<? super CouponModel, C11079d2> lVar, @C12579k C11300l<? super CouponModel, C11079d2> lVar2, @C12579k C11304p<? super CouponModel, ? super Boolean, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        float f;
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(list, "coupons");
        Intrinsics.checkNotNullParameter(list2, "loadingButtonIds");
        Intrinsics.checkNotNullParameter(lVar, "onCouponClicked");
        Intrinsics.checkNotNullParameter(lVar2, "onScanClicked");
        Intrinsics.checkNotNullParameter(pVar, "onAddToCartClicked");
        C8592o o = oVar.mo15009o(-1883416278);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1883416278, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsFlowRow (CouponsFlowRow.kt:13)");
        } else {
            int i2 = i;
        }
        if (((Configuration) o.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).screenWidthDp > 400) {
            f = C16483g.m74435M((float) 16);
        } else {
            f = C16483g.m74435M((float) 0);
        }
        C8767m m = PaddingKt.m10026m(mVar2, f, 0.0f, 2, (Object) null);
        SizeMode sizeMode = SizeMode.Expand;
        MainAxisAlignment mainAxisAlignment = MainAxisAlignment.Start;
        CouponsFlowRowKt$CouponsFlowRow$1 couponsFlowRowKt$CouponsFlowRow$1 = r2;
        CouponsFlowRowKt$CouponsFlowRow$1 couponsFlowRowKt$CouponsFlowRow$12 = new CouponsFlowRowKt$CouponsFlowRow$1(list, list2, z, i, lVar, lVar2, pVar);
        C8552a b = C8553b.m31048b(o, 2126626212, true, couponsFlowRowKt$CouponsFlowRow$1);
        C8592o oVar2 = o;
        FlowKt.m64330c(m, sizeMode, mainAxisAlignment, 0.0f, (FlowCrossAxisAlignment) null, 0.0f, (MainAxisAlignment) null, b, oVar2, 12583344, 120);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsFlowRowKt$CouponsFlowRow$2(mVar, list, list2, z, lVar, lVar2, pVar, i));
        }
    }
}
