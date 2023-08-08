package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;

/* renamed from: androidx.transition.c1 */
public class C20554c1 {

    /* renamed from: a */
    public static final C20655o1 f52990a;

    /* renamed from: b */
    public static final String f52991b = "ViewUtils";

    /* renamed from: c */
    public static final Property<View, Float> f52992c = new C20555a(Float.class, "translationAlpha");

    /* renamed from: d */
    public static final Property<View, Rect> f52993d = new C20556b(Rect.class, "clipBounds");

    /* renamed from: androidx.transition.c1$a */
    public class C20555a extends Property<View, Float> {
        public C20555a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C20554c1.m95686c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C20554c1.m95691h(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.c1$b */
    public class C20556b extends Property<View, Rect> {
        public C20556b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C18196h2.m82523P(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C18196h2.m82516M1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f52990a = new C20651n1();
        } else {
            f52990a = new C20642m1();
        }
    }

    /* renamed from: a */
    public static void m95684a(@C0359n0 View view) {
        f52990a.mo61685a(view);
    }

    /* renamed from: b */
    public static C20551b1 m95685b(@C0359n0 View view) {
        return new C20536a1(view);
    }

    /* renamed from: c */
    public static float m95686c(@C0359n0 View view) {
        return f52990a.mo61686c(view);
    }

    /* renamed from: d */
    public static C20676t1 m95687d(@C0359n0 View view) {
        return new C20673s1(view);
    }

    /* renamed from: e */
    public static void m95688e(@C0359n0 View view) {
        f52990a.mo61687d(view);
    }

    /* renamed from: f */
    public static void m95689f(@C0359n0 View view, @C0363p0 Matrix matrix) {
        f52990a.mo61809e(view, matrix);
    }

    /* renamed from: g */
    public static void m95690g(@C0359n0 View view, int i, int i2, int i3, int i4) {
        f52990a.mo61822f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    public static void m95691h(@C0359n0 View view, float f) {
        f52990a.mo61688g(view, f);
    }

    /* renamed from: i */
    public static void m95692i(@C0359n0 View view, int i) {
        f52990a.mo61851h(view, i);
    }

    /* renamed from: j */
    public static void m95693j(@C0359n0 View view, @C0359n0 Matrix matrix) {
        f52990a.mo61810i(view, matrix);
    }

    /* renamed from: k */
    public static void m95694k(@C0359n0 View view, @C0359n0 Matrix matrix) {
        f52990a.mo61811j(view, matrix);
    }
}
