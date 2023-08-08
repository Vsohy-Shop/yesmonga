package com.usabilla.sdk.ubform.p008di;

import android.content.Context;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.p007db.unsent.C9785a;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormService;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveSubmissionManager;
import com.usabilla.sdk.ubform.utils.C10140g;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createPassiveFormModule$1 */
public final class UsabillaDIKt$createPassiveFormModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaDIKt$createPassiveFormModule$1(Context context) {
        super(1);
        this.$context = context;
    }

    /* renamed from: a */
    public final void mo20095a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        C98071 r0 = C98071.f26864f;
        eVar.mo20153b().put(C10140g.class, new C9824g(r0));
        C98082 r02 = C98082.f26865f;
        eVar.mo20153b().put(PassiveFormService.class, new C9824g(r02));
        C98093 r03 = C98093.f26866f;
        eVar.mo20153b().put(PassiveFormStore.class, new C9824g(r03));
        final Context context = this.$context;
        C98104 r04 = new C11300l<C9818a, PassiveFormManager>() {
            @C12579k
            /* renamed from: a */
            public final PassiveFormManager invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return new PassiveFormManager(C10133g.m38340b(context, UbScreenshot.f27222e), (PassiveFormStore) aVar.mo20109c(PassiveFormStore.class));
            }
        };
        eVar.mo20153b().put(PassiveFormManager.class, new C9824g(r04));
        C98115 r05 = C98115.f26867f;
        eVar.mo20153b().put(PassiveResubmissionManager.class, new C9824g(r05));
        final Context context2 = this.$context;
        C98126 r06 = new C11300l<C9818a, PassiveSubmissionManager>() {
            @C12579k
            /* renamed from: a */
            public final PassiveSubmissionManager invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                Context applicationContext = context2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                return new PassiveSubmissionManager(applicationContext, (AppInfo) aVar.mo20109c(AppInfo.class), (PassiveFormService) aVar.mo20109c(PassiveFormService.class), (C9785a) aVar.mo20109c(C9785a.class), (C10140g) aVar.mo20109c(C10140g.class), (C12074o0) aVar.mo20109c(C12074o0.class));
            }
        };
        eVar.mo20153b().put(PassiveSubmissionManager.class, new C9824g(r06));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20095a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
