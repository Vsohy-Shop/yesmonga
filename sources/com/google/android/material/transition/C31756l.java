package com.google.android.material.transition;

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
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import androidx.transition.C20537b;
import androidx.transition.C20606h0;
import androidx.transition.C20657p0;
import androidx.transition.C20684x;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.internal.C31432x;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import com.google.android.material.transition.C31837u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.transition.l */
public final class C31756l extends C20606h0 {

    /* renamed from: J1 */
    public static final int f77324J1 = 0;

    /* renamed from: K1 */
    public static final int f77325K1 = 1;

    /* renamed from: L1 */
    public static final int f77326L1 = 2;

    /* renamed from: M1 */
    public static final int f77327M1 = 0;

    /* renamed from: N1 */
    public static final int f77328N1 = 1;

    /* renamed from: O1 */
    public static final int f77329O1 = 2;

    /* renamed from: P1 */
    public static final int f77330P1 = 3;

    /* renamed from: Q1 */
    public static final int f77331Q1 = 0;

    /* renamed from: R1 */
    public static final int f77332R1 = 1;

    /* renamed from: S1 */
    public static final int f77333S1 = 2;

    /* renamed from: T1 */
    public static final String f77334T1 = "l";

    /* renamed from: U1 */
    public static final String f77335U1 = "materialContainerTransition:bounds";

    /* renamed from: V1 */
    public static final String f77336V1 = "materialContainerTransition:shapeAppearance";

    /* renamed from: W1 */
    public static final String[] f77337W1 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: X1 */
    public static final C31762f f77338X1 = new C31762f(new C31761e(0.0f, 0.25f), new C31761e(0.0f, 1.0f), new C31761e(0.0f, 1.0f), new C31761e(0.0f, 0.75f), (C31757a) null);

    /* renamed from: Y1 */
    public static final C31762f f77339Y1 = new C31762f(new C31761e(0.6f, 0.9f), new C31761e(0.0f, 1.0f), new C31761e(0.0f, 0.9f), new C31761e(0.3f, 0.9f), (C31757a) null);

    /* renamed from: Z1 */
    public static final C31762f f77340Z1 = new C31762f(new C31761e(0.1f, 0.4f), new C31761e(0.1f, 1.0f), new C31761e(0.1f, 1.0f), new C31761e(0.1f, 0.9f), (C31757a) null);

    /* renamed from: a2 */
    public static final C31762f f77341a2 = new C31762f(new C31761e(0.6f, 0.9f), new C31761e(0.0f, 0.9f), new C31761e(0.0f, 0.9f), new C31761e(0.2f, 0.9f), (C31757a) null);

    /* renamed from: b2 */
    public static final float f77342b2 = -1.0f;
    @C0363p0

    /* renamed from: A1 */
    public C31534o f77343A1;
    @C0363p0

    /* renamed from: B1 */
    public C31534o f77344B1;
    @C0363p0

    /* renamed from: C1 */
    public C31761e f77345C1;
    @C0363p0

    /* renamed from: D1 */
    public C31761e f77346D1;
    @C0363p0

    /* renamed from: E1 */
    public C31761e f77347E1;
    @C0363p0

    /* renamed from: F1 */
    public C31761e f77348F1;

    /* renamed from: G1 */
    public boolean f77349G1;

    /* renamed from: H1 */
    public float f77350H1;

    /* renamed from: I1 */
    public float f77351I1;

    /* renamed from: k1 */
    public boolean f77352k1 = false;

    /* renamed from: l1 */
    public boolean f77353l1 = false;

    /* renamed from: m1 */
    public boolean f77354m1 = false;

    /* renamed from: n1 */
    public boolean f77355n1 = false;
    @C0329d0

    /* renamed from: o1 */
    public int f77356o1 = 16908290;
    @C0329d0

    /* renamed from: p1 */
    public int f77357p1 = -1;
    @C0329d0

    /* renamed from: q1 */
    public int f77358q1 = -1;
    @C0354l

    /* renamed from: r1 */
    public int f77359r1 = 0;
    @C0354l

    /* renamed from: s1 */
    public int f77360s1 = 0;
    @C0354l

