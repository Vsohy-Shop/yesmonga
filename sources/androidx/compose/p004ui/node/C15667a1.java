package androidx.compose.p004ui.node;

import androidx.compose.runtime.collection.C8423g;
import java.util.Comparator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,73:1\n1182#2:74\n1161#2,2:75\n728#3,2:77\n728#3,2:79\n492#3,11:81\n460#3,11:93\n163#4:92\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:74\n26#1:75,2\n29#1:77,2\n35#1:79,2\n42#1:81,11\n56#1:93,11\n56#1:92\n*E\n"})
/* renamed from: androidx.compose.ui.node.a1 */
public final class C15667a1 {
    @C12579k

    /* renamed from: b */
    public static final C15668a f38985b = new C15668a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C8423g<LayoutNode> f38986a = new C8423g<>(new LayoutNode[16], 0);

    /* renamed from: androidx.compose.ui.node.a1$a */
    public static final class C15668a {

        /* renamed from: androidx.compose.ui.node.a1$a$a */
        public static final class C15669a implements Comparator<LayoutNode> {
            @C12579k

            /* renamed from: a */
            public static final C15669a f38987a = new C15669a();

            /* renamed from: a */
            public int compare(@C12579k LayoutNode layoutNode, @C12579k LayoutNode layoutNode2) {
                Intrinsics.checkNotNullParameter(layoutNode, "a");
                Intrinsics.checkNotNullParameter(layoutNode2, "b");
                int compare = Intrinsics.compare(layoutNode2.mo44669a0(), layoutNode.mo44669a0());
                if (compare != 0) {
                    return compare;
                }
                return Intrinsics.compare(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public /* synthetic */ C15668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15668a() {
        }
    }

    /* renamed from: a */
    public final void mo44931a() {
        this.f38986a.mo15445J0(C15668a.C15669a.f38987a);
        C8423g<LayoutNode> gVar = this.f38986a;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            int i = h0 - 1;
            Object[] d0 = gVar.mo15462d0();
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.mo44711w0()) {
                    mo44932b(layoutNode);
                }
                i--;
            } while (i >= 0);
        }
        this.f38986a.mo15490w();
    }

    /* renamed from: b */
    public final void mo44932b(LayoutNode layoutNode) {
        layoutNode.mo44640O();
        int i = 0;
        layoutNode.mo44645P1(false);
        C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            do {
                mo44932b((LayoutNode) d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: c */
    public final void mo44933c(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        this.f38986a.mo15463e(layoutNode);
        layoutNode.mo44645P1(true);
    }

    /* renamed from: d */
    public final void mo44934d(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "rootNode");
        this.f38986a.mo15490w();
        this.f38986a.mo15463e(layoutNode);
        layoutNode.mo44645P1(true);
    }
}
