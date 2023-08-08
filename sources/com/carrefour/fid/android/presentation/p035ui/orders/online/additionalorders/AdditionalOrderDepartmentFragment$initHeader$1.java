package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment$initHeader$1 */
public final class AdditionalOrderDepartmentFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ AdditionalOrderDepartmentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderDepartmentFragment$initHeader$1(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment) {
        super(2);
        this.this$0 = additionalOrderDepartmentFragment;
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
                ComposerKt.m29845w0(-1392134419, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment.initHeader.<anonymous> (AdditionalOrderDepartmentFragment.kt:157)");
            }
            final AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -774704528, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-774704528, i2, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment.initHeader.<anonymous>.<anonymous> (AdditionalOrderDepartmentFragment.kt:158)");
                        }
                        OfferDepartmentModel Q0 = additionalOrderDepartmentFragment.mo72673a1();
                        String quantityString = additionalOrderDepartmentFragment.getResources().getQuantityString(R.plurals.basket_builder_preview_subtitle, Q0.mo121688M(), new Object[]{Integer.valueOf(Q0.mo121688M())});
                        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…t.count\n                )");
                        String Q = Q0.mo121689Q();
                        if (Q == null) {
                            Q = "";
                        }
                        String d = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar, 0);
                        final AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment = additionalOrderDepartmentFragment;
                        HeaderComponentKt.m151505j(Q + C36306e.f89637a + quantityString + ")", (C16361p0) null, 0, 0, 0, (Painter) null, d, new C11289a<C11079d2>() {
                            public final void invoke() {
                                additionalOrderDepartmentFragment.requireActivity().onBackPressed();
                            }
                        }, oVar, 0, 62);
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
}
