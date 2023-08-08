package androidx.transition;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.transition.C20538b0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.y0 */
public class C20687y0 {

    /* renamed from: a */
    public static final String f53352a = "ViewGroupUtilsApi14";

    /* renamed from: b */
    public static final int f53353b = 4;

    /* renamed from: c */
    public static LayoutTransition f53354c;

    /* renamed from: d */
    public static Field f53355d;

    /* renamed from: e */
    public static boolean f53356e;

    /* renamed from: f */
    public static Method f53357f;

    /* renamed from: g */
    public static boolean f53358g;

    /* renamed from: androidx.transition.y0$a */
    public class C20688a extends LayoutTransition {
        public boolean isChangingLayout() {
            return true;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public static void m96152a(LayoutTransition layoutTransition) {
        if (!f53358g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f53357f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53358g = true;
        }
        Method method = f53357f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    /* renamed from: b */
    public static void m96153b(@C0359n0 ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f53354c == null) {
            C20688a aVar = new C20688a();
            f53354c = aVar;
            aVar.setAnimator(2, (Animator) null);
            f53354c.setAnimator(0, (Animator) null);
            f53354c.setAnimator(1, (Animator) null);
            f53354c.setAnimator(3, (Animator) null);
            f53354c.setAnimator(4, (Animator) null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m96152a(layoutTransition);
                }
                if (layoutTransition != f53354c) {
                    viewGroup.setTag(C20538b0.C20545g.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f53354c);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition) null);
        if (!f53356e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f53355d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53356e = true;
        }
        Field field = f53355d;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f53355d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i = C20538b0.C20545g.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i, (Object) null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
