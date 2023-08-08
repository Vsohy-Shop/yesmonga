package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.f */
public final class C15063f {
    @C12579k
    /* renamed from: a */
    public static final C8767m m64738a(@C12579k C8767m mVar, @C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onFocusEvent");
        return mVar.mo17224k3(new FocusEventElement(lVar));
    }
}
