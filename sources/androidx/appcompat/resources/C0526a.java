package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.appcompat.resources.a */
public final class C0526a {

    @C0376v0(15)
    /* renamed from: androidx.appcompat.resources.a$a */
    public static class C0527a {
        @C0373u
        /* renamed from: a */
        public static void m2473a(@C0359n0 Resources resources, int i, int i2, @C0359n0 TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.appcompat.resources.a$b */
    public static class C0528b {
        @C0373u
        /* renamed from: a */
        public static void m2474a(@C0359n0 ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.appcompat.resources.a$c */
    public static class C0529c {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static Drawable m2475a(@C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @C0373u
        /* renamed from: b */
        public static int m2476b(@C0359n0 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @C0373u
        /* renamed from: c */
        public static void m2477c(@C0359n0 Drawable drawable, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
