package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PriceComponentKt$PricePromoSmall$1 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $subPrice;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceComponentKt$PricePromoSmall$1(String str, int i) {
        super(3);
        this.$subPrice = str;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo112268a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(kVar, "$this$PriceWithUnderneath");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1186984792, i, -1, "com.carrefour.fid.android.design.components.compose.PricePromoSmall.<anonymous> (PriceComponent.kt:105)");
            }
            String str = this.$subPrice;
            if (str != null) {
                PriceComponentKt.m151583t((C8767m) null, str, true, oVar, (this.$$dirty & 112) | C22132b.f56831b, 1);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo112268a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
