package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.view.C18164e2;
import androidx.core.view.C18196h2;
import androidx.core.view.C18274k;
import androidx.core.view.C18433z1;
import androidx.core.view.inputmethod.C18245g;
import androidx.core.view.inputmethod.C18249j;
import androidx.core.widget.C18471c0;
import androidx.core.widget.C18496q;
import androidx.core.widget.C18513z;

public class AppCompatEditText extends EditText implements C18164e2, C18433z1, C0752n0, C18471c0 {

    /* renamed from: a */
    public final C0706d f1906a;

    /* renamed from: b */
    public final C0784t f1907b;

    /* renamed from: c */
    public final C0780s f1908c;

    /* renamed from: d */
    public final C18513z f1909d;
    @C0359n0

    /* renamed from: e */
    public final C0720h f1910e;
    @C0363p0

    /* renamed from: f */
    public C0623a f1911f;

    @C0376v0(api = 26)
    /* renamed from: androidx.appcompat.widget.AppCompatEditText$a */
    public class C0623a {
        public C0623a() {
        }

        @C0363p0
        /* renamed from: a */
        public TextClassifier mo2635a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        /* renamed from: b */
        public void mo2636b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0341g1
    @C0359n0
    @C0376v0(26)
    private C0623a getSuperCaller() {
        if (this.f1911f == null) {
            this.f1911f = new C0623a();
        }
        return this.f1911f;
    }

    @C0363p0
    /* renamed from: a */
    public C18274k mo2618a(@C0359n0 C18274k kVar) {
        return this.f1909d.mo53098a(this, kVar);
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return this.f1910e.mo3449c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1907b;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    /* renamed from: f */
    public void mo2620f(C0720h hVar) {
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

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1907b.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1907b.mo3660k();
    }

    @C0359n0
    @C0376v0(api = 26)
    public TextClassifier getTextClassifier() {
        C0780s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.f1908c) == null) {
            return getSuperCaller().mo2635a();
        }
        return sVar.mo3642a();
    }

    @C0363p0
    public InputConnection onCreateInputConnection(@C0359n0 EditorInfo editorInfo) {
        String[] h0;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1907b.mo3667r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C0729j.m3587a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (h0 = C18196h2.m82585h0(this)) == null)) {
            C18245g.m82844h(editorInfo, h0);
            a = C18249j.m82858d(this, a, editorInfo);
        }
        return this.f1910e.mo3451e(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0750n.m3690a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C0750n.m3691b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1907b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1907b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setCustomSelectionActionModeCallback(@C0363p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18496q.m83726H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1910e.mo3452f(z);
    }

    public void setKeyListener(@C0363p0 KeyListener keyListener) {
        super.setKeyListener(this.f1910e.mo3447a(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1906a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1907b.mo3672w(colorStateList);
        this.f1907b.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1907b.mo3673x(mode);
        this.f1907b.mo3652b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0784t tVar = this.f1907b;
        if (tVar != null) {
            tVar.mo3666q(context, i);
        }
    }

    @C0376v0(api = 26)
    public void setTextClassifier(@C0363p0 TextClassifier textClassifier) {
        C0780s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.f1908c) == null) {
            getSuperCaller().mo2636b(textClassifier);
        } else {
            sVar.mo3643b(textClassifier);
        }
    }

    public AppCompatEditText(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.editTextStyle);
    }

    @C0363p0
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0706d dVar = new C0706d(this);
        this.f1906a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1907b = tVar;
        tVar.mo3662m(attributeSet, i);
        tVar.mo3652b();
        this.f1908c = new C0780s(this);
        this.f1909d = new C18513z();
        C0720h hVar = new C0720h(this);
        this.f1910e = hVar;
        hVar.mo3450d(attributeSet, i);
        mo2620f(hVar);
    }
}
