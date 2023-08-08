package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n135#3:520\n154#4:521\n154#4:522\n154#4:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n367#1:518\n384#1:519\n404#1:520\n431#1:521\n436#1:522\n441#1:523\n*E\n"})
public final class TabRowDefaults {
    @C12579k

    /* renamed from: a */
    public static final TabRowDefaults f7949a = new TabRowDefaults();

    /* renamed from: b */
    public static final float f7950b = 0.12f;

    /* renamed from: c */
    public static final float f7951c = C16483g.m74435M((float) 1);

    /* renamed from: d */
    public static final float f7952d = C16483g.m74435M((float) 2);

    /* renamed from: e */
    public static final float f7953e = C16483g.m74435M((float) 52);

    /* renamed from: f */
    public static final int f7954f = 0;

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10605a(@C12580l C8767m mVar, float f, long j, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        float f2;
        long j2;
        long j3;
        float f3;
        C8767m mVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C8592o o = oVar.mo15009o(910934799);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            mVar2 = mVar;
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (o.mo14968d(f2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                f2 = f;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            f2 = f;
        }
        if ((i8 & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (o.mo14980g(j2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i8 & 7168) == 0) {
                if (o.mo15006n0(this)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 5851) != 1170 || !o.mo15011p()) {
            o.mo14930Q();
            if ((i8 & 1) == 0 || o.mo14977f0()) {
                if (i9 != 0) {
                    mVar3 = C8767m.f23478j;
                } else {
                    mVar3 = mVar2;
                }
                if ((i2 & 2) != 0) {
                    f3 = f7951c;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = C15240j2.m66080w(((C15240j2) o.mo15032w(ContentColorKt.m13406a())).mo42833M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i3 &= -897;
                }
            } else {
                o.mo14958a0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                mVar3 = mVar2;
                f3 = f2;
            }
            long j4 = j2;
            int i10 = i3;
            j3 = j4;
            o.mo14899E();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(910934799, i10, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:363)");
            }
            DividerKt.m13428a(mVar3, j3, f3, 0.0f, o, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896), 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            f3 = f2;
            j3 = j2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TabRowDefaults$Divider$1(this, mVar3, f3, j3, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10606b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r17, float r18, long r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r16 = this;
            r6 = r22
            r0 = 1499002201(0x5958f559, float:3.81677235E15)
            r1 = r21
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r17
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r17
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r17
            r4 = r6
        L_0x0029:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0042
            r5 = r23 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r18
            boolean r7 = r1.mo14968d(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r18
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r18
        L_0x0044:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005d
            r7 = r23 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r19
            boolean r9 = r1.mo14980g(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r19
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r19
        L_0x005f:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            r9 = r16
            boolean r10 = r1.mo15006n0(r9)
            if (r10 == 0) goto L_0x0075
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r10
            goto L_0x007b
        L_0x0079:
            r9 = r16
        L_0x007b:
            r4 = r4 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r4 != r10) goto L_0x0090
            boolean r4 = r1.mo15011p()
            if (r4 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r1.mo14958a0()
            r2 = r3
            r3 = r5
        L_0x008d:
            r4 = r7
            goto L_0x00f5
        L_0x0090:
            r1.mo14930Q()
            r4 = r6 & 1
            if (r4 == 0) goto L_0x00a4
            boolean r4 = r1.mo14977f0()
            if (r4 == 0) goto L_0x009e
            goto L_0x00a4
        L_0x009e:
            r1.mo14958a0()
            r2 = r3
            r3 = r5
            goto L_0x00c5
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00aa
        L_0x00a9:
            r2 = r3
        L_0x00aa:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x00b1
            float r3 = f7952d
            goto L_0x00b2
        L_0x00b1:
            r3 = r5
        L_0x00b2:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x00c5
            androidx.compose.runtime.i1 r4 = androidx.compose.material.ContentColorKt.m13406a()
            java.lang.Object r4 = r1.mo15032w(r4)
            androidx.compose.ui.graphics.j2 r4 = (androidx.compose.p004ui.graphics.C15240j2) r4
            long r4 = r4.mo42833M()
            r7 = r4
        L_0x00c5:
            r1.mo14899E()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00d4
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:380)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r4, r5)
        L_0x00d4:
            r0 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r5, r4)
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r3)
            r13 = 0
            r14 = 2
            r15 = 0
            r11 = r7
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r10, r11, r13, r14, r15)
            r4 = 0
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r1, r4)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x008d
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x008d
        L_0x00f5:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x00fc
            goto L_0x010b
        L_0x00fc:
            androidx.compose.material.TabRowDefaults$Indicator$1 r10 = new androidx.compose.material.TabRowDefaults$Indicator$1
            r0 = r10
            r1 = r16
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.mo15202a(r10)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.mo10606b(androidx.compose.ui.m, float, long, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public final float mo10607c() {
        return f7951c;
    }

    /* renamed from: d */
    public final float mo10608d() {
        return f7952d;
    }

    /* renamed from: e */
    public final float mo10609e() {
        return f7953e;
    }

    @C12579k
    /* renamed from: f */
    public final C8767m mo10610f(@C12579k C8767m mVar, @C12579k C7906r1 r1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(r1Var, "currentTabPosition");
        if (InspectableValueKt.m71063e()) {
            lVar = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(r1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TabRowDefaults$tabIndicatorOffset$2(r1Var));
    }
}
