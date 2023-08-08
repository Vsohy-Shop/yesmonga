package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.widget.k */
public final class C18485k {

    @C0376v0(19)
    /* renamed from: androidx.core.widget.k$a */
    public static class C18486a {
        @C0373u
        /* renamed from: a */
        public static View.OnTouchListener m83681a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static View.OnTouchListener m83679a(@C0359n0 ListPopupWindow listPopupWindow, @C0359n0 View view) {
        return C18486a.m83681a(listPopupWindow, view);
    }

    @Deprecated
    /* renamed from: b */
    public static View.OnTouchListener m83680b(Object obj, View view) {
        return m83679a((ListPopupWindow) obj, view);
    }
}
