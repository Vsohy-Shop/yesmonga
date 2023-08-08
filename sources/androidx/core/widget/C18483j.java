package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.widget.j */
public class C18483j {

    @C0376v0(21)
    /* renamed from: androidx.core.widget.j$a */
    public static class C18484a {
        @C0373u
        /* renamed from: a */
        public static ColorStateList m83675a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @C0373u
        /* renamed from: b */
        public static PorterDuff.Mode m83676b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @C0373u
        /* renamed from: c */
        public static void m83677c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @C0373u
        /* renamed from: d */
        public static void m83678d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static ColorStateList m83671a(@C0359n0 ImageView imageView) {
        return C18484a.m83675a(imageView);
    }

    @C0363p0
    /* renamed from: b */
    public static PorterDuff.Mode m83672b(@C0359n0 ImageView imageView) {
        return C18484a.m83676b(imageView);
    }

    /* renamed from: c */
    public static void m83673c(@C0359n0 ImageView imageView, @C0363p0 ColorStateList colorStateList) {
        C18484a.m83677c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m83674d(@C0359n0 ImageView imageView, @C0363p0 PorterDuff.Mode mode) {
        C18484a.m83678d(imageView, mode);
    }
}
