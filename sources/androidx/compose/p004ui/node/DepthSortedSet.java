package androidx.compose.p004ui.node;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Comparator;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,106:1\n100#1:107\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:107\n*E\n"})
/* renamed from: androidx.compose.ui.node.DepthSortedSet */
public final class DepthSortedSet {

    /* renamed from: a */
    public final boolean f38812a;
    @C12579k

    /* renamed from: b */
    public final C11677z f38813b;
    @C12579k

    /* renamed from: c */
    public final Comparator<LayoutNode> f38814c;
    @C12579k

    /* renamed from: d */
    public final TreeSet<LayoutNode> f38815d;

    /* renamed from: androidx.compose.ui.node.DepthSortedSet$a */
    public static final class C15642a implements Comparator<LayoutNode> {
        /* renamed from: a */
        public int compare(@C12579k LayoutNode layoutNode, @C12579k LayoutNode layoutNode2) {
            Intrinsics.checkNotNullParameter(layoutNode, "l1");
            Intrinsics.checkNotNullParameter(layoutNode2, "l2");
            int compare = Intrinsics.compare(layoutNode.mo44669a0(), layoutNode2.mo44669a0());
            if (compare != 0) {
                return compare;
            }
            return Intrinsics.compare(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    }

    public DepthSortedSet() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo44598a(@C12579k LayoutNode layoutNode) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        if (layoutNode.mo44455k()) {
            if (this.f38812a) {
                Integer num = mo44600c().get(layoutNode);
                if (num == null) {
                    mo44600c().put(layoutNode, Integer.valueOf(layoutNode.mo44669a0()));
                } else {
                    if (num.intValue() == layoutNode.mo44669a0()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f38815d.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean mo44599b(@C12579k LayoutNode layoutNode) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        boolean contains = this.f38815d.contains(layoutNode);
        if (this.f38812a) {
            if (contains == mo44600c().containsKey(layoutNode)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    /* renamed from: c */
    public final Map<LayoutNode, Integer> mo44600c() {
        return (Map) this.f38813b.getValue();
    }

    /* renamed from: d */
    public final boolean mo44601d() {
        return this.f38815d.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo44602e() {
        return !mo44601d();
    }

    @C12579k
    /* renamed from: f */
    public final LayoutNode mo44603f() {
        LayoutNode first = this.f38815d.first();
        Intrinsics.checkNotNullExpressionValue(first, "node");
        mo44605h(first);
        return first;
    }

    /* renamed from: g */
    public final void mo44604g(@C12579k C11300l<? super LayoutNode, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        while (!mo44601d()) {
            lVar.invoke(mo44603f());
        }
    }

    /* renamed from: h */
    public final boolean mo44605h(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        if (layoutNode.mo44455k()) {
            boolean remove = this.f38815d.remove(layoutNode);
            if (this.f38812a) {
                Integer remove2 = mo44600c().remove(layoutNode);
                boolean z = true;
                if (remove) {
                    int a0 = layoutNode.mo44669a0();
                    if (remove2 == null || remove2.intValue() != a0) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12579k
    public String toString() {
        String obj = this.f38815d.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "set.toString()");
        return obj;
    }

    public DepthSortedSet(boolean z) {
        this.f38812a = z;
        this.f38813b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, DepthSortedSet$mapOfOriginalDepth$2.f38816f);
        C15642a aVar = new C15642a();
        this.f38814c = aVar;
        this.f38815d = new TreeSet<>(aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepthSortedSet(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
