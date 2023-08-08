package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.core.view.C18196h2;
import java.util.Arrays;

/* renamed from: androidx.customview.widget.d */
public class C18553d {

    /* renamed from: A */
    public static final int f47340A = 1;

    /* renamed from: B */
    public static final int f47341B = 2;

    /* renamed from: C */
    public static final int f47342C = 1;

    /* renamed from: D */
    public static final int f47343D = 2;

    /* renamed from: E */
    public static final int f47344E = 4;

    /* renamed from: F */
    public static final int f47345F = 8;

    /* renamed from: G */
    public static final int f47346G = 15;

    /* renamed from: H */
    public static final int f47347H = 1;

    /* renamed from: I */
    public static final int f47348I = 2;

    /* renamed from: J */
    public static final int f47349J = 3;

    /* renamed from: K */
    public static final int f47350K = 20;

    /* renamed from: L */
    public static final int f47351L = 256;

    /* renamed from: M */
    public static final int f47352M = 600;

    /* renamed from: N */
    public static final Interpolator f47353N = new C18554a();

    /* renamed from: x */
    public static final String f47354x = "ViewDragHelper";

    /* renamed from: y */
    public static final int f47355y = -1;

    /* renamed from: z */
    public static final int f47356z = 0;

    /* renamed from: a */
    public int f47357a;

    /* renamed from: b */
    public int f47358b;

    /* renamed from: c */
    public int f47359c = -1;

    /* renamed from: d */
    public float[] f47360d;

    /* renamed from: e */
    public float[] f47361e;

    /* renamed from: f */
    public float[] f47362f;

    /* renamed from: g */
    public float[] f47363g;

    /* renamed from: h */
    public int[] f47364h;

    /* renamed from: i */
    public int[] f47365i;

    /* renamed from: j */
    public int[] f47366j;

    /* renamed from: k */
    public int f47367k;

    /* renamed from: l */
    public VelocityTracker f47368l;

    /* renamed from: m */
    public float f47369m;

    /* renamed from: n */
    public float f47370n;

    /* renamed from: o */
    public int f47371o;

    /* renamed from: p */
    public final int f47372p;

    /* renamed from: q */
    public int f47373q;

    /* renamed from: r */
    public OverScroller f47374r;

    /* renamed from: s */
    public final C18556c f47375s;

    /* renamed from: t */
    public View f47376t;

    /* renamed from: u */
    public boolean f47377u;

    /* renamed from: v */
    public final ViewGroup f47378v;

    /* renamed from: w */
    public final Runnable f47379w = new C18555b();

    /* renamed from: androidx.customview.widget.d$a */
    public class C18554a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.d$b */
    public class C18555b implements Runnable {
        public C18555b() {
        }

        public void run() {
            C18553d.this.mo53491R(0);
        }
    }

