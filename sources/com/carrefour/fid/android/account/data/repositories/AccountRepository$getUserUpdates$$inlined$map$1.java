package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.domain.models.account.AccountInfo;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class AccountRepository$getUserUpdates$$inlined$map$1 implements C11907e<AccountInfo> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f32376a;

    public AccountRepository$getUserUpdates$$inlined$map$1(C11907e eVar) {
        this.f32376a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f32376a.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1.C132022.C132031
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1.C132022.C132031) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r3
                    com.carrefour.fid.android.UserInfo r5 = (com.carrefour.fid.android.UserInfo) r5
                    if (r5 == 0) goto L_0x003f
                    com.carrefour.fid.android.domain.models.account.AccountInfo r5 = com.carrefour.fid.android.account.data.entities.extentions.C13188k.m57161a(r5)
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1.C132022.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
