package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;

@C0344h1
/* renamed from: androidx.recyclerview.widget.l */
public class C20175l extends RecyclerView.C20075n implements RecyclerView.C20084s {

    /* renamed from: D */
    public static final int f51970D = 0;

    /* renamed from: E */
    public static final int f51971E = 1;

    /* renamed from: F */
    public static final int f51972F = 2;

    /* renamed from: G */
    public static final int f51973G = 0;

    /* renamed from: H */
    public static final int f51974H = 1;

    /* renamed from: I */
    public static final int f51975I = 2;

    /* renamed from: J */
    public static final int f51976J = 0;

    /* renamed from: K */
    public static final int f51977K = 1;

    /* renamed from: L */
    public static final int f51978L = 2;

    /* renamed from: M */
    public static final int f51979M = 3;

    /* renamed from: N */
    public static final int f51980N = 500;

    /* renamed from: O */
    public static final int f51981O = 1500;

    /* renamed from: P */
    public static final int f51982P = 1200;

    /* renamed from: Q */
    public static final int f51983Q = 500;

    /* renamed from: R */
    public static final int f51984R = 255;

    /* renamed from: S */
    public static final int[] f51985S = {16842919};

    /* renamed from: T */
    public static final int[] f51986T = new int[0];

    /* renamed from: A */
    public int f51987A;

    /* renamed from: B */
    public final Runnable f51988B;

    /* renamed from: C */
    public final RecyclerView.C20085t f51989C;

    /* renamed from: a */
    public final int f51990a;

    /* renamed from: b */
    public final int f51991b;

    /* renamed from: c */
    public final StateListDrawable f51992c;

    /* renamed from: d */
    public final Drawable f51993d;

    /* renamed from: e */
    public final int f51994e;

    /* renamed from: f */
    public final int f51995f;

    /* renamed from: g */
    public final StateListDrawable f51996g;

    /* renamed from: h */
    public final Drawable f51997h;

    /* renamed from: i */
    public final int f51998i;

    /* renamed from: j */
    public final int f51999j;
    @C0344h1

    /* renamed from: k */
    public int f52000k;
    @C0344h1

    /* renamed from: l */
    public int f52001l;
    @C0344h1

    /* renamed from: m */
    public float f52002m;
    @C0344h1

    /* renamed from: n */
    public int f52003n;
    @C0344h1

    /* renamed from: o */
    public int f52004o;
    @C0344h1

    /* renamed from: p */
    public float f52005p;

    /* renamed from: q */
    public int f52006q = 0;

    /* renamed from: r */
    public int f52007r = 0;

    /* renamed from: s */
    public RecyclerView f52008s;

    /* renamed from: t */
    public boolean f52009t = false;

    /* renamed from: u */
    public boolean f52010u = false;

    /* renamed from: v */
    public int f52011v = 0;

    /* renamed from: w */
    public int f52012w = 0;

    /* renamed from: x */
    public final int[] f52013x = new int[2];

    /* renamed from: y */
    public final int[] f52014y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f52015z;

    /* renamed from: androidx.recyclerview.widget.l$a */
    public class C20176a implements Runnable {
        public C20176a() {
        }

