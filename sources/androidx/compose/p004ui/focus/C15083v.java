package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.v */
public final class C15083v {
    @C12579k
    /* renamed from: a */
    public static final C8767m m64810a(@C12579k C8767m mVar, @C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        return mVar.mo17224k3(new FocusRequesterElement(focusRequester));
    }
}
