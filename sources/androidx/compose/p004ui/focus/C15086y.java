package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,92:1\n87#2:93\n87#2:123\n87#2:153\n340#3:94\n206#3,2:95\n208#3,7:100\n215#3,15:108\n340#3:124\n206#3,2:125\n208#3,7:130\n215#3,15:138\n340#3:154\n206#3,2:155\n208#3,7:160\n215#3,15:168\n1182#4:97\n1161#4,2:98\n1182#4:127\n1161#4,2:128\n1182#4:157\n1161#4,2:158\n48#5:107\n48#5:137\n48#5:167\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:93\n63#1:123\n87#1:153\n40#1:94\n40#1:95,2\n40#1:100,7\n40#1:108,15\n63#1:124\n63#1:125,2\n63#1:130,7\n63#1:138,15\n87#1:154\n87#1:155,2\n87#1:160,7\n87#1:168,15\n40#1:97\n40#1:98,2\n63#1:127\n63#1:128,2\n87#1:157\n87#1:158,2\n40#1:107\n63#1:137\n87#1:167\n*E\n"})
/* renamed from: androidx.compose.ui.focus.y */
public final class C15086y {
    @C8761g
    /* renamed from: a */
    public static final boolean m64815a(@C12579k C15084w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        int b = C15739v0.m70597b(1024);
        if (wVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = wVar.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar, wVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            continue;
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if ((dVar instanceof FocusTargetModifierNode) && FocusTransactionsKt.m64636a((FocusTargetModifierNode) dVar)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: b */
    public static final boolean m64816b(@C12579k C15084w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        int b = C15739v0.m70597b(1024);
        if (wVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = wVar.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar, wVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            continue;
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if ((dVar instanceof FocusTargetModifierNode) && FocusTransactionsKt.m64641f((FocusTargetModifierNode) dVar)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: c */
    public static final boolean m64817c(@C12579k C15084w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        int b = C15739v0.m70597b(1024);
        if (wVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = wVar.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar, wVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            continue;
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if ((dVar instanceof FocusTargetModifierNode) && FocusTransactionsKt.m64643h((FocusTargetModifierNode) dVar)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
