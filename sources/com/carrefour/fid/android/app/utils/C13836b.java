package com.carrefour.fid.android.app.utils;

import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19758j0;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.shared.util.C28936j;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.app.utils.b */
public final class C13836b implements C28936j {

    /* renamed from: a */
    public static final int f33760a = 0;

    /* renamed from: a */
    public void mo32775a(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, C19758j0.f50575e);
        FragmentExtensionKt.m58767r(fragment, str);
    }

    /* renamed from: b */
    public void mo32776b(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentExtensionKt.m58757h(fragment);
    }

    /* renamed from: c */
    public void mo32777c(@C12579k Fragment fragment, @C12579k String str, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "pdf");
        Intrinsics.checkNotNullParameter(lVar, "onError");
        FragmentExtensionKt.m58768s(fragment, str, lVar);
    }
}
