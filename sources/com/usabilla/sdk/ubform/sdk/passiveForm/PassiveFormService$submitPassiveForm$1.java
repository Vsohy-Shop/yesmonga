package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.net.http.C9873j;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "", "Lkotlinx/coroutines/flow/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PassiveFormService$submitPassiveForm$1 extends Lambda implements C11300l<C9873j, List<C11907e<? extends C11079d2>>> {
    final /* synthetic */ C9851c $payload;
    final /* synthetic */ PassiveFormService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassiveFormService$submitPassiveForm$1(C9851c cVar, PassiveFormService passiveFormService) {
        super(1);
        this.$payload = cVar;
        this.this$0 = passiveFormService;
    }

    @C12579k
    /* renamed from: a */
    public final List<C11907e<C11079d2>> invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        String body = jVar.getBody();
        Intrinsics.checkNotNull(body);
        C10087a aVar = new C10087a(body);
        ArrayList arrayList = new ArrayList();
        String b = this.$payload.mo20270b();
        if (b != null) {
            arrayList.addAll(this.this$0.m38168f(b, aVar));
        }
        return arrayList;
    }
}
