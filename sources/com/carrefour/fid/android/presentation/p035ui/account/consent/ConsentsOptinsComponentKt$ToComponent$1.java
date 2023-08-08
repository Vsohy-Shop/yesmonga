package com.carrefour.fid.android.presentation.p035ui.account.consent;

import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ToComponent$1 */
public final class ConsentsOptinsComponentKt$ToComponent$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11300l<C22934l, C11079d2> $actioner;
    final /* synthetic */ ConsentOptIn $this_ToComponent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentsOptinsComponentKt$ToComponent$1(C11300l<? super C22934l, C11079d2> lVar, ConsentOptIn consentOptIn) {
        super(1);
        this.$actioner = lVar;
        this.$this_ToComponent = consentOptIn;
    }

    /* renamed from: a */
    public final void mo67421a(boolean z) {
        this.$actioner.invoke(new C22934l.C22935a(C10976s.m41419k(this.$this_ToComponent.mo117326h()), ChoiceOptIn.f95635a.mo117316a(z)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67421a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
