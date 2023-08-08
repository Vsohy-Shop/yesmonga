package androidx.compose.p004ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15098i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
@C8761g
/* renamed from: androidx.compose.ui.autofill.e */
public final class C8709e implements C8713i {
    @C12579k

    /* renamed from: a */
    public final View f23390a;
    @C12579k

    /* renamed from: b */
    public final C8731z f23391b;
    @C12579k

    /* renamed from: c */
    public final AutofillManager f23392c;

    public C8709e(@C12579k View view, @C12579k C8731z zVar) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(zVar, "autofillTree");
        this.f23390a = view;
        this.f23391b = zVar;
        AutofillManager a = C8706b.m32314a(view.getContext().getSystemService(AutofillManager.class));
        if (a != null) {
            this.f23392c = a;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    /* renamed from: a */
    public void mo17026a(@C12579k C8729y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "autofillNode");
        this.f23392c.notifyViewExited(this.f23390a, yVar.mo17049e());
    }

    /* renamed from: b */
    public void mo17027b(@C12579k C8729y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "autofillNode");
        C15098i d = yVar.mo17048d();
        if (d != null) {
            this.f23392c.notifyViewEntered(this.f23390a, yVar.mo17049e(), new Rect(C11409d.m43851L0(d.mo42279t()), C11409d.m43851L0(d.mo42249B()), C11409d.m43851L0(d.mo42283x()), C11409d.m43851L0(d.mo42271j())));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }

    @C12579k
    /* renamed from: c */
    public final AutofillManager mo17028c() {
        return this.f23392c;
    }

    @C12579k
    /* renamed from: d */
    public final C8731z mo17029d() {
        return this.f23391b;
    }

    @C12579k
    /* renamed from: e */
    public final View mo17030e() {
        return this.f23390a;
    }
}
