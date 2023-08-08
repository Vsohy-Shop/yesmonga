package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;

@C0376v0(19)
/* renamed from: androidx.emoji2.text.k */
public abstract class C19091k extends ReplacementSpan {

    /* renamed from: a */
    public final Paint.FontMetricsInt f48578a = new Paint.FontMetricsInt();
    @C0359n0

    /* renamed from: b */
    public final C19109r f48579b;

    /* renamed from: c */
    public short f48580c = -1;

    /* renamed from: d */
    public short f48581d = -1;

    /* renamed from: e */
    public float f48582e = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19091k(@C0359n0 C19109r rVar) {
        C18001r.m81776m(rVar, "rasterizer cannot be null");
        this.f48579b = rVar;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: a */
    public final int mo56276a() {
        return this.f48581d;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: b */
    public final int mo56277b() {
        return mo56279d().mo56358g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public final float mo56278c() {
        return this.f48582e;
    }

    @C0359n0
    /* renamed from: d */
    public final C19109r mo56279d() {
        return this.f48579b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public final int mo56280e() {
        return this.f48580c;
    }

    public int getSize(@C0359n0 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @C0363p0 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f48578a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f48578a;
        this.f48582e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f48579b.mo56357f());
        this.f48581d = (short) ((int) (((float) this.f48579b.mo56357f()) * this.f48582e));
        short k = (short) ((int) (((float) this.f48579b.mo56362k()) * this.f48582e));
        this.f48580c = k;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f48578a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k;
    }
}
