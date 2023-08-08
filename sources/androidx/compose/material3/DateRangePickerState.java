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
@C11363r0({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,809:1\n76#2:810\n102#2,2:811\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n*L\n274#1:810\n274#1:811,2\n*E\n"})
public final class DateRangePickerState {
    @C12579k

    /* renamed from: c */
    public static final Companion f19358c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f19359d = 0;
    @C12579k

    /* renamed from: a */
    public final StateData f19360a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f19361b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DateRangePickerState, ?> mo11490a() {
            return SaverKt.m31375a(DateRangePickerState$Companion$Saver$1.f19362f, DateRangePickerState$Companion$Saver$2.f19363f);
        }

        public Companion() {
        }
    }

    public /* synthetic */ DateRangePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* renamed from: a */
    public final int mo11484a() {
        return ((C8208h0) this.f19361b.getValue()).mo12624i();
    }

    @C12580l
    /* renamed from: b */
    public final Long mo11485b() {
        C8238l value = this.f19360a.mo11992f().getValue();
        if (value != null) {
            return Long.valueOf(value.mo12763X());
        }
        return null;
    }

    @C12580l
    /* renamed from: c */
    public final Long mo11486c() {
        C8238l value = this.f19360a.mo11993g().getValue();
        if (value != null) {
            return Long.valueOf(value.mo12763X());
        }
        return null;
    }

    @C12579k
    /* renamed from: d */
    public final StateData mo11487d() {
        return this.f19360a;
    }

    /* renamed from: e */
    public final void mo11488e(int i) {
        this.f19361b.setValue(C8208h0.m27129c(i));
    }

    /* renamed from: f */
    public final void mo11489f(@C12580l Long l, @C12580l Long l2) {
        this.f19360a.mo12000n(l, l2);
    }

    public /* synthetic */ DateRangePickerState(Long l, Long l2, Long l3, C11466l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, lVar, i);
    }

    public DateRangePickerState(StateData stateData) {
        this.f19360a = stateData;
        this.f19361b = stateData.mo11989c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DateRangePickerState(Long l, Long l2, Long l3, C11466l lVar, int i) {
        this(new StateData(l, l2, l3, lVar, i, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(lVar, "yearRange");
    }
}
