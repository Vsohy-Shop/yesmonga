package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.inputmethod.g */
public final class C18245g {

    /* renamed from: a */
    public static final int f46865a = 16777216;

    /* renamed from: b */
    public static final int f46866b = Integer.MIN_VALUE;

    /* renamed from: c */
    public static final String[] f46867c = new String[0];

    /* renamed from: d */
    public static final String f46868d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e */
    public static final String f46869e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f */
    public static final String f46870f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g */
    public static final String f46871g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h */
    public static final String f46872h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @C0344h1

    /* renamed from: i */
    public static final int f46873i = 2048;
    @C0344h1

    /* renamed from: j */
    public static final int f46874j = 1024;

    @C0376v0(30)
    /* renamed from: androidx.core.view.inputmethod.g$a */
    public static class C18246a {
        /* renamed from: a */
        public static CharSequence m82849a(@C0359n0 EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        /* renamed from: b */
        public static CharSequence m82850b(@C0359n0 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        /* renamed from: c */
        public static CharSequence m82851c(@C0359n0 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        /* renamed from: d */
        public static void m82852d(@C0359n0 EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static String[] m82837a(@C0359n0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] a = editorInfo.contentMimeTypes;
            if (a != null) {
                return a;
            }
            return f46867c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f46867c;
        }
        String[] stringArray = bundle.getStringArray(f46868d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f46869e);
        }
        if (stringArray != null) {
            return stringArray;
        }
        return f46867c;
    }

    @C0363p0
    /* renamed from: b */
    public static CharSequence m82838b(@C0359n0 EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C18246a.m82849a(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(f46871g);
        int i3 = editorInfo.extras.getInt(f46872h);
        int i4 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(f46870f)) == null) {
            return null;
        }
        if ((i & 1) != 0) {
            return charSequence.subSequence(i2, i3);
        }
        return TextUtils.substring(charSequence, i2, i3);
    }

    @C0363p0
    /* renamed from: c */
    public static CharSequence m82839c(@C0359n0 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C18246a.m82850b(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f46870f)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f46872h);
        int min = Math.min(i, charSequence.length() - i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, min + i3);
        }
        return TextUtils.substring(charSequence, i3, min + i3);
    }

    @C0363p0
    /* renamed from: d */
    public static CharSequence m82840d(@C0359n0 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C18246a.m82851c(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f46870f)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f46871g);
        int min = Math.min(i, i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3 - min, i3);
        }
        return TextUtils.substring(charSequence, i3 - min, i3);
    }

    /* renamed from: e */
    public static int m82841e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(f46868d);
        boolean containsKey2 = editorInfo.extras.containsKey(f46869e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (containsKey2) {
            return 2;
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m82842f(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: g */
    public static boolean m82843g(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: h */
    public static void m82844h(@C0359n0 EditorInfo editorInfo, @C0363p0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f46868d, strArr);
        editorInfo.extras.putStringArray(f46869e, strArr);
    }

    /* renamed from: i */
    public static void m82845i(@C0359n0 EditorInfo editorInfo, @C0359n0 CharSequence charSequence, int i) {
        int i2;
        int i3;
        C18001r.m81775l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C18246a.m82852d(editorInfo, charSequence, i);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i2 = i5 - i;
        } else {
            i2 = i4 - i;
        }
        if (i4 > i5) {
            i3 = i4 - i;
        } else {
            i3 = i5 - i;
        }
        int length = charSequence.length();
        if (i < 0 || i2 < 0 || i3 > length) {
            m82847k(editorInfo, (CharSequence) null, 0, 0);
        } else if (m82843g(editorInfo.inputType)) {
            m82847k(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            m82847k(editorInfo, charSequence, i2, i3);
        } else {
            m82848l(editorInfo, charSequence, i2, i3);
        }
    }

    /* renamed from: j */
    public static void m82846j(@C0359n0 EditorInfo editorInfo, @C0359n0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18246a.m82852d(editorInfo, charSequence, 0);
        } else {
            m82845i(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: k */
    public static void m82847k(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence(f46870f, spannableStringBuilder);
        editorInfo.extras.putInt(f46871g, i);
        editorInfo.extras.putInt(f46872h, i2);
    }

    /* renamed from: l */
    public static void m82848l(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence charSequence2;
        int i4 = i2 - i;
        if (i4 > 1024) {
            i3 = 0;
        } else {
            i3 = i4;
        }
        int i5 = 2048 - i3;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m82842f(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m82842f(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i3 + min;
        if (i3 != i4) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)});
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m82847k(editorInfo, charSequence2, i8, i3 + i8);
    }
}
