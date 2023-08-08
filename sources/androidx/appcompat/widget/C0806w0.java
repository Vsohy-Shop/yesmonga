package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.C0508a;
import androidx.appcompat.resources.C0526a;
import androidx.appcompat.resources.C0530b;
import androidx.collection.C1875h;
import androidx.collection.C1879j;
import androidx.collection.C1886l;
import androidx.collection.C1887m;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.vectordrawable.graphics.drawable.C20718c;
import androidx.vectordrawable.graphics.drawable.C20729i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.w0 */
public final class C0806w0 {

    /* renamed from: h */
    public static final String f2605h = "ResourceManagerInternal";

    /* renamed from: i */
    public static final boolean f2606i = false;

    /* renamed from: j */
    public static final PorterDuff.Mode f2607j = PorterDuff.Mode.SRC_IN;

    /* renamed from: k */
    public static final String f2608k = "appcompat_skip_skip";

    /* renamed from: l */
    public static final String f2609l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: m */
    public static C0806w0 f2610m;

    /* renamed from: n */
    public static final C0809c f2611n = new C0809c(6);

    /* renamed from: a */
    public WeakHashMap<Context, C1887m<ColorStateList>> f2612a;

    /* renamed from: b */
    public C1886l<String, C0811e> f2613b;

    /* renamed from: c */
    public C1887m<String> f2614c;

    /* renamed from: d */
    public final WeakHashMap<Context, C1875h<WeakReference<Drawable.ConstantState>>> f2615d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f2616e;

    /* renamed from: f */
    public boolean f2617f;

    /* renamed from: g */
    public C0812f f2618g;

