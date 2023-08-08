package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.p3 */
public final class C18338p3 {

    /* renamed from: a */
    public static final String f47050a = "ViewConfigCompat";

    /* renamed from: b */
    public static Method f47051b;

    @C0376v0(26)
    /* renamed from: androidx.core.view.p3$a */
    public static class C18339a {
        @C0373u
        /* renamed from: a */
        public static float m83065a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @C0373u
        /* renamed from: b */
        public static float m83066b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.view.p3$b */
    public static class C18340b {
        @C0373u
        /* renamed from: a */
        public static int m83067a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m83068b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f47051b = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m83058a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f47051b) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m83059b(@C0359n0 ViewConfiguration viewConfiguration, @C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18339a.m83065a(viewConfiguration);
        }
        return m83058a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m83060c(@C0359n0 ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18340b.m83067a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    @Deprecated
    /* renamed from: d */
    public static int m83061d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: e */
    public static float m83062e(@C0359n0 ViewConfiguration viewConfiguration, @C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18339a.m83066b(viewConfiguration);
        }
        return m83058a(viewConfiguration, context);
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m83063f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    /* renamed from: g */
    public static boolean m83064g(@C0359n0 ViewConfiguration viewConfiguration, @C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18340b.m83068b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (identifier == 0 || !resources.getBoolean(identifier)) {
            return false;
        }
        return true;
    }
}
