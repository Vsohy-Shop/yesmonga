package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getForm$2", mo22502f = "PassiveFormStore.kt", mo22503i = {}, mo22504l = {26, 26}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PassiveFormStore$getForm$2 extends SuspendLambda implements C11305q<C11908f<? super FormModel>, Throwable, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $formId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PassiveFormStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassiveFormStore$getForm$2(PassiveFormStore passiveFormStore, String str, C11045c<? super PassiveFormStore$getForm$2> cVar) {
        super(3, cVar);
        this.this$0 = passiveFormStore;
        this.$formId = str;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super FormModel> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        PassiveFormStore$getForm$2 passiveFormStore$getForm$2 = new PassiveFormStore$getForm$2(this.this$0, this.$formId, cVar);
        passiveFormStore$getForm$2.L$0 = fVar;
        return passiveFormStore$getForm$2.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0049
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r6)
            goto L_0x003d
        L_0x0022:
            kotlin.C11661u0.m45747n(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore r6 = r5.this$0
            java.lang.String r4 = r5.$formId
            kotlinx.coroutines.flow.e r6 = r6.mo21486d(r4)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47374I1(r6, r5)
            if (r6 != r0) goto L_0x003d
            return r0
        L_0x003d:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getForm$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
