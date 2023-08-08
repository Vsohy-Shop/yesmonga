package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8732b;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8767m.C8772d;
import androidx.compose.p004ui.platform.C15846a4;
import androidx.compose.p004ui.platform.C15977u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
@C11363r0({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* renamed from: androidx.compose.ui.node.p0 */
public abstract class C15723p0<N extends C8767m.C8772d> implements C8767m.C8770c, C15977u0 {

    /* renamed from: b */
    public static final int f39048b = 0;
    @C12580l

    /* renamed from: a */
    public C15983v0 f39049a;

    @C12579k
    /* renamed from: a */
    public abstract N mo17098a();

    @C12580l
    /* renamed from: b */
    public final Object mo9174b() {
        return mo45182q().mo45972c();
    }

    public abstract boolean equals(@C12580l Object obj);

    public abstract int hashCode();

    /* renamed from: m */
    public boolean mo17151m() {
        return true;
    }

    @C12579k
    /* renamed from: n */
    public final C11559m<C15846a4> mo45180n() {
        return mo45182q().mo45971b();
    }

    @C12580l
    /* renamed from: o */
    public final String mo45181o() {
        return mo45182q().mo45970a();
    }

    /* renamed from: q */
    public final C15983v0 mo45182q() {
        C15983v0 v0Var = this.f39049a;
        if (v0Var != null) {
            return v0Var;
        }
        C15983v0 v0Var2 = new C15983v0();
        v0Var2.mo45973d(C11342l0.m43547d(getClass()).mo22848s());
        mo17101r(v0Var2);
        this.f39049a = v0Var2;
        return v0Var2;
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        C8732b.m32370b(v0Var, this);
    }

    @C12579k
    /* renamed from: s */
    public abstract N mo17102s(@C12579k N n);
}
