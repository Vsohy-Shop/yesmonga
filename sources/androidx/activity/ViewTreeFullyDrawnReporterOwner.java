package androidx.activity;

import android.view.View;
import androidx.activity.C0235d0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ViewTreeFullyDrawnReporterOwner")
public final class ViewTreeFullyDrawnReporterOwner {
    @C12580l
    @C11314h(name = "get")
    /* renamed from: a */
    public static final C0308s m1263a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (C0308s) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, C0208x54146ae.f693f), C0209x54146af.f694f));
    }

    @C11314h(name = "set")
    /* renamed from: b */
    public static final void m1264b(@C12579k View view, @C12579k C0308s sVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(sVar, "fullyDrawnReporterOwner");
        view.setTag(C0235d0.C0236a.report_drawn, sVar);
    }
}
