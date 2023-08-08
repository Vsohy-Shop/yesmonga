package androidx.compose.material3;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1920:1\n76#2:1921\n102#2,2:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState\n*L\n307#1:1921\n307#1:1922,2\n*E\n"})
public final class DatePickerState {
    @C12579k

    /* renamed from: c */
    public static final Companion f19337c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f19338d = 0;
    @C12579k

    /* renamed from: a */
    public final StateData f19339a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f19340b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DatePickerState, ?> mo11437a() {
            return SaverKt.m31375a(DatePickerState$Companion$Saver$1.f19341f, DatePickerState$Companion$Saver$2.f19342f);
        }

        public Companion() {
        }
    }

    public /* synthetic */ DatePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* renamed from: a */
    public final int mo11432a() {
        return ((C8208h0) this.f19340b.getValue()).mo12624i();
    }

    @C12580l
    /* renamed from: b */
    public final Long mo11433b() {
        C8238l value = this.f19339a.mo11993g().getValue();
        if (value != null) {
            return Long.valueOf(value.mo12763X());
        }
        return null;
    }

    @C12579k
    /* renamed from: c */
    public final StateData mo11434c() {
        return this.f19339a;
    }

    /* renamed from: d */
    public final void mo11435d(int i) {
        this.f19340b.setValue(C8208h0.m27129c(i));
    }

    /* renamed from: e */
    public final void mo11436e(@C12580l Long l) {
        this.f19339a.mo12000n(l, (Long) null);
    }

    public /* synthetic */ DatePickerState(Long l, Long l2, C11466l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, lVar, i);
    }

    public DatePickerState(StateData stateData) {
        this.f19339a = stateData;
        this.f19340b = stateData.mo11989c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DatePickerState(Long l, Long l2, C11466l lVar, int i) {
        this(new StateData(l, (Long) null, l2, lVar, i, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(lVar, "yearRange");
    }
}
