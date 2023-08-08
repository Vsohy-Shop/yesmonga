package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.o */
public final class C18492o {

    /* renamed from: a */
    public static final String f47263a = "PopupWindowCompatApi21";

    /* renamed from: b */
    public static Method f47264b;

    /* renamed from: c */
    public static boolean f47265c;

    /* renamed from: d */
    public static Method f47266d;

    /* renamed from: e */
    public static boolean f47267e;

    /* renamed from: f */
    public static Field f47268f;

    /* renamed from: g */
    public static boolean f47269g;

    @C0376v0(19)
    /* renamed from: androidx.core.widget.o$a */
    public static class C18493a {
        @C0373u
        /* renamed from: a */
        public static void m83696a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.widget.o$b */
    public static class C18494b {
        @C0373u
        /* renamed from: a */
        public static boolean m83697a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @C0373u
        /* renamed from: b */
        public static int m83698b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @C0373u
        /* renamed from: c */
        public static void m83699c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @C0373u
        /* renamed from: d */
        public static void m83700d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static boolean m83691a(@C0359n0 PopupWindow popupWindow) {
        return C18494b.m83697a(popupWindow);
    }

    /* renamed from: b */
    public static int m83692b(@C0359n0 PopupWindow popupWindow) {
        return C18494b.m83698b(popupWindow);
    }

    /* renamed from: c */
    public static void m83693c(@C0359n0 PopupWindow popupWindow, boolean z) {
        C18494b.m83699c(popupWindow, z);
    }

    /* renamed from: d */
    public static void m83694d(@C0359n0 PopupWindow popupWindow, int i) {
        C18494b.m83700d(popupWindow, i);
    }

    /* renamed from: e */
    public static void m83695e(@C0359n0 PopupWindow popupWindow, @C0359n0 View view, int i, int i2, int i3) {
        C18493a.m83696a(popupWindow, view, i, i2, i3);
    }
}
