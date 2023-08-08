package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.usabilla.sdk.ubform.sdk.form.model.Setting;
import com.usabilla.sdk.ubform.sdk.form.model.SettingsModel;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$initialize$1", mo22502f = "FeaturebillaManager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModel;", "featureModel", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FeaturebillaManagerImpl$initialize$1 extends SuspendLambda implements C11304p<SettingsModel, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Map<String, String> $userContexts;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FeaturebillaManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturebillaManagerImpl$initialize$1(FeaturebillaManagerImpl featurebillaManagerImpl, Map<String, String> map, C11045c<? super FeaturebillaManagerImpl$initialize$1> cVar) {
        super(2, cVar);
        this.this$0 = featurebillaManagerImpl;
        this.$userContexts = map;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FeaturebillaManagerImpl$initialize$1 featurebillaManagerImpl$initialize$1 = new FeaturebillaManagerImpl$initialize$1(this.this$0, this.$userContexts, cVar);
        featurebillaManagerImpl$initialize$1.L$0 = obj;
        return featurebillaManagerImpl$initialize$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k SettingsModel settingsModel, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FeaturebillaManagerImpl$initialize$1) create(settingsModel, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        String str;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            FeaturebillaManagerImpl featurebillaManagerImpl = this.this$0;
            Map<String, String> map = this.$userContexts;
            for (Setting setting : ((SettingsModel) this.L$0).getSettings()) {
                if (featurebillaManagerImpl.mo20807d(setting, map)) {
                    str = setting.getValue();
                } else {
                    str = null;
                }
                featurebillaManagerImpl.f27425c.put(setting.getVariable(), str);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
