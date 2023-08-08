package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0325c;
import androidx.annotation.C0330d1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.q */
public class C17483q {

    /* renamed from: a */
    public static final String f45776a = "http://schemas.android.com/apk/res/android";

    /* renamed from: a */
    public static int m80225a(@C0359n0 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m80226b(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @C0363p0
    /* renamed from: c */
    public static Drawable m80227c(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        if (drawable == null) {
            return typedArray.getDrawable(i2);
        }
        return drawable;
    }

    /* renamed from: d */
    public static int m80228d(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: e */
    public static boolean m80229e(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i, boolean z) {
        if (!m80242r(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    @C0354l
    /* renamed from: f */
    public static int m80230f(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i, @C0354l int i2) {
        if (!m80242r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    @C0363p0
    /* renamed from: g */
    public static ColorStateList m80231g(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0363p0 Resources.Theme theme, @C0359n0 String str, @C0330d1 int i) {
        if (!m80242r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C17452c.m80117d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m80232h(typedValue);
        }
    }

    @C0359n0
    /* renamed from: h */
    public static ColorStateList m80232h(@C0359n0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C17453d m80233i(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0363p0 Resources.Theme theme, @C0359n0 String str, @C0330d1 int i, @C0354l int i2) {
        if (m80242r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C17453d.m80123b(typedValue.data);
            }
            C17453d g = C17453d.m80126g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C17453d.m80123b(i2);
    }

    /* renamed from: j */
    public static float m80234j(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i, float f) {
        if (!m80242r(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: k */
    public static int m80235k(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i, int i2) {
        if (!m80242r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    @C0325c
    /* renamed from: l */
    public static int m80236l(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i, @C0325c int i2) {
        if (!m80242r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    @C0363p0
    /* renamed from: m */
    public static String m80237m(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, @C0330d1 int i) {
        if (!m80242r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    @C0325c
    /* renamed from: n */
    public static int m80238n(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2, @C0325c int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @C0363p0
    /* renamed from: o */
    public static String m80239o(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    @C0363p0
    /* renamed from: p */
    public static CharSequence m80240p(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2) {
        CharSequence text = typedArray.getText(i);
        if (text == null) {
            return typedArray.getText(i2);
        }
        return text;
    }

    @C0363p0
    /* renamed from: q */
    public static CharSequence[] m80241q(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        if (textArray == null) {
            return typedArray.getTextArray(i2);
        }
        return textArray;
    }

    /* renamed from: r */
    public static boolean m80242r(@C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: s */
    public static TypedArray m80243s(@C0359n0 Resources resources, @C0363p0 Resources.Theme theme, @C0359n0 AttributeSet attributeSet, @C0359n0 int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @C0363p0
    /* renamed from: t */
    public static TypedValue m80244t(@C0359n0 TypedArray typedArray, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 String str, int i) {
        if (!m80242r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
