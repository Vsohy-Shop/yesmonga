package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16500q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Landroidx/compose/ui/unit/q;", "layoutSize", "Lkotlin/d2;", "a", "(J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,692:1\n1855#2,2:693\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n*L\n118#1:693,2\n*E\n"})
public final class SwipeableV2Kt$swipeAnchors$2 extends Lambda implements C11300l<C16500q, C11079d2> {
    final /* synthetic */ C8179c<T> $anchorChangeHandler;
    final /* synthetic */ C11304p<T, C16500q, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleValues;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$2(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, C8179c<T> cVar, C11304p<? super T, ? super C16500q, Float> pVar) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleValues = set;
        this.$anchorChangeHandler = cVar;
        this.$calculateAnchor = pVar;
    }

    /* renamed from: a */
    public final void mo12086a(long j) {
        C8179c<T> cVar;
        Map<T, Float> m = this.$state.mo12109m();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C11304p<T, C16500q, Float> pVar = this.$calculateAnchor;
        for (Object next : this.$possibleValues) {
            Float invoke = pVar.invoke(next, C16500q.m74651b(j));
            if (invoke != null) {
                linkedHashMap.put(next, invoke);
            }
        }
        if (!Intrinsics.areEqual((Object) m, (Object) linkedHashMap)) {
            T z = this.$state.mo12122z();
            if (this.$state.mo12105R(linkedHashMap) && (cVar = this.$anchorChangeHandler) != null) {
                cVar.mo11180a(z, m, linkedHashMap);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12086a(((C16500q) obj).mo47895q());
        return C11079d2.f28267a;
    }
}
