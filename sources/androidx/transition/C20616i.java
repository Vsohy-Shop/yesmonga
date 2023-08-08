package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.core.view.C18196h2;
import androidx.transition.C20538b0;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.i */
public class C20616i extends C20606h0 {

    /* renamed from: n1 */
    public static final String f53163n1 = "android:changeTransform:matrix";

    /* renamed from: o1 */
    public static final String f53164o1 = "android:changeTransform:transforms";

    /* renamed from: p1 */
    public static final String f53165p1 = "android:changeTransform:parent";

    /* renamed from: q1 */
    public static final String f53166q1 = "android:changeTransform:parentMatrix";

    /* renamed from: r1 */
    public static final String f53167r1 = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: s1 */
    public static final String f53168s1 = "android:changeTransform:intermediateMatrix";

    /* renamed from: t1 */
    public static final String[] f53169t1 = {f53163n1, f53164o1, f53166q1};

    /* renamed from: u1 */
    public static final Property<C20621e, float[]> f53170u1 = new C20617a(float[].class, "nonTranslations");

    /* renamed from: v1 */
    public static final Property<C20621e, PointF> f53171v1 = new C20618b(PointF.class, "translations");

    /* renamed from: w1 */
    public static final boolean f53172w1 = true;

    /* renamed from: k1 */
    public boolean f53173k1 = true;

    /* renamed from: l1 */
    public boolean f53174l1 = true;

    /* renamed from: m1 */
    public Matrix f53175m1 = new Matrix();

