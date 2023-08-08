package com.carrefour.fid.android.shared.base;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/q;", "Landroidx/fragment/app/Fragment;", "Lkotlin/d2;", "onResume", "insetPolicy", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.base.q */
public abstract class C28499q extends Fragment {
    public static final int $stable = 0;

    public void insetPolicy() {
        C28504t tVar;
        C19232h activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "it.window");
            C28512v.m118429a(window);
            Window window2 = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "it.window");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
            C28512v.m118430b(window2, applicationContext);
        }
        C19232h activity2 = getActivity();
        if (activity2 instanceof C28504t) {
            tVar = (C28504t) activity2;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            tVar.mo83423j();
        }
    }

    public void onResume() {
        super.onResume();
        insetPolicy();
    }
}
