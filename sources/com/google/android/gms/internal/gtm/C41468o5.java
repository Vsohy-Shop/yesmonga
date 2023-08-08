package com.google.android.gms.internal.gtm;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.o5 */
public final class C41468o5 implements Runnable, C41597te {

    /* renamed from: a */
    public final /* synthetic */ C41588t5 f104828a;

    public /* synthetic */ C41468o5(C41588t5 t5Var, C41444n5 n5Var) {
        this.f104828a = t5Var;
    }

    /* renamed from: a */
    public final void mo135681a(C41213df dfVar) {
        if (dfVar.getStatus() == Status.f103184g) {
            this.f104828a.f104985g.execute(new C41564s5(this.f104828a, dfVar));
        } else {
            this.f104828a.f104985g.execute(new C41420m5(this.f104828a, (C41396l5) null));
        }
    }

    @C0348i1
    public final void run() {
        boolean z = true;
        if (this.f104828a.f104991m != 1) {
            z = false;
        }
        C40843u.m166208r(z);
        ArrayList arrayList = new ArrayList();
        this.f104828a.f104994p = false;
        if (C41661w6.m168646a().mo136019e(this.f104828a.f104980b)) {
            arrayList.add(0);
        } else {
            C41588t5 t5Var = this.f104828a;
            t5Var.f104994p = t5Var.f104989k.mo135970f();
            if (!this.f104828a.f104994p) {
                arrayList.add(0);
                arrayList.add(1);
            } else {
                arrayList.add(1);
                arrayList.add(0);
            }
            arrayList.add(2);
        }
        this.f104828a.f104984f.mo136025c(this.f104828a.f104980b, this.f104828a.f104982d, this.f104828a.f104981c, arrayList, this, this.f104828a.f104989k);
    }
}
