package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.component.OtherSlotsBannerKt;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.extension.C28789y;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment$onCreateView$1$1 */
public final class ServiceSlotOmrFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ServiceSlotOmrFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotOmrFragment$onCreateView$1$1(ServiceSlotOmrFragment serviceSlotOmrFragment) {
        super(2);
        this.this$0 = serviceSlotOmrFragment;
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
                ComposerKt.m29845w0(-629494976, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment.onCreateView.<anonymous>.<anonymous> (ServiceSlotOmrFragment.kt:81)");
            }
            boolean e = C28789y.m119122e(FacilityServiceId.m157958b(this.this$0.mo131545Y0().mo131662m()));
            final ServiceSlotOmrFragment serviceSlotOmrFragment = this.this$0;
            OtherSlotsBannerKt.m162647a(e, new C11289a<C11079d2>() {
                public final void invoke() {
                    C19736g.m91827a(serviceSlotOmrFragment).mo58156s0();
                }
            }, oVar, 0, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
