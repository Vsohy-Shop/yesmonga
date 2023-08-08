package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.core.view.C18196h2;
import com.urbanairship.iam.C9259x;
import java.util.Map;

/* renamed from: androidx.transition.e */
public class C20560e extends C20606h0 {

    /* renamed from: n1 */
    public static final String f53003n1 = "android:changeBounds:bounds";

    /* renamed from: o1 */
    public static final String f53004o1 = "android:changeBounds:clip";

    /* renamed from: p1 */
    public static final String f53005p1 = "android:changeBounds:parent";

    /* renamed from: q1 */
    public static final String f53006q1 = "android:changeBounds:windowX";

    /* renamed from: r1 */
    public static final String f53007r1 = "android:changeBounds:windowY";

    /* renamed from: s1 */
    public static final String[] f53008s1 = {f53003n1, f53004o1, f53005p1, f53006q1, f53007r1};

    /* renamed from: t1 */
    public static final Property<Drawable, PointF> f53009t1;

    /* renamed from: u1 */
    public static final Property<C20571k, PointF> f53010u1;

    /* renamed from: v1 */
    public static final Property<C20571k, PointF> f53011v1;

    /* renamed from: w1 */
    public static final Property<View, PointF> f53012w1;

    /* renamed from: x1 */
    public static final Property<View, PointF> f53013x1;

    /* renamed from: y1 */
    public static final Property<View, PointF> f53014y1;

    /* renamed from: z1 */
    public static C20553c0 f53015z1 = new C20553c0();

    /* renamed from: k1 */
    public int[] f53016k1 = new int[2];

    /* renamed from: l1 */
    public boolean f53017l1 = false;

    /* renamed from: m1 */
    public boolean f53018m1 = false;

    /* renamed from: androidx.transition.e$a */
    public class C20561a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f53019a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f53020b;

        /* renamed from: c */
        public final /* synthetic */ View f53021c;

        /* renamed from: d */
        public final /* synthetic */ float f53022d;

