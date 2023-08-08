package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.content.res.C17465i;
import androidx.core.view.C18196h2;
import androidx.core.view.inputmethod.C18245g;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: androidx.appcompat.widget.t */
public class C0784t {

    /* renamed from: n */
    public static final int f2564n = -1;

    /* renamed from: o */
    public static final int f2565o = 1;

    /* renamed from: p */
    public static final int f2566p = 2;

    /* renamed from: q */
    public static final int f2567q = 3;
    @C0359n0

    /* renamed from: a */
    public final TextView f2568a;

    /* renamed from: b */
    public C0715f1 f2569b;

    /* renamed from: c */
    public C0715f1 f2570c;

    /* renamed from: d */
    public C0715f1 f2571d;

    /* renamed from: e */
    public C0715f1 f2572e;

    /* renamed from: f */
    public C0715f1 f2573f;

    /* renamed from: g */
    public C0715f1 f2574g;

    /* renamed from: h */
    public C0715f1 f2575h;
    @C0359n0

    /* renamed from: i */
    public final C0818z f2576i;

    /* renamed from: j */
    public int f2577j = 0;

    /* renamed from: k */
    public int f2578k = -1;

    /* renamed from: l */
    public Typeface f2579l;

    /* renamed from: m */
    public boolean f2580m;

    /* renamed from: androidx.appcompat.widget.t$a */
    public class C0785a extends C17465i.C17472g {

        /* renamed from: a */
        public final /* synthetic */ int f2581a;

        /* renamed from: b */
        public final /* synthetic */ int f2582b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f2583c;

        public C0785a(int i, int i2, WeakReference weakReference) {
            this.f2581a = i;
            this.f2582b = i2;
            this.f2583c = weakReference;
        }

        /* renamed from: h */
        public void mo3676h(int i) {
        }

