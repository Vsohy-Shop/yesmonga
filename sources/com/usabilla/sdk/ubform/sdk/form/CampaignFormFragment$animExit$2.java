package com.usabilla.sdk.ubform.sdk.form;

import android.os.Bundle;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignFormFragment$animExit$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ CampaignFormFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignFormFragment$animExit$2(CampaignFormFragment campaignFormFragment) {
        super(0);
        this.this$0 = campaignFormFragment;
    }

    @C12580l
    public final Integer invoke() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments == null) {
            return null;
        }
        return Integer.valueOf(arguments.getInt(CampaignFormFragment.f27631H0));
    }
}
