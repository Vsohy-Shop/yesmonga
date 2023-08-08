package androidx.compose.p004ui.input.key;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.key.f */
public final class C15441f {
    @C12579k
    /* renamed from: a */
    public static final C8767m m68286a(@C12579k C8767m mVar, @C12579k C11300l<? super C15436b, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onKeyEvent");
        return mVar.mo17224k3(new OnKeyEventElement(lVar));
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m68287b(@C12579k C8767m mVar, @C12579k C11300l<? super C15436b, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onPreviewKeyEvent");
        return mVar.mo17224k3(new OnPreviewKeyEvent(lVar));
    }
}
