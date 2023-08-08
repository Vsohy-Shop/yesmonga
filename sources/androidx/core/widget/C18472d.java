package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.d */
public final class C18472d {

    /* renamed from: a */
    public static final String f47254a = "CompoundButtonCompat";

    /* renamed from: b */
    public static Field f47255b;

    /* renamed from: c */
    public static boolean f47256c;

    @C0376v0(21)
    /* renamed from: androidx.core.widget.d$a */
    public static class C18473a {
        @C0373u
        /* renamed from: a */
        public static ColorStateList m83650a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @C0373u
        /* renamed from: b */
        public static PorterDuff.Mode m83651b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @C0373u
        /* renamed from: c */
        public static void m83652c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @C0373u
        /* renamed from: d */
        public static void m83653d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.widget.d$b */
    public static class C18474b {
        @C0373u
        /* renamed from: a */
        public static Drawable m83654a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Drawable m83645a(@C0359n0 CompoundButton compoundButton) {
        return C18474b.m83654a(compoundButton);
    }

    @C0363p0
    /* renamed from: b */
    public static ColorStateList m83646b(@C0359n0 CompoundButton compoundButton) {
        return C18473a.m83650a(compoundButton);
    }

    @C0363p0
    /* renamed from: c */
    public static PorterDuff.Mode m83647c(@C0359n0 CompoundButton compoundButton) {
        return C18473a.m83651b(compoundButton);
    }

    /* renamed from: d */
    public static void m83648d(@C0359n0 CompoundButton compoundButton, @C0363p0 ColorStateList colorStateList) {
        C18473a.m83652c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m83649e(@C0359n0 CompoundButton compoundButton, @C0363p0 PorterDuff.Mode mode) {
        C18473a.m83653d(compoundButton, mode);
    }
}
