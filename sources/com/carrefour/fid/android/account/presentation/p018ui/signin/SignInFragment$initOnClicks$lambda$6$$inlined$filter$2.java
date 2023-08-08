package com.carrefour.fid.android.account.presentation.p018ui.signin;

import com.carrefour.fid.android.account.databinding.C13232s;
import com.carrefour.fid.android.shared.extension.C28768m0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2 */
public final class SignInFragment$initOnClicks$lambda$6$$inlined$filter$2 implements C11907e<C28768m0> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f33018a;

    /* renamed from: b */
    public final /* synthetic */ C13232s f33019b;

    public SignInFragment$initOnClicks$lambda$6$$inlined$filter$2(C11907e eVar, C13232s sVar) {
        this.f33018a = eVar;
        this.f33019b = sVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f33018a;
        final C13232s sVar = this.f33019b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.carrefour.fid.android.account.presentation.p018ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2.C135352.C135361
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2$2$1 r0 = (com.carrefour.fid.android.account.presentation.p018ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2.C135352.C135361) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2$2$1 r0 = new com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r4
                    r2 = r5
                    com.carrefour.fid.android.shared.extension.m0 r2 = (com.carrefour.fid.android.shared.extension.C28768m0) r2
                    com.carrefour.fid.android.account.databinding.s r2 = r2
                    android.widget.Button r2 = r2.f32560b
                    boolean r2 = r2.isEnabled()
                    if (r2 == 0) goto L_0x004c
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.signin.SignInFragment$initOnClicks$lambda$6$$inlined$filter$2.C135352.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
