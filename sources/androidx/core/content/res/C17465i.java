package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.C0323b0;
import androidx.annotation.C0325c;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.C0383y;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.i */
public final class C17465i {

    /* renamed from: a */
    public static final String f45758a = "ResourcesCompat";

    /* renamed from: b */
    public static final ThreadLocal<TypedValue> f45759b = new ThreadLocal<>();
    @C0323b0("sColorStateCacheLock")

    /* renamed from: c */
    public static final WeakHashMap<C17471f, SparseArray<C17470e>> f45760c = new WeakHashMap<>(0);

    /* renamed from: d */
    public static final Object f45761d = new Object();
    @C0325c

    /* renamed from: e */
    public static final int f45762e = 0;

    @C0376v0(15)
    /* renamed from: androidx.core.content.res.i$a */
    public static class C17466a {
        @C0373u
        /* renamed from: a */
        public static Drawable m80186a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.content.res.i$b */
    public static class C17467b {
        @C0373u
        /* renamed from: a */
        public static Drawable m80187a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @C0373u
        /* renamed from: b */
        public static Drawable m80188b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.content.res.i$c */
    public static class C17468c {
        @C0373u
        /* renamed from: a */
        public static int m80189a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @C0359n0
        @C0373u
        /* renamed from: b */
        public static ColorStateList m80190b(@C0359n0 Resources resources, @C0358n int i, @C0363p0 Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.content.res.i$d */
    public static class C17469d {
        @C0373u
        /* renamed from: a */
        public static float m80191a(@C0359n0 Resources resources, @C0364q int i) {
            return resources.getFloat(i);
        }
    }

    /* renamed from: androidx.core.content.res.i$e */
    public static class C17470e {

        /* renamed from: a */
        public final ColorStateList f45763a;

        /* renamed from: b */
        public final Configuration f45764b;

        /* renamed from: c */
        public final int f45765c;

        public C17470e(@C0359n0 ColorStateList colorStateList, @C0359n0 Configuration configuration, @C0363p0 Resources.Theme theme) {
            int i;
            this.f45763a = colorStateList;
            this.f45764b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f45765c = i;
        }
    }

    /* renamed from: androidx.core.content.res.i$f */
    public static final class C17471f {

        /* renamed from: a */
        public final Resources f45766a;

        /* renamed from: b */
        public final Resources.Theme f45767b;

        public C17471f(@C0359n0 Resources resources, @C0363p0 Resources.Theme theme) {
            this.f45766a = resources;
            this.f45767b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C17471f.class != obj.getClass()) {
                return false;
            }
            C17471f fVar = (C17471f) obj;
            if (!this.f45766a.equals(fVar.f45766a) || !C17992m.m81740a(this.f45767b, fVar.f45767b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C17992m.m81741b(this.f45766a, this.f45767b);
        }
    }

    /* renamed from: androidx.core.content.res.i$g */
    public static abstract class C17472g {
        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: e */
        public static Handler m80194e(@C0363p0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public final void mo51900c(int i, @C0363p0 Handler handler) {
            m80194e(handler).post(new C17478l(this, i));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public final void mo51901d(@C0359n0 Typeface typeface, @C0363p0 Handler handler) {
            m80194e(handler).post(new C17477k(this, typeface));
        }

        /* renamed from: h */
        public abstract void m80195f(int i);

        /* renamed from: i */
        public abstract void m80196g(@C0359n0 Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.i$h */
    public static final class C17473h {

        @C0376v0(23)
        /* renamed from: androidx.core.content.res.i$h$a */
        public static class C17474a {

            /* renamed from: a */
            public static final Object f45768a = new Object();

            /* renamed from: b */
            public static Method f45769b;

            /* renamed from: c */
            public static boolean f45770c;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m80202a(@androidx.annotation.C0359n0 android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = f45768a
                    monitor-enter(r0)
                    boolean r1 = f45770c     // Catch:{ all -> 0x0029 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    f45769b = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    f45770c = r1     // Catch:{ all -> 0x0029 }
                L_0x001a:
                    java.lang.reflect.Method r1 = f45769b     // Catch:{ all -> 0x0029 }
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    goto L_0x0027
                L_0x0024:
                    r6 = 0
                    f45769b = r6     // Catch:{ all -> 0x0029 }
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    return
                L_0x0029:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17465i.C17473h.C17474a.m80202a(android.content.res.Resources$Theme):void");
            }
        }

        @C0376v0(29)
        /* renamed from: androidx.core.content.res.i$h$b */
        public static class C17475b {
            @C0373u
            /* renamed from: a */
            public static void m80203a(@C0359n0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m80201a(@C0359n0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C17475b.m80203a(theme);
            } else {
                C17474a.m80202a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m80169a(@C0359n0 C17471f fVar, @C0358n int i, @C0359n0 ColorStateList colorStateList, @C0363p0 Resources.Theme theme) {
        synchronized (f45761d) {
            WeakHashMap<C17471f, SparseArray<C17470e>> weakHashMap = f45760c;
            SparseArray sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i, new C17470e(colorStateList, fVar.f45766a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static void m80170b(@C0359n0 Resources.Theme theme) {
        synchronized (f45761d) {
            Iterator<C17471f> it = f45760c.keySet().iterator();
            while (it.hasNext()) {
                C17471f next = it.next();
                if (next != null && theme.equals(next.f45767b)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    @androidx.annotation.C0363p0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m80171c(@androidx.annotation.C0359n0 androidx.core.content.res.C17465i.C17471f r5, @androidx.annotation.C0358n int r6) {
        /*
            java.lang.Object r0 = f45761d
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.i$f, android.util.SparseArray<androidx.core.content.res.i$e>> r1 = f45760c     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.i$e r2 = (androidx.core.content.res.C17465i.C17470e) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f45764b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f45766a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f45767b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f45765c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f45765c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f45763a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17465i.m80171c(androidx.core.content.res.i$f, int):android.content.res.ColorStateList");
    }

    @C0363p0
    /* renamed from: d */
    public static Typeface m80172d(@C0359n0 Context context, @C0383y int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m80184p(context, i, new TypedValue(), 0, (C17472g) null, (Handler) null, false, true);
    }

    @C0354l
    /* renamed from: e */
    public static int m80173e(@C0359n0 Resources resources, @C0358n int i, @C0363p0 Resources.Theme theme) throws Resources.NotFoundException {
        return C17468c.m80189a(resources, i, theme);
    }

    @C0363p0
    /* renamed from: f */
    public static ColorStateList m80174f(@C0359n0 Resources resources, @C0358n int i, @C0363p0 Resources.Theme theme) throws Resources.NotFoundException {
        C17471f fVar = new C17471f(resources, theme);
        ColorStateList c = m80171c(fVar, i);
        if (c != null) {
            return c;
        }
        ColorStateList n = m80182n(resources, i, theme);
        if (n == null) {
            return C17468c.m80190b(resources, i, theme);
        }
        m80169a(fVar, i, n, theme);
        return n;
    }

    @C0363p0
    /* renamed from: g */
    public static Drawable m80175g(@C0359n0 Resources resources, @C0375v int i, @C0363p0 Resources.Theme theme) throws Resources.NotFoundException {
        return C17467b.m80187a(resources, i, theme);
    }

    @C0363p0
    /* renamed from: h */
    public static Drawable m80176h(@C0359n0 Resources resources, @C0375v int i, int i2, @C0363p0 Resources.Theme theme) throws Resources.NotFoundException {
        return C17467b.m80188b(resources, i, i2, theme);
    }

    /* renamed from: i */
    public static float m80177i(@C0359n0 Resources resources, @C0364q int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C17469d.m80191a(resources, i);
        }
        TypedValue m = m80181m();
        resources.getValue(i, m, true);
        if (m.type == 4) {
            return m.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m.type) + " is not valid");
    }

    @C0363p0
    /* renamed from: j */
    public static Typeface m80178j(@C0359n0 Context context, @C0383y int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m80184p(context, i, new TypedValue(), 0, (C17472g) null, (Handler) null, false, false);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public static Typeface m80179k(@C0359n0 Context context, @C0383y int i, @C0359n0 TypedValue typedValue, int i2, @C0363p0 C17472g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m80184p(context, i, typedValue, i2, gVar, (Handler) null, true, false);
    }

    /* renamed from: l */
    public static void m80180l(@C0359n0 Context context, @C0383y int i, @C0359n0 C17472g gVar, @C0363p0 Handler handler) throws Resources.NotFoundException {
        C18001r.m81775l(gVar);
        if (context.isRestricted()) {
            gVar.mo51900c(-4, handler);
            return;
        }
        m80184p(context, i, new TypedValue(), 0, gVar, handler, false, false);
    }

    @C0359n0
    /* renamed from: m */
    public static TypedValue m80181m() {
        ThreadLocal<TypedValue> threadLocal = f45759b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @C0363p0
    /* renamed from: n */
    public static ColorStateList m80182n(Resources resources, int i, @C0363p0 Resources.Theme theme) {
        if (m80183o(resources, i)) {
            return null;
        }
        try {
            return C17452c.m80114a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m80183o(@C0359n0 Resources resources, @C0358n int i) {
        TypedValue m = m80181m();
        resources.getValue(i, m, true);
        int i2 = m.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static Typeface m80184p(@C0359n0 Context context, int i, @C0359n0 TypedValue typedValue, int i2, @C0363p0 C17472g gVar, @C0363p0 Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface q = m80185q(context, resources, typedValue, i, i2, gVar, handler, z, z2);
        if (q != null || gVar != null || z2) {
            return q;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m80185q(@androidx.annotation.C0359n0 android.content.Context r15, android.content.res.Resources r16, @androidx.annotation.C0359n0 android.util.TypedValue r17, int r18, int r19, @androidx.annotation.C0363p0 androidx.core.content.res.C17465i.C17472g r20, @androidx.annotation.C0363p0 android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00a1
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0022
            if (r10 == 0) goto L_0x0021
            r10.mo51900c(r13, r11)
        L_0x0021:
            return r14
        L_0x0022:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = androidx.core.graphics.C17530b1.m80359k(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L_0x0032
            if (r10 == 0) goto L_0x0031
            r10.mo51901d(r1, r11)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 == 0) goto L_0x0066
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            androidx.core.content.res.f$b r1 = androidx.core.content.res.C17455f.m80136b(r1, r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.mo51900c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x0050:
            return r14
        L_0x0051:
            int r5 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.C17530b1.m80354f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            return r0
        L_0x0066:
            int r4 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = androidx.core.graphics.C17530b1.m80356h(r0, r1, r2, r3, r4, r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r10 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            r10.mo51901d(r0, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            goto L_0x007f
        L_0x007c:
            r10.mo51900c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x007f:
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r12)
            goto L_0x009b
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r12)
        L_0x009b:
            if (r10 == 0) goto L_0x00a0
            r10.mo51900c(r13, r11)
        L_0x00a0:
            return r14
        L_0x00a1:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17465i.m80185q(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.i$g, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
