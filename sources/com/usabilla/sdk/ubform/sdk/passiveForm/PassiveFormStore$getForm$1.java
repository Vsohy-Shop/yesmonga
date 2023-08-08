package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.net.parser.C9875b;
import com.usabilla.sdk.ubform.p007db.form.C9781a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getForm$1", mo22502f = "PassiveFormStore.kt", mo22503i = {0}, mo22504l = {22}, mo22505m = "invokeSuspend", mo22506n = {"jsonObject"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lorg/json/JSONObject;", "jsonObject", "Lkotlinx/coroutines/flow/e;", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PassiveFormStore$getForm$1 extends SuspendLambda implements C11304p<JSONObject, C11045c<? super C11907e<? extends FormModel>>, Object> {
    final /* synthetic */ String $formId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PassiveFormStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassiveFormStore$getForm$1(PassiveFormStore passiveFormStore, String str, C11045c<? super PassiveFormStore$getForm$1> cVar) {
        super(2, cVar);
        this.this$0 = passiveFormStore;
        this.$formId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PassiveFormStore$getForm$1 passiveFormStore$getForm$1 = new PassiveFormStore$getForm$1(this.this$0, this.$formId, cVar);
        passiveFormStore$getForm$1.L$0 = obj;
        return passiveFormStore$getForm$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k JSONObject jSONObject, @C12580l C11045c<? super C11907e<FormModel>> cVar) {
        return ((PassiveFormStore$getForm$1) create(jSONObject, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        JSONObject jSONObject;
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            JSONObject jSONObject2 = (JSONObject) this.L$0;
            C9781a a = this.this$0.f27716b;
            String str = this.$formId;
            String jSONObject3 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString()");
            C11907e<Integer> b = a.mo20040b(str, jSONObject3);
            this.L$0 = jSONObject2;
            this.label = 1;
            if (C11909g.m47374I1(b, this) == h) {
                return h;
            }
            jSONObject = jSONObject2;
        } else if (i == 1) {
            jSONObject = (JSONObject) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C9875b bVar = ExtensionJsonKt.m38313b().get(C11342l0.m43547d(FormModel.class));
        Object obj3 = null;
        if (bVar == null) {
            obj2 = null;
        } else {
            obj2 = bVar.mo20320a(jSONObject);
        }
        if (obj2 instanceof FormModel) {
            obj3 = obj2;
        }
        FormModel formModel = (FormModel) obj3;
        if (formModel != null) {
            return C11909g.m47385M0(formModel);
        }
        throw new IllegalStateException("Parser not found");
    }
}
