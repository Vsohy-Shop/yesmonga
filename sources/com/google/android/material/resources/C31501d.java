package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import androidx.annotation.C0327c1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0383y;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17465i;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.d */
public class C31501d {

    /* renamed from: r */
    public static final String f76265r = "TextAppearance";

    /* renamed from: s */
    public static final int f76266s = 1;

    /* renamed from: t */
    public static final int f76267t = 2;

    /* renamed from: u */
    public static final int f76268u = 3;
    @C0363p0

    /* renamed from: a */
    public final ColorStateList f76269a;
    @C0363p0

    /* renamed from: b */
    public final ColorStateList f76270b;
    @C0363p0

    /* renamed from: c */
    public final ColorStateList f76271c;
    @C0363p0

    /* renamed from: d */
    public final String f76272d;

    /* renamed from: e */
    public final int f76273e;

    /* renamed from: f */
    public final int f76274f;

    /* renamed from: g */
    public final boolean f76275g;

    /* renamed from: h */
    public final float f76276h;

    /* renamed from: i */
    public final float f76277i;

    /* renamed from: j */
    public final float f76278j;

    /* renamed from: k */
    public final boolean f76279k;

    /* renamed from: l */
    public final float f76280l;
    @C0363p0

    /* renamed from: m */
    public ColorStateList f76281m;

    /* renamed from: n */
    public float f76282n;
    @C0383y

    /* renamed from: o */
    public final int f76283o;

    /* renamed from: p */
    public boolean f76284p = false;

    /* renamed from: q */
    public Typeface f76285q;

    /* renamed from: com.google.android.material.resources.d$a */
    public class C31502a extends C17465i.C17472g {

        /* renamed from: a */
        public final /* synthetic */ C31505f f76286a;

        public C31502a(C31505f fVar) {
            this.f76286a = fVar;
        }

        /* renamed from: h */
        public void mo3676h(int i) {
            boolean unused = C31501d.this.f76284p = true;
            this.f76286a.mo88913a(i);
        }

        /* renamed from: i */
        public void mo3677i(@C0359n0 Typeface typeface) {
            C31501d dVar = C31501d.this;
            Typeface unused = dVar.f76285q = Typeface.create(typeface, dVar.f76273e);
            boolean unused2 = C31501d.this.f76284p = true;
            this.f76286a.mo88914b(C31501d.this.f76285q, false);
        }
    }

    /* renamed from: com.google.android.material.resources.d$b */
    public class C31503b extends C31505f {

        /* renamed from: a */
        public final /* synthetic */ Context f76288a;

        /* renamed from: b */
        public final /* synthetic */ TextPaint f76289b;

        /* renamed from: c */
        public final /* synthetic */ C31505f f76290c;

        public C31503b(Context context, TextPaint textPaint, C31505f fVar) {
            this.f76288a = context;
            this.f76289b = textPaint;
            this.f76290c = fVar;
        }

        /* renamed from: a */
        public void mo88913a(int i) {
            this.f76290c.mo88913a(i);
        }

        /* renamed from: b */
        public void mo88914b(@C0359n0 Typeface typeface, boolean z) {
            C31501d.this.mo90656p(this.f76288a, this.f76289b, typeface);
            this.f76290c.mo88914b(typeface, z);
        }
    }

