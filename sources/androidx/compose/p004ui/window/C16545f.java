package androidx.compose.p004ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.firebase.crashlytics.C32648f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.window.f */
public class C16545f implements C16543d {
    /* renamed from: a */
    public void mo48081a(@C12579k View view, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(view, "composeView");
        Intrinsics.checkNotNullParameter(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }

    /* renamed from: b */
    public void mo48082b(@C12579k WindowManager windowManager, @C12579k View view, @C12579k ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(view, "popupView");
        Intrinsics.checkNotNullParameter(layoutParams, C32648f.f79206e);
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* renamed from: c */
    public void mo48083c(@C12579k View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "composeView");
    }
}
