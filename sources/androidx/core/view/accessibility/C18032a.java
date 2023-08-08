package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.accessibility.a */
public final class C18032a extends ClickableSpan {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: d */
    public static final String f46545d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a */
    public final int f46546a;

    /* renamed from: b */
    public final C18065l0 f46547b;

    /* renamed from: c */
    public final int f46548c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C18032a(int i, @C0359n0 C18065l0 l0Var, int i2) {
        this.f46546a = i;
        this.f46547b = l0Var;
        this.f46548c = i2;
    }

    public void onClick(@C0359n0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f46545d, this.f46546a);
        this.f46547b.mo52547K0(this.f46548c, bundle);
    }
}
