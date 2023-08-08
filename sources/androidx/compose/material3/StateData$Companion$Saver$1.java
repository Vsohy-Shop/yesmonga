package androidx.compose.material3;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material3/StateData;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material3/StateData;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StateData$Companion$Saver$1 extends Lambda implements C11304p<C8629f, StateData, List<? extends Object>> {

    /* renamed from: f */
    public static final StateData$Companion$Saver$1 f19739f = new StateData$Companion$Saver$1();

    public StateData$Companion$Saver$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final List<Object> invoke(@C12579k C8629f fVar, @C12579k StateData stateData) {
        Long l;
        Intrinsics.checkNotNullParameter(fVar, "$this$listSaver");
        Intrinsics.checkNotNullParameter(stateData, "it");
        Object[] objArr = new Object[6];
        C8238l value = stateData.mo11993g().getValue();
        Long l2 = null;
        if (value != null) {
            l = Long.valueOf(value.mo12763X());
        } else {
            l = null;
        }
        objArr[0] = l;
        C8238l value2 = stateData.mo11992f().getValue();
        if (value2 != null) {
            l2 = Long.valueOf(value2.mo12763X());
        }
        objArr[1] = l2;
        objArr[2] = Long.valueOf(stateData.mo11990d().mo12921n());
        objArr[3] = Integer.valueOf(stateData.mo11995i().mo23049r());
        objArr[4] = Integer.valueOf(stateData.mo11995i().mo23051w());
        objArr[5] = Integer.valueOf(stateData.mo11989c().getValue().mo12624i());
        return CollectionsKt__CollectionsKt.m40448L(objArr);
    }
}
