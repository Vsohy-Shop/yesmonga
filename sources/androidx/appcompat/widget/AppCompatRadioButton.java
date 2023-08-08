package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18466b0;
import androidx.core.widget.C18471c0;

public class AppCompatRadioButton extends RadioButton implements C18466b0, C18164e2, C0752n0, C18471c0 {

    /* renamed from: a */
    public final C0713f f1923a;

    /* renamed from: b */
    public final C0706d f1924b;

    /* renamed from: c */
    public final C0784t f1925c;

    /* renamed from: d */
    public C0724i f1926d;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f1926d == null) {
            this.f1926d = new C0724i(this);
        }
        return this.f1926d;
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1925c;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            return fVar.mo3419b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            return fVar.mo3420c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            return fVar.mo3421d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1925c.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1925c.mo3660k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            fVar.mo3423f();
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1925c;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1925c;
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
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1924b;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@C0363p0 ColorStateList colorStateList) {
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            fVar.mo3424g(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0713f fVar = this.f1923a;
        if (fVar != null) {
            fVar.mo3425h(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1925c.mo3672w(colorStateList);
        this.f1925c.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1925c.mo3673x(mode);
        this.f1925c.mo3652b();
    }

    public AppCompatRadioButton(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0713f fVar = new C0713f(this);
        this.f1923a = fVar;
        fVar.mo3422e(attributeSet, i);
        C0706d dVar = new C0706d(this);
        this.f1924b = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1925c = tVar;
        tVar.mo3662m(attributeSet, i);
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
    }

    public void setButtonDrawable(@C0375v int i) {
        setButtonDrawable(C0507a.m2346b(getContext(), i));
    }
}
