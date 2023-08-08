package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.graphics.C17616m0;
import androidx.core.util.C17992m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.d0 */
public final class C18140d0 {

    /* renamed from: a */
    public final DisplayCutout f46748a;

    @C0376v0(28)
    /* renamed from: androidx.core.view.d0$a */
    public static class C18141a {
        @C0373u
        /* renamed from: a */
        public static DisplayCutout m82320a(Rect rect, List<Rect> list) {
            C18131c0.m82298a();
            return C18122b0.m82284a(rect, list);
        }

        @C0373u
        /* renamed from: b */
        public static List<Rect> m82321b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @C0373u
        /* renamed from: c */
        public static int m82322c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @C0373u
        /* renamed from: d */
        public static int m82323d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @C0373u
        /* renamed from: e */
        public static int m82324e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @C0373u
        /* renamed from: f */
        public static int m82325f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.view.d0$b */
    public static class C18142b {
        @C0373u
        /* renamed from: a */
        public static DisplayCutout m82326a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            C18131c0.m82298a();
            return C18162e0.m82384a(insets, rect, rect2, rect3, rect4);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.d0$c */
    public static class C18143c {
        @C0373u
        /* renamed from: a */
        public static DisplayCutout m82327a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            C18131c0.m82298a();
            return C18178g0.m82398a(insets, rect, rect2, rect3, rect4, insets2);
        }

        @C0373u
        /* renamed from: b */
        public static Insets m82328b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18140d0(@C0363p0 Rect rect, @C0363p0 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? C18141a.m82320a(rect, list) : null);
    }

    /* renamed from: a */
    public static DisplayCutout m82311a(@C0359n0 C17616m0 m0Var, @C0363p0 Rect rect, @C0363p0 Rect rect2, @C0363p0 Rect rect3, @C0363p0 Rect rect4, @C0359n0 C17616m0 m0Var2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C18143c.m82327a(m0Var.mo52063h(), rect, rect2, rect3, rect4, m0Var2.mo52063h());
        } else if (i >= 29) {
            return C18142b.m82326a(m0Var.mo52063h(), rect, rect2, rect3, rect4);
        } else {
            if (i < 28) {
                return null;
            }
            Rect rect5 = new Rect(m0Var.f45995a, m0Var.f45996b, m0Var.f45997c, m0Var.f45998d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return C18141a.m82320a(rect5, arrayList);
        }
    }

    /* renamed from: i */
    public static C18140d0 m82312i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C18140d0(displayCutout);
    }

    @C0359n0
    /* renamed from: b */
    public List<Rect> mo52795b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18141a.m82321b(this.f46748a);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public int mo52796c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18141a.m82322c(this.f46748a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo52797d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18141a.m82323d(this.f46748a);
        }
        return 0;
    }

    /* renamed from: e */
    public int mo52798e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18141a.m82324e(this.f46748a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18140d0.class != obj.getClass()) {
            return false;
        }
        return C17992m.m81740a(this.f46748a, ((C18140d0) obj).f46748a);
    }

    /* renamed from: f */
    public int mo52800f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18141a.m82325f(this.f46748a);
        }
        return 0;
    }

    @C0359n0
    /* renamed from: g */
    public C17616m0 mo52801g() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17616m0.m80700g(C18143c.m82328b(this.f46748a));
        }
        return C17616m0.f45994e;
    }

    @C0376v0(28)
    /* renamed from: h */
    public DisplayCutout mo52802h() {
        return this.f46748a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f46748a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @C0359n0
    public String toString() {
        return "DisplayCutoutCompat{" + this.f46748a + "}";
    }

    public C18140d0(@C0359n0 C17616m0 m0Var, @C0363p0 Rect rect, @C0363p0 Rect rect2, @C0363p0 Rect rect3, @C0363p0 Rect rect4, @C0359n0 C17616m0 m0Var2) {
        this(m82311a(m0Var, rect, rect2, rect3, rect4, m0Var2));
    }

    public C18140d0(DisplayCutout displayCutout) {
        this.f46748a = displayCutout;
    }
}
