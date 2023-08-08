package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.BannerComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initChallengeFid$1 */
public final class LoyaltyDetailViewFragment$initChallengeFid$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LoyaltyDetailViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$initChallengeFid$1(LoyaltyDetailViewFragment loyaltyDetailViewFragment) {
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
                ComposerKt.m29845w0(1038198289, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initChallengeFid.<anonymous> (LoyaltyDetailViewFragment.kt:431)");
            }
            final LoyaltyDetailViewFragment loyaltyDetailViewFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 418591982, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(418591982, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment.initChallengeFid.<anonymous>.<anonymous> (LoyaltyDetailViewFragment.kt:432)");
                        }
                        C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
                        String d = C16018i.m71858d(R.string.loyalty_challenge_fid_title, oVar2, 0);
                        long a = C16009b.m71825a(R.color.ds_grey_80, oVar2, 0);
                        C11304p<C8592o, Integer, C11079d2> a2 = ComposableSingletons$LoyaltyDetailViewFragmentKt.f60955a.mo71504a();
                        final LoyaltyDetailViewFragment loyaltyDetailViewFragment = loyaltyDetailViewFragment;
                        BannerComponentKt.m151328d(n, d, a2, R.drawable.ds_ic_challenge_fid, (String) null, (String) null, a, 0.0f, 0.0f, new C11289a<C11079d2>() {
                            public final void invoke() {
                                loyaltyDetailViewFragment.mo71521e1().tagChallengeFidClick();
                                FragmentKt.m118823k(loyaltyDetailViewFragment, C24481j.f61006a.mo71635a("mon-profil", "fidelite"));
                            }
                        }, oVar, 390, 432);
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
