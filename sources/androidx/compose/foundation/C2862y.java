package androidx.compose.foundation;

import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.modifier.C15638m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsObserverModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* renamed from: androidx.compose.foundation.y */
public final class C2862y implements C15627d, C15634j<C11300l<? super C15588o, ? extends C11079d2>>, C11300l<C15588o, C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C11300l<C15588o, C11079d2> f7490a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super C15588o, C11079d2> f7491b;
    @C12580l

    /* renamed from: c */
    public C15588o f7492c;

    public C2862y(@C12579k C11300l<? super C15588o, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "handler");
        this.f7490a = lVar;
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        C11300l<? super C15588o, C11079d2> lVar = (C11300l) kVar.mo44518a(FocusedBoundsKt.m8944a());
        if (!Intrinsics.areEqual((Object) lVar, (Object) this.f7491b)) {
            this.f7491b = lVar;
        }
    }

    @C12579k
    /* renamed from: a */
    public C11300l<C15588o, C11079d2> getValue() {
        return this;
    }

    /* renamed from: b */
    public void mo9939b(@C12580l C15588o oVar) {
        this.f7492c = oVar;
        this.f7490a.invoke(oVar);
        C11300l<? super C15588o, C11079d2> lVar = this.f7491b;
        if (lVar != null) {
            lVar.invoke(oVar);
        }
    }

    @C12579k
    public C15638m<C11300l<C15588o, C11079d2>> getKey() {
        return FocusedBoundsKt.m8944a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9939b((C15588o) obj);
        return C11079d2.f28267a;
    }
}
