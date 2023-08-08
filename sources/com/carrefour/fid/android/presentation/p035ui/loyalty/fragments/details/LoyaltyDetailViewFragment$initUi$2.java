package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initUi$2 */
public final class LoyaltyDetailViewFragment$initUi$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LoyaltyDetailViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$initUi$2(LoyaltyDetailViewFragment loyaltyDetailViewFragment) {
        super(2);
        this.this$0 = loyaltyDetailViewFragment;
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
                ComposerKt.m29845w0(266668167, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initUi.<anonymous> (LoyaltyDetailViewFragment.kt:392)");
            }
            final LoyaltyDetailViewFragment loyaltyDetailViewFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1117067172, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1117067172, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initUi.<anonymous>.<anonymous> (LoyaltyDetailViewFragment.kt:393)");
                        }
                        final LoyaltyDetailViewFragment loyaltyDetailViewFragment = loyaltyDetailViewFragment;
                        C244601 r4 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                loyaltyDetailViewFragment.mo71524h1();
                            }
                        };
                        final LoyaltyDetailViewFragment loyaltyDetailViewFragment2 = loyaltyDetailViewFragment;
                        ManageLoyaltyCardButtonsComponentKt.m107683a((C8767m) null, r4, new C11289a<C11079d2>() {
                            public final void invoke() {
                                loyaltyDetailViewFragment2.mo71520d1();
                            }
                        }, oVar, 0, 1);
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
