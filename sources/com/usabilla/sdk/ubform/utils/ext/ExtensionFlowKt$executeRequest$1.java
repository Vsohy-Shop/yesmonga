package com.usabilla.sdk.ubform.utils.ext;

import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9871h;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.net.http.C9873j;
import com.usabilla.sdk.ubform.response.UbError;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$executeRequest$1", mo22502f = "ExtensionFlow.kt", mo22503i = {}, mo22504l = {30, 30}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/usabilla/sdk/ubform/net/http/j;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ExtensionFlowKt$executeRequest$1 extends SuspendLambda implements C11304p<C11908f<? super C9873j>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C9872i $request;
    final /* synthetic */ C9870g $this_executeRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$executeRequest$1$a */
    public static final class C10126a implements C9871h {

        /* renamed from: a */
        public final /* synthetic */ C12169x<C9873j> f27855a;

        public C10126a(C12169x<C9873j> xVar) {
            this.f27855a = xVar;
        }

        /* renamed from: a */
        public void mo20318a(@C12579k C9873j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "response");
            this.f27855a.mo24789G(jVar);
        }

        /* renamed from: b */
        public void mo20319b(@C12579k C9873j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "response");
            this.f27855a.mo24790i(new UbError.UbHttpError(jVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionFlowKt$executeRequest$1(C9870g gVar, C9872i iVar, C11045c<? super ExtensionFlowKt$executeRequest$1> cVar) {
        super(2, cVar);
        this.$this_executeRequest = gVar;
        this.$request = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ExtensionFlowKt$executeRequest$1 extensionFlowKt$executeRequest$1 = new ExtensionFlowKt$executeRequest$1(this.$this_executeRequest, this.$request, cVar);
        extensionFlowKt$executeRequest$1.L$0 = obj;
        return extensionFlowKt$executeRequest$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C9873j> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ExtensionFlowKt$executeRequest$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0051
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001b:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0046
        L_0x0023:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlinx.coroutines.x r9 = kotlinx.coroutines.C12179z.m48761c(r3, r4, r3)
            com.usabilla.sdk.ubform.net.http.g r5 = r8.$this_executeRequest
            com.usabilla.sdk.ubform.net.http.i r6 = r8.$request
            com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$executeRequest$1$a r7 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$executeRequest$1$a
            r7.<init>(r9)
            r5.mo20300a(r6, r7)
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r9.mo24780v(r8)
            if (r9 != r0) goto L_0x0046
            return r0
        L_0x0046:
            r8.L$0 = r3
            r8.label = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L_0x0051
            return r0
        L_0x0051:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$executeRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
