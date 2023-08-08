package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
public final class LazyLayoutItemContentFactory {
    @C12579k

    /* renamed from: a */
    public final C8623b f6692a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C2549h> f6693b;
    @C12579k

    /* renamed from: c */
    public final Map<Object, CachedItemContent> f6694c = new LinkedHashMap();

    @C11363r0({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n76#2:113\n102#2,2:114\n1#3:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n*L\n83#1:113\n83#1:114,2\n*E\n"})
    public final class CachedItemContent {
        @C12579k

        /* renamed from: a */
        public final Object f6695a;
        @C12580l

        /* renamed from: b */
        public final Object f6696b;
        @C12579k

        /* renamed from: c */
        public final C8700z0 f6697c;
        @C12580l

        /* renamed from: d */
        public C11304p<? super C8592o, ? super Integer, C11079d2> f6698d;

        /* renamed from: e */
        public final /* synthetic */ LazyLayoutItemContentFactory f6699e;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @C12579k int i, @C12580l Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "key");
            this.f6699e = lazyLayoutItemContentFactory;
            this.f6695a = obj;
            this.f6696b = obj2;
            this.f6697c = C8539f2.m30981g(Integer.valueOf(i), (C8410b2) null, 2, (Object) null);
        }

        /* renamed from: c */
        public final C11304p<C8592o, Integer, C11079d2> mo8681c() {
            return C8553b.m31049c(1403994769, true, new C2522xbaaa624f(this.f6699e, this));
        }

        @C12579k
        /* renamed from: d */
        public final C11304p<C8592o, Integer, C11079d2> mo8682d() {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar = this.f6698d;
            if (pVar != null) {
                return pVar;
            }
            C11304p<C8592o, Integer, C11079d2> c = mo8681c();
            this.f6698d = c;
            return c;
        }

        @C12579k
        /* renamed from: e */
        public final Object mo8683e() {
            return this.f6695a;
        }

        /* renamed from: f */
        public final int mo8684f() {
            return ((Number) this.f6697c.getValue()).intValue();
        }

        @C12580l
        /* renamed from: g */
        public final Object mo8685g() {
            return this.f6696b;
        }

        /* renamed from: h */
        public final void mo8686h(int i) {
            this.f6697c.setValue(Integer.valueOf(i));
        }
    }

    public LazyLayoutItemContentFactory(@C12579k C8623b bVar, @C12579k C11289a<? extends C2549h> aVar) {
        Intrinsics.checkNotNullParameter(bVar, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(aVar, "itemProvider");
        this.f6692a = bVar;
        this.f6693b = aVar;
    }

    @C12579k
    /* renamed from: b */
    public final C11304p<C8592o, Integer, C11079d2> mo8678b(int i, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "key");
        CachedItemContent cachedItemContent = this.f6694c.get(obj);
        Object b = this.f6693b.invoke().mo8289b(i);
        if (cachedItemContent != null && cachedItemContent.mo8684f() == i && Intrinsics.areEqual(cachedItemContent.mo8685g(), b)) {
            return cachedItemContent.mo8682d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i, obj, b);
        this.f6694c.put(obj, cachedItemContent2);
        return cachedItemContent2.mo8682d();
    }

    @C12580l
    /* renamed from: c */
    public final Object mo8679c(@C12580l Object obj) {
        CachedItemContent cachedItemContent = this.f6694c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.mo8685g();
        }
        C2549h invoke = this.f6693b.invoke();
        Integer num = invoke.mo8292f().get(obj);
        if (num != null) {
            return invoke.mo8289b(num.intValue());
        }
        return null;
    }

    @C12579k
    /* renamed from: d */
    public final C11289a<C2549h> mo8680d() {
        return this.f6693b;
    }
}
