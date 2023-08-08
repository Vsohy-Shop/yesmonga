package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C17994n;

/* renamed from: androidx.core.graphics.o0 */
public final class C17623o0 {

    /* renamed from: a */
    public static final String f45999a = "󟿽";

    /* renamed from: b */
    public static final String f46000b = "m";

    /* renamed from: c */
    public static final ThreadLocal<C17994n<Rect, Rect>> f46001c = new ThreadLocal<>();

    @C0376v0(23)
    /* renamed from: androidx.core.graphics.o0$a */
    public static class C17624a {
        @C0373u
        /* renamed from: a */
        public static boolean m80719a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.graphics.o0$b */
    public static class C17625b {
        @C0373u
        /* renamed from: a */
        public static void m80720a(Paint paint, Object obj) {
            paint.setBlendMode(C17580g.m80549a(obj));
        }
    }

    /* renamed from: a */
    public static boolean m80716a(@C0359n0 Paint paint, @C0359n0 String str) {
        return C17624a.m80719a(paint, str);
    }

    /* renamed from: b */
    public static C17994n<Rect, Rect> m80717b() {
        ThreadLocal<C17994n<Rect, Rect>> threadLocal = f46001c;
        C17994n<Rect, Rect> nVar = threadLocal.get();
        if (nVar == null) {
            C17994n<Rect, Rect> nVar2 = new C17994n<>(new Rect(), new Rect());
            threadLocal.set(nVar2);
            return nVar2;
        }
        ((Rect) nVar.f46482a).setEmpty();
        ((Rect) nVar.f46483b).setEmpty();
        return nVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m80718c(@androidx.annotation.C0359n0 android.graphics.Paint r4, @androidx.annotation.C0363p0 androidx.core.graphics.BlendModeCompat r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0012
            if (r5 == 0) goto L_0x000e
            java.lang.Object r3 = androidx.core.graphics.C17594i.C17596b.m80638a(r5)
        L_0x000e:
            androidx.core.graphics.C17623o0.C17625b.m80720a(r4, r3)
            return r2
        L_0x0012:
            if (r5 == 0) goto L_0x0027
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.C17594i.m80637a(r5)
            if (r5 == 0) goto L_0x001f
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            r3.<init>(r5)
        L_0x001f:
            r4.setXfermode(r3)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            return r2
        L_0x0027:
            r4.setXfermode(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C17623o0.m80718c(android.graphics.Paint, androidx.core.graphics.BlendModeCompat):boolean");
    }
}
