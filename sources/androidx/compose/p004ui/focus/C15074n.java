package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.n */
public final class C15074n {
    @C11395k(message = "Use focusRequester() instead", replaceWith = @C11587t0(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    @C12579k
    /* renamed from: a */
    public static final C8767m m64778a(@C12579k C8767m mVar, @C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        return C15083v.m64810a(mVar, focusRequester);
    }

    @C11395k(message = "Use focusProperties() and focusRequester() instead", replaceWith = @C11587t0(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    @C12579k
    /* renamed from: b */
    public static final C8767m m64779b(@C12579k C8767m mVar, @C12579k FocusRequester focusRequester, @C12579k C11300l<? super C15071l, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(lVar, "focusOrderReceiver");
        return C15077q.m64794a(C15083v.m64810a(mVar, focusRequester), new C15075o(lVar));
    }

    @C11395k(message = "Use focusProperties() instead", replaceWith = @C11587t0(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    @C12579k
    /* renamed from: c */
    public static final C8767m m64780c(@C12579k C8767m mVar, @C12579k C11300l<? super C15071l, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "focusOrderReceiver");
        return C15077q.m64794a(mVar, new C15075o(lVar));
    }
}
