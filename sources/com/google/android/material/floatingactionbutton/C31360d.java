package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.animation.C31098f;
import com.google.android.material.animation.C31099g;
import com.google.android.material.animation.C31100h;
import com.google.android.material.internal.C31413l;
import com.google.android.material.motion.C31441a;
import com.google.android.material.ripple.C31508a;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shadow.C31514c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.d */
public class C31360d {

    /* renamed from: D */
    public static final TimeInterpolator f75644D = C31093a.f74427c;

    /* renamed from: E */
    public static final long f75645E = 100;

    /* renamed from: F */
    public static final long f75646F = 100;

    /* renamed from: G */
    public static final int f75647G = 0;

    /* renamed from: H */
    public static final int f75648H = 1;

    /* renamed from: I */
    public static final int f75649I = 2;

    /* renamed from: J */
    public static final float f75650J = 1.5f;

    /* renamed from: K */
    public static final float f75651K = 0.0f;

    /* renamed from: L */
    public static final float f75652L = 0.4f;

    /* renamed from: M */
    public static final float f75653M = 0.4f;

    /* renamed from: N */
    public static final float f75654N = 1.0f;

    /* renamed from: O */
    public static final float f75655O = 1.0f;

    /* renamed from: P */
    public static final float f75656P = 1.0f;

    /* renamed from: Q */
    public static final float f75657Q = 0.0f;

    /* renamed from: R */
    public static final float f75658R = 0.0f;

    /* renamed from: S */
    public static final int[] f75659S = {16842919, 16842910};

    /* renamed from: T */
    public static final int[] f75660T = {16843623, 16842908, 16842910};

    /* renamed from: U */
    public static final int[] f75661U = {16842908, 16842910};

    /* renamed from: V */
    public static final int[] f75662V = {16843623, 16842910};

    /* renamed from: W */
    public static final int[] f75663W = {16842910};

    /* renamed from: X */
    public static final int[] f75664X = new int[0];

    /* renamed from: A */
    public final RectF f75665A = new RectF();

    /* renamed from: B */
    public final Matrix f75666B = new Matrix();
    @C0363p0

    /* renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f75667C;
    @C0363p0

    /* renamed from: a */
    public C31534o f75668a;
    @C0363p0

    /* renamed from: b */
    public C31525j f75669b;
    @C0363p0

    /* renamed from: c */
    public Drawable f75670c;
    @C0363p0

    /* renamed from: d */
    public C31357c f75671d;
    @C0363p0

    /* renamed from: e */
    public Drawable f75672e;

    /* renamed from: f */
    public boolean f75673f;

    /* renamed from: g */
    public boolean f75674g = true;

    /* renamed from: h */
    public float f75675h;

    /* renamed from: i */
    public float f75676i;

    /* renamed from: j */
    public float f75677j;

    /* renamed from: k */
    public int f75678k;
    @C0359n0

    /* renamed from: l */
    public final C31413l f75679l;
    @C0363p0

    /* renamed from: m */
    public Animator f75680m;
    @C0363p0

    /* renamed from: n */
    public C31100h f75681n;
    @C0363p0

    /* renamed from: o */
    public C31100h f75682o;

    /* renamed from: p */
    public float f75683p;

    /* renamed from: q */
    public float f75684q = 1.0f;

    /* renamed from: r */
    public int f75685r;

    /* renamed from: s */
    public int f75686s = 0;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f75687t;

    /* renamed from: u */
    public ArrayList<Animator.AnimatorListener> f75688u;

    /* renamed from: v */
    public ArrayList<C31370j> f75689v;

    /* renamed from: w */
    public final FloatingActionButton f75690w;

    /* renamed from: x */
    public final C31514c f75691x;

    /* renamed from: y */
    public final Rect f75692y = new Rect();

    /* renamed from: z */
    public final RectF f75693z = new RectF();

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class C31361a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f75694a;

