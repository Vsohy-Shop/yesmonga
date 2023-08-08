package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"", "startIndex", "endIndex", "", "Landroidx/room/AmbiguousColumnResolver$b;", "resultColumnsSublist", "Lkotlin/d2;", "a", "(IILjava/util/List;)V"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class AmbiguousColumnResolver$resolve$1$1 extends Lambda implements C11305q<Integer, Integer, List<? extends AmbiguousColumnResolver.C20233b>, C11079d2> {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.C20232a>> $mappingMatches;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<AmbiguousColumnResolver.C20232a>> list, int i) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    /* renamed from: a */
    public final void mo60744a(int i, int i2, @C12579k List<AmbiguousColumnResolver.C20233b> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "resultColumnsSublist");
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            String str = strArr[i3];
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) str, (Object) ((AmbiguousColumnResolver.C20233b) obj).mo60729a())) {
                    break;
                }
            }
            AmbiguousColumnResolver.C20233b bVar = (AmbiguousColumnResolver.C20233b) obj;
            if (bVar != null) {
                arrayList.add(Integer.valueOf(bVar.mo60732e()));
                i3++;
            } else {
                return;
            }
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.C20232a(new C11466l(i, i2 - 1), arrayList));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo60744a(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3);
        return C11079d2.f28267a;
    }
}
