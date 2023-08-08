package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import android.view.View;
import com.carrefour.fid.android.presentation.components.toolbar.C38407a;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/toolbar/a;", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/presentation/components/toolbar/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initUi$1 */
public final class LoyaltyDetailViewFragment$initUi$1 extends Lambda implements C11300l<C38407a, C11079d2> {
    final /* synthetic */ LoyaltyDetailViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$initUi$1(LoyaltyDetailViewFragment loyaltyDetailViewFragment) {
        super(1);
        this.this$0 = loyaltyDetailViewFragment;
    }

    /* renamed from: a */
    public final void mo71556a(@C12579k C38407a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$setup");
        aVar.mo121313n(ToolBarDefaultView.C38391a.C38400i.f97239b);
        aVar.mo121309j(true);
        aVar.mo121310k(true);
        final LoyaltyDetailViewFragment loyaltyDetailViewFragment = this.this$0;
        aVar.mo121312m(new C11300l<View, C11079d2>() {
            /* renamed from: a */
            public final void mo71557a(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                loyaltyDetailViewFragment.mo71518P1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71557a((View) obj);
                return C11079d2.f28267a;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71556a((C38407a) obj);
        return C11079d2.f28267a;
    }
}
