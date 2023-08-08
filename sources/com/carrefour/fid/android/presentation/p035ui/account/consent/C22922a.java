package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.view.View;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.a */
public final /* synthetic */ class C22922a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AccountConsentDataTabFragment f58516a;

    /* renamed from: b */
    public final /* synthetic */ AccountDataViewModel.C25768a f58517b;

    public /* synthetic */ C22922a(AccountConsentDataTabFragment accountConsentDataTabFragment, AccountDataViewModel.C25768a aVar) {
        this.f58516a = accountConsentDataTabFragment;
        this.f58517b = aVar;
    }

    public final void onClick(View view) {
        AccountConsentDataTabFragment.m103200e1(this.f58516a, this.f58517b, view);
    }
}
