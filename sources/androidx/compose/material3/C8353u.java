package androidx.compose.material3;

import androidx.compose.animation.C2040p;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material3.u */
public final class C8353u {

    /* renamed from: l */
    public static final int f22418l = 0;

    /* renamed from: a */
    public final long f22419a;

    /* renamed from: b */
    public final long f22420b;

    /* renamed from: c */
    public final long f22421c;

    /* renamed from: d */
    public final long f22422d;

    /* renamed from: e */
    public final long f22423e;

    /* renamed from: f */
    public final long f22424f;

    /* renamed from: g */
    public final long f22425g;

    /* renamed from: h */
    public final long f22426h;

    /* renamed from: i */
    public final long f22427i;

    /* renamed from: j */
    public final long f22428j;

    /* renamed from: k */
    public final long f22429k;

    /* renamed from: androidx.compose.material3.u$a */
    public /* synthetic */ class C8354a {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C8353u.C8354a.<clinit>():void");
        }
    }

    public /* synthetic */ C8353u(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo14714a(boolean z, @C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(1009643462);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:448)");
        }
        if (z) {
            int i3 = C8354a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.f22426h;
            } else if (i3 == 3) {
                j = this.f22427i;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = C8354a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    j = this.f22429k;
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.f22428j;
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(1209369567);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            k2Var = C2040p.m8743c(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 0, 12);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(1209369753);
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
    /* renamed from: b */
    public final C8578k2<C15240j2> mo14715b(boolean z, @C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(360729865);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:417)");
        }
        if (z) {
            int i3 = C8354a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.f22421c;
            } else if (i3 == 3) {
                j = this.f22422d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = C8354a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 == 1) {
                j = this.f22423e;
            } else if (i4 == 2) {
                j = this.f22425g;
            } else if (i4 == 3) {
                j = this.f22424f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(1143718427);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            k2Var = C2040p.m8743c(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 0, 12);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(1143718613);
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
    public final C8578k2<C15240j2> mo14716c(@C12579k ToggleableState toggleableState, @C12580l C8592o oVar, int i) {
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        oVar.mo14918M(-507585681);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:398)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        if (toggleableState == toggleableState2) {
            j = this.f22420b;
        } else {
            j = this.f22419a;
        }
        long j2 = j;
        if (toggleableState == toggleableState2) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        C8578k2<C15240j2> c = C2040p.m8743c(j2, C1972h.m8392q(i2, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 0, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8353u)) {
            return false;
        }
        C8353u uVar = (C8353u) obj;
        if (C15240j2.m66082y(this.f22419a, uVar.f22419a) && C15240j2.m66082y(this.f22420b, uVar.f22420b) && C15240j2.m66082y(this.f22421c, uVar.f22421c) && C15240j2.m66082y(this.f22422d, uVar.f22422d) && C15240j2.m66082y(this.f22423e, uVar.f22423e) && C15240j2.m66082y(this.f22424f, uVar.f22424f) && C15240j2.m66082y(this.f22425g, uVar.f22425g) && C15240j2.m66082y(this.f22426h, uVar.f22426h) && C15240j2.m66082y(this.f22427i, uVar.f22427i) && C15240j2.m66082y(this.f22428j, uVar.f22428j) && C15240j2.m66082y(this.f22429k, uVar.f22429k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((C15240j2.m66056K(this.f22419a) * 31) + C15240j2.m66056K(this.f22420b)) * 31) + C15240j2.m66056K(this.f22421c)) * 31) + C15240j2.m66056K(this.f22422d)) * 31) + C15240j2.m66056K(this.f22423e)) * 31) + C15240j2.m66056K(this.f22424f)) * 31) + C15240j2.m66056K(this.f22425g)) * 31) + C15240j2.m66056K(this.f22426h)) * 31) + C15240j2.m66056K(this.f22427i)) * 31) + C15240j2.m66056K(this.f22428j)) * 31) + C15240j2.m66056K(this.f22429k);
    }

    public C8353u(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f22419a = j;
        this.f22420b = j2;
        this.f22421c = j3;
        this.f22422d = j4;
        this.f22423e = j5;
        this.f22424f = j6;
        this.f22425g = j7;
        this.f22426h = j8;
        this.f22427i = j9;
        this.f22428j = j10;
        this.f22429k = j11;
    }
}