    public C31501d(@C0359n0 Context context, @C0327c1 int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C31076a.C31091o.TextAppearance);
        mo90652l(obtainStyledAttributes.getDimension(C31076a.C31091o.TextAppearance_android_textSize, 0.0f));
        mo90651k(C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.TextAppearance_android_textColor));
        this.f76269a = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.TextAppearance_android_textColorHint);
        this.f76270b = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.TextAppearance_android_textColorLink);
        this.f76273e = obtainStyledAttributes.getInt(C31076a.C31091o.TextAppearance_android_textStyle, 0);
        this.f76274f = obtainStyledAttributes.getInt(C31076a.C31091o.TextAppearance_android_typeface, 1);
        int f = C31500c.m127368f(obtainStyledAttributes, C31076a.C31091o.TextAppearance_fontFamily, C31076a.C31091o.TextAppearance_android_fontFamily);
        this.f76283o = obtainStyledAttributes.getResourceId(f, 0);
        this.f76272d = obtainStyledAttributes.getString(f);
        this.f76275g = obtainStyledAttributes.getBoolean(C31076a.C31091o.TextAppearance_textAllCaps, false);
        this.f76271c = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.TextAppearance_android_shadowColor);
        this.f76276h = obtainStyledAttributes.getFloat(C31076a.C31091o.TextAppearance_android_shadowDx, 0.0f);
        this.f76277i = obtainStyledAttributes.getFloat(C31076a.C31091o.TextAppearance_android_shadowDy, 0.0f);
        this.f76278j = obtainStyledAttributes.getFloat(C31076a.C31091o.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C31076a.C31091o.MaterialTextAppearance);
        int i2 = C31076a.C31091o.MaterialTextAppearance_android_letterSpacing;
        this.f76279k = obtainStyledAttributes2.hasValue(i2);
        this.f76280l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void mo90644d() {
        String str;
        if (this.f76285q == null && (str = this.f76272d) != null) {
            this.f76285q = Typeface.create(str, this.f76273e);
        }
        if (this.f76285q == null) {
            int i = this.f76274f;
            if (i == 1) {
                this.f76285q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f76285q = Typeface.SERIF;
            } else if (i != 3) {
                this.f76285q = Typeface.DEFAULT;
            } else {
                this.f76285q = Typeface.MONOSPACE;
            }
            this.f76285q = Typeface.create(this.f76285q, this.f76273e);
        }
    }

    /* renamed from: e */
    public Typeface mo90645e() {
        mo90644d();
        return this.f76285q;
    }

    @C0344h1
    @C0359n0
    /* renamed from: f */
    public Typeface mo90646f(@C0359n0 Context context) {
        if (this.f76284p) {
            return this.f76285q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j = C17465i.m80178j(context, this.f76283o);
                this.f76285q = j;
                if (j != null) {
                    this.f76285q = Typeface.create(j, this.f76273e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f76272d);
            }
        }
        mo90644d();
        this.f76284p = true;
        return this.f76285q;
    }

    /* renamed from: g */
    public void mo90647g(@C0359n0 Context context, @C0359n0 TextPaint textPaint, @C0359n0 C31505f fVar) {
        mo90656p(context, textPaint, mo90645e());
        mo90648h(context, new C31503b(context, textPaint, fVar));
    }

    /* renamed from: h */
    public void mo90648h(@C0359n0 Context context, @C0359n0 C31505f fVar) {
        if (mo90653m(context)) {
            mo90646f(context);
        } else {
            mo90644d();
        }
        int i = this.f76283o;
        if (i == 0) {
            this.f76284p = true;
        }
        if (this.f76284p) {
            fVar.mo88914b(this.f76285q, true);
            return;
        }
        try {
            C17465i.m80180l(context, i, new C31502a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f76284p = true;
            fVar.mo88913a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f76272d);
            this.f76284p = true;
            fVar.mo88913a(-3);
        }
    }

    @C0363p0
    /* renamed from: i */
    public ColorStateList mo90649i() {
        return this.f76281m;
    }

    /* renamed from: j */
    public float mo90650j() {
        return this.f76282n;
    }

    /* renamed from: k */
    public void mo90651k(@C0363p0 ColorStateList colorStateList) {
        this.f76281m = colorStateList;
    }

    /* renamed from: l */
    public void mo90652l(float f) {
        this.f76282n = f;
    }

    /* renamed from: m */
    public final boolean mo90653m(Context context) {
        Typeface typeface;
        if (C31504e.m127394b()) {
            return true;
        }
        int i = this.f76283o;
        if (i != 0) {
            typeface = C17465i.m80172d(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void mo90654n(@C0359n0 Context context, @C0359n0 TextPaint textPaint, @C0359n0 C31505f fVar) {
        int i;
        int i2;
        mo90655o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f76281m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f76278j;
        float f2 = this.f76276h;
        float f3 = this.f76277i;
        ColorStateList colorStateList2 = this.f76271c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: o */
    public void mo90655o(@C0359n0 Context context, @C0359n0 TextPaint textPaint, @C0359n0 C31505f fVar) {
        if (mo90653m(context)) {
            mo90656p(context, textPaint, mo90646f(context));
        } else {
            mo90647g(context, textPaint, fVar);
        }
    }

    /* renamed from: p */
    public void mo90656p(@C0359n0 Context context, @C0359n0 TextPaint textPaint, @C0359n0 Typeface typeface) {
        boolean z;
        float f;
        Typeface a = C31507h.m127398a(context, typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f76273e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f76282n);
        if (this.f76279k) {
            textPaint.setLetterSpacing(this.f76280l);
        }
    }
}
