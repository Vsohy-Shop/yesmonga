package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.C0359n0;
import androidx.core.view.C18196h2;

/* renamed from: androidx.core.widget.a */
public abstract class C18461a implements View.OnTouchListener {

    /* renamed from: G0 */
    public static final float f47204G0 = 0.0f;

    /* renamed from: H0 */
    public static final float f47205H0 = Float.MAX_VALUE;

    /* renamed from: I0 */
    public static final float f47206I0 = 0.0f;

    /* renamed from: J0 */
    public static final int f47207J0 = 0;

    /* renamed from: K0 */
    public static final int f47208K0 = 1;

    /* renamed from: L0 */
    public static final int f47209L0 = 2;

    /* renamed from: M0 */
    public static final int f47210M0 = 0;

    /* renamed from: N0 */
    public static final int f47211N0 = 1;

    /* renamed from: O0 */
    public static final int f47212O0 = 1;

    /* renamed from: P0 */
    public static final int f47213P0 = 315;

    /* renamed from: Q0 */
    public static final int f47214Q0 = 1575;

    /* renamed from: R0 */
    public static final float f47215R0 = Float.MAX_VALUE;

    /* renamed from: S0 */
    public static final float f47216S0 = 0.2f;

    /* renamed from: T0 */
    public static final float f47217T0 = 1.0f;

    /* renamed from: U0 */
    public static final int f47218U0 = ViewConfiguration.getTapTimeout();

    /* renamed from: V0 */
    public static final int f47219V0 = 500;

    /* renamed from: W0 */
    public static final int f47220W0 = 500;

    /* renamed from: E0 */
    public boolean f47221E0;

    /* renamed from: F0 */
    public boolean f47222F0;

    /* renamed from: X */
    public boolean f47223X;

    /* renamed from: Y */
    public boolean f47224Y;

    /* renamed from: Z */
    public boolean f47225Z;

    /* renamed from: a */
    public final C18462a f47226a = new C18462a();

    /* renamed from: b */
    public final Interpolator f47227b = new AccelerateInterpolator();

    /* renamed from: c */
    public final View f47228c;

    /* renamed from: d */
    public Runnable f47229d;

    /* renamed from: e */
    public float[] f47230e = {0.0f, 0.0f};

    /* renamed from: f */
    public float[] f47231f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g */
    public int f47232g;

    /* renamed from: v */
    public int f47233v;

    /* renamed from: w */
    public float[] f47234w = {0.0f, 0.0f};

    /* renamed from: x */
    public float[] f47235x = {0.0f, 0.0f};

    /* renamed from: y */
    public float[] f47236y = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: z */
    public boolean f47237z;

    /* renamed from: androidx.core.widget.a$a */
    public static class C18462a {

        /* renamed from: a */
        public int f47238a;

        /* renamed from: b */
        public int f47239b;

        /* renamed from: c */
        public float f47240c;

        /* renamed from: d */
        public float f47241d;

        /* renamed from: e */
        public long f47242e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f47243f = 0;

        /* renamed from: g */
        public int f47244g = 0;

        /* renamed from: h */
        public int f47245h = 0;

        /* renamed from: i */
        public long f47246i = -1;

        /* renamed from: j */
        public float f47247j;

        /* renamed from: k */
        public int f47248k;

