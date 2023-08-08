package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "value", "Landroidx/compose/material3/DatePickerState;", "a", "(Ljava/lang/Object;)Landroidx/compose/material3/DatePickerState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState$Companion$Saver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1920:1\n1#2:1921\n*E\n"})
public final class DatePickerState$Companion$Saver$2 extends Lambda implements C11300l<Object, DatePickerState> {

    /* renamed from: f */
    public static final DatePickerState$Companion$Saver$2 f19342f = new DatePickerState$Companion$Saver$2();

    public DatePickerState$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final DatePickerState invoke(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        StateData b = StateData.f19732g.mo12002a().mo16407b(obj);
        Intrinsics.checkNotNull(b);
        return new DatePickerState(b, (DefaultConstructorMarker) null);
    }
}
