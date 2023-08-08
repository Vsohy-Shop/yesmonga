package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C2414v0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15576j;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,272:1\n1#2:273\n135#3:274\n135#3:275\n135#3:276\n135#3:277\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n227#1:274\n241#1:275\n252#1:276\n265#1:277\n*E\n"})
public final class RowScopeInstance implements C2411u0 {
    @C12579k

    /* renamed from: a */
    public static final RowScopeInstance f6147a = new RowScopeInstance();

    @C12579k
    /* renamed from: a */
    public C8767m mo7841a(@C12579k C8767m mVar, @C12579k C11300l<? super C15574i0, Integer> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "alignmentLineBlock");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new RowScopeInstance$alignBy$$inlined$debugInspectorInfo$2(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2414v0.C2416b(lVar, lVar2));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public C8767m mo7842b(@C12579k C8767m mVar, float f, boolean z) {
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
                lVar = new RowScopeInstance$weight$$inlined$debugInspectorInfo$1(f, z);
            } else {
                lVar = InspectableValueKt.m71060b();
            }
            return mVar.mo17224k3(new C2338a0(f, z, lVar));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public C8767m mo7843c(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mo7844d(mVar, AlignmentLineKt.m68885a());
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public C8767m mo7844d(@C12579k C8767m mVar, @C12579k C15576j jVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(jVar, "alignmentLine");
        if (InspectableValueKt.m71063e()) {
            lVar = new RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1(jVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2414v0.C2415a(jVar, lVar));
    }

    @C8547h2
    @C12579k
    /* renamed from: f */
    public C8767m mo7845f(@C12579k C8767m mVar, @C12579k C8734c.C8737c cVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        if (InspectableValueKt.m71063e()) {
            lVar = new RowScopeInstance$align$$inlined$debugInspectorInfo$1(cVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2350d1(cVar, lVar));
    }
}
