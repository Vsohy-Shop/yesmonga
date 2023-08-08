package androidx.compose.p004ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.c */
public final class C16150c {

    /* renamed from: a */
    public static final boolean f40135a = true;

    @C12579k
    /* renamed from: a */
    public static final C16051a0 m72640a(@C12580l C16459y yVar, @C12580l C16457x xVar) {
        return new C16051a0(yVar, xVar);
    }

    @C12579k
    /* renamed from: b */
    public static final C16457x m72641b(@C12579k C16457x xVar, @C12579k C16457x xVar2, float f) {
        Intrinsics.checkNotNullParameter(xVar, "start");
        Intrinsics.checkNotNullParameter(xVar2, "stop");
        if (xVar.mo47774c() == xVar2.mo47774c()) {
            return xVar;
        }
        return new C16457x(((C16256g) SpanStyleKt.m72352c(C16256g.m73209c(xVar.mo47773b()), C16256g.m73209c(xVar2.mo47773b()), f)).mo47023i(), ((Boolean) SpanStyleKt.m72352c(Boolean.valueOf(xVar.mo47774c()), Boolean.valueOf(xVar2.mo47774c()), f)).booleanValue(), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public static final C16459y m72642c(@C12579k C16459y yVar, @C12579k C16459y yVar2, float f) {
        Intrinsics.checkNotNullParameter(yVar, "start");
        Intrinsics.checkNotNullParameter(yVar2, "stop");
        return yVar;
    }
}
