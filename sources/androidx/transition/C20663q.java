package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0376v0(21)
/* renamed from: androidx.transition.q */
public class C20663q implements C20652o {

    /* renamed from: b */
    public static final String f53305b = "GhostViewApi21";

    /* renamed from: c */
    public static Class<?> f53306c;

    /* renamed from: d */
    public static boolean f53307d;

    /* renamed from: e */
    public static Method f53308e;

    /* renamed from: f */
    public static boolean f53309f;

    /* renamed from: g */
    public static Method f53310g;

    /* renamed from: v */
    public static boolean f53311v;

    /* renamed from: a */
    public final View f53312a;

    public C20663q(@C0359n0 View view) {
        this.f53312a = view;
    }

    /* renamed from: b */
    public static C20652o m96100b(View view, ViewGroup viewGroup, Matrix matrix) {
        m96101c();
        Method method = f53308e;
        if (method != null) {
            try {
                return new C20663q((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m96101c() {
        if (!f53309f) {
            try {
                m96102d();
                Method declaredMethod = f53306c.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f53308e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53309f = true;
        }
    }

    /* renamed from: d */
    public static void m96102d() {
        if (!f53307d) {
            try {
                f53306c = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f53307d = true;
        }
    }

    /* renamed from: e */
    public static void m96103e() {
        if (!f53311v) {
            try {
                m96102d();
                Method declaredMethod = f53306c.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f53310g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53311v = true;
        }
    }

    /* renamed from: f */
    public static void m96104f(View view) {
        m96103e();
        Method method = f53310g;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo61852a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f53312a.setVisibility(i);
    }
}
