package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.gifdecoder.C22073d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCouponsLoadingComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsLoadingComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsLoadingComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n154#2:78\n*S KotlinDebug\n*F\n+ 1 CouponsLoadingComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsLoadingComponentKt\n*L\n26#1:78\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsLoadingComponentKt */
public final class CouponsLoadingComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105651a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1153314203);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1153314203, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsLoadingComponent (CouponsLoadingComponent.kt:21)");
            }
            LazyDslKt.m10737b(PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16)), (LazyListState) null, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, CouponsLoadingComponentKt$CouponsLoadingComponent$1.f60035f, o, 100663302, C22073d.f56678l);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsLoadingComponentKt$CouponsLoadingComponent$2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105652b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(140893773);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(140893773, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsLoadingComponentPreview (CouponsLoadingComponent.kt:71)");
            }
            ThemeKt.m153788a(ComposableSingletons$CouponsLoadingComponentKt.f60006a.mo69863e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsLoadingComponentKt$CouponsLoadingComponentPreview$1(i));
        }
    }
}
