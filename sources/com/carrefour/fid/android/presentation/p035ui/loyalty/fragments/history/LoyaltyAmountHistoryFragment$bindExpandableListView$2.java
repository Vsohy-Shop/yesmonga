package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "date", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment$bindExpandableListView$2 */
public final class LoyaltyAmountHistoryFragment$bindExpandableListView$2 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ LoyaltyAmountHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyAmountHistoryFragment$bindExpandableListView$2(LoyaltyAmountHistoryFragment loyaltyAmountHistoryFragment) {
        super(1);
        this.this$0 = loyaltyAmountHistoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        this.this$0.mo71653l1().sendIntent(new LoyaltyAmountHistory.UserAction.GetCardOperation(str));
    }
}
