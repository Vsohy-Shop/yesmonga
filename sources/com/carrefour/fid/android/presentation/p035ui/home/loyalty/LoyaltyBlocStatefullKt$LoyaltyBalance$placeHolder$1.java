package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBalance$placeHolder$1 */
public final class LoyaltyBlocStatefullKt$LoyaltyBalance$placeHolder$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C26497f $loyaltyBalanceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBlocStatefullKt$LoyaltyBalance$placeHolder$1(C26497f fVar) {
        super(2);
        this.$loyaltyBalanceState = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1837553445, i, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBalance.<anonymous> (LoyaltyBlocStatefull.kt:348)");
            }
            LoyaltyBlocStatefullKt.m106438g(C28782t.m119108e(((C26497f.C26499b) this.$loyaltyBalanceState).mo77057d()), R.color.ds_brand_blue, oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
