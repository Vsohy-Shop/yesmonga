package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.internal.C31432x;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import com.google.android.material.transition.platform.C31823v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.l */
public final class C31793l extends Transition {

    /* renamed from: O0 */
    public static final int f77479O0 = 0;

    /* renamed from: P0 */
    public static final int f77480P0 = 1;

    /* renamed from: Q0 */
    public static final int f77481Q0 = 2;

    /* renamed from: R0 */
    public static final int f77482R0 = 0;

    /* renamed from: S0 */
    public static final int f77483S0 = 1;

    /* renamed from: T0 */
    public static final int f77484T0 = 2;

    /* renamed from: U0 */
    public static final int f77485U0 = 3;

    /* renamed from: V0 */
    public static final int f77486V0 = 0;

    /* renamed from: W0 */
    public static final int f77487W0 = 1;

    /* renamed from: X0 */
    public static final int f77488X0 = 2;

    /* renamed from: Y0 */
    public static final String f77489Y0 = "l";

    /* renamed from: Z0 */
    public static final String f77490Z0 = "materialContainerTransition:bounds";

    /* renamed from: a1 */
    public static final String f77491a1 = "materialContainerTransition:shapeAppearance";

    /* renamed from: b1 */
    public static final String[] f77492b1 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: c1 */
    public static final C31799f f77493c1 = new C31799f(new C31798e(0.0f, 0.25f), new C31798e(0.0f, 1.0f), new C31798e(0.0f, 1.0f), new C31798e(0.0f, 0.75f), (C31794a) null);

    /* renamed from: d1 */
    public static final C31799f f77494d1 = new C31799f(new C31798e(0.6f, 0.9f), new C31798e(0.0f, 1.0f), new C31798e(0.0f, 0.9f), new C31798e(0.3f, 0.9f), (C31794a) null);

    /* renamed from: e1 */
    public static final C31799f f77495e1 = new C31799f(new C31798e(0.1f, 0.4f), new C31798e(0.1f, 1.0f), new C31798e(0.1f, 1.0f), new C31798e(0.1f, 0.9f), (C31794a) null);

    /* renamed from: f1 */
    public static final C31799f f77496f1 = new C31799f(new C31798e(0.6f, 0.9f), new C31798e(0.0f, 0.9f), new C31798e(0.0f, 0.9f), new C31798e(0.2f, 0.9f), (C31794a) null);

    /* renamed from: g1 */
    public static final float f77497g1 = -1.0f;
    @C0363p0

    /* renamed from: E0 */
    public View f77498E0;
    @C0363p0

    /* renamed from: F0 */
    public C31534o f77499F0;
    @C0363p0

    /* renamed from: G0 */
    public C31534o f77500G0;
    @C0363p0

    /* renamed from: H0 */
    public C31798e f77501H0;
    @C0363p0

    /* renamed from: I0 */
    public C31798e f77502I0;
    @C0363p0

    /* renamed from: J0 */
    public C31798e f77503J0;
    @C0363p0

    /* renamed from: K0 */
    public C31798e f77504K0;

    /* renamed from: L0 */
    public boolean f77505L0;

    /* renamed from: M0 */
    public float f77506M0;

    /* renamed from: N0 */
    public float f77507N0;

    /* renamed from: X */
    public int f77508X = 0;

    /* renamed from: Y */
    public int f77509Y = 0;
    @C0363p0

    /* renamed from: Z */
    public View f77510Z;

    /* renamed from: a */
    public boolean f77511a = false;

    /* renamed from: b */
    public boolean f77512b = false;

    /* renamed from: c */
    public boolean f77513c = false;

    /* renamed from: d */
    public boolean f77514d = false;
    @C0329d0

    /* renamed from: e */
    public int f77515e = 16908290;
    @C0329d0

    /* renamed from: f */
    public int f77516f = -1;
    @C0329d0

    /* renamed from: g */
    public int f77517g = -1;
    @C0354l

    /* renamed from: v */
    public int f77518v = 0;
    @C0354l

