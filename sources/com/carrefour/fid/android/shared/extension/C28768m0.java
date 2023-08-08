package com.carrefour.fid.android.shared.extension;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.extension.m0 */
public final class C28768m0 {

    /* renamed from: d */
    public static final int f70424d = 8;
    @C12579k

    /* renamed from: a */
    public final TextView f70425a;

    /* renamed from: b */
    public final int f70426b;
    @C12580l

    /* renamed from: c */
    public final KeyEvent f70427c;

    public C28768m0(@C12579k TextView textView, int i, @C12580l KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(textView, C40383c.f102945c);
        this.f70425a = textView;
        this.f70426b = i;
        this.f70427c = keyEvent;
    }

    /* renamed from: e */
    public static /* synthetic */ C28768m0 m119075e(C28768m0 m0Var, TextView textView, int i, KeyEvent keyEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textView = m0Var.f70425a;
        }
        if ((i2 & 2) != 0) {
            i = m0Var.f70426b;
        }
        if ((i2 & 4) != 0) {
            keyEvent = m0Var.f70427c;
        }
        return m0Var.mo83762d(textView, i, keyEvent);
    }

    @C12579k
    /* renamed from: a */
    public final TextView mo83759a() {
        return this.f70425a;
    }

    /* renamed from: b */
    public final int mo83760b() {
        return this.f70426b;
    }

    @C12580l
    /* renamed from: c */
    public final KeyEvent mo83761c() {
        return this.f70427c;
    }

    @C12579k
    /* renamed from: d */
    public final C28768m0 mo83762d(@C12579k TextView textView, int i, @C12580l KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(textView, C40383c.f102945c);
        return new C28768m0(textView, i, keyEvent);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28768m0)) {
            return false;
        }
        C28768m0 m0Var = (C28768m0) obj;
        return Intrinsics.areEqual((Object) this.f70425a, (Object) m0Var.f70425a) && this.f70426b == m0Var.f70426b && Intrinsics.areEqual((Object) this.f70427c, (Object) m0Var.f70427c);
    }

    /* renamed from: f */
    public final int mo83764f() {
        return this.f70426b;
    }

    @C12580l
    /* renamed from: g */
    public final KeyEvent mo83765g() {
        return this.f70427c;
    }

    @C12579k
    /* renamed from: h */
    public final TextView mo83766h() {
        return this.f70425a;
    }

    public int hashCode() {
        int hashCode = ((this.f70425a.hashCode() * 31) + Integer.hashCode(this.f70426b)) * 31;
        KeyEvent keyEvent = this.f70427c;
        return hashCode + (keyEvent == null ? 0 : keyEvent.hashCode());
    }

    @C12579k
    public String toString() {
        TextView textView = this.f70425a;
        int i = this.f70426b;
        KeyEvent keyEvent = this.f70427c;
        return "TextViewEditorActionEvent(view=" + textView + ", actionId=" + i + ", keyEvent=" + keyEvent + ")";
    }
}
