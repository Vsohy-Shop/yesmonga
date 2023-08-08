package androidx.compose.material;

import androidx.compose.animation.C2040p;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.material.t */
public final class C7931t implements C7880m {

    /* renamed from: a */
    public final long f19064a;

    /* renamed from: b */
    public final long f19065b;

    /* renamed from: c */
    public final long f19066c;

    /* renamed from: d */
    public final long f19067d;

    /* renamed from: e */
    public final long f19068e;

    /* renamed from: f */
    public final long f19069f;

    /* renamed from: g */
    public final long f19070g;

    /* renamed from: h */
    public final long f19071h;

    /* renamed from: i */
    public final long f19072i;

    /* renamed from: j */
    public final long f19073j;

    /* renamed from: k */
    public final long f19074k;

    /* renamed from: androidx.compose.material.t$a */
    public /* synthetic */ class C7932a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p004ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C7931t.C7932a.<clinit>():void");
        }
    }

    public /* synthetic */ C7931t(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo10877a(@C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(544656267);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        if (toggleableState == toggleableState2) {
            j = this.f19065b;
        } else {
            j = this.f19064a;
        }
        long j2 = j;
        if (toggleableState == toggleableState2) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        C8578k2<C15240j2> b = C2040p.m8742b(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (C11300l) null, oVar, 0, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public C8578k2<C15240j2> mo10878b(boolean z, @C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(-1568341342);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z) {
            int i3 = C7932a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.f19071h;
            } else if (i3 == 3) {
                j = this.f19072i;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = C7932a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    j = this.f19074k;
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.f19073j;
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(-796405227);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            k2Var = C2040p.m8742b(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (C11300l) null, oVar, 0, 4);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(-796405041);
            k2Var = C8415c2.m30251t(C15240j2.m66071n(j2), oVar, 0);
            oVar.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k2Var;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public C8578k2<C15240j2> mo10879c(boolean z, @C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(840901029);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z) {
            int i3 = C7932a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.f19066c;
            } else if (i3 == 3) {
                j = this.f19067d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = C7932a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 == 1) {
                j = this.f19068e;
            } else if (i4 == 2) {
                j = this.f19070g;
            } else if (i4 == 3) {
                j = this.f19069f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(-2010643468);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            k2Var = C2040p.m8742b(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (C11300l) null, oVar, 0, 4);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(-2010643282);
            k2Var = C8415c2.m30251t(C15240j2.m66071n(j2), oVar, 0);
            oVar.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k2Var;
    }

    public C7931t(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f19064a = j;
        this.f19065b = j2;
        this.f19066c = j3;
        this.f19067d = j4;
        this.f19068e = j5;
        this.f19069f = j6;
        this.f19070g = j7;
        this.f19071h = j8;
        this.f19072i = j9;
        this.f19073j = j10;
        this.f19074k = j11;
    }
}
