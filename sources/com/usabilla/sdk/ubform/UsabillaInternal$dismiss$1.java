package com.usabilla.sdk.ubform;

import android.content.Context;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$dismiss$1 extends Lambda implements C11300l<C10110e, Boolean> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$dismiss$1(UsabillaInternal usabillaInternal, Context context) {
        super(1);
        this.this$0 = usabillaInternal;
        this.$context = context;
    }

    /* renamed from: a */
    public final boolean mo19887a(@C12579k C10110e eVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        CampaignManager Z = this.this$0.mo19844Z();
        if (Z == null) {
            z = false;
        } else {
            z = Z.mo20739d();
        }
        if (this.this$0.mo19847c() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            eVar.mo21540b(new C10096b.C10101b.C10105d("dismiss", FormType.CAMPAIGN));
        } else if (z2) {
            this.this$0.mo19850d0().mo21470d(this.$context);
            eVar.mo21540b(new C10096b.C10101b.C10105d("dismiss", FormType.PASSIVE_FEEDBACK));
        }
        eVar.stop();
        if (z || z2) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(mo19887a((C10110e) obj));
    }
}
