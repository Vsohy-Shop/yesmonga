package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18465b;
import androidx.core.widget.C18471c0;
import androidx.core.widget.C18496q;

public class AppCompatButton extends Button implements C18164e2, C18465b, C18471c0, C0752n0 {

    /* renamed from: a */
    public final C0706d f1895a;

    /* renamed from: b */
    public final C0784t f1896b;
    @C0359n0

    /* renamed from: c */
    public C0724i f1897c;

    public AppCompatButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f1897c == null) {
            this.f1897c = new C0724i(this);
        }
        return this.f1897c;
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C0796u1.f2594c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            return tVar.mo3654e();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C0796u1.f2594c) {
            return super.getAutoSizeMinTextSize();
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            return tVar.mo3655f();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C0796u1.f2594c) {
            return super.getAutoSizeStepGranularity();
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            return tVar.mo3656g();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0796u1.f2594c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            return tVar.mo3657h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (!C0796u1.f2594c) {
            C0784t tVar = this.f1896b;
            if (tVar != null) {
                return tVar.mo3658i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1896b.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1896b.mo3660k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3664o(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C0784t tVar = this.f1896b;
        if (tVar == null || C0796u1.f2594c || !tVar.mo3661l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f1896b.mo3653c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0796u1.f2594c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3669t(i, i2, i3, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@C0359n0 int[] iArr, int i) throws IllegalArgumentException {
        if (C0796u1.f2594c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3670u(iArr, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0796u1.f2594c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3671v(i);
        }
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(@C0363p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18496q.m83726H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3489e(z);
    }

    public void setFilters(@C0359n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3485a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3668s(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1895a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1896b.mo3672w(colorStateList);
        this.f1896b.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1896b.mo3673x(mode);
        this.f1896b.mo3652b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3666q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0796u1.f2594c) {
            super.setTextSize(i, f);
            return;
        }
        C0784t tVar = this.f1896b;
        if (tVar != null) {
            tVar.mo3648A(i, f);
        }
    }

    public AppCompatButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.buttonStyle);
    }

    public AppCompatButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0706d dVar = new C0706d(this);
        this.f1895a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1896b = tVar;
        tVar.mo3662m(attributeSet, i);
        tVar.mo3652b();
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
    }
}
