package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.widget.a0 */
public interface C18464a0 {
    @C0363p0
    ColorStateList getSupportCheckMarkTintList();

    @C0363p0
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@C0363p0 ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@C0363p0 PorterDuff.Mode mode);
}
