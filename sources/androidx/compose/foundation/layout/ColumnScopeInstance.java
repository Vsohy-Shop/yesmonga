package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C2414v0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15575i1;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,250:1\n1#2:251\n135#3:252\n135#3:253\n135#3:254\n135#3:255\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n207#1:252\n221#1:253\n232#1:254\n243#1:255\n*E\n"})
public final class ColumnScopeInstance implements C2373k {
    @C12579k

    /* renamed from: a */
    public static final ColumnScopeInstance f6049a = new ColumnScopeInstance();

    @C8547h2
    @C12579k
    /* renamed from: a */
    public C8767m mo7711a(@C12579k C8767m mVar, @C12579k C11300l<? super C15574i0, Integer> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "alignmentLineBlock");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$2(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2414v0.C2416b(lVar, lVar2));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public C8767m mo7712b(@C12579k C8767m mVar, float f, boolean z) {
        boolean z2;
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (((double) f) > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (InspectableValueKt.m71063e()) {
                lVar = new ColumnScopeInstance$weight$$inlined$debugInspectorInfo$1(f, z);
            } else {
                lVar = InspectableValueKt.m71060b();
            }
            return mVar.mo17224k3(new C2338a0(f, z, lVar));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public C8767m mo7713d(@C12579k C8767m mVar, @C12579k C15575i1 i1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(i1Var, "alignmentLine");
        if (InspectableValueKt.m71063e()) {
            lVar = new ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$1(i1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2414v0.C2415a(i1Var, lVar));
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public C8767m mo7714e(@C12579k C8767m mVar, @C12579k C8734c.C8736b bVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, C9168d0.f24891y);
        if (InspectableValueKt.m71063e()) {
            lVar = new ColumnScopeInstance$align$$inlined$debugInspectorInfo$1(bVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2408t(bVar, lVar));
    }
}