        /* renamed from: a */
        public void mo53330a() {
            if (this.f47243f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = mo53336g(mo53334e(currentAnimationTimeMillis));
                this.f47243f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f47243f)) * g;
                this.f47244g = (int) (this.f47240c * f);
                this.f47245h = (int) (f * this.f47241d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo53331b() {
            return this.f47244g;
        }

        /* renamed from: c */
        public int mo53332c() {
            return this.f47245h;
        }

        /* renamed from: d */
        public int mo53333d() {
            float f = this.f47240c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float mo53334e(long j) {
            long j2 = this.f47242e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f47246i;
            if (j3 < 0 || j < j3) {
                return C18461a.m83596e(((float) (j - j2)) / ((float) this.f47238a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f47247j;
            return (1.0f - f) + (f * C18461a.m83596e(((float) (j - j3)) / ((float) this.f47248k), 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int mo53335f() {
            float f = this.f47241d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float mo53336g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean mo53337h() {
            if (this.f47246i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f47246i + ((long) this.f47248k)) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void mo53338i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f47248k = C18461a.m83597f((int) (currentAnimationTimeMillis - this.f47242e), 0, this.f47239b);
            this.f47247j = mo53334e(currentAnimationTimeMillis);
            this.f47246i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo53339j(int i) {
            this.f47239b = i;
        }

        /* renamed from: k */
        public void mo53340k(int i) {
            this.f47238a = i;
        }

        /* renamed from: l */
        public void mo53341l(float f, float f2) {
            this.f47240c = f;
            this.f47241d = f2;
        }

        /* renamed from: m */
        public void mo53342m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f47242e = currentAnimationTimeMillis;
            this.f47246i = -1;
            this.f47243f = currentAnimationTimeMillis;
            this.f47247j = 0.5f;
            this.f47244g = 0;
            this.f47245h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    public class C18463b implements Runnable {
        public C18463b() {
        }

        public void run() {
            C18461a aVar = C18461a.this;
            if (aVar.f47225Z) {
                if (aVar.f47223X) {
                    aVar.f47223X = false;
                    aVar.f47226a.mo53342m();
                }
                C18462a aVar2 = C18461a.this.f47226a;
                if (aVar2.mo53337h() || !C18461a.this.mo53328x()) {
                    C18461a.this.f47225Z = false;
                    return;
                }
                C18461a aVar3 = C18461a.this;
                if (aVar3.f47224Y) {
                    aVar3.f47224Y = false;
                    aVar3.mo53308c();
                }
                aVar2.mo53330a();
                C18461a.this.mo53315l(aVar2.mo53331b(), aVar2.mo53332c());
                C18196h2.m82618p1(C18461a.this.f47228c, this);
            }
        }
    }

    public C18461a(@C0359n0 View view) {
        this.f47228c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo53322r(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo53323s(f3, f3);
        mo53317n(1);
        mo53321q(Float.MAX_VALUE, Float.MAX_VALUE);
        mo53326v(0.2f, 0.2f);
        mo53327w(1.0f, 1.0f);
        mo53316m(f47218U0);
        mo53325u(500);
        mo53324t(500);
    }

    /* renamed from: e */
    public static float m83596e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m83597f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo53306a(int i);

    /* renamed from: b */
    public abstract boolean mo53307b(int i);

    /* renamed from: c */
    public void mo53308c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f47228c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float mo53309d(int i, float f, float f2, float f3) {
        float h = mo53311h(this.f47230e[i], f2, this.f47231f[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f47234w[i];
        float f5 = this.f47235x[i];
        float f6 = this.f47236y[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m83596e(h * f7, f5, f6);
        }
        return -m83596e((-h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float mo53310g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f47232g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (!this.f47225Z || i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo53311h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m83596e(f * f2, 0.0f, f3);
        float g = mo53310g(f2 - f4, e) - mo53310g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f47227b.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f47227b.getInterpolation(g);
        }
        return m83596e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public boolean mo53312i() {
        return this.f47221E0;
    }

    /* renamed from: j */
    public boolean mo53313j() {
        return this.f47222F0;
    }

    /* renamed from: k */
    public final void mo53314k() {
        if (this.f47223X) {
            this.f47225Z = false;
        } else {
            this.f47226a.mo53338i();
        }
    }

    /* renamed from: l */
    public abstract void mo53315l(int i, int i2);

    @C0359n0
    /* renamed from: m */
    public C18461a mo53316m(int i) {
        this.f47233v = i;
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C18461a mo53317n(int i) {
        this.f47232g = i;
        return this;
    }

    /* renamed from: o */
    public C18461a mo53318o(boolean z) {
        if (this.f47221E0 && !z) {
            mo53314k();
        }
        this.f47221E0 = z;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f47221E0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.mo53314k()
            goto L_0x0058
        L_0x001a:
            r5.f47224Y = r2
            r5.f47237z = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f47228c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo53309d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f47228c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo53309d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f47226a
            r7.mo53341l(r0, r6)
            boolean r6 = r5.f47225Z
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo53328x()
            if (r6 == 0) goto L_0x0058
            r5.mo53329y()
        L_0x0058:
            boolean r6 = r5.f47222F0
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f47225Z
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C18461a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C18461a mo53320p(boolean z) {
        this.f47222F0 = z;
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public C18461a mo53321q(float f, float f2) {
        float[] fArr = this.f47231f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public C18461a mo53322r(float f, float f2) {
        float[] fArr = this.f47236y;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public C18461a mo53323s(float f, float f2) {
        float[] fArr = this.f47235x;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @C0359n0
    /* renamed from: t */
    public C18461a mo53324t(int i) {
        this.f47226a.mo53339j(i);
        return this;
    }

    @C0359n0
    /* renamed from: u */
    public C18461a mo53325u(int i) {
        this.f47226a.mo53340k(i);
        return this;
    }

    @C0359n0
    /* renamed from: v */
    public C18461a mo53326v(float f, float f2) {
        float[] fArr = this.f47230e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @C0359n0
    /* renamed from: w */
    public C18461a mo53327w(float f, float f2) {
        float[] fArr = this.f47234w;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: x */
    public boolean mo53328x() {
        C18462a aVar = this.f47226a;
        int f = aVar.mo53335f();
        int d = aVar.mo53333d();
        if ((f == 0 || !mo53307b(f)) && (d == 0 || !mo53306a(d))) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final void mo53329y() {
        int i;
        if (this.f47229d == null) {
            this.f47229d = new C18463b();
        }
        this.f47225Z = true;
        this.f47223X = true;
        if (this.f47237z || (i = this.f47233v) <= 0) {
            this.f47229d.run();
        } else {
            C18196h2.m82622q1(this.f47228c, this.f47229d, (long) i);
        }
        this.f47237z = true;
    }
}
