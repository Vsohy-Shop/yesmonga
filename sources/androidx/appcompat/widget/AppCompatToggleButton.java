package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18471c0;

public class AppCompatToggleButton extends ToggleButton implements C18164e2, C0752n0, C18471c0 {

    /* renamed from: a */
    public final C0706d f1972a;

    /* renamed from: b */
    public final C0784t f1973b;

    /* renamed from: c */
    public C0724i f1974c;

    public AppCompatToggleButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f1974c == null) {
            this.f1974c = new C0724i(this);
        }
        return this.f1974c;
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1973b;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1973b.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1973b.mo3660k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1973b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1973b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3489e(z);
    }

    public void setFilters(@C0359n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3485a(inputFilterArr));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1972a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1973b.mo3672w(colorStateList);
        this.f1973b.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1973b.mo3673x(mode);
        this.f1973b.mo3652b();
    }

    public AppCompatToggleButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0706d dVar = new C0706d(this);
        this.f1972a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1973b = tVar;
        tVar.mo3662m(attributeSet, i);
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
    }
}
