package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0329d0;
import androidx.annotation.C0336f;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.core.graphics.C17634r0;
import androidx.transition.C20606h0;
import androidx.transition.C20639m0;
import androidx.transition.C20684x;
import androidx.transition.C20689z;
import com.google.android.material.motion.C31441a;
import com.google.android.material.shape.C31515a;
import com.google.android.material.shape.C31518d;
import com.google.android.material.shape.C31532m;
import com.google.android.material.shape.C31534o;

/* renamed from: com.google.android.material.transition.u */
public class C31837u {

    /* renamed from: a */
    public static final int f77658a = -1;
    @C0336f

    /* renamed from: b */
    public static final int f77659b = 0;

    /* renamed from: c */
    public static final int f77660c = 0;

    /* renamed from: d */
    public static final int f77661d = 1;

    /* renamed from: e */
    public static final RectF f77662e = new RectF();

    /* renamed from: com.google.android.material.transition.u$a */
    public class C31838a implements C31534o.C31537c {

        /* renamed from: a */
        public final /* synthetic */ RectF f77663a;

        public C31838a(RectF rectF) {
            this.f77663a = rectF;
        }

        @C0359n0
        /* renamed from: a */
        public C31518d mo90803a(@C0359n0 C31518d dVar) {
            if (dVar instanceof C31532m) {
                return dVar;
            }
            return new C31532m(dVar.mo90693a(this.f77663a) / this.f77663a.height());
        }
    }

    /* renamed from: com.google.android.material.transition.u$b */
    public class C31839b implements C31841d {

        /* renamed from: a */
        public final /* synthetic */ RectF f77664a;

        /* renamed from: b */
        public final /* synthetic */ RectF f77665b;

        /* renamed from: c */
        public final /* synthetic */ float f77666c;

        /* renamed from: d */
        public final /* synthetic */ float f77667d;

        /* renamed from: e */
        public final /* synthetic */ float f77668e;

        public C31839b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f77664a = rectF;
            this.f77665b = rectF2;
            this.f77666c = f;
            this.f77667d = f2;
            this.f77668e = f3;
        }

        @C0359n0
        /* renamed from: a */
        public C31518d mo92351a(@C0359n0 C31518d dVar, @C0359n0 C31518d dVar2) {
            return new C31515a(C31837u.m129196l(dVar.mo90693a(this.f77664a), dVar2.mo90693a(this.f77665b), this.f77666c, this.f77667d, this.f77668e));
        }
    }

    /* renamed from: com.google.android.material.transition.u$c */
    public interface C31840c {
        /* renamed from: a */
        void mo92165a(Canvas canvas);
    }

    /* renamed from: com.google.android.material.transition.u$d */
    public interface C31841d {
        @C0359n0
        /* renamed from: a */
        C31518d mo92351a(@C0359n0 C31518d dVar, @C0359n0 C31518d dVar2);
    }

    /* renamed from: a */
    public static float m129185a(@C0359n0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: b */
    public static C31534o m129186b(C31534o oVar, RectF rectF) {
        return oVar.mo90825y(new C31838a(rectF));
    }

    /* renamed from: c */
    public static Shader m129187c(@C0354l int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @C0359n0
    /* renamed from: d */
    public static <T> T m129188d(@C0363p0 T t, @C0359n0 T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: e */
    public static View m129189e(View view, @C0329d0 int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: f */
    public static View m129190f(View view, @C0329d0 int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m129189e(view, i);
    }

    /* renamed from: g */
    public static RectF m129191g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: h */
    public static RectF m129192h(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    /* renamed from: i */
    public static Rect m129193i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    public static boolean m129194j(C31534o oVar, RectF rectF) {
        if (oVar.mo90818r().mo90693a(rectF) == 0.0f && oVar.mo90820t().mo90693a(rectF) == 0.0f && oVar.mo90813l().mo90693a(rectF) == 0.0f && oVar.mo90811j().mo90693a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static float m129195k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static float m129196l(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, @C0379x(from = 0.0d, mo1016to = 1.0d) float f5) {
        return m129197m(f, f2, f3, f4, f5, false);
    }

    /* renamed from: m */
    public static float m129197m(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, @C0379x(from = 0.0d) float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m129195k(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m129195k(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: n */
    public static int m129198n(int i, int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m129195k((float) i, (float) i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: o */
    public static C31534o m129199o(C31534o oVar, C31534o oVar2, RectF rectF, RectF rectF2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3) {
        return f3 < f ? oVar : f3 > f2 ? oVar2 : m129208x(oVar, oVar2, rectF, new C31839b(rectF, rectF2, f, f2, f3));
    }

    /* renamed from: p */
    public static void m129200p(C20639m0 m0Var, @C0363p0 C20606h0 h0Var) {
        if (h0Var != null) {
            m0Var.mo61835a1(h0Var);
        }
    }

    /* renamed from: q */
    public static boolean m129201q(C20606h0 h0Var, Context context, @C0336f int i) {
        int d;
        if (i == 0 || h0Var.mo61723P() != -1 || (d = C31441a.m127036d(context, i, -1)) == -1) {
            return false;
        }
        h0Var.mo61718L0((long) d);
        return true;
    }

    /* renamed from: r */
    public static boolean m129202r(C20606h0 h0Var, Context context, @C0336f int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || h0Var.mo61730T() != null) {
            return false;
        }
        h0Var.mo61722O0(C31441a.m127037e(context, i, timeInterpolator));
        return true;
    }

    /* renamed from: s */
    public static boolean m129203s(C20606h0 h0Var, Context context, @C0336f int i) {
        C20684x u;
        if (i == 0 || (u = m129205u(context, i)) == null) {
            return false;
        }
        h0Var.mo61725Q0(u);
        return true;
    }

    /* renamed from: t */
    public static void m129204t(C20639m0 m0Var, @C0363p0 C20606h0 h0Var) {
        if (h0Var != null) {
            m0Var.mo61845m1(h0Var);
        }
    }

    @C0363p0
    /* renamed from: u */
    public static C20684x m129205u(Context context, @C0336f int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new C31755k();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new C20689z(C17634r0.m80739e(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: v */
    public static int m129206v(Canvas canvas, Rect rect, int i) {
        RectF rectF = f77662e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: w */
    public static void m129207w(Canvas canvas, Rect rect, float f, float f2, float f3, int i, C31840c cVar) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                m129206v(canvas, rect, i);
            }
            cVar.mo92165a(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: x */
    public static C31534o m129208x(C31534o oVar, C31534o oVar2, RectF rectF, C31841d dVar) {
        C31534o oVar3;
        if (m129194j(oVar, rectF)) {
            oVar3 = oVar;
        } else {
            oVar3 = oVar2;
        }
        return oVar3.mo90822v().mo90837L(dVar.mo92351a(oVar.mo90818r(), oVar2.mo90818r())).mo90842Q(dVar.mo92351a(oVar.mo90820t(), oVar2.mo90820t())).mo90854y(dVar.mo92351a(oVar.mo90811j(), oVar2.mo90811j())).mo90829D(dVar.mo92351a(oVar.mo90813l(), oVar2.mo90813l())).mo90843m();
    }
}
