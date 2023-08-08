package com.carrefour.fid.android.design.components.compose;

import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputTextField$3 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ C36988h $focusRequesterDetail;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputTextField$3(C36988h hVar) {
        super(1);
        this.$focusRequesterDetail = hVar;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo111999a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (!C15434a.m67412E4(C15439d.m68273a(keyEvent), C15434a.f38267b.mo43633A()) || !C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43930b())) {
            return Boolean.FALSE;
        }
        C36988h hVar = this.$focusRequesterDetail;
        if (hVar.mo112413f() != 0) {
            hVar.mo112411e().get(hVar.mo112413f() - 1).mo42129h();
        }
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo111999a(((C15436b) obj).mo43922h());
    }
}
