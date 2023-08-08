package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.text.C17897a;

/* renamed from: androidx.core.view.a4 */
public final class C18026a4 {

    /* renamed from: a */
    public static final int f46542a = 8;

    /* renamed from: b */
    public static final int f46543b = 9;

    /* renamed from: c */
    public static final int f46544c = 10;

    @C0376v0(16)
    /* renamed from: androidx.core.view.a4$a */
    public static class C18027a {
        @C0373u
        /* renamed from: a */
        public static void m81881a(@C0359n0 Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & -1793;
            } else {
                i = systemUiVisibility | C17897a.C17899b.f46339f;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.view.a4$b */
    public static class C18028b {
        @C0373u
        /* renamed from: a */
        public static <T> T m81882a(Window window, int i) {
            return window.requireViewById(i);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.a4$c */
    public static class C18029c {
        @C0373u
        /* renamed from: a */
        public static void m81883a(@C0359n0 Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C18184g6 m81878a(@C0359n0 Window window, @C0359n0 View view) {
        return new C18184g6(window, view);
    }

    @C0359n0
    /* renamed from: b */
    public static <T extends View> T m81879b(@C0359n0 Window window, @C0329d0 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C18028b.m81882a(window, i);
        }
        T findViewById = window.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    /* renamed from: c */
    public static void m81880c(@C0359n0 Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18029c.m81883a(window, z);
        } else {
            C18027a.m81881a(window, z);
        }
    }
}
