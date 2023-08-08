package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.C0327c1;
import androidx.annotation.C0328d;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0455b;
import androidx.appcompat.app.C0499v;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.widget.C0793t1;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1869c;
import androidx.core.p027os.C17772a;
import androidx.core.p027os.C17812o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.appcompat.app.i */
public abstract class C0481i {

    /* renamed from: E0 */
    public static final C1869c<WeakReference<C0481i>> f1234E0 = new C1869c<>();

    /* renamed from: F0 */
    public static final Object f1235F0 = new Object();

    /* renamed from: G0 */
    public static final Object f1236G0 = new Object();

    /* renamed from: H0 */
    public static final int f1237H0 = 108;

    /* renamed from: I0 */
    public static final int f1238I0 = 109;

    /* renamed from: J0 */
    public static final int f1239J0 = 10;

    /* renamed from: X */
    public static C17812o f1240X = null;

    /* renamed from: Y */
    public static Boolean f1241Y = null;

    /* renamed from: Z */
    public static boolean f1242Z = false;

    /* renamed from: a */
    public static final boolean f1243a = false;

    /* renamed from: b */
    public static final String f1244b = "AppCompatDelegate";

    /* renamed from: c */
    public static C0499v.C0500a f1245c = new C0499v.C0500a(new C0499v.C0501b());

    /* renamed from: d */
    public static final int f1246d = -1;
    @Deprecated

    /* renamed from: e */
    public static final int f1247e = 0;
    @Deprecated

    /* renamed from: f */
    public static final int f1248f = 0;

    /* renamed from: g */
    public static final int f1249g = 1;

    /* renamed from: v */
    public static final int f1250v = 2;

    /* renamed from: w */
    public static final int f1251w = 3;

    /* renamed from: x */
    public static final int f1252x = -100;

    /* renamed from: y */
    public static int f1253y = -100;

    /* renamed from: z */
    public static C17812o f1254z = null;

    @C0376v0(24)
    /* renamed from: androidx.appcompat.app.i$a */
    public static class C0482a {
        @C0373u
        /* renamed from: a */
        public static LocaleList m2284a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.appcompat.app.i$b */
    public static class C0483b {
        @C0373u
        /* renamed from: a */
        public static LocaleList m2285a(Object obj) {
            return C0485j.m2287a(obj).getApplicationLocales();
        }