    /* renamed from: androidx.appcompat.widget.w0$a */
    public static class C0807a implements C0811e {
        /* renamed from: a */
        public Drawable mo3755a(@C0359n0 Context context, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) {
            try {
                return C0508a.m2348C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    public static class C0808b implements C0811e {
        /* renamed from: a */
        public Drawable mo3755a(@C0359n0 Context context, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) {
            try {
                return C20718c.m96178f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$c */
    public static class C0809c extends C1879j<Integer, PorterDuffColorFilter> {
        public C0809c(int i) {
            super(i);
        }

        /* renamed from: s */
        public static int m3908s(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: t */
        public PorterDuffColorFilter mo3756t(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo6246f(Integer.valueOf(m3908s(i, mode)));
        }

        /* renamed from: u */
        public PorterDuffColorFilter mo3757u(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo6250j(Integer.valueOf(m3908s(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$d */
    public static class C0810d implements C0811e {
        /* renamed from: a */
        public Drawable mo3755a(@C0359n0 Context context, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0810d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C0526a.C0529c.m2477c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$e */
    public interface C0811e {
        /* renamed from: a */
        Drawable mo3755a(@C0359n0 Context context, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.w0$f */
    public interface C0812f {
        @C0363p0
        /* renamed from: a */
        Drawable mo3433a(@C0359n0 C0806w0 w0Var, @C0359n0 Context context, @C0375v int i);

        @C0363p0
        /* renamed from: b */
        ColorStateList mo3434b(@C0359n0 Context context, @C0375v int i);

        /* renamed from: c */
        boolean mo3435c(@C0359n0 Context context, @C0375v int i, @C0359n0 Drawable drawable);

        @C0363p0
        /* renamed from: d */
        PorterDuff.Mode mo3436d(int i);

        /* renamed from: e */
        boolean mo3437e(@C0359n0 Context context, @C0375v int i, @C0359n0 Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.w0$g */
    public static class C0813g implements C0811e {
        /* renamed from: a */
        public Drawable mo3755a(@C0359n0 Context context, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) {
            try {
                return C20729i.m96220f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m3882e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m3883g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m3885l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0806w0 m3884h() {
        C0806w0 w0Var;
        synchronized (C0806w0.class) {
            if (f2610m == null) {
                C0806w0 w0Var2 = new C0806w0();
                f2610m = w0Var2;
                m3886p(w0Var2);
            }
            w0Var = f2610m;
        }
        return w0Var;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m3885l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter t;
        synchronized (C0806w0.class) {
            C0809c cVar = f2611n;
            t = cVar.mo3756t(i, mode);
            if (t == null) {
                t = new PorterDuffColorFilter(i, mode);
                cVar.mo3757u(i, mode, t);
            }
        }
        return t;
    }

    /* renamed from: p */
    public static void m3886p(@C0359n0 C0806w0 w0Var) {
    }

    /* renamed from: q */
    public static boolean m3887q(@C0359n0 Drawable drawable) {
        if ((drawable instanceof C20729i) || f2609l.equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static void m3888w(Drawable drawable, C0715f1 f1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z;
        int[] state = drawable.getState();
        if (C0725i0.m3580a(drawable)) {
            if (drawable.mutate() == drawable) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = f1Var.f2375d;
        if (z2 || f1Var.f2374c) {
            if (z2) {
                colorStateList = f1Var.f2372a;
            } else {
                colorStateList = null;
            }
            if (f1Var.f2374c) {
                mode = f1Var.f2373b;
            } else {
                mode = f2607j;
            }
            drawable.setColorFilter(m3883g(colorStateList, mode, iArr));
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: a */
    public final void mo3738a(@C0359n0 String str, @C0359n0 C0811e eVar) {
        if (this.f2613b == null) {
            this.f2613b = new C1886l<>();
        }
        this.f2613b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo3739b(@C0359n0 Context context, long j, @C0359n0 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C1875h hVar = this.f2615d.get(context);
        if (hVar == null) {
            hVar = new C1875h();
            this.f2615d.put(context, hVar);
        }
        hVar.mo6229t(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    public final void mo3740c(@C0359n0 Context context, @C0375v int i, @C0359n0 ColorStateList colorStateList) {
        if (this.f2612a == null) {
            this.f2612a = new WeakHashMap<>();
        }
        C1887m mVar = this.f2612a.get(context);
        if (mVar == null) {
            mVar = new C1887m();
            this.f2612a.put(context, mVar);
        }
        mVar.mo6355b(i, colorStateList);
    }

    /* renamed from: d */
    public final void mo3741d(@C0359n0 Context context) {
        if (!this.f2617f) {
            this.f2617f = true;
            Drawable j = mo3744j(context, C0530b.C0531a.abc_vector_test);
            if (j == null || !m3887q(j)) {
                this.f2617f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: f */
    public final Drawable mo3742f(@C0359n0 Context context, @C0375v int i) {
        Drawable drawable;
        if (this.f2616e == null) {
            this.f2616e = new TypedValue();
        }
        TypedValue typedValue = this.f2616e;
        context.getResources().getValue(i, typedValue, true);
        long e = m3882e(typedValue);
        Drawable i2 = mo3743i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0812f fVar = this.f2618g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo3433a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo3739b(context, e, drawable);
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo3743i(@androidx.annotation.C0359n0 android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.h<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f2615d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.h r0 = (androidx.collection.C1875h) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo6223k(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo6233x(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0806w0.mo3743i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: j */
    public synchronized Drawable mo3744j(@C0359n0 Context context, @C0375v int i) {
        return mo3745k(context, i, false);
    }

    /* renamed from: k */
    public synchronized Drawable mo3745k(@C0359n0 Context context, @C0375v int i, boolean z) {
        Drawable r;
        mo3741d(context);
        r = mo3749r(context, i);
        if (r == null) {
            r = mo3742f(context, i);
        }
        if (r == null) {
            r = C17318d.m79726i(context, i);
        }
        if (r != null) {
            r = mo3753v(context, i, z, r);
        }
        if (r != null) {
            C0725i0.m3581b(r);
        }
        return r;
    }

    /* renamed from: m */
    public synchronized ColorStateList mo3746m(@C0359n0 Context context, @C0375v int i) {
        ColorStateList n;
        n = mo3747n(context, i);
        if (n == null) {
            C0812f fVar = this.f2618g;
            if (fVar == null) {
                n = null;
            } else {
                n = fVar.mo3434b(context, i);
            }
            if (n != null) {
                mo3740c(context, i, n);
            }
        }
        return n;
    }

    /* renamed from: n */
    public final ColorStateList mo3747n(@C0359n0 Context context, @C0375v int i) {
        C1887m mVar;
        WeakHashMap<Context, C1887m<ColorStateList>> weakHashMap = this.f2612a;
        if (weakHashMap == null || (mVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) mVar.mo6363k(i);
    }

    /* renamed from: o */
    public PorterDuff.Mode mo3748o(int i) {
        C0812f fVar = this.f2618g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo3436d(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo3749r(@androidx.annotation.C0359n0 android.content.Context r11, @androidx.annotation.C0375v int r12) {
        /*
            r10 = this;
            androidx.collection.l<java.lang.String, androidx.appcompat.widget.w0$e> r0 = r10.f2613b
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00aa
            androidx.collection.m<java.lang.String> r0 = r10.f2614c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo6363k(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.l<java.lang.String, androidx.appcompat.widget.w0$e> r3 = r10.f2613b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.m r0 = new androidx.collection.m
            r0.<init>()
            r10.f2614c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f2616e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f2616e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f2616e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m3882e(r0)
            android.graphics.drawable.Drawable r6 = r10.mo3743i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a2
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.m<java.lang.String> r8 = r10.f2614c     // Catch:{ Exception -> 0x00a2 }
            r8.mo6355b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.l<java.lang.String, androidx.appcompat.widget.w0$e> r8 = r10.f2613b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.w0$e r3 = (androidx.appcompat.widget.C0806w0.C0811e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo3755a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00a2
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.mo3739b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a2
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            if (r6 != 0) goto L_0x00a9
            androidx.collection.m<java.lang.String> r11 = r10.f2614c
            r11.mo6355b(r12, r2)
        L_0x00a9:
            return r6
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0806w0.mo3749r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    public synchronized void mo3750s(@C0359n0 Context context) {
        C1875h hVar = this.f2615d.get(context);
        if (hVar != null) {
            hVar.mo6216c();
        }
    }

    /* renamed from: t */
    public synchronized Drawable mo3751t(@C0359n0 Context context, @C0359n0 C0793t1 t1Var, @C0375v int i) {
        Drawable r = mo3749r(context, i);
        if (r == null) {
            r = t1Var.mo3758a(i);
        }
        if (r == null) {
            return null;
        }
        return mo3753v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo3752u(C0812f fVar) {
        this.f2618g = fVar;
    }

    /* renamed from: v */
    public final Drawable mo3753v(@C0359n0 Context context, @C0375v int i, boolean z, @C0359n0 Drawable drawable) {
        ColorStateList m = mo3746m(context, i);
        if (m != null) {
            if (C0725i0.m3580a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C17549d.m80456r(drawable);
            C17549d.m80453o(r, m);
            PorterDuff.Mode o = mo3748o(i);
            if (o == null) {
                return r;
            }
            C17549d.m80454p(r, o);
            return r;
        }
        C0812f fVar = this.f2618g;
        if ((fVar == null || !fVar.mo3437e(context, i, drawable)) && !mo3754x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: x */
    public boolean mo3754x(@C0359n0 Context context, @C0375v int i, @C0359n0 Drawable drawable) {
        C0812f fVar = this.f2618g;
        return fVar != null && fVar.mo3435c(context, i, drawable);
    }
}
