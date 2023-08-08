package com.carrefour.fid.android.shared.util;

import android.view.LayoutInflater;
import androidx.appcompat.app.C0475e;
import androidx.viewbinding.C20752b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/viewbinding/b;", "T", "a", "()Landroidx/viewbinding/b;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewBindingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt$viewBinding$1\n*L\n1#1,126:1\n*E\n"})
public final class FragmentViewBindingDelegateKt$viewBinding$1 extends Lambda implements C11289a<T> {
    final /* synthetic */ C11300l<LayoutInflater, T> $bindingInflater;
    final /* synthetic */ C0475e $this_viewBinding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewBindingDelegateKt$viewBinding$1(C11300l<? super LayoutInflater, ? extends T> lVar, C0475e eVar) {
        super(0);
        this.$bindingInflater = lVar;
        this.$this_viewBinding = eVar;
    }

    @C12579k
    /* renamed from: a */
    public final T invoke() {
        C11300l<LayoutInflater, T> lVar = this.$bindingInflater;
        LayoutInflater layoutInflater = this.$this_viewBinding.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        return (C20752b) lVar.invoke(layoutInflater);
    }
}
