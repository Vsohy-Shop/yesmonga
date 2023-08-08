package com.carrefour.fid.android.presentation.p035ui.loyalty;

import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.presentation.p035ui.loyalty.C24220a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$action$1$1 */
public final class LoyaltyBonusKt$LoyaltyBonusViewStateful$action$1$1 extends Lambda implements C11300l<C24220a, C11079d2> {
    final /* synthetic */ C11300l<List<LoyaltyBonus>, C11079d2> $onLoyaltyDetailClickListener;
    final /* synthetic */ C11289a<C11079d2> $onRetryClickListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusViewStateful$action$1$1(C11300l<? super List<LoyaltyBonus>, C11079d2> lVar, C11289a<C11079d2> aVar) {
        super(1);
        this.$onLoyaltyDetailClickListener = lVar;
        this.$onRetryClickListener = aVar;
    }

    /* renamed from: a */
    public final void mo70886a(@C12579k C24220a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (aVar instanceof C24220a.C24221a) {
            this.$onLoyaltyDetailClickListener.invoke(((C24220a.C24221a) aVar).mo70889d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24220a.C24222b.f60586a)) {
            this.$onRetryClickListener.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70886a((C24220a) obj);
        return C11079d2.f28267a;
    }
}
