package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import androidx.annotation.C0376v0;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.collections.C10955l0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.l */
public final class C17989l {

    /* renamed from: androidx.core.util.l$a */
    public static final class C17990a extends C10955l0 {

        /* renamed from: a */
        public int f46478a;

        /* renamed from: b */
        public final /* synthetic */ LongSparseArray<T> f46479b;

        public C17990a(LongSparseArray<T> longSparseArray) {
            this.f46479b = longSparseArray;
        }

        @SuppressLint({"ClassVerificationFailure"})
        /* renamed from: c */
        public long mo6234c() {
            LongSparseArray<T> longSparseArray = this.f46479b;
            int i = this.f46478a;
            this.f46478a = i + 1;
            return longSparseArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo52457d() {
            return this.f46478a;
        }

        /* renamed from: e */
        public final void mo52458e(int i) {
            this.f46478a = i;
        }

        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f46478a < this.f46479b.size();
        }
    }

    /* renamed from: androidx.core.util.l$b */
    public static final class C17991b implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f46480a;

        /* renamed from: b */
        public final /* synthetic */ LongSparseArray<T> f46481b;

        public C17991b(LongSparseArray<T> longSparseArray) {
            this.f46481b = longSparseArray;
        }

        /* renamed from: b */
        public final int mo52460b() {
            return this.f46480a;
        }

        /* renamed from: c */
        public final void mo52461c(int i) {
            this.f46480a = i;
        }

        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f46480a < this.f46481b.size();
        }

        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.f46481b;
            int i = this.f46480a;
            this.f46480a = i + 1;
            return longSparseArray.valueAt(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: a */
    public static final <T> boolean m81720a(@C12579k LongSparseArray<T> longSparseArray, long j) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: b */
    public static final <T> boolean m81721b(@C12579k LongSparseArray<T> longSparseArray, long j) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: c */
    public static final <T> boolean m81722c(@C12579k LongSparseArray<T> longSparseArray, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: d */
    public static final <T> void m81723d(@C12579k LongSparseArray<T> longSparseArray, @C12579k C11304p<? super Long, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: e */
    public static final <T> T m81724e(@C12579k LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: f */
    public static final <T> T m81725f(@C12579k LongSparseArray<T> longSparseArray, long j, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        T t = longSparseArray.get(j);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: g */
    public static final <T> int m81726g(@C12579k LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: h */
    public static final <T> boolean m81727h(@C12579k LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: i */
    public static final <T> boolean m81728i(@C12579k LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @C0376v0(16)
    @C12579k
    /* renamed from: j */
    public static final <T> C10955l0 m81729j(@C12579k LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new C17990a(longSparseArray);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    @C12579k
    /* renamed from: k */
    public static final <T> LongSparseArray<T> m81730k(@C12579k LongSparseArray<T> longSparseArray, @C12579k LongSparseArray<T> longSparseArray2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        m81731l(longSparseArray3, longSparseArray);
        m81731l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @C0376v0(16)
    /* renamed from: l */
    public static final <T> void m81731l(@C12579k LongSparseArray<T> longSparseArray, @C12579k LongSparseArray<T> longSparseArray2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: m */
    public static final <T> boolean m81732m(@C12579k LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !Intrinsics.areEqual((Object) t, (Object) longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(16)
    /* renamed from: n */
    public static final <T> void m81733n(@C12579k LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @C0376v0(16)
    @C12579k
    /* renamed from: o */
    public static final <T> Iterator<T> m81734o(@C12579k LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new C17991b(longSparseArray);
    }
}
