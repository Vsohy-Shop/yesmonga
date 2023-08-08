package com.carrefour.fid.android.app.extensions;

import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FragmentExtensionKt$startCustomerServiceRedirection$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $redirectionCallback;
    final /* synthetic */ Fragment $this_startCustomerServiceRedirection;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentExtensionKt$startCustomerServiceRedirection$1(C11289a<C11079d2> aVar, Fragment fragment) {
        super(0);
        this.$redirectionCallback = aVar;
        this.$this_startCustomerServiceRedirection = fragment;
    }

    public final void invoke() {
        C11289a<C11079d2> aVar = this.$redirectionCallback;
        if (aVar != null) {
            aVar.invoke();
        }
        C19232h activity = this.$this_startCustomerServiceRedirection.getActivity();
        if (activity != null) {
            String string = this.$this_startCustomerServiceRedirection.getString(R.string.customer_services_url);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_services_url)");
            ActivityKt.m118690C(activity, string);
        }
    }
}
