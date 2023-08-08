package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.C0337f0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.core.graphics.C17530b1;
import androidx.core.text.C17900a0;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18465b;
import androidx.core.widget.C18471c0;
import androidx.core.widget.C18496q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements C18164e2, C18471c0, C18465b, C0752n0 {

    /* renamed from: a */
    public final C0706d f1963a;

    /* renamed from: b */
    public final C0784t f1964b;

    /* renamed from: c */
    public final C0780s f1965c;
    @C0359n0

    /* renamed from: d */
    public C0724i f1966d;

    /* renamed from: e */
    public boolean f1967e;
    @C0363p0

    /* renamed from: f */
    public C0637a f1968f;
    @C0363p0

    /* renamed from: g */
    public Future<C17900a0> f1969g;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    public interface C0637a {
        /* renamed from: a */
        void mo2781a(@C0372t0 int i);

        /* renamed from: b */
        TextClassifier mo2782b();

        /* renamed from: c */
        void mo2783c(@C0363p0 TextClassifier textClassifier);

        /* renamed from: d */
        void mo2784d(@C0372t0 int i);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

        void setAutoSizeTextTypeWithDefaults(int i);
    }

    @C0376v0(api = 26)
    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    public class C0638b implements C0637a {
        public C0638b() {
        }

        /* renamed from: a */
        public void mo2781a(int i) {
        }

        /* renamed from: b */
        public TextClassifier mo2782b() {
            return AppCompatTextView.super.getTextClassifier();
        }

        /* renamed from: c */
        public void mo2783c(@C0363p0 TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        /* renamed from: d */
        public void mo2784d(int i) {
        }

        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public void setAutoSizeTextTypeWithDefaults(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    @C0376v0(api = 28)
    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    public class C0639c extends C0638b {
        public C0639c() {
            super();
        }

        /* renamed from: a */
        public void mo2781a(@C0372t0 int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        /* renamed from: d */
        public void mo2784d(@C0372t0 int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f1966d == null) {
            this.f1966d = new C0724i(this);
        }
        return this.f1966d;
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3652b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C0796u1.f2594c) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            return tVar.mo3654e();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C0796u1.f2594c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            return tVar.mo3655f();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C0796u1.f2594c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            return tVar.mo3656g();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0796u1.f2594c) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            return tVar.mo3657h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (!C0796u1.f2594c) {
            C0784t tVar = this.f1964b;
            if (tVar != null) {
                return tVar.mo3658i();
            }
            return 0;
        } else if (getSuperCaller().getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return C18496q.m83735i(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C18496q.m83736j(this);
    }

    @C0341g1
    @C0376v0(api = 26)
    public C0637a getSuperCaller() {
        if (this.f1968f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.f1968f = new C0639c();
            } else if (i >= 26) {
                this.f1968f = new C0638b();
            }
        }
        return this.f1968f;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1964b.mo3659j();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1964b.mo3660k();
    }

    public CharSequence getText() {
        mo2759s();
        return super.getText();
    }

    @C0359n0
    @C0376v0(api = 26)
    public TextClassifier getTextClassifier() {
        C0780s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.f1965c) == null) {
            return getSuperCaller().mo2782b();
        }
        return sVar.mo3642a();
    }

    @C0359n0
    public C17900a0.C17901a getTextMetricsParamsCompat() {
        return C18496q.m83741o(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1964b.mo3667r(this, onCreateInputConnection, editorInfo);
        return C0729j.m3587a(onCreateInputConnection, editorInfo, this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3664o(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        mo2759s();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C0784t tVar = this.f1964b;
        if (tVar == null || C0796u1.f2594c || !tVar.mo3661l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f1964b.mo3653c();
        }
    }

    /* renamed from: s */
    public final void mo2759s() {
        Future<C17900a0> future = this.f1969g;
        if (future != null) {
            try {
                this.f1969g = null;
                C18496q.m83722D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0796u1.f2594c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3669t(i, i2, i3, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@C0359n0 int[] iArr, int i) throws IllegalArgumentException {
        if (C0796u1.f2594c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3670u(iArr, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0796u1.f2594c) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3671v(i);
        }
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0784t tVar = this.f1964b;
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

    public void setFilters(@C0359n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3485a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(@C0372t0 @C0337f0(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2784d(i);
        } else {
            C18496q.m83719A(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(@C0372t0 @C0337f0(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2781a(i);
        } else {
            C18496q.m83720B(this, i);
        }
    }

    public void setLineHeight(@C0372t0 @C0337f0(from = 0) int i) {
        C18496q.m83721C(this, i);
    }

    public void setPrecomputedText(@C0359n0 C17900a0 a0Var) {
        C18496q.m83722D(this, a0Var);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1963a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1964b.mo3672w(colorStateList);
        this.f1964b.mo3652b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f1964b.mo3673x(mode);
        this.f1964b.mo3652b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3666q(context, i);
        }
    }

    @C0376v0(api = 26)
    public void setTextClassifier(@C0363p0 TextClassifier textClassifier) {
        C0780s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.f1965c) == null) {
            getSuperCaller().mo2783c(textClassifier);
        } else {
            sVar.mo3643b(textClassifier);
        }
    }

    public void setTextFuture(@C0363p0 Future<C17900a0> future) {
        this.f1969g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@C0359n0 C17900a0.C17901a aVar) {
        C18496q.m83724F(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0796u1.f2594c) {
            super.setTextSize(i, f);
            return;
        }
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3648A(i, f);
        }
    }

    public void setTypeface(@C0363p0 Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.f1967e) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                typeface2 = C17530b1.m80350b(getContext(), typeface, i);
            }
            this.f1967e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1967e = false;
            }
        }
    }

    public AppCompatTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        this.f1967e = false;
        this.f1968f = null;
        C0705c1.m3421a(this, getContext());
        C0706d dVar = new C0706d(this);
        this.f1963a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0784t tVar = new C0784t(this);
        this.f1964b = tVar;
        tVar.mo3662m(attributeSet, i);
        tVar.mo3652b();
        this.f1965c = new C0780s(this);
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
    }

    @C0376v0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0507a.m2346b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0507a.m2346b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0507a.m2346b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0507a.m2346b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0507a.m2346b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0507a.m2346b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0507a.m2346b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0507a.m2346b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0784t tVar = this.f1964b;
        if (tVar != null) {
            tVar.mo3665p();
        }
    }
}
