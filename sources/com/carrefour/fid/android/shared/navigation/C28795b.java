package com.carrefour.fid.android.shared.navigation;

import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.navigation.b */
public final class C28795b {
    /* renamed from: a */
    public static final void m119161a(@C12579k Fragment fragment, boolean z) {
        C28794a aVar;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C19232h activity = fragment.getActivity();
        if (activity instanceof C28794a) {
            aVar = (C28794a) activity;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo83824t(z);
        }
    }
}
