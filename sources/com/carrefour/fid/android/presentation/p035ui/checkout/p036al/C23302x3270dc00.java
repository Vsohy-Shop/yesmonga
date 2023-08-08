package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.net.Uri;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3CgvFragment$handlerWebViewClient$1$shouldOverrideUrlLoading$1$1 */
public final class C23302x3270dc00 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Uri $it;
    final /* synthetic */ CheckoutStep3CgvFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23302x3270dc00(CheckoutStep3CgvFragment checkoutStep3CgvFragment, Uri uri) {
        super(0);
        this.this$0 = checkoutStep3CgvFragment;
        this.$it = uri;
    }

    public final void invoke() {
        CheckoutStep3CgvFragment checkoutStep3CgvFragment = this.this$0;
        String uri = this.$it.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "it.toString()");
        FragmentKt.m118812C(checkoutStep3CgvFragment, uri);
    }
}
