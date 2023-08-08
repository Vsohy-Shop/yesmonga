package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.r0 */
public final class C18353r0 {

    @C0376v0(17)
    /* renamed from: androidx.core.view.r0$a */
    public static class C18354a {
        @C0373u
        /* renamed from: a */
        public static int m83088a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @C0373u
        /* renamed from: b */
        public static int m83089b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @C0373u
        /* renamed from: c */
        public static int m83090c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m83091d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @C0373u
        /* renamed from: e */
        public static void m83092e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        @C0373u
        /* renamed from: f */
        public static void m83093f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        @C0373u
        /* renamed from: g */
        public static void m83094g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        @C0373u
        /* renamed from: h */
        public static void m83095h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m83080a(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a = C18354a.m83088a(marginLayoutParams);
        if (a == 0 || a == 1) {
            return a;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m83081b(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C18354a.m83089b(marginLayoutParams);
    }

    /* renamed from: c */
    public static int m83082c(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C18354a.m83090c(marginLayoutParams);
    }

    /* renamed from: d */
    public static boolean m83083d(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C18354a.m83091d(marginLayoutParams);
    }

    /* renamed from: e */
    public static void m83084e(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C18354a.m83092e(marginLayoutParams, i);
    }

    /* renamed from: f */
    public static void m83085f(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C18354a.m83093f(marginLayoutParams, i);
    }

    /* renamed from: g */
    public static void m83086g(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C18354a.m83094g(marginLayoutParams, i);
    }

    /* renamed from: h */
    public static void m83087h(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C18354a.m83095h(marginLayoutParams, i);
    }
}
