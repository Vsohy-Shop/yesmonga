package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment$onViewCreated$1 */
public final class AccountConsentOptinsTabFragment$onViewCreated$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ AccountConsentOptinsTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountConsentOptinsTabFragment$onViewCreated$1(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment) {
        super(2);
        this.this$0 = accountConsentOptinsTabFragment;
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
                ComposerKt.m29845w0(2093064272, i, -1, "com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment.onViewCreated.<anonymous> (AccountConsentOptinsTabFragment.kt:40)");
            }
            final AccountConsentOptinsTabFragment accountConsentOptinsTabFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -618135827, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-618135827, i, -1, "com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment.onViewCreated.<anonymous>.<anonymous> (AccountConsentOptinsTabFragment.kt:41)");
                        }
                        AccountConsentOptinsTabViewModel Q0 = accountConsentOptinsTabFragment.mo67387U0();
                        String u = accountConsentOptinsTabFragment.mo67386T0().mo84181u();
                        AccountConsentOptinsTabComponentStatefulKt.m103216a(Q0, u + C36168a.f89277e, new C11300l<C22934l, C11079d2>(accountConsentOptinsTabFragment) {
                            /* renamed from: d */
                            public final void mo67397d(@C12579k C22934l lVar) {
                                Intrinsics.checkNotNullParameter(lVar, "p0");
                                ((AccountConsentOptinsTabFragment) this.receiver).mo67388V0(lVar);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo67397d((C22934l) obj);
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
