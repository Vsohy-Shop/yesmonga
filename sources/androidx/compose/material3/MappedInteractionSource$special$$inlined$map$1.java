package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2240d;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class MappedInteractionSource$special$$inlined$map$1 implements C11907e<C2240d> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f19469a;

    /* renamed from: b */
    public final /* synthetic */ MappedInteractionSource f19470b;

    public MappedInteractionSource$special$$inlined$map$1(C11907e eVar, MappedInteractionSource mappedInteractionSource) {
        this.f19469a = eVar;
        this.f19470b = mappedInteractionSource;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f19469a;
        final MappedInteractionSource mappedInteractionSource = this.f19470b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C80382.C80391
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C80382.C80391) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x0097
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r4
                    androidx.compose.foundation.interaction.d r6 = (androidx.compose.foundation.interaction.C2240d) r6
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
                    if (r2 == 0) goto L_0x0051
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    r4 = r6
                    androidx.compose.foundation.interaction.i$b r4 = (androidx.compose.foundation.interaction.C2245i.C2247b) r4
                    androidx.compose.foundation.interaction.i$b r2 = r2.mo11641f(r4)
                    androidx.compose.material3.MappedInteractionSource r4 = r2
                    java.util.Map r4 = r4.f19467b
                    r4.put(r6, r2)
                    r6 = r2
                    goto L_0x008e
                L_0x0051:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.C2245i.C2246a
                    if (r2 == 0) goto L_0x0070
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.f19467b
                    androidx.compose.foundation.interaction.i$a r6 = (androidx.compose.foundation.interaction.C2245i.C2246a) r6
                    androidx.compose.foundation.interaction.i$b r4 = r6.mo7607a()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.i$b r2 = (androidx.compose.foundation.interaction.C2245i.C2247b) r2
                    if (r2 != 0) goto L_0x006a
                    goto L_0x008e
                L_0x006a:
                    androidx.compose.foundation.interaction.i$a r6 = new androidx.compose.foundation.interaction.i$a
                    r6.<init>(r2)
                    goto L_0x008e
                L_0x0070:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.C2245i.C2248c
                    if (r2 == 0) goto L_0x008e
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.f19467b
                    androidx.compose.foundation.interaction.i$c r6 = (androidx.compose.foundation.interaction.C2245i.C2248c) r6
                    androidx.compose.foundation.interaction.i$b r4 = r6.mo7609a()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.i$b r2 = (androidx.compose.foundation.interaction.C2245i.C2247b) r2
                    if (r2 != 0) goto L_0x0089
                    goto L_0x008e
                L_0x0089:
                    androidx.compose.foundation.interaction.i$c r6 = new androidx.compose.foundation.interaction.i$c
                    r6.<init>(r2)
                L_0x008e:
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0097
                    return r1
                L_0x0097:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C80382.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
