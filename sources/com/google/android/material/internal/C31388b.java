package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.math.C17760a;
import androidx.core.text.C17917f0;
import androidx.core.text.C17919g0;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import com.google.android.material.animation.C31093a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.C31497a;
import com.google.android.material.resources.C31501d;
import com.google.android.material.resources.C31507h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.b */
public final class C31388b {

    /* renamed from: t0 */
    public static final boolean f75809t0 = false;

    /* renamed from: u0 */
    public static final String f75810u0 = "CollapsingTextHelper";

    /* renamed from: v0 */
    public static final String f75811v0 = "…";

    /* renamed from: w0 */
    public static final float f75812w0 = 0.5f;

    /* renamed from: x0 */
    public static final boolean f75813x0 = false;
    @C0359n0

    /* renamed from: y0 */
    public static final Paint f75814y0 = null;

    /* renamed from: A */
    public Typeface f75815A;

    /* renamed from: B */
    public Typeface f75816B;

    /* renamed from: C */
    public Typeface f75817C;

    /* renamed from: D */
    public Typeface f75818D;

    /* renamed from: E */
    public C31497a f75819E;

    /* renamed from: F */
    public C31497a f75820F;
    @C0363p0

    /* renamed from: G */
    public CharSequence f75821G;
    @C0363p0

    /* renamed from: H */
    public CharSequence f75822H;

    /* renamed from: I */
    public boolean f75823I;

    /* renamed from: J */
    public boolean f75824J = true;

    /* renamed from: K */
    public boolean f75825K;
    @C0363p0

    /* renamed from: L */
    public Bitmap f75826L;

    /* renamed from: M */
    public Paint f75827M;

    /* renamed from: N */
    public float f75828N;

    /* renamed from: O */
    public float f75829O;

    /* renamed from: P */
    public float f75830P;

    /* renamed from: Q */
    public float f75831Q;

    /* renamed from: R */
    public float f75832R;

    /* renamed from: S */
    public int f75833S;

    /* renamed from: T */
    public int[] f75834T;

    /* renamed from: U */
    public boolean f75835U;
    @C0359n0

    /* renamed from: V */
    public final TextPaint f75836V;
    @C0359n0

    /* renamed from: W */
    public final TextPaint f75837W;

    /* renamed from: X */
    public TimeInterpolator f75838X;

    /* renamed from: Y */
    public TimeInterpolator f75839Y;

    /* renamed from: Z */
    public float f75840Z;

    /* renamed from: a */
    public final View f75841a;

    /* renamed from: a0 */
    public float f75842a0;

    /* renamed from: b */
    public boolean f75843b;

    /* renamed from: b0 */
    public float f75844b0;

    /* renamed from: c */
    public float f75845c;

    /* renamed from: c0 */
    public ColorStateList f75846c0;

    /* renamed from: d */
    public boolean f75847d;

    /* renamed from: d0 */
    public float f75848d0;

    /* renamed from: e */
    public float f75849e;

    /* renamed from: e0 */
    public float f75850e0;

    /* renamed from: f */
    public float f75851f;

    /* renamed from: f0 */
    public float f75852f0;

    /* renamed from: g */
    public int f75853g;

    /* renamed from: g0 */
    public ColorStateList f75854g0;
    @C0359n0

    /* renamed from: h */
    public final Rect f75855h;

    /* renamed from: h0 */
    public float f75856h0;
    @C0359n0

    /* renamed from: i */
    public final Rect f75857i;

    /* renamed from: i0 */
    public float f75858i0;
    @C0359n0

    /* renamed from: j */
    public final RectF f75859j;

    /* renamed from: j0 */
    public float f75860j0;

    /* renamed from: k */
    public int f75861k = 16;

    /* renamed from: k0 */
    public StaticLayout f75862k0;

    /* renamed from: l */
    public int f75863l = 16;

    /* renamed from: l0 */
    public float f75864l0;

    /* renamed from: m */
    public float f75865m = 15.0f;

    /* renamed from: m0 */
    public float f75866m0;

    /* renamed from: n */
    public float f75867n = 15.0f;

    /* renamed from: n0 */
    public float f75868n0;

