package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0330d1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.core.content.res.C17465i;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.h1 */
public class C0722h1 {

    /* renamed from: a */
    public final Context f2390a;

    /* renamed from: b */
    public final TypedArray f2391b;

    /* renamed from: c */
    public TypedValue f2392c;

    @C0376v0(21)
    /* renamed from: androidx.appcompat.widget.h1$a */
    public static class C0723a {
        @C0373u
        /* renamed from: a */
        public static int m3572a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @C0373u
        /* renamed from: b */
        public static int m3573b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public C0722h1(Context context, TypedArray typedArray) {
        this.f2390a = context;
        this.f2391b = typedArray;
    }

    /* renamed from: E */
    public static C0722h1 m3537E(Context context, int i, int[] iArr) {
        return new C0722h1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: F */
    public static C0722h1 m3538F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0722h1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: G */
    public static C0722h1 m3539G(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0722h1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: A */
    public boolean mo3453A(int i, TypedValue typedValue) {
        return this.f2391b.getValue(i, typedValue);
    }

    /* renamed from: B */
    public TypedArray mo3454B() {
        return this.f2391b;
    }

    /* renamed from: C */
    public boolean mo3455C(int i) {
        return this.f2391b.hasValue(i);
    }

    /* renamed from: D */
    public int mo3456D() {
        return this.f2391b.length();
    }

    /* renamed from: H */
    public TypedValue mo3457H(int i) {
        return this.f2391b.peekValue(i);
    }

    /* renamed from: I */
    public void mo3458I() {
        this.f2391b.recycle();
    }

    /* renamed from: a */
    public boolean mo3459a(int i, boolean z) {
        return this.f2391b.getBoolean(i, z);
    }

    @C0376v0(21)
    /* renamed from: b */
    public int mo3460b() {
        return C0723a.m3572a(this.f2391b);
    }

    /* renamed from: c */
    public int mo3461c(int i, int i2) {
        return this.f2391b.getColor(i, i2);
    }

    /* renamed from: d */
    public ColorStateList mo3462d(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f2391b.hasValue(i) || (resourceId = this.f2391b.getResourceId(i, 0)) == 0 || (a = C0507a.m2345a(this.f2390a, resourceId)) == null) {
            return this.f2391b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: e */
    public float mo3463e(int i, float f) {
        return this.f2391b.getDimension(i, f);
    }

    /* renamed from: f */
    public int mo3464f(int i, int i2) {
        return this.f2391b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: g */
    public int mo3465g(int i, int i2) {
        return this.f2391b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: h */
    public Drawable mo3466h(int i) {
        int resourceId;
        if (!this.f2391b.hasValue(i) || (resourceId = this.f2391b.getResourceId(i, 0)) == 0) {
            return this.f2391b.getDrawable(i);
        }
        return C0507a.m2346b(this.f2390a, resourceId);
    }

    /* renamed from: i */
    public Drawable mo3467i(int i) {
        int resourceId;
        if (!this.f2391b.hasValue(i) || (resourceId = this.f2391b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0716g.m3506b().mo3428d(this.f2390a, resourceId, true);
    }

    /* renamed from: j */
    public float mo3468j(int i, float f) {
        return this.f2391b.getFloat(i, f);
    }

    @C0363p0
    /* renamed from: k */
    public Typeface mo3469k(@C0330d1 int i, int i2, @C0363p0 C17465i.C17472g gVar) {
        int resourceId = this.f2391b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2392c == null) {
            this.f2392c = new TypedValue();
        }
        return C17465i.m80179k(this.f2390a, resourceId, this.f2392c, i2, gVar);
    }

    /* renamed from: l */
    public float mo3470l(int i, int i2, int i3, float f) {
        return this.f2391b.getFraction(i, i2, i3, f);
    }

    /* renamed from: m */
    public int mo3471m(int i) {
        return this.f2391b.getIndex(i);
    }

    /* renamed from: n */
    public int mo3472n() {
        return this.f2391b.getIndexCount();
    }

    /* renamed from: o */
    public int mo3473o(int i, int i2) {
        return this.f2391b.getInt(i, i2);
    }

    /* renamed from: p */
    public int mo3474p(int i, int i2) {
        return this.f2391b.getInteger(i, i2);
    }

    /* renamed from: q */
    public int mo3475q(int i, int i2) {
        return this.f2391b.getLayoutDimension(i, i2);
    }

    /* renamed from: r */
    public int mo3476r(int i, String str) {
        return this.f2391b.getLayoutDimension(i, str);
    }

    /* renamed from: s */
    public String mo3477s(int i) {
        return this.f2391b.getNonResourceString(i);
    }

    /* renamed from: t */
    public String mo3478t() {
        return this.f2391b.getPositionDescription();
    }

    /* renamed from: u */
    public int mo3479u(int i, int i2) {
        return this.f2391b.getResourceId(i, i2);
    }

    /* renamed from: v */
    public Resources mo3480v() {
        return this.f2391b.getResources();
    }

    /* renamed from: w */
    public String mo3481w(int i) {
        return this.f2391b.getString(i);
    }

    /* renamed from: x */
    public CharSequence mo3482x(int i) {
        return this.f2391b.getText(i);
    }

    /* renamed from: y */
    public CharSequence[] mo3483y(int i) {
        return this.f2391b.getTextArray(i);
    }

    /* renamed from: z */
    public int mo3484z(int i) {
        return C0723a.m3573b(this.f2391b, i);
    }
}
