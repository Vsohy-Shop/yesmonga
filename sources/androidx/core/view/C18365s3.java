package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.s3 */
public final class C18365s3 {

    /* renamed from: a */
    public static final int f47059a = 0;

    /* renamed from: b */
    public static final int f47060b = 1;

    @C0376v0(18)
    /* renamed from: androidx.core.view.s3$a */
    public static class C18366a {
        @C0373u
        /* renamed from: a */
        public static int m83131a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @C0373u
        /* renamed from: b */
        public static void m83132b(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.s3$b */
    public static class C18367b {
        @C0373u
        /* renamed from: a */
        public static int m83133a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m83134b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @C0373u
        /* renamed from: c */
        public static void m83135c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static int m83124a(@C0359n0 ViewGroup viewGroup) {
        return C18366a.m83131a(viewGroup);
    }

    /* renamed from: b */
    public static int m83125b(@C0359n0 ViewGroup viewGroup) {
        return C18367b.m83133a(viewGroup);
    }

    /* renamed from: c */
    public static boolean m83126c(@C0359n0 ViewGroup viewGroup) {
        return C18367b.m83134b(viewGroup);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m83127d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: e */
    public static void m83128e(@C0359n0 ViewGroup viewGroup, int i) {
        C18366a.m83132b(viewGroup, i);
    }

    @Deprecated
    /* renamed from: f */
    public static void m83129f(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    /* renamed from: g */
    public static void m83130g(@C0359n0 ViewGroup viewGroup, boolean z) {
        C18367b.m83135c(viewGroup, z);
    }
}
