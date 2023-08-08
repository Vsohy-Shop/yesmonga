package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.d */
public final class C17549d {

    /* renamed from: a */
    public static final String f45901a = "DrawableCompat";

    /* renamed from: b */
    public static Method f45902b;

    /* renamed from: c */
    public static boolean f45903c;

    /* renamed from: d */
    public static Method f45904d;

    /* renamed from: e */
    public static boolean f45905e;

    @C0376v0(19)
    /* renamed from: androidx.core.graphics.drawable.d$a */
    public static class C17550a {
        @C0373u
        /* renamed from: a */
        public static int m80457a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @C0373u
        /* renamed from: b */
        public static Drawable m80458b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @C0373u
        /* renamed from: c */
        public static Drawable m80459c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m80460d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @C0373u
        /* renamed from: e */
        public static void m80461e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.graphics.drawable.d$b */
    public static class C17551b {
        @C0373u
        /* renamed from: a */
        public static void m80462a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m80463b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @C0373u
        /* renamed from: c */
        public static ColorFilter m80464c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @C0373u
        /* renamed from: d */
        public static void m80465d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @C0373u
        /* renamed from: e */
        public static void m80466e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @C0373u
        /* renamed from: f */
        public static void m80467f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: g */
        public static void m80468g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @C0373u
        /* renamed from: h */
        public static void m80469h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @C0373u
        /* renamed from: i */
        public static void m80470i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.graphics.drawable.d$c */
    public static class C17552c {
        @C0373u
        /* renamed from: a */
        public static int m80471a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m80472b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m80439a(@C0359n0 Drawable drawable, @C0359n0 Resources.Theme theme) {
        C17551b.m80462a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m80440b(@C0359n0 Drawable drawable) {
        return C17551b.m80463b(drawable);
    }

    /* renamed from: c */
    public static void m80441c(@C0359n0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m80442d(@C0359n0 Drawable drawable) {
        return C17550a.m80457a(drawable);
    }

    @C0363p0
    /* renamed from: e */
    public static ColorFilter m80443e(@C0359n0 Drawable drawable) {
        return C17551b.m80464c(drawable);
    }

    /* renamed from: f */
    public static int m80444f(@C0359n0 Drawable drawable) {
        return C17552c.m80471a(drawable);
    }

    /* renamed from: g */
    public static void m80445g(@C0359n0 Drawable drawable, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        C17551b.m80465d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m80446h(@C0359n0 Drawable drawable) {
        return C17550a.m80460d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m80447i(@C0359n0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m80448j(@C0359n0 Drawable drawable, boolean z) {
        C17550a.m80461e(drawable, z);
    }

    /* renamed from: k */
    public static void m80449k(@C0359n0 Drawable drawable, float f, float f2) {
        C17551b.m80466e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m80450l(@C0359n0 Drawable drawable, int i, int i2, int i3, int i4) {
        C17551b.m80467f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m80451m(@C0359n0 Drawable drawable, int i) {
        return C17552c.m80472b(drawable, i);
    }

    /* renamed from: n */
    public static void m80452n(@C0359n0 Drawable drawable, @C0354l int i) {
        C17551b.m80468g(drawable, i);
    }

    /* renamed from: o */
    public static void m80453o(@C0359n0 Drawable drawable, @C0363p0 ColorStateList colorStateList) {
        C17551b.m80469h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m80454p(@C0359n0 Drawable drawable, @C0363p0 PorterDuff.Mode mode) {
        C17551b.m80470i(drawable, mode);
    }

    /* renamed from: q */
    public static <T extends Drawable> T m80455q(@C0359n0 Drawable drawable) {
        if (drawable instanceof C17568s) {
            return ((C17568s) drawable).mo51983a();
        }
        return drawable;
    }

    @C0359n0
    /* renamed from: r */
    public static Drawable m80456r(@C0359n0 Drawable drawable) {
        return drawable;
    }
}
