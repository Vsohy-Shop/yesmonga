package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18471c0;
import androidx.core.widget.C18496q;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements C18164e2, C0752n0, C18471c0 {

    /* renamed from: d */
    public static final int[] f1891d = {16843126};

    /* renamed from: a */
    public final C0706d f1892a;

    /* renamed from: b */
    public final C0784t f1893b;
    @C0359n0

    /* renamed from: c */
    public final C0720h f1894c;

    public AppCompatAutoCompleteTextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo2544a(C0720h hVar) {
        KeyListener keyListener = getKeyListener();
        if (hVar.mo3448b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = hVar.mo3447a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return this.f1894c.mo3449c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1893b;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1893b.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1893b.mo3660k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1894c.mo3451e(C0729j.m3587a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1893b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1893b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setCustomSelectionActionModeCallback(@C0363p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18496q.m83726H(this, callback));
    }

    public void setDropDownBackgroundResource(@C0375v int i) {
        setDropDownBackgroundDrawable(C0507a.m2346b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1894c.mo3452f(z);
    }

    public void setKeyListener(@C0363p0 KeyListener keyListener) {
        super.setKeyListener(this.f1894c.mo3447a(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1892a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1893b.mo3672w(colorStateList);
        this.f1893b.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1893b.mo3673x(mode);
        this.f1893b.mo3652b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0784t tVar = this.f1893b;
        if (tVar != null) {
            tVar.mo3666q(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0722h1 G = C0722h1.m3539G(getContext(), attributeSet, f1891d, i, 0);
        if (G.mo3455C(0)) {
            setDropDownBackgroundDrawable(G.mo3466h(0));
        }
        G.mo3458I();
        C0706d dVar = new C0706d(this);
        this.f1892a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1893b = tVar;
        tVar.mo3662m(attributeSet, i);
        tVar.mo3652b();
        C0720h hVar = new C0720h(this);
        this.f1894c = hVar;
        hVar.mo3450d(attributeSet, i);
        mo2544a(hVar);
    }
}
