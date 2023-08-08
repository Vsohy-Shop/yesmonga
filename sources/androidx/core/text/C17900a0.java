package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.C0323b0;
import androidx.annotation.C0337f0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17821p0;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: androidx.core.text.a0 */
public class C17900a0 implements Spannable {

    /* renamed from: e */
    public static final char f46346e = '\n';

    /* renamed from: f */
    public static final Object f46347f = new Object();
    @C0323b0("sLock")
    @C0359n0

    /* renamed from: g */
    public static Executor f46348g;
    @C0359n0

    /* renamed from: a */
    public final Spannable f46349a;
    @C0359n0

    /* renamed from: b */
    public final C17901a f46350b;
    @C0359n0

    /* renamed from: c */
    public final int[] f46351c;
    @C0363p0

    /* renamed from: d */
    public final PrecomputedText f46352d;

    /* renamed from: androidx.core.text.a0$b */
    public static class C17903b extends FutureTask<C17900a0> {

        /* renamed from: androidx.core.text.a0$b$a */
        public static class C17904a implements Callable<C17900a0> {

            /* renamed from: a */
            public C17901a f46362a;

            /* renamed from: b */
            public CharSequence f46363b;

            public C17904a(@C0359n0 C17901a aVar, @C0359n0 CharSequence charSequence) {
                this.f46362a = aVar;
                this.f46363b = charSequence;
            }

            /* renamed from: a */
            public C17900a0 call() throws Exception {
                return C17900a0.m81451a(this.f46363b, this.f46362a);
            }
        }

        public C17903b(@C0359n0 C17901a aVar, @C0359n0 CharSequence charSequence) {
            super(new C17904a(aVar, charSequence));
        }
    }

    public C17900a0(@C0359n0 CharSequence charSequence, @C0359n0 C17901a aVar, @C0359n0 int[] iArr) {
        this.f46349a = new SpannableString(charSequence);
        this.f46350b = aVar;
        this.f46351c = iArr;
        this.f46352d = null;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static C17900a0 m81451a(@C0359n0 CharSequence charSequence, @C0359n0 C17901a aVar) {
        PrecomputedText.Params params;
        C18001r.m81775l(charSequence);
        C18001r.m81775l(aVar);
        try {
            C17821p0.m81248b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f46357e) != null) {
                return new C17900a0(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, 10, i, length);
                if (indexOf < 0) {
                    i = length;
                } else {
                    i = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.mo52351e(), Integer.MAX_VALUE).setBreakStrategy(aVar.mo52348b()).setHyphenationFrequency(aVar.mo52349c()).setTextDirection(aVar.mo52350d()).build();
            C17900a0 a0Var = new C17900a0(charSequence, aVar, iArr);
            C17821p0.m81250d();
            return a0Var;
        } finally {
            C17821p0.m81250d();
        }
    }

