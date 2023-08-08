package androidx.constraintlayout.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ConstraintLayoutTagKt {
    @C12580l
    /* renamed from: a */
    public static final Object m75268a(@C12579k C15557e0 e0Var) {
        C16600i iVar;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Object c = e0Var.mo44319c();
        if (c instanceof C16600i) {
            iVar = (C16600i) c;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        return iVar.mo48513a();
    }

    @C12580l
    /* renamed from: b */
    public static final Object m75269b(@C12579k C15557e0 e0Var) {
        C16600i iVar;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Object c = e0Var.mo44319c();
        if (c instanceof C16600i) {
            iVar = (C16600i) c;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        return iVar.mo48516m();
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m75270c(@C12579k C8767m mVar, @C12579k String str, @C12580l String str2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "layoutId");
        if (str2 == null) {
            return C15594q.m69318b(mVar, str);
        }
        if (InspectableValueKt.m71063e()) {
            lVar = new ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1(str);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C16598h(str2, str, lVar));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m75271d(C8767m mVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return m75270c(mVar, str, str2);
    }
}
