package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15733t0;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"})
/* renamed from: androidx.compose.ui.focus.i */
public final class C15066i {

    /* renamed from: androidx.compose.ui.focus.i$a */
    public /* synthetic */ class C15067a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p004ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.C15066i.C15067a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15087z m64743a(@C12579k C15064g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int b = C15739v0.m70597b(1024);
        if (gVar.mo17252q().mo17236Q()) {
            C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = gVar.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar2, gVar.mo17252q());
            } else {
                gVar2.mo15463e(F);
            }
            while (gVar2.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar2, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            continue;
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if (dVar instanceof FocusTargetModifierNode) {
                            FocusStateImpl s0 = ((FocusTargetModifierNode) dVar).mo42165s0();
                            int i = C15067a.$EnumSwitchMapping$0[s0.ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return s0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return FocusStateImpl.Inactive;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: b */
    public static final void m64744b(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        C15733t0 x0;
        boolean z;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int b = C15739v0.m70597b(4096) | C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8767m.C8772d M = focusTargetModifierNode.mo17252q().mo17234M();
            LayoutNode p = C15681e.m70235p(focusTargetModifierNode);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & b) != 0) {
                            if ((C15739v0.m70597b(1024) & M.mo17232I()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (M instanceof C15064g) {
                                    C15064g gVar = (C15064g) M;
                                    gVar.mo42177W(m64743a(gVar));
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            } else {
                                return;
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
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
