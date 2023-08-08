package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.usabilla.sdk.ubform.sdk.form.model.VariableName;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl", mo22502f = "FeaturebillaManager.kt", mo22503i = {}, mo22504l = {37}, mo22505m = "getSettingVariable", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class FeaturebillaManagerImpl$getSettingVariable$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeaturebillaManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturebillaManagerImpl$getSettingVariable$1(FeaturebillaManagerImpl featurebillaManagerImpl, C11045c<? super FeaturebillaManagerImpl$getSettingVariable$1> cVar) {
        super(cVar);
        this.this$0 = featurebillaManagerImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo20806a((VariableName) null, null, (Map<String, String>) null, this);
    }
}
