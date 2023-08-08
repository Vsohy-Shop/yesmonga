package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $body;
    final /* synthetic */ C11305q<Integer, C8592o, Integer, C11079d2> $bottomSheet;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C11289a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$a */
    public /* synthetic */ class C2896a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.C2896a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(C11289a<Float> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, BottomSheetState bottomSheetState, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar, int i2, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar2) {
        super(2);
        this.$sheetOffset = aVar;
        this.$topBar = pVar;
        this.$floatingActionButton = pVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetPeekHeight = f;
        this.$snackbarHost = pVar3;
        this.$sheetState = bottomSheetState;
        this.$bottomSheet = qVar;
        this.$$dirty = i2;
        this.$body = qVar2;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo10050a(@C12579k C15562f1 f1Var, long j) {
        C15611w0 w0Var;
        int i;
        final C15611w0 w0Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C15562f1 f1Var2 = f1Var;
        Intrinsics.checkNotNullParameter(f1Var2, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        C15611w0 t0 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Sheet, C8553b.m31049c(-2120029209, true, new C2898xb0851876(this.$bottomSheet, o, this.$$dirty))).get(0).mo44324t0(e);
        int L0 = C11409d.m43851L0(this.$sheetOffset.invoke().floatValue());
        C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
        if (pVar != null) {
            w0Var = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.TopBar, C8553b.m31049c(1477114206, true, new C2899x64c48d6(pVar, this.$$dirty))).get(0).mo44324t0(e);
        } else {
            w0Var = null;
        }
        if (w0Var != null) {
            i = w0Var.mo44468G0();
        } else {
            i = 0;
        }
        final C15611w0 t02 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Body, C8553b.m31049c(2078633916, true, new C2897xcc9d0b25(this.$body, this.$sheetPeekHeight, this.$$dirty))).get(0).mo44324t0(C16476b.m74351e(e, 0, 0, 0, o - i, 7, (Object) null));
        C11304p<C8592o, Integer, C11079d2> pVar2 = this.$floatingActionButton;
        if (pVar2 != null) {
            w0Var2 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Fab, pVar2).get(0).mo44324t0(e);
        } else {
            w0Var2 = null;
        }
        if (w0Var2 != null) {
            i2 = w0Var2.mo44471K0();
        } else {
            i2 = 0;
        }
        if (w0Var2 != null) {
            i3 = w0Var2.mo44468G0();
        } else {
            i3 = 0;
        }
        if (C3050i0.m14312f(this.$floatingActionButtonPosition, C3050i0.f8146b.mo10792a())) {
            i4 = (p - i2) / 2;
        } else {
            i4 = (p - i2) - f1Var2.mo7429n2(BottomSheetScaffoldKt.f7545a);
        }
        final int i7 = i4;
        int i8 = i3 / 2;
        if (f1Var2.mo7425g5(this.$sheetPeekHeight) < ((float) i8)) {
            i5 = (L0 - i3) - f1Var2.mo7429n2(BottomSheetScaffoldKt.f7545a);
        } else {
            i5 = L0 - i8;
        }
        final int i9 = i5;
        final C15611w0 t03 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).mo44324t0(e);
        int K0 = (p - t03.mo44471K0()) / 2;
        int i10 = C2896a.$EnumSwitchMapping$0[this.$sheetState.mo10064e().ordinal()];
        if (i10 == 1) {
            i6 = i9 - t03.mo44468G0();
        } else if (i10 == 2) {
            i6 = o - t03.mo44468G0();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final int i11 = i;
        final C15611w0 w0Var3 = w0Var;
        final C15611w0 w0Var4 = t0;
        final int i12 = L0;
        final int i13 = K0;
        final int i14 = i6;
        return C15568h0.m69206r2(f1Var, p, o, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo10051a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                C15611w0.C15612a.m69414v(aVar, t02, 0, i11, 0.0f, 4, (Object) null);
                C15611w0 w0Var = w0Var3;
                if (w0Var != null) {
                    C15611w0.C15612a.m69414v(aVar, w0Var, 0, 0, 0.0f, 4, (Object) null);
                }
                C15611w0.C15612a.m69414v(aVar, w0Var4, 0, i12, 0.0f, 4, (Object) null);
                C15611w0 w0Var2 = w0Var2;
                if (w0Var2 != null) {
                    C15611w0.C15612a.m69414v(aVar, w0Var2, i7, i9, 0.0f, 4, (Object) null);
                }
                C15611w0.C15612a.m69414v(aVar, t03, i13, i14, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo10051a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10050a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
