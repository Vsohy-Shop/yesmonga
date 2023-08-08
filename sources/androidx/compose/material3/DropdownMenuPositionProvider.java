package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16486i;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.window.C16546g;
import androidx.compose.runtime.C8585m0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,443:1\n1#2:444\n179#3,2:445\n179#3,2:447\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n342#1:445,2\n351#1:447,2\n*E\n"})
public final class DropdownMenuPositionProvider implements C16546g {

    /* renamed from: a */
    public final long f19387a;
    @C12579k

    /* renamed from: b */
    public final C16479d f19388b;
    @C12579k

    /* renamed from: c */
    public final C11304p<C16497o, C16497o, C11079d2> f19389c;

    public /* synthetic */ DropdownMenuPositionProvider(long j, C16479d dVar, C11304p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, dVar, pVar);
    }

    /* renamed from: f */
    public static /* synthetic */ DropdownMenuPositionProvider m25730f(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, C16479d dVar, C11304p<C16497o, C16497o, C11079d2> pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.f19387a;
        }
        if ((i & 2) != 0) {
            dVar = dropdownMenuPositionProvider.f19388b;
        }
        if ((i & 4) != 0) {
            pVar = dropdownMenuPositionProvider.f19389c;
        }
        return dropdownMenuPositionProvider.mo11527e(j, dVar, pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo9854a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16497o r15, long r16, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.LayoutDirection r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r18
            java.lang.String r3 = "anchorBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            java.lang.String r3 = "layoutDirection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            androidx.compose.ui.unit.d r3 = r0.f19388b
            float r4 = androidx.compose.material3.MenuKt.m25877j()
            int r3 = r3.mo7429n2(r4)
            androidx.compose.ui.unit.d r4 = r0.f19388b
            long r5 = r0.f19387a
            float r5 = androidx.compose.p004ui.unit.C16486i.m74517j(r5)
            int r4 = r4.mo7429n2(r5)
            androidx.compose.ui.unit.d r5 = r0.f19388b
            long r6 = r0.f19387a
            float r6 = androidx.compose.p004ui.unit.C16486i.m74519l(r6)
            int r5 = r5.mo7429n2(r6)
            int r6 = r15.mo47886t()
            int r6 = r6 + r4
            int r7 = r15.mo47890x()
            int r7 = r7 - r4
            int r4 = androidx.compose.p004ui.unit.C16500q.m74662m(r19)
            int r7 = r7 - r4
            int r4 = androidx.compose.p004ui.unit.C16500q.m74662m(r16)
            int r8 = androidx.compose.p004ui.unit.C16500q.m74662m(r19)
            int r4 = r4 - r8
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r2 != r8) goto L_0x0071
            java.lang.Integer[] r2 = new java.lang.Integer[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r2[r11] = r6
            int r6 = r15.mo47886t()
            if (r6 < 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = r12
        L_0x0066:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r10] = r4
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44600q(r2)
            goto L_0x0094
        L_0x0071:
            java.lang.Integer[] r2 = new java.lang.Integer[r9]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2[r12] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r11] = r6
            int r6 = r15.mo47890x()
            int r8 = androidx.compose.p004ui.unit.C16500q.m74662m(r16)
            if (r6 > r8) goto L_0x008a
            r4 = r12
        L_0x008a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r10] = r4
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44600q(r2)
        L_0x0094:
            java.util.Iterator r2 = r2.iterator()
        L_0x0098:
            boolean r4 = r2.hasNext()
            r6 = 0
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r4 = r2.next()
            r8 = r4
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L_0x00b9
            int r13 = androidx.compose.p004ui.unit.C16500q.m74662m(r19)
            int r8 = r8 + r13
            int r13 = androidx.compose.p004ui.unit.C16500q.m74662m(r16)
            if (r8 > r13) goto L_0x00b9
            r8 = r11
            goto L_0x00ba
        L_0x00b9:
            r8 = r12
        L_0x00ba:
            if (r8 == 0) goto L_0x0098
            goto L_0x00be
        L_0x00bd:
            r4 = r6
        L_0x00be:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x00c6
            int r7 = r4.intValue()
        L_0x00c6:
            int r2 = r15.mo47878j()
            int r2 = r2 + r5
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r15.mo47858B()
            int r4 = r4 - r5
            int r5 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            int r4 = r4 - r5
            int r5 = r15.mo47858B()
            int r8 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            int r8 = r8 / r10
            int r5 = r5 - r8
            int r8 = androidx.compose.p004ui.unit.C16500q.m74659j(r16)
            int r13 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            int r8 = r8 - r13
            int r8 = r8 - r3
            r13 = 4
            java.lang.Integer[] r13 = new java.lang.Integer[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r13[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r13[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r13[r9] = r2
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44600q(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x0110:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0135
            java.lang.Object r5 = r2.next()
            r8 = r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 < r3) goto L_0x0131
            int r9 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            int r8 = r8 + r9
            int r9 = androidx.compose.p004ui.unit.C16500q.m74659j(r16)
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0131
            r8 = r11
            goto L_0x0132
        L_0x0131:
            r8 = r12
        L_0x0132:
            if (r8 == 0) goto L_0x0110
            r6 = r5
        L_0x0135:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x013d
            int r4 = r6.intValue()
        L_0x013d:
            kotlin.jvm.functions.p<androidx.compose.ui.unit.o, androidx.compose.ui.unit.o, kotlin.d2> r2 = r0.f19389c
            androidx.compose.ui.unit.o r3 = new androidx.compose.ui.unit.o
            int r5 = androidx.compose.p004ui.unit.C16500q.m74662m(r19)
            int r5 = r5 + r7
            int r6 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            int r6 = r6 + r4
            r3.<init>(r7, r4, r5, r6)
            r2.invoke(r15, r3)
            long r1 = androidx.compose.p004ui.unit.C16496n.m74593a(r7, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DropdownMenuPositionProvider.mo9854a(androidx.compose.ui.unit.o, long, androidx.compose.ui.unit.LayoutDirection, long):long");
    }

    /* renamed from: b */
    public final long mo11524b() {
        return this.f19387a;
    }

    @C12579k
    /* renamed from: c */
    public final C16479d mo11525c() {
        return this.f19388b;
    }

    @C12579k
    /* renamed from: d */
    public final C11304p<C16497o, C16497o, C11079d2> mo11526d() {
        return this.f19389c;
    }

    @C12579k
    /* renamed from: e */
    public final DropdownMenuPositionProvider mo11527e(long j, @C12579k C16479d dVar, @C12579k C11304p<? super C16497o, ? super C16497o, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(pVar, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j, dVar, pVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return C16486i.m74515h(this.f19387a, dropdownMenuPositionProvider.f19387a) && Intrinsics.areEqual((Object) this.f19388b, (Object) dropdownMenuPositionProvider.f19388b) && Intrinsics.areEqual((Object) this.f19389c, (Object) dropdownMenuPositionProvider.f19389c);
    }

    /* renamed from: g */
    public final long mo11529g() {
        return this.f19387a;
    }

    @C12579k
    /* renamed from: h */
    public final C16479d mo11530h() {
        return this.f19388b;
    }

    public int hashCode() {
        return (((C16486i.m74521n(this.f19387a) * 31) + this.f19388b.hashCode()) * 31) + this.f19389c.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C11304p<C16497o, C16497o, C11079d2> mo11532i() {
        return this.f19389c;
    }

    @C12579k
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + C16486i.m74524q(this.f19387a) + ", density=" + this.f19388b + ", onPositionCalculated=" + this.f19389c + ')';
    }

    public DropdownMenuPositionProvider(long j, C16479d dVar, C11304p<? super C16497o, ? super C16497o, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(pVar, "onPositionCalculated");
        this.f19387a = j;
        this.f19388b = dVar;
        this.f19389c = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownMenuPositionProvider(long j, C16479d dVar, C11304p pVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, dVar, (i & 4) != 0 ? C80161.f19390f : pVar, (DefaultConstructorMarker) null);
    }
}