        /* renamed from: b */
        public final /* synthetic */ boolean f75695b;

        /* renamed from: c */
        public final /* synthetic */ C31371k f75696c;

        public C31361a(boolean z, C31371k kVar) {
            this.f75695b = z;
            this.f75696c = kVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f75694a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int i;
            int unused = C31360d.this.f75686s = 0;
            Animator unused2 = C31360d.this.f75680m = null;
            if (!this.f75694a) {
                FloatingActionButton floatingActionButton = C31360d.this.f75690w;
                boolean z = this.f75695b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.mo89988c(i, z);
                C31371k kVar = this.f75696c;
                if (kVar != null) {
                    kVar.mo89750b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C31360d.this.f75690w.mo89988c(0, this.f75695b);
            int unused = C31360d.this.f75686s = 1;
            Animator unused2 = C31360d.this.f75680m = animator;
            this.f75694a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class C31362b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f75698a;

        /* renamed from: b */
        public final /* synthetic */ C31371k f75699b;

        public C31362b(boolean z, C31371k kVar) {
            this.f75698a = z;
            this.f75699b = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C31360d.this.f75686s = 0;
            Animator unused2 = C31360d.this.f75680m = null;
            C31371k kVar = this.f75699b;
            if (kVar != null) {
                kVar.mo89749a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C31360d.this.f75690w.mo89988c(0, this.f75698a);
            int unused = C31360d.this.f75686s = 2;
            Animator unused2 = C31360d.this.f75680m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class C31363c extends C31099g {
        public C31363c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, @C0359n0 Matrix matrix, @C0359n0 Matrix matrix2) {
            float unused = C31360d.this.f75684q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class C31364d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f75702a;

        /* renamed from: b */
        public final /* synthetic */ float f75703b;

        /* renamed from: c */
        public final /* synthetic */ float f75704c;

        /* renamed from: d */
        public final /* synthetic */ float f75705d;

        /* renamed from: e */
        public final /* synthetic */ float f75706e;

        /* renamed from: f */
        public final /* synthetic */ float f75707f;

        /* renamed from: g */
        public final /* synthetic */ float f75708g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f75709h;

        public C31364d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f75702a = f;
            this.f75703b = f2;
            this.f75704c = f3;
            this.f75705d = f4;
            this.f75706e = f5;
            this.f75707f = f6;
            this.f75708g = f7;
            this.f75709h = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C31360d.this.f75690w.setAlpha(C31093a.m124648b(this.f75702a, this.f75703b, 0.0f, 0.2f, floatValue));
            C31360d.this.f75690w.setScaleX(C31093a.m124647a(this.f75704c, this.f75705d, floatValue));
            C31360d.this.f75690w.setScaleY(C31093a.m124647a(this.f75706e, this.f75705d, floatValue));
            float unused = C31360d.this.f75684q = C31093a.m124647a(this.f75707f, this.f75708g, floatValue);
            C31360d.this.mo89828h(C31093a.m124647a(this.f75707f, this.f75708g, floatValue), this.f75709h);
            C31360d.this.f75690w.setImageMatrix(this.f75709h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public class C31365e implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f75711a = new FloatEvaluator();

        public C31365e() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f75711a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    public class C31366f implements ViewTreeObserver.OnPreDrawListener {
        public C31366f() {
        }

        public boolean onPreDraw() {
            C31360d.this.mo89799H();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    public class C31367g extends C31373m {
        public C31367g() {
            super(C31360d.this, (C31361a) null);
        }

        /* renamed from: a */
        public float mo89860a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    public class C31368h extends C31373m {
        public C31368h() {
            super(C31360d.this, (C31361a) null);
        }

        /* renamed from: a */
        public float mo89860a() {
            C31360d dVar = C31360d.this;
            return dVar.f75675h + dVar.f75676i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    public class C31369i extends C31373m {
        public C31369i() {
            super(C31360d.this, (C31361a) null);
        }

        /* renamed from: a */
        public float mo89860a() {
            C31360d dVar = C31360d.this;
            return dVar.f75675h + dVar.f75677j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    public interface C31370j {
        /* renamed from: a */
        void mo89755a();

        /* renamed from: b */
        void mo89756b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    public interface C31371k {
        /* renamed from: a */
        void mo89749a();

        /* renamed from: b */
        void mo89750b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    public class C31372l extends C31373m {
        public C31372l() {
            super(C31360d.this, (C31361a) null);
        }

        /* renamed from: a */
        public float mo89860a() {
            return C31360d.this.f75675h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$m */
    public abstract class C31373m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f75718a;

        /* renamed from: b */
        public float f75719b;

        /* renamed from: c */
        public float f75720c;

        public C31373m() {
        }

        /* renamed from: a */
        public abstract float mo89860a();

        public void onAnimationEnd(Animator animator) {
            C31360d.this.mo89833j0((float) ((int) this.f75720c));
            this.f75718a = false;
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float f;
            if (!this.f75718a) {
                C31525j jVar = C31360d.this.f75669b;
                if (jVar == null) {
                    f = 0.0f;
                } else {
                    f = jVar.mo90795x();
                }
                this.f75719b = f;
                this.f75720c = mo89860a();
                this.f75718a = true;
            }
            C31360d dVar = C31360d.this;
            float f2 = this.f75719b;
            dVar.mo89833j0((float) ((int) (f2 + ((this.f75720c - f2) * valueAnimator.getAnimatedFraction()))));
        }

        public /* synthetic */ C31373m(C31360d dVar, C31361a aVar) {
            this();
        }
    }

    public C31360d(FloatingActionButton floatingActionButton, C31514c cVar) {
        this.f75690w = floatingActionButton;
        this.f75691x = cVar;
        C31413l lVar = new C31413l();
        this.f75679l = lVar;
        lVar.mo90156a(f75659S, mo89834k(new C31369i()));
        lVar.mo90156a(f75660T, mo89834k(new C31368h()));
        lVar.mo90156a(f75661U, mo89834k(new C31368h()));
        lVar.mo90156a(f75662V, mo89834k(new C31368h()));
        lVar.mo90156a(f75663W, mo89834k(new C31372l()));
        lVar.mo90156a(f75664X, mo89834k(new C31367g()));
        this.f75683p = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void mo89792A() {
        this.f75679l.mo90158c();
    }

    /* renamed from: B */
    public void mo89793B() {
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            C31530k.m127555f(this.f75690w, jVar);
        }
        if (mo89805N()) {
            this.f75690w.getViewTreeObserver().addOnPreDrawListener(mo89842r());
        }
    }

    /* renamed from: C */
    public void mo89794C() {
    }

    /* renamed from: D */
    public void mo89795D() {
        ViewTreeObserver viewTreeObserver = this.f75690w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f75667C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f75667C = null;
        }
    }

    /* renamed from: E */
    public void mo89796E(int[] iArr) {
        this.f75679l.mo90159d(iArr);
    }

    /* renamed from: F */
    public void mo89797F(float f, float f2, float f3) {
        mo89831i0();
        mo89833j0(f);
    }

    /* renamed from: G */
    public void mo89798G(@C0359n0 Rect rect) {
        C18001r.m81776m(this.f75672e, "Didn't initialize content background");
        if (mo89820c0()) {
            this.f75691x.mo89752b(new InsetDrawable(this.f75672e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f75691x.mo89752b(this.f75672e);
    }

    /* renamed from: H */
    public void mo89799H() {
        float rotation = this.f75690w.getRotation();
        if (this.f75683p != rotation) {
            this.f75683p = rotation;
            mo89827g0();
        }
    }

    /* renamed from: I */
    public void mo89800I() {
        ArrayList<C31370j> arrayList = this.f75689v;
        if (arrayList != null) {
            Iterator<C31370j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo89756b();
            }
        }
    }

    /* renamed from: J */
    public void mo89801J() {
        ArrayList<C31370j> arrayList = this.f75689v;
        if (arrayList != null) {
            Iterator<C31370j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo89755a();
            }
        }
    }

    /* renamed from: K */
    public void mo89802K(@C0359n0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f75688u;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: L */
    public void mo89803L(@C0359n0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f75687t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: M */
    public void mo89804M(@C0359n0 C31370j jVar) {
        ArrayList<C31370j> arrayList = this.f75689v;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    /* renamed from: N */
    public boolean mo89805N() {
        return true;
    }

    /* renamed from: O */
    public void mo89806O(@C0363p0 ColorStateList colorStateList) {
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        C31357c cVar = this.f75671d;
        if (cVar != null) {
            cVar.mo89776d(colorStateList);
        }
    }

    /* renamed from: P */
    public void mo89807P(@C0363p0 PorterDuff.Mode mode) {
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    /* renamed from: Q */
    public final void mo89808Q(float f) {
        if (this.f75675h != f) {
            this.f75675h = f;
            mo89797F(f, this.f75676i, this.f75677j);
        }
    }

    /* renamed from: R */
    public void mo89809R(boolean z) {
        this.f75673f = z;
    }

    /* renamed from: S */
    public final void mo89810S(@C0363p0 C31100h hVar) {
        this.f75682o = hVar;
    }

    /* renamed from: T */
    public final void mo89811T(float f) {
        if (this.f75676i != f) {
            this.f75676i = f;
            mo89797F(this.f75675h, f, this.f75677j);
        }
    }

    /* renamed from: U */
    public final void mo89812U(float f) {
        this.f75684q = f;
        Matrix matrix = this.f75666B;
        mo89828h(f, matrix);
        this.f75690w.setImageMatrix(matrix);
    }

    /* renamed from: V */
    public final void mo89813V(int i) {
        if (this.f75685r != i) {
            this.f75685r = i;
            mo89829h0();
        }
    }

    /* renamed from: W */
    public void mo89814W(int i) {
        this.f75678k = i;
    }

    /* renamed from: X */
    public final void mo89815X(float f) {
        if (this.f75677j != f) {
            this.f75677j = f;
            mo89797F(this.f75675h, this.f75676i, f);
        }
    }

    /* renamed from: Y */
    public void mo89816Y(@C0363p0 ColorStateList colorStateList) {
        Drawable drawable = this.f75670c;
        if (drawable != null) {
            C17549d.m80453o(drawable, C31511b.m127405d(colorStateList));
        }
    }

    /* renamed from: Z */
    public void mo89817Z(boolean z) {
        this.f75674g = z;
        mo89831i0();
    }

    /* renamed from: a0 */
    public final void mo89818a0(@C0359n0 C31534o oVar) {
        this.f75668a = oVar;
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        Drawable drawable = this.f75670c;
        if (drawable instanceof C31553s) {
            ((C31553s) drawable).setShapeAppearanceModel(oVar);
        }
        C31357c cVar = this.f75671d;
        if (cVar != null) {
            cVar.mo89780g(oVar);
        }
    }

    /* renamed from: b0 */
    public final void mo89819b0(@C0363p0 C31100h hVar) {
        this.f75681n = hVar;
    }

    /* renamed from: c0 */
    public boolean mo89820c0() {
        return true;
    }

    /* renamed from: d0 */
    public final boolean mo89821d0() {
        return C18196h2.m82539U0(this.f75690w) && !this.f75690w.isInEditMode();
    }

    /* renamed from: e */
    public void mo89822e(@C0359n0 Animator.AnimatorListener animatorListener) {
        if (this.f75688u == null) {
            this.f75688u = new ArrayList<>();
        }
        this.f75688u.add(animatorListener);
    }

    /* renamed from: e0 */
    public final boolean mo89823e0() {
        return !this.f75673f || this.f75690w.getSizeDimension() >= this.f75678k;
    }

    /* renamed from: f */
    public void mo89824f(@C0359n0 Animator.AnimatorListener animatorListener) {
        if (this.f75687t == null) {
            this.f75687t = new ArrayList<>();
        }
        this.f75687t.add(animatorListener);
    }

    /* renamed from: f0 */
    public void mo89825f0(@C0363p0 C31371k kVar, boolean z) {
        boolean z2;
        AnimatorSet animatorSet;
        float f;
        float f2;
        if (!mo89850z()) {
            Animator animator = this.f75680m;
            if (animator != null) {
                animator.cancel();
            }
            if (this.f75681n == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (mo89821d0()) {
                if (this.f75690w.getVisibility() != 0) {
                    float f3 = 0.0f;
                    this.f75690w.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.f75690w;
                    if (z2) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    FloatingActionButton floatingActionButton2 = this.f75690w;
                    if (z2) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton2.setScaleX(f2);
                    if (z2) {
                        f3 = 0.4f;
                    }
                    mo89812U(f3);
                }
                C31100h hVar = this.f75681n;
                if (hVar != null) {
                    animatorSet = mo89830i(hVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = mo89832j(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new C31362b(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f75687t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            this.f75690w.mo89988c(0, z);
            this.f75690w.setAlpha(1.0f);
            this.f75690w.setScaleY(1.0f);
            this.f75690w.setScaleX(1.0f);
            mo89812U(1.0f);
            if (kVar != null) {
                kVar.mo89749a();
            }
        }
    }

    /* renamed from: g */
    public void mo89826g(@C0359n0 C31370j jVar) {
        if (this.f75689v == null) {
            this.f75689v = new ArrayList<>();
        }
        this.f75689v.add(jVar);
    }

    /* renamed from: g0 */
    public void mo89827g0() {
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            jVar.mo90794w0((int) this.f75683p);
        }
    }

    /* renamed from: h */
    public final void mo89828h(float f, @C0359n0 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f75690w.getDrawable();
        if (drawable != null && this.f75685r != 0) {
            RectF rectF = this.f75693z;
            RectF rectF2 = this.f75665A;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f75685r;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f75685r;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h0 */
    public final void mo89829h0() {
        mo89812U(this.f75684q);
    }

    @C0359n0
    /* renamed from: i */
    public final AnimatorSet mo89830i(@C0359n0 C31100h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f75690w, View.ALPHA, new float[]{f});
        hVar.mo87859h("opacity").mo87867a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75690w, View.SCALE_X, new float[]{f2});
        hVar.mo87859h("scale").mo87867a(ofFloat2);
        mo89835k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f75690w, View.SCALE_Y, new float[]{f2});
        hVar.mo87859h("scale").mo87867a(ofFloat3);
        mo89835k0(ofFloat3);
        arrayList.add(ofFloat3);
        mo89828h(f3, this.f75666B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f75690w, new C31098f(), new C31363c(), new Matrix[]{new Matrix(this.f75666B)});
        hVar.mo87859h("iconScale").mo87867a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C31094b.m124650a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i0 */
    public final void mo89831i0() {
        Rect rect = this.f75692y;
        mo89843s(rect);
        mo89798G(rect);
        this.f75691x.mo89751a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: j */
    public final AnimatorSet mo89832j(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C31364d(this.f75690w.getAlpha(), f, this.f75690w.getScaleX(), f2, this.f75690w.getScaleY(), this.f75684q, f3, new Matrix(this.f75666B)));
        arrayList.add(ofFloat);
        C31094b.m124650a(animatorSet, arrayList);
        animatorSet.setDuration((long) C31441a.m127036d(this.f75690w.getContext(), C31076a.C31079c.motionDurationLong1, this.f75690w.getContext().getResources().getInteger(C31076a.C31085i.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C31441a.m127037e(this.f75690w.getContext(), C31076a.C31079c.motionEasingStandard, C31093a.f74426b));
        return animatorSet;
    }

    /* renamed from: j0 */
    public void mo89833j0(float f) {
        C31525j jVar = this.f75669b;
        if (jVar != null) {
            jVar.mo90775n0(f);
        }
    }

    @C0359n0
    /* renamed from: k */
    public final ValueAnimator mo89834k(@C0359n0 C31373m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f75644D);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k0 */
    public final void mo89835k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C31365e());
        }
    }

    /* renamed from: l */
    public C31525j mo89836l() {
        return new C31525j((C31534o) C18001r.m81775l(this.f75668a));
    }

    @C0363p0
    /* renamed from: m */
    public final Drawable mo89837m() {
        return this.f75672e;
    }

    /* renamed from: n */
    public float mo89838n() {
        return this.f75675h;
    }

    /* renamed from: o */
    public boolean mo89839o() {
        return this.f75673f;
    }

    @C0363p0
    /* renamed from: p */
    public final C31100h mo89840p() {
        return this.f75682o;
    }

    /* renamed from: q */
    public float mo89841q() {
        return this.f75676i;
    }

    @C0359n0
    /* renamed from: r */
    public final ViewTreeObserver.OnPreDrawListener mo89842r() {
        if (this.f75667C == null) {
            this.f75667C = new C31366f();
        }
        return this.f75667C;
    }

    /* renamed from: s */
    public void mo89843s(@C0359n0 Rect rect) {
        int i;
        float f;
        if (this.f75673f) {
            i = (this.f75678k - this.f75690w.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f75674g) {
            f = mo89838n() + this.f75677j;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, (int) Math.ceil((double) (f * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: t */
    public float mo89844t() {
        return this.f75677j;
    }

    @C0363p0
    /* renamed from: u */
    public final C31534o mo89845u() {
        return this.f75668a;
    }

    @C0363p0
    /* renamed from: v */
    public final C31100h mo89846v() {
        return this.f75681n;
    }

    /* renamed from: w */
    public void mo89847w(@C0363p0 C31371k kVar, boolean z) {
        int i;
        AnimatorSet animatorSet;
        if (!mo89849y()) {
            Animator animator = this.f75680m;
            if (animator != null) {
                animator.cancel();
            }
            if (mo89821d0()) {
                C31100h hVar = this.f75682o;
                if (hVar != null) {
                    animatorSet = mo89830i(hVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = mo89832j(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new C31361a(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f75688u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.f75690w;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.mo89988c(i, z);
            if (kVar != null) {
                kVar.mo89750b();
            }
        }
    }

    /* renamed from: x */
    public void mo89848x(ColorStateList colorStateList, @C0363p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C31525j l = mo89836l();
        this.f75669b = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f75669b.setTintMode(mode);
        }
        this.f75669b.mo90792v0(-12303292);
        this.f75669b.mo90750Z(this.f75690w.getContext());
        C31508a aVar = new C31508a(this.f75669b.getShapeAppearanceModel());
        aVar.setTintList(C31511b.m127405d(colorStateList2));
        this.f75670c = aVar;
        this.f75672e = new LayerDrawable(new Drawable[]{(Drawable) C18001r.m81775l(this.f75669b), aVar});
    }

    /* renamed from: y */
    public boolean mo89849y() {
        if (this.f75690w.getVisibility() == 0) {
            if (this.f75686s == 1) {
                return true;
            }
            return false;
        } else if (this.f75686s != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z */
    public boolean mo89850z() {
        if (this.f75690w.getVisibility() != 0) {
            if (this.f75686s == 2) {
                return true;
            }
            return false;
        } else if (this.f75686s != 1) {
            return true;
        } else {
            return false;
        }
    }
}
