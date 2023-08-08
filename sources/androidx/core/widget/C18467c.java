package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C18467c {

    /* renamed from: a */
    public static final String f47251a = "CheckedTextViewCompat";

    /* renamed from: androidx.core.widget.c$a */
    public static class C18468a {

        /* renamed from: a */
        public static Field f47252a;

        /* renamed from: b */
        public static boolean f47253b;

        @C0363p0
        /* renamed from: a */
        public static Drawable m83639a(@C0359n0 CheckedTextView checkedTextView) {
            if (!f47253b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f47252a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f47253b = true;
            }
            Field field = f47252a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    f47252a = null;
                }
            }
            return null;
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.widget.c$b */
    public static class C18469b {
        @C0363p0
        /* renamed from: a */
        public static Drawable m83640a(@C0359n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.widget.c$c */
    public static class C18470c {
        @C0363p0
        /* renamed from: a */
        public static ColorStateList m83641a(@C0359n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @C0363p0
        /* renamed from: b */
        public static PorterDuff.Mode m83642b(@C0359n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* renamed from: c */
        public static void m83643c(@C0359n0 CheckedTextView checkedTextView, @C0363p0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m83644d(@C0359n0 CheckedTextView checkedTextView, @C0363p0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Drawable m83634a(@C0359n0 CheckedTextView checkedTextView) {
        return C18469b.m83640a(checkedTextView);
    }

    @C0363p0
    /* renamed from: b */
    public static ColorStateList m83635b(@C0359n0 CheckedTextView checkedTextView) {
        return C18470c.m83641a(checkedTextView);
    }

    @C0363p0
    /* renamed from: c */
    public static PorterDuff.Mode m83636c(@C0359n0 CheckedTextView checkedTextView) {
        return C18470c.m83642b(checkedTextView);
    }

    /* renamed from: d */
    public static void m83637d(@C0359n0 CheckedTextView checkedTextView, @C0363p0 ColorStateList colorStateList) {
        C18470c.m83643c(checkedTextView, colorStateList);
    }

    /* renamed from: e */
    public static void m83638e(@C0359n0 CheckedTextView checkedTextView, @C0363p0 PorterDuff.Mode mode) {
        C18470c.m83644d(checkedTextView, mode);
    }
}
