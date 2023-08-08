package androidx.compose.p004ui.input.rotary;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.rotary.a */
public final class C15512a {
    @C12579k
    /* renamed from: a */
    public static final C8767m m68871a(@C12579k C8767m mVar, @C12579k C11300l<? super C15515d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onPreRotaryScrollEvent");
        return mVar.mo17224k3(new OnPreRotaryScrollEventElement(lVar));
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m68872b(@C12579k C8767m mVar, @C12579k C11300l<? super C15515d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onRotaryScrollEvent");
        return mVar.mo17224k3(new OnRotaryScrollEventElement(lVar));
    }
}
