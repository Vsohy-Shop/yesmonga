package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18464a0;
import androidx.core.widget.C18471c0;
import androidx.core.widget.C18496q;

public class AppCompatCheckedTextView extends CheckedTextView implements C18464a0, C18164e2, C0752n0, C18471c0 {

    /* renamed from: a */
    public final C0710e f1902a;

    /* renamed from: b */
    public final C0706d f1903b;

    /* renamed from: c */
    public final C0784t f1904c;
    @C0359n0

    /* renamed from: d */
    public C0724i f1905d;

    public AppCompatCheckedTextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f1905d == null) {
            this.f1905d = new C0724i(this);
        }
        return this.f1905d;
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0784t tVar = this.f1904c;
        if (tVar != null) {
            tVar.mo3652b();
        }
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            eVar.mo3407a();
        }
    }

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            return eVar.mo3408b();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            return eVar.mo3409c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1904c.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1904c.mo3660k();
    }

    @C0363p0
    public InputConnection onCreateInputConnection(@C0359n0 EditorInfo editorInfo) {
        return C0729j.m3587a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCheckMarkDrawable(@C0363p0 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            eVar.mo3411e();
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1904c;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1904c;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setCustomSelectionActionModeCallback(@C0363p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18496q.m83726H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3489e(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1903b;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@C0363p0 ColorStateList colorStateList) {
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            eVar.mo3412f(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0710e eVar = this.f1902a;
        if (eVar != null) {
            eVar.mo3413g(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1904c.mo3672w(colorStateList);
        this.f1904c.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1904c.mo3673x(mode);
        this.f1904c.mo3652b();
    }

    public void setTextAppearance(@C0359n0 Context context, int i) {
        super.setTextAppearance(context, i);
        C0784t tVar = this.f1904c;
        if (tVar != null) {
            tVar.mo3666q(context, i);
        }
    }

    public AppCompatCheckedTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0784t tVar = new C0784t(this);
        this.f1904c = tVar;
        tVar.mo3662m(attributeSet, i);
        tVar.mo3652b();
        C0706d dVar = new C0706d(this);
        this.f1903b = dVar;
        dVar.mo3338e(attributeSet, i);
        C0710e eVar = new C0710e(this);
        this.f1902a = eVar;
        eVar.mo3410d(attributeSet, i);
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
    }

    public void setCheckMarkDrawable(@C0375v int i) {
        setCheckMarkDrawable(C0507a.m2346b(getContext(), i));
    }
}
