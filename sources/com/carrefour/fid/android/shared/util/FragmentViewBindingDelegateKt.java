package com.carrefour.fid.android.shared.util;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.C0475e;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.C20752b;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class FragmentViewBindingDelegateKt {
    @C12579k
    /* renamed from: a */
    public static final <T extends C20752b> T m119490a(@C12579k ViewGroup viewGroup, @C12579k C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return (C20752b) qVar.invoke(from, viewGroup, Boolean.FALSE);
    }

    @C12579k
    /* renamed from: b */
    public static final <T extends C20752b> FragmentViewBindingDelegate<T> m119491b(@C12579k Fragment fragment, @C12579k C11300l<? super LayoutInflater, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "viewBindingFactory");
        return new FragmentViewBindingDelegate<>(fragment, lVar);
    }

    @C12579k
    /* renamed from: c */
    public static final <T extends C20752b> C11677z<T> m119492c(@C12579k C0475e eVar, @C12579k C11300l<? super LayoutInflater, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "bindingInflater");
        return C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewBindingDelegateKt$viewBinding$1(lVar, eVar));
    }

    @C12579k
    /* renamed from: d */
    public static final <T extends C20752b> C11677z<T> m119493d(@C12579k C19215c cVar, @C12579k C11300l<? super LayoutInflater, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "factory");
        return C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewBindingDelegateKt$viewBinding$2(lVar, cVar));
    }
}