    /* renamed from: o */
    public ColorStateList f75869o;

    /* renamed from: o0 */
    public CharSequence f75870o0;

    /* renamed from: p */
    public ColorStateList f75871p;

    /* renamed from: p0 */
    public int f75872p0 = 1;

    /* renamed from: q */
    public int f75873q;

    /* renamed from: q0 */
    public float f75874q0 = 0.0f;

    /* renamed from: r */
    public float f75875r;

    /* renamed from: r0 */
    public float f75876r0 = 1.0f;

    /* renamed from: s */
    public float f75877s;

    /* renamed from: s0 */
    public int f75878s0 = StaticLayoutBuilderCompat.f75779n;

    /* renamed from: t */
    public float f75879t;

    /* renamed from: u */
    public float f75880u;

    /* renamed from: v */
    public float f75881v;

    /* renamed from: w */
    public float f75882w;

    /* renamed from: x */
    public Typeface f75883x;

    /* renamed from: y */
    public Typeface f75884y;

    /* renamed from: z */
    public Typeface f75885z;

    /* renamed from: com.google.android.material.internal.b$a */
    public class C31389a implements C31497a.C31498a {
        public C31389a() {
        }

        /* renamed from: a */
        public void mo90096a(Typeface typeface) {
            C31388b.this.mo90069m0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.b$b */
    public class C31390b implements C31497a.C31498a {
        public C31390b() {
        }

        /* renamed from: a */
        public void mo90096a(Typeface typeface) {
            C31388b.this.mo90091x0(typeface);
        }
    }

    public C31388b(View view) {
        this.f75841a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f75836V = textPaint;
        this.f75837W = new TextPaint(textPaint);
        this.f75857i = new Rect();
        this.f75855h = new Rect();
        this.f75859j = new RectF();
        this.f75851f = mo90053e();
        mo90045Z(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: T */
    public static boolean m126760T(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: Y */
    public static float m126761Y(float f, float f2, float f3, @C0363p0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C31093a.m124647a(f, f2, f3);
    }

    @C0354l
    /* renamed from: a */
    public static int m126762a(@C0354l int i, @C0354l int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: e0 */
    public static boolean m126763e0(@C0359n0 Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: A */
    public ColorStateList mo90008A() {
        return this.f75869o;
    }

    /* renamed from: A0 */
    public void mo90009A0(boolean z) {
        this.f75847d = z;
    }

    /* renamed from: B */
    public float mo90010B() {
        mo90039R(this.f75837W);
        return (-this.f75837W.ascent()) + this.f75837W.descent();
    }

    /* renamed from: B0 */
    public void mo90011B0(float f) {
        this.f75849e = f;
        this.f75851f = mo90053e();
    }

    /* renamed from: C */
    public int mo90012C() {
        return this.f75861k;
    }

    @C0376v0(23)
    /* renamed from: C0 */
    public void mo90013C0(int i) {
        this.f75878s0 = i;
    }

    /* renamed from: D */
    public float mo90014D() {
        mo90039R(this.f75837W);
        return -this.f75837W.ascent();
    }

    /* renamed from: D0 */
    public final void mo90015D0(float f) {
        boolean z;
        mo90058h(f);
        if (!f75809t0 || this.f75828N == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f75825K = z;
        if (z) {
            mo90070n();
        }
        C18196h2.m82610n1(this.f75841a);
    }

    /* renamed from: E */
    public float mo90016E() {
        return this.f75865m;
    }

    @C0376v0(23)
    /* renamed from: E0 */
    public void mo90017E0(float f) {
        this.f75874q0 = f;
    }

    /* renamed from: F */
    public Typeface mo90018F() {
        Typeface typeface = this.f75815A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @C0376v0(23)
    /* renamed from: F0 */
    public void mo90019F0(@C0379x(from = 0.0d) float f) {
        this.f75876r0 = f;
    }

    /* renamed from: G */
    public float mo90020G() {
        return this.f75845c;
    }

    /* renamed from: G0 */
    public void mo90021G0(int i) {
        if (i != this.f75872p0) {
            this.f75872p0 = i;
            mo90062j();
            mo90050c0();
        }
    }

    /* renamed from: H */
    public float mo90022H() {
        return this.f75851f;
    }

    /* renamed from: H0 */
    public void mo90023H0(TimeInterpolator timeInterpolator) {
        this.f75838X = timeInterpolator;
        mo90050c0();
    }

    @C0376v0(23)
    /* renamed from: I */
    public int mo90024I() {
        return this.f75878s0;
    }

    /* renamed from: I0 */
    public void mo90025I0(boolean z) {
        this.f75824J = z;
    }

    /* renamed from: J */
    public int mo90026J() {
        StaticLayout staticLayout = this.f75862k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: J0 */
    public final boolean mo90027J0(int[] iArr) {
        this.f75834T = iArr;
        if (!mo90043W()) {
            return false;
        }
        mo90050c0();
        return true;
    }

    @C0376v0(23)
    /* renamed from: K */
    public float mo90028K() {
        return this.f75862k0.getSpacingAdd();
    }

    /* renamed from: K0 */
    public void mo90029K0(@C0363p0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f75821G, charSequence)) {
            this.f75821G = charSequence;
            this.f75822H = null;
            mo90062j();
            mo90050c0();
        }
    }

    @C0376v0(23)
    /* renamed from: L */
    public float mo90030L() {
        return this.f75862k0.getSpacingMultiplier();
    }

    /* renamed from: L0 */
    public void mo90031L0(TimeInterpolator timeInterpolator) {
        this.f75839Y = timeInterpolator;
        mo90050c0();
    }

    /* renamed from: M */
    public int mo90032M() {
        return this.f75872p0;
    }

    /* renamed from: M0 */
    public void mo90033M0(Typeface typeface) {
        boolean n0 = mo90071n0(typeface);
        boolean y0 = mo90093y0(typeface);
        if (n0 || y0) {
            mo90050c0();
        }
    }

    /* renamed from: N */
    public final Layout.Alignment mo90034N() {
        int d = C18306m0.m82991d(this.f75861k, this.f75823I ? 1 : 0) & 7;
        if (d == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (d != 5) {
            if (this.f75823I) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (this.f75823I) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* renamed from: N0 */
    public final boolean mo90035N0() {
        return this.f75872p0 > 1 && (!this.f75823I || this.f75847d) && !this.f75825K;
    }

    @C0363p0
    /* renamed from: O */
    public TimeInterpolator mo90036O() {
        return this.f75838X;
    }

    @C0363p0
    /* renamed from: P */
    public CharSequence mo90037P() {
        return this.f75821G;
    }

    /* renamed from: Q */
    public final void mo90038Q(@C0359n0 TextPaint textPaint) {
        textPaint.setTextSize(this.f75867n);
        textPaint.setTypeface(this.f75883x);
        textPaint.setLetterSpacing(this.f75856h0);
    }

    /* renamed from: R */
    public final void mo90039R(@C0359n0 TextPaint textPaint) {
        textPaint.setTextSize(this.f75865m);
        textPaint.setTypeface(this.f75815A);
        textPaint.setLetterSpacing(this.f75858i0);
    }

    /* renamed from: S */
    public final void mo90040S(float f) {
        Rect rect;
        if (this.f75847d) {
            RectF rectF = this.f75859j;
            if (f < this.f75851f) {
                rect = this.f75855h;
            } else {
                rect = this.f75857i;
            }
            rectF.set(rect);
            return;
        }
        this.f75859j.left = m126761Y((float) this.f75855h.left, (float) this.f75857i.left, f, this.f75838X);
        this.f75859j.top = m126761Y(this.f75875r, this.f75877s, f, this.f75838X);
        this.f75859j.right = m126761Y((float) this.f75855h.right, (float) this.f75857i.right, f, this.f75838X);
        this.f75859j.bottom = m126761Y((float) this.f75855h.bottom, (float) this.f75857i.bottom, f, this.f75838X);
    }

    /* renamed from: U */
    public final boolean mo90041U() {
        return C18196h2.m82553Z(this.f75841a) == 1;
    }

    /* renamed from: V */
    public boolean mo90042V() {
        return this.f75824J;
    }

    /* renamed from: W */
    public final boolean mo90043W() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f75871p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f75869o) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean mo90044X(@C0359n0 CharSequence charSequence, boolean z) {
        C17917f0 f0Var;
        if (z) {
            f0Var = C17919g0.f46381d;
        } else {
            f0Var = C17919g0.f46380c;
        }
        return f0Var.mo52361a(charSequence, 0, charSequence.length());
    }

    /* renamed from: Z */
    public void mo90045Z(@C0359n0 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f75885z;
            if (typeface != null) {
                this.f75884y = C31507h.m127399b(configuration, typeface);
            }
            Typeface typeface2 = this.f75817C;
            if (typeface2 != null) {
                this.f75816B = C31507h.m127399b(configuration, typeface2);
            }
            Typeface typeface3 = this.f75884y;
            if (typeface3 == null) {
                typeface3 = this.f75885z;
            }
            this.f75883x = typeface3;
            Typeface typeface4 = this.f75816B;
            if (typeface4 == null) {
                typeface4 = this.f75817C;
            }
            this.f75815A = typeface4;
            mo90052d0(true);
        }
    }

    /* renamed from: a0 */
    public final float mo90046a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public final void mo90047b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        mo90060i(1.0f, z);
        CharSequence charSequence = this.f75822H;
        if (!(charSequence == null || (staticLayout = this.f75862k0) == null)) {
            this.f75870o0 = TextUtils.ellipsize(charSequence, this.f75836V, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f75870o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f75864l0 = mo90046a0(this.f75836V, charSequence2);
        } else {
            this.f75864l0 = 0.0f;
        }
        int d = C18306m0.m82991d(this.f75863l, this.f75823I ? 1 : 0);
        int i2 = d & 112;
        if (i2 == 48) {
            this.f75877s = (float) this.f75857i.top;
        } else if (i2 != 80) {
            this.f75877s = ((float) this.f75857i.centerY()) - ((this.f75836V.descent() - this.f75836V.ascent()) / 2.0f);
        } else {
            this.f75877s = ((float) this.f75857i.bottom) + this.f75836V.ascent();
        }
        int i3 = d & C18306m0.f46962d;
        if (i3 == 1) {
            this.f75880u = ((float) this.f75857i.centerX()) - (this.f75864l0 / 2.0f);
        } else if (i3 != 5) {
            this.f75880u = (float) this.f75857i.left;
        } else {
            this.f75880u = ((float) this.f75857i.right) - this.f75864l0;
        }
        mo90060i(0.0f, z);
        StaticLayout staticLayout2 = this.f75862k0;
        if (staticLayout2 != null) {
            f = (float) staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f75862k0;
        if (staticLayout3 == null || this.f75872p0 <= 1) {
            CharSequence charSequence3 = this.f75822H;
            if (charSequence3 != null) {
                f2 = mo90046a0(this.f75836V, charSequence3);
            }
        } else {
            f2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f75862k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f75873q = i;
        int d2 = C18306m0.m82991d(this.f75861k, this.f75823I ? 1 : 0);
        int i4 = d2 & 112;
        if (i4 == 48) {
            this.f75875r = (float) this.f75855h.top;
        } else if (i4 != 80) {
            this.f75875r = ((float) this.f75855h.centerY()) - (f / 2.0f);
        } else {
            this.f75875r = (((float) this.f75855h.bottom) - f) + this.f75836V.descent();
        }
        int i5 = d2 & C18306m0.f46962d;
        if (i5 == 1) {
            this.f75879t = ((float) this.f75855h.centerX()) - (f2 / 2.0f);
        } else if (i5 != 5) {
            this.f75879t = (float) this.f75855h.left;
        } else {
            this.f75879t = ((float) this.f75855h.right) - f2;
        }
        mo90062j();
        mo90015D0(this.f75845c);
    }

    /* renamed from: b0 */
    public void mo90048b0() {
        boolean z;
        if (this.f75857i.width() <= 0 || this.f75857i.height() <= 0 || this.f75855h.width() <= 0 || this.f75855h.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f75843b = z;
    }

    /* renamed from: c */
    public final void mo90049c() {
        mo90056g(this.f75845c);
    }

    /* renamed from: c0 */
    public void mo90050c0() {
        mo90052d0(false);
    }

    /* renamed from: d */
    public final float mo90051d(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        float f2 = this.f75851f;
        if (f <= f2) {
            return C31093a.m124648b(1.0f, 0.0f, this.f75849e, f2, f);
        }
        return C31093a.m124648b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: d0 */
    public void mo90052d0(boolean z) {
        if ((this.f75841a.getHeight() > 0 && this.f75841a.getWidth() > 0) || z) {
            mo90047b(z);
            mo90049c();
        }
    }

    /* renamed from: e */
    public final float mo90053e() {
        float f = this.f75849e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: f */
    public final boolean mo90054f(@C0359n0 CharSequence charSequence) {
        boolean U = mo90041U();
        if (this.f75824J) {
            return mo90044X(charSequence, U);
        }
        return U;
    }

    /* renamed from: f0 */
    public void mo90055f0(int i, int i2, int i3, int i4) {
        if (!m126763e0(this.f75857i, i, i2, i3, i4)) {
            this.f75857i.set(i, i2, i3, i4);
            this.f75835U = true;
            mo90048b0();
        }
    }

    /* renamed from: g */
    public final void mo90056g(float f) {
        float f2;
        mo90040S(f);
        if (!this.f75847d) {
            this.f75881v = m126761Y(this.f75879t, this.f75880u, f, this.f75838X);
            this.f75882w = m126761Y(this.f75875r, this.f75877s, f, this.f75838X);
            mo90015D0(f);
            f2 = f;
        } else if (f < this.f75851f) {
            this.f75881v = this.f75879t;
            this.f75882w = this.f75875r;
            mo90015D0(0.0f);
            f2 = 0.0f;
        } else {
            this.f75881v = this.f75880u;
            this.f75882w = this.f75877s - ((float) Math.max(0, this.f75853g));
            mo90015D0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C31093a.f74426b;
        mo90061i0(1.0f - m126761Y(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        mo90083t0(m126761Y(1.0f, 0.0f, f, timeInterpolator));
        if (this.f75871p != this.f75869o) {
            this.f75836V.setColor(m126762a(mo90092y(), mo90088w(), f2));
        } else {
            this.f75836V.setColor(mo90088w());
        }
        float f3 = this.f75856h0;
        float f4 = this.f75858i0;
        if (f3 != f4) {
            this.f75836V.setLetterSpacing(m126761Y(f4, f3, f, timeInterpolator));
        } else {
            this.f75836V.setLetterSpacing(f3);
        }
        this.f75830P = m126761Y(this.f75848d0, this.f75840Z, f, (TimeInterpolator) null);
        this.f75831Q = m126761Y(this.f75850e0, this.f75842a0, f, (TimeInterpolator) null);
        this.f75832R = m126761Y(this.f75852f0, this.f75844b0, f, (TimeInterpolator) null);
        int a = m126762a(mo90090x(this.f75854g0), mo90090x(this.f75846c0), f);
        this.f75833S = a;
        this.f75836V.setShadowLayer(this.f75830P, this.f75831Q, this.f75832R, a);
        if (this.f75847d) {
            this.f75836V.setAlpha((int) (mo90051d(f) * ((float) this.f75836V.getAlpha())));
        }
        C18196h2.m82610n1(this.f75841a);
    }

    /* renamed from: g0 */
    public void mo90057g0(@C0359n0 Rect rect) {
        mo90055f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public final void mo90058h(float f) {
        mo90060i(f, false);
    }

    /* renamed from: h0 */
    public void mo90059h0(int i) {
        C31501d dVar = new C31501d(this.f75841a.getContext(), i);
        if (dVar.mo90649i() != null) {
            this.f75871p = dVar.mo90649i();
        }
        if (dVar.mo90650j() != 0.0f) {
            this.f75867n = dVar.mo90650j();
        }
        ColorStateList colorStateList = dVar.f76271c;
        if (colorStateList != null) {
            this.f75846c0 = colorStateList;
        }
        this.f75842a0 = dVar.f76276h;
        this.f75844b0 = dVar.f76277i;
        this.f75840Z = dVar.f76278j;
        this.f75856h0 = dVar.f76280l;
        C31497a aVar = this.f75820F;
        if (aVar != null) {
            aVar.mo90642c();
        }
        this.f75820F = new C31497a(new C31389a(), dVar.mo90645e());
        dVar.mo90648h(this.f75841a.getContext(), this.f75820F);
        mo90050c0();
    }

    /* renamed from: i */
    public final void mo90060i(float f, boolean z) {
        float f2;
        float f3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.f75821G != null) {
            float width = (float) this.f75857i.width();
            float width2 = (float) this.f75855h.width();
            boolean z7 = false;
            int i = 1;
            if (m126760T(f, 1.0f)) {
                f3 = this.f75867n;
                f2 = this.f75856h0;
                this.f75828N = 1.0f;
                Typeface typeface = this.f75818D;
                Typeface typeface2 = this.f75883x;
                if (typeface != typeface2) {
                    this.f75818D = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.f75865m;
                float f5 = this.f75858i0;
                Typeface typeface3 = this.f75818D;
                Typeface typeface4 = this.f75815A;
                if (typeface3 != typeface4) {
                    this.f75818D = typeface4;
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (m126760T(f, 0.0f)) {
                    this.f75828N = 1.0f;
                } else {
                    this.f75828N = m126761Y(this.f75865m, this.f75867n, f, this.f75839Y) / this.f75865m;
                }
                float f6 = this.f75867n / this.f75865m;
                float f7 = width2 * f6;
                if (!z && f7 > width) {
                    width = Math.min(width / f6, width2);
                } else {
                    width = width2;
                }
                f3 = f4;
                f2 = f5;
                z2 = z6;
            }
            if (width > 0.0f) {
                if (this.f75829O != f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f75860j0 != f2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 || z4 || this.f75835U || z2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f75829O = f3;
                this.f75860j0 = f2;
                this.f75835U = false;
            }
            if (this.f75822H == null || z2) {
                this.f75836V.setTextSize(this.f75829O);
                this.f75836V.setTypeface(this.f75818D);
                this.f75836V.setLetterSpacing(this.f75860j0);
                TextPaint textPaint = this.f75836V;
                if (this.f75828N != 1.0f) {
                    z7 = true;
                }
                textPaint.setLinearText(z7);
                this.f75823I = mo90054f(this.f75821G);
                if (mo90035N0()) {
                    i = this.f75872p0;
                }
                StaticLayout k = mo90064k(i, width, this.f75823I);
                this.f75862k0 = k;
                this.f75822H = k.getText();
            }
        }
    }

    /* renamed from: i0 */
    public final void mo90061i0(float f) {
        this.f75866m0 = f;
        C18196h2.m82610n1(this.f75841a);
    }

    /* renamed from: j */
    public final void mo90062j() {
        Bitmap bitmap = this.f75826L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f75826L = null;
        }
    }

    /* renamed from: j0 */
    public void mo90063j0(ColorStateList colorStateList) {
        if (this.f75871p != colorStateList) {
            this.f75871p = colorStateList;
            mo90050c0();
        }
    }

    /* renamed from: k */
    public final StaticLayout mo90064k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (i == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
                e.getCause().getMessage();
                staticLayout = null;
            }
        } else {
            alignment = mo90034N();
        }
        staticLayout = StaticLayoutBuilderCompat.m126724c(this.f75821G, this.f75836V, (int) f).mo89980e(TextUtils.TruncateAt.END).mo89984i(z).mo89979d(alignment).mo89983h(false).mo89986k(i).mo89985j(this.f75874q0, this.f75876r0).mo89982g(this.f75878s0).mo89977a();
        return (StaticLayout) C18001r.m81775l(staticLayout);
    }

    /* renamed from: k0 */
    public void mo90065k0(int i) {
        if (this.f75863l != i) {
            this.f75863l = i;
            mo90050c0();
        }
    }

    /* renamed from: l */
    public void mo90066l(@C0359n0 Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f75822H != null && this.f75843b) {
            this.f75836V.setTextSize(this.f75829O);
            float f = this.f75881v;
            float f2 = this.f75882w;
            if (!this.f75825K || this.f75826L == null) {
                z = false;
            } else {
                z = true;
            }
            float f3 = this.f75828N;
            if (f3 != 1.0f && !this.f75847d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f75826L, f, f2, this.f75827M);
                canvas.restoreToCount(save);
                return;
            }
            if (!mo90035N0() || (this.f75847d && this.f75845c <= this.f75851f)) {
                canvas.translate(f, f2);
                this.f75862k0.draw(canvas);
            } else {
                mo90068m(canvas, this.f75881v - ((float) this.f75862k0.getLineStart(0)), f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l0 */
    public void mo90067l0(float f) {
        if (this.f75867n != f) {
            this.f75867n = f;
            mo90050c0();
        }
    }

    /* renamed from: m */
    public final void mo90068m(@C0359n0 Canvas canvas, float f, float f2) {
        int alpha = this.f75836V.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f75836V.setAlpha((int) (this.f75868n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f75836V;
            textPaint.setShadowLayer(this.f75830P, this.f75831Q, this.f75832R, C31266s.m125950a(this.f75833S, textPaint.getAlpha()));
        }
        Canvas canvas2 = canvas;
        this.f75862k0.draw(canvas);
        this.f75836V.setAlpha((int) (this.f75866m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f75836V;
            textPaint2.setShadowLayer(this.f75830P, this.f75831Q, this.f75832R, C31266s.m125950a(this.f75833S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f75862k0.getLineBaseline(0);
        CharSequence charSequence = this.f75870o0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f75836V);
        if (i >= 31) {
            this.f75836V.setShadowLayer(this.f75830P, this.f75831Q, this.f75832R, this.f75833S);
        }
        if (!this.f75847d) {
            String trim = this.f75870o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f75836V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f75862k0.getLineEnd(0), str.length()), 0.0f, f4, this.f75836V);
        }
    }

    /* renamed from: m0 */
    public void mo90069m0(Typeface typeface) {
        if (mo90071n0(typeface)) {
            mo90050c0();
        }
    }

    /* renamed from: n */
    public final void mo90070n() {
        if (this.f75826L == null && !this.f75855h.isEmpty() && !TextUtils.isEmpty(this.f75822H)) {
            mo90056g(0.0f);
            int width = this.f75862k0.getWidth();
            int height = this.f75862k0.getHeight();
            if (width > 0 && height > 0) {
                this.f75826L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f75862k0.draw(new Canvas(this.f75826L));
                if (this.f75827M == null) {
                    this.f75827M = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n0 */
    public final boolean mo90071n0(Typeface typeface) {
        C31497a aVar = this.f75820F;
        if (aVar != null) {
            aVar.mo90642c();
        }
        if (this.f75885z == typeface) {
            return false;
        }
        this.f75885z = typeface;
        Typeface b = C31507h.m127399b(this.f75841a.getContext().getResources().getConfiguration(), typeface);
        this.f75884y = b;
        if (b == null) {
            b = this.f75885z;
        }
        this.f75883x = b;
        return true;
    }

    /* renamed from: o */
    public void mo90072o(@C0359n0 RectF rectF, int i, int i2) {
        this.f75823I = mo90054f(this.f75821G);
        rectF.left = mo90080s(i, i2);
        rectF.top = (float) this.f75857i.top;
        rectF.right = mo90082t(rectF, i, i2);
        rectF.bottom = ((float) this.f75857i.top) + mo90078r();
    }

    /* renamed from: o0 */
    public void mo90073o0(int i) {
        this.f75853g = i;
    }

    /* renamed from: p */
    public ColorStateList mo90074p() {
        return this.f75871p;
    }

    /* renamed from: p0 */
    public void mo90075p0(int i, int i2, int i3, int i4) {
        if (!m126763e0(this.f75855h, i, i2, i3, i4)) {
            this.f75855h.set(i, i2, i3, i4);
            this.f75835U = true;
            mo90048b0();
        }
    }

    /* renamed from: q */
    public int mo90076q() {
        return this.f75863l;
    }

    /* renamed from: q0 */
    public void mo90077q0(@C0359n0 Rect rect) {
        mo90075p0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: r */
    public float mo90078r() {
        mo90038Q(this.f75837W);
        return -this.f75837W.ascent();
    }

    /* renamed from: r0 */
    public void mo90079r0(float f) {
        if (this.f75858i0 != f) {
            this.f75858i0 = f;
            mo90050c0();
        }
    }

    /* renamed from: s */
    public final float mo90080s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (this.f75864l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f75823I) {
                return (float) this.f75857i.left;
            }
            return ((float) this.f75857i.right) - this.f75864l0;
        } else if (this.f75823I) {
            return ((float) this.f75857i.right) - this.f75864l0;
        } else {
            return (float) this.f75857i.left;
        }
    }

    /* renamed from: s0 */
    public void mo90081s0(int i) {
        C31501d dVar = new C31501d(this.f75841a.getContext(), i);
        if (dVar.mo90649i() != null) {
            this.f75869o = dVar.mo90649i();
        }
        if (dVar.mo90650j() != 0.0f) {
            this.f75865m = dVar.mo90650j();
        }
        ColorStateList colorStateList = dVar.f76271c;
        if (colorStateList != null) {
            this.f75854g0 = colorStateList;
        }
        this.f75850e0 = dVar.f76276h;
        this.f75852f0 = dVar.f76277i;
        this.f75848d0 = dVar.f76278j;
        this.f75858i0 = dVar.f76280l;
        C31497a aVar = this.f75819E;
        if (aVar != null) {
            aVar.mo90642c();
        }
        this.f75819E = new C31497a(new C31390b(), dVar.mo90645e());
        dVar.mo90648h(this.f75841a.getContext(), this.f75819E);
        mo90050c0();
    }

    /* renamed from: t */
    public final float mo90082t(@C0359n0 RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (this.f75864l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f75823I) {
                return rectF.left + this.f75864l0;
            }
            return (float) this.f75857i.right;
        } else if (this.f75823I) {
            return (float) this.f75857i.right;
        } else {
            return rectF.left + this.f75864l0;
        }
    }

    /* renamed from: t0 */
    public final void mo90083t0(float f) {
        this.f75868n0 = f;
        C18196h2.m82610n1(this.f75841a);
    }

    /* renamed from: u */
    public float mo90084u() {
        return this.f75867n;
    }

    /* renamed from: u0 */
    public void mo90085u0(ColorStateList colorStateList) {
        if (this.f75869o != colorStateList) {
            this.f75869o = colorStateList;
            mo90050c0();
        }
    }

    /* renamed from: v */
    public Typeface mo90086v() {
        Typeface typeface = this.f75883x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: v0 */
    public void mo90087v0(int i) {
        if (this.f75861k != i) {
            this.f75861k = i;
            mo90050c0();
        }
    }

    @C0354l
    /* renamed from: w */
    public int mo90088w() {
        return mo90090x(this.f75871p);
    }

    /* renamed from: w0 */
    public void mo90089w0(float f) {
        if (this.f75865m != f) {
            this.f75865m = f;
            mo90050c0();
        }
    }

    @C0354l
    /* renamed from: x */
    public final int mo90090x(@C0363p0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f75834T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: x0 */
    public void mo90091x0(Typeface typeface) {
        if (mo90093y0(typeface)) {
            mo90050c0();
        }
    }

    @C0354l
    /* renamed from: y */
    public final int mo90092y() {
        return mo90090x(this.f75869o);
    }

    /* renamed from: y0 */
    public final boolean mo90093y0(Typeface typeface) {
        C31497a aVar = this.f75819E;
        if (aVar != null) {
            aVar.mo90642c();
        }
        if (this.f75817C == typeface) {
            return false;
        }
        this.f75817C = typeface;
        Typeface b = C31507h.m127399b(this.f75841a.getContext().getResources().getConfiguration(), typeface);
        this.f75816B = b;
        if (b == null) {
            b = this.f75817C;
        }
        this.f75815A = b;
        return true;
    }

    /* renamed from: z */
    public int mo90094z() {
        return this.f75873q;
    }

    /* renamed from: z0 */
    public void mo90095z0(float f) {
        float d = C17760a.m81101d(f, 0.0f, 1.0f);
        if (d != this.f75845c) {
            this.f75845c = d;
            mo90049c();
        }
    }
}
