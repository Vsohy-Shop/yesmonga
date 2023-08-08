package androidx.compose.p004ui.layout;

import androidx.compose.runtime.internal.C8567o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.C10994x;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.g1 */
public interface C15565g1 {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.layout.g1$a */
    public static final class C15566a implements Collection<Object>, C11345a {

        /* renamed from: b */
        public static final int f38718b = 8;
        @C12579k

        /* renamed from: a */
        public final Set<Object> f38719a;

        public C15566a() {
            this((Set) null, 1, (DefaultConstructorMarker) null);
        }

        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            this.f38719a.clear();
        }

        public boolean contains(@C12580l Object obj) {
            return this.f38719a.contains(obj);
        }

        public boolean containsAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f38719a.containsAll(collection);
        }

        /* renamed from: e */
        public final boolean add(@C12580l Object obj) {
            return this.f38719a.add(obj);
        }

        /* renamed from: h */
        public int mo44401h() {
            return this.f38719a.size();
        }

        /* renamed from: i */
        public final boolean mo44402i(@C12579k C11300l<Object, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C10994x.m42343D0(this.f38719a, lVar);
        }

        public boolean isEmpty() {
            return this.f38719a.isEmpty();
        }

        @C12579k
        public Iterator<Object> iterator() {
            return this.f38719a.iterator();
        }

        /* renamed from: q */
        public final boolean mo44405q(@C12579k C11300l<Object, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return C10994x.m42353N0(this.f38719a, lVar);
        }

        public final boolean remove(@C12580l Object obj) {
            return this.f38719a.remove(obj);
        }

        public final boolean removeAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "slotIds");
            return this.f38719a.remove(collection);
        }

        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "slotIds");
            return this.f38719a.retainAll(collection);
        }

        public final /* bridge */ int size() {
            return mo44401h();
        }

        public Object[] toArray() {
            return C11367t.m43656a(this);
        }

        public C15566a(@C12579k Set<Object> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            this.f38719a = set;
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return C11367t.m43657b(this, tArr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15566a(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    /* renamed from: a */
    void mo8738a(@C12579k C15566a aVar);

    /* renamed from: b */
    boolean mo8739b(@C12580l Object obj, @C12580l Object obj2);
}
