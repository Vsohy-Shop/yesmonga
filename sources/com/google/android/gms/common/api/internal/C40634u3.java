package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.internal.u3 */
public final class C40634u3 implements Runnable {

    /* renamed from: a */
    public final C40623s3 f103586a;

    /* renamed from: b */
    public final /* synthetic */ C40639v3 f103587b;

    public C40634u3(C40639v3 v3Var, C40623s3 s3Var) {
        this.f103587b = v3Var;
        this.f103586a = s3Var;
    }

    @C0353k0
    public final void run() {
        if (this.f103587b.f103603b) {
            ConnectionResult b = this.f103586a.mo134026b();
            if (b.mo133594X()) {
                C40639v3 v3Var = this.f103587b;
                v3Var.f103291a.startActivityForResult(GoogleApiActivity.m164700a(v3Var.mo133802b(), (PendingIntent) C40843u.m166202l(b.mo133593W()), this.f103586a.mo134025a(), false), 1);
                return;
            }
            C40639v3 v3Var2 = this.f103587b;
            if (v3Var2.f103606e.mo134205e(v3Var2.mo133802b(), b.mo133591M(), (String) null) != null) {
                C40639v3 v3Var3 = this.f103587b;
                v3Var3.f103606e.mo134202K(v3Var3.mo133802b(), this.f103587b.f103291a, b.mo133591M(), 2, this.f103587b);
            } else if (b.mo133591M() == 18) {
                C40639v3 v3Var4 = this.f103587b;
                Dialog F = v3Var4.f103606e.mo134197F(v3Var4.mo133802b(), this.f103587b);
                C40639v3 v3Var5 = this.f103587b;
                v3Var5.f103606e.mo134198G(v3Var5.mo133802b().getApplicationContext(), new C40628t3(this, F));
            } else {
                this.f103587b.mo134075m(b, this.f103586a.mo134025a());
            }
        }
    }
}
