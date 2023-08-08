package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.C0352k;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.u1 */
public class C0796u1 {

    /* renamed from: a */
    public static final String f2592a = "ViewUtils";

    /* renamed from: b */
    public static Method f2593b;
    @C0352k(api = 27)
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: c */
    public static final boolean f2594c;

    static {
        boolean z;
        Class<Rect> cls = Rect.class;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f2594c = z;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f2593b = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f2593b.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static void m3858a(View view, Rect rect, Rect rect2) {
        Method method = f2593b;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m3859b(View view) {
        return C18196h2.m82553Z(view) == 1;
    }

    /* renamed from: c */
    public static void m3860c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
