package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8732b;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.CombinedModifier;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1162#2:752\n1#3:753\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n735#1:752\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeChainKt */
public final class NodeChainKt {
    @C12579k

    /* renamed from: a */
    public static final C15657a f38926a;

    /* renamed from: b */
    public static final int f38927b = 0;

    /* renamed from: c */
    public static final int f38928c = 1;

    /* renamed from: d */
    public static final int f38929d = 2;

    /* renamed from: androidx.compose.ui.node.NodeChainKt$a */
    public static final class C15657a extends C8767m.C8772d {
        @C12579k
        public String toString() {
            return "<Head>";
        }
    }

    static {
        C15657a aVar = new C15657a();
        aVar.mo17242X(-1);
        f38926a = aVar;
    }

    /* renamed from: d */
    public static final int m69939d(@C12579k C8767m.C8770c cVar, @C12579k C8767m.C8770c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "prev");
        Intrinsics.checkNotNullParameter(cVar2, "next");
        if (Intrinsics.areEqual((Object) cVar, (Object) cVar2)) {
            return 2;
        }
        if (C8732b.m32369a(cVar, cVar2)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: e */
    public static final C8423g<C8767m.C8770c> m69940e(C8767m mVar, C8423g<C8767m.C8770c> gVar) {
        C8423g gVar2 = new C8423g(new C8767m[gVar.mo15469h0()], 0);
        gVar2.mo15463e(mVar);
        while (gVar2.mo15477m0()) {
            C8767m mVar2 = (C8767m) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
            if (mVar2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) mVar2;
                gVar2.mo15463e(combinedModifier.mo17004a());
                gVar2.mo15463e(combinedModifier.mo17005b());
            } else if (mVar2 instanceof C8767m.C8770c) {
                gVar.mo15463e(mVar2);
            } else {
                mVar2.mo17001A(new NodeChainKt$fillVector$1(gVar));
            }
        }
        return gVar;
    }

    /* renamed from: f */
    public static final <T extends C8767m.C8772d> C8767m.C8772d m69941f(C15723p0<T> p0Var, C8767m.C8772d dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        return p0Var.mo17102s(dVar);
    }
}
