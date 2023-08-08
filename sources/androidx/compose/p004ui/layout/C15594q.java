package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.q */
public final class C15594q {
    @C12580l
    /* renamed from: a */
    public static final Object m69317a(@C12579k C15557e0 e0Var) {
        C15598s sVar;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Object c = e0Var.mo44319c();
        if (c instanceof C15598s) {
            sVar = (C15598s) c;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            return sVar.mo44449u();
        }
        return null;
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m69318b(@C12579k C8767m mVar, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(obj, "layoutId");
        return mVar.mo17224k3(new LayoutIdModifierElement(obj));
    }
}
