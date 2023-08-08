package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15678d;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15733t0;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8761g
@C11363r0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,220:1\n77#2:221\n314#3:222\n78#3,17:223\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n*L\n170#1:221\n170#1:222\n170#1:223,17\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.h */
public interface C15632h extends C15636k, C15678d {
    /* renamed from: a */
    <T> T mo44518a(@C12579k C15626c<T> cVar) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (mo17252q().mo17236Q()) {
            int b = C15739v0.m70597b(32);
            if (mo17252q().mo17236Q()) {
                C8767m.C8772d M = mo17252q().mo17234M();
                LayoutNode p = C15681e.m70235p(this);
                while (p != null) {
                    if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                        while (M != null) {
                            if ((M.mo17232I() & b) != 0 && (M instanceof C15632h)) {
                                C15632h hVar = (C15632h) M;
                                if (hVar.mo44519o().mo44508a(cVar)) {
                                    return hVar.mo44519o().mo44509b(cVar);
                                }
                            }
                            M = M.mo17234M();
                        }
                    }
                    p = p.mo44613C0();
                    if (p == null || (x0 = p.mo44712x0()) == null) {
                        M = null;
                    } else {
                        M = x0.mo45236r();
                    }
                }
                return cVar.mo44514a().invoke();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C12579k
    /* renamed from: o */
    C15631g mo44519o() {
        return C15625b.f38768b;
    }

    /* renamed from: x */
    <T> void mo44520x(@C12579k C15626c<T> cVar, T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (mo44519o() != C15625b.f38768b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        } else if (mo44519o().mo44508a(cVar)) {
            mo44519o().mo44510c(cVar, t);
        } else {
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + cVar + " was not found.").toString());
        }
    }
}
