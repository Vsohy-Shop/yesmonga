package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StaticLayoutBuilderCompat {

    /* renamed from: n */
    public static final int f75779n = 1;

    /* renamed from: o */
    public static final float f75780o = 0.0f;

    /* renamed from: p */
    public static final float f75781p = 1.0f;

    /* renamed from: q */
    public static final String f75782q = "android.text.TextDirectionHeuristic";

    /* renamed from: r */
    public static final String f75783r = "android.text.TextDirectionHeuristics";

    /* renamed from: s */
    public static final String f75784s = "LTR";

    /* renamed from: t */
    public static final String f75785t = "RTL";

    /* renamed from: u */
    public static boolean f75786u;
    @C0363p0

    /* renamed from: v */
    public static Constructor<StaticLayout> f75787v;
    @C0363p0

    /* renamed from: w */
    public static Object f75788w;

    /* renamed from: a */
    public CharSequence f75789a;

    /* renamed from: b */
    public final TextPaint f75790b;

    /* renamed from: c */
    public final int f75791c;

    /* renamed from: d */
    public int f75792d = 0;

    /* renamed from: e */
    public int f75793e;

    /* renamed from: f */
    public Layout.Alignment f75794f;

    /* renamed from: g */
    public int f75795g;

    /* renamed from: h */
    public float f75796h;

    /* renamed from: i */
    public float f75797i;

    /* renamed from: j */
    public int f75798j;

    /* renamed from: k */
    public boolean f75799k;

    /* renamed from: l */
    public boolean f75800l;
    @C0363p0

    /* renamed from: m */
    public TextUtils.TruncateAt f75801m;

    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f75789a = charSequence;
        this.f75790b = textPaint;
        this.f75791c = i;
        this.f75793e = charSequence.length();
        this.f75794f = Layout.Alignment.ALIGN_NORMAL;
        this.f75795g = Integer.MAX_VALUE;
        this.f75796h = 0.0f;
        this.f75797i = 1.0f;
        this.f75798j = f75779n;
        this.f75799k = true;
        this.f75801m = null;
    }

    @C0359n0
    /* renamed from: c */
    public static StaticLayoutBuilderCompat m126724c(@C0359n0 CharSequence charSequence, @C0359n0 TextPaint textPaint, @C0337f0(from = 0) int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo89977a() throws StaticLayoutBuilderCompatException {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f75789a == null) {
            this.f75789a = "";
        }
        int max = Math.max(0, this.f75791c);
        CharSequence charSequence = this.f75789a;
        if (this.f75795g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f75790b, (float) max, this.f75801m);
        }
        int min = Math.min(charSequence.length(), this.f75793e);
        this.f75793e = min;
        if (this.f75800l && this.f75795g == 1) {
            this.f75794f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f75792d, min, this.f75790b, max);
        obtain.setAlignment(this.f75794f);
        obtain.setIncludePad(this.f75799k);
        if (this.f75800l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f75801m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f75795g);
        float f = this.f75796h;
        if (!(f == 0.0f && this.f75797i == 1.0f)) {
            obtain.setLineSpacing(f, this.f75797i);
        }
        if (this.f75795g > 1) {
            obtain.setHyphenationFrequency(this.f75798j);
        }
        return obtain.build();
    }

    /* renamed from: b */
    public final void mo89978b() throws StaticLayoutBuilderCompatException {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        if (!f75786u) {
            try {
                if (this.f75800l) {
                    z = true;
                } else {
                    z = false;
                }
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f75788w = textDirectionHeuristic;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f75787v = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f75786u = true;
            } catch (Exception e) {
                throw new StaticLayoutBuilderCompatException(e);
            }
        }
    }

    @C0359n0
    /* renamed from: d */
    public StaticLayoutBuilderCompat mo89979d(@C0359n0 Layout.Alignment alignment) {
        this.f75794f = alignment;
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public StaticLayoutBuilderCompat mo89980e(@C0363p0 TextUtils.TruncateAt truncateAt) {
        this.f75801m = truncateAt;
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public StaticLayoutBuilderCompat mo89981f(@C0337f0(from = 0) int i) {
        this.f75793e = i;
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public StaticLayoutBuilderCompat mo89982g(int i) {
        this.f75798j = i;
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public StaticLayoutBuilderCompat mo89983h(boolean z) {
        this.f75799k = z;
        return this;
    }

    /* renamed from: i */
    public StaticLayoutBuilderCompat mo89984i(boolean z) {
        this.f75800l = z;
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public StaticLayoutBuilderCompat mo89985j(float f, float f2) {
        this.f75796h = f;
        this.f75797i = f2;
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public StaticLayoutBuilderCompat mo89986k(@C0337f0(from = 0) int i) {
        this.f75795g = i;
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public StaticLayoutBuilderCompat mo89987l(@C0337f0(from = 0) int i) {
        this.f75792d = i;
        return this;
    }
}
