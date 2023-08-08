package androidx.compose.material3;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material3/TimePickerState;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material3/TimePickerState;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TimePickerState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, TimePickerState, List<? extends Object>> {

    /* renamed from: f */
    public static final TimePickerState$Companion$Saver$1 f19928f = new TimePickerState$Companion$Saver$1();

    public TimePickerState$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final List<Object> invoke(@C12579k C8629f fVar, @C12579k TimePickerState timePickerState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(timePickerState, "it");
        return CollectionsKt__CollectionsKt.m40448L(Integer.valueOf(timePickerState.mo12346g()), Integer.valueOf(timePickerState.mo12349j()), Boolean.valueOf(timePickerState.mo12355p()));
    }
}
