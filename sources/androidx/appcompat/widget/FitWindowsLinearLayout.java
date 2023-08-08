package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0755o0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements C0755o0 {

    /* renamed from: a */
    public C0755o0.C0756a f1988a;

    public FitWindowsLinearLayout(@C0359n0 Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        C0755o0.C0756a aVar = this.f1988a;
        if (aVar != null) {
            aVar.mo1194a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0755o0.C0756a aVar) {
        this.f1988a = aVar;
    }

    public FitWindowsLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
