package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11563q;
import org.jetbrains.annotations.C12579k;

public final class SlidingWindowKt {

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    /* renamed from: kotlin.collections.SlidingWindowKt$a */
    public static final class C10898a implements C11559m<List<? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ C11559m f28119a;

        /* renamed from: b */
        public final /* synthetic */ int f28120b;

        /* renamed from: c */
        public final /* synthetic */ int f28121c;

        /* renamed from: d */
        public final /* synthetic */ boolean f28122d;

        /* renamed from: e */
        public final /* synthetic */ boolean f28123e;

        public C10898a(C11559m mVar, int i, int i2, boolean z, boolean z2) {
            this.f28119a = mVar;
            this.f28120b = i;
            this.f28121c = i2;
            this.f28122d = z;
            this.f28123e = z2;
        }

        @C12579k
        public Iterator<List<? extends T>> iterator() {
            return SlidingWindowKt.m40749b(this.f28119a.iterator(), this.f28120b, this.f28121c, this.f28122d, this.f28123e);
        }
    }

    /* renamed from: a */
    public static final void m40748a(int i, int i2) {
        boolean z;
        String str;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @C12579k
    /* renamed from: b */
    public static final <T> Iterator<List<T>> m40749b(@C12579k Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(it, "iterator");
        if (!it.hasNext()) {
            return C10909b0.f28145a;
        }
        return C11563q.m44901a(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, (C11045c<? super SlidingWindowKt$windowedIterator$1>) null));
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C11559m<List<T>> m40750c(@C12579k C11559m<? extends T> mVar, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        m40748a(i, i2);
        return new C10898a(mVar, i, i2, z, z2);
    }
}