    /* renamed from: androidx.customview.widget.d$c */
    public static abstract class C18556c {
        /* renamed from: a */
        public int mo18293a(@C0359n0 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo18294b(@C0359n0 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public int mo53525c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo53526d(@C0359n0 View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo53527e(@C0359n0 View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo53528f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo53529g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo53530h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo18295i(@C0359n0 View view, int i) {
        }

        /* renamed from: j */
        public void mo18296j(int i) {
        }

        /* renamed from: k */
        public void mo18297k(@C0359n0 View view, int i, int i2, @C0372t0 int i3, @C0372t0 int i4) {
        }

        /* renamed from: l */
        public void mo18298l(@C0359n0 View view, float f, float f2) {
        }

        /* renamed from: m */
        public abstract boolean mo18299m(@C0359n0 View view, int i);
    }

    public C18553d(@C0359n0 Context context, @C0359n0 ViewGroup viewGroup, @C0359n0 C18556c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f47378v = viewGroup;
            this.f47375s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f47372p = i;
            this.f47371o = i;
            this.f47358b = viewConfiguration.getScaledTouchSlop();
            this.f47369m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f47370n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f47374r = new OverScroller(context, f47353N);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: p */
    public static C18553d m83925p(@C0359n0 ViewGroup viewGroup, float f, @C0359n0 C18556c cVar) {
        C18553d q = m83926q(viewGroup, cVar);
        q.f47358b = (int) (((float) q.f47358b) * (1.0f / f));
        return q;
    }

    /* renamed from: q */
    public static C18553d m83926q(@C0359n0 ViewGroup viewGroup, @C0359n0 C18556c cVar) {
        return new C18553d(viewGroup.getContext(), viewGroup, cVar);
    }

    @C0372t0
    /* renamed from: A */
    public int mo53474A() {
        return this.f47372p;
    }

    @C0372t0
    /* renamed from: B */
    public int mo53475B() {
        return this.f47371o;
    }

    /* renamed from: C */
    public final int mo53476C(int i, int i2) {
        int i3;
        if (i < this.f47378v.getLeft() + this.f47371o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f47378v.getTop() + this.f47371o) {
            i3 |= 4;
        }
        if (i > this.f47378v.getRight() - this.f47371o) {
            i3 |= 2;
        }
        if (i2 > this.f47378v.getBottom() - this.f47371o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: D */
    public float mo53477D() {
        return this.f47370n;
    }

    @C0372t0
    /* renamed from: E */
    public int mo53478E() {
        return this.f47358b;
    }

    /* renamed from: F */
    public int mo53479F() {
        return this.f47357a;
    }

    /* renamed from: G */
    public boolean mo53480G(int i, int i2) {
        return mo53485L(this.f47376t, i, i2);
    }

    /* renamed from: H */
    public boolean mo53481H(int i) {
        int length = this.f47364h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo53482I(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo53482I(int i, int i2) {
        return mo53483J(i2) && (i & this.f47364h[i2]) != 0;
    }

    /* renamed from: J */
    public boolean mo53483J(int i) {
        return ((1 << i) & this.f47367k) != 0;
    }

    /* renamed from: K */
    public final boolean mo53484K(int i) {
        if (mo53483J(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: L */
    public boolean mo53485L(@C0363p0 View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public void mo53486M(@C0359n0 MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo53501c();
        }
        if (this.f47368l == null) {
            this.f47368l = VelocityTracker.obtain();
        }
        this.f47368l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View v = mo53518v((int) x, (int) y);
            mo53489P(x, y, pointerId);
            mo53498Y(v, pointerId);
            int i3 = this.f47364h[pointerId];
            int i4 = this.f47373q;
            if ((i3 & i4) != 0) {
                this.f47375s.mo53530h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f47357a == 1) {
                mo53487N();
            }
            mo53501c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f47357a == 1) {
                    mo53514r(0.0f, 0.0f);
                }
                mo53501c();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                mo53489P(x2, y2, pointerId2);
                if (this.f47357a == 0) {
                    mo53498Y(mo53518v((int) x2, (int) y2), pointerId2);
                    int i5 = this.f47364h[pointerId2];
                    int i6 = this.f47373q;
                    if ((i5 & i6) != 0) {
                        this.f47375s.mo53530h(i5 & i6, pointerId2);
                    }
                } else if (mo53480G((int) x2, (int) y2)) {
                    mo53498Y(this.f47376t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f47357a == 1 && pointerId3 == this.f47359c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f47359c) {
                            View v2 = mo53518v((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f47376t;
                            if (v2 == view && mo53498Y(view, pointerId4)) {
                                i = this.f47359c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        mo53487N();
                    }
                }
                mo53510l(pointerId3);
            }
        } else if (this.f47357a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (mo53484K(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f47360d[pointerId5];
                    float f2 = y3 - this.f47361e[pointerId5];
                    mo53488O(f, f2, pointerId5);
                    if (this.f47357a != 1) {
                        View v3 = mo53518v((int) x3, (int) y3);
                        if (mo53506h(v3, f, f2) && mo53498Y(v3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            mo53490Q(motionEvent);
        } else if (mo53484K(this.f47359c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f47359c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f47362f;
            int i7 = this.f47359c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f47363g[i7]);
            mo53516t(this.f47376t.getLeft() + i8, this.f47376t.getTop() + i9, i8, i9);
            mo53490Q(motionEvent);
        }
    }

    /* renamed from: N */
    public final void mo53487N() {
        this.f47368l.computeCurrentVelocity(1000, this.f47369m);
        mo53514r(mo53507i(this.f47368l.getXVelocity(this.f47359c), this.f47370n, this.f47369m), mo53507i(this.f47368l.getYVelocity(this.f47359c), this.f47370n, this.f47369m));
    }

    /* renamed from: O */
    public final void mo53488O(float f, float f2, int i) {
        boolean e = mo53503e(f, f2, i, 1);
        if (mo53503e(f2, f, i, 4)) {
            e |= true;
        }
        if (mo53503e(f, f2, i, 2)) {
            e |= true;
        }
        if (mo53503e(f2, f, i, 8)) {
            e |= true;
        }
        if (e) {
            int[] iArr = this.f47365i;
            iArr[i] = iArr[i] | e;
            this.f47375s.mo53528f(e ? 1 : 0, i);
        }
    }

    /* renamed from: P */
    public final void mo53489P(float f, float f2, int i) {
        mo53517u(i);
        float[] fArr = this.f47360d;
        this.f47362f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f47361e;
        this.f47363g[i] = f2;
        fArr2[i] = f2;
        this.f47364h[i] = mo53476C((int) f, (int) f2);
        this.f47367k |= 1 << i;
    }

    /* renamed from: Q */
    public final void mo53490Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo53484K(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f47362f[pointerId] = x;
                this.f47363g[pointerId] = y;
            }
        }
    }

    /* renamed from: R */
    public void mo53491R(int i) {
        this.f47378v.removeCallbacks(this.f47379w);
        if (this.f47357a != i) {
            this.f47357a = i;
            this.f47375s.mo18296j(i);
            if (this.f47357a == 0) {
                this.f47376t = null;
            }
        }
    }

    /* renamed from: S */
    public void mo53492S(@C0372t0 @C0337f0(from = 0) int i) {
        this.f47371o = i;
    }

    /* renamed from: T */
    public void mo53493T(int i) {
        this.f47373q = i;
    }

    /* renamed from: U */
    public void mo53494U(float f) {
        this.f47370n = f;
    }

    /* renamed from: V */
    public boolean mo53495V(int i, int i2) {
        if (this.f47377u) {
            return mo53520x(i, i2, (int) this.f47368l.getXVelocity(this.f47359c), (int) this.f47368l.getYVelocity(this.f47359c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo53496W(@androidx.annotation.C0359n0 android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo53501c()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f47368l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f47368l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f47368l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.mo53510l(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo53489P(r7, r1, r2)
            int r3 = r0.f47357a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f47364h
            r1 = r1[r2]
            int r3 = r0.f47373q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            androidx.customview.widget.d$c r4 = r0.f47375s
            r1 = r1 & r3
            r4.mo53530h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo53518v(r3, r1)
            android.view.View r3 = r0.f47376t
            if (r1 != r3) goto L_0x0031
            r0.mo53498Y(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f47360d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f47361e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo53484K(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f47360d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f47361e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo53518v(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.mo53506h(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.widget.d$c r14 = r0.f47375s
            int r12 = r14.mo18293a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.widget.d$c r5 = r0.f47375s
            int r5 = r5.mo18294b(r7, r15, r14)
            androidx.customview.widget.d$c r14 = r0.f47375s
            int r14 = r14.mo53526d(r7)
            androidx.customview.widget.d$c r15 = r0.f47375s
            int r15 = r15.mo53527e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.mo53488O(r9, r10, r4)
            int r5 = r0.f47357a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo53498Y(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.mo53490Q(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo53501c()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.mo53489P(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo53518v(r2, r3)
            android.view.View r3 = r0.f47376t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f47357a
            if (r3 != r4) goto L_0x0125
            r0.mo53498Y(r2, r1)
        L_0x0125:
            int[] r2 = r0.f47364h
            r2 = r2[r1]
            int r3 = r0.f47373q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            androidx.customview.widget.d$c r4 = r0.f47375s
            r2 = r2 & r3
            r4.mo53530h(r2, r1)
        L_0x0135:
            int r1 = r0.f47357a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C18553d.mo53496W(android.view.MotionEvent):boolean");
    }

    /* renamed from: X */
    public boolean mo53497X(@C0359n0 View view, int i, int i2) {
        this.f47376t = view;
        this.f47359c = -1;
        boolean x = mo53520x(i, i2, 0, 0);
        if (!x && this.f47357a == 0 && this.f47376t != null) {
            this.f47376t = null;
        }
        return x;
    }

    /* renamed from: Y */
    public boolean mo53498Y(View view, int i) {
        if (view == this.f47376t && this.f47359c == i) {
            return true;
        }
        if (view == null || !this.f47375s.mo18299m(view, i)) {
            return false;
        }
        this.f47359c = i;
        mo53502d(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo53499a() {
        mo53501c();
        if (this.f47357a == 2) {
            int currX = this.f47374r.getCurrX();
            int currY = this.f47374r.getCurrY();
            this.f47374r.abortAnimation();
            int currX2 = this.f47374r.getCurrX();
            int currY2 = this.f47374r.getCurrY();
            this.f47375s.mo18297k(this.f47376t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo53491R(0);
    }

    /* renamed from: b */
    public boolean mo53500b(@C0359n0 View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (mo53500b(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || (!view.canScrollHorizontally(-i) && !view.canScrollVertically(-i2))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo53501c() {
        this.f47359c = -1;
        mo53509k();
        VelocityTracker velocityTracker = this.f47368l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47368l = null;
        }
    }

    /* renamed from: d */
    public void mo53502d(@C0359n0 View view, int i) {
        if (view.getParent() == this.f47378v) {
            this.f47376t = view;
            this.f47359c = i;
            this.f47375s.mo18295i(view, i);
            mo53491R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f47378v + ")");
    }

    /* renamed from: e */
    public final boolean mo53503e(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f47364h[i] & i2) != i2 || (this.f47373q & i2) == 0 || (this.f47366j[i] & i2) == i2 || (this.f47365i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f47358b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f47375s.mo53529g(i2)) {
            int[] iArr = this.f47366j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f47365i[i] & i2) != 0 || abs <= ((float) this.f47358b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo53504f(int i) {
        int length = this.f47360d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo53505g(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo53505g(int i, int i2) {
        boolean z;
        boolean z2;
        if (!mo53483J(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f47362f[i2] - this.f47360d[i2];
        float f2 = this.f47363g[i2] - this.f47361e[i2];
        if (z && z2) {
            int i3 = this.f47358b;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f47358b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f47358b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public final boolean mo53506h(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f47375s.mo53526d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f47375s.mo53527e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f47358b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f47358b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f47358b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: i */
    public final float mo53507i(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: j */
    public final int mo53508j(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: k */
    public final void mo53509k() {
        float[] fArr = this.f47360d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f47361e, 0.0f);
            Arrays.fill(this.f47362f, 0.0f);
            Arrays.fill(this.f47363g, 0.0f);
            Arrays.fill(this.f47364h, 0);
            Arrays.fill(this.f47365i, 0);
            Arrays.fill(this.f47366j, 0);
            this.f47367k = 0;
        }
    }

    /* renamed from: l */
    public final void mo53510l(int i) {
        if (this.f47360d != null && mo53483J(i)) {
            this.f47360d[i] = 0.0f;
            this.f47361e[i] = 0.0f;
            this.f47362f[i] = 0.0f;
            this.f47363g[i] = 0.0f;
            this.f47364h[i] = 0;
            this.f47365i[i] = 0;
            this.f47366j[i] = 0;
            this.f47367k = (~(1 << i)) & this.f47367k;
        }
    }

    /* renamed from: m */
    public final int mo53511m(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f47378v.getWidth();
        float f = (float) (width / 2);
        float s = f + (mo53515s(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(s / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: n */
    public final int mo53512n(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int j = mo53508j(i3, (int) this.f47370n, (int) this.f47369m);
        int j2 = mo53508j(i4, (int) this.f47370n, (int) this.f47369m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(j);
        int abs4 = Math.abs(j2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (j != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (j2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) mo53511m(i, j, this.f47375s.mo53526d(view))) * f5) + (((float) mo53511m(i2, j2, this.f47375s.mo53527e(view))) * f6));
    }

    /* renamed from: o */
    public boolean mo53513o(boolean z) {
        if (this.f47357a == 2) {
            boolean computeScrollOffset = this.f47374r.computeScrollOffset();
            int currX = this.f47374r.getCurrX();
            int currY = this.f47374r.getCurrY();
            int left = currX - this.f47376t.getLeft();
            int top = currY - this.f47376t.getTop();
            if (left != 0) {
                C18196h2.m82574e1(this.f47376t, left);
            }
            if (top != 0) {
                C18196h2.m82578f1(this.f47376t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f47375s.mo18297k(this.f47376t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f47374r.getFinalX() && currY == this.f47374r.getFinalY()) {
                this.f47374r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f47378v.post(this.f47379w);
                } else {
                    mo53491R(0);
                }
            }
        }
        if (this.f47357a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void mo53514r(float f, float f2) {
        this.f47377u = true;
        this.f47375s.mo18298l(this.f47376t, f, f2);
        this.f47377u = false;
        if (this.f47357a == 1) {
            mo53491R(0);
        }
    }

    /* renamed from: s */
    public final float mo53515s(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: t */
    public final void mo53516t(int i, int i2, int i3, int i4) {
        int left = this.f47376t.getLeft();
        int top = this.f47376t.getTop();
        if (i3 != 0) {
            i = this.f47375s.mo18293a(this.f47376t, i, i3);
            C18196h2.m82574e1(this.f47376t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f47375s.mo18294b(this.f47376t, i2, i4);
            C18196h2.m82578f1(this.f47376t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f47375s.mo18297k(this.f47376t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: u */
    public final void mo53517u(int i) {
        float[] fArr = this.f47360d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f47361e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f47362f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f47363g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f47364h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f47365i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f47366j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f47360d = fArr2;
            this.f47361e = fArr3;
            this.f47362f = fArr4;
            this.f47363g = fArr5;
            this.f47364h = iArr;
            this.f47365i = iArr2;
            this.f47366j = iArr3;
        }
    }

    @C0363p0
    /* renamed from: v */
    public View mo53518v(int i, int i2) {
        for (int childCount = this.f47378v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f47378v.getChildAt(this.f47375s.mo53525c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public void mo53519w(int i, int i2, int i3, int i4) {
        if (this.f47377u) {
            this.f47374r.fling(this.f47376t.getLeft(), this.f47376t.getTop(), (int) this.f47368l.getXVelocity(this.f47359c), (int) this.f47368l.getYVelocity(this.f47359c), i, i3, i2, i4);
            mo53491R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    /* renamed from: x */
    public final boolean mo53520x(int i, int i2, int i3, int i4) {
        int left = this.f47376t.getLeft();
        int top = this.f47376t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f47374r.abortAnimation();
            mo53491R(0);
            return false;
        }
        this.f47374r.startScroll(left, top, i5, i6, mo53512n(this.f47376t, i5, i6, i3, i4));
        mo53491R(2);
        return true;
    }

    /* renamed from: y */
    public int mo53521y() {
        return this.f47359c;
    }

    @C0363p0
    /* renamed from: z */
    public View mo53522z() {
        return this.f47376t;
    }
}
