package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.u3 */
public final class C18386u3 {

    /* renamed from: a */
    public static final String f47067a = "ViewParentCompat";

    /* renamed from: b */
    public static int[] f47068b;

    @C0376v0(19)
    /* renamed from: androidx.core.view.u3$a */
    public static class C18387a {
        @C0373u
        /* renamed from: a */
        public static void m83197a(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.u3$b */
    public static class C18388b {
        @C0373u
        /* renamed from: a */
        public static boolean m83198a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m83199b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @C0373u
        /* renamed from: c */
        public static void m83200c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @C0373u
        /* renamed from: d */
        public static void m83201d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: e */
        public static void m83202e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @C0373u
        /* renamed from: f */
        public static boolean m83203f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @C0373u
        /* renamed from: g */
        public static void m83204g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static int[] m83181a() {
        int[] iArr = f47068b;
        if (iArr == null) {
            f47068b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f47068b;
    }

    /* renamed from: b */
    public static void m83182b(@C0359n0 ViewParent viewParent, @C0359n0 View view, @C0359n0 View view2, int i) {
        C18387a.m83197a(viewParent, view, view2, i);
    }

    /* renamed from: c */
    public static boolean m83183c(@C0359n0 ViewParent viewParent, @C0359n0 View view, float f, float f2, boolean z) {
        try {
            return C18388b.m83198a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m83184d(@C0359n0 ViewParent viewParent, @C0359n0 View view, float f, float f2) {
        try {
            return C18388b.m83199b(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            return false;
        }
    }

    /* renamed from: e */
    public static void m83185e(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i, int i2, @C0359n0 int[] iArr) {
        m83186f(viewParent, view, i, i2, iArr, 0);
    }

    /* renamed from: f */
    public static void m83186f(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i, int i2, @C0359n0 int[] iArr, int i3) {
        if (viewParent instanceof C18373t1) {
            ((C18373t1) viewParent).mo2391o(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C18388b.m83200c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
            }
        }
    }

    /* renamed from: g */
    public static void m83187g(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i, int i2, int i3, int i4) {
        m83189i(viewParent, view, i, i2, i3, i4, 0, m83181a());
    }

    /* renamed from: h */
    public static void m83188h(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i, int i2, int i3, int i4, int i5) {
        m83189i(viewParent, view, i, i2, i3, i4, i5, m83181a());
    }

    /* renamed from: i */
    public static void m83189i(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C18384u1) {
            ((C18384u1) viewParent2).mo2407q(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C18373t1) {
            ((C18373t1) viewParent2).mo2408r(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C18388b.m83201d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
            }
        }
    }

    /* renamed from: j */
    public static void m83190j(@C0359n0 ViewParent viewParent, @C0359n0 View view, @C0359n0 View view2, int i) {
        m83191k(viewParent, view, view2, i, 0);
    }

    /* renamed from: k */
    public static void m83191k(@C0359n0 ViewParent viewParent, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        if (viewParent instanceof C18373t1) {
            ((C18373t1) viewParent).mo2389m(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C18388b.m83202e(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    /* renamed from: l */
    public static boolean m83192l(@C0359n0 ViewParent viewParent, @C0359n0 View view, @C0359n0 View view2, int i) {
        return m83193m(viewParent, view, view2, i, 0);
    }

    /* renamed from: m */
    public static boolean m83193m(@C0359n0 ViewParent viewParent, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        if (viewParent instanceof C18373t1) {
            return ((C18373t1) viewParent).mo2409s(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C18388b.m83203f(viewParent, view, view2, i);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onStartNestedScroll");
            return false;
        }
    }

    /* renamed from: n */
    public static void m83194n(@C0359n0 ViewParent viewParent, @C0359n0 View view) {
        m83195o(viewParent, view, 0);
    }

    /* renamed from: o */
    public static void m83195o(@C0359n0 ViewParent viewParent, @C0359n0 View view, int i) {
        if (viewParent instanceof C18373t1) {
            ((C18373t1) viewParent).mo2390n(view, i);
        } else if (i == 0) {
            try {
                C18388b.m83204g(viewParent, view);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
            }
        }
    }

    @Deprecated
    /* renamed from: p */
    public static boolean m83196p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
