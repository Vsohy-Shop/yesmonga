package androidx.compose.p004ui.platform;

import androidx.compose.runtime.collection.C8423g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
/* renamed from: androidx.compose.ui.platform.k4 */
public final class C15916k4<T> {
    @C12579k

    /* renamed from: a */
    public final C8423g<Reference<T>> f39609a = new C8423g<>(new Reference[16], 0);
    @C12579k

    /* renamed from: b */
    public final ReferenceQueue<T> f39610b = new ReferenceQueue<>();

    /* renamed from: a */
    public final void mo45817a() {
        Reference<? extends T> poll;
        do {
            poll = this.f39610b.poll();
            if (poll != null) {
                this.f39609a.mo15495z0(poll);
                continue;
            }
        } while (poll != null);
    }

    /* renamed from: b */
    public final int mo45818b() {
        mo45817a();
        return this.f39609a.mo15469h0();
    }

    @C12580l
    /* renamed from: c */
    public final T mo45819c() {
        mo45817a();
        while (this.f39609a.mo15477m0()) {
            C8423g<Reference<T>> gVar = this.f39609a;
            T t = gVar.mo15437D0(gVar.mo15469h0() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo45820d(T t) {
        mo45817a();
        this.f39609a.mo15463e(new WeakReference(t, this.f39610b));
    }
}
