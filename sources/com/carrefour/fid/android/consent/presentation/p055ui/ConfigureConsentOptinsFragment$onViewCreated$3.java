package com.carrefour.fid.android.consent.presentation.p055ui;

import androidx.core.p027os.C17779d;
import androidx.navigation.fragment.C19736g;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment$onViewCreated$3 */
public final class ConfigureConsentOptinsFragment$onViewCreated$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ConfigureConsentOptinsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigureConsentOptinsFragment$onViewCreated$3(ConfigureConsentOptinsFragment configureConsentOptinsFragment) {
        super(0);
        this.this$0 = configureConsentOptinsFragment;
    }

    public final void invoke() {
        this.this$0.requireActivity().mo57175g0().mo56857a(ConfigureConsentOptinsFragment.CONFIGURE_CONSENT_REQUEST_KEY, C17779d.m81164b(C11078d1.m42659a(ConfigureConsentOptinsFragment.CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY, Boolean.TRUE)));
        C19736g.m91827a(this.this$0).mo58152q0();
    }
}
