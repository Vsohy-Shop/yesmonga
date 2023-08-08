package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import androidx.interpolator.view.animation.C19319b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public class C20524b extends Drawable implements Animatable {

    /* renamed from: E0 */
    public static final float f52921E0 = 2.5f;

    /* renamed from: F0 */
    public static final int f52922F0 = 10;

    /* renamed from: G0 */
    public static final int f52923G0 = 5;

    /* renamed from: H0 */
    public static final int[] f52924H0 = {-16777216};

    /* renamed from: I0 */
    public static final float f52925I0 = 0.75f;

    /* renamed from: J0 */
    public static final float f52926J0 = 0.5f;

    /* renamed from: K0 */
    public static final int f52927K0 = 1332;

    /* renamed from: L0 */
    public static final float f52928L0 = 216.0f;

    /* renamed from: M0 */
    public static final float f52929M0 = 0.8f;

    /* renamed from: N0 */
    public static final float f52930N0 = 0.01f;

    /* renamed from: O0 */
    public static final float f52931O0 = 0.20999998f;

    /* renamed from: X */
    public static final int f52932X = 6;

    /* renamed from: Y */
    public static final int f52933Y = 1;

    /* renamed from: Z */
    public static final float f52934Z = 7.5f;

    /* renamed from: g */
    public static final Interpolator f52935g = new LinearInterpolator();

    /* renamed from: v */
    public static final Interpolator f52936v = new C19319b();

    /* renamed from: w */
    public static final int f52937w = 0;

    /* renamed from: x */
    public static final float f52938x = 11.0f;

    /* renamed from: y */
    public static final float f52939y = 3.0f;

    /* renamed from: z */
    public static final int f52940z = 12;

    /* renamed from: a */
    public final C20528d f52941a;

    /* renamed from: b */
    public float f52942b;

    /* renamed from: c */
    public Resources f52943c;

    /* renamed from: d */
    public Animator f52944d;

    /* renamed from: e */
    public float f52945e;

    /* renamed from: f */
    public boolean f52946f;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    public class C20525a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C20528d f52947a;

        public C20525a(C20528d dVar) {
            this.f52947a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C20524b.this.mo61526H(floatValue, this.f52947a);
            C20524b.this.mo61529e(floatValue, this.f52947a, false);
            C20524b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    public class C20526b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C20528d f52949a;

        public C20526b(C20528d dVar) {
            this.f52949a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C20524b.this.mo61529e(1.0f, this.f52949a, true);
            this.f52949a.mo61575M();
            this.f52949a.mo61597v();
            C20524b bVar = C20524b.this;
            if (bVar.f52946f) {
                bVar.f52946f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f52949a.mo61571I(false);
                return;
            }
            bVar.f52945e += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C20524b.this.f52945e = 0.0f;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    public @interface C20527c {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$d */
    public static class C20528d {

        /* renamed from: a */
        public final RectF f52951a = new RectF();

        /* renamed from: b */
        public final Paint f52952b;

        /* renamed from: c */
        public final Paint f52953c;

        /* renamed from: d */
        public final Paint f52954d;

        /* renamed from: e */
        public float f52955e;

        /* renamed from: f */
        public float f52956f;

        /* renamed from: g */
        public float f52957g;

        /* renamed from: h */
        public float f52958h;

        /* renamed from: i */
        public int[] f52959i;

        /* renamed from: j */
        public int f52960j;

        /* renamed from: k */
        public float f52961k;

        /* renamed from: l */
        public float f52962l;

        /* renamed from: m */
        public float f52963m;

        /* renamed from: n */
        public boolean f52964n;

        /* renamed from: o */
        public Path f52965o;

        /* renamed from: p */
        public float f52966p;

        /* renamed from: q */
        public float f52967q;

        /* renamed from: r */
        public int f52968r;

        /* renamed from: s */
        public int f52969s;

        /* renamed from: t */
        public int f52970t;

        /* renamed from: u */
        public int f52971u;

        public C20528d() {
            Paint paint = new Paint();
            this.f52952b = paint;
            Paint paint2 = new Paint();
            this.f52953c = paint2;
            Paint paint3 = new Paint();
            this.f52954d = paint3;
            this.f52955e = 0.0f;
            this.f52956f = 0.0f;
            this.f52957g = 0.0f;
            this.f52958h = 5.0f;
            this.f52966p = 1.0f;
            this.f52970t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void mo61563A(int i) {
            this.f52954d.setColor(i);
        }

        /* renamed from: B */
        public void mo61564B(float f) {
            this.f52967q = f;
        }

        /* renamed from: C */
        public void mo61565C(int i) {
            this.f52971u = i;
        }

        /* renamed from: D */
        public void mo61566D(ColorFilter colorFilter) {
            this.f52952b.setColorFilter(colorFilter);
        }

        /* renamed from: E */
        public void mo61567E(int i) {
            this.f52960j = i;
            this.f52971u = this.f52959i[i];
        }

        /* renamed from: F */
        public void mo61568F(@C0359n0 int[] iArr) {
            this.f52959i = iArr;
            mo61567E(0);
        }

        /* renamed from: G */
        public void mo61569G(float f) {
            this.f52956f = f;
        }

        /* renamed from: H */
        public void mo61570H(float f) {
            this.f52957g = f;
        }

        /* renamed from: I */
        public void mo61571I(boolean z) {
            if (this.f52964n != z) {
                this.f52964n = z;
            }
        }

        /* renamed from: J */
        public void mo61572J(float f) {
            this.f52955e = f;
        }

        /* renamed from: K */
        public void mo61573K(Paint.Cap cap) {
            this.f52952b.setStrokeCap(cap);
        }

        /* renamed from: L */
        public void mo61574L(float f) {
            this.f52958h = f;
            this.f52952b.setStrokeWidth(f);
        }

        /* renamed from: M */
        public void mo61575M() {
            this.f52961k = this.f52955e;
            this.f52962l = this.f52956f;
            this.f52963m = this.f52957g;
        }

        /* renamed from: a */
        public void mo61576a(Canvas canvas, Rect rect) {
            RectF rectF = this.f52951a;
            float f = this.f52967q;
            float f2 = (this.f52958h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f52968r) * this.f52966p) / 2.0f, this.f52958h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f52955e;
            float f4 = this.f52957g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f52956f + f4) * 360.0f) - f5;
            this.f52952b.setColor(this.f52971u);
            this.f52952b.setAlpha(this.f52970t);
            float f7 = this.f52958h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f52954d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f52952b);
            mo61577b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void mo61577b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f52964n) {
                Path path = this.f52965o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f52965o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f52965o.moveTo(0.0f, 0.0f);
                this.f52965o.lineTo(((float) this.f52968r) * this.f52966p, 0.0f);
                Path path3 = this.f52965o;
                float f3 = this.f52966p;
                path3.lineTo((((float) this.f52968r) * f3) / 2.0f, ((float) this.f52969s) * f3);
                this.f52965o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f52968r) * this.f52966p) / 2.0f), rectF.centerY() + (this.f52958h / 2.0f));
                this.f52965o.close();
                this.f52953c.setColor(this.f52971u);
                this.f52953c.setAlpha(this.f52970t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f52965o, this.f52953c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int mo61578c() {
            return this.f52970t;
        }

        /* renamed from: d */
        public float mo61579d() {
            return (float) this.f52969s;
        }

        /* renamed from: e */
        public float mo61580e() {
            return this.f52966p;
        }

        /* renamed from: f */
        public float mo61581f() {
            return (float) this.f52968r;
        }

        /* renamed from: g */
        public int mo61582g() {
            return this.f52954d.getColor();
        }

        /* renamed from: h */
        public float mo61583h() {
            return this.f52967q;
        }

        /* renamed from: i */
        public int[] mo61584i() {
            return this.f52959i;
        }

        /* renamed from: j */
        public float mo61585j() {
            return this.f52956f;
        }

        /* renamed from: k */
        public int mo61586k() {
            return this.f52959i[mo61587l()];
        }

        /* renamed from: l */
        public int mo61587l() {
            return (this.f52960j + 1) % this.f52959i.length;
        }

        /* renamed from: m */
        public float mo61588m() {
            return this.f52957g;
        }

        /* renamed from: n */
        public boolean mo61589n() {
            return this.f52964n;
        }

        /* renamed from: o */
        public float mo61590o() {
            return this.f52955e;
        }

        /* renamed from: p */
        public int mo61591p() {
            return this.f52959i[this.f52960j];
        }

        /* renamed from: q */
        public float mo61592q() {
            return this.f52962l;
        }

        /* renamed from: r */
        public float mo61593r() {
            return this.f52963m;
        }

        /* renamed from: s */
        public float mo61594s() {
            return this.f52961k;
        }

        /* renamed from: t */
        public Paint.Cap mo61595t() {
            return this.f52952b.getStrokeCap();
        }

        /* renamed from: u */
        public float mo61596u() {
            return this.f52958h;
        }

        /* renamed from: v */
        public void mo61597v() {
            mo61567E(mo61587l());
        }

        /* renamed from: w */
        public void mo61598w() {
            this.f52961k = 0.0f;
            this.f52962l = 0.0f;
            this.f52963m = 0.0f;
            mo61572J(0.0f);
            mo61569G(0.0f);
            mo61570H(0.0f);
        }

        /* renamed from: x */
        public void mo61599x(int i) {
            this.f52970t = i;
        }

        /* renamed from: y */
        public void mo61600y(float f, float f2) {
            this.f52968r = (int) f;
            this.f52969s = (int) f2;
        }

        /* renamed from: z */
        public void mo61601z(float f) {
            if (f != this.f52966p) {
                this.f52966p = f;
            }
        }
    }

    public C20524b(@C0359n0 Context context) {
        this.f52943c = ((Context) C18001r.m81775l(context)).getResources();
        C20528d dVar = new C20528d();
        this.f52941a = dVar;
        dVar.mo61568F(f52924H0);
        mo61523E(2.5f);
        mo61525G();
    }

    /* renamed from: A */
    public final void mo61519A(float f) {
        this.f52942b = f;
    }

    /* renamed from: B */
    public final void mo61520B(float f, float f2, float f3, float f4) {
        C20528d dVar = this.f52941a;
        float f5 = this.f52943c.getDisplayMetrics().density;
        dVar.mo61574L(f2 * f5);
        dVar.mo61564B(f * f5);
        dVar.mo61567E(0);
        dVar.mo61600y(f3 * f5, f4 * f5);
    }

    /* renamed from: C */
    public void mo61521C(float f, float f2) {
        this.f52941a.mo61572J(f);
        this.f52941a.mo61569G(f2);
        invalidateSelf();
    }

    /* renamed from: D */
    public void mo61522D(@C0359n0 Paint.Cap cap) {
        this.f52941a.mo61573K(cap);
        invalidateSelf();
    }

    /* renamed from: E */
    public void mo61523E(float f) {
        this.f52941a.mo61574L(f);
        invalidateSelf();
    }

    /* renamed from: F */
    public void mo61524F(int i) {
        if (i == 0) {
            mo61520B(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            mo61520B(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: G */
    public final void mo61525G() {
        C20528d dVar = this.f52941a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C20525a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f52935g);
        ofFloat.addListener(new C20526b(dVar));
        this.f52944d = ofFloat;
    }

    /* renamed from: H */
    public void mo61526H(float f, C20528d dVar) {
        if (f > 0.75f) {
            dVar.mo61565C(mo61530f((f - 0.75f) / 0.25f, dVar.mo61591p(), dVar.mo61586k()));
        } else {
            dVar.mo61565C(dVar.mo61591p());
        }
    }

    /* renamed from: a */
    public final void mo61527a(float f, C20528d dVar) {
        mo61526H(f, dVar);
        dVar.mo61572J(dVar.mo61594s() + (((dVar.mo61592q() - 0.01f) - dVar.mo61594s()) * f));
        dVar.mo61569G(dVar.mo61592q());
        dVar.mo61570H(dVar.mo61593r() + ((((float) (Math.floor((double) (dVar.mo61593r() / 0.8f)) + 1.0d)) - dVar.mo61593r()) * f));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f52942b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f52941a.mo61576a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo61529e(float f, C20528d dVar, boolean z) {
        float f2;
        float f3;
        if (this.f52946f) {
            mo61527a(f, dVar);
        } else if (f != 1.0f || z) {
            float r = dVar.mo61593r();
            if (f < 0.5f) {
                f2 = dVar.mo61594s();
                f3 = (f52936v.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float s = dVar.mo61594s() + 0.79f;
                float f4 = s;
                f2 = s - (((1.0f - f52936v.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            dVar.mo61572J(f2);
            dVar.mo61569G(f3);
            dVar.mo61570H(r + (0.20999998f * f));
            mo61519A((f + this.f52945e) * 216.0f);
        }
    }

    /* renamed from: f */
    public final int mo61530f(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: g */
    public boolean mo61531g() {
        return this.f52941a.mo61589n();
    }

    public int getAlpha() {
        return this.f52941a.mo61578c();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float mo61534h() {
        return this.f52941a.mo61579d();
    }

    /* renamed from: i */
    public float mo61535i() {
        return this.f52941a.mo61580e();
    }

    public boolean isRunning() {
        return this.f52944d.isRunning();
    }

    /* renamed from: j */
    public float mo61537j() {
        return this.f52941a.mo61581f();
    }

    /* renamed from: k */
    public int mo61538k() {
        return this.f52941a.mo61582g();
    }

    /* renamed from: l */
    public float mo61539l() {
        return this.f52941a.mo61583h();
    }

    @C0359n0
    /* renamed from: m */
    public int[] mo61540m() {
        return this.f52941a.mo61584i();
    }

    /* renamed from: n */
    public float mo61541n() {
        return this.f52941a.mo61585j();
    }

    /* renamed from: o */
    public float mo61542o() {
        return this.f52941a.mo61588m();
    }

    /* renamed from: p */
    public final float mo61543p() {
        return this.f52942b;
    }

    /* renamed from: q */
    public float mo61544q() {
        return this.f52941a.mo61590o();
    }

    @C0359n0
    /* renamed from: r */
    public Paint.Cap mo61545r() {
        return this.f52941a.mo61595t();
    }

    /* renamed from: s */
    public float mo61546s() {
        return this.f52941a.mo61596u();
    }

    public void setAlpha(int i) {
        this.f52941a.mo61599x(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f52941a.mo61566D(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f52944d.cancel();
        this.f52941a.mo61575M();
        if (this.f52941a.mo61585j() != this.f52941a.mo61590o()) {
            this.f52946f = true;
            this.f52944d.setDuration(666);
            this.f52944d.start();
            return;
        }
        this.f52941a.mo61567E(0);
        this.f52941a.mo61598w();
        this.f52944d.setDuration(1332);
        this.f52944d.start();
    }

    public void stop() {
        this.f52944d.cancel();
        mo61519A(0.0f);
        this.f52941a.mo61571I(false);
        this.f52941a.mo61567E(0);
        this.f52941a.mo61598w();
        invalidateSelf();
    }

    /* renamed from: t */
    public void mo61551t(float f, float f2) {
        this.f52941a.mo61600y(f, f2);
        invalidateSelf();
    }

    /* renamed from: u */
    public void mo61552u(boolean z) {
        this.f52941a.mo61571I(z);
        invalidateSelf();
    }

    /* renamed from: v */
    public void mo61553v(float f) {
        this.f52941a.mo61601z(f);
        invalidateSelf();
    }

    /* renamed from: w */
    public void mo61554w(int i) {
        this.f52941a.mo61563A(i);
        invalidateSelf();
    }

    /* renamed from: x */
    public void mo61555x(float f) {
        this.f52941a.mo61564B(f);
        invalidateSelf();
    }

    /* renamed from: y */
    public void mo61556y(@C0359n0 int... iArr) {
        this.f52941a.mo61568F(iArr);
        this.f52941a.mo61567E(0);
        invalidateSelf();
    }

    /* renamed from: z */
    public void mo61557z(float f) {
        this.f52941a.mo61570H(f);
        invalidateSelf();
    }
}
