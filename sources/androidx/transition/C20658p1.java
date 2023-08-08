package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.transition.C20533a;
import androidx.transition.C20538b0;
import androidx.transition.C20606h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.transition.p1 */
public abstract class C20658p1 extends C20606h0 {

    /* renamed from: l1 */
    public static final String f53282l1 = "android:visibility:visibility";

    /* renamed from: m1 */
    public static final String f53283m1 = "android:visibility:parent";

    /* renamed from: n1 */
    public static final String f53284n1 = "android:visibility:screenLocation";

    /* renamed from: o1 */
    public static final int f53285o1 = 1;

    /* renamed from: p1 */
    public static final int f53286p1 = 2;

    /* renamed from: q1 */
    public static final String[] f53287q1 = {f53282l1, f53283m1};

    /* renamed from: k1 */
    public int f53288k1 = 3;

    /* renamed from: androidx.transition.p1$a */
    public class C20659a extends C20626j0 {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f53289a;

        /* renamed from: b */
        public final /* synthetic */ View f53290b;

        /* renamed from: c */
        public final /* synthetic */ View f53291c;

        public C20659a(ViewGroup viewGroup, View view, View view2) {
            this.f53289a = viewGroup;
            this.f53290b = view;
            this.f53291c = view2;
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
            if (this.f53290b.getParent() == null) {
                C20685x0.m96147b(this.f53289a).mo61892c(this.f53290b);
            } else {
                C20658p1.this.cancel();
            }
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
            C20685x0.m96147b(this.f53289a).mo61893d(this.f53290b);
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            this.f53291c.setTag(C20538b0.C20545g.save_overlay_view, (Object) null);
            C20685x0.m96147b(this.f53289a).mo61893d(this.f53290b);
            h0Var.mo61767z0(this);
        }
    }

    /* renamed from: androidx.transition.p1$b */
    public static class C20660b extends AnimatorListenerAdapter implements C20606h0.C20614h, C20533a.C20534a {

        /* renamed from: a */
        public final View f53293a;

        /* renamed from: b */
        public final int f53294b;

        /* renamed from: c */
        public final ViewGroup f53295c;

        /* renamed from: d */
        public final boolean f53296d;

        /* renamed from: e */
        public boolean f53297e;

        /* renamed from: f */
        public boolean f53298f = false;

        public C20660b(View view, int i, boolean z) {
            this.f53293a = view;
            this.f53294b = i;
            this.f53295c = (ViewGroup) view.getParent();
            this.f53296d = z;
            mo61873g(true);
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
            mo61873g(true);
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
            mo61873g(false);
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            mo61872f();
            h0Var.mo61767z0(this);
        }

