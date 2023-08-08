package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo22516d2 = {"<anonymous>", "", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment$orderId$2 */
public final class AdditionalOrderBottomSheetFragment$orderId$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ AdditionalOrderBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderBottomSheetFragment$orderId$2(AdditionalOrderBottomSheetFragment additionalOrderBottomSheetFragment) {
        super(0);
        this.this$0 = additionalOrderBottomSheetFragment;
    }

    @C12579k
    public final String invoke() {
        Bundle arguments = this.this$0.getArguments();
        String string = arguments != null ? arguments.getString(AdditionalOrderBottomSheetFragment.f61708X) : null;
        return string == null ? "" : string;
    }
}
