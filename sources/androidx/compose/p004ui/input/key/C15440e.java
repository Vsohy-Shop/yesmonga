package androidx.compose.p004ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
/* renamed from: androidx.compose.ui.input.key.e */
public final class C15440e extends C8767m.C8772d implements C15442g {
    @C12580l

    /* renamed from: X */
    public C11300l<? super C15436b, Boolean> f38424X;
    @C12580l

    /* renamed from: z */
    public C11300l<? super C15436b, Boolean> f38425z;

    public C15440e(@C12580l C11300l<? super C15436b, Boolean> lVar, @C12580l C11300l<? super C15436b, Boolean> lVar2) {
        this.f38425z = lVar;
        this.f38424X = lVar2;
    }

    @C12580l
    /* renamed from: j0 */
    public final C11300l<C15436b, Boolean> mo43932j0() {
        return this.f38425z;
    }

    @C12580l
    /* renamed from: k0 */
    public final C11300l<C15436b, Boolean> mo43933k0() {
        return this.f38424X;
    }

    /* renamed from: l0 */
    public final void mo43934l0(@C12580l C11300l<? super C15436b, Boolean> lVar) {
        this.f38425z = lVar;
    }

    /* renamed from: m0 */
    public final void mo43935m0(@C12580l C11300l<? super C15436b, Boolean> lVar) {
        this.f38424X = lVar;
    }

    /* renamed from: t */
    public boolean mo43936t(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        C11300l<? super C15436b, Boolean> lVar = this.f38424X;
        if (lVar != null) {
            return lVar.invoke(C15436b.m68252a(keyEvent)).booleanValue();
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo43937v(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        C11300l<? super C15436b, Boolean> lVar = this.f38425z;
        if (lVar != null) {
            return lVar.invoke(C15436b.m68252a(keyEvent)).booleanValue();
        }
        return false;
    }
}
