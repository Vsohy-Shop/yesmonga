package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.content.Context;
import com.carrefour.fid.android.shared.base.BaseViewPagerAdapter;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "a", "()Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentParameterFragment$viewPagerAdapter$2 */
public final class AccountConsentParameterFragment$viewPagerAdapter$2 extends Lambda implements C11289a<BaseViewPagerAdapter> {
    final /* synthetic */ AccountConsentParameterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountConsentParameterFragment$viewPagerAdapter$2(AccountConsentParameterFragment accountConsentParameterFragment) {
        super(0);
        this.this$0 = accountConsentParameterFragment;
    }

    @C12579k
    /* renamed from: a */
    public final BaseViewPagerAdapter invoke() {
        AccountConsentParameterFragment accountConsentParameterFragment = this.this$0;
        Context context = accountConsentParameterFragment.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.content.Context");
        return new BaseViewPagerAdapter(accountConsentParameterFragment, context);
    }
}
