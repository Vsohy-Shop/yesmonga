package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.text.selection.C2826e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15056b;
import androidx.compose.p004ui.focus.C15083v;
import androidx.compose.p004ui.focus.C15087z;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TextFieldGestureModifiersKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m12401a(@C12579k C8767m mVar, @C12579k C2846t tVar, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(tVar, "observer");
        if (z) {
            return SuspendingPointerInputFilterKt.m68437c(mVar, tVar, new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(tVar, (C11045c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1>) null));
        }
        return mVar;
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m12402b(@C12579k C8767m mVar, @C12579k C2826e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "observer");
        if (z) {
            return SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, eVar, new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(eVar, (C11045c<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1>) null));
        }
        return mVar;
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m12403c(@C12579k C8767m mVar, boolean z, @C12579k FocusRequester focusRequester, @C12580l C2243g gVar, @C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(lVar, "onFocusChanged");
        return FocusableKt.m8919b(C15056b.m64690a(C15083v.m64810a(mVar, focusRequester), lVar), z, gVar);
    }
}