    /* renamed from: t1 */
    public int f77361t1 = 0;
    @C0354l

    /* renamed from: u1 */
    public int f77362u1 = 1375731712;

    /* renamed from: v1 */
    public int f77363v1 = 0;

    /* renamed from: w1 */
    public int f77364w1 = 0;

    /* renamed from: x1 */
    public int f77365x1 = 0;
    @C0363p0

    /* renamed from: y1 */
    public View f77366y1;
    @C0363p0

    /* renamed from: z1 */
    public View f77367z1;

    /* renamed from: com.google.android.material.transition.l$a */
    public class C31757a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C31764h f77368a;

        public C31757a(C31764h hVar) {
            this.f77368a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77368a.mo92161o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.l$b */
    public class C31758b extends C31836t {

        /* renamed from: a */
        public final /* synthetic */ View f77370a;

        /* renamed from: b */
        public final /* synthetic */ C31764h f77371b;

        /* renamed from: c */
        public final /* synthetic */ View f77372c;

        /* renamed from: d */
        public final /* synthetic */ View f77373d;

        public C31758b(View view, C31764h hVar, View view2, View view3) {
            this.f77370a = view;
            this.f77371b = hVar;
            this.f77372c = view2;
            this.f77373d = view3;
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
            C31432x.m127014i(this.f77370a).mo90180a(this.f77371b);
            this.f77372c.setAlpha(0.0f);
            this.f77373d.setAlpha(0.0f);
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            C31756l.this.mo61767z0(this);
            if (!C31756l.this.f77353l1) {
                this.f77372c.setAlpha(1.0f);
                this.f77373d.setAlpha(1.0f);
                C31432x.m127014i(this.f77370a).mo90181b(this.f77371b);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.l$c */
    public @interface C31759c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.l$d */
    public @interface C31760d {
    }

    /* renamed from: com.google.android.material.transition.l$e */
    public static class C31761e {
        @C0379x(from = 0.0d, mo1016to = 1.0d)

        /* renamed from: a */
        public final float f77375a;
        @C0379x(from = 0.0d, mo1016to = 1.0d)

        /* renamed from: b */
        public final float f77376b;

        public C31761e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
            this.f77375a = f;
            this.f77376b = f2;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: c */
        public float mo92149c() {
            return this.f77376b;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: d */
        public float mo92150d() {
            return this.f77375a;
        }
    }

    /* renamed from: com.google.android.material.transition.l$f */
    public static class C31762f {
        @C0359n0

        /* renamed from: a */
        public final C31761e f77377a;
        @C0359n0

        /* renamed from: b */
        public final C31761e f77378b;
        @C0359n0

        /* renamed from: c */
        public final C31761e f77379c;
        @C0359n0

        /* renamed from: d */
        public final C31761e f77380d;

        public /* synthetic */ C31762f(C31761e eVar, C31761e eVar2, C31761e eVar3, C31761e eVar4, C31757a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        public C31762f(@C0359n0 C31761e eVar, @C0359n0 C31761e eVar2, @C0359n0 C31761e eVar3, @C0359n0 C31761e eVar4) {
            this.f77377a = eVar;
            this.f77378b = eVar2;
            this.f77379c = eVar3;
            this.f77380d = eVar4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.l$g */
    public @interface C31763g {
    }

    /* renamed from: com.google.android.material.transition.l$h */
    public static final class C31764h extends Drawable {

        /* renamed from: M */
        public static final int f77381M = 754974720;

        /* renamed from: N */
        public static final int f77382N = -7829368;

        /* renamed from: O */
        public static final float f77383O = 0.3f;

        /* renamed from: P */
        public static final float f77384P = 1.5f;

        /* renamed from: A */
        public final C31762f f77385A;

        /* renamed from: B */
        public final C31735a f77386B;

        /* renamed from: C */
        public final C31748f f77387C;

        /* renamed from: D */
        public final boolean f77388D;

        /* renamed from: E */
        public final Paint f77389E;

        /* renamed from: F */
        public final Path f77390F;

        /* renamed from: G */
        public C31741c f77391G;

        /* renamed from: H */
        public C31752h f77392H;

        /* renamed from: I */
        public RectF f77393I;

        /* renamed from: J */
        public float f77394J;

        /* renamed from: K */
        public float f77395K;

        /* renamed from: L */
        public float f77396L;

        /* renamed from: a */
        public final View f77397a;

        /* renamed from: b */
        public final RectF f77398b;

        /* renamed from: c */
        public final C31534o f77399c;

        /* renamed from: d */
        public final float f77400d;

        /* renamed from: e */
        public final View f77401e;

        /* renamed from: f */
        public final RectF f77402f;

        /* renamed from: g */
        public final C31534o f77403g;

        /* renamed from: h */
        public final float f77404h;

        /* renamed from: i */
        public final Paint f77405i;

        /* renamed from: j */
        public final Paint f77406j;

        /* renamed from: k */
        public final Paint f77407k;

        /* renamed from: l */
        public final Paint f77408l;

        /* renamed from: m */
        public final Paint f77409m;

        /* renamed from: n */
        public final C31754j f77410n;

        /* renamed from: o */
        public final PathMeasure f77411o;

        /* renamed from: p */
        public final float f77412p;

        /* renamed from: q */
        public final float[] f77413q;

        /* renamed from: r */
        public final boolean f77414r;

        /* renamed from: s */
        public final float f77415s;

        /* renamed from: t */
        public final float f77416t;

        /* renamed from: u */
        public final boolean f77417u;

        /* renamed from: v */
        public final C31525j f77418v;

        /* renamed from: w */
        public final RectF f77419w;

        /* renamed from: x */
        public final RectF f77420x;

        /* renamed from: y */
        public final RectF f77421y;

        /* renamed from: z */
        public final RectF f77422z;

        /* renamed from: com.google.android.material.transition.l$h$a */
        public class C31765a implements C31837u.C31840c {
            public C31765a() {
            }

            /* renamed from: a */
            public void mo92165a(Canvas canvas) {
                C31764h.this.f77397a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.l$h$b */
        public class C31766b implements C31837u.C31840c {
            public C31766b() {
            }

            /* renamed from: a */
            public void mo92165a(Canvas canvas) {
                C31764h.this.f77401e.draw(canvas);
            }
        }

        public /* synthetic */ C31764h(C20684x xVar, View view, RectF rectF, C31534o oVar, float f, View view2, RectF rectF2, C31534o oVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, C31735a aVar, C31748f fVar, C31762f fVar2, boolean z3, C31757a aVar2) {
            this(xVar, view, rectF, oVar, f, view2, rectF2, oVar2, f2, i, i2, i3, i4, z, z2, aVar, fVar, fVar2, z3);
        }

        /* renamed from: d */
        public static float m128827d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m128828e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m128829m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public void draw(@C0359n0 Canvas canvas) {
            int i;
            if (this.f77409m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f77409m);
            }
            if (this.f77388D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f77417u && this.f77394J > 0.0f) {
                mo92155h(canvas);
            }
            this.f77410n.mo92093a(canvas);
            mo92160n(canvas, this.f77405i);
            if (this.f77391G.f77293c) {
                mo92159l(canvas);
                mo92158k(canvas);
            } else {
                mo92158k(canvas);
                mo92159l(canvas);
            }
            if (this.f77388D) {
                canvas.restoreToCount(i);
                mo92152f(canvas, this.f77419w, this.f77390F, -65281);
                mo92153g(canvas, this.f77420x, -256);
                mo92153g(canvas, this.f77419w, -16711936);
                mo92153g(canvas, this.f77422z, -16711681);
                mo92153g(canvas, this.f77421y, -16776961);
            }
        }

        /* renamed from: f */
        public final void mo92152f(Canvas canvas, RectF rectF, Path path, @C0354l int i) {
            PointF m = m128829m(rectF);
            if (this.f77396L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f77389E.setColor(i);
            canvas.drawPath(path, this.f77389E);
        }

        /* renamed from: g */
        public final void mo92153g(Canvas canvas, RectF rectF, @C0354l int i) {
            this.f77389E.setColor(i);
            canvas.drawRect(rectF, this.f77389E);
        }

        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void mo92155h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f77410n.mo92096d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                mo92157j(canvas);
            } else {
                mo92156i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void mo92156i(Canvas canvas) {
            C31525j jVar = this.f77418v;
            RectF rectF = this.f77393I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f77418v.mo90775n0(this.f77394J);
            this.f77418v.mo90713B0((int) this.f77395K);
            this.f77418v.setShapeAppearanceModel(this.f77410n.mo92095c());
            this.f77418v.draw(canvas);
        }

        /* renamed from: j */
        public final void mo92157j(Canvas canvas) {
            C31534o c = this.f77410n.mo92095c();
            if (c.mo90821u(this.f77393I)) {
                float a = c.mo90818r().mo90693a(this.f77393I);
                canvas.drawRoundRect(this.f77393I, a, a, this.f77408l);
                return;
            }
            canvas.drawPath(this.f77410n.mo92096d(), this.f77408l);
        }

        /* renamed from: k */
        public final void mo92158k(Canvas canvas) {
            mo92160n(canvas, this.f77407k);
            Rect bounds = getBounds();
            RectF rectF = this.f77421y;
            C31837u.m129207w(canvas, bounds, rectF.left, rectF.top, this.f77392H.f77314b, this.f77391G.f77292b, new C31766b());
        }

        /* renamed from: l */
        public final void mo92159l(Canvas canvas) {
            mo92160n(canvas, this.f77406j);
            Rect bounds = getBounds();
            RectF rectF = this.f77419w;
            C31837u.m129207w(canvas, bounds, rectF.left, rectF.top, this.f77392H.f77313a, this.f77391G.f77291a, new C31765a());
        }

        /* renamed from: n */
        public final void mo92160n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void mo92161o(float f) {
            if (this.f77396L != f) {
                mo92162p(f);
            }
        }

        /* renamed from: p */
        public final void mo92162p(float f) {
            float f2;
            float f3;
            float f4;
            RectF rectF;
            this.f77396L = f;
            Paint paint = this.f77409m;
            if (this.f77414r) {
                f2 = C31837u.m129195k(0.0f, 255.0f, f);
            } else {
                f2 = C31837u.m129195k(255.0f, 0.0f, f);
            }
            paint.setAlpha((int) f2);
            this.f77411o.getPosTan(this.f77412p * f, this.f77413q, (float[]) null);
            float[] fArr = this.f77413q;
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
                this.f77411o.getPosTan(this.f77412p * f3, fArr, (float[]) null);
                float[] fArr2 = this.f77413q;
                f5 += (f5 - fArr2[0]) * f4;
                f6 += (f6 - fArr2[1]) * f4;
            }
            float f7 = f5;
            float f8 = f6;
            float floatValue = ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77378b.f77375a))).floatValue();
            float floatValue2 = ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77378b.f77376b))).floatValue();
            C31752h a = this.f77387C.mo92090a(f, floatValue, floatValue2, this.f77398b.width(), this.f77398b.height(), this.f77402f.width(), this.f77402f.height());
            this.f77392H = a;
            RectF rectF2 = this.f77419w;
            float f9 = a.f77315c;
            rectF2.set(f7 - (f9 / 2.0f), f8, (f9 / 2.0f) + f7, a.f77316d + f8);
            RectF rectF3 = this.f77421y;
            C31752h hVar = this.f77392H;
            float f10 = hVar.f77317e;
            rectF3.set(f7 - (f10 / 2.0f), f8, f7 + (f10 / 2.0f), hVar.f77318f + f8);
            this.f77420x.set(this.f77419w);
            this.f77422z.set(this.f77421y);
            float floatValue3 = ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77379c.f77375a))).floatValue();
            float floatValue4 = ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77379c.f77376b))).floatValue();
            boolean b = this.f77387C.mo92091b(this.f77392H);
            if (b) {
                rectF = this.f77420x;
            } else {
                rectF = this.f77422z;
            }
            float l = C31837u.m129196l(0.0f, 1.0f, floatValue3, floatValue4, f);
            if (!b) {
                l = 1.0f - l;
            }
            this.f77387C.mo92092c(rectF, l, this.f77392H);
            this.f77393I = new RectF(Math.min(this.f77420x.left, this.f77422z.left), Math.min(this.f77420x.top, this.f77422z.top), Math.max(this.f77420x.right, this.f77422z.right), Math.max(this.f77420x.bottom, this.f77422z.bottom));
            this.f77410n.mo92094b(f, this.f77399c, this.f77403g, this.f77419w, this.f77420x, this.f77422z, this.f77385A.f77380d);
            this.f77394J = C31837u.m129195k(this.f77400d, this.f77404h, f);
            float d = m128827d(this.f77393I, this.f77415s);
            float e = m128828e(this.f77393I, this.f77416t);
            float f11 = this.f77394J;
            float f12 = (float) ((int) (e * f11));
            this.f77395K = f12;
            this.f77408l.setShadowLayer(f11, (float) ((int) (d * f11)), f12, 754974720);
            this.f77391G = this.f77386B.mo92079a(f, ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77377a.f77375a))).floatValue(), ((Float) C18001r.m81775l(Float.valueOf(this.f77385A.f77377a.f77376b))).floatValue(), 0.35f);
            if (this.f77406j.getColor() != 0) {
                this.f77406j.setAlpha(this.f77391G.f77291a);
            }
            if (this.f77407k.getColor() != 0) {
                this.f77407k.setAlpha(this.f77391G.f77292b);
            }
            invalidateSelf();
        }

        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public C31764h(C20684x xVar, View view, RectF rectF, C31534o oVar, float f, View view2, RectF rectF2, C31534o oVar2, float f2, @C0354l int i, @C0354l int i2, @C0354l int i3, int i4, boolean z, boolean z2, C31735a aVar, C31748f fVar, C31762f fVar2, boolean z3) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f77405i = paint;
            Paint paint2 = new Paint();
            this.f77406j = paint2;
            Paint paint3 = new Paint();
            this.f77407k = paint3;
            this.f77408l = new Paint();
            Paint paint4 = new Paint();
            this.f77409m = paint4;
            this.f77410n = new C31754j();
            float[] fArr = new float[2];
            this.f77413q = fArr;
            C31525j jVar = new C31525j();
            this.f77418v = jVar;
            Paint paint5 = new Paint();
            this.f77389E = paint5;
            this.f77390F = new Path();
            this.f77397a = view;
            this.f77398b = rectF3;
            this.f77399c = oVar;
            this.f77400d = f;
            this.f77401e = view2;
            this.f77402f = rectF2;
            this.f77403g = oVar2;
            this.f77404h = f2;
            this.f77414r = z;
            this.f77417u = z2;
            this.f77386B = aVar;
            this.f77387C = fVar;
            this.f77385A = fVar2;
            this.f77388D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f77415s = (float) displayMetrics.widthPixels;
            this.f77416t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            jVar.mo90777o0(ColorStateList.valueOf(0));
            jVar.mo90796x0(2);
            jVar.mo90790u0(false);
            jVar.mo90792v0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f77419w = rectF4;
            this.f77420x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f77421y = rectF5;
            this.f77422z = new RectF(rectF5);
            PointF m = m128829m(rectF);
            PointF m2 = m128829m(rectF2);
            C20684x xVar2 = xVar;
            PathMeasure pathMeasure = new PathMeasure(xVar.mo61606a(m.x, m.y, m2.x, m2.y), false);
            this.f77411o = pathMeasure;
            this.f77412p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C31837u.m129187c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            mo92162p(0.0f);
        }
    }

    public C31756l() {
        boolean z = false;
        this.f77349G1 = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f77350H1 = -1.0f;
        this.f77351I1 = -1.0f;
    }

    /* renamed from: X0 */
    public static RectF m128752X0(View view, @C0363p0 View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = C31837u.m129191g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: Y0 */
    public static C31534o m128753Y0(@C0359n0 View view, @C0359n0 RectF rectF, @C0363p0 C31534o oVar) {
        return C31837u.m129186b(m128756q1(view, oVar), rectF);
    }

    /* renamed from: Z0 */
    public static void m128754Z0(@C0359n0 C20657p0 p0Var, @C0363p0 View view, @C0329d0 int i, @C0363p0 C31534o oVar) {
        RectF rectF;
        if (i != -1) {
            p0Var.f53280b = C31837u.m129190f(p0Var.f53280b, i);
        } else if (view != null) {
            p0Var.f53280b = view;
        } else {
            View view2 = p0Var.f53280b;
            int i2 = C31076a.C31084h.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                p0Var.f53280b.setTag(i2, (Object) null);
                p0Var.f53280b = (View) p0Var.f53280b.getTag(i2);
            }
        }
        View view3 = p0Var.f53280b;
        if (C18196h2.m82539U0(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                rectF = C31837u.m129192h(view3);
            } else {
                rectF = C31837u.m129191g(view3);
            }
            p0Var.f53279a.put("materialContainerTransition:bounds", rectF);
            p0Var.f53279a.put("materialContainerTransition:shapeAppearance", m128753Y0(view3, rectF, oVar));
        }
    }

    /* renamed from: c1 */
    public static float m128755c1(float f, View view) {
        return f != -1.0f ? f : C18196h2.m82529R(view);
    }

    /* renamed from: q1 */
    public static C31534o m128756q1(@C0359n0 View view, @C0363p0 C31534o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i = C31076a.C31084h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof C31534o) {
            return (C31534o) view.getTag(i);
        }
        Context context = view.getContext();
        int z1 = m128757z1(context);
        if (z1 != -1) {
            return C31534o.m127562b(context, z1, 0).mo90843m();
        }
        if (view instanceof C31553s) {
            return ((C31553s) view).getShapeAppearanceModel();
        }
        return C31534o.m127561a().mo90843m();
    }

    @C0327c1
    /* renamed from: z1 */
    public static int m128757z1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C31076a.C31079c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: B1 */
    public boolean mo92097B1() {
        return this.f77352k1;
    }

    /* renamed from: C1 */
    public boolean mo92098C1() {
        return this.f77349G1;
    }

    /* renamed from: D1 */
    public final boolean mo92099D1(@C0359n0 RectF rectF, @C0359n0 RectF rectF2) {
        int i = this.f77363v1;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f77363v1);
        } else if (C31837u.m129185a(rectF2) > C31837u.m129185a(rectF)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo92100E1() {
        return this.f77353l1;
    }

    /* renamed from: F1 */
    public final void mo92101F1(Context context, boolean z) {
        int i;
        C31837u.m129202r(this, context, C31076a.C31079c.motionEasingStandard, C31093a.f74426b);
        if (z) {
            i = C31076a.C31079c.motionDurationLong1;
        } else {
            i = C31076a.C31079c.motionDurationMedium2;
        }
        C31837u.m129201q(this, context, i);
        if (!this.f77354m1) {
            C31837u.m129203s(this, context, C31076a.C31079c.motionPath);
        }
    }

    /* renamed from: H1 */
    public void mo92102H1(@C0354l int i) {
        this.f77359r1 = i;
        this.f77360s1 = i;
        this.f77361t1 = i;
    }

    /* renamed from: I1 */
    public void mo92103I1(@C0354l int i) {
        this.f77359r1 = i;
    }

    /* renamed from: J1 */
    public void mo92104J1(boolean z) {
        this.f77352k1 = z;
    }

    /* renamed from: K1 */
    public void mo92105K1(@C0329d0 int i) {
        this.f77356o1 = i;
    }

    /* renamed from: N1 */
    public void mo92106N1(boolean z) {
        this.f77349G1 = z;
    }

    /* renamed from: O1 */
    public void mo92107O1(@C0354l int i) {
        this.f77361t1 = i;
    }

    /* renamed from: P1 */
    public void mo92108P1(float f) {
        this.f77351I1 = f;
    }

    /* renamed from: Q0 */
    public void mo61725Q0(@C0363p0 C20684x xVar) {
        super.mo61725Q0(xVar);
        this.f77354m1 = true;
    }

    /* renamed from: Q1 */
    public void mo92109Q1(@C0363p0 C31534o oVar) {
        this.f77344B1 = oVar;
    }

    /* renamed from: R1 */
    public void mo92110R1(@C0363p0 View view) {
        this.f77367z1 = view;
    }

    /* renamed from: S1 */
    public void mo92111S1(@C0329d0 int i) {
        this.f77358q1 = i;
    }

    /* renamed from: T1 */
    public void mo92112T1(int i) {
        this.f77364w1 = i;
    }

    /* renamed from: U1 */
    public void mo92113U1(@C0363p0 C31761e eVar) {
        this.f77345C1 = eVar;
    }

    /* renamed from: V1 */
    public void mo92114V1(int i) {
        this.f77365x1 = i;
    }

    /* renamed from: W0 */
    public final C31762f mo92115W0(boolean z) {
        C20684x Y = mo61735Y();
        if ((Y instanceof C20537b) || (Y instanceof C31755k)) {
            return mo92146x1(z, f77340Z1, f77341a2);
        }
        return mo92146x1(z, f77338X1, f77339Y1);
    }

    /* renamed from: W1 */
    public void mo92116W1(boolean z) {
        this.f77353l1 = z;
    }

    /* renamed from: Z1 */
    public void mo92117Z1(@C0363p0 C31761e eVar) {
        this.f77347E1 = eVar;
    }

    @C0354l
    /* renamed from: a1 */
    public int mo92118a1() {
        return this.f77359r1;
    }

    /* renamed from: a2 */
    public void mo92119a2(@C0363p0 C31761e eVar) {
        this.f77346D1 = eVar;
    }

    @C0329d0
    /* renamed from: b1 */
    public int mo92120b1() {
        return this.f77356o1;
    }

    /* renamed from: b2 */
    public void mo92121b2(@C0354l int i) {
        this.f77362u1 = i;
    }

    @C0354l
    /* renamed from: d1 */
    public int mo92122d1() {
        return this.f77361t1;
    }

    /* renamed from: d2 */
    public void mo92123d2(@C0363p0 C31761e eVar) {
        this.f77348F1 = eVar;
    }

    /* renamed from: e1 */
    public float mo92124e1() {
        return this.f77351I1;
    }

    @C0363p0
    /* renamed from: f1 */
    public C31534o mo92125f1() {
        return this.f77344B1;
    }

    /* renamed from: f2 */
    public void mo92126f2(@C0354l int i) {
        this.f77360s1 = i;
    }

    @C0363p0
    /* renamed from: g1 */
    public View mo92127g1() {
        return this.f77367z1;
    }

    /* renamed from: g2 */
    public void mo92128g2(float f) {
        this.f77350H1 = f;
    }

    @C0329d0
    /* renamed from: h1 */
    public int mo92129h1() {
        return this.f77358q1;
    }

    /* renamed from: h2 */
    public void mo92130h2(@C0363p0 C31534o oVar) {
        this.f77343A1 = oVar;
    }

    @C0363p0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f77337W1;
    }

    /* renamed from: i1 */
    public int mo92131i1() {
        return this.f77364w1;
    }

    /* renamed from: i2 */
    public void mo92132i2(@C0363p0 View view) {
        this.f77366y1 = view;
    }

    /* renamed from: j2 */
    public void mo92133j2(@C0329d0 int i) {
        this.f77357p1 = i;
    }

    /* renamed from: k2 */
    public void mo92134k2(int i) {
        this.f77363v1 = i;
    }

    @C0363p0
    /* renamed from: l1 */
    public C31761e mo92135l1() {
        return this.f77345C1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        m128754Z0(p0Var, this.f77367z1, this.f77358q1, this.f77344B1);
    }

    /* renamed from: m1 */
    public int mo92136m1() {
        return this.f77365x1;
    }

    @C0363p0
    /* renamed from: n1 */
    public C31761e mo92137n1() {
        return this.f77347E1;
    }

    @C0363p0
    /* renamed from: o1 */
    public C31761e mo92138o1() {
        return this.f77346D1;
    }

    @C0354l
    /* renamed from: p1 */
    public int mo92139p1() {
        return this.f77362u1;
    }

    @C0363p0
    /* renamed from: r1 */
    public C31761e mo92140r1() {
        return this.f77348F1;
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        m128754Z0(p0Var, this.f77366y1, this.f77357p1, this.f77343A1);
    }

    @C0354l
    /* renamed from: s1 */
    public int mo92141s1() {
        return this.f77360s1;
    }

    /* renamed from: t1 */
    public float mo92142t1() {
        return this.f77350H1;
    }

    @C0363p0
    /* renamed from: u1 */
    public C31534o mo92143u1() {
        return this.f77343A1;
    }

    @C0363p0
    /* renamed from: v1 */
    public View mo92144v1() {
        return this.f77366y1;
    }

    @C0329d0
    /* renamed from: w1 */
    public int mo92145w1() {
        return this.f77357p1;
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        View view;
        View view2;
        View view3;
        C20657p0 p0Var3 = p0Var;
        C20657p0 p0Var4 = p0Var2;
        if (!(p0Var3 == null || p0Var4 == null)) {
            RectF rectF = (RectF) p0Var3.f53279a.get("materialContainerTransition:bounds");
            C31534o oVar = (C31534o) p0Var3.f53279a.get("materialContainerTransition:shapeAppearance");
            if (!(rectF == null || oVar == null)) {
                RectF rectF2 = (RectF) p0Var4.f53279a.get("materialContainerTransition:bounds");
                C31534o oVar2 = (C31534o) p0Var4.f53279a.get("materialContainerTransition:shapeAppearance");
                if (!(rectF2 == null || oVar2 == null)) {
                    View view4 = p0Var3.f53280b;
                    View view5 = p0Var4.f53280b;
                    if (view5.getParent() != null) {
                        view = view5;
                    } else {
                        view = view4;
                    }
                    if (this.f77356o1 == view.getId()) {
                        view2 = (View) view.getParent();
                        view3 = view;
                    } else {
                        view2 = C31837u.m129189e(view, this.f77356o1);
                        view3 = null;
                    }
                    RectF g = C31837u.m129191g(view2);
                    float f = -g.left;
                    float f2 = -g.top;
                    RectF X0 = m128752X0(view2, view3, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean D1 = mo92099D1(rectF, rectF2);
                    if (!this.f77355n1) {
                        mo92101F1(view.getContext(), D1);
                    }
                    C31764h hVar = new C31764h(mo61735Y(), view4, rectF, oVar, m128755c1(this.f77350H1, view4), view5, rectF2, oVar2, m128755c1(this.f77351I1, view5), this.f77359r1, this.f77360s1, this.f77361t1, this.f77362u1, D1, this.f77349G1, C31736b.m128715a(this.f77364w1, D1), C31749g.m128735a(this.f77365x1, D1, rectF, rectF2), mo92115W0(D1), this.f77352k1, (C31757a) null);
                    hVar.setBounds(Math.round(X0.left), Math.round(X0.top), Math.round(X0.right), Math.round(X0.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new C31757a(hVar));
                    mo61737b(new C31758b(view2, hVar, view4, view5));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    /* renamed from: x1 */
    public final C31762f mo92146x1(boolean z, C31762f fVar, C31762f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new C31762f((C31761e) C31837u.m129188d(this.f77345C1, fVar.f77377a), (C31761e) C31837u.m129188d(this.f77346D1, fVar.f77378b), (C31761e) C31837u.m129188d(this.f77347E1, fVar.f77379c), (C31761e) C31837u.m129188d(this.f77348F1, fVar.f77380d), (C31757a) null);
    }

    /* renamed from: y1 */
    public int mo92147y1() {
        return this.f77363v1;
    }

    public C31756l(@C0359n0 Context context, boolean z) {
        boolean z2 = false;
        this.f77349G1 = Build.VERSION.SDK_INT >= 28 ? true : z2;
        this.f77350H1 = -1.0f;
        this.f77351I1 = -1.0f;
        mo92101F1(context, z);
        this.f77355n1 = true;
    }
}
