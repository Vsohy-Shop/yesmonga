package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.h */
public class C19132h implements TransformationMethod {
    @C0363p0

    /* renamed from: a */
    public final TransformationMethod f48664a;

    public C19132h(@C0363p0 TransformationMethod transformationMethod) {
        this.f48664a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo56448a() {
        return this.f48664a;
    }

    public CharSequence getTransformation(@C0363p0 CharSequence charSequence, @C0359n0 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f48664a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C19019f.m88864c().mo55965i() != 1) {
            return charSequence;
        }
        return C19019f.m88864c().mo55974x(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f48664a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
