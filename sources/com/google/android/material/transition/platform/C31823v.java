package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0329d0;
import androidx.annotation.C0336f;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.core.graphics.C17634r0;
import com.google.android.material.motion.C31441a;
import com.google.android.material.shape.C31515a;
import com.google.android.material.shape.C31518d;
import com.google.android.material.shape.C31532m;
import com.google.android.material.shape.C31534o;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.v */
public class C31823v {

    /* renamed from: a */
    public static final int f77628a = -1;
    @C0336f

    /* renamed from: b */
    public static final int f77629b = 0;

    /* renamed from: c */
    public static final int f77630c = 0;

    /* renamed from: d */
    public static final int f77631d = 1;

    /* renamed from: e */
    public static final RectF f77632e = new RectF();

    /* renamed from: com.google.android.material.transition.platform.v$a */
    public class C31824a implements C31534o.C31537c {

        /* renamed from: a */
        public final /* synthetic */ RectF f77633a;

        public C31824a(RectF rectF) {
            this.f77633a = rectF;
        }

        @C0359n0
        /* renamed from: a */
        public C31518d mo90803a(@C0359n0 C31518d dVar) {
            if (dVar instanceof C31532m) {
                return dVar;
            }
            return new C31532m(dVar.mo90693a(this.f77633a) / this.f77633a.height());
        }
    }

    /* renamed from: com.google.android.material.transition.platform.v$b */
    public class C31825b implements C31827d {

        /* renamed from: a */
        public final /* synthetic */ RectF f77634a;

        /* renamed from: b */
        public final /* synthetic */ RectF f77635b;

        /* renamed from: c */
        public final /* synthetic */ float f77636c;

        /* renamed from: d */
        public final /* synthetic */ float f77637d;

        /* renamed from: e */
        public final /* synthetic */ float f77638e;

        public C31825b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f77634a = rectF;
            this.f77635b = rectF2;
            this.f77636c = f;
            this.f77637d = f2;
            this.f77638e = f3;
        }

        @C0359n0
        /* renamed from: a */
        public C31518d mo92328a(@C0359n0 C31518d dVar, @C0359n0 C31518d dVar2) {
            return new C31515a(C31823v.m129120l(dVar.mo90693a(this.f77634a), dVar2.mo90693a(this.f77635b), this.f77636c, this.f77637d, this.f77638e));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.v$c */
    public interface C31826c {
        /* renamed from: a */
        void mo92274a(Canvas canvas);
    }

    /* renamed from: com.google.android.material.transition.platform.v$d */
    public interface C31827d {
        @C0359n0
        /* renamed from: a */
        C31518d mo92328a(@C0359n0 C31518d dVar, @C0359n0 C31518d dVar2);
    }

    /* renamed from: a */
    public static float m129109a(@C0359n0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: b */
    public static C31534o m129110b(C31534o oVar, RectF rectF) {
        return oVar.mo90825y(new C31824a(rectF));
    }

    /* renamed from: c */
    public static Shader m129111c(@C0354l int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @C0359n0
    /* renamed from: d */
    public static <T> T m129112d(@C0363p0 T t, @C0359n0 T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: e */
    public static View m129113e(View view, @C0329d0 int i) {
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
    public static View m129114f(View view, @C0329d0 int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m129113e(view, i);
    }

    /* renamed from: g */
    public static RectF m129115g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: h */
    public static RectF m129116h(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    /* renamed from: i */
    public static Rect m129117i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    public static boolean m129118j(C31534o oVar, RectF rectF) {
        if (oVar.mo90818r().mo90693a(rectF) == 0.0f && oVar.mo90820t().mo90693a(rectF) == 0.0f && oVar.mo90813l().mo90693a(rectF) == 0.0f && oVar.mo90811j().mo90693a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static float m129119k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static float m129120l(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, @C0379x(from = 0.0d, mo1016to = 1.0d) float f5) {
        return m129121m(f, f2, f3, f4, f5, false);
    }

    /* renamed from: m */
    public static float m129121m(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, @C0379x(from = 0.0d) float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m129119k(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m129119k(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: n */
    public static int m129122n(int i, int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m129119k((float) i, (float) i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: o */
    public static C31534o m129123o(C31534o oVar, C31534o oVar2, RectF rectF, RectF rectF2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3) {
        return f3 < f ? oVar : f3 > f2 ? oVar2 : m129132x(oVar, oVar2, rectF, new C31825b(rectF, rectF2, f, f2, f3));
    }

    /* renamed from: p */
    public static void m129124p(TransitionSet transitionSet, @C0363p0 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    /* renamed from: q */
    public static boolean m129125q(Transition transition, Context context, @C0336f int i) {
        int d;
        if (i == 0 || transition.getDuration() != -1 || (d = C31441a.m127036d(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration((long) d);
        return true;
    }

    /* renamed from: r */
    public static boolean m129126r(Transition transition, Context context, @C0336f int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(C31441a.m127037e(context, i, timeInterpolator));
        return true;
    }

    /* renamed from: s */
    public static boolean m129127s(Transition transition, Context context, @C0336f int i) {
        PathMotion u;
        if (i == 0 || (u = m129129u(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(u);
        return true;
    }

    /* renamed from: t */
    public static void m129128t(TransitionSet transitionSet, @C0363p0 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @C0363p0
    /* renamed from: u */
    public static PathMotion m129129u(Context context, @C0336f int i) {
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
                return new C31792k();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(C17634r0.m80739e(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: v */
    public static int m129130v(Canvas canvas, Rect rect, int i) {
        RectF rectF = f77632e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: w */
    public static void m129131w(Canvas canvas, Rect rect, float f, float f2, float f3, int i, C31826c cVar) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                m129130v(canvas, rect, i);
            }
            cVar.mo92274a(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: x */
    public static C31534o m129132x(C31534o oVar, C31534o oVar2, RectF rectF, C31827d dVar) {
        C31534o oVar3;
        if (m129118j(oVar, rectF)) {
            oVar3 = oVar;
        } else {
            oVar3 = oVar2;
        }
        return oVar3.mo90822v().mo90837L(dVar.mo92328a(oVar.mo90818r(), oVar2.mo90818r())).mo90842Q(dVar.mo92328a(oVar.mo90820t(), oVar2.mo90820t())).mo90854y(dVar.mo92328a(oVar.mo90811j(), oVar2.mo90811j())).mo90829D(dVar.mo92328a(oVar.mo90813l(), oVar2.mo90813l())).mo90843m();
    }
}
