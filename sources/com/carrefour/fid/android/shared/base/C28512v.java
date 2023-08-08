package com.carrefour.fid.android.shared.base;

import android.content.Context;
import android.view.Window;
import androidx.annotation.C0329d0;
import androidx.core.content.C17318d;
import androidx.core.view.C18026a4;
import androidx.core.view.C18184g6;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.base.v */
public final class C28512v {
    /* renamed from: a */
    public static final void m118429a(@C12579k Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        C18026a4.m81880c(window, true);
    }

    /* renamed from: b */
    public static final void m118430b(@C12579k Window window, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "appContext");
        window.addFlags(Integer.MIN_VALUE);
        new C18184g6(window, window.getDecorView()).mo52852i(true);
        window.setStatusBarColor(C17318d.m79723f(context, C28444b.C28450f.ds_grey_white));
        window.setNavigationBarColor(C17318d.m79723f(context, C28444b.C28450f.ds_grey_40));
    }

    /* renamed from: c */
    public static final void m118431c(@C12579k Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        C18026a4.m81880c(window, false);
    }

    /* renamed from: d */
    public static final void m118432d(@C12579k Window window, @C12579k Context context, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "appContext");
        window.setBackgroundDrawable(C17318d.m79726i(context, i));
    }

    /* renamed from: e */
    public static final void m118433e(@C12579k Window window, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "appContext");
        window.addFlags(Integer.MIN_VALUE);
        new C18184g6(window, window.getDecorView()).mo52852i(true);
        window.setStatusBarColor(C17318d.m79723f(context, 17170445));
        window.setNavigationBarColor(C17318d.m79723f(context, C28444b.C28450f.ds_grey_40));
    }
}
