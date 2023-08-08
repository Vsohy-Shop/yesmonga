package com.usabilla.sdk.ubform.sdk.form;

import android.os.Bundle;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignFormFragment$style$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ CampaignFormFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignFormFragment$style$2(CampaignFormFragment campaignFormFragment) {
        super(0);
        this.this$0 = campaignFormFragment;
    }

    /* renamed from: a */
    public final int mo21163a() {
        Bundle arguments = this.this$0.getArguments();
        Integer valueOf = arguments == null ? null : Integer.valueOf(arguments.getInt("style"));
        return valueOf == null ? C9747c.C9762o.CampaignDialogTheme_Bottom : valueOf.intValue();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(mo21163a());
    }
}
