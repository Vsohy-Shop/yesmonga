package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.C0359n0;
import com.google.firebase.installations.local.C33093b;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.p0 */
public final class C18334p0 {

    /* renamed from: a */
    public static final String f47046a = "LayoutInflaterCompatHC";

    /* renamed from: b */
    public static Field f47047b;

    /* renamed from: c */
    public static boolean f47048c;

    /* renamed from: androidx.core.view.p0$a */
    public static class C18335a implements LayoutInflater.Factory2 {

        /* renamed from: a */
        public final C18345q0 f47049a;

        public C18335a(C18345q0 q0Var) {
            this.f47049a = q0Var;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f47049a.onCreateView((View) null, str, context, attributeSet);
        }

        @C0359n0
        public String toString() {
            return getClass().getName() + C33093b.f80281i + this.f47049a + "}";
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f47049a.onCreateView(view, str, context, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m83048a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        Class<LayoutInflater> cls = LayoutInflater.class;
        if (!f47048c) {
            try {
                Field declaredField = cls.getDeclaredField("mFactory2");
                f47047b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(cls.getName());
                sb.append("; inflation may have unexpected results.");
            }
            f47048c = true;
        }
        Field field = f47047b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static C18345q0 m83049b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof C18335a) {
            return ((C18335a) factory).f47049a;
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    public static void m83050c(@C0359n0 LayoutInflater layoutInflater, @C0359n0 C18345q0 q0Var) {
        layoutInflater.setFactory2(new C18335a(q0Var));
    }

    /* renamed from: d */
    public static void m83051d(@C0359n0 LayoutInflater layoutInflater, @C0359n0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
