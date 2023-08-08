package com.carrefour.fid.android.core.extension;

import androidx.appcompat.widget.C0696c;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.app.extensions.C13825a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FragmentKt$checkOrRequestPermission$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Fragment $this_checkOrRequestPermission;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentKt$checkOrRequestPermission$2(Fragment fragment) {
        super(0);
        this.$this_checkOrRequestPermission = fragment;
    }

    public final void invoke() {
        C19232h activity;
        if (this.$this_checkOrRequestPermission.getActivity() != null && (activity = this.$this_checkOrRequestPermission.getActivity()) != null) {
            Intrinsics.checkNotNullExpressionValue(activity, C0696c.f2306r);
            C13825a.m58774c(activity);
        }
    }
}
