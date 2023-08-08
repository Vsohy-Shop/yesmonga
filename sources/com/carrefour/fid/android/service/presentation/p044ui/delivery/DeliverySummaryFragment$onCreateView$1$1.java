package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.Context;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19765l0;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment$onCreateView$1$1 */
public final class DeliverySummaryFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ DeliverySummaryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryFragment$onCreateView$1$1(DeliverySummaryFragment deliverySummaryFragment) {
        super(2);
        this.this$0 = deliverySummaryFragment;
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
                ComposerKt.m29845w0(635287203, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment.onCreateView.<anonymous>.<anonymous> (DeliverySummaryFragment.kt:41)");
            }
            C8550i1<DeliverySummaryPictoFormatter> localDeliverySummaryPictoFormatter = DeliverySummaryPictoFormatterKt.getLocalDeliverySummaryPictoFormatter();
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            C8550i1<DeliveryErrorMessageFormatter> localDeliveryErrorMessageFormatter = DeliveryErrorMessageFormatterKt.getLocalDeliveryErrorMessageFormatter();
            Context requireContext2 = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            C8572j1[] j1VarArr = {localDeliverySummaryPictoFormatter.mo16141f(new DeliverySummaryPictoFormatter(requireContext)), localDeliveryErrorMessageFormatter.mo16141f(new DeliveryErrorMessageFormatter(requireContext2))};
            final DeliverySummaryFragment deliverySummaryFragment = this.this$0;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 278948707, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(278948707, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DeliverySummaryFragment.kt:45)");
                        }
                        final DeliverySummaryFragment deliverySummaryFragment = deliverySummaryFragment;
                        ThemeKt.m153788a(C8553b.m31048b(oVar, 145430118, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(145430118, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliverySummaryFragment.kt:46)");
                                    }
                                    DeliverySummaryViewModel access$getViewModel = deliverySummaryFragment.getViewModel();
                                    DeliverySummaryAnalyticsReporter analytics$service_release = deliverySummaryFragment.getAnalytics$service_release();
                                    Address address = deliverySummaryFragment.getArgs().getAddress();
                                    DeliveryType deliveryType = deliverySummaryFragment.getArgs().getDeliveryType();
                                    String telephone = deliverySummaryFragment.getArgs().getTelephone();
                                    final DeliverySummaryFragment deliverySummaryFragment = deliverySummaryFragment;
                                    C283771 r5 = new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            if (deliverySummaryFragment.getArgs().getRestartSelectionOnBack()) {
                                                C19736g.m91827a(deliverySummaryFragment).mo58132X(C28330R.C28334id.delivery_graph, new DeliveryServiceSelectionFragmentArgs(deliverySummaryFragment.getArgs().getDeliveryType()).toBundle(), C19765l0.m91906a(C283781.INSTANCE));
                                                return;
                                            }
                                            C19736g.m91827a(deliverySummaryFragment).mo58152q0();
                                        }
                                    };
                                    final DeliverySummaryFragment deliverySummaryFragment2 = deliverySummaryFragment;
                                    C283802 r6 = new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            deliverySummaryFragment2.getNavigator().mo83843s(C19736g.m91827a(deliverySummaryFragment2), true);
                                        }
                                    };
                                    final DeliverySummaryFragment deliverySummaryFragment3 = deliverySummaryFragment;
                                    DeliverySummaryStatefulKt.DeliverySummaryStateful(access$getViewModel, analytics$service_release, address, deliveryType, telephone, r5, r6, new C11300l<String, C11079d2>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return C11079d2.f28267a;
                                        }

                                        public final void invoke(@C12579k String str) {
                                            String str2 = str;
                                            Intrinsics.checkNotNullParameter(str2, "title");
                                            FragmentKt.m118811B(deliverySummaryFragment3, NotificationComponent.Variant.ERROR, str2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                                        }
                                    }, oVar, 584);
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 6);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
