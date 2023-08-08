package androidx.compose.p004ui.node;

import androidx.compose.runtime.collection.C8423g;
import androidx.vectordrawable.graphics.drawable.C20729i;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,53:1\n460#2,11:54\n523#2:65\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:54,11\n52#1:65\n*E\n"})
/* renamed from: androidx.compose.ui.node.q0 */
public final class C15726q0<T> {
    @C12579k

    /* renamed from: a */
    public final C8423g<T> f39051a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C11079d2> f39052b;

    public C15726q0(@C12579k C8423g<T> gVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(gVar, C20729i.f53485E0);
        Intrinsics.checkNotNullParameter(aVar, "onVectorMutated");
        this.f39051a = gVar;
        this.f39052b = aVar;
    }

    /* renamed from: a */
    public final void mo45183a(int i, T t) {
        this.f39051a.mo15459a(i, t);
        this.f39052b.invoke();
    }

    @C12579k
    /* renamed from: b */
    public final List<T> mo45184b() {
        return this.f39051a.mo15485s();
    }

    /* renamed from: c */
    public final void mo45185c() {
        this.f39051a.mo15490w();
        this.f39052b.invoke();
    }

    /* renamed from: d */
    public final void mo45186d(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8423g h = mo45190h();
        int h0 = h.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = h.mo15462d0();
            int i = 0;
            do {
                lVar.invoke(d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: e */
    public final T mo45187e(int i) {
        return this.f39051a.mo15462d0()[i];
    }

    @C12579k
    /* renamed from: f */
    public final C11289a<C11079d2> mo45188f() {
        return this.f39052b;
    }

    /* renamed from: g */
    public final int mo45189g() {
        return this.f39051a.mo15469h0();
    }

    @C12579k
    /* renamed from: h */
    public final C8423g<T> mo45190h() {
        return this.f39051a;
    }

    /* renamed from: i */
    public final T mo45191i(int i) {
        T D0 = this.f39051a.mo15437D0(i);
        this.f39052b.invoke();
        return D0;
    }
}
