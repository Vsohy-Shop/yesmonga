package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Month$rangeSelectionInfo$1$1 extends Lambda implements C11289a<C8235k2> {
    final /* synthetic */ C8266q $month;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$rangeSelectionInfo$1$1(boolean z, C8266q qVar, StateData stateData) {
        super(0);
        this.$rangeSelectionEnabled = z;
        this.$month = qVar;
        this.$stateData = stateData;
    }

    @C12580l
    /* renamed from: a */
    public final C8235k2 invoke() {
        if (this.$rangeSelectionEnabled) {
            return C8235k2.f20276d.mo12759a(this.$month, this.$stateData.mo11993g().getValue(), this.$stateData.mo11992f().getValue());
        }
        return null;
    }
}
