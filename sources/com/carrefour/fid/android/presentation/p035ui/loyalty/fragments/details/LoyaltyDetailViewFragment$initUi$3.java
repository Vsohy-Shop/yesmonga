package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.LoyaltyBonusKt;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a;
import java.util.List;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initUi$3 */
public final class LoyaltyDetailViewFragment$initUi$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LoyaltyDetailViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$initUi$3(LoyaltyDetailViewFragment loyaltyDetailViewFragment) {
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
                ComposerKt.m29845w0(-70164560, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initUi.<anonymous> (LoyaltyDetailViewFragment.kt:404)");
            }
            final LoyaltyDetailViewFragment loyaltyDetailViewFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1119493005, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1119493005, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initUi.<anonymous>.<anonymous> (LoyaltyDetailViewFragment.kt:405)");
                        }
                        LoyaltyDetailViewModel X0 = loyaltyDetailViewFragment.mo71521e1();
                        final LoyaltyDetailViewFragment loyaltyDetailViewFragment = loyaltyDetailViewFragment;
                        C244631 r0 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26609h.f65003a);
                            }
                        };
                        final LoyaltyDetailViewFragment loyaltyDetailViewFragment2 = loyaltyDetailViewFragment;
                        LoyaltyBonusKt.m106624j(X0, r0, new C11300l<List<? extends LoyaltyBonus>, C11079d2>() {
                            /* renamed from: a */
                            public final void mo71562a(@C12579k List<LoyaltyBonus> list) {
                                Intrinsics.checkNotNullParameter(list, "loyaltyBonusList");
                                loyaltyDetailViewFragment2.mo71523g1(list);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo71562a((List) obj);
                                return C11079d2.f28267a;
                            }
                        }, oVar, 8);
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
