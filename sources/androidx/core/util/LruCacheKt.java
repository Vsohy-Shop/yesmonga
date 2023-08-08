package androidx.core.util;

import android.util.LruCache;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LruCacheKt {

    /* renamed from: androidx.core.util.LruCacheKt$a */
    public static final class C17960a extends LruCache<K, V> {

        /* renamed from: a */
        public final /* synthetic */ C11304p<K, V, Integer> f46442a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<K, V> f46443b;

        /* renamed from: c */
        public final /* synthetic */ C11306r<Boolean, K, V, V, C11079d2> f46444c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17960a(int i, C11304p<? super K, ? super V, Integer> pVar, C11300l<? super K, ? extends V> lVar, C11306r<? super Boolean, ? super K, ? super V, ? super V, C11079d2> rVar) {
            super(i);
            this.f46442a = pVar;
            this.f46443b = lVar;
            this.f46444c = rVar;
        }

        @C12580l
        public V create(@C12579k K k) {
            Intrinsics.checkNotNullParameter(k, "key");
            return this.f46443b.invoke(k);
        }

        public void entryRemoved(boolean z, @C12579k K k, @C12579k V v, @C12580l V v2) {
            Intrinsics.checkNotNullParameter(k, "key");
            Intrinsics.checkNotNullParameter(v, "oldValue");
            this.f46444c.invoke(Boolean.valueOf(z), k, v, v2);
        }

        public int sizeOf(@C12579k K k, @C12579k V v) {
            Intrinsics.checkNotNullParameter(k, "key");
            Intrinsics.checkNotNullParameter(v, "value");
            return this.f46442a.invoke(k, v).intValue();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <K, V> LruCache<K, V> m81587a(int i, @C12579k C11304p<? super K, ? super V, Integer> pVar, @C12579k C11300l<? super K, ? extends V> lVar, @C12579k C11306r<? super Boolean, ? super K, ? super V, ? super V, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(pVar, "sizeOf");
        Intrinsics.checkNotNullParameter(lVar, "create");
        Intrinsics.checkNotNullParameter(rVar, "onEntryRemoved");
        return new C17960a(i, pVar, lVar, rVar);
    }

    /* renamed from: b */
    public static /* synthetic */ LruCache m81588b(int i, C11304p pVar, C11300l lVar, C11306r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.f46445f;
        }
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.f46446f;
        }
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.f46447f;
        }
        Intrinsics.checkNotNullParameter(pVar, "sizeOf");
        Intrinsics.checkNotNullParameter(lVar, "create");
        Intrinsics.checkNotNullParameter(rVar, "onEntryRemoved");
        return new C17960a(i, pVar, lVar, rVar);
    }
}