        /* renamed from: i */
        public void mo3677i(@C0359n0 Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f2581a) != -1) {
                if ((this.f2582b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C0791g.m3850a(typeface, i, z);
            }
            C0784t.this.mo3663n(this.f2583c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    public class C0786b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TextView f2585a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f2586b;

        /* renamed from: c */
        public final /* synthetic */ int f2587c;

        public C0786b(TextView textView, Typeface typeface, int i) {
            this.f2585a = textView;
            this.f2586b = typeface;
            this.f2587c = i;
        }

        public void run() {
            this.f2585a.setTypeface(this.f2586b, this.f2587c);
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.appcompat.widget.t$c */
    public static class C0787c {
        @C0373u
        /* renamed from: a */
        public static Drawable[] m3840a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @C0373u
        /* renamed from: b */
        public static void m3841b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @C0373u
        /* renamed from: c */
        public static void m3842c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.appcompat.widget.t$d */
    public static class C0788d {
        @C0373u
        /* renamed from: a */
        public static Locale m3843a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.appcompat.widget.t$e */
    public static class C0789e {
        @C0373u
        /* renamed from: a */
        public static LocaleList m3844a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @C0373u
        /* renamed from: b */
        public static void m3845b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.appcompat.widget.t$f */
    public static class C0790f {
        @C0373u
        /* renamed from: a */
        public static int m3846a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @C0373u
        /* renamed from: b */
        public static void m3847b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: c */
        public static void m3848c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @C0373u
        /* renamed from: d */
        public static boolean m3849d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.appcompat.widget.t$g */
    public static class C0791g {
        @C0373u
        /* renamed from: a */
        public static Typeface m3850a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C0784t(@C0359n0 TextView textView) {
        this.f2568a = textView;
        this.f2576i = new C0818z(textView);
    }

    /* renamed from: d */
    public static C0715f1 m3809d(Context context, C0716g gVar, int i) {
        ColorStateList f = gVar.mo3429f(context, i);
        if (f == null) {
            return null;
        }
        C0715f1 f1Var = new C0715f1();
        f1Var.f2375d = true;
        f1Var.f2372a = f;
        return f1Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: A */
    public void mo3648A(int i, float f) {
        if (!C0796u1.f2594c && !mo3661l()) {
            mo3649B(i, f);
        }
    }

    /* renamed from: B */
    public final void mo3649B(int i, float f) {
        this.f2576i.mo3787w(i, f);
    }

    /* renamed from: C */
    public final void mo3650C(Context context, C0722h1 h1Var) {
        String w;
        boolean z;
        boolean z2;
        this.f2577j = h1Var.mo3473o(C0387a.C0400m.TextAppearance_android_textStyle, this.f2577j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int o = h1Var.mo3473o(C0387a.C0400m.TextAppearance_android_textFontWeight, -1);
            this.f2578k = o;
            if (o != -1) {
                this.f2577j = (this.f2577j & 2) | 0;
            }
        }
        int i2 = C0387a.C0400m.TextAppearance_android_fontFamily;
        if (h1Var.mo3455C(i2) || h1Var.mo3455C(C0387a.C0400m.TextAppearance_fontFamily)) {
            this.f2579l = null;
            int i3 = C0387a.C0400m.TextAppearance_fontFamily;
            if (h1Var.mo3455C(i3)) {
                i2 = i3;
            }
            int i4 = this.f2578k;
            int i5 = this.f2577j;
            if (!context.isRestricted()) {
                try {
                    Typeface k = h1Var.mo3469k(i2, this.f2577j, new C0785a(i4, i5, new WeakReference(this.f2568a)));
                    if (k != null) {
                        if (i < 28 || this.f2578k == -1) {
                            this.f2579l = k;
                        } else {
                            Typeface create = Typeface.create(k, 0);
                            int i6 = this.f2578k;
                            if ((this.f2577j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f2579l = C0791g.m3850a(create, i6, z2);
                        }
                    }
                    if (this.f2579l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f2580m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2579l == null && (w = h1Var.mo3481w(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f2578k == -1) {
                    this.f2579l = Typeface.create(w, this.f2577j);
                    return;
                }
                Typeface create2 = Typeface.create(w, 0);
                int i7 = this.f2578k;
                if ((this.f2577j & 2) != 0) {
                    z3 = true;
                }
                this.f2579l = C0791g.m3850a(create2, i7, z3);
                return;
            }
            return;
        }
        int i8 = C0387a.C0400m.TextAppearance_android_typeface;
        if (h1Var.mo3455C(i8)) {
            this.f2580m = false;
            int o2 = h1Var.mo3473o(i8, 1);
            if (o2 == 1) {
                this.f2579l = Typeface.SANS_SERIF;
            } else if (o2 == 2) {
                this.f2579l = Typeface.SERIF;
            } else if (o2 == 3) {
                this.f2579l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    public final void mo3651a(Drawable drawable, C0715f1 f1Var) {
        if (drawable != null && f1Var != null) {
            C0716g.m3509j(drawable, f1Var, this.f2568a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo3652b() {
        if (!(this.f2569b == null && this.f2570c == null && this.f2571d == null && this.f2572e == null)) {
            Drawable[] compoundDrawables = this.f2568a.getCompoundDrawables();
            mo3651a(compoundDrawables[0], this.f2569b);
            mo3651a(compoundDrawables[1], this.f2570c);
            mo3651a(compoundDrawables[2], this.f2571d);
            mo3651a(compoundDrawables[3], this.f2572e);
        }
        if (this.f2573f != null || this.f2574g != null) {
            Drawable[] a = C0787c.m3840a(this.f2568a);
            mo3651a(a[0], this.f2573f);
            mo3651a(a[2], this.f2574g);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo3653c() {
        this.f2576i.mo3769b();
    }

    /* renamed from: e */
    public int mo3654e() {
        return this.f2576i.mo3775h();
    }

    /* renamed from: f */
    public int mo3655f() {
        return this.f2576i.mo3776i();
    }

    /* renamed from: g */
    public int mo3656g() {
        return this.f2576i.mo3777j();
    }

    /* renamed from: h */
    public int[] mo3657h() {
        return this.f2576i.mo3778k();
    }

    /* renamed from: i */
    public int mo3658i() {
        return this.f2576i.mo3779l();
    }

    @C0363p0
    /* renamed from: j */
    public ColorStateList mo3659j() {
        C0715f1 f1Var = this.f2575h;
        if (f1Var != null) {
            return f1Var.f2372a;
        }
        return null;
    }

    @C0363p0
    /* renamed from: k */
    public PorterDuff.Mode mo3660k() {
        C0715f1 f1Var = this.f2575h;
        if (f1Var != null) {
            return f1Var.f2373b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public boolean mo3661l() {
        return this.f2576i.mo3781q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3662m(@androidx.annotation.C0363p0 android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f2568a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.g r11 = androidx.appcompat.widget.C0716g.m3506b()
            int[] r2 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.h1 r13 = androidx.appcompat.widget.C0722h1.m3539G(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f2568a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo3454B()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.C18196h2.m82658z1(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.mo3479u(r0, r14)
            int r1 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.mo3455C(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo3479u(r1, r12)
            androidx.appcompat.widget.f1 r1 = m3809d(r10, r11, r1)
            r7.f2569b = r1
        L_0x0042:
            int r1 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.mo3455C(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo3479u(r1, r12)
            androidx.appcompat.widget.f1 r1 = m3809d(r10, r11, r1)
            r7.f2570c = r1
        L_0x0054:
            int r1 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.mo3455C(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo3479u(r1, r12)
            androidx.appcompat.widget.f1 r1 = m3809d(r10, r11, r1)
            r7.f2571d = r1
        L_0x0066:
            int r1 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.mo3455C(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo3479u(r1, r12)
            androidx.appcompat.widget.f1 r1 = m3809d(r10, r11, r1)
            r7.f2572e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.mo3455C(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.mo3479u(r2, r12)
            androidx.appcompat.widget.f1 r2 = m3809d(r10, r11, r2)
            r7.f2573f = r2
        L_0x008c:
            int r2 = androidx.appcompat.C0387a.C0400m.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.mo3455C(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.mo3479u(r2, r12)
            androidx.appcompat.widget.f1 r2 = m3809d(r10, r11, r2)
            r7.f2574g = r2
        L_0x009e:
            r13.mo3458I()
            android.widget.TextView r2 = r7.f2568a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = androidx.appcompat.C0387a.C0400m.TextAppearance
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0722h1.m3537E(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = androidx.appcompat.C0387a.C0400m.TextAppearance_textAllCaps
            boolean r6 = r0.mo3455C(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.mo3459a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.mo3650C(r10, r0)
            int r15 = androidx.appcompat.C0387a.C0400m.TextAppearance_textLocale
            boolean r16 = r0.mo3455C(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.mo3481w(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = androidx.appcompat.C0387a.C0400m.TextAppearance_fontVariationSettings
            boolean r17 = r0.mo3455C(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.mo3481w(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.mo3458I()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = androidx.appcompat.C0387a.C0400m.TextAppearance
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0722h1.m3539G(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = androidx.appcompat.C0387a.C0400m.TextAppearance_textAllCaps
            boolean r18 = r0.mo3455C(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.mo3459a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = androidx.appcompat.C0387a.C0400m.TextAppearance_textLocale
            boolean r13 = r0.mo3455C(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.mo3481w(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = androidx.appcompat.C0387a.C0400m.TextAppearance_fontVariationSettings
            boolean r6 = r0.mo3455C(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.mo3481w(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r1 = androidx.appcompat.C0387a.C0400m.TextAppearance_android_textSize
            boolean r3 = r0.mo3455C(r1)
            if (r3 == 0) goto L_0x0139
            int r1 = r0.mo3465g(r1, r14)
            if (r1 != 0) goto L_0x0139
            android.widget.TextView r1 = r7.f2568a
            r3 = 0
            r1.setTextSize(r12, r3)
        L_0x0139:
            r7.mo3650C(r10, r0)
            r0.mo3458I()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.mo3668s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f2579l
            if (r0 == 0) goto L_0x015b
            int r1 = r7.f2578k
            if (r1 != r14) goto L_0x0156
            android.widget.TextView r1 = r7.f2568a
            int r2 = r7.f2577j
            r1.setTypeface(r0, r2)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r1 = r7.f2568a
            r1.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f2568a
            androidx.appcompat.widget.C0784t.C0790f.m3849d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x016d
            android.widget.TextView r0 = r7.f2568a
            android.os.LocaleList r1 = androidx.appcompat.widget.C0784t.C0789e.m3844a(r15)
            androidx.appcompat.widget.C0784t.C0789e.m3845b(r0, r1)
        L_0x016d:
            androidx.appcompat.widget.z r0 = r7.f2576i
            r0.mo3782r(r8, r9)
            boolean r0 = androidx.appcompat.widget.C0796u1.f2594c
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.z r0 = r7.f2576i
            int r0 = r0.mo3779l()
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.z r0 = r7.f2576i
            int[] r0 = r0.mo3778k()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01b1
            android.widget.TextView r1 = r7.f2568a
            int r1 = androidx.appcompat.widget.C0784t.C0790f.m3846a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            android.widget.TextView r0 = r7.f2568a
            androidx.appcompat.widget.z r1 = r7.f2576i
            int r1 = r1.mo3776i()
            androidx.appcompat.widget.z r2 = r7.f2576i
            int r2 = r2.mo3775h()
            androidx.appcompat.widget.z r3 = r7.f2576i
            int r3 = r3.mo3777j()
            androidx.appcompat.widget.C0784t.C0790f.m3847b(r0, r1, r2, r3, r12)
            goto L_0x01b1
        L_0x01ac:
            android.widget.TextView r1 = r7.f2568a
            androidx.appcompat.widget.C0784t.C0790f.m3848c(r1, r0, r12)
        L_0x01b1:
            int[] r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView
            androidx.appcompat.widget.h1 r8 = androidx.appcompat.widget.C0722h1.m3538F(r10, r8, r0)
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableLeftCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x01c5
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r1 = r0
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x01d4
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r2 = r0
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x01e3
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r3 = r0
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x01f2
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r4 = r0
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x0201
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r5 = r0
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo3479u(r0, r14)
            if (r0 == r14) goto L_0x0210
            android.graphics.drawable.Drawable r0 = r11.mo3427c(r10, r0)
            r6 = r0
            goto L_0x0211
        L_0x0210:
            r6 = 0
        L_0x0211:
            r0 = r19
            r0.mo3674y(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableTint
            boolean r1 = r8.mo3455C(r0)
            if (r1 == 0) goto L_0x0227
            android.content.res.ColorStateList r0 = r8.mo3462d(r0)
            android.widget.TextView r1 = r7.f2568a
            androidx.core.widget.C18496q.m83747u(r1, r0)
        L_0x0227:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_drawableTintMode
            boolean r1 = r8.mo3455C(r0)
            if (r1 == 0) goto L_0x023d
            int r0 = r8.mo3473o(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0725i0.m3584e(r0, r1)
            android.widget.TextView r1 = r7.f2568a
            androidx.core.widget.C18496q.m83748v(r1, r0)
        L_0x023d:
            int r0 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo3465g(r0, r14)
            int r1 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_lastBaselineToBottomHeight
            int r1 = r8.mo3465g(r1, r14)
            int r2 = androidx.appcompat.C0387a.C0400m.AppCompatTextView_lineHeight
            int r2 = r8.mo3465g(r2, r14)
            r8.mo3458I()
            if (r0 == r14) goto L_0x0259
            android.widget.TextView r3 = r7.f2568a
            androidx.core.widget.C18496q.m83719A(r3, r0)
        L_0x0259:
            if (r1 == r14) goto L_0x0260
            android.widget.TextView r0 = r7.f2568a
            androidx.core.widget.C18496q.m83720B(r0, r1)
        L_0x0260:
            if (r2 == r14) goto L_0x0267
            android.widget.TextView r0 = r7.f2568a
            androidx.core.widget.C18496q.m83721C(r0, r2)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0784t.mo3662m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void mo3663n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2580m) {
            this.f2579l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (C18196h2.m82521O0(textView)) {
                textView.post(new C0786b(textView, typeface, this.f2577j));
            } else {
                textView.setTypeface(typeface, this.f2577j);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: o */
    public void mo3664o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0796u1.f2594c) {
            mo3653c();
        }
    }

    /* renamed from: p */
    public void mo3665p() {
        mo3652b();
    }

    /* renamed from: q */
    public void mo3666q(Context context, int i) {
        String w;
        C0722h1 E = C0722h1.m3537E(context, i, C0387a.C0400m.TextAppearance);
        int i2 = C0387a.C0400m.TextAppearance_textAllCaps;
        if (E.mo3455C(i2)) {
            mo3668s(E.mo3459a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C0387a.C0400m.TextAppearance_android_textSize;
        if (E.mo3455C(i4) && E.mo3465g(i4, -1) == 0) {
            this.f2568a.setTextSize(0, 0.0f);
        }
        mo3650C(context, E);
        if (i3 >= 26) {
            int i5 = C0387a.C0400m.TextAppearance_fontVariationSettings;
            if (E.mo3455C(i5) && (w = E.mo3481w(i5)) != null) {
                C0790f.m3849d(this.f2568a, w);
            }
        }
        E.mo3458I();
        Typeface typeface = this.f2579l;
        if (typeface != null) {
            this.f2568a.setTypeface(typeface, this.f2577j);
        }
    }

    /* renamed from: r */
    public void mo3667r(@C0359n0 TextView textView, @C0363p0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C18245g.m82846j(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void mo3668s(boolean z) {
        this.f2568a.setAllCaps(z);
    }

    /* renamed from: t */
    public void mo3669t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f2576i.mo3783s(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void mo3670u(@C0359n0 int[] iArr, int i) throws IllegalArgumentException {
        this.f2576i.mo3784t(iArr, i);
    }

    /* renamed from: v */
    public void mo3671v(int i) {
        this.f2576i.mo3785u(i);
    }

    /* renamed from: w */
    public void mo3672w(@C0363p0 ColorStateList colorStateList) {
        boolean z;
        if (this.f2575h == null) {
            this.f2575h = new C0715f1();
        }
        C0715f1 f1Var = this.f2575h;
        f1Var.f2372a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        f1Var.f2375d = z;
        mo3675z();
    }

    /* renamed from: x */
    public void mo3673x(@C0363p0 PorterDuff.Mode mode) {
        boolean z;
        if (this.f2575h == null) {
            this.f2575h = new C0715f1();
        }
        C0715f1 f1Var = this.f2575h;
        f1Var.f2373b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        f1Var.f2374c = z;
        mo3675z();
    }

    /* renamed from: y */
    public final void mo3674y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a = C0787c.m3840a(this.f2568a);
            TextView textView = this.f2568a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C0787c.m3841b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a2 = C0787c.m3840a(this.f2568a);
            Drawable drawable7 = a2[0];
            if (drawable7 == null && a2[2] == null) {
                Drawable[] compoundDrawables = this.f2568a.getCompoundDrawables();
                TextView textView2 = this.f2568a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f2568a;
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            Drawable drawable8 = a2[2];
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            C0787c.m3841b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    public final void mo3675z() {
        C0715f1 f1Var = this.f2575h;
        this.f2569b = f1Var;
        this.f2570c = f1Var;
        this.f2571d = f1Var;
        this.f2572e = f1Var;
        this.f2573f = f1Var;
        this.f2574g = f1Var;
    }
}
