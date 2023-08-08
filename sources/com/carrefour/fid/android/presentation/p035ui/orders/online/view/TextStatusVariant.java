package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/view/TextStatusVariant;", "", "", "hasIcon", "Z", "r", "()Z", "", "iconResId", "I", "w", "()I", "colorResId", "q", "<init>", "(Ljava/lang/String;IZII)V", "a", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.TextStatusVariant */
public enum TextStatusVariant {
    Green(false, 0, 0, 7, (int) null),
    GreenWithIcon(true, 0, 0, 6, (int) null),
    Red(false, 0, R.color.ds_red_1, 3, (int) null);
    
    private final int colorResId;
    private final boolean hasIcon;
    private final int iconResId;

    /* access modifiers changed from: public */
    TextStatusVariant(boolean z, @C0375v int i, @C0358n int i2) {
        this.hasIcon = z;
        this.iconResId = i;
        this.colorResId = i2;
    }

    /* renamed from: q */
    public final int mo73722q() {
        return this.colorResId;
    }

    /* renamed from: r */
    public final boolean mo73723r() {
        return this.hasIcon;
    }

    /* renamed from: w */
    public final int mo73724w() {
        return this.iconResId;
    }
}
