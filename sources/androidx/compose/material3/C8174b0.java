package androidx.compose.material3;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.material3.b0 */
public final class C8174b0 {
    @C12579k

    /* renamed from: a */
    public final StateData f19994a;
    @C12579k

    /* renamed from: b */
    public final C8169a0 f19995b;
    @C12579k

    /* renamed from: c */
    public final C8186d0 f19996c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Long, Boolean> f19997d;
    @C12579k

    /* renamed from: e */
    public final String f19998e;
    @C12579k

    /* renamed from: f */
    public final String f19999f;
    @C12579k

    /* renamed from: g */
    public final String f20000g;
    @C12579k

    /* renamed from: h */
    public final String f20001h;

    public C8174b0(@C12579k StateData stateData, @C12579k C8169a0 a0Var, @C12579k C8186d0 d0Var, @C12579k C11300l<? super Long, Boolean> lVar, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(a0Var, "dateInputFormat");
        Intrinsics.checkNotNullParameter(d0Var, "dateFormatter");
        Intrinsics.checkNotNullParameter(lVar, "dateValidator");
        Intrinsics.checkNotNullParameter(str, "errorDatePattern");
        Intrinsics.checkNotNullParameter(str2, "errorDateOutOfYearRange");
        Intrinsics.checkNotNullParameter(str3, "errorInvalidNotAllowed");
        Intrinsics.checkNotNullParameter(str4, "errorInvalidRangeInput");
        this.f19994a = stateData;
        this.f19995b = a0Var;
        this.f19996c = d0Var;
        this.f19997d = lVar;
        this.f19998e = str;
        this.f19999f = str2;
        this.f20000g = str3;
        this.f20001h = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d3, code lost:
        if (r0 < r2) goto L_0x00d5;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12457a(@org.jetbrains.annotations.C12580l androidx.compose.material3.C8238l r12, int r13, @org.jetbrains.annotations.C12579k java.util.Locale r14) {
        /*
            r11 = this;
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "format(this, *args)"
            r1 = 0
            r2 = 1
            if (r12 != 0) goto L_0x002e
            java.lang.String r12 = r11.f19998e
            java.lang.Object[] r13 = new java.lang.Object[r2]
            androidx.compose.material3.a0 r14 = r11.f19995b
            java.lang.String r14 = r14.mo12437f()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toUpperCase(r3)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r3)
            r13[r1] = r14
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r2)
            java.lang.String r12 = java.lang.String.format(r12, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        L_0x002e:
            androidx.compose.material3.StateData r3 = r11.f19994a
            kotlin.ranges.l r3 = r3.mo11995i()
            int r4 = r12.getYear()
            boolean r3 = r3.mo23056Q(r4)
            if (r3 != 0) goto L_0x006f
            java.lang.String r12 = r11.f19999f
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            androidx.compose.material3.StateData r3 = r11.f19994a
            kotlin.ranges.l r3 = r3.mo11995i()
            int r3 = r3.mo23049r()
            java.lang.String r3 = androidx.compose.material3.DatePickerKt.m25593M(r3)
            r14[r1] = r3
            androidx.compose.material3.StateData r1 = r11.f19994a
            kotlin.ranges.l r1 = r1.mo11995i()
            int r1 = r1.mo23051w()
            java.lang.String r1 = androidx.compose.material3.DatePickerKt.m25593M(r1)
            r14[r2] = r1
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r14, r13)
            java.lang.String r12 = java.lang.String.format(r12, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        L_0x006f:
            kotlin.jvm.functions.l<java.lang.Long, java.lang.Boolean> r3 = r11.f19997d
            long r4 = r12.mo12763X()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.invoke(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00a9
            java.lang.String r13 = r11.f20000g
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.material3.d0 r4 = r11.f19996c
            androidx.compose.material3.StateData r5 = r11.f19994a
            androidx.compose.material3.m r6 = r5.mo11987a()
            r8 = 0
            r9 = 8
            r10 = 0
            r5 = r12
            r7 = r14
            java.lang.String r12 = androidx.compose.material3.C8186d0.m27008b(r4, r5, r6, r7, r8, r9, r10)
            r3[r1] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r12 = java.lang.String.format(r13, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        L_0x00a9:
            androidx.compose.material3.b1$a r14 = androidx.compose.material3.C8175b1.f20002b
            int r0 = r14.mo12464c()
            boolean r0 = androidx.compose.material3.C8175b1.m26951g(r13, r0)
            if (r0 == 0) goto L_0x00d5
            long r0 = r12.mo12763X()
            androidx.compose.material3.StateData r2 = r11.f19994a
            androidx.compose.runtime.z0 r2 = r2.mo11992f()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.material3.l r2 = (androidx.compose.material3.C8238l) r2
            if (r2 == 0) goto L_0x00cc
            long r2 = r2.mo12763X()
            goto L_0x00d1
        L_0x00cc:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d1:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fc
        L_0x00d5:
            int r14 = r14.mo12462a()
            boolean r13 = androidx.compose.material3.C8175b1.m26951g(r13, r14)
            if (r13 == 0) goto L_0x00ff
            long r12 = r12.mo12763X()
            androidx.compose.material3.StateData r14 = r11.f19994a
            androidx.compose.runtime.z0 r14 = r14.mo11993g()
            java.lang.Object r14 = r14.getValue()
            androidx.compose.material3.l r14 = (androidx.compose.material3.C8238l) r14
            if (r14 == 0) goto L_0x00f6
            long r0 = r14.mo12763X()
            goto L_0x00f8
        L_0x00f6:
            r0 = -9223372036854775808
        L_0x00f8:
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x00ff
        L_0x00fc:
            java.lang.String r12 = r11.f20001h
            return r12
        L_0x00ff:
            java.lang.String r12 = ""
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C8174b0.mo12457a(androidx.compose.material3.l, int, java.util.Locale):java.lang.String");
    }
}