        @C0373u
        /* renamed from: b */
        public static void m2286b(Object obj, LocaleList localeList) {
            C0485j.m2287a(obj).setApplicationLocales(localeList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.i$c */
    public @interface C0484c {
    }

    @C0363p0
    /* renamed from: A */
    public static C17812o m2222A() {
        return f1254z;
    }

    @C0363p0
    /* renamed from: B */
    public static C17812o m2223B() {
        return f1240X;
    }

    /* renamed from: G */
    public static boolean m2224G(Context context) {
        if (f1241Y == null) {
            try {
                Bundle bundle = C0496t.m2324a(context).metaData;
                if (bundle != null) {
                    f1241Y = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f1241Y = Boolean.FALSE;
            }
        }
        return f1241Y.booleanValue();
    }

    /* renamed from: H */
    public static boolean m2225H() {
        return C0793t1.m3853b();
    }

    /* renamed from: K */
    public static /* synthetic */ void m2227K(Context context) {
        C0499v.m2328c(context);
        f1242Z = true;
    }

    /* renamed from: T */
    public static void m2228T(@C0359n0 C0481i iVar) {
        synchronized (f1235F0) {
            m2229U(iVar);
        }
    }

    /* renamed from: U */
    public static void m2229U(@C0359n0 C0481i iVar) {
        synchronized (f1235F0) {
            Iterator<WeakReference<C0481i>> it = f1234E0.iterator();
            while (it.hasNext()) {
                C0481i iVar2 = (C0481i) it.next().get();
                if (iVar2 == iVar || iVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    @C0344h1
    /* renamed from: W */
    public static void m2230W() {
        f1254z = null;
        f1240X = null;
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: X */
    public static void m2231X(@C0359n0 C17812o oVar) {
        Objects.requireNonNull(oVar);
        if (C17772a.m81155k()) {
            Object y = m2247y();
            if (y != null) {
                C0483b.m2286b(y, C0482a.m2284a(oVar.mo52240m()));
            }
        } else if (!oVar.equals(f1254z)) {
            synchronized (f1235F0) {
                f1254z = oVar;
                m2239j();
            }
        }
    }

    /* renamed from: Y */
    public static void m2232Y(boolean z) {
        C0793t1.m3854c(z);
    }

    /* renamed from: c0 */
    public static void m2234c0(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f1253y != i) {
            f1253y = i;
            m2238i();
        }
    }

    /* renamed from: e */
    public static void m2236e(@C0359n0 C0481i iVar) {
        synchronized (f1235F0) {
            m2229U(iVar);
            f1234E0.add(new WeakReference(iVar));
        }
    }

    @C0344h1
    /* renamed from: e0 */
    public static void m2237e0(boolean z) {
        f1241Y = Boolean.valueOf(z);
    }

    /* renamed from: i */
    public static void m2238i() {
        synchronized (f1235F0) {
            Iterator<WeakReference<C0481i>> it = f1234E0.iterator();
            while (it.hasNext()) {
                C0481i iVar = (C0481i) it.next().get();
                if (iVar != null) {
                    iVar.mo1127h();
                }
            }
        }
    }

    /* renamed from: j */
    public static void m2239j() {
        Iterator<WeakReference<C0481i>> it = f1234E0.iterator();
        while (it.hasNext()) {
            C0481i iVar = (C0481i) it.next().get();
            if (iVar != null) {
                iVar.mo1124g();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    @androidx.annotation.C0368r0(markerClass = {androidx.core.p027os.C17772a.C17773a.class})
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2240l0(android.content.Context r3) {
        /*
            boolean r0 = m2224G(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.p027os.C17772a.m81155k()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f1242Z
            if (r0 != 0) goto L_0x0054
            androidx.appcompat.app.v$a r0 = f1245c
            androidx.appcompat.app.h r1 = new androidx.appcompat.app.h
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0054
        L_0x001c:
            java.lang.Object r0 = f1236G0
            monitor-enter(r0)
            androidx.core.os.o r1 = f1254z     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0040
            androidx.core.os.o r1 = f1240X     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0031
            java.lang.String r3 = androidx.appcompat.app.C0499v.m2327b(r3)     // Catch:{ all -> 0x0055 }
            androidx.core.os.o r3 = androidx.core.p027os.C17812o.m81211c(r3)     // Catch:{ all -> 0x0055 }
            f1240X = r3     // Catch:{ all -> 0x0055 }
        L_0x0031:
            androidx.core.os.o r3 = f1240X     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.mo52238j()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x003b
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x003b:
            androidx.core.os.o r3 = f1240X     // Catch:{ all -> 0x0055 }
            f1254z = r3     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x0040:
            androidx.core.os.o r2 = f1240X     // Catch:{ all -> 0x0055 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0053
            androidx.core.os.o r1 = f1254z     // Catch:{ all -> 0x0055 }
            f1240X = r1     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.mo52240m()     // Catch:{ all -> 0x0055 }
            androidx.appcompat.app.C0499v.m2326a(r3, r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0481i.m2240l0(android.content.Context):void");
    }

    @C0359n0
    /* renamed from: n */
    public static C0481i m2241n(@C0359n0 Activity activity, @C0363p0 C0478f fVar) {
        return new AppCompatDelegateImpl(activity, fVar);
    }

    @C0359n0
    /* renamed from: o */
    public static C0481i m2242o(@C0359n0 Dialog dialog, @C0363p0 C0478f fVar) {
        return new AppCompatDelegateImpl(dialog, fVar);
    }

    @C0359n0
    /* renamed from: p */
    public static C0481i m2243p(@C0359n0 Context context, @C0359n0 Activity activity, @C0363p0 C0478f fVar) {
        return new AppCompatDelegateImpl(context, activity, fVar);
    }

    @C0359n0
    /* renamed from: q */
    public static C0481i m2244q(@C0359n0 Context context, @C0359n0 Window window, @C0363p0 C0478f fVar) {
        return new AppCompatDelegateImpl(context, window, fVar);
    }

    @C0328d
    @C0359n0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: t */
    public static C17812o m2245t() {
        if (C17772a.m81155k()) {
            Object y = m2247y();
            if (y != null) {
                return C17812o.m81216o(C0483b.m2285a(y));
            }
        } else {
            C17812o oVar = f1254z;
            if (oVar != null) {
                return oVar;
            }
        }
        return C17812o.m81214g();
    }

    /* renamed from: v */
    public static int m2246v() {
        return f1253y;
    }

    @C0376v0(33)
    /* renamed from: y */
    public static Object m2247y() {
        Context u;
        Iterator<WeakReference<C0481i>> it = f1234E0.iterator();
        while (it.hasNext()) {
            C0481i iVar = (C0481i) it.next().get();
            if (iVar != null && (u = iVar.mo1158u()) != null) {
                return u.getSystemService("locale");
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: C */
    public abstract C0441a mo1073C();

    /* renamed from: D */
    public abstract boolean mo1075D(int i);

    /* renamed from: E */
    public abstract void mo1077E();

    /* renamed from: F */
    public abstract void mo1079F();

    /* renamed from: I */
    public abstract boolean mo1082I();

    /* renamed from: L */
    public abstract void mo1086L(Configuration configuration);

    /* renamed from: M */
    public abstract void mo1088M(Bundle bundle);

    /* renamed from: N */
    public abstract void mo1090N();

    /* renamed from: O */
    public abstract void mo1092O(Bundle bundle);

    /* renamed from: P */
    public abstract void mo1094P();

    /* renamed from: Q */
    public abstract void mo1096Q(Bundle bundle);

    /* renamed from: R */
    public abstract void mo1098R();

    /* renamed from: S */
    public abstract void mo1100S();

    /* renamed from: V */
    public abstract boolean mo1104V(int i);

    /* renamed from: Z */
    public abstract void mo1109Z(@C0347i0 int i);

    /* renamed from: a0 */
    public abstract void mo1112a0(View view);

    /* renamed from: b0 */
    public abstract void mo1115b0(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d0 */
    public abstract void mo1118d0(boolean z);

    /* renamed from: f */
    public abstract void mo1121f(View view, ViewGroup.LayoutParams layoutParams);

    @C0376v0(17)
    /* renamed from: f0 */
    public abstract void mo1122f0(int i);

    /* renamed from: g */
    public boolean mo1124g() {
        return false;
    }

    @C0376v0(33)
    @C0346i
    /* renamed from: g0 */
    public void mo1125g0(@C0363p0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: h */
    public abstract boolean mo1127h();

    /* renamed from: h0 */
    public abstract void mo1128h0(@C0363p0 Toolbar toolbar);

    /* renamed from: i0 */
    public void mo1130i0(@C0327c1 int i) {
    }

    /* renamed from: j0 */
    public abstract void mo1132j0(@C0363p0 CharSequence charSequence);

    /* renamed from: k */
    public void mo1517k(Context context) {
        f1245c.execute(new C0479g(context));
    }

    @C0363p0
    /* renamed from: k0 */
    public abstract C0535b mo1134k0(@C0359n0 C0535b.C0536a aVar);

    @Deprecated
    /* renamed from: l */
    public void mo1518l(Context context) {
    }

    @C0359n0
    @C0346i
    /* renamed from: m */
    public Context mo1137m(@C0359n0 Context context) {
        mo1518l(context);
        return context;
    }

    /* renamed from: r */
    public abstract View mo1150r(@C0363p0 View view, String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet);

    @C0363p0
    /* renamed from: s */
    public abstract <T extends View> T mo1153s(@C0329d0 int i);

    @C0363p0
    /* renamed from: u */
    public Context mo1158u() {
        return null;
    }

    @C0363p0
    /* renamed from: w */
    public abstract C0455b.C0457b mo1163w();

    /* renamed from: x */
    public int mo1166x() {
        return -100;
    }

    /* renamed from: z */
    public abstract MenuInflater mo1171z();
}
