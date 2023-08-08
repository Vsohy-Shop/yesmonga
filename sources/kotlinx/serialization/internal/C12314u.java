package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.u */
public final class C12314u {
    @C12579k

    /* renamed from: e */
    public static final C12315a f30124e = new C12315a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: f */
    public static final long[] f30125f = new long[0];
    @C12579k

    /* renamed from: a */
    public final C12217f f30126a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C12217f, Integer, Boolean> f30127b;

    /* renamed from: c */
    public long f30128c;
    @C12579k

    /* renamed from: d */
    public final long[] f30129d;

    /* renamed from: kotlinx.serialization.internal.u$a */
    public static final class C12315a {
        public /* synthetic */ C12315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12315a() {
        }
    }

    public C12314u(@C12579k C12217f fVar, @C12579k C11304p<? super C12217f, ? super Integer, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "readIfAbsent");
        this.f30126a = fVar;
        this.f30127b = pVar;
        int d = fVar.mo24823d();
        long j = 0;
        if (d <= 64) {
            this.f30128c = d != 64 ? -1 << d : j;
            this.f30129d = f30125f;
            return;
        }
        this.f30128c = 0;
        this.f30129d = mo25184e(d);
    }

    /* renamed from: a */
    public final void mo25180a(int i) {
        if (i < 64) {
            this.f30128c |= 1 << i;
        } else {
            mo25181b(i);
        }
    }

    /* renamed from: b */
    public final void mo25181b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f30129d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    public final int mo25182c() {
        int length = this.f30129d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f30129d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.f30127b.invoke(this.f30126a, Integer.valueOf(i4)).booleanValue()) {
                    this.f30129d[i] = j;
                    return i4;
                }
            }
            this.f30129d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo25183d() {
        int numberOfTrailingZeros;
        int d = this.f30126a.mo24823d();
        do {
            long j = this.f30128c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f30128c |= 1 << numberOfTrailingZeros;
            } else if (d > 64) {
                return mo25182c();
            } else {
                return -1;
            }
        } while (!this.f30127b.invoke(this.f30126a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }

    /* renamed from: e */
    public final long[] mo25184e(int i) {
        long[] jArr = new long[((i - 1) >>> 6)];
        if ((i & 63) != 0) {
            jArr[ArraysKt___ArraysKt.m39491We(jArr)] = -1 << i;
        }
        return jArr;
    }
}
