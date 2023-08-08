package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.BackwardsCompatNode;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.collection.C8423g;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,121:1\n1182#2:122\n1161#2,2:123\n1182#2:125\n1161#2,2:126\n1182#2:128\n1161#2,2:129\n1182#2:131\n1161#2,2:132\n1182#2:164\n1161#2,2:165\n476#3,7:134\n523#3:141\n483#3,4:142\n476#3,7:146\n523#3:153\n483#3,4:154\n728#3,2:187\n728#3,2:189\n728#3,2:191\n728#3,2:193\n728#3,2:195\n728#3,2:197\n1855#4,2:158\n77#5:160\n346#6:161\n237#6,2:162\n239#6,20:167\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:122\n44#1:123,2\n45#1:125\n45#1:126,2\n46#1:128\n46#1:129,2\n47#1:131\n47#1:132,2\n93#1:164\n93#1:165,2\n64#1:134,7\n65#1:141\n64#1:142,4\n77#1:146,7\n78#1:153\n77#1:154,4\n105#1:187,2\n106#1:189,2\n111#1:191,2\n112#1:193,2\n117#1:195,2\n118#1:197,2\n85#1:158,2\n93#1:160\n93#1:161\n93#1:162,2\n93#1:167,20\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalManager */
public final class ModifierLocalManager {
    @C12579k

    /* renamed from: a */
    public final C15675c1 f38759a;
    @C12579k

    /* renamed from: b */
    public final C8423g<BackwardsCompatNode> f38760b = new C8423g<>(new BackwardsCompatNode[16], 0);
    @C12579k

    /* renamed from: c */
    public final C8423g<C15626c<?>> f38761c = new C8423g<>(new C15626c[16], 0);
    @C12579k

    /* renamed from: d */
    public final C8423g<LayoutNode> f38762d = new C8423g<>(new LayoutNode[16], 0);
    @C12579k

    /* renamed from: e */
    public final C8423g<C15626c<?>> f38763e = new C8423g<>(new C15626c[16], 0);

    /* renamed from: f */
    public boolean f38764f;

    public ModifierLocalManager(@C12579k C15675c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "owner");
        this.f38759a = c1Var;
    }

    @C12579k
    /* renamed from: a */
    public final C15675c1 mo44500a() {
        return this.f38759a;
    }

    /* renamed from: b */
    public final void mo44501b(@C12579k BackwardsCompatNode backwardsCompatNode, @C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(backwardsCompatNode, "node");
        Intrinsics.checkNotNullParameter(cVar, "key");
        this.f38760b.mo15463e(backwardsCompatNode);
        this.f38761c.mo15463e(cVar);
        mo44502c();
    }

    /* renamed from: c */
    public final void mo44502c() {
        if (!this.f38764f) {
            this.f38764f = true;
            this.f38759a.mo44960G(new ModifierLocalManager$invalidate$1(this));
        }
    }

    /* renamed from: d */
    public final void mo44503d(C8767m.C8772d dVar, C15626c<?> cVar, Set<BackwardsCompatNode> set) {
        boolean z;
        int b = C15739v0.m70597b(32);
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & b) != 0) {
                    C8767m.C8772d dVar3 = dVar2;
                    while (true) {
                        if (dVar3 == null) {
                            break;
                        }
                        if ((dVar3.mo17232I() & b) != 0) {
                            if (dVar3 instanceof C15632h) {
                                C15632h hVar = (C15632h) dVar3;
                                if (hVar instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) hVar;
                                    if ((backwardsCompatNode.mo44556k0() instanceof C15627d) && backwardsCompatNode.mo44558l0().contains(cVar)) {
                                        set.add(hVar);
                                    }
                                }
                                z = !hVar.mo44519o().mo44508a(cVar);
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                        }
                        dVar3 = dVar3.mo17229F();
                    }
                }
                C15681e.m70221b(gVar, dVar2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    public final void mo44504e(@C12579k BackwardsCompatNode backwardsCompatNode, @C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(backwardsCompatNode, "node");
        Intrinsics.checkNotNullParameter(cVar, "key");
        this.f38762d.mo15463e(C15681e.m70235p(backwardsCompatNode));
        this.f38763e.mo15463e(cVar);
        mo44502c();
    }

    /* renamed from: f */
    public final void mo44505f() {
        int i = 0;
        this.f38764f = false;
        HashSet<BackwardsCompatNode> hashSet = new HashSet<>();
        C8423g<LayoutNode> gVar = this.f38762d;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i2];
                C15626c cVar = (C15626c) this.f38763e.mo15462d0()[i2];
                if (layoutNode.mo44712x0().mo45231m().mo17236Q()) {
                    mo44503d(layoutNode.mo44712x0().mo45231m(), cVar, hashSet);
                }
                i2++;
            } while (i2 < h0);
        }
        this.f38762d.mo15490w();
        this.f38763e.mo15490w();
        C8423g<BackwardsCompatNode> gVar2 = this.f38760b;
        int h02 = gVar2.mo15469h0();
        if (h02 > 0) {
            Object[] d02 = gVar2.mo15462d0();
            do {
                BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) d02[i];
                C15626c cVar2 = (C15626c) this.f38761c.mo15462d0()[i];
                if (backwardsCompatNode.mo17236Q()) {
                    mo44503d(backwardsCompatNode, cVar2, hashSet);
                }
                i++;
            } while (i < h02);
        }
        this.f38760b.mo15490w();
        this.f38761c.mo15490w();
        for (BackwardsCompatNode s0 : hashSet) {
            s0.mo44567s0();
        }
    }

    /* renamed from: g */
    public final void mo44506g(@C12579k BackwardsCompatNode backwardsCompatNode, @C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(backwardsCompatNode, "node");
        Intrinsics.checkNotNullParameter(cVar, "key");
        this.f38760b.mo15463e(backwardsCompatNode);
        this.f38761c.mo15463e(cVar);
        mo44502c();
    }
}