    /* renamed from: androidx.transition.i$a */
    public class C20617a extends Property<C20621e, float[]> {
        public C20617a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C20621e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C20621e eVar, float[] fArr) {
            eVar.mo61798d(fArr);
        }
    }

    /* renamed from: androidx.transition.i$b */
    public class C20618b extends Property<C20621e, PointF> {
        public C20618b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C20621e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C20621e eVar, PointF pointF) {
            eVar.mo61797c(pointF);
        }
    }

    /* renamed from: androidx.transition.i$c */
    public class C20619c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f53176a;

        /* renamed from: b */
        public Matrix f53177b = new Matrix();

        /* renamed from: c */
        public final /* synthetic */ boolean f53178c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f53179d;

        /* renamed from: e */
        public final /* synthetic */ View f53180e;

        /* renamed from: f */
        public final /* synthetic */ C20622f f53181f;

        /* renamed from: g */
        public final /* synthetic */ C20621e f53182g;

        public C20619c(boolean z, Matrix matrix, View view, C20622f fVar, C20621e eVar) {
            this.f53178c = z;
            this.f53179d = matrix;
            this.f53180e = view;
            this.f53181f = fVar;
            this.f53182g = eVar;
        }

        /* renamed from: a */
        public final void mo61790a(Matrix matrix) {
            this.f53177b.set(matrix);
            this.f53180e.setTag(C20538b0.C20545g.transition_transform, this.f53177b);
            this.f53181f.mo61799a(this.f53180e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f53176a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f53176a) {
                if (!this.f53178c || !C20616i.this.f53173k1) {
                    this.f53180e.setTag(C20538b0.C20545g.transition_transform, (Object) null);
                    this.f53180e.setTag(C20538b0.C20545g.parent_matrix, (Object) null);
                } else {
                    mo61790a(this.f53179d);
                }
            }
            C20554c1.m95689f(this.f53180e, (Matrix) null);
            this.f53181f.mo61799a(this.f53180e);
        }

        public void onAnimationPause(Animator animator) {
            mo61790a(this.f53182g.mo61795a());
        }

        public void onAnimationResume(Animator animator) {
            C20616i.m95875b1(this.f53180e);
        }
    }

    /* renamed from: androidx.transition.i$d */
    public static class C20620d extends C20626j0 {

        /* renamed from: a */
        public View f53184a;

        /* renamed from: b */
        public C20652o f53185b;

        public C20620d(View view, C20652o oVar) {
            this.f53184a = view;
            this.f53185b = oVar;
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
            this.f53185b.setVisibility(0);
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
            this.f53185b.setVisibility(4);
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            h0Var.mo61767z0(this);
            C20671s.m96127b(this.f53184a);
            this.f53184a.setTag(C20538b0.C20545g.transition_transform, (Object) null);
            this.f53184a.setTag(C20538b0.C20545g.parent_matrix, (Object) null);
        }
    }

    /* renamed from: androidx.transition.i$e */
    public static class C20621e {

        /* renamed from: a */
        public final Matrix f53186a = new Matrix();

        /* renamed from: b */
        public final View f53187b;

        /* renamed from: c */
        public final float[] f53188c;

        /* renamed from: d */
        public float f53189d;

        /* renamed from: e */
        public float f53190e;

        public C20621e(View view, float[] fArr) {
            this.f53187b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f53188c = fArr2;
            this.f53189d = fArr2[2];
            this.f53190e = fArr2[5];
            mo61796b();
        }

        /* renamed from: a */
        public Matrix mo61795a() {
            return this.f53186a;
        }

        /* renamed from: b */
        public final void mo61796b() {
            float[] fArr = this.f53188c;
            fArr[2] = this.f53189d;
            fArr[5] = this.f53190e;
            this.f53186a.setValues(fArr);
            C20554c1.m95689f(this.f53187b, this.f53186a);
        }

        /* renamed from: c */
        public void mo61797c(PointF pointF) {
            this.f53189d = pointF.x;
            this.f53190e = pointF.y;
            mo61796b();
        }

        /* renamed from: d */
        public void mo61798d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f53188c, 0, fArr.length);
            mo61796b();
        }
    }

    /* renamed from: androidx.transition.i$f */
    public static class C20622f {

        /* renamed from: a */
        public final float f53191a;

        /* renamed from: b */
        public final float f53192b;

        /* renamed from: c */
        public final float f53193c;

        /* renamed from: d */
        public final float f53194d;

        /* renamed from: e */
        public final float f53195e;

        /* renamed from: f */
        public final float f53196f;

        /* renamed from: g */
        public final float f53197g;

        /* renamed from: h */
        public final float f53198h;

        public C20622f(View view) {
            this.f53191a = view.getTranslationX();
            this.f53192b = view.getTranslationY();
            this.f53193c = C18196h2.m82469A0(view);
            this.f53194d = view.getScaleX();
            this.f53195e = view.getScaleY();
            this.f53196f = view.getRotationX();
            this.f53197g = view.getRotationY();
            this.f53198h = view.getRotation();
        }

        /* renamed from: a */
        public void mo61799a(View view) {
            C20616i.m95876f1(view, this.f53191a, this.f53192b, this.f53193c, this.f53194d, this.f53195e, this.f53196f, this.f53197g, this.f53198h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C20622f)) {
                return false;
            }
            C20622f fVar = (C20622f) obj;
            if (fVar.f53191a == this.f53191a && fVar.f53192b == this.f53192b && fVar.f53193c == this.f53193c && fVar.f53194d == this.f53194d && fVar.f53195e == this.f53195e && fVar.f53196f == this.f53196f && fVar.f53197g == this.f53197g && fVar.f53198h == this.f53198h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f53191a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f53192b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f53193c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f53194d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f53195e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f53196f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f53197g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f53198h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public C20616i() {
    }

    /* renamed from: b1 */
    public static void m95875b1(View view) {
        m95876f1(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: f1 */
    public static void m95876f1(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C18196h2.m82647w2(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: V0 */
    public final void mo61773V0(C20657p0 p0Var) {
        Matrix matrix;
        View view = p0Var.f53280b;
        if (view.getVisibility() != 8) {
            p0Var.f53279a.put(f53165p1, view.getParent());
            p0Var.f53279a.put(f53164o1, new C20622f(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            p0Var.f53279a.put(f53163n1, matrix);
            if (this.f53174l1) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C20554c1.m95693j(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                p0Var.f53279a.put(f53166q1, matrix3);
                p0Var.f53279a.put(f53168s1, view.getTag(C20538b0.C20545g.transition_transform));
                p0Var.f53279a.put(f53167r1, view.getTag(C20538b0.C20545g.parent_matrix));
            }
        }
    }

    /* renamed from: W0 */
    public final void mo61774W0(ViewGroup viewGroup, C20657p0 p0Var, C20657p0 p0Var2) {
        View view = p0Var2.f53280b;
        Matrix matrix = new Matrix((Matrix) p0Var2.f53279a.get(f53166q1));
        C20554c1.m95694k(viewGroup, matrix);
        C20652o a = C20671s.m96126a(view, viewGroup, matrix);
        if (a != null) {
            a.mo61852a((ViewGroup) p0Var.f53279a.get(f53165p1), p0Var.f53280b);
            C20606h0 h0Var = this;
            while (true) {
                C20606h0 h0Var2 = h0Var.f53125G0;
                if (h0Var2 == null) {
                    break;
                }
                h0Var = h0Var2;
            }
            h0Var.mo61737b(new C20620d(view, a));
            if (f53172w1) {
                View view2 = p0Var.f53280b;
                if (view2 != p0Var2.f53280b) {
                    C20554c1.m95691h(view2, 0.0f);
                }
                C20554c1.m95691h(view, 1.0f);
            }
        }
    }

    /* renamed from: X0 */
    public final ObjectAnimator mo61775X0(C20657p0 p0Var, C20657p0 p0Var2, boolean z) {
        Matrix matrix = (Matrix) p0Var.f53279a.get(f53163n1);
        Matrix matrix2 = (Matrix) p0Var2.f53279a.get(f53163n1);
        if (matrix == null) {
            matrix = C20679v.f53342a;
        }
        if (matrix2 == null) {
            matrix2 = C20679v.f53342a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = p0Var2.f53280b;
        m95875b1(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C20621e eVar = new C20621e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f53170u1, new C20638m(new float[9]), new float[][]{fArr, fArr2}), C20535a0.m95669a(f53171v1, mo61735Y().mo61606a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C20619c cVar = new C20619c(z, matrix3, view, (C20622f) p0Var2.f53279a.get(f53164o1), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C20533a.m95666a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* renamed from: Y0 */
    public boolean mo61776Y0() {
        return this.f53174l1;
    }

    /* renamed from: Z0 */
    public boolean mo61777Z0() {
        return this.f53173k1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f53280b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61778a1(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo61753m0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo61753m0(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.p0 r4 = r3.mo61732U(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f53280b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20616i.mo61778a1(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: c1 */
    public final void mo61779c1(C20657p0 p0Var, C20657p0 p0Var2) {
        Matrix matrix = (Matrix) p0Var2.f53279a.get(f53166q1);
        p0Var2.f53280b.setTag(C20538b0.C20545g.parent_matrix, matrix);
        Matrix matrix2 = this.f53175m1;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) p0Var.f53279a.get(f53163n1);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            p0Var.f53279a.put(f53163n1, matrix3);
        }
        matrix3.postConcat((Matrix) p0Var.f53279a.get(f53166q1));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: d1 */
    public void mo61780d1(boolean z) {
        this.f53174l1 = z;
    }

    /* renamed from: e1 */
    public void mo61781e1(boolean z) {
        this.f53173k1 = z;
    }

    @C0359n0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53169t1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61773V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61773V0(p0Var);
        if (!f53172w1) {
            ((ViewGroup) p0Var.f53280b.getParent()).startViewTransition(p0Var.f53280b);
        }
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        boolean z;
        if (p0Var == null || p0Var2 == null || !p0Var.f53279a.containsKey(f53165p1) || !p0Var2.f53279a.containsKey(f53165p1)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) p0Var.f53279a.get(f53165p1);
        ViewGroup viewGroup3 = (ViewGroup) p0Var2.f53279a.get(f53165p1);
        if (!this.f53174l1 || mo61778a1(viewGroup2, viewGroup3)) {
            z = false;
        } else {
            z = true;
        }
        Matrix matrix = (Matrix) p0Var.f53279a.get(f53168s1);
        if (matrix != null) {
            p0Var.f53279a.put(f53163n1, matrix);
        }
        Matrix matrix2 = (Matrix) p0Var.f53279a.get(f53167r1);
        if (matrix2 != null) {
            p0Var.f53279a.put(f53166q1, matrix2);
        }
        if (z) {
            mo61779c1(p0Var, p0Var2);
        }
        ObjectAnimator X0 = mo61775X0(p0Var, p0Var2, z);
        if (z && X0 != null && this.f53173k1) {
            mo61774W0(viewGroup, p0Var, p0Var2);
        } else if (!f53172w1) {
            viewGroup2.endViewTransition(p0Var.f53280b);
        }
        return X0;
    }

    @SuppressLint({"RestrictedApi"})
    public C20616i(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53076g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f53173k1 = C17483q.m80229e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f53174l1 = C17483q.m80229e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
