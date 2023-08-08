package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.core.view.C18196h2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.f0 */
public class C20576f0 extends C20658p1 {

    /* renamed from: A1 */
    public static final C20583g f53052A1 = new C20581e();

    /* renamed from: B1 */
    public static final C20583g f53053B1 = new C20582f();

    /* renamed from: t1 */
    public static final TimeInterpolator f53054t1 = new DecelerateInterpolator();

    /* renamed from: u1 */
    public static final TimeInterpolator f53055u1 = new AccelerateInterpolator();

    /* renamed from: v1 */
    public static final String f53056v1 = "android:slide:screenPosition";

    /* renamed from: w1 */
    public static final C20583g f53057w1 = new C20577a();

    /* renamed from: x1 */
    public static final C20583g f53058x1 = new C20578b();

    /* renamed from: y1 */
    public static final C20583g f53059y1 = new C20579c();

    /* renamed from: z1 */
    public static final C20583g f53060z1 = new C20580d();

    /* renamed from: r1 */
    public C20583g f53061r1 = f53053B1;

    /* renamed from: s1 */
    public int f53062s1 = 80;

    /* renamed from: androidx.transition.f0$a */
    public class C20577a extends C20584h {
        public C20577a() {
            super((C20577a) null);
        }

        /* renamed from: b */
        public float mo61683b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.f0$b */
    public class C20578b extends C20584h {
        public C20578b() {
            super((C20577a) null);
        }

        /* renamed from: b */
        public float mo61683b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C18196h2.m82553Z(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.f0$c */
    public class C20579c extends C20585i {
        public C20579c() {
            super((C20577a) null);
        }

        /* renamed from: a */
        public float mo61684a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.f0$d */
    public class C20580d extends C20584h {
        public C20580d() {
            super((C20577a) null);
        }

        /* renamed from: b */
        public float mo61683b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.f0$e */
    public class C20581e extends C20584h {
        public C20581e() {
            super((C20577a) null);
        }

        /* renamed from: b */
        public float mo61683b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C18196h2.m82553Z(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.f0$f */
    public class C20582f extends C20585i {
        public C20582f() {
            super((C20577a) null);
        }

        /* renamed from: a */
        public float mo61684a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.f0$g */
    public interface C20583g {
        /* renamed from: a */
        float mo61684a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo61683b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.f0$h */
    public static abstract class C20584h implements C20583g {
        public C20584h() {
        }

        /* renamed from: a */
        public float mo61684a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ C20584h(C20577a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.f0$i */
    public static abstract class C20585i implements C20583g {
        public C20585i() {
        }

        /* renamed from: b */
        public float mo61683b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ C20585i(C20577a aVar) {
            this();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.f0$j */
    public @interface C20586j {
    }

    public C20576f0() {
        mo61682f1(80);
    }

    /* renamed from: V0 */
    private void m95748V0(C20657p0 p0Var) {
        int[] iArr = new int[2];
        p0Var.f53280b.getLocationOnScreen(iArr);
        p0Var.f53279a.put(f53056v1, iArr);
    }

    @C0363p0
    /* renamed from: Z0 */
    public Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        if (p0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) p0Var2.f53279a.get(f53056v1);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C20668r0.m96120a(view, p0Var2, iArr[0], iArr[1], this.f53061r1.mo61683b(viewGroup, view), this.f53061r1.mo61684a(viewGroup, view), translationX, translationY, f53054t1, this);
    }

    @C0363p0
    /* renamed from: b1 */
    public Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        if (p0Var == null) {
            return null;
        }
        int[] iArr = (int[]) p0Var.f53279a.get(f53056v1);
        return C20668r0.m96120a(view, p0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f53061r1.mo61683b(viewGroup, view), this.f53061r1.mo61684a(viewGroup, view), f53055u1, this);
    }

    /* renamed from: e1 */
    public int mo61681e1() {
        return this.f53062s1;
    }

    /* renamed from: f1 */
    public void mo61682f1(int i) {
        if (i == 3) {
            this.f53061r1 = f53057w1;
        } else if (i == 5) {
            this.f53061r1 = f53060z1;
        } else if (i == 48) {
            this.f53061r1 = f53059y1;
        } else if (i == 80) {
            this.f53061r1 = f53053B1;
        } else if (i == 8388611) {
            this.f53061r1 = f53058x1;
        } else if (i == 8388613) {
            this.f53061r1 = f53052A1;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f53062s1 = i;
        C20572e0 e0Var = new C20572e0();
        e0Var.mo61676k(i);
        mo61727R0(e0Var);
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        super.mo61635m(p0Var);
        m95748V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        super.mo61636s(p0Var);
        m95748V0(p0Var);
    }

    public C20576f0(int i) {
        mo61682f1(i);
    }

    @SuppressLint({"RestrictedApi"})
    public C20576f0(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53077h);
        int k = C17483q.m80235k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo61682f1(k);
    }
}
