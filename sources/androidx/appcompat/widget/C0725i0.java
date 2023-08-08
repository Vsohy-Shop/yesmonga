package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17549d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.i0 */
public class C0725i0 {

    /* renamed from: a */
    public static final int[] f2395a = {16842912};

    /* renamed from: b */
    public static final int[] f2396b = new int[0];

    /* renamed from: c */
    public static final Rect f2397c = new Rect();

    @C0376v0(18)
    /* renamed from: androidx.appcompat.widget.i0$a */
    public static class C0726a {

        /* renamed from: a */
        public static final boolean f2398a;

        /* renamed from: b */
        public static final Method f2399b;

        /* renamed from: c */
        public static final Field f2400c;

        /* renamed from: d */
        public static final Field f2401d;

        /* renamed from: e */
        public static final Field f2402e;

        /* renamed from: f */
        public static final Field f2403f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r1
                goto L_0x0047
            L_0x002f:
                r6 = r1
                goto L_0x0046
            L_0x0031:
                r6 = r1
                goto L_0x0046
            L_0x0033:
                r6 = r1
                goto L_0x0046
            L_0x0035:
                r5 = r1
                goto L_0x003d
            L_0x0037:
                r5 = r1
                goto L_0x0041
            L_0x0039:
                r5 = r1
                goto L_0x0045
            L_0x003b:
                r4 = r1
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r1
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r1
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r3 = r1
                r8 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f2399b = r4
                f2400c = r5
                f2401d = r6
                f2402e = r7
                f2403f = r3
                f2398a = r0
                goto L_0x0064
            L_0x0058:
                f2399b = r1
                f2400c = r1
                f2401d = r1
                f2402e = r1
                f2403f = r1
                f2398a = r2
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0725i0.C0726a.<clinit>():void");
        }

        @C0359n0
        /* renamed from: a */
        public static Rect m3585a(@C0359n0 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f2398a) {
                try {
                    Object invoke = f2399b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f2400c.getInt(invoke), f2401d.getInt(invoke), f2402e.getInt(invoke), f2403f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C0725i0.f2397c;
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.appcompat.widget.i0$b */
    public static class C0727b {
        @C0373u
        /* renamed from: a */
        public static Insets m3586a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m3580a(@C0359n0 Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    public static void m3581b(@C0359n0 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m3582c(drawable);
        }
    }

    /* renamed from: c */
    public static void m3582c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2395a);
        } else {
            drawable.setState(f2396b);
        }
        drawable.setState(state);
    }

    @C0359n0
    /* renamed from: d */
    public static Rect m3583d(@C0359n0 Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C0726a.m3585a(C17549d.m80455q(drawable));
        }
        Insets a = C0727b.m3586a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m3584e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