        public C20561a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f53019a = viewGroup;
            this.f53020b = bitmapDrawable;
            this.f53021c = view;
            this.f53022d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C20554c1.m95685b(this.f53019a).mo61605b(this.f53020b);
            C20554c1.m95691h(this.f53021c, this.f53022d);
        }
    }

    /* renamed from: androidx.transition.e$b */
    public class C20562b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f53024a = new Rect();

        public C20562b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f53024a);
            Rect rect = this.f53024a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f53024a);
            this.f53024a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f53024a);
        }
    }

    /* renamed from: androidx.transition.e$c */
    public class C20563c extends Property<C20571k, PointF> {
        public C20563c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C20571k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C20571k kVar, PointF pointF) {
            kVar.mo61671c(pointF);
        }
    }

    /* renamed from: androidx.transition.e$d */
    public class C20564d extends Property<C20571k, PointF> {
        public C20564d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C20571k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C20571k kVar, PointF pointF) {
            kVar.mo61669a(pointF);
        }
    }

    /* renamed from: androidx.transition.e$e */
    public class C20565e extends Property<View, PointF> {
        public C20565e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C20554c1.m95690g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.e$f */
    public class C20566f extends Property<View, PointF> {
        public C20566f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C20554c1.m95690g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.e$g */
    public class C20567g extends Property<View, PointF> {
        public C20567g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C20554c1.m95690g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.e$h */
    public class C20568h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C20571k f53025a;
        private C20571k mViewBounds;

        public C20568h(C20571k kVar) {
            this.f53025a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.e$i */
    public class C20569i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f53027a;

        /* renamed from: b */
        public final /* synthetic */ View f53028b;

        /* renamed from: c */
        public final /* synthetic */ Rect f53029c;

        /* renamed from: d */
        public final /* synthetic */ int f53030d;

        /* renamed from: e */
        public final /* synthetic */ int f53031e;

        /* renamed from: f */
        public final /* synthetic */ int f53032f;

        /* renamed from: g */
        public final /* synthetic */ int f53033g;

        public C20569i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f53028b = view;
            this.f53029c = rect;
            this.f53030d = i;
            this.f53031e = i2;
            this.f53032f = i3;
            this.f53033g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f53027a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f53027a) {
                C18196h2.m82516M1(this.f53028b, this.f53029c);
                C20554c1.m95690g(this.f53028b, this.f53030d, this.f53031e, this.f53032f, this.f53033g);
            }
        }
    }

    /* renamed from: androidx.transition.e$j */
    public class C20570j extends C20626j0 {

        /* renamed from: a */
        public boolean f53035a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f53036b;

        public C20570j(ViewGroup viewGroup) {
            this.f53036b = viewGroup;
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
            C20685x0.m96149d(this.f53036b, true);
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
            C20685x0.m96149d(this.f53036b, false);
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            if (!this.f53035a) {
                C20685x0.m96149d(this.f53036b, false);
            }
            h0Var.mo61767z0(this);
        }

        /* renamed from: e */
        public void mo61668e(@C0359n0 C20606h0 h0Var) {
            C20685x0.m96149d(this.f53036b, false);
            this.f53035a = true;
        }
    }

    /* renamed from: androidx.transition.e$k */
    public static class C20571k {

        /* renamed from: a */
        public int f53038a;

        /* renamed from: b */
        public int f53039b;

        /* renamed from: c */
        public int f53040c;

        /* renamed from: d */
        public int f53041d;

        /* renamed from: e */
        public View f53042e;

        /* renamed from: f */
        public int f53043f;

        /* renamed from: g */
        public int f53044g;

        public C20571k(View view) {
            this.f53042e = view;
        }

        /* renamed from: a */
        public void mo61669a(PointF pointF) {
            this.f53040c = Math.round(pointF.x);
            this.f53041d = Math.round(pointF.y);
            int i = this.f53044g + 1;
            this.f53044g = i;
            if (this.f53043f == i) {
                mo61670b();
            }
        }

        /* renamed from: b */
        public final void mo61670b() {
            C20554c1.m95690g(this.f53042e, this.f53038a, this.f53039b, this.f53040c, this.f53041d);
            this.f53043f = 0;
            this.f53044g = 0;
        }

        /* renamed from: c */
        public void mo61671c(PointF pointF) {
            this.f53038a = Math.round(pointF.x);
            this.f53039b = Math.round(pointF.y);
            int i = this.f53043f + 1;
            this.f53043f = i;
            if (i == this.f53044g) {
                mo61670b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f53009t1 = new C20562b(cls, "boundsOrigin");
        f53010u1 = new C20563c(cls, "topLeft");
        f53011v1 = new C20564d(cls, "bottomRight");
        f53012w1 = new C20565e(cls, "bottomRight");
        f53013x1 = new C20566f(cls, "topLeft");
        f53014y1 = new C20567g(cls, C9259x.f25239v);
    }

    public C20560e() {
    }

    /* renamed from: V0 */
    public final void mo61630V0(C20657p0 p0Var) {
        View view = p0Var.f53280b;
        if (C18196h2.m82539U0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            p0Var.f53279a.put(f53003n1, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            p0Var.f53279a.put(f53005p1, p0Var.f53280b.getParent());
            if (this.f53018m1) {
                p0Var.f53280b.getLocationInWindow(this.f53016k1);
                p0Var.f53279a.put(f53006q1, Integer.valueOf(this.f53016k1[0]));
                p0Var.f53279a.put(f53007r1, Integer.valueOf(this.f53016k1[1]));
            }
            if (this.f53017l1) {
                p0Var.f53279a.put(f53004o1, C18196h2.m82523P(view));
            }
        }
    }

    /* renamed from: W0 */
    public boolean mo61631W0() {
        return this.f53017l1;
    }

    /* renamed from: X0 */
    public final boolean mo61632X0(View view, View view2) {
        if (!this.f53018m1) {
            return true;
        }
        C20657p0 U = mo61732U(view, true);
        if (U == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == U.f53280b) {
            return true;
        }
        return false;
    }

    /* renamed from: Y0 */
    public void mo61633Y0(boolean z) {
        this.f53017l1 = z;
    }

    @C0359n0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53008s1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61630V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61630V0(p0Var);
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator2;
        C20657p0 p0Var3 = p0Var;
        C20657p0 p0Var4 = p0Var2;
        if (p0Var3 == null || p0Var4 == null) {
            return null;
        }
        Map<String, Object> map = p0Var3.f53279a;
        Map<String, Object> map2 = p0Var4.f53279a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f53005p1);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f53005p1);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = p0Var4.f53280b;
        if (mo61632X0(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) p0Var3.f53279a.get(f53003n1);
            Rect rect4 = (Rect) p0Var4.f53279a.get(f53003n1);
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i10 = rect4.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect5 = (Rect) p0Var3.f53279a.get(f53004o1);
            Rect rect6 = (Rect) p0Var4.f53279a.get(f53004o1);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect7 = rect6;
            Rect rect8 = rect5;
            if (!this.f53017l1) {
                view = view3;
                C20554c1.m95690g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C20682w.m96143a(view, f53014y1, mo61735Y().mo61606a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C20571k kVar = new C20571k(view);
                        ObjectAnimator a = C20682w.m96143a(kVar, f53010u1, mo61735Y().mo61606a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C20682w.m96143a(kVar, f53011v1, mo61735Y().mo61606a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C20568h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C20682w.m96143a(view, f53012w1, mo61735Y().mo61606a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C20682w.m96143a(view, f53013x1, mo61735Y().mo61606a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C20554c1.m95690g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C20682w.m96143a(view, f53014y1, mo61735Y().mo61606a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect8 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect8;
                }
                if (rect7 == null) {
                    rect2 = new Rect(i2, i2, i13, i14);
                } else {
                    rect2 = rect7;
                }
                if (!rect.equals(rect2)) {
                    C18196h2.m82516M1(view, rect);
                    C20553c0 c0Var = f53015z1;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect2;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c0Var, objArr);
                    ofObject.addListener(new C20569i(view, rect7, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C20653o0.m96057c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C20685x0.m96149d(viewGroup4, true);
                mo61737b(new C20570j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) p0Var3.f53279a.get(f53006q1)).intValue();
        int intValue2 = ((Integer) p0Var3.f53279a.get(f53007r1)).intValue();
        int intValue3 = ((Integer) p0Var4.f53279a.get(f53006q1)).intValue();
        int intValue4 = ((Integer) p0Var4.f53279a.get(f53007r1)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f53016k1);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C20554c1.m95686c(view2);
        C20554c1.m95691h(view2, 0.0f);
        C20554c1.m95685b(viewGroup).mo61604a(bitmapDrawable);
        C20684x Y = mo61735Y();
        int[] iArr = this.f53016k1;
        int i15 = iArr[0];
        int i16 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C20535a0.m95669a(f53009t1, Y.mo61606a((float) (intValue - i15), (float) (intValue2 - i16), (float) (intValue3 - i15), (float) (intValue4 - i16)))});
        ofPropertyValuesHolder.addListener(new C20561a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    @SuppressLint({"RestrictedApi"})
    public C20560e(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53073d);
        boolean e = C17483q.m80229e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo61633Y0(e);
    }
}