    /* renamed from: w */
    public int f77519w = 0;
    @C0354l

    /* renamed from: x */
    public int f77520x = 0;
    @C0354l

    /* renamed from: y */
    public int f77521y = 1375731712;

    /* renamed from: z */
    public int f77522z = 0;

    /* renamed from: com.google.android.material.transition.platform.l$a */
    public class C31794a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C31801h f77523a;

        public C31794a(C31801h hVar) {
            this.f77523a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77523a.mo92270o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.platform.l$b */
    public class C31795b extends C31822u {

        /* renamed from: a */
        public final /* synthetic */ View f77525a;

        /* renamed from: b */
        public final /* synthetic */ C31801h f77526b;

        /* renamed from: c */
        public final /* synthetic */ View f77527c;

        /* renamed from: d */
        public final /* synthetic */ View f77528d;

        public C31795b(View view, C31801h hVar, View view2, View view3) {
            this.f77525a = view;
            this.f77526b = hVar;
            this.f77527c = view2;
            this.f77528d = view3;
        }

        public void onTransitionEnd(@C0359n0 Transition transition) {
            C31793l.this.removeListener(this);
            if (!C31793l.this.f77512b) {
                this.f77527c.setAlpha(1.0f);
                this.f77528d.setAlpha(1.0f);
                C31432x.m127014i(this.f77525a).mo90181b(this.f77526b);
            }
        }

        public void onTransitionStart(@C0359n0 Transition transition) {
            C31432x.m127014i(this.f77525a).mo90180a(this.f77526b);
            this.f77527c.setAlpha(0.0f);
            this.f77528d.setAlpha(0.0f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.platform.l$c */
    public @interface C31796c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.platform.l$d */
    public @interface C31797d {
    }

    /* renamed from: com.google.android.material.transition.platform.l$e */
    public static class C31798e {
        @C0379x(from = 0.0d, mo1016to = 1.0d)

        /* renamed from: a */
        public final float f77530a;
        @C0379x(from = 0.0d, mo1016to = 1.0d)

        /* renamed from: b */
        public final float f77531b;

        public C31798e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
            this.f77530a = f;
            this.f77531b = f2;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: c */
        public float mo92258c() {
            return this.f77531b;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: d */
        public float mo92259d() {
            return this.f77530a;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.l$f */
    public static class C31799f {
        @C0359n0

        /* renamed from: a */
        public final C31798e f77532a;
        @C0359n0

        /* renamed from: b */
        public final C31798e f77533b;
        @C0359n0

        /* renamed from: c */
        public final C31798e f77534c;
        @C0359n0

        /* renamed from: d */
        public final C31798e f77535d;

        public /* synthetic */ C31799f(C31798e eVar, C31798e eVar2, C31798e eVar3, C31798e eVar4, C31794a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        public C31799f(@C0359n0 C31798e eVar, @C0359n0 C31798e eVar2, @C0359n0 C31798e eVar3, @C0359n0 C31798e eVar4) {
            this.f77532a = eVar;
            this.f77533b = eVar2;
            this.f77534c = eVar3;
            this.f77535d = eVar4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.platform.l$g */
    public @interface C31800g {
    }

    /* renamed from: com.google.android.material.transition.platform.l$h */
    public static final class C31801h extends Drawable {

        /* renamed from: M */
        public static final int f77536M = 754974720;

        /* renamed from: N */
        public static final int f77537N = -7829368;

        /* renamed from: O */
        public static final float f77538O = 0.3f;

        /* renamed from: P */
        public static final float f77539P = 1.5f;

        /* renamed from: A */
        public final C31799f f77540A;

        /* renamed from: B */
        public final C31772a f77541B;

        /* renamed from: C */
        public final C31785f f77542C;

        /* renamed from: D */
        public final boolean f77543D;

        /* renamed from: E */
        public final Paint f77544E;

        /* renamed from: F */
        public final Path f77545F;

        /* renamed from: G */
        public C31778c f77546G;

        /* renamed from: H */
        public C31789h f77547H;

        /* renamed from: I */
        public RectF f77548I;

        /* renamed from: J */
        public float f77549J;

        /* renamed from: K */
        public float f77550K;

        /* renamed from: L */
        public float f77551L;

        /* renamed from: a */
        public final View f77552a;

        /* renamed from: b */
        public final RectF f77553b;

        /* renamed from: c */
        public final C31534o f77554c;

        /* renamed from: d */
        public final float f77555d;

        /* renamed from: e */
        public final View f77556e;

        /* renamed from: f */
        public final RectF f77557f;

        /* renamed from: g */
        public final C31534o f77558g;

        /* renamed from: h */
        public final float f77559h;

        /* renamed from: i */
        public final Paint f77560i;

        /* renamed from: j */
        public final Paint f77561j;

        /* renamed from: k */
        public final Paint f77562k;

        /* renamed from: l */
        public final Paint f77563l;

        /* renamed from: m */
        public final Paint f77564m;

        /* renamed from: n */
        public final C31791j f77565n;

        /* renamed from: o */
        public final PathMeasure f77566o;

        /* renamed from: p */
        public final float f77567p;

        /* renamed from: q */
        public final float[] f77568q;

        /* renamed from: r */
        public final boolean f77569r;

        /* renamed from: s */
        public final float f77570s;

        /* renamed from: t */
        public final float f77571t;

        /* renamed from: u */
        public final boolean f77572u;

        /* renamed from: v */
        public final C31525j f77573v;

        /* renamed from: w */
        public final RectF f77574w;

        /* renamed from: x */
        public final RectF f77575x;

        /* renamed from: y */
        public final RectF f77576y;

        /* renamed from: z */
        public final RectF f77577z;

        /* renamed from: com.google.android.material.transition.platform.l$h$a */
        public class C31802a implements C31823v.C31826c {
            public C31802a() {
            }

            /* renamed from: a */
            public void mo92274a(Canvas canvas) {
                C31801h.this.f77552a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.platform.l$h$b */
        public class C31803b implements C31823v.C31826c {
            public C31803b() {
            }

            /* renamed from: a */
            public void mo92274a(Canvas canvas) {
                C31801h.this.f77556e.draw(canvas);
            }
        }

        public /* synthetic */ C31801h(PathMotion pathMotion, View view, RectF rectF, C31534o oVar, float f, View view2, RectF rectF2, C31534o oVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, C31772a aVar, C31785f fVar, C31799f fVar2, boolean z3, C31794a aVar2) {
            this(pathMotion, view, rectF, oVar, f, view2, rectF2, oVar2, f2, i, i2, i3, i4, z, z2, aVar, fVar, fVar2, z3);
        }

        /* renamed from: d */
        public static float m128995d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m128996e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m128997m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public void draw(@C0359n0 Canvas canvas) {
            int i;
            if (this.f77564m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f77564m);
            }
            if (this.f77543D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f77572u && this.f77549J > 0.0f) {
                mo92264h(canvas);
            }
            this.f77565n.mo92194a(canvas);
            mo92269n(canvas, this.f77560i);
            if (this.f77546G.f77448c) {
                mo92268l(canvas);
                mo92267k(canvas);
            } else {
                mo92267k(canvas);
                mo92268l(canvas);
            }
            if (this.f77543D) {
                canvas.restoreToCount(i);
                mo92261f(canvas, this.f77574w, this.f77545F, -65281);
                mo92262g(canvas, this.f77575x, -256);
                mo92262g(canvas, this.f77574w, -16711936);
                mo92262g(canvas, this.f77577z, -16711681);
                mo92262g(canvas, this.f77576y, -16776961);
            }
        }

        /* renamed from: f */
        public final void mo92261f(Canvas canvas, RectF rectF, Path path, @C0354l int i) {
            PointF m = m128997m(rectF);
            if (this.f77551L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f77544E.setColor(i);
            canvas.drawPath(path, this.f77544E);
        }

        /* renamed from: g */
        public final void mo92262g(Canvas canvas, RectF rectF, @C0354l int i) {
            this.f77544E.setColor(i);
            canvas.drawRect(rectF, this.f77544E);
        }

        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void mo92264h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f77565n.mo92197d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                mo92266j(canvas);
            } else {
                mo92265i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void mo92265i(Canvas canvas) {
            C31525j jVar = this.f77573v;
            RectF rectF = this.f77548I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f77573v.mo90775n0(this.f77549J);
            this.f77573v.mo90713B0((int) this.f77550K);
            this.f77573v.setShapeAppearanceModel(this.f77565n.mo92196c());
            this.f77573v.draw(canvas);
        }

        /* renamed from: j */
        public final void mo92266j(Canvas canvas) {
            C31534o c = this.f77565n.mo92196c();
            if (c.mo90821u(this.f77548I)) {
                float a = c.mo90818r().mo90693a(this.f77548I);
                canvas.drawRoundRect(this.f77548I, a, a, this.f77563l);
                return;
            }
            canvas.drawPath(this.f77565n.mo92197d(), this.f77563l);
        }

        /* renamed from: k */
        public final void mo92267k(Canvas canvas) {
            mo92269n(canvas, this.f77562k);
            Rect bounds = getBounds();
            RectF rectF = this.f77576y;
            C31823v.m129131w(canvas, bounds, rectF.left, rectF.top, this.f77547H.f77469b, this.f77546G.f77447b, new C31803b());
        }

        /* renamed from: l */
        public final void mo92268l(Canvas canvas) {
            mo92269n(canvas, this.f77561j);
            Rect bounds = getBounds();
            RectF rectF = this.f77574w;
            C31823v.m129131w(canvas, bounds, rectF.left, rectF.top, this.f77547H.f77468a, this.f77546G.f77446a, new C31802a());
        }

        /* renamed from: n */
        public final void mo92269n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void mo92270o(float f) {
            if (this.f77551L != f) {
                mo92271p(f);
            }
        }

        /* renamed from: p */
        public final void mo92271p(float f) {
            float f2;
            float f3;
            float f4;
            RectF rectF;
            this.f77551L = f;
            Paint paint = this.f77564m;
            if (this.f77569r) {
                f2 = C31823v.m129119k(0.0f, 255.0f, f);
            } else {
                f2 = C31823v.m129119k(255.0f, 0.0f, f);
            }
            paint.setAlpha((int) f2);
            this.f77566o.getPosTan(this.f77567p * f, this.f77568q, (float[]) null);
            float[] fArr = this.f77568q;
            float f5 = fArr[0];
            float f6 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f4 = (f - 1.0f) / 0.00999999f;
                    f3 = 0.99f;
                } else {
                    f3 = 0.01f;
                    f4 = (f / 0.01f) * -1.0f;
                }
                this.f77566o.getPosTan(this.f77567p * f3, fArr, (float[]) null);
                float[] fArr2 = this.f77568q;
                f5 += (f5 - fArr2[0]) * f4;
                f6 += (f6 - fArr2[1]) * f4;
            }
            float f7 = f5;
            float f8 = f6;
            float floatValue = ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77533b.f77530a))).floatValue();
            float floatValue2 = ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77533b.f77531b))).floatValue();
            C31789h a = this.f77542C.mo92189a(f, floatValue, floatValue2, this.f77553b.width(), this.f77553b.height(), this.f77557f.width(), this.f77557f.height());
            this.f77547H = a;
            RectF rectF2 = this.f77574w;
            float f9 = a.f77470c;
            rectF2.set(f7 - (f9 / 2.0f), f8, (f9 / 2.0f) + f7, a.f77471d + f8);
            RectF rectF3 = this.f77576y;
            C31789h hVar = this.f77547H;
            float f10 = hVar.f77472e;
            rectF3.set(f7 - (f10 / 2.0f), f8, f7 + (f10 / 2.0f), hVar.f77473f + f8);
            this.f77575x.set(this.f77574w);
            this.f77577z.set(this.f77576y);
            float floatValue3 = ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77534c.f77530a))).floatValue();
            float floatValue4 = ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77534c.f77531b))).floatValue();
            boolean b = this.f77542C.mo92190b(this.f77547H);
            if (b) {
                rectF = this.f77575x;
            } else {
                rectF = this.f77577z;
            }
            float l = C31823v.m129120l(0.0f, 1.0f, floatValue3, floatValue4, f);
            if (!b) {
                l = 1.0f - l;
            }
            this.f77542C.mo92191c(rectF, l, this.f77547H);
            this.f77548I = new RectF(Math.min(this.f77575x.left, this.f77577z.left), Math.min(this.f77575x.top, this.f77577z.top), Math.max(this.f77575x.right, this.f77577z.right), Math.max(this.f77575x.bottom, this.f77577z.bottom));
            this.f77565n.mo92195b(f, this.f77554c, this.f77558g, this.f77574w, this.f77575x, this.f77577z, this.f77540A.f77535d);
            this.f77549J = C31823v.m129119k(this.f77555d, this.f77559h, f);
            float d = m128995d(this.f77548I, this.f77570s);
            float e = m128996e(this.f77548I, this.f77571t);
            float f11 = this.f77549J;
            float f12 = (float) ((int) (e * f11));
            this.f77550K = f12;
            this.f77563l.setShadowLayer(f11, (float) ((int) (d * f11)), f12, 754974720);
            this.f77546G = this.f77541B.mo92178a(f, ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77532a.f77530a))).floatValue(), ((Float) C18001r.m81775l(Float.valueOf(this.f77540A.f77532a.f77531b))).floatValue(), 0.35f);
            if (this.f77561j.getColor() != 0) {
                this.f77561j.setAlpha(this.f77546G.f77446a);
            }
            if (this.f77562k.getColor() != 0) {
                this.f77562k.setAlpha(this.f77546G.f77447b);
            }
            invalidateSelf();
        }

        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public C31801h(PathMotion pathMotion, View view, RectF rectF, C31534o oVar, float f, View view2, RectF rectF2, C31534o oVar2, float f2, @C0354l int i, @C0354l int i2, @C0354l int i3, int i4, boolean z, boolean z2, C31772a aVar, C31785f fVar, C31799f fVar2, boolean z3) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f77560i = paint;
            Paint paint2 = new Paint();
            this.f77561j = paint2;
            Paint paint3 = new Paint();
            this.f77562k = paint3;
            this.f77563l = new Paint();
            Paint paint4 = new Paint();
            this.f77564m = paint4;
            this.f77565n = new C31791j();
            float[] fArr = new float[2];
            this.f77568q = fArr;
            C31525j jVar = new C31525j();
            this.f77573v = jVar;
            Paint paint5 = new Paint();
            this.f77544E = paint5;
            this.f77545F = new Path();
            this.f77552a = view;
            this.f77553b = rectF3;
            this.f77554c = oVar;
            this.f77555d = f;
            this.f77556e = view2;
            this.f77557f = rectF2;
            this.f77558g = oVar2;
            this.f77559h = f2;
            this.f77569r = z;
            this.f77572u = z2;
            this.f77541B = aVar;
            this.f77542C = fVar;
            this.f77540A = fVar2;
            this.f77543D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f77570s = (float) displayMetrics.widthPixels;
            this.f77571t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            jVar.mo90777o0(ColorStateList.valueOf(0));
            jVar.mo90796x0(2);
            jVar.mo90790u0(false);
            jVar.mo90792v0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f77574w = rectF4;
            this.f77575x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f77576y = rectF5;
            this.f77577z = new RectF(rectF5);
            PointF m = m128997m(rectF);
            PointF m2 = m128997m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.f77566o = pathMeasure;
            this.f77567p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C31823v.m129111c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            mo92271p(0.0f);
        }
    }

    public C31793l() {
        boolean z = false;
        this.f77505L0 = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f77506M0 = -1.0f;
        this.f77507N0 = -1.0f;
    }

    /* renamed from: C */
    public static C31534o m128926C(@C0359n0 View view, @C0363p0 C31534o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i = C31076a.C31084h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof C31534o) {
            return (C31534o) view.getTag(i);
        }
        Context context = view.getContext();
        int L = m128927L(context);
        if (L != -1) {
            return C31534o.m127562b(context, L, 0).mo90843m();
        }
        if (view instanceof C31553s) {
            return ((C31553s) view).getShapeAppearanceModel();
        }
        return C31534o.m127561a().mo90843m();
    }

    @C0327c1
    /* renamed from: L */
    public static int m128927L(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C31076a.C31079c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: e */
    public static RectF m128929e(View view, @C0363p0 View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = C31823v.m129115g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: f */
    public static C31534o m128930f(@C0359n0 View view, @C0359n0 RectF rectF, @C0363p0 C31534o oVar) {
        return C31823v.m129110b(m128926C(view, oVar), rectF);
    }

    /* renamed from: h */
    public static void m128931h(@C0359n0 TransitionValues transitionValues, @C0363p0 View view, @C0329d0 int i, @C0363p0 C31534o oVar) {
        RectF rectF;
        if (i != -1) {
            transitionValues.view = C31823v.m129114f(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i2 = C31076a.C31084h.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                transitionValues.view.setTag(i2, (Object) null);
                transitionValues.view = (View) transitionValues.view.getTag(i2);
            }
        }
        View view3 = transitionValues.view;
        if (C18196h2.m82539U0(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                rectF = C31823v.m129116h(view3);
            } else {
                rectF = C31823v.m129115g(view3);
            }
            transitionValues.values.put("materialContainerTransition:bounds", rectF);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m128930f(view3, rectF, oVar));
        }
    }

    /* renamed from: k */
    public static float m128932k(float f, View view) {
        return f != -1.0f ? f : C18196h2.m82529R(view);
    }

    @C0363p0
    /* renamed from: A */
    public C31798e mo92199A() {
        return this.f77502I0;
    }

    @C0354l
    /* renamed from: B */
    public int mo92200B() {
        return this.f77521y;
    }

    @C0363p0
    /* renamed from: D */
    public C31798e mo92201D() {
        return this.f77504K0;
    }

    @C0354l
    /* renamed from: E */
    public int mo92202E() {
        return this.f77519w;
    }

    /* renamed from: F */
    public float mo92203F() {
        return this.f77506M0;
    }

    @C0363p0
    /* renamed from: G */
    public C31534o mo92204G() {
        return this.f77499F0;
    }

    @C0363p0
    /* renamed from: H */
    public View mo92205H() {
        return this.f77510Z;
    }

    @C0329d0
    /* renamed from: I */
    public int mo92206I() {
        return this.f77516f;
    }

    /* renamed from: J */
    public final C31799f mo92207J(boolean z, C31799f fVar, C31799f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new C31799f((C31798e) C31823v.m129112d(this.f77501H0, fVar.f77532a), (C31798e) C31823v.m129112d(this.f77502I0, fVar.f77533b), (C31798e) C31823v.m129112d(this.f77503J0, fVar.f77534c), (C31798e) C31823v.m129112d(this.f77504K0, fVar.f77535d), (C31794a) null);
    }

    /* renamed from: K */
    public int mo92208K() {
        return this.f77522z;
    }

    /* renamed from: N */
    public boolean mo92209N() {
        return this.f77511a;
    }

    /* renamed from: O */
    public boolean mo92210O() {
        return this.f77505L0;
    }

    /* renamed from: P */
    public final boolean mo92211P(@C0359n0 RectF rectF, @C0359n0 RectF rectF2) {
        int i = this.f77522z;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f77522z);
        } else if (C31823v.m129109a(rectF2) > C31823v.m129109a(rectF)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: R */
    public boolean mo92212R() {
        return this.f77512b;
    }

    /* renamed from: S */
    public final void mo92213S(Context context, boolean z) {
        int i;
        C31823v.m129126r(this, context, C31076a.C31079c.motionEasingStandard, C31093a.f74426b);
        if (z) {
            i = C31076a.C31079c.motionDurationLong1;
        } else {
            i = C31076a.C31079c.motionDurationMedium2;
        }
        C31823v.m129125q(this, context, i);
        if (!this.f77513c) {
            C31823v.m129127s(this, context, C31076a.C31079c.motionPath);
        }
    }

    /* renamed from: T */
    public void mo92214T(@C0354l int i) {
        this.f77518v = i;
        this.f77519w = i;
        this.f77520x = i;
    }

    /* renamed from: U */
    public void mo92215U(@C0354l int i) {
        this.f77518v = i;
    }

    /* renamed from: V */
    public void mo92216V(boolean z) {
        this.f77511a = z;
    }

    /* renamed from: Y */
    public void mo92217Y(@C0329d0 int i) {
        this.f77515e = i;
    }

    /* renamed from: Z */
    public void mo92218Z(boolean z) {
        this.f77505L0 = z;
    }

    /* renamed from: a0 */
    public void mo92219a0(@C0354l int i) {
        this.f77520x = i;
    }

    /* renamed from: b0 */
    public void mo92220b0(float f) {
        this.f77507N0 = f;
    }

    /* renamed from: c */
    public final C31799f mo92221c(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof C31792k)) {
            return mo92207J(z, f77495e1, f77496f1);
        }
        return mo92207J(z, f77493c1, f77494d1);
    }

    /* renamed from: c0 */
    public void mo92222c0(@C0363p0 C31534o oVar) {
        this.f77500G0 = oVar;
    }

    public void captureEndValues(@C0359n0 TransitionValues transitionValues) {
        m128931h(transitionValues, this.f77498E0, this.f77517g, this.f77500G0);
    }

    public void captureStartValues(@C0359n0 TransitionValues transitionValues) {
        m128931h(transitionValues, this.f77510Z, this.f77516f, this.f77499F0);
    }

    @C0363p0
    public Animator createAnimator(@C0359n0 ViewGroup viewGroup, @C0363p0 TransitionValues transitionValues, @C0363p0 TransitionValues transitionValues2) {
        View view;
        View view2;
        View view3;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (!(transitionValues3 == null || transitionValues4 == null)) {
            RectF rectF = (RectF) transitionValues3.values.get("materialContainerTransition:bounds");
            C31534o oVar = (C31534o) transitionValues3.values.get("materialContainerTransition:shapeAppearance");
            if (!(rectF == null || oVar == null)) {
                RectF rectF2 = (RectF) transitionValues4.values.get("materialContainerTransition:bounds");
                C31534o oVar2 = (C31534o) transitionValues4.values.get("materialContainerTransition:shapeAppearance");
                if (!(rectF2 == null || oVar2 == null)) {
                    View view4 = transitionValues3.view;
                    View view5 = transitionValues4.view;
                    if (view5.getParent() != null) {
                        view = view5;
                    } else {
                        view = view4;
                    }
                    if (this.f77515e == view.getId()) {
                        view2 = (View) view.getParent();
                        view3 = view;
                    } else {
                        view2 = C31823v.m129113e(view, this.f77515e);
                        view3 = null;
                    }
                    RectF g = C31823v.m129115g(view2);
                    float f = -g.left;
                    float f2 = -g.top;
                    RectF e = m128929e(view2, view3, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean P = mo92211P(rectF, rectF2);
                    if (!this.f77514d) {
                        mo92213S(view.getContext(), P);
                    }
                    C31801h hVar = new C31801h(getPathMotion(), view4, rectF, oVar, m128932k(this.f77506M0, view4), view5, rectF2, oVar2, m128932k(this.f77507N0, view5), this.f77518v, this.f77519w, this.f77520x, this.f77521y, P, this.f77505L0, C31773b.m128893a(this.f77508X, P), C31786g.m128913a(this.f77509Y, P, rectF, rectF2), mo92221c(P), this.f77511a, (C31794a) null);
                    hVar.setBounds(Math.round(e.left), Math.round(e.top), Math.round(e.right), Math.round(e.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new C31794a(hVar));
                    addListener(new C31795b(view2, hVar, view4, view5));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    /* renamed from: d0 */
    public void mo92226d0(@C0363p0 View view) {
        this.f77498E0 = view;
    }

    /* renamed from: g0 */
    public void mo92227g0(@C0329d0 int i) {
        this.f77517g = i;
    }

    @C0363p0
    public String[] getTransitionProperties() {
        return f77492b1;
    }

    /* renamed from: h0 */
    public void mo92229h0(int i) {
        this.f77508X = i;
    }

    @C0354l
    /* renamed from: i */
    public int mo92230i() {
        return this.f77518v;
    }

    /* renamed from: i0 */
    public void mo92231i0(@C0363p0 C31798e eVar) {
        this.f77501H0 = eVar;
    }

    @C0329d0
    /* renamed from: j */
    public int mo92232j() {
        return this.f77515e;
    }

    /* renamed from: j0 */
    public void mo92233j0(int i) {
        this.f77509Y = i;
    }

    /* renamed from: k0 */
    public void mo92234k0(boolean z) {
        this.f77512b = z;
    }

    @C0354l
    /* renamed from: l */
    public int mo92235l() {
        return this.f77520x;
    }

    /* renamed from: l0 */
    public void mo92236l0(@C0363p0 C31798e eVar) {
        this.f77503J0 = eVar;
    }

    /* renamed from: m */
    public float mo92237m() {
        return this.f77507N0;
    }

    /* renamed from: m0 */
    public void mo92238m0(@C0363p0 C31798e eVar) {
        this.f77502I0 = eVar;
    }

    @C0363p0
    /* renamed from: n */
    public C31534o mo92239n() {
        return this.f77500G0;
    }

    @C0363p0
    /* renamed from: o */
    public View mo92240o() {
        return this.f77498E0;
    }

    /* renamed from: o0 */
    public void mo92241o0(@C0354l int i) {
        this.f77521y = i;
    }

    /* renamed from: q0 */
    public void mo92242q0(@C0363p0 C31798e eVar) {
        this.f77504K0 = eVar;
    }

    /* renamed from: r0 */
    public void mo92243r0(@C0354l int i) {
        this.f77519w = i;
    }

    @C0329d0
    /* renamed from: s */
    public int mo92244s() {
        return this.f77517g;
    }

    /* renamed from: s0 */
    public void mo92245s0(float f) {
        this.f77506M0 = f;
    }

    public void setPathMotion(@C0363p0 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f77513c = true;
    }

    /* renamed from: t */
    public int mo92247t() {
        return this.f77508X;
    }

    @C0363p0
    /* renamed from: u */
    public C31798e mo92248u() {
        return this.f77501H0;
    }

    /* renamed from: u0 */
    public void mo92249u0(@C0363p0 C31534o oVar) {
        this.f77499F0 = oVar;
    }

    /* renamed from: v */
    public int mo92250v() {
        return this.f77509Y;
    }

    /* renamed from: v0 */
    public void mo92251v0(@C0363p0 View view) {
        this.f77510Z = view;
    }

    /* renamed from: w0 */
    public void mo92252w0(@C0329d0 int i) {
        this.f77516f = i;
    }

    @C0363p0
    /* renamed from: x */
    public C31798e mo92253x() {
        return this.f77503J0;
    }

    /* renamed from: x0 */
    public void mo92254x0(int i) {
        this.f77522z = i;
    }

    public C31793l(@C0359n0 Context context, boolean z) {
        boolean z2 = false;
        this.f77505L0 = Build.VERSION.SDK_INT >= 28 ? true : z2;
        this.f77506M0 = -1.0f;
        this.f77507N0 = -1.0f;
        mo92213S(context, z);
        this.f77514d = true;
    }
}
