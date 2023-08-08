package androidx.compose.p004ui.input.rotary;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.rotary.c */
public final class C15514c extends C8767m.C8772d implements C15513b {
    @C12580l

    /* renamed from: X */
    public C11300l<? super C15515d, Boolean> f38602X;
    @C12580l

    /* renamed from: z */
    public C11300l<? super C15515d, Boolean> f38603z;

    public C15514c(@C12580l C11300l<? super C15515d, Boolean> lVar, @C12580l C11300l<? super C15515d, Boolean> lVar2) {
        this.f38603z = lVar;
        this.f38602X = lVar2;
    }

    /* renamed from: g */
    public boolean mo44232g(@C12579k C15515d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "event");
        C11300l<? super C15515d, Boolean> lVar = this.f38602X;
        if (lVar != null) {
            return lVar.invoke(dVar).booleanValue();
        }
        return false;
    }

    @C12580l
    /* renamed from: j0 */
    public final C11300l<C15515d, Boolean> mo44234j0() {
        return this.f38603z;
    }

    @C12580l
    /* renamed from: k0 */
    public final C11300l<C15515d, Boolean> mo44235k0() {
        return this.f38602X;
    }

    /* renamed from: l0 */
    public final void mo44236l0(@C12580l C11300l<? super C15515d, Boolean> lVar) {
        this.f38603z = lVar;
    }

    /* renamed from: m0 */
    public final void mo44237m0(@C12580l C11300l<? super C15515d, Boolean> lVar) {
        this.f38602X = lVar;
    }

    /* renamed from: w */
    public boolean mo44233w(@C12579k C15515d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "event");
        C11300l<? super C15515d, Boolean> lVar = this.f38603z;
        if (lVar != null) {
            return lVar.invoke(dVar).booleanValue();
        }
        return false;
    }
}
