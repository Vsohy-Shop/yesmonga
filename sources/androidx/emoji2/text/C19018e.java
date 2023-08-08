package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.C0328d;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17623o0;
import androidx.emoji2.text.C19019f;

@C0328d
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.text.e */
public class C19018e implements C19019f.C19026f {

    /* renamed from: b */
    public static final int f48372b = 10;

    /* renamed from: c */
    public static final ThreadLocal<StringBuilder> f48373c = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f48374a;

    public C19018e() {
        TextPaint textPaint = new TextPaint();
        this.f48374a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m88857b() {
        ThreadLocal<StringBuilder> threadLocal = f48373c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo55955a(@C0359n0 CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b = m88857b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C17623o0.m80716a(this.f48374a, b.toString());
    }
}
