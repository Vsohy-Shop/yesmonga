package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodProductDetailsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$Header$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1095:1\n36#2:1096\n1114#3,6:1097\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$Header$2\n*L\n757#1:1096\n757#1:1097,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$2 */
public final class NonFoodProductDetailsScreenKt$Header$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ boolean $enabledAction;
    final /* synthetic */ boolean $showFavButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$Header$2(boolean z, boolean z2, C11300l<? super C27870j, C11079d2> lVar, int i) {
        super(3);
        this.$showFavButton = z;
        this.$enabledAction = z2;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2411u0 r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$NavigationActionHeader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10 = r12 & 81
            r0 = 16
            if (r10 != r0) goto L_0x0016
            boolean r10 = r11.mo15011p()
            if (r10 != 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r11.mo14958a0()
            goto L_0x0087
        L_0x0016:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0025
            r10 = -1
            java.lang.String r0 = "com.carrefour.fid.android.product.presentation.ui.details.nal.Header.<anonymous> (NonFoodProductDetailsScreen.kt:752)"
            r1 = 509132777(0x1e58bfe9, float:1.1474631E-20)
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r10, r0)
        L_0x0025:
            boolean r10 = r9.$showFavButton
            if (r10 == 0) goto L_0x007e
            int r10 = com.carrefour.fid.android.product.C27609f.C27617h.ds_ic_like_outline
            r12 = 0
            androidx.compose.ui.graphics.painter.Painter r0 = androidx.compose.p004ui.res.C16015f.m71849d(r10, r11, r12)
            int r10 = com.carrefour.fid.android.product.C27609f.C27627r.accessibility_product_add_to_fav
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r10, r11, r12)
            boolean r1 = r9.$enabledAction
            r2 = 0
            kotlin.jvm.functions.l<com.carrefour.fid.android.product.presentation.ui.details.nal.j, kotlin.d2> r10 = r9.$actioner
            r5 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r5)
            boolean r5 = r11.mo15006n0(r10)
            java.lang.Object r6 = r11.mo14921N()
            if (r5 != 0) goto L_0x0054
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x005c
        L_0x0054:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$2$1$1 r6 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$2$1$1
            r6.<init>(r10)
            r11.mo14893C(r6)
        L_0x005c:
            r11.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            int r10 = r9.$$dirty
            int r10 = r10 << 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            r7 = r10 | 8
            r8 = 4
            r6 = r11
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151496a(r0, r1, r2, r4, r5, r6, r7, r8)
            androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
            com.carrefour.fid.android.design.theme.a r0 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r0 = r0.mo114202y()
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.SizeKt.m10092H(r10, r0)
            androidx.compose.foundation.layout.C2428y0.m10726a(r10, r11, r12)
        L_0x007e:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0087
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt$Header$2.invoke(androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, int):void");
    }
}
