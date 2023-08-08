package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, mo22516d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/d2;", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1 */
public final class C28398x57f4fec3 implements C11907e<Integer> {
    final /* synthetic */ C8700z0 $isAnimating$delegate$inlined;
    final /* synthetic */ C11907e $this_unsafeTransform$inlined;

    public C28398x57f4fec3(C11907e eVar, C8700z0 z0Var) {
        this.$this_unsafeTransform$inlined = eVar;
        this.$isAnimating$delegate$inlined = z0Var;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.$this_unsafeTransform$inlined;
        final C8700z0 z0Var = this.$isAnimating$delegate$inlined;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.carrefour.fid.android.service.presentation.p044ui.drive.map.C28398x57f4fec3.C283992.C284001
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1$2$1 r0 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.C28398x57f4fec3.C283992.C284001) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1$2$1 r0 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r4
                    r2 = r5
                    java.lang.Number r2 = (java.lang.Number) r2
                    r2.intValue()
                    androidx.compose.runtime.z0 r2 = r2
                    boolean r2 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveCarouselStatefulKt.DriveCarouselStateful$lambda$3(r2)
                    if (r2 != 0) goto L_0x004d
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.C28398x57f4fec3.C283992.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
