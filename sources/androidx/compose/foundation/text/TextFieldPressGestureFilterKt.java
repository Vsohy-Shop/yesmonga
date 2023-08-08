package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TextFieldPressGestureFilterKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m12437a(@C12579k C8767m mVar, @C12580l C2243g gVar, boolean z, @C12579k C11300l<? super C15094f, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onTap");
        if (z) {
            return ComposedModifierKt.m32287j(mVar, (C11300l) null, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(lVar, gVar), 1, (Object) null);
        }
        return mVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m12438b(C8767m mVar, C2243g gVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m12437a(mVar, gVar, z, lVar);
    }
}
