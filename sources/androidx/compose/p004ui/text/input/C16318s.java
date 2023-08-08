package androidx.compose.p004ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0373u;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.s */
public final class C16318s implements C16322u {
    @C12579k

    /* renamed from: a */
    public final View f40542a;

    public C16318s(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f40542a = view;
    }

    /* renamed from: d */
    public static final void m73535d(InputMethodManager inputMethodManager, C16318s sVar) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "$imm");
        Intrinsics.checkNotNullParameter(sVar, "this$0");
        inputMethodManager.showSoftInput(sVar.f40542a, 0);
    }

    @C0373u
    /* renamed from: a */
    public void mo47309a(@C12579k InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.f40542a.getWindowToken(), 0);
    }

    @C0373u
    /* renamed from: b */
    public void mo47310b(@C12579k InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        this.f40542a.post(new C16316r(inputMethodManager, this));
    }
}
