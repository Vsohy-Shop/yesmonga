package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.LayoutEvent;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1 implements C11907e<Pair<? extends LayoutEvent.SubmitForm, ? extends C35608o.C35610b>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f88265a;

    /* renamed from: b */
    public final /* synthetic */ BaseFormController f88266b;

    public BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1(C11907e eVar, BaseFormController baseFormController) {
        this.f88265a = eVar;
        this.f88266b = baseFormController;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f88265a;
        final BaseFormController baseFormController = this.f88266b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1.C357122.C357131
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1.C357122.C357131) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r4
                    com.urbanairship.android.layout.environment.LayoutEvent$SubmitForm r5 = (com.urbanairship.android.layout.environment.LayoutEvent.SubmitForm) r5
                    com.urbanairship.android.layout.model.BaseFormController r2 = r2
                    com.urbanairship.android.layout.environment.n r2 = r2.f88259r
                    java.lang.Object r2 = r2.mo106667b()
                    kotlin.Pair r5 = kotlin.C11078d1.m42659a(r5, r2)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.BaseFormController$initParentForm$1$invokeSuspend$$inlined$map$1.C357122.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
