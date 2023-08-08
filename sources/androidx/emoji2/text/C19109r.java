package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.C0328d;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.C19063n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0328d
@C0376v0(19)
/* renamed from: androidx.emoji2.text.r */
public class C19109r {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: d */
    public static final int f48625d = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: e */
    public static final int f48626e = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: f */
    public static final int f48627f = 2;

    /* renamed from: g */
    public static final ThreadLocal<C19063n> f48628g = new ThreadLocal<>();

    /* renamed from: a */
    public final int f48629a;
    @C0359n0

    /* renamed from: b */
    public final C19105p f48630b;

    /* renamed from: c */
    public volatile int f48631c = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.r$a */
    public @interface C19110a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19109r(@C0359n0 C19105p pVar, @C0337f0(from = 0) int i) {
        this.f48630b = pVar;
        this.f48629a = i;
    }

    /* renamed from: a */
    public void mo56352a(@C0359n0 Canvas canvas, float f, float f2, @C0359n0 Paint paint) {
        Typeface j = this.f48630b.mo56313j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f48630b.mo56309f(), this.f48629a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo56353b(int i) {
        return mo56359h().mo56199F(i);
    }

    /* renamed from: c */
    public int mo56354c() {
        return mo56359h().mo56202I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public short mo56355d() {
        return mo56359h().mo56205L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public int mo56356e() {
        return this.f48631c & 3;
    }

    /* renamed from: f */
    public int mo56357f() {
        return mo56359h().mo56207S();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public int mo56358g() {
        return mo56359h().mo56208T();
    }

    /* renamed from: h */
    public final C19063n mo56359h() {
        ThreadLocal<C19063n> threadLocal = f48628g;
        C19063n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new C19063n();
            threadLocal.set(nVar);
        }
        this.f48630b.mo56310g().mo56217J(nVar, this.f48629a);
        return nVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public short mo56360i() {
        return mo56359h().mo56209U();
    }

    @C0359n0
    /* renamed from: j */
    public Typeface mo56361j() {
        return this.f48630b.mo56313j();
    }

    /* renamed from: k */
    public int mo56362k() {
        return mo56359h().mo56210X();
    }

    /* renamed from: l */
    public boolean mo56363l() {
        return mo56359h().mo56206O();
    }

    /* renamed from: m */
    public boolean mo56364m() {
        return (this.f48631c & 4) > 0;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: n */
    public void mo56365n() {
        if (mo56364m()) {
            this.f48631c = 4;
        } else {
            this.f48631c = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: o */
    public void mo56366o(boolean z) {
        int e = mo56356e();
        if (z) {
            this.f48631c = e | 4;
        } else {
            this.f48631c = e;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p */
    public void mo56367p(boolean z) {
        int i;
        int i2 = this.f48631c & 4;
        if (z) {
            i = i2 | 2;
        } else {
            i = i2 | 1;
        }
        this.f48631c = i;
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo56358g()));
        sb.append(", codepoints:");
        int c = mo56354c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo56353b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
