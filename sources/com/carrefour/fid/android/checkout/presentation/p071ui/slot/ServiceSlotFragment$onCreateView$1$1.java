package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.component.TodayBannerKt;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.extension.C28789y;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceSlotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotFragment$onCreateView$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,435:1\n76#2:436\n76#2:437\n*S KotlinDebug\n*F\n+ 1 ServiceSlotFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotFragment$onCreateView$1$1\n*L\n90#1:436\n91#1:437\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$onCreateView$1$1 */
public final class ServiceSlotFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ServiceSlotFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotFragment$onCreateView$1$1(ServiceSlotFragment serviceSlotFragment) {
        super(2);
        this.this$0 = serviceSlotFragment;
    }

    /* renamed from: a */
    public static final C39964a.C39975c m162602a(C8578k2<C39964a.C39975c> k2Var) {
        return k2Var.getValue();
    }

    /* renamed from: b */
    public static final String m162603b(C8578k2<FacilityServiceId> k2Var) {
        FacilityServiceId value = k2Var.getValue();
        if (value != null) {
            return value.mo119111j();
        }
        return null;
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
                ComposerKt.m29845w0(-433690550, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment.onCreateView.<anonymous>.<anonymous> (ServiceSlotFragment.kt:88)");
            }
            C8578k2 a = C8415c2.m30232a(this.this$0.mo131508b1().getUiState(), C39964a.C39975c.f101961i.mo131851a(), (CoroutineContext) null, oVar, 72, 2);
            final String b = m162603b(C8415c2.m30233b(this.this$0.mo131508b1().mo131738D0(), (CoroutineContext) null, oVar, 8, 1));
            if (b != null && !m162602a(a).isLoading()) {
                boolean e = C28789y.m119122e(b);
                final ServiceSlotFragment serviceSlotFragment = this.this$0;
                TodayBannerKt.m162649a(e, new C11289a<C11079d2>() {
                    public final void invoke() {
                        serviceSlotFragment.mo131505Y0().mo131448j();
                        C19736g.m91827a(serviceSlotFragment).mo58142g0(C39925e.f101812a.mo131647a(b, serviceSlotFragment.mo131506Z0().mo131623s(), serviceSlotFragment.mo131506Z0().mo131616l(), serviceSlotFragment.mo131506Z0().mo131617m(), serviceSlotFragment.mo131506Z0().mo131619o(), serviceSlotFragment.mo131506Z0().mo131620p(), serviceSlotFragment.mo131506Z0().mo131621q()));
                    }
                }, oVar, 0, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
