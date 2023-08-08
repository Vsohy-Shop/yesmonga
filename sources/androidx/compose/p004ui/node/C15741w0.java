package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8749h;
import androidx.compose.p004ui.focus.C15061e;
import androidx.compose.p004ui.focus.C15064g;
import androidx.compose.p004ui.focus.C15072m;
import androidx.compose.p004ui.focus.C15078r;
import androidx.compose.p004ui.focus.FocusTargetModifierNode;
import androidx.compose.p004ui.input.key.C15442g;
import androidx.compose.p004ui.input.pointer.C15469d0;
import androidx.compose.p004ui.input.rotary.C15513b;
import androidx.compose.p004ui.layout.C15549c0;
import androidx.compose.p004ui.layout.C15578k;
import androidx.compose.p004ui.layout.C15586n0;
import androidx.compose.p004ui.layout.C15592p0;
import androidx.compose.p004ui.layout.C15599s0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15632h;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.semantics.C16036k;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"})
/* renamed from: androidx.compose.ui.node.w0 */
public final class C15741w0 {

    /* renamed from: a */
    public static final int f39085a = 0;

    /* renamed from: b */
    public static final int f39086b = 1;

    /* renamed from: c */
    public static final int f39087c = 2;

    /* renamed from: a */
    public static final void m70612a(@C12579k C8767m.C8772d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "node");
        m70613b(dVar, 1);
    }

    /* renamed from: b */
    public static final void m70613b(C8767m.C8772d dVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (dVar.mo17236Q()) {
            boolean z8 = true;
            if ((C15739v0.m70597b(2) & dVar.mo17232I()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (dVar instanceof C15740w)) {
                C15750z.m70685c((C15740w) dVar);
                if (i == 2) {
                    C15681e.m70234o(dVar, C15739v0.m70597b(2)).mo44827D5();
                }
            }
            if ((C15739v0.m70597b(256) & dVar.mo17232I()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (dVar instanceof C15704l)) {
                C15681e.m70235p(dVar).mo44656T0();
            }
            if ((C15739v0.m70597b(4) & dVar.mo17232I()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && (dVar instanceof C15693i)) {
                C15696j.m70310a((C15693i) dVar);
            }
            if ((C15739v0.m70597b(8) & dVar.mo17232I()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && (dVar instanceof C15703k1)) {
                C15706l1.m70390d((C15703k1) dVar);
            }
            if ((C15739v0.m70597b(64) & dVar.mo17232I()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && (dVar instanceof C15683e1)) {
                C15686f1.m70258a((C15683e1) dVar);
            }
            if ((C15739v0.m70597b(1024) & dVar.mo17232I()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (dVar instanceof FocusTargetModifierNode)) {
                if (i == 2) {
                    dVar.mo17240U();
                } else {
                    C15681e.m70236q(dVar).getFocusOwner().mo42076f((FocusTargetModifierNode) dVar);
                }
            }
            if ((C15739v0.m70597b(2048) & dVar.mo17232I()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (dVar instanceof C15078r)) {
                C15078r rVar = (C15078r) dVar;
                if (m70622k(rVar)) {
                    if (i == 2) {
                        m70621j(rVar);
                    } else {
                        C15681e.m70236q(dVar).getFocusOwner().mo42080j(rVar);
                    }
                }
            }
            if ((C15739v0.m70597b(4096) & dVar.mo17232I()) == 0) {
                z8 = false;
            }
            if (z8 && (dVar instanceof C15064g) && i != 2) {
                C15681e.m70236q(dVar).getFocusOwner().mo42073c((C15064g) dVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public static final void m70614c(@C12579k C8767m.C8772d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "node");
        m70613b(dVar, 2);
    }

    /* renamed from: d */
    public static final void m70615d(@C12579k C8767m.C8772d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "node");
        m70613b(dVar, 0);
    }

    /* renamed from: e */
    public static final int m70616e(@C12579k C8767m.C8770c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "element");
        int b = C15739v0.m70597b(1);
        if (cVar instanceof C15603u) {
            b |= C15739v0.m70597b(2);
        }
        if (cVar instanceof C15578k) {
            b |= C15739v0.m70597b(512);
        }
        if (cVar instanceof C8749h) {
            b |= C15739v0.m70597b(4);
        }
        if (cVar instanceof C16036k) {
            b |= C15739v0.m70597b(8);
        }
        if (cVar instanceof C15469d0) {
            b |= C15739v0.m70597b(16);
        }
        if ((cVar instanceof C15627d) || (cVar instanceof C15634j)) {
            b |= C15739v0.m70597b(32);
        }
        if (cVar instanceof C15061e) {
            b |= C15739v0.m70597b(4096);
        }
        if (cVar instanceof C15072m) {
            b |= C15739v0.m70597b(2048);
        }
        if (cVar instanceof C15586n0) {
            b |= C15739v0.m70597b(256);
        }
        if (cVar instanceof C15605u0) {
            b |= C15739v0.m70597b(64);
        }
        if ((cVar instanceof C15592p0) || (cVar instanceof C15599s0) || (cVar instanceof C15549c0)) {
            return b | C15739v0.m70597b(128);
        }
        return b;
    }

    /* renamed from: f */
    public static final int m70617f(@C12579k C8767m.C8772d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "node");
        int b = C15739v0.m70597b(1);
        if (dVar instanceof C15740w) {
            b |= C15739v0.m70597b(2);
        }
        if (dVar instanceof C15693i) {
            b |= C15739v0.m70597b(4);
        }
        if (dVar instanceof C15703k1) {
            b |= C15739v0.m70597b(8);
        }
        if (dVar instanceof C15689g1) {
            b |= C15739v0.m70597b(16);
        }
        if (dVar instanceof C15632h) {
            b |= C15739v0.m70597b(32);
        }
        if (dVar instanceof C15683e1) {
            b |= C15739v0.m70597b(64);
        }
        if (dVar instanceof C15738v) {
            b |= C15739v0.m70597b(128);
        }
        if (dVar instanceof C15704l) {
            b |= C15739v0.m70597b(256);
        }
        if (dVar instanceof C15725q) {
            b |= C15739v0.m70597b(512);
        }
        if (dVar instanceof FocusTargetModifierNode) {
            b |= C15739v0.m70597b(1024);
        }
        if (dVar instanceof C15078r) {
            b |= C15739v0.m70597b(2048);
        }
        if (dVar instanceof C15064g) {
            b |= C15739v0.m70597b(4096);
        }
        if (dVar instanceof C15442g) {
            b |= C15739v0.m70597b(8192);
        }
        if (dVar instanceof C15513b) {
            return b | C15739v0.m70597b(16384);
        }
        return b;
    }

    /* renamed from: g */
    public static final boolean m70618g(int i) {
        return (i & C15739v0.m70597b(128)) != 0;
    }

    /* renamed from: h */
    public static /* synthetic */ void m70619h(int i) {
    }

    /* renamed from: i */
    public static final int m70620i(int i, int i2) {
        return i | i2;
    }

    @C8761g
    /* renamed from: j */
    public static final void m70621j(C15078r rVar) {
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
                            C15681e.m70236q(rVar).getFocusOwner().mo42076f((FocusTargetModifierNode) dVar);
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: k */
    public static final boolean m70622k(C15078r rVar) {
        C15670b bVar = C15670b.f38988a;
        bVar.mo44938x();
        rVar.mo42215s(bVar);
        return bVar.mo44937w();
    }
}
