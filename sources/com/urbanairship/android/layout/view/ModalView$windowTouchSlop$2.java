package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 7, 1}, mo22520xi = 48)
public final class ModalView$windowTouchSlop$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalView$windowTouchSlop$2(Context context) {
        super(0);
        this.$context = context;
    }

    @C12579k
    public final Integer invoke() {
        return Integer.valueOf(ViewConfiguration.get(this.$context).getScaledWindowTouchSlop());
    }
}
