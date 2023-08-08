package androidx.collection;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LruCacheKt {

    /* renamed from: androidx.collection.LruCacheKt$a */
    public static final class C1865a extends C1879j<K, V> {

        /* renamed from: i */
        public final /* synthetic */ C11304p f5088i;

        /* renamed from: j */
        public final /* synthetic */ C11300l f5089j;

        /* renamed from: k */
        public final /* synthetic */ C11306r f5090k;

        /* renamed from: l */
        public final /* synthetic */ int f5091l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1865a(C11304p pVar, C11300l lVar, C11306r rVar, int i, int i2) {
            super(i2);
            this.f5088i = pVar;
            this.f5089j = lVar;
            this.f5090k = rVar;
            this.f5091l = i;
        }

        @C12580l
        /* renamed from: a */
        public V mo6133a(@C12579k K k) {
            return this.f5089j.invoke(k);
        }

        /* renamed from: c */
        public void mo6134c(boolean z, @C12579k K k, @C12579k V v, @C12580l V v2) {
            this.f5090k.invoke(Boolean.valueOf(z), k, v, v2);
        }

        /* renamed from: p */
        public int mo6135p(@C12579k K k, @C12579k V v) {
            return ((Number) this.f5088i.invoke(k, v)).intValue();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <K, V> C1879j<K, V> m7424a(int i, @C12579k C11304p<? super K, ? super V, Integer> pVar, @C12579k C11300l<? super K, ? extends V> lVar, @C12579k C11306r<? super Boolean, ? super K, ? super V, ? super V, C11079d2> rVar) {
        return new C1865a(pVar, lVar, rVar, i, i);
    }

    @C12579k
    /* renamed from: b */
    public static /* synthetic */ C1879j m7425b(int i, C11304p pVar, C11300l lVar, C11306r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.f5092f;
        }
        C11304p pVar2 = pVar;
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.f5093f;
        }
        C11300l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.f5094f;
        }
        return new C1865a(pVar2, lVar2, rVar, i, i);
    }
}