        /* renamed from: e */
        public void mo61668e(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: f */
        public final void mo61872f() {
            if (!this.f53298f) {
                C20554c1.m95692i(this.f53293a, this.f53294b);
                ViewGroup viewGroup = this.f53295c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo61873g(false);
        }

        /* renamed from: g */
        public final void mo61873g(boolean z) {
            ViewGroup viewGroup;
            if (this.f53296d && this.f53297e != z && (viewGroup = this.f53295c) != null) {
                this.f53297e = z;
                C20685x0.m96149d(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f53298f = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo61872f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f53298f) {
                C20554c1.m95692i(this.f53293a, this.f53294b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f53298f) {
                C20554c1.m95692i(this.f53293a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.p1$c */
    public @interface C20661c {
    }

    /* renamed from: androidx.transition.p1$d */
    public static class C20662d {

        /* renamed from: a */
        public boolean f53299a;

        /* renamed from: b */
        public boolean f53300b;

        /* renamed from: c */
        public int f53301c;

        /* renamed from: d */
        public int f53302d;

        /* renamed from: e */
        public ViewGroup f53303e;

        /* renamed from: f */
        public ViewGroup f53304f;
    }

    public C20658p1() {
    }

    /* renamed from: V0 */
    public final void mo61865V0(C20657p0 p0Var) {
        p0Var.f53279a.put(f53282l1, Integer.valueOf(p0Var.f53280b.getVisibility()));
        p0Var.f53279a.put(f53283m1, p0Var.f53280b.getParent());
        int[] iArr = new int[2];
        p0Var.f53280b.getLocationOnScreen(iArr);
        p0Var.f53279a.put(f53284n1, iArr);
    }

    /* renamed from: W0 */
    public int mo61866W0() {
        return this.f53288k1;
    }

    /* renamed from: X0 */
    public final C20662d mo61867X0(C20657p0 p0Var, C20657p0 p0Var2) {
        C20662d dVar = new C20662d();
        dVar.f53299a = false;
        dVar.f53300b = false;
        if (p0Var == null || !p0Var.f53279a.containsKey(f53282l1)) {
            dVar.f53301c = -1;
            dVar.f53303e = null;
        } else {
            dVar.f53301c = ((Integer) p0Var.f53279a.get(f53282l1)).intValue();
            dVar.f53303e = (ViewGroup) p0Var.f53279a.get(f53283m1);
        }
        if (p0Var2 == null || !p0Var2.f53279a.containsKey(f53282l1)) {
            dVar.f53302d = -1;
            dVar.f53304f = null;
        } else {
            dVar.f53302d = ((Integer) p0Var2.f53279a.get(f53282l1)).intValue();
            dVar.f53304f = (ViewGroup) p0Var2.f53279a.get(f53283m1);
        }
        if (p0Var != null && p0Var2 != null) {
            int i = dVar.f53301c;
            int i2 = dVar.f53302d;
            if (i == i2 && dVar.f53303e == dVar.f53304f) {
                return dVar;
            }
            if (i != i2) {
                if (i == 0) {
                    dVar.f53300b = false;
                    dVar.f53299a = true;
                } else if (i2 == 0) {
                    dVar.f53300b = true;
                    dVar.f53299a = true;
                }
            } else if (dVar.f53304f == null) {
                dVar.f53300b = false;
                dVar.f53299a = true;
            } else if (dVar.f53303e == null) {
                dVar.f53300b = true;
                dVar.f53299a = true;
            }
        } else if (p0Var == null && dVar.f53302d == 0) {
            dVar.f53300b = true;
            dVar.f53299a = true;
        } else if (p0Var2 == null && dVar.f53301c == 0) {
            dVar.f53300b = false;
            dVar.f53299a = true;
        }
        return dVar;
    }

    /* renamed from: Y0 */
    public boolean mo61868Y0(C20657p0 p0Var) {
        if (p0Var == null) {
            return false;
        }
        int intValue = ((Integer) p0Var.f53279a.get(f53282l1)).intValue();
        View view = (View) p0Var.f53279a.get(f53283m1);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: Z0 */
    public Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return null;
    }

    @C0363p0
    /* renamed from: a1 */
    public Animator mo61869a1(ViewGroup viewGroup, C20657p0 p0Var, int i, C20657p0 p0Var2, int i2) {
        if ((this.f53288k1 & 1) != 1 || p0Var2 == null) {
            return null;
        }
        if (p0Var == null) {
            View view = (View) p0Var2.f53280b.getParent();
            if (mo61867X0(mo61732U(view, false), mo61750j0(view, false)).f53299a) {
                return null;
            }
        }
        return mo61679Z0(viewGroup, p0Var2.f53280b, p0Var, p0Var2);
    }

    @C0363p0
    /* renamed from: b1 */
    public Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f53129K0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    @androidx.annotation.C0363p0
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo61870c1(android.view.ViewGroup r18, androidx.transition.C20657p0 r19, int r20, androidx.transition.C20657p0 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f53288k1
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f53280b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f53280b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = androidx.transition.C20538b0.C20545g.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = r11
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = r12
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            androidx.transition.p0 r14 = r0.mo61750j0(r13, r12)
            androidx.transition.p0 r15 = r0.mo61732U(r13, r12)
            androidx.transition.p1$d r14 = r0.mo61867X0(r14, r15)
            boolean r14 = r14.f53299a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.C20653o0.m96055a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f53129K0
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = r11
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f53279a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            androidx.transition.u0 r4 = androidx.transition.C20685x0.m96147b(r18)
            r4.mo61892c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo61680b1(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            androidx.transition.u0 r1 = androidx.transition.C20685x0.m96147b(r18)
            r1.mo61893d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.p1$a r3 = new androidx.transition.p1$a
            r3.<init>(r1, r10, r5)
            r0.mo61737b(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            androidx.transition.C20554c1.m95692i(r8, r11)
            android.animation.Animator r1 = r0.mo61680b1(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.p1$b r2 = new androidx.transition.p1$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            androidx.transition.C20533a.m95666a(r1, r2)
            r0.mo61737b(r2)
            goto L_0x0106
        L_0x0103:
            androidx.transition.C20554c1.m95692i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20658p1.mo61870c1(android.view.ViewGroup, androidx.transition.p0, int, androidx.transition.p0, int):android.animation.Animator");
    }

    /* renamed from: d1 */
    public void mo61871d1(int i) {
        if ((i & -4) == 0) {
            this.f53288k1 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @C0363p0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53287q1;
    }

    /* renamed from: k0 */
    public boolean mo61751k0(@C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        if (p0Var == null && p0Var2 == null) {
            return false;
        }
        if (p0Var != null && p0Var2 != null && p0Var2.f53279a.containsKey(f53282l1) != p0Var.f53279a.containsKey(f53282l1)) {
            return false;
        }
        C20662d X0 = mo61867X0(p0Var, p0Var2);
        if (!X0.f53299a) {
            return false;
        }
        if (X0.f53301c == 0 || X0.f53302d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61865V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61865V0(p0Var);
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        C20662d X0 = mo61867X0(p0Var, p0Var2);
        if (!X0.f53299a) {
            return null;
        }
        if (X0.f53303e == null && X0.f53304f == null) {
            return null;
        }
        if (X0.f53300b) {
            return mo61869a1(viewGroup, p0Var, X0.f53301c, p0Var2, X0.f53302d);
        }
        return mo61870c1(viewGroup, p0Var, X0.f53301c, p0Var2, X0.f53302d);
    }

    @SuppressLint({"RestrictedApi"})
    public C20658p1(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53074e);
        int k = C17483q.m80235k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            mo61871d1(k);
        }
    }
}
