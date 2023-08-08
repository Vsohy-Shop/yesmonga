package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,64:1\n47#2:65\n49#2:69\n50#3:66\n55#3:68\n106#4:67\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n35#1:65\n35#1:69\n35#1:66\n35#1:68\n35#1:67\n*E\n"})
public final class MappedInteractionSource implements C2241e {

    /* renamed from: a */
    public final long f19466a;
    @C12579k

    /* renamed from: b */
    public final Map<C2245i.C2247b, C2245i.C2247b> f19467b;
    @C12579k

    /* renamed from: c */
    public final C11907e<C2240d> f19468c;

    public /* synthetic */ MappedInteractionSource(C2241e eVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, j);
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C2240d> mo7603c() {
        return this.f19468c;
    }

    /* renamed from: f */
    public final C2245i.C2247b mo11641f(C2245i.C2247b bVar) {
        return new C2245i.C2247b(C15094f.m64885u(bVar.mo7608a(), this.f19466a), (DefaultConstructorMarker) null);
    }

    public MappedInteractionSource(C2241e eVar, long j) {
        Intrinsics.checkNotNullParameter(eVar, "underlyingInteractionSource");
        this.f19466a = j;
        this.f19467b = new LinkedHashMap();
        this.f19468c = new MappedInteractionSource$special$$inlined$map$1(eVar.mo7603c(), this);
    }
}
