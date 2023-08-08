package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C2539c;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "IntervalContent", "Landroidx/compose/foundation/lazy/layout/c$a;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/layout/c$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1 extends Lambda implements C11300l<C2539c.C2540a<? extends LazyLayoutIntervalContent>, C11079d2> {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ HashMap<Object, Integer> $map;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
    }

    /* renamed from: a */
    public final void mo8671a(@C12579k C2539c.C2540a<? extends LazyLayoutIntervalContent> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (((LazyLayoutIntervalContent) aVar.mo8731c()).getKey() != null) {
            C11300l<Integer, Object> key = ((LazyLayoutIntervalContent) aVar.mo8731c()).getKey();
            if (key != null) {
                int max = Math.max(this.$first, aVar.mo8730b());
                int min = Math.min(this.$last, (aVar.mo8730b() + aVar.mo8729a()) - 1);
                if (max <= min) {
                    while (true) {
                        this.$map.put(key.invoke(Integer.valueOf(max - aVar.mo8730b())), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo8671a((C2539c.C2540a) obj);
        return C11079d2.f28267a;
    }
}
