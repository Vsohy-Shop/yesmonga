package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.runtime.collection.C8423g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,141:1\n1855#2:142\n1856#2:173\n1855#2:174\n1856#2:205\n1855#2,2:206\n87#3:143\n87#3:175\n340#4:144\n206#4,2:145\n208#4,7:150\n215#4,15:158\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n1182#5:147\n1161#5,2:148\n1182#5:179\n1161#5,2:180\n48#6:157\n48#6:189\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n64#1:142\n64#1:173\n73#1:174\n73#1:205\n121#1:206,2\n65#1:143\n87#1:175\n65#1:144\n65#1:145,2\n65#1:150,7\n65#1:158,15\n87#1:176\n87#1:177,2\n87#1:182,7\n87#1:190,15\n65#1:147\n65#1:148,2\n87#1:179\n87#1:180,2\n65#1:157\n87#1:189\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1 */
public final class FocusInvalidationManager$invalidateNodes$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    public final void invoke() {
        C15087z zVar;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = this.this$0.f37177d.iterator();
        while (true) {
            int i = 16;
            if (it.hasNext()) {
                C15078r rVar = (C15078r) it.next();
                int b = C15739v0.m70597b(1024);
                if (rVar.mo17252q().mo17236Q()) {
                    C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
                    C8767m.C8772d F = rVar.mo17252q().mo17229F();
                    if (F == null) {
                        C15681e.m70221b(gVar, rVar.mo17252q());
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
                                    break;
                                } else if ((dVar.mo17232I() & b) == 0) {
                                    dVar = dVar.mo17229F();
                                } else if (dVar instanceof FocusTargetModifierNode) {
                                    focusInvalidationManager.f37175b.add((FocusTargetModifierNode) dVar);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.this$0.f37177d.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (C15064g gVar2 : this.this$0.f37176c) {
                    if (!gVar2.mo17252q().mo17236Q()) {
                        gVar2.mo42177W(FocusStateImpl.Inactive);
                    } else {
                        int b2 = C15739v0.m70597b(1024);
                        if (gVar2.mo17252q().mo17236Q()) {
                            C8423g gVar3 = new C8423g(new C8767m.C8772d[i], 0);
                            C8767m.C8772d F2 = gVar2.mo17252q().mo17229F();
                            if (F2 == null) {
                                C15681e.m70221b(gVar3, gVar2.mo17252q());
                            } else {
                                gVar3.mo15463e(F2);
                            }
                            FocusTargetModifierNode focusTargetModifierNode = null;
                            boolean z = true;
                            boolean z2 = false;
                            while (gVar3.mo15477m0()) {
                                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar3.mo15437D0(gVar3.mo15469h0() - 1);
                                if ((dVar2.mo17228E() & b2) == 0) {
                                    C15681e.m70221b(gVar3, dVar2);
                                } else {
                                    while (true) {
                                        if (dVar2 == null) {
                                            break;
                                        } else if ((dVar2.mo17232I() & b2) == 0) {
                                            dVar2 = dVar2.mo17229F();
                                        } else if (dVar2 instanceof FocusTargetModifierNode) {
                                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) dVar2;
                                            if (focusTargetModifierNode != null) {
                                                z2 = true;
                                            }
                                            if (focusInvalidationManager2.f37175b.contains(focusTargetModifierNode2)) {
                                                linkedHashSet.add(focusTargetModifierNode2);
                                                z = false;
                                            }
                                            focusTargetModifierNode = focusTargetModifierNode2;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                if (z2) {
                                    zVar = C15066i.m64743a(gVar2);
                                } else if (focusTargetModifierNode == null || (zVar = focusTargetModifierNode.mo42164r0()) == null) {
                                    zVar = FocusStateImpl.Inactive;
                                }
                                gVar2.mo42177W(zVar);
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    i = 16;
                }
                this.this$0.f37176c.clear();
                for (FocusTargetModifierNode focusTargetModifierNode3 : this.this$0.f37175b) {
                    if (focusTargetModifierNode3.mo17236Q()) {
                        C15087z r0 = focusTargetModifierNode3.mo42164r0();
                        focusTargetModifierNode3.mo42166t0();
                        if (!Intrinsics.areEqual((Object) r0, (Object) focusTargetModifierNode3.mo42164r0()) || linkedHashSet.contains(focusTargetModifierNode3)) {
                            C15066i.m64744b(focusTargetModifierNode3);
                        }
                    }
                }
                this.this$0.f37175b.clear();
                linkedHashSet.clear();
                if (!this.this$0.f37177d.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.f37176c.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.f37175b.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else {
                    return;
                }
            }
        }
    }
}
