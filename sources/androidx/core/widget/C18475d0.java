package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.widget.d0 */
public interface C18475d0 {
    @C0363p0
    ColorStateList getSupportImageTintList();

    @C0363p0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@C0363p0 ColorStateList colorStateList);

    void setSupportImageTintMode(@C0363p0 PorterDuff.Mode mode);
}
