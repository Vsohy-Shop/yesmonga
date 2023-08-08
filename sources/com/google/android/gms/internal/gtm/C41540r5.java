package com.google.android.gms.internal.gtm;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.r5 */
public final class C41540r5 implements Runnable, C41597te {

    /* renamed from: a */
    public final /* synthetic */ C41588t5 f104921a;

    public /* synthetic */ C41540r5(C41588t5 t5Var, C41516q5 q5Var) {
        this.f104921a = t5Var;
    }

    /* renamed from: a */
    public final void mo135681a(C41213df dfVar) {
        if (dfVar.getStatus() == Status.f103184g) {
            String i = this.f104921a.f104980b;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
            sb.append("Refreshed container ");
            sb.append(i);
            sb.append(". Reinitializing runtime...");
            C41493p6.m168152d(sb.toString());
            this.f104921a.f104985g.execute(new C41564s5(this.f104921a, dfVar));
            return;
        }
        C41588t5 t5Var = this.f104921a;
        C41588t5.m168390r(t5Var, t5Var.f104989k.mo135967c());
    }

    @C0348i1
    public final void run() {
        boolean z;
        if (this.f104921a.f104991m == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
        if (!C41661w6.m168646a().mo136019e(this.f104921a.f104980b)) {
            String i = this.f104921a.f104980b;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 24);
            sb.append("Refreshing container ");
            sb.append(i);
            sb.append("...");
            C41493p6.m168152d(sb.toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            this.f104921a.f104984f.mo136025c(this.f104921a.f104980b, this.f104921a.f104982d, this.f104921a.f104981c, arrayList, this, this.f104921a.f104989k);
        }
    }
}
