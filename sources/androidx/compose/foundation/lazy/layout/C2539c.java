package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C2855v
/* renamed from: androidx.compose.foundation.lazy.layout.c */
public interface C2539c<T> {

    @C8567o(parameters = 1)
    @C11363r0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.c$a */
    public static final class C2540a<T> {

        /* renamed from: d */
        public static final int f6712d = 0;

        /* renamed from: a */
        public final int f6713a;

        /* renamed from: b */
        public final int f6714b;

        /* renamed from: c */
        public final T f6715c;

        public C2540a(int i, int i2, T t) {
            boolean z;
            this.f6713a = i;
            this.f6714b = i2;
            this.f6715c = t;
            boolean z2 = true;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!(i2 <= 0 ? false : z2)) {
                    throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
        }

        /* renamed from: a */
        public final int mo8729a() {
            return this.f6714b;
        }

        /* renamed from: b */
        public final int mo8730b() {
            return this.f6713a;
        }

        /* renamed from: c */
        public final T mo8731c() {
            return this.f6715c;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11390a(C2539c cVar, int i, int i2, C11300l lVar, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = cVar.getSize() - 1;
            }
            cVar.mo8726b(i, i2, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
    }

    /* renamed from: b */
    void mo8726b(int i, int i2, @C12579k C11300l<? super C2540a<? extends T>, C11079d2> lVar);

    @C12579k
    C2540a<T> get(int i);

    int getSize();
}
