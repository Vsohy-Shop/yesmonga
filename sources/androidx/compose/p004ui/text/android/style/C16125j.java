package androidx.compose.p004ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.style.j */
public final class C16125j extends ReplacementSpan {
    @C12579k

    /* renamed from: k */
    public static final C16126a f40099k = new C16126a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f40100l = 8;

    /* renamed from: m */
    public static final int f40101m = 0;

    /* renamed from: n */
    public static final int f40102n = 1;

    /* renamed from: o */
    public static final int f40103o = 2;

    /* renamed from: p */
    public static final int f40104p = 3;

    /* renamed from: q */
    public static final int f40105q = 4;

    /* renamed from: r */
    public static final int f40106r = 5;

    /* renamed from: s */
    public static final int f40107s = 6;

    /* renamed from: t */
    public static final int f40108t = 0;

    /* renamed from: u */
    public static final int f40109u = 1;

    /* renamed from: v */
    public static final int f40110v = 2;

    /* renamed from: a */
    public final float f40111a;

    /* renamed from: b */
    public final int f40112b;

    /* renamed from: c */
    public final float f40113c;

    /* renamed from: d */
    public final int f40114d;

    /* renamed from: e */
    public final float f40115e;

    /* renamed from: f */
    public final int f40116f;

    /* renamed from: g */
    public Paint.FontMetricsInt f40117g;

    /* renamed from: h */
    public int f40118h;

    /* renamed from: i */
    public int f40119i;

    /* renamed from: j */
    public boolean f40120j;

    /* renamed from: androidx.compose.ui.text.android.style.j$a */
    public static final class C16126a {

        @C10861c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.compose.ui.text.android.style.j$a$a */
        public @interface C16127a {
        }

        @C10861c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.compose.ui.text.android.style.j$a$b */
        public @interface C16128b {
        }

        public /* synthetic */ C16126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C16126a() {
        }
    }

    public C16125j(float f, int i, float f2, int i2, float f3, int i3) {
        this.f40111a = f;
        this.f40112b = i;
        this.f40113c = f2;
        this.f40114d = i2;
        this.f40115e = f3;
        this.f40116f = i3;
    }

    @C12579k
    /* renamed from: a */
    public final Paint.FontMetricsInt mo46570a() {
        Paint.FontMetricsInt fontMetricsInt = this.f40117g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    /* renamed from: b */
    public final int mo46571b() {
        if (this.f40120j) {
            return this.f40119i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* renamed from: c */
    public final int mo46572c() {
        return this.f40116f;
    }

    /* renamed from: d */
    public final int mo46573d() {
        if (this.f40120j) {
            return this.f40118h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public void draw(@C12579k Canvas canvas, @C12580l CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @SuppressLint({"DocumentExceptions"})
    public int getSize(@C12579k Paint paint, @C12580l CharSequence charSequence, int i, int i2, @C12580l Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        float f;
        int i3;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f40120j = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.f40117g = fontMetricsInt2;
        if (mo46570a().descent > mo46570a().ascent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = this.f40112b;
            if (i4 == 0) {
                f = this.f40111a * this.f40115e;
            } else if (i4 == 1) {
                f = this.f40111a * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f40118h = C16129k.m72595a(f);
            int i5 = this.f40114d;
            if (i5 == 0) {
                i3 = C16129k.m72595a(this.f40113c * this.f40115e);
            } else if (i5 == 1) {
                i3 = C16129k.m72595a(this.f40113c * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f40119i = i3;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = mo46570a().ascent;
                fontMetricsInt.descent = mo46570a().descent;
                fontMetricsInt.leading = mo46570a().leading;
                switch (this.f40116f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-mo46571b())) {
                            fontMetricsInt.ascent = -mo46571b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + mo46571b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + mo46571b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - mo46571b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - mo46571b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < mo46571b()) {
                            int b = fontMetricsInt.ascent - ((mo46571b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b;
                            fontMetricsInt.descent = b + mo46571b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(mo46570a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(mo46570a().bottom, fontMetricsInt.descent);
            }
            return mo46573d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
