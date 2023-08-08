package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeComponent$2 */
public final class PromoCodeComponentKt$PromoCodeComponent$2 extends Lambda implements C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $currentCouponCode;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C11289a<C11079d2> $onCodeRemove;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onFocusTextField;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeComponent$2(String str, String str2, boolean z, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, int i, C11289a<C11079d2> aVar2) {
        super(4);
        this.$currentCouponCode = str;
        this.$errorMessage = str2;
        this.$isLoading = z;
        this.$onCodeValidation = lVar;
        this.$onFocusTextField = aVar;
        this.$$dirty = i;
        this.$onCodeRemove = aVar2;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo68833a(@C12579k C2373k kVar, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(kVar, "$this$ExpandableComponent");
        if ((i & 112) == 0) {
            if (oVar.mo14961b(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-973097856, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponent.<anonymous> (PromoCodeComponent.kt:72)");
            }
            if (z) {
                String str = this.$currentCouponCode;
                String str2 = this.$errorMessage;
                boolean z2 = this.$isLoading;
                C11300l<String, C11079d2> lVar = this.$onCodeValidation;
                C11289a<C11079d2> aVar = this.$onFocusTextField;
                int i4 = this.$$dirty;
                PromoCodeComponentKt.m104636e(str, str2, z2, lVar, aVar, oVar, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | ((i4 >> 3) & 57344));
                String str3 = this.$currentCouponCode;
                if (str3 != null) {
                    C11289a<C11079d2> aVar2 = this.$onCodeRemove;
                    int i5 = this.$$dirty;
                    PromoCodeComponentKt.m104639h(str3, aVar2, oVar, ((i5 >> 9) & 112) | (i5 & 14));
                }
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo68833a((C2373k) obj, ((Boolean) obj2).booleanValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
