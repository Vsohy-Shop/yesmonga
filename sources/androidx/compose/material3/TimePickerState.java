package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p004ui.unit.C16486i;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1673:1\n1#2:1674\n76#3:1675\n76#3:1676\n102#3,2:1677\n76#3:1679\n102#3,2:1680\n76#3:1682\n102#3,2:1683\n76#3:1685\n102#3,2:1686\n76#3:1688\n102#3,2:1689\n76#3:1691\n102#3,2:1692\n76#3:1694\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n507#1:1675\n523#1:1676\n523#1:1677,2\n526#1:1679\n526#1:1680,2\n527#1:1682\n527#1:1683,2\n528#1:1685\n528#1:1686,2\n530#1:1688\n530#1:1689,2\n531#1:1691\n531#1:1692,2\n534#1:1694\n*E\n"})
public final class TimePickerState {
    @C12579k

    /* renamed from: l */
    public static final Companion f19915l = new Companion((DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final int f19916m = 0;

    /* renamed from: a */
    public final boolean f19917a;
    @C12579k

    /* renamed from: b */
    public final C8578k2 f19918b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f19919c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f19920d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f19921e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f19922f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f19923g;
    @C12579k

    /* renamed from: h */
    public final C8700z0 f19924h;
    @C12579k

    /* renamed from: i */
    public final MutatorMutex f19925i;
    @C12579k

    /* renamed from: j */
    public final C8578k2 f19926j;
    @C12579k

    /* renamed from: k */
    public final Animatable<Float, C1983k> f19927k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<TimePickerState, ?> mo12366a() {
            return SaverKt.m31375a(TimePickerState$Companion$Saver$1.f19928f, TimePickerState$Companion$Saver$2.f19929f);
        }

        public Companion() {
        }
    }

    public TimePickerState(int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i < 0 || i >= 24) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i < 0 || i >= 60) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                this.f19917a = z;
                this.f19918b = C8415c2.m30234c(C8415c2.m30254w(), new TimePickerState$selectorPos$2(this, z));
                this.f19919c = C8539f2.m30981g(C16494m.m74570b(C16494m.f40890b.mo47857a()), (C8410b2) null, 2, (Object) null);
                this.f19920d = C8539f2.m30981g(C8241l2.m27281c(C8241l2.f20286b.mo12784a()), (C8410b2) null, 2, (Object) null);
                if (i <= 12 || z) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.f19921e = C8539f2.m30981g(Boolean.valueOf(z4), (C8410b2) null, 2, (Object) null);
                this.f19922f = C8539f2.m30981g(Boolean.valueOf(i < 12 ? false : z5), (C8410b2) null, 2, (Object) null);
                this.f19923g = C8539f2.m30981g(Float.valueOf(((((float) i) * 0.5235988f) % ((float) 12)) - 1.5707964f), (C8410b2) null, 2, (Object) null);
                this.f19924h = C8539f2.m30981g(Float.valueOf((((float) i2) * 0.10471976f) - 1.5707964f), (C8410b2) null, 2, (Object) null);
                this.f19925i = new MutatorMutex();
                this.f19926j = C8415c2.m30235d(new TimePickerState$isAfternoon$2(this));
                this.f19927k = C1946b.m8288b(mo12347h(), 0.0f, 2, (Object) null);
                return;
            }
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
    }

    /* renamed from: J */
    public static /* synthetic */ Object m26814J(TimePickerState timePickerState, float f, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return timePickerState.mo12342I(f, z, cVar);
    }

    /* renamed from: A */
    public final void mo12334A(float f) {
        this.f19923g.setValue(Float.valueOf(f));
    }

    /* renamed from: B */
    public final void mo12335B(boolean z) {
        this.f19922f.setValue(Boolean.valueOf(z));
    }

    /* renamed from: C */
    public final void mo12336C(int i) {
        mo12337D((((float) i) * 0.10471976f) - 1.5707964f);
    }

    /* renamed from: D */
    public final void mo12337D(float f) {
        this.f19924h.setValue(Float.valueOf(f));
    }

    /* renamed from: E */
    public final void mo12338E(int i) {
        this.f19920d.setValue(C8241l2.m27281c(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12339F(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState$settle$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material3.TimePickerState$settle$1 r0 = (androidx.compose.material3.TimePickerState$settle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.TimePickerState$settle$1 r0 = new androidx.compose.material3.TimePickerState$settle$1
            r0.<init>(r11, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0094
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0035:
            java.lang.Object r1 = r6.L$1
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x006c
        L_0x0041:
            kotlin.C11661u0.m45747n(r12)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r12 = r11.f19927k
            java.lang.Object r12 = r12.mo6613u()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r1 = r11.mo12350k()
            kotlin.Pair r1 = androidx.compose.material3.TimePickerKt.m26764o0(r12, r1)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r12 = r11.f19927k
            java.lang.Object r4 = r1.mo21849e()
            r6.L$0 = r11
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r12 = r12.mo6597B(r4, r6)
            if (r12 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r3 = r11
        L_0x006c:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r12 = r3.f19927k
            java.lang.Object r3 = r1.mo21851f()
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.z0 r4 = androidx.compose.animation.core.C1972h.m8392q(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.m7942i(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L_0x0094
            return r0
        L_0x0094:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.mo12339F(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: G */
    public final int mo12340G(float f) {
        return ((int) ((((double) f) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* renamed from: H */
    public final int mo12341H(float f) {
        return ((int) ((((double) f) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    @C12580l
    /* renamed from: I */
    public final Object mo12342I(float f, boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = this.f19925i.mo7229d(MutatePriority.UserInput, new TimePickerState$update$2(this, f, z, (C11045c<? super TimePickerState$update$2>) null), cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12343d(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState$animateToCurrent$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = (androidx.compose.material3.TimePickerState$animateToCurrent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = new androidx.compose.material3.TimePickerState$animateToCurrent$1
            r0.<init>(r11, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00bb
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0036:
            float r1 = r6.F$0
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0095
        L_0x0040:
            kotlin.C11661u0.m45747n(r12)
            int r12 = r11.mo12351l()
            androidx.compose.material3.l2$a r1 = androidx.compose.material3.C8241l2.f20286b
            int r1 = r1.mo12784a()
            boolean r12 = androidx.compose.material3.C8241l2.m27284f(r12, r1)
            if (r12 == 0) goto L_0x0060
            float r12 = r11.mo12350k()
            float r1 = r11.mo12347h()
            kotlin.Pair r12 = androidx.compose.material3.TimePickerKt.m26764o0(r12, r1)
            goto L_0x006c
        L_0x0060:
            float r12 = r11.mo12347h()
            float r1 = r11.mo12350k()
            kotlin.Pair r12 = androidx.compose.material3.TimePickerKt.m26764o0(r12, r1)
        L_0x006c:
            java.lang.Object r1 = r12.mo21846a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r12 = r12.mo21847b()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r4 = r11.f19927k
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)
            r6.L$0 = r11
            r6.F$0 = r12
            r6.label = r3
            java.lang.Object r1 = r4.mo6597B(r1, r6)
            if (r1 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r3 = r11
            r1 = r12
        L_0x0095:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r12 = r3.f19927k
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.z0 r4 = androidx.compose.animation.core.C1972h.m8392q(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.m7942i(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L_0x00bb
            return r0
        L_0x00bb:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.mo12343d(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e */
    public final long mo12344e() {
        return ((C16494m) this.f19919c.getValue()).mo47856w();
    }

    @C12579k
    /* renamed from: f */
    public final Animatable<Float, C1983k> mo12345f() {
        return this.f19927k;
    }

    /* renamed from: g */
    public final int mo12346g() {
        return mo12340G(mo12347h()) + (mo12356q() ? 12 : 0);
    }

    /* renamed from: h */
    public final float mo12347h() {
        return ((Number) this.f19923g.getValue()).floatValue();
    }

    /* renamed from: i */
    public final int mo12348i() {
        return mo12354o(mo12346g());
    }

    /* renamed from: j */
    public final int mo12349j() {
        return mo12341H(mo12350k());
    }

    /* renamed from: k */
    public final float mo12350k() {
        return ((Number) this.f19924h.getValue()).floatValue();
    }

    /* renamed from: l */
    public final int mo12351l() {
        return ((C8241l2) this.f19920d.getValue()).mo12782j();
    }

    /* renamed from: m */
    public final long mo12352m() {
        return ((C16486i) this.f19918b.getValue()).mo47831r();
    }

    @C12579k
    /* renamed from: n */
    public final List<Integer> mo12353n() {
        return C8241l2.m27284f(mo12351l(), C8241l2.f20286b.mo12785b()) ? TimePickerKt.f19905o : TimePickerKt.f19906p;
    }

    /* renamed from: o */
    public final int mo12354o(int i) {
        if (!this.f19917a || !mo12358s() || i != 0) {
            if (this.f19917a) {
                return i % 24;
            }
            if (i % 12 != 0) {
                if (mo12356q()) {
                    return i - 12;
                }
                return i;
            }
        }
        return 12;
    }

    /* renamed from: p */
    public final boolean mo12355p() {
        return this.f19917a;
    }

    /* renamed from: q */
    public final boolean mo12356q() {
        return ((Boolean) this.f19926j.getValue()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo12357r() {
        return ((Boolean) this.f19921e.getValue()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo12358s() {
        return ((Boolean) this.f19922f.getValue()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo12359t(int i) {
        int i2;
        if (!C8241l2.m27284f(mo12351l(), C8241l2.f20286b.mo12785b())) {
            int g = mo12346g();
            if (mo12356q()) {
                i2 = 12;
            } else {
                i2 = 0;
            }
            if (g == i + i2) {
                return true;
            }
        } else if (i == mo12349j()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void mo12360u(float f, float f2, float f3) {
        boolean z;
        if (C8241l2.m27284f(mo12351l(), C8241l2.f20286b.mo12784a()) && this.f19917a) {
            if (TimePickerKt.m26752i0(f, f2, C16494m.m74581m(mo12344e()), C16494m.m74583o(mo12344e())) < f3) {
                z = true;
            } else {
                z = false;
            }
            mo12335B(z);
        }
    }

    /* renamed from: v */
    public final float mo12361v(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12362w(float r11, float r12, float r13, boolean r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.material3.TimePickerState$onTap$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.material3.TimePickerState$onTap$1 r0 = (androidx.compose.material3.TimePickerState$onTap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.TimePickerState$onTap$1 r0 = new androidx.compose.material3.TimePickerState$onTap$1
            r0.<init>(r10, r15)
        L_0x0018:
            r6 = r0
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0063
            if (r1 == r5) goto L_0x004f
            if (r1 == r4) goto L_0x0042
            if (r1 == r3) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            kotlin.C11661u0.m45747n(r15)
            goto L_0x010d
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00ff
        L_0x0042:
            java.lang.Object r11 = r6.L$1
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r12 = r6.L$0
            androidx.compose.material3.TimePickerState r12 = (androidx.compose.material3.TimePickerState) r12
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00dd
        L_0x004f:
            boolean r14 = r6.Z$0
            float r13 = r6.F$2
            float r12 = r6.F$1
            float r11 = r6.F$0
            java.lang.Object r1 = r6.L$0
            androidx.compose.material3.TimePickerState r1 = (androidx.compose.material3.TimePickerState) r1
            kotlin.C11661u0.m45747n(r15)
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r1
            goto L_0x0097
        L_0x0063:
            kotlin.C11661u0.m45747n(r15)
            long r8 = r10.mo12344e()
            int r15 = androidx.compose.p004ui.unit.C16494m.m74583o(r8)
            float r15 = (float) r15
            float r15 = r12 - r15
            long r8 = r10.mo12344e()
            int r1 = androidx.compose.p004ui.unit.C16494m.m74581m(r8)
            float r1 = (float) r1
            float r1 = r11 - r1
            float r15 = androidx.compose.material3.TimePickerKt.m26748g0(r15, r1)
            r6.L$0 = r10
            r6.F$0 = r11
            r6.F$1 = r12
            r6.F$2 = r13
            r6.Z$0 = r14
            r6.label = r5
            java.lang.Object r15 = r10.mo12342I(r15, r5, r6)
            if (r15 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r10
        L_0x0097:
            r12.mo12360u(r11, r13, r14)
            int r11 = r12.mo12351l()
            androidx.compose.material3.l2$a r13 = androidx.compose.material3.C8241l2.f20286b
            int r14 = r13.mo12784a()
            boolean r11 = androidx.compose.material3.C8241l2.m27284f(r11, r14)
            if (r11 == 0) goto L_0x0102
            if (r15 == 0) goto L_0x00b6
            int r11 = r13.mo12785b()
            r12.mo12338E(r11)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x00b6:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r11 = r12.f19927k
            java.lang.Object r11 = r11.mo6613u()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r13 = r12.mo12347h()
            kotlin.Pair r11 = androidx.compose.material3.TimePickerKt.m26764o0(r11, r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r13 = r12.f19927k
            java.lang.Object r14 = r11.mo21849e()
            r6.L$0 = r12
            r6.L$1 = r11
            r6.label = r4
            java.lang.Object r13 = r13.mo6597B(r14, r6)
            if (r13 != r0) goto L_0x00dd
            return r0
        L_0x00dd:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r1 = r12.f19927k
            java.lang.Object r2 = r11.mo21851f()
            r11 = 0
            r12 = 6
            r13 = 200(0xc8, float:2.8E-43)
            androidx.compose.animation.core.z0 r11 = androidx.compose.animation.core.C1972h.m8392q(r13, r11, r7, r12, r7)
            r4 = 0
            r5 = 0
            r12 = 12
            r8 = 0
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r3
            r3 = r11
            r7 = r12
            java.lang.Object r11 = androidx.compose.animation.core.Animatable.m7942i(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x00ff
            return r0
        L_0x00ff:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x0102:
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r11 = r12.mo12339F(r6)
            if (r11 != r0) goto L_0x010d
            return r0
        L_0x010d:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.mo12362w(float, float, float, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: x */
    public final void mo12363x(boolean z) {
        this.f19921e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: y */
    public final void mo12364y(long j) {
        this.f19919c.setValue(C16494m.m74570b(j));
    }

    /* renamed from: z */
    public final void mo12365z(int i) {
        boolean z;
        if (i > 12 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo12335B(z);
        mo12334A(((((float) i) * 0.5235988f) % ((float) 12)) - 1.5707964f);
    }
}
