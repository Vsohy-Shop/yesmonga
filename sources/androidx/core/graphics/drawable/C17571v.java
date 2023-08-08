package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.graphics.drawable.v */
public final class C17571v extends Drawable.ConstantState {

    /* renamed from: a */
    public int f45930a;

    /* renamed from: b */
    public Drawable.ConstantState f45931b;

    /* renamed from: c */
    public ColorStateList f45932c = null;

    /* renamed from: d */
    public PorterDuff.Mode f45933d = C17569t.f45921g;

    public C17571v(@C0363p0 C17571v vVar) {
        if (vVar != null) {
            this.f45930a = vVar.f45930a;
            this.f45931b = vVar.f45931b;
            this.f45932c = vVar.f45932c;
            this.f45933d = vVar.f45933d;
        }
    }

    /* renamed from: a */
    public boolean mo52026a() {
        return this.f45931b != null;
    }

    public int getChangingConfigurations() {
        int i;
        int i2 = this.f45930a;
        Drawable.ConstantState constantState = this.f45931b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @C0359n0
    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    @C0359n0
    public Drawable newDrawable(@C0363p0 Resources resources) {
        return new C17570u(this, resources);
    }
}
