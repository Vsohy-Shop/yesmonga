package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.widget.n */
public final class C18490n {

    @C0376v0(19)
    /* renamed from: androidx.core.widget.n$a */
    public static class C18491a {
        @C0373u
        /* renamed from: a */
        public static View.OnTouchListener m83690a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @C0363p0
    /* renamed from: a */
    public static View.OnTouchListener m83689a(@C0359n0 Object obj) {
        return C18491a.m83690a((PopupMenu) obj);
    }
}
