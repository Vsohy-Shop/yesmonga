package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
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
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$a */
    public /* synthetic */ class C7959a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.C7959a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(C11289a<Float> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, SheetState sheetState, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar, int i, C8767m mVar, long j, long j2, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar2, float f) {
        super(2);
        this.$sheetOffset = aVar;
        this.$topBar = pVar;
        this.$snackbarHost = pVar2;
        this.$sheetState = sheetState;
        this.$bottomSheet = qVar;
        this.$$dirty = i;
        this.$modifier = mVar;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$body = qVar2;
        this.$sheetPeekHeight = f;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo11186a(@C12579k C15562f1 f1Var, long j) {
        C15611w0 w0Var;
        int i;
        final int i2;
        C15562f1 f1Var2 = f1Var;
        Intrinsics.checkNotNullParameter(f1Var2, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        C15611w0 t0 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Sheet, C8553b.m31049c(-1192048628, true, new C7962xb0851876(this.$bottomSheet, o, this.$$dirty))).get(0).mo44324t0(e);
        int L0 = C11409d.m43851L0(this.$sheetOffset.invoke().floatValue());
        int max = Integer.max(0, (p - t0.mo44471K0()) / 2);
        C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
        if (pVar != null) {
            w0Var = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.TopBar, C8553b.m31049c(-873203005, true, new C7963x64c48d6(pVar, this.$$dirty))).get(0).mo44324t0(e);
        } else {
            w0Var = null;
        }
        C15611w0 w0Var2 = w0Var;
        if (w0Var2 != null) {
            i = w0Var2.mo44468G0();
        } else {
            i = 0;
        }
        int i3 = L0;
        C15611w0 w0Var3 = t0;
        final C15611w0 t02 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Body, C8553b.m31049c(-1459220575, true, new C7960xcc9d0b25(this.$modifier, this.$containerColor, this.$contentColor, this.$$dirty, this.$body, this.$sheetPeekHeight))).get(0).mo44324t0(C16476b.m74351e(e, 0, 0, 0, o - i, 7, (Object) null));
        final C15611w0 t03 = f1Var2.mo44296k0(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).mo44324t0(e);
        int K0 = (p - t03.mo44471K0()) / 2;
        int i4 = C7959a.$EnumSwitchMapping$0[this.$sheetState.mo11856d().ordinal()];
        if (i4 == 1) {
            i2 = i3 - t03.mo44468G0();
        } else if (i4 == 2 || i4 == 3) {
            i2 = o - t03.mo44468G0();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final int i5 = i;
        final C15611w0 w0Var4 = w0Var2;
        final C15611w0 w0Var5 = w0Var3;
        final int i6 = max;
        final int i7 = i3;
        final int i8 = K0;
        return C15568h0.m69206r2(f1Var, p, o, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo11187a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                C15611w0.C15612a.m69414v(aVar, t02, 0, i5, 0.0f, 4, (Object) null);
                C15611w0 w0Var = w0Var4;
                if (w0Var != null) {
                    C15611w0.C15612a.m69414v(aVar, w0Var, 0, 0, 0.0f, 4, (Object) null);
                }
                C15611w0.C15612a aVar2 = aVar;
                C15611w0.C15612a.m69414v(aVar2, w0Var5, i6, i7, 0.0f, 4, (Object) null);
                C15611w0.C15612a.m69414v(aVar2, t03, i8, i2, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11187a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11186a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
