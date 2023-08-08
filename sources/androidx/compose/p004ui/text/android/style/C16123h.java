package androidx.compose.p004ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.C0379x;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.h */
public final class C16123h implements LineHeightSpan {

    /* renamed from: m */
    public static final int f40086m = 8;

    /* renamed from: a */
    public final float f40087a;

    /* renamed from: b */
    public final int f40088b;

    /* renamed from: c */
    public final int f40089c;

    /* renamed from: d */
    public final boolean f40090d;

    /* renamed from: e */
    public final boolean f40091e;

    /* renamed from: f */
    public final float f40092f;

    /* renamed from: g */
    public int f40093g;

    /* renamed from: h */
    public int f40094h;

    /* renamed from: i */
    public int f40095i;

    /* renamed from: j */
    public int f40096j;

    /* renamed from: k */
    public int f40097k;

    /* renamed from: l */
    public int f40098l;

    public C16123h(float f, int i, int i2, boolean z, boolean z2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
        boolean z3;
        boolean z4;
        this.f40087a = f;
        this.f40088b = i;
        this.f40089c = i2;
        this.f40090d = z;
        this.f40091e = z2;
        this.f40092f = f2;
        boolean z5 = true;
        if (0.0f > f2 || f2 > 1.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            if (f2 == -1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        if (!z5) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    /* renamed from: c */
    public static /* synthetic */ C16123h m72583c(C16123h hVar, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = hVar.f40090d;
        }
        return hVar.mo46564b(i, i2, z);
    }

    /* renamed from: a */
    public final void mo46563a(Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        double d;
        int a = C16124i.m72590a(fontMetricsInt);
        int ceil = (int) ((float) Math.ceil((double) this.f40087a));
        int i = ceil - a;
        float f = this.f40092f;
        if (f == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = Math.abs((float) fontMetricsInt.ascent) / ((float) C16124i.m72590a(fontMetricsInt));
        }
        if (i <= 0) {
            d = Math.ceil((double) (((float) i) * f));
        } else {
            d = Math.ceil((double) (((float) i) * (1.0f - f)));
        }
        int i2 = fontMetricsInt.descent;
        int i3 = ((int) ((float) d)) + i2;
        this.f40095i = i3;
        int i4 = i3 - ceil;
        this.f40094h = i4;
        if (this.f40090d) {
            i4 = fontMetricsInt.ascent;
        }
        this.f40093g = i4;
        if (this.f40091e) {
            i3 = i2;
        }
        this.f40096j = i3;
        this.f40097k = fontMetricsInt.ascent - i4;
        this.f40098l = i3 - i2;
    }

    @C12579k
    /* renamed from: b */
    public final C16123h mo46564b(int i, int i2, boolean z) {
        return new C16123h(this.f40087a, i, i2, z, this.f40091e, this.f40092f);
    }

    public void chooseHeight(@C12579k CharSequence charSequence, int i, int i2, int i3, int i4, @C12579k Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (C16124i.m72590a(fontMetricsInt) > 0) {
            boolean z2 = true;
            if (i == this.f40088b) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != this.f40089c) {
                z2 = false;
            }
            if (!z || !z2 || !this.f40090d || !this.f40091e) {
                if (z) {
                    mo46563a(fontMetricsInt);
                }
                if (z) {
                    i5 = this.f40093g;
                } else {
                    i5 = this.f40094h;
                }
                fontMetricsInt.ascent = i5;
                if (z2) {
                    i6 = this.f40096j;
                } else {
                    i6 = this.f40095i;
                }
                fontMetricsInt.descent = i6;
            }
        }
    }

    /* renamed from: d */
    public final int mo46566d() {
        return this.f40097k;
    }

    /* renamed from: e */
    public final int mo46567e() {
        return this.f40098l;
    }

    /* renamed from: f */
    public final float mo46568f() {
        return this.f40087a;
    }

    /* renamed from: g */
    public final boolean mo46569g() {
        return this.f40091e;
    }
}
