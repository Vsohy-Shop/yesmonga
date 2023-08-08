package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0590q;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.p0 */
public abstract class C0760p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f2472a;

    /* renamed from: b */
    public final int f2473b;

    /* renamed from: c */
    public final int f2474c;

    /* renamed from: d */
    public final View f2475d;

    /* renamed from: e */
    public Runnable f2476e;

    /* renamed from: f */
    public Runnable f2477f;

    /* renamed from: g */
    public boolean f2478g;

    /* renamed from: v */
    public int f2479v;

    /* renamed from: w */
    public final int[] f2480w = new int[2];

    /* renamed from: androidx.appcompat.widget.p0$a */
    public class C0761a implements Runnable {
        public C0761a() {
        }

        public void run() {
            ViewParent parent = C0760p0.this.f2475d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    public class C0762b implements Runnable {
        public C0762b() {
        }

        public void run() {
            C0760p0.this.mo3555e();
        }
    }

    public C0760p0(View view) {
        this.f2475d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2472a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2473b = tapTimeout;
        this.f2474c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m3712h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo3554a() {
        Runnable runnable = this.f2477f;
        if (runnable != null) {
            this.f2475d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2476e;
        if (runnable2 != null) {
            this.f2475d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract C0590q mo1854b();

    /* renamed from: c */
    public boolean mo1855c() {
        C0590q b = mo1854b();
        if (b == null || b.mo1967c()) {
            return true;
        }
        b.mo1966a();
        return true;
    }

    /* renamed from: d */
    public boolean mo2462d() {
        C0590q b = mo1854b();
        if (b == null || !b.mo1967c()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void mo3555e() {
        mo3554a();
        View view = this.f2475d;
        if (view.isEnabled() && !view.isLongClickable() && mo1855c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2478g = true;
        }
    }

    /* renamed from: f */
    public final boolean mo3556f(MotionEvent motionEvent) {
        C0733k0 k0Var;
        boolean z;
        View view = this.f2475d;
        C0590q b = mo1854b();
        if (b == null || !b.mo1967c() || (k0Var = (C0733k0) b.mo1975q()) == null || !k0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        mo3558i(view, obtainNoHistory);
        mo3559j(k0Var, obtainNoHistory);
        boolean f = k0Var.mo2871f(obtainNoHistory, this.f2479v);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!f || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3557g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2475d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f2479v
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2472a
            boolean r6 = m3712h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.mo3554a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.mo3554a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f2479v = r6
            java.lang.Runnable r6 = r5.f2476e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.p0$a r6 = new androidx.appcompat.widget.p0$a
            r6.<init>()
            r5.f2476e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f2476e
            int r1 = r5.f2473b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2477f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.p0$b r6 = new androidx.appcompat.widget.p0$b
            r6.<init>()
            r5.f2477f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f2477f
            int r1 = r5.f2474c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0760p0.mo3557g(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final boolean mo3558i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2480w;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean mo3559j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2480w;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2478g;
        if (!z2) {
            if (!mo3557g(motionEvent) || !mo1855c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2475d.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (mo3556f(motionEvent) || !mo2462d()) {
            z = true;
        } else {
            z = false;
        }
        this.f2478g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2478g = false;
        this.f2479v = -1;
        Runnable runnable = this.f2476e;
        if (runnable != null) {
            this.f2475d.removeCallbacks(runnable);
        }
    }
}
