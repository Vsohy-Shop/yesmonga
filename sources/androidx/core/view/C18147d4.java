package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18436z4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.view.d4 */
public final class C18147d4 {

    /* renamed from: b */
    public static final boolean f46749b = false;

    /* renamed from: c */
    public static final String f46750c = "WindowInsetsAnimCompat";

    /* renamed from: a */
    public C18158e f46751a;

    /* renamed from: androidx.core.view.d4$b */
    public static abstract class C18149b {

        /* renamed from: c */
        public static final int f46754c = 0;

        /* renamed from: d */
        public static final int f46755d = 1;

        /* renamed from: a */
        public WindowInsets f46756a;

        /* renamed from: b */
        public final int f46757b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.view.d4$b$a */
        public @interface C18150a {
        }

        public C18149b(int i) {
            this.f46757b = i;
        }

        /* renamed from: c */
        public final int mo52824c() {
            return this.f46757b;
        }

        /* renamed from: d */
        public void mo8198d(@C0359n0 C18147d4 d4Var) {
        }

        /* renamed from: e */
        public void mo8199e(@C0359n0 C18147d4 d4Var) {
        }

        @C0359n0
        /* renamed from: f */
        public abstract C18436z4 mo8200f(@C0359n0 C18436z4 z4Var, @C0359n0 List<C18147d4> list);

        @C0359n0
        /* renamed from: g */
        public C18148a mo8201g(@C0359n0 C18147d4 d4Var, @C0359n0 C18148a aVar) {
            return aVar;
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.d4$c */
    public static class C18151c extends C18158e {

        @C0376v0(21)
        /* renamed from: androidx.core.view.d4$c$a */
        public static class C18152a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c */
            public static final int f46758c = 160;

            /* renamed from: a */
            public final C18149b f46759a;

            /* renamed from: b */
            public C18436z4 f46760b;

            /* renamed from: androidx.core.view.d4$c$a$a */
            public class C18153a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ C18147d4 f46761a;

                /* renamed from: b */
                public final /* synthetic */ C18436z4 f46762b;

                /* renamed from: c */
                public final /* synthetic */ C18436z4 f46763c;

                /* renamed from: d */
                public final /* synthetic */ int f46764d;

                /* renamed from: e */
                public final /* synthetic */ View f46765e;

                public C18153a(C18147d4 d4Var, C18436z4 z4Var, C18436z4 z4Var2, int i, View view) {
                    this.f46761a = d4Var;
                    this.f46762b = z4Var;
                    this.f46763c = z4Var2;
                    this.f46764d = i;
                    this.f46765e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f46761a.mo52818i(valueAnimator.getAnimatedFraction());
                    C18151c.m82356n(this.f46765e, C18151c.m82360r(this.f46762b, this.f46763c, this.f46761a.mo52814d(), this.f46764d), Collections.singletonList(this.f46761a));
                }
            }

            /* renamed from: androidx.core.view.d4$c$a$b */
            public class C18154b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ C18147d4 f46767a;

                /* renamed from: b */
                public final /* synthetic */ View f46768b;

                public C18154b(C18147d4 d4Var, View view) {
                    this.f46767a = d4Var;
                    this.f46768b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f46767a.mo52818i(1.0f);
                    C18151c.m82354l(this.f46768b, this.f46767a);
                }
            }

            /* renamed from: androidx.core.view.d4$c$a$c */
            public class C18155c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ View f46770a;

                /* renamed from: b */
                public final /* synthetic */ C18147d4 f46771b;

                /* renamed from: c */
                public final /* synthetic */ C18148a f46772c;

                /* renamed from: d */
                public final /* synthetic */ ValueAnimator f46773d;

                public C18155c(View view, C18147d4 d4Var, C18148a aVar, ValueAnimator valueAnimator) {
                    this.f46770a = view;
                    this.f46771b = d4Var;
                    this.f46772c = aVar;
                    this.f46773d = valueAnimator;
                }

