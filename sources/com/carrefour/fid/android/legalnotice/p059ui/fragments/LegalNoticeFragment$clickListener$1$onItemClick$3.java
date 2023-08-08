package com.carrefour.fid.android.legalnotice.p059ui.fragments;

import com.carrefour.fid.android.shared.constant.C28570n0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.LegalNoticeFragment$clickListener$1$onItemClick$3 */
public final class LegalNoticeFragment$clickListener$1$onItemClick$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ LegalNoticeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegalNoticeFragment$clickListener$1$onItemClick$3(LegalNoticeFragment legalNoticeFragment) {
        super(0);
        this.this$0 = legalNoticeFragment;
    }

    public final void invoke() {
        LegalNoticeFragment legalNoticeFragment = this.this$0;
        String u = legalNoticeFragment.mo119690T0().mo84181u();
        FragmentKt.m118812C(legalNoticeFragment, u + C28570n0.f69627c);
        this.this$0.f96892w.mo119685f();
    }
}
