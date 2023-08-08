package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component.ExpressPickupBannerKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$expressPickupBanner$1 */
public final class CheckoutStep2ScreenKt$expressPickupBanner$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C26105b $slotSectionState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$expressPickupBanner$1(C26105b bVar) {
        super(3);
        this.$slotSectionState = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(888746762, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.expressPickupBanner.<anonymous> (CheckoutStep2Screen.kt:258)");
            }
            ExpressPickupBannerKt.m104222a(((C26105b.C26108c) this.$slotSectionState).mo75815d().mo119529h(), ((C26105b.C26108c) this.$slotSectionState).mo75815d().mo119527f(), oVar, 72);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