        public void run() {
            C20175l.this.mo60537w(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    public class C20177b extends RecyclerView.C20085t {
        public C20177b() {
        }

        /* renamed from: b */
        public void mo30662b(RecyclerView recyclerView, int i, int i2) {
            C20175l.this.mo60524J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    public class C20178c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f52018a = false;

        public C20178c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f52018a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f52018a) {
                this.f52018a = false;
            } else if (((Float) C20175l.this.f52015z.getAnimatedValue()).floatValue() == 0.0f) {
                C20175l lVar = C20175l.this;
                lVar.f51987A = 0;
                lVar.mo60521G(0);
            } else {
                C20175l lVar2 = C20175l.this;
                lVar2.f51987A = 2;
                lVar2.mo60518D();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    public class C20179d implements ValueAnimator.AnimatorUpdateListener {
        public C20179d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C20175l.this.f51992c.setAlpha(floatValue);
            C20175l.this.f51993d.setAlpha(floatValue);
            C20175l.this.mo60518D();
        }
    }

    public C20175l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f52015z = ofFloat;
        this.f51987A = 0;
        this.f51988B = new C20176a();
        this.f51989C = new C20177b();
        this.f51992c = stateListDrawable;
        this.f51993d = drawable;
        this.f51996g = stateListDrawable2;
        this.f51997h = drawable2;
        this.f51994e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f51995f = Math.max(i, drawable.getIntrinsicWidth());
        this.f51998i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f51999j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f51990a = i2;
        this.f51991b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C20178c());
        ofFloat.addUpdateListener(new C20179d());
        mo60526l(recyclerView);
    }

    @C0344h1
    /* renamed from: A */
    public boolean mo60515A(float f, float f2) {
        if (f2 >= ((float) (this.f52007r - this.f51998i))) {
            int i = this.f52004o;
            int i2 = this.f52003n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    @C0344h1
    /* renamed from: B */
    public boolean mo60516B(float f, float f2) {
        if (!mo60540z() ? f >= ((float) (this.f52006q - this.f51994e)) : f <= ((float) this.f51994e)) {
            int i = this.f52001l;
            int i2 = this.f52000k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    @C0344h1
    /* renamed from: C */
    public boolean mo60517C() {
        return this.f52011v == 1;
    }

    /* renamed from: D */
    public void mo60518D() {
        this.f52008s.invalidate();
    }

    /* renamed from: E */
    public final void mo60519E(int i) {
        mo60527m();
        this.f52008s.postDelayed(this.f51988B, (long) i);
    }

    /* renamed from: F */
    public final int mo60520F(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: G */
    public void mo60521G(int i) {
        if (i == 2 && this.f52011v != 2) {
            this.f51992c.setState(f51985S);
            mo60527m();
        }
        if (i == 0) {
            mo60518D();
        } else {
            mo60523I();
        }
        if (this.f52011v == 2 && i != 2) {
            this.f51992c.setState(f51986T);
            mo60519E(1200);
        } else if (i == 1) {
            mo60519E(1500);
        }
        this.f52011v = i;
    }

    /* renamed from: H */
    public final void mo60522H() {
        this.f52008s.mo59589n(this);
        this.f52008s.mo59610q(this);
        this.f52008s.mo59613r(this.f51989C);
    }

    /* renamed from: I */
    public void mo60523I() {
        int i = this.f51987A;
        if (i != 0) {
            if (i == 3) {
                this.f52015z.cancel();
            } else {
                return;
            }
        }
        this.f51987A = 1;
        ValueAnimator valueAnimator = this.f52015z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f52015z.setDuration(500);
        this.f52015z.setStartDelay(0);
        this.f52015z.start();
    }

    /* renamed from: J */
    public void mo60524J(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f52008s.computeVerticalScrollRange();
        int i3 = this.f52007r;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f51990a) {
            z = false;
        } else {
            z = true;
        }
        this.f52009t = z;
        int computeHorizontalScrollRange = this.f52008s.computeHorizontalScrollRange();
        int i4 = this.f52006q;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f51990a) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f52010u = z2;
        boolean z3 = this.f52009t;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i3;
                this.f52001l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f52000k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f52010u) {
                float f2 = (float) i4;
                this.f52004o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f52003n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f52011v;
            if (i5 == 0 || i5 == 1) {
                mo60521G(1);
            }
        } else if (this.f52011v != 0) {
            mo60521G(0);
        }
    }

    /* renamed from: K */
    public final void mo60525K(float f) {
        int[] t = mo60534t();
        float max = Math.max((float) t[0], Math.min((float) t[1], f));
        if (Math.abs(((float) this.f52001l) - max) >= 2.0f) {
            int F = mo60520F(this.f52002m, max, t, this.f52008s.computeVerticalScrollRange(), this.f52008s.computeVerticalScrollOffset(), this.f52007r);
            if (F != 0) {
                this.f52008s.scrollBy(0, F);
            }
            this.f52002m = max;
        }
    }

    /* renamed from: a */
    public void mo60002a(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
        if (this.f52011v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean B = mo60516B(motionEvent.getX(), motionEvent.getY());
                boolean A = mo60515A(motionEvent.getX(), motionEvent.getY());
                if (B || A) {
                    if (A) {
                        this.f52012w = 1;
                        this.f52005p = (float) ((int) motionEvent.getX());
                    } else if (B) {
                        this.f52012w = 2;
                        this.f52002m = (float) ((int) motionEvent.getY());
                    }
                    mo60521G(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f52011v == 2) {
                this.f52002m = 0.0f;
                this.f52005p = 0.0f;
                mo60521G(1);
                this.f52012w = 0;
            } else if (motionEvent.getAction() == 2 && this.f52011v == 2) {
                mo60523I();
                if (this.f52012w == 1) {
                    mo60538x(motionEvent.getX());
                }
                if (this.f52012w == 2) {
                    mo60525K(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo60003c(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
        int i = this.f52011v;
        if (i == 1) {
            boolean B = mo60516B(motionEvent.getX(), motionEvent.getY());
            boolean A = mo60515A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!B && !A) {
                return false;
            }
            if (A) {
                this.f52012w = 1;
                this.f52005p = (float) ((int) motionEvent.getX());
            } else if (B) {
                this.f52012w = 2;
                this.f52002m = (float) ((int) motionEvent.getY());
            }
            mo60521G(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo60004e(boolean z) {
    }

    /* renamed from: k */
    public void mo59103k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        if (this.f52006q != this.f52008s.getWidth() || this.f52007r != this.f52008s.getHeight()) {
            this.f52006q = this.f52008s.getWidth();
            this.f52007r = this.f52008s.getHeight();
            mo60521G(0);
        } else if (this.f51987A != 0) {
            if (this.f52009t) {
                mo60530p(canvas);
            }
            if (this.f52010u) {
                mo60529o(canvas);
            }
        }
    }

    /* renamed from: l */
    public void mo60526l(@C0363p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f52008s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo60528n();
            }
            this.f52008s = recyclerView;
            if (recyclerView != null) {
                mo60522H();
            }
        }
    }

    /* renamed from: m */
    public final void mo60527m() {
        this.f52008s.removeCallbacks(this.f51988B);
    }

    /* renamed from: n */
    public final void mo60528n() {
        this.f52008s.mo59623s1(this);
        this.f52008s.mo59654v1(this);
        this.f52008s.mo59656w1(this.f51989C);
        mo60527m();
    }

    /* renamed from: o */
    public final void mo60529o(Canvas canvas) {
        int i = this.f52007r;
        int i2 = this.f51998i;
        int i3 = i - i2;
        int i4 = this.f52004o;
        int i5 = this.f52003n;
        int i6 = i4 - (i5 / 2);
        this.f51996g.setBounds(0, 0, i5, i2);
        this.f51997h.setBounds(0, 0, this.f52006q, this.f51999j);
        canvas.translate(0.0f, (float) i3);
        this.f51997h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f51996g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: p */
    public final void mo60530p(Canvas canvas) {
        int i = this.f52006q;
        int i2 = this.f51994e;
        int i3 = i - i2;
        int i4 = this.f52001l;
        int i5 = this.f52000k;
        int i6 = i4 - (i5 / 2);
        this.f51992c.setBounds(0, 0, i2, i5);
        this.f51993d.setBounds(0, 0, this.f51995f, this.f52007r);
        if (mo60540z()) {
            this.f51993d.draw(canvas);
            canvas.translate((float) this.f51994e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f51992c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f51994e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f51993d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f51992c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: q */
    public final int[] mo60531q() {
        int[] iArr = this.f52014y;
        int i = this.f51991b;
        iArr[0] = i;
        iArr[1] = this.f52006q - i;
        return iArr;
    }

    @C0344h1
    /* renamed from: r */
    public Drawable mo60532r() {
        return this.f51996g;
    }

    @C0344h1
    /* renamed from: s */
    public Drawable mo60533s() {
        return this.f51997h;
    }

    /* renamed from: t */
    public final int[] mo60534t() {
        int[] iArr = this.f52013x;
        int i = this.f51991b;
        iArr[0] = i;
        iArr[1] = this.f52007r - i;
        return iArr;
    }

    @C0344h1
    /* renamed from: u */
    public Drawable mo60535u() {
        return this.f51992c;
    }

    @C0344h1
    /* renamed from: v */
    public Drawable mo60536v() {
        return this.f51993d;
    }

    @C0344h1
    /* renamed from: w */
    public void mo60537w(int i) {
        int i2 = this.f51987A;
        if (i2 == 1) {
            this.f52015z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f51987A = 3;
        ValueAnimator valueAnimator = this.f52015z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f52015z.setDuration((long) i);
        this.f52015z.start();
    }

    /* renamed from: x */
    public final void mo60538x(float f) {
        int[] q = mo60531q();
        float max = Math.max((float) q[0], Math.min((float) q[1], f));
        if (Math.abs(((float) this.f52004o) - max) >= 2.0f) {
            int F = mo60520F(this.f52005p, max, q, this.f52008s.computeHorizontalScrollRange(), this.f52008s.computeHorizontalScrollOffset(), this.f52006q);
            if (F != 0) {
                this.f52008s.scrollBy(F, 0);
            }
            this.f52005p = max;
        }
    }

    /* renamed from: y */
    public boolean mo60539y() {
        return this.f52011v == 2;
    }

    /* renamed from: z */
    public final boolean mo60540z() {
        return C18196h2.m82553Z(this.f52008s) == 1;
    }
}
