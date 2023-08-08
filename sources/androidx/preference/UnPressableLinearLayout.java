package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public void dispatchSetPressed(boolean z) {
    }

    public UnPressableLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
