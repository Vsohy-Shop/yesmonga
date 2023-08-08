package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.x0 */
public class C20685x0 {

    /* renamed from: a */
    public static boolean f53343a = true;

    /* renamed from: b */
    public static Method f53344b;

    /* renamed from: c */
    public static boolean f53345c;

    /* renamed from: a */
    public static int m96146a(@C0359n0 ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f53345c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f53344b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53345c = true;
        }
        Method method = f53344b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C20678u0 m96147b(@C0359n0 ViewGroup viewGroup) {
        return new C20675t0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    @C0376v0(18)
    /* renamed from: c */
    public static void m96148c(@C0359n0 ViewGroup viewGroup, boolean z) {
        if (f53343a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f53343a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m96149d(@C0359n0 ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m96148c(viewGroup, z);
        }
    }
}
