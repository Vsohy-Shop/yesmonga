package androidx.compose.material3;

import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material3/DatePickerState;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material3/DatePickerState;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState$Companion$Saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1920:1\n1#2:1921\n*E\n"})
public final class DatePickerState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, DatePickerState, Object> {

    /* renamed from: f */
    public static final DatePickerState$Companion$Saver$1 f19341f = new DatePickerState$Companion$Saver$1();

    public DatePickerState$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, @C12579k DatePickerState datePickerState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(datePickerState, "it");
        return StateData.f19732g.mo12002a().mo16406a(fVar, datePickerState.mo11434c());
    }
}
