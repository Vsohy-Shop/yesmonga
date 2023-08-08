package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,287:1\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n243#1:288\n255#1:289\n*E\n"})
public final class BoxScopeInstance implements C2362h {
    @C12579k

    /* renamed from: a */
    public static final BoxScopeInstance f6046a = new BoxScopeInstance();

    @C8547h2
    @C12579k
    /* renamed from: c */
    public C8767m mo7701c(@C12579k C8767m mVar, @C12579k C8734c cVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        if (InspectableValueKt.m71063e()) {
            lVar = new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(cVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2359g(cVar, false, lVar));
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public C8767m mo7702e(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C8734c i = C8734c.f23406a.mo17066i();
        if (InspectableValueKt.m71063e()) {
            lVar = new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2359g(i, true, lVar));
    }
}
