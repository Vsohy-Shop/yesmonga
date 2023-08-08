package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.sdk.form.model.SettingsModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$initialize$2", mo22502f = "FeaturebillaManager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModel;", "", "e", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FeaturebillaManagerImpl$initialize$2 extends SuspendLambda implements C11305q<C11908f<? super SettingsModel>, Throwable, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public FeaturebillaManagerImpl$initialize$2(C11045c<? super FeaturebillaManagerImpl$initialize$2> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super SettingsModel> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        FeaturebillaManagerImpl$initialize$2 featurebillaManagerImpl$initialize$2 = new FeaturebillaManagerImpl$initialize$2(cVar);
        featurebillaManagerImpl$initialize$2.L$0 = th;
        return featurebillaManagerImpl$initialize$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Logger.f26647a.logError(Intrinsics.stringPlus("Error getting FeatureModel. Caused by: ", ((Throwable) this.L$0).getMessage()));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
