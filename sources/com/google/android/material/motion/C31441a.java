package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17634r0;
import androidx.core.view.animation.C18117b;
import com.google.android.material.resources.C31499b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.motion.a */
public class C31441a {

    /* renamed from: a */
    public static final String f75986a = "cubic-bezier";

    /* renamed from: b */
    public static final String f75987b = "path";

    /* renamed from: c */
    public static final String f75988c = "(";

    /* renamed from: d */
    public static final String f75989d = ")";

    /* renamed from: a */
    public static float m127033a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static String m127034b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    public static boolean m127035c(String str, String str2) {
        if (!str.startsWith(str2 + "(") || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m127036d(@C0359n0 Context context, @C0336f int i, int i2) {
        return C31499b.m127359e(context, i, i2);
    }

    @C0359n0
    /* renamed from: e */
    public static TimeInterpolator m127037e(@C0359n0 Context context, @C0336f int i, @C0359n0 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m127035c(valueOf, f75986a)) {
                String[] split = m127034b(valueOf, f75986a).split(",");
                if (split.length == 4) {
                    return C18117b.m82265b(m127033a(split, 0), m127033a(split, 1), m127033a(split, 2), m127033a(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (m127035c(valueOf, "path")) {
                return C18117b.m82266c(C17634r0.m80739e(m127034b(valueOf, "path")));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
