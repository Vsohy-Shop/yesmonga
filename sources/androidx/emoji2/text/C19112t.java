package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.core.text.C17900a0;
import androidx.core.text.C17918g;
import java.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.t */
public class C19112t implements Spannable {

    /* renamed from: a */
    public boolean f48634a = false;
    @C0359n0

    /* renamed from: b */
    public Spannable f48635b;

    @C0376v0(24)
    /* renamed from: androidx.emoji2.text.t$a */
    public static class C19113a {
        /* renamed from: a */
        public static IntStream m89465a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m89466b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.t$b */
    public static class C19114b {
        /* renamed from: a */
        public boolean mo56387a(CharSequence charSequence) {
            return charSequence instanceof C17900a0;
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.emoji2.text.t$c */
    public static class C19115c extends C19114b {
        /* renamed from: a */
        public boolean mo56387a(CharSequence charSequence) {
            return C17918g.m81510a(charSequence) || (charSequence instanceof C17900a0);
        }
    }

    public C19112t(@C0359n0 Spannable spannable) {
        this.f48635b = spannable;
    }

    /* renamed from: c */
    public static C19114b m89462c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C19114b();
        }
        return new C19115c();
    }

    /* renamed from: a */
    public final void mo56372a() {
        Spannable spannable = this.f48635b;
        if (!this.f48634a && m89462c().mo56387a(spannable)) {
            this.f48635b = new SpannableString(spannable);
        }
        this.f48634a = true;
    }

    /* renamed from: b */
    public Spannable mo56373b() {
        return this.f48635b;
    }

    public char charAt(int i) {
        return this.f48635b.charAt(i);
    }

    @C0359n0
    @C0376v0(api = 24)
    public IntStream chars() {
        return C19113a.m89465a(this.f48635b);
    }

    @C0359n0
    @C0376v0(api = 24)
    public IntStream codePoints() {
        return C19113a.m89466b(this.f48635b);
    }

    public int getSpanEnd(Object obj) {
        return this.f48635b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f48635b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f48635b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f48635b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f48635b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f48635b.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        mo56372a();
        this.f48635b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        mo56372a();
        this.f48635b.setSpan(obj, i, i2, i3);
    }

    @C0359n0
    public CharSequence subSequence(int i, int i2) {
        return this.f48635b.subSequence(i, i2);
    }

    @C0359n0
    public String toString() {
        return this.f48635b.toString();
    }

    public C19112t(@C0359n0 Spanned spanned) {
        this.f48635b = new SpannableString(spanned);
    }

    public C19112t(@C0359n0 CharSequence charSequence) {
        this.f48635b = new SpannableString(charSequence);
    }
}
