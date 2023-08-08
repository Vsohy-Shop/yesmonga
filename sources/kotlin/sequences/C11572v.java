package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.v */
public final class C11572v<T, R> implements C11559m<R> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28764a;
    @C12579k

    /* renamed from: b */
    public final C11304p<Integer, T, R> f28765b;

    /* renamed from: kotlin.sequences.v$a */
    public static final class C11573a implements Iterator<R>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28766a;

        /* renamed from: b */
        public int f28767b;

        /* renamed from: c */
        public final /* synthetic */ C11572v<T, R> f28768c;

        public C11573a(C11572v<T, R> vVar) {
            this.f28768c = vVar;
            this.f28766a = vVar.f28764a.iterator();
        }

        /* renamed from: b */
        public final int mo23284b() {
            return this.f28767b;
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23285c() {
            return this.f28766a;
        }

        /* renamed from: d */
        public final void mo23286d(int i) {
            this.f28767b = i;
        }

        public boolean hasNext() {
            return this.f28766a.hasNext();
        }

        public R next() {
            C11304p d = this.f28768c.f28765b;
            int i = this.f28767b;
            this.f28767b = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            return d.invoke(Integer.valueOf(i), this.f28766a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11572v(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(pVar, "transformer");
        this.f28764a = mVar;
        this.f28765b = pVar;
    }

    @C12579k
    public Iterator<R> iterator() {
        return new C11573a(this);
    }
}
