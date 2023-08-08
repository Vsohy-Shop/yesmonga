package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.constraintlayout.compose.C16616o;
import androidx.constraintlayout.core.state.C16769n;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.t */
public final class C16628t implements C16616o {
    @C12579k

    /* renamed from: a */
    public final C11300l<C16612m, C11079d2> f41317a;
    @C12580l

    /* renamed from: b */
    public final C16602j f41318b;

    public C16628t(@C12579k C11300l<? super C16612m, C11079d2> lVar, @C12580l C16602j jVar) {
        Intrinsics.checkNotNullParameter(lVar, "description");
        this.f41317a = lVar;
        this.f41318b = jVar;
    }

    /* renamed from: a */
    public void mo48354a(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list) {
        C16616o.C16617a.m75590a(this, l0Var, list);
    }

    /* renamed from: b */
    public void mo48355b(@C12579k C16769n nVar, int i) {
        C16616o.C16617a.m75591b(this, nVar, i);
    }

    /* renamed from: c */
    public boolean mo48356c(@C12579k List<? extends C15557e0> list) {
        return C16616o.C16617a.m75592c(this, list);
    }

    @C12579k
    /* renamed from: d */
    public final C11300l<C16612m, C11079d2> mo48588d() {
        return this.f41317a;
    }

    @C12580l
    /* renamed from: f */
    public C16602j mo48465f() {
        return this.f41318b;
    }

    @C12579k
    /* renamed from: i */
    public C16602j mo48357i(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this;
    }

    /* renamed from: k */
    public void mo48466k(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        C16612m mVar = new C16612m();
        this.f41317a.invoke(mVar);
        mVar.mo48259a(l0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16628t(C11300l lVar, C16602j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i & 2) != 0 ? null : jVar);
    }
}