    @C0341g1
    /* renamed from: g */
    public static Future<C17900a0> m81452g(@C0359n0 CharSequence charSequence, @C0359n0 C17901a aVar, @C0363p0 Executor executor) {
        C17903b bVar = new C17903b(aVar, charSequence);
        if (executor == null) {
            synchronized (f46347f) {
                if (f46348g == null) {
                    f46348g = Executors.newFixedThreadPool(1);
                }
                executor = f46348g;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @C0337f0(from = 0)
    /* renamed from: b */
    public int mo52331b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f46352d.getParagraphCount();
        }
        return this.f46351c.length;
    }

    @C0337f0(from = 0)
    /* renamed from: c */
    public int mo52332c(@C0337f0(from = 0) int i) {
        C18001r.m81770g(i, 0, mo52331b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f46352d.getParagraphEnd(i);
        }
        return this.f46351c[i];
    }

    public char charAt(int i) {
        return this.f46349a.charAt(i);
    }

    @C0337f0(from = 0)
    /* renamed from: d */
    public int mo52334d(@C0337f0(from = 0) int i) {
        C18001r.m81770g(i, 0, mo52331b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f46352d.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f46351c[i - 1];
    }

    @C0359n0
    /* renamed from: e */
    public C17901a mo52335e() {
        return this.f46350b;
    }

    @C0363p0
    @C0376v0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public PrecomputedText mo52336f() {
        if (C17918g.m81510a(this.f46349a)) {
            return C17926h.m81522a(this.f46349a);
        }
        return null;
    }

    public int getSpanEnd(Object obj) {
        return this.f46349a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f46349a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f46349a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f46352d.getSpans(i, i2, cls);
        }
        return this.f46349a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f46349a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f46349a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f46352d.removeSpan(obj);
        } else {
            this.f46349a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f46352d.setSpan(obj, i, i2, i3);
        } else {
            this.f46349a.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f46349a.subSequence(i, i2);
    }

    @C0359n0
    public String toString() {
        return this.f46349a.toString();
    }

    @C0376v0(28)
    public C17900a0(@C0359n0 PrecomputedText precomputedText, @C0359n0 C17901a aVar) {
        this.f46349a = precomputedText;
        this.f46350b = aVar;
        this.f46351c = null;
        this.f46352d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* renamed from: androidx.core.text.a0$a */
    public static final class C17901a {
        @C0359n0

        /* renamed from: a */
        public final TextPaint f46353a;
        @C0363p0

        /* renamed from: b */
        public final TextDirectionHeuristic f46354b;

        /* renamed from: c */
        public final int f46355c;

        /* renamed from: d */
        public final int f46356d;

        /* renamed from: e */
        public final PrecomputedText.Params f46357e;

        /* renamed from: androidx.core.text.a0$a$a */
        public static class C17902a {
            @C0359n0

            /* renamed from: a */
            public final TextPaint f46358a;

            /* renamed from: b */
            public TextDirectionHeuristic f46359b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c */
            public int f46360c = 1;

            /* renamed from: d */
            public int f46361d = 1;

            public C17902a(@C0359n0 TextPaint textPaint) {
                this.f46358a = textPaint;
            }

            @C0359n0
            /* renamed from: a */
            public C17901a mo52355a() {
                return new C17901a(this.f46358a, this.f46359b, this.f46360c, this.f46361d);
            }

            @C0376v0(23)
            /* renamed from: b */
            public C17902a mo52356b(int i) {
                this.f46360c = i;
                return this;
            }

            @C0376v0(23)
            /* renamed from: c */
            public C17902a mo52357c(int i) {
                this.f46361d = i;
                return this;
            }

            @C0376v0(18)
            /* renamed from: d */
            public C17902a mo52358d(@C0359n0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f46359b = textDirectionHeuristic;
                return this;
            }
        }

        public C17901a(@C0359n0 TextPaint textPaint, @C0359n0 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                C17937q.m81535a();
                this.f46357e = C17953z.m81574a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f46357e = null;
            }
            this.f46353a = textPaint;
            this.f46354b = textDirectionHeuristic;
            this.f46355c = i;
            this.f46356d = i2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public boolean mo52347a(@C0359n0 C17901a aVar) {
            if (this.f46355c != aVar.mo52348b() || this.f46356d != aVar.mo52349c() || this.f46353a.getTextSize() != aVar.mo52351e().getTextSize() || this.f46353a.getTextScaleX() != aVar.mo52351e().getTextScaleX() || this.f46353a.getTextSkewX() != aVar.mo52351e().getTextSkewX() || this.f46353a.getLetterSpacing() != aVar.mo52351e().getLetterSpacing() || !TextUtils.equals(this.f46353a.getFontFeatureSettings(), aVar.mo52351e().getFontFeatureSettings()) || this.f46353a.getFlags() != aVar.mo52351e().getFlags() || !this.f46353a.getTextLocales().equals(aVar.mo52351e().getTextLocales())) {
                return false;
            }
            if (this.f46353a.getTypeface() == null) {
                if (aVar.mo52351e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f46353a.getTypeface().equals(aVar.mo52351e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        @C0376v0(23)
        /* renamed from: b */
        public int mo52348b() {
            return this.f46355c;
        }

        @C0376v0(23)
        /* renamed from: c */
        public int mo52349c() {
            return this.f46356d;
        }

        @C0363p0
        @C0376v0(18)
        /* renamed from: d */
        public TextDirectionHeuristic mo52350d() {
            return this.f46354b;
        }

        @C0359n0
        /* renamed from: e */
        public TextPaint mo52351e() {
            return this.f46353a;
        }

        public boolean equals(@C0363p0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C17901a)) {
                return false;
            }
            C17901a aVar = (C17901a) obj;
            if (mo52347a(aVar) && this.f46354b == aVar.mo52350d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C17992m.m81741b(Float.valueOf(this.f46353a.getTextSize()), Float.valueOf(this.f46353a.getTextScaleX()), Float.valueOf(this.f46353a.getTextSkewX()), Float.valueOf(this.f46353a.getLetterSpacing()), Integer.valueOf(this.f46353a.getFlags()), this.f46353a.getTextLocales(), this.f46353a.getTypeface(), Boolean.valueOf(this.f46353a.isElegantTextHeight()), this.f46354b, Integer.valueOf(this.f46355c), Integer.valueOf(this.f46356d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C33093b.f80281i);
            sb.append("textSize=" + this.f46353a.getTextSize());
            sb.append(", textScaleX=" + this.f46353a.getTextScaleX());
            sb.append(", textSkewX=" + this.f46353a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f46353a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f46353a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f46353a.getTextLocales());
            sb.append(", typeface=" + this.f46353a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f46353a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f46354b);
            sb.append(", breakStrategy=" + this.f46355c);
            sb.append(", hyphenationFrequency=" + this.f46356d);
            sb.append("}");
            return sb.toString();
        }

        @C0376v0(28)
        public C17901a(@C0359n0 PrecomputedText.Params params) {
            this.f46353a = params.getTextPaint();
            this.f46354b = params.getTextDirection();
            this.f46355c = params.getBreakStrategy();
            this.f46356d = params.getHyphenationFrequency();
            this.f46357e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
