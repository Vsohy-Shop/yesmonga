package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.core.widget.C18492o;

/* renamed from: androidx.appcompat.widget.l */
public class C0741l extends PopupWindow {

    /* renamed from: b */
    public static final boolean f2433b = false;

    /* renamed from: a */
    public boolean f2434a;

    public C0741l(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        super(context, attributeSet, i);
        mo3526a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public final void mo3526a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0722h1 G = C0722h1.m3539G(context, attributeSet, C0387a.C0400m.PopupWindow, i, i2);
        int i3 = C0387a.C0400m.PopupWindow_overlapAnchor;
        if (G.mo3455C(i3)) {
            mo3527b(G.mo3459a(i3, false));
        }
        setBackgroundDrawable(G.mo3466h(C0387a.C0400m.PopupWindow_android_popupBackground));
        G.mo3458I();
    }

    /* renamed from: b */
    public final void mo3527b(boolean z) {
        if (f2433b) {
            this.f2434a = z;
        } else {
            C18492o.m83693c(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2433b && this.f2434a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2433b && this.f2434a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public C0741l(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(context, attributeSet, i, i2);
        mo3526a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2433b && this.f2434a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
