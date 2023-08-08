package androidx.compose.p004ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.C8761g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.autofill.x */
public final class C8728x extends AutofillManager.AutofillCallback {
    @C12579k

    /* renamed from: a */
    public static final C8728x f23396a = new C8728x();

    @C8761g
    @C0373u
    /* renamed from: a */
    public final void mo17044a(@C12579k C8709e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "autofill");
        eVar.mo17028c().registerCallback(C8725u.m32352a(this));
    }

    @C8761g
    @C0373u
    /* renamed from: b */
    public final void mo17045b(@C12579k C8709e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "autofill");
        eVar.mo17028c().unregisterCallback(C8725u.m32352a(this));
    }

    public void onAutofillEvent(@C12579k View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onAutofillEvent(view, i, i2);
    }
}