                public void run() {
                    C18151c.m82357o(this.f46770a, this.f46771b, this.f46772c);
                    this.f46773d.start();
                }
            }

            public C18152a(@C0359n0 View view, @C0359n0 C18149b bVar) {
                C18436z4 z4Var;
                this.f46759a = bVar;
                C18436z4 o0 = C18196h2.m82613o0(view);
                if (o0 != null) {
                    z4Var = new C18436z4.C18438b(o0).mo53157a();
                } else {
                    z4Var = null;
                }
                this.f46760b = z4Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f46760b = C18436z4.m83375L(windowInsets2, view2);
                    return C18151c.m82358p(view, windowInsets);
                }
                C18436z4 L = C18436z4.m83375L(windowInsets2, view2);
                if (this.f46760b == null) {
                    this.f46760b = C18196h2.m82613o0(view);
                }
                if (this.f46760b == null) {
                    this.f46760b = L;
                    return C18151c.m82358p(view, windowInsets);
                }
                C18149b q = C18151c.m82359q(view);
                if (q != null && Objects.equals(q.f46756a, windowInsets2)) {
                    return C18151c.m82358p(view, windowInsets);
                }
                int i = C18151c.m82351i(L, this.f46760b);
                if (i == 0) {
                    return C18151c.m82358p(view, windowInsets);
                }
                C18436z4 z4Var = this.f46760b;
                C18147d4 d4Var = new C18147d4(i, new DecelerateInterpolator(), 160);
                d4Var.mo52818i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(d4Var.mo52812b());
                C18148a j = C18151c.m82352j(L, z4Var, i);
                C18151c.m82355m(view2, d4Var, windowInsets2, false);
                duration.addUpdateListener(new C18153a(d4Var, L, z4Var, i, view));
                duration.addListener(new C18154b(d4Var, view2));
                C18024a2.m81875a(view2, new C18155c(view, d4Var, j, duration));
                this.f46760b = L;
                return C18151c.m82358p(view, windowInsets);
            }
        }

        public C18151c(int i, @C0363p0 Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: i */
        public static int m82351i(@C0359n0 C18436z4 z4Var, @C0359n0 C18436z4 z4Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!z4Var.mo53136f(i2).equals(z4Var2.mo53136f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @C0359n0
        /* renamed from: j */
        public static C18148a m82352j(@C0359n0 C18436z4 z4Var, @C0359n0 C18436z4 z4Var2, int i) {
            C17616m0 f = z4Var.mo53136f(i);
            C17616m0 f2 = z4Var2.mo53136f(i);
            return new C18148a(C17616m0.m80697d(Math.min(f.f45995a, f2.f45995a), Math.min(f.f45996b, f2.f45996b), Math.min(f.f45997c, f2.f45997c), Math.min(f.f45998d, f2.f45998d)), C17616m0.m80697d(Math.max(f.f45995a, f2.f45995a), Math.max(f.f45996b, f2.f45996b), Math.max(f.f45997c, f2.f45997c), Math.max(f.f45998d, f2.f45998d)));
        }

        @C0359n0
        /* renamed from: k */
        public static View.OnApplyWindowInsetsListener m82353k(@C0359n0 View view, @C0359n0 C18149b bVar) {
            return new C18152a(view, bVar);
        }

        /* renamed from: l */
        public static void m82354l(@C0359n0 View view, @C0359n0 C18147d4 d4Var) {
            C18149b q = m82359q(view);
            if (q != null) {
                q.mo8198d(d4Var);
                if (q.mo52824c() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m82354l(viewGroup.getChildAt(i), d4Var);
                }
            }
        }

        /* renamed from: m */
        public static void m82355m(View view, C18147d4 d4Var, WindowInsets windowInsets, boolean z) {
            C18149b q = m82359q(view);
            if (q != null) {
                q.f46756a = windowInsets;
                if (!z) {
                    q.mo8199e(d4Var);
                    if (q.mo52824c() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m82355m(viewGroup.getChildAt(i), d4Var, windowInsets, z);
                }
            }
        }

        /* renamed from: n */
        public static void m82356n(@C0359n0 View view, @C0359n0 C18436z4 z4Var, @C0359n0 List<C18147d4> list) {
            C18149b q = m82359q(view);
            if (q != null) {
                z4Var = q.mo8200f(z4Var, list);
                if (q.mo52824c() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m82356n(viewGroup.getChildAt(i), z4Var, list);
                }
            }
        }

        /* renamed from: o */
        public static void m82357o(View view, C18147d4 d4Var, C18148a aVar) {
            C18149b q = m82359q(view);
            if (q != null) {
                q.mo8201g(d4Var, aVar);
                if (q.mo52824c() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m82357o(viewGroup.getChildAt(i), d4Var, aVar);
                }
            }
        }

        @C0359n0
        /* renamed from: p */
        public static WindowInsets m82358p(@C0359n0 View view, @C0359n0 WindowInsets windowInsets) {
            if (view.getTag(C16986a.C16991e.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        @C0363p0
        /* renamed from: q */
        public static C18149b m82359q(View view) {
            Object tag = view.getTag(C16986a.C16991e.tag_window_insets_animation_callback);
            if (tag instanceof C18152a) {
                return ((C18152a) tag).f46759a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: r */
        public static C18436z4 m82360r(C18436z4 z4Var, C18436z4 z4Var2, float f, int i) {
            C18436z4.C18438b bVar = new C18436z4.C18438b(z4Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.mo53159c(i2, z4Var.mo53136f(i2));
                } else {
                    C17616m0 f2 = z4Var.mo53136f(i2);
                    C17616m0 f3 = z4Var2.mo53136f(i2);
                    float f4 = 1.0f - f;
                    bVar.mo53159c(i2, C18436z4.m83376z(f2, (int) (((double) (((float) (f2.f45995a - f3.f45995a)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f45996b - f3.f45996b)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f45997c - f3.f45997c)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f45998d - f3.f45998d)) * f4)) + 0.5d)));
                }
            }
            return bVar.mo53157a();
        }

        /* renamed from: s */
        public static void m82361s(@C0359n0 View view, @C0363p0 C18149b bVar) {
            Object tag = view.getTag(C16986a.C16991e.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(C16986a.C16991e.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener k = m82353k(view, bVar);
            view.setTag(C16986a.C16991e.tag_window_insets_animation_callback, k);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(k);
            }
        }
    }

    /* renamed from: androidx.core.view.d4$e */
    public static class C18158e {

        /* renamed from: a */
        public final int f46780a;

        /* renamed from: b */
        public float f46781b;
        @C0363p0

        /* renamed from: c */
        public final Interpolator f46782c;

        /* renamed from: d */
        public final long f46783d;

        /* renamed from: e */
        public float f46784e;

        public C18158e(int i, @C0363p0 Interpolator interpolator, long j) {
            this.f46780a = i;
            this.f46782c = interpolator;
            this.f46783d = j;
        }

        /* renamed from: a */
        public float mo52840a() {
            return this.f46784e;
        }

        /* renamed from: b */
        public long mo52829b() {
            return this.f46783d;
        }

        /* renamed from: c */
        public float mo52830c() {
            return this.f46781b;
        }

        /* renamed from: d */
        public float mo52831d() {
            Interpolator interpolator = this.f46782c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f46781b);
            }
            return this.f46781b;
        }

        @C0363p0
        /* renamed from: e */
        public Interpolator mo52832e() {
            return this.f46782c;
        }

        /* renamed from: f */
        public int mo52833f() {
            return this.f46780a;
        }

        /* renamed from: g */
        public void mo52841g(float f) {
            this.f46784e = f;
        }

        /* renamed from: h */
        public void mo52834h(float f) {
            this.f46781b = f;
        }
    }

    public C18147d4(int i, @C0363p0 Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46751a = new C18156d(i, interpolator, j);
        } else {
            this.f46751a = new C18151c(i, interpolator, j);
        }
    }

    /* renamed from: h */
    public static void m82331h(@C0359n0 View view, @C0363p0 C18149b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18156d.m82365l(view, bVar);
        } else {
            C18151c.m82361s(view, bVar);
        }
    }

    @C0376v0(30)
    /* renamed from: j */
    public static C18147d4 m82332j(WindowInsetsAnimation windowInsetsAnimation) {
        return new C18147d4(windowInsetsAnimation);
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: a */
    public float mo52811a() {
        return this.f46751a.mo52840a();
    }

    /* renamed from: b */
    public long mo52812b() {
        return this.f46751a.mo52829b();
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: c */
    public float mo52813c() {
        return this.f46751a.mo52830c();
    }

    /* renamed from: d */
    public float mo52814d() {
        return this.f46751a.mo52831d();
    }

    @C0363p0
    /* renamed from: e */
    public Interpolator mo52815e() {
        return this.f46751a.mo52832e();
    }

    /* renamed from: f */
    public int mo52816f() {
        return this.f46751a.mo52833f();
    }

    /* renamed from: g */
    public void mo52817g(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f46751a.mo52841g(f);
    }

    /* renamed from: i */
    public void mo52818i(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f46751a.mo52834h(f);
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.d4$d */
    public static class C18156d extends C18158e {
        @C0359n0

        /* renamed from: f */
        public final WindowInsetsAnimation f46775f;

        @C0376v0(30)
        /* renamed from: androidx.core.view.d4$d$a */
        public static class C18157a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final C18149b f46776a;

            /* renamed from: b */
            public List<C18147d4> f46777b;

            /* renamed from: c */
            public ArrayList<C18147d4> f46778c;

            /* renamed from: d */
            public final HashMap<WindowInsetsAnimation, C18147d4> f46779d = new HashMap<>();

            public C18157a(@C0359n0 C18149b bVar) {
                super(bVar.mo52824c());
                this.f46776a = bVar;
            }

            @C0359n0
            /* renamed from: a */
            public final C18147d4 mo52835a(@C0359n0 WindowInsetsAnimation windowInsetsAnimation) {
                C18147d4 d4Var = this.f46779d.get(windowInsetsAnimation);
                if (d4Var != null) {
                    return d4Var;
                }
                C18147d4 j = C18147d4.m82332j(windowInsetsAnimation);
                this.f46779d.put(windowInsetsAnimation, j);
                return j;
            }

            public void onEnd(@C0359n0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f46776a.mo8198d(mo52835a(windowInsetsAnimation));
                this.f46779d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@C0359n0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f46776a.mo8199e(mo52835a(windowInsetsAnimation));
            }

            @C0359n0
            public WindowInsets onProgress(@C0359n0 WindowInsets windowInsets, @C0359n0 List<WindowInsetsAnimation> list) {
                ArrayList<C18147d4> arrayList = this.f46778c;
                if (arrayList == null) {
                    ArrayList<C18147d4> arrayList2 = new ArrayList<>(list.size());
                    this.f46778c = arrayList2;
                    this.f46777b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = C18358r4.m83098a(list.get(size));
                    C18147d4 a2 = mo52835a(a);
                    a2.mo52818i(a.getFraction());
                    this.f46778c.add(a2);
                }
                return this.f46776a.mo8200f(C18436z4.m83374K(windowInsets), this.f46777b).mo53129J();
            }

            @C0359n0
            public WindowInsetsAnimation.Bounds onStart(@C0359n0 WindowInsetsAnimation windowInsetsAnimation, @C0359n0 WindowInsetsAnimation.Bounds bounds) {
                return this.f46776a.mo8201g(mo52835a(windowInsetsAnimation), C18148a.m82341e(bounds)).mo52822d();
            }
        }

        public C18156d(@C0359n0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f46775f = windowInsetsAnimation;
        }

        @C0359n0
        /* renamed from: i */
        public static WindowInsetsAnimation.Bounds m82362i(@C0359n0 C18148a aVar) {
            C18228h4.m82821a();
            return C18182g4.m82402a(aVar.mo52819a().mo52063h(), aVar.mo52820b().mo52063h());
        }

        @C0359n0
        /* renamed from: j */
        public static C17616m0 m82363j(@C0359n0 WindowInsetsAnimation.Bounds bounds) {
            return C17616m0.m80700g(bounds.getUpperBound());
        }

        @C0359n0
        /* renamed from: k */
        public static C17616m0 m82364k(@C0359n0 WindowInsetsAnimation.Bounds bounds) {
            return C17616m0.m80700g(bounds.getLowerBound());
        }

        /* renamed from: l */
        public static void m82365l(@C0359n0 View view, @C0363p0 C18149b bVar) {
            C18157a aVar;
            if (bVar != null) {
                aVar = new C18157a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        /* renamed from: b */
        public long mo52829b() {
            return this.f46775f.getDurationMillis();
        }

        /* renamed from: c */
        public float mo52830c() {
            return this.f46775f.getFraction();
        }

        /* renamed from: d */
        public float mo52831d() {
            return this.f46775f.getInterpolatedFraction();
        }

        @C0363p0
        /* renamed from: e */
        public Interpolator mo52832e() {
            return this.f46775f.getInterpolator();
        }

        /* renamed from: f */
        public int mo52833f() {
            return this.f46775f.getTypeMask();
        }

        /* renamed from: h */
        public void mo52834h(float f) {
            this.f46775f.setFraction(f);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C18156d(int i, Interpolator interpolator, long j) {
            this(C18349q4.m83076a(i, interpolator, j));
            C18174f4.m82395a();
        }
    }

    /* renamed from: androidx.core.view.d4$a */
    public static final class C18148a {

        /* renamed from: a */
        public final C17616m0 f46752a;

        /* renamed from: b */
        public final C17616m0 f46753b;

        public C18148a(@C0359n0 C17616m0 m0Var, @C0359n0 C17616m0 m0Var2) {
            this.f46752a = m0Var;
            this.f46753b = m0Var2;
        }

        @C0359n0
        @C0376v0(30)
        /* renamed from: e */
        public static C18148a m82341e(@C0359n0 WindowInsetsAnimation.Bounds bounds) {
            return new C18148a(bounds);
        }

        @C0359n0
        /* renamed from: a */
        public C17616m0 mo52819a() {
            return this.f46752a;
        }

        @C0359n0
        /* renamed from: b */
        public C17616m0 mo52820b() {
            return this.f46753b;
        }

        @C0359n0
        /* renamed from: c */
        public C18148a mo52821c(@C0359n0 C17616m0 m0Var) {
            return new C18148a(C18436z4.m83376z(this.f46752a, m0Var.f45995a, m0Var.f45996b, m0Var.f45997c, m0Var.f45998d), C18436z4.m83376z(this.f46753b, m0Var.f45995a, m0Var.f45996b, m0Var.f45997c, m0Var.f45998d));
        }

        @C0359n0
        @C0376v0(30)
        /* renamed from: d */
        public WindowInsetsAnimation.Bounds mo52822d() {
            return C18156d.m82362i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f46752a + " upper=" + this.f46753b + "}";
        }

        @C0376v0(30)
        public C18148a(@C0359n0 WindowInsetsAnimation.Bounds bounds) {
            this.f46752a = C18156d.m82364k(bounds);
            this.f46753b = C18156d.m82363j(bounds);
        }
    }

    @C0376v0(30)
    public C18147d4(@C0359n0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46751a = new C18156d(windowInsetsAnimation);
        }
    }
}
