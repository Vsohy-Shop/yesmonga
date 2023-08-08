package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C17760a;
import androidx.core.view.C18196h2;

/* renamed from: com.google.android.material.appbar.a */
public abstract class C31125a<V extends View> extends C31128c<V> {

    /* renamed from: k */
    public static final int f74570k = -1;
    @C0363p0

    /* renamed from: d */
    public Runnable f74571d;

    /* renamed from: e */
    public OverScroller f74572e;

    /* renamed from: f */
    public boolean f74573f;

    /* renamed from: g */
    public int f74574g = -1;

    /* renamed from: h */
    public int f74575h;

    /* renamed from: i */
    public int f74576i = -1;
    @C0363p0

    /* renamed from: j */
    public VelocityTracker f74577j;

    /* renamed from: com.google.android.material.appbar.a$a */
    public class C31126a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f74578a;

        /* renamed from: b */
        public final V f74579b;

        public C31126a(CoordinatorLayout coordinatorLayout, V v) {
            this.f74578a = coordinatorLayout;
            this.f74579b = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f74579b != null && (overScroller = C31125a.this.f74572e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C31125a aVar = C31125a.this;
                    aVar.mo88135X(this.f74578a, this.f74579b, aVar.f74572e.getCurrY());
                    C18196h2.m82618p1(this.f74579b, this);
                    return;
                }
                C31125a.this.mo87957V(this.f74578a, this.f74579b);
            }
        }
    }

    public C31125a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51077E(@androidx.annotation.C0359n0 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.C0359n0 V r13, @androidx.annotation.C0359n0 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f74574g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f74575h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f74574g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f74575h
            int r7 = r1 - r0
            r11.f74575h = r0
            int r8 = r11.mo87954S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo88134W(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f74577j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f74577j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f74577j
            int r4 = r11.f74574g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo87955T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo88133R(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f74573f = r3
            r11.f74574g = r1
            android.view.VelocityTracker r13 = r11.f74577j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f74577j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f74577j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f74573f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C31125a.mo51077E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public boolean mo87953P(V v) {
        return false;
    }

    /* renamed from: Q */
    public final void mo88132Q() {
        if (this.f74577j == null) {
            this.f74577j = VelocityTracker.obtain();
        }
    }

    /* renamed from: R */
    public final boolean mo88133R(CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f74571d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f74571d = null;
        }
        if (this.f74572e == null) {
            this.f74572e = new OverScroller(v.getContext());
        }
        this.f74572e.fling(0, mo87991H(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f74572e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C31126a aVar = new C31126a(coordinatorLayout, v);
            this.f74571d = aVar;
            C18196h2.m82618p1(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo87957V(coordinatorLayout, v);
        return false;
    }

    /* renamed from: S */
    public int mo87954S(@C0359n0 V v) {
        return -v.getHeight();
    }

    /* renamed from: T */
    public int mo87955T(@C0359n0 V v) {
        return v.getHeight();
    }

    /* renamed from: U */
    public int mo87956U() {
        return mo87991H();
    }

    /* renamed from: V */
    public void mo87957V(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: W */
    public final int mo88134W(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo87958Y(coordinatorLayout, v, mo87956U() - i, i2, i3);
    }

    /* renamed from: X */
    public int mo88135X(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo87958Y(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Y */
    public int mo87958Y(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int e;
        int H = mo87991H();
        if (i2 == 0 || H < i2 || H > i3 || H == (e = C17760a.m81102e(i, i2, i3))) {
            return 0;
        }
        mo87996N(e);
        return H - e;
    }

    /* renamed from: l */
    public boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f74576i < 0) {
            this.f74576i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f74573f) {
            int i = this.f74574g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f74575h) > this.f74576i) {
                this.f74575h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f74574g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo87953P(v) || !coordinatorLayout.mo51005G(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f74573f = z;
            if (z) {
                this.f74575h = y2;
                this.f74574g = motionEvent.getPointerId(0);
                mo88132Q();
                OverScroller overScroller = this.f74572e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f74572e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f74577j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public C31125a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
