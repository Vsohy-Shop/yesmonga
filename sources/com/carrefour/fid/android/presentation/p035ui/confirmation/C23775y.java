package com.carrefour.fid.android.presentation.p035ui.confirmation;

import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26620a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.y */
public final class C23775y implements C10158g<LuckyCartBottomSheetDialogFragment> {

    /* renamed from: a */
    public final Provider<C26620a> f59862a;

    public C23775y(Provider<C26620a> provider) {
        this.f59862a = provider;
    }

    /* renamed from: a */
    public static C10158g<LuckyCartBottomSheetDialogFragment> m105400a(Provider<C26620a> provider) {
        return new C23775y(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.confirmation.LuckyCartBottomSheetDialogFragment.analyticsHandler")
    /* renamed from: b */
    public static void m105401b(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment, C26620a aVar) {
        luckyCartBottomSheetDialogFragment.f59816f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment) {
        m105401b(luckyCartBottomSheetDialogFragment, this.f59862a.get());
    }
}
