package androidx.compose.foundation;

import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,459:1\n1#2:460\n558#3,17:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n207#1:461,17\n*E\n"})
/* renamed from: androidx.compose.foundation.h */
public final class C2219h {
    @C12580l

    /* renamed from: a */
    public C15403w2 f5968a;
    @C12580l

    /* renamed from: b */
    public C15118b2 f5969b;
    @C12580l

    /* renamed from: c */
    public C15179a f5970c;
    @C12580l

    /* renamed from: d */
    public C15231i3 f5971d;

    public C2219h() {
        this((C15403w2) null, (C15118b2) null, (C15179a) null, (C15231i3) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public static /* synthetic */ C2219h m9649l(C2219h hVar, C15403w2 w2Var, C15118b2 b2Var, C15179a aVar, C15231i3 i3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            w2Var = hVar.f5968a;
        }
        if ((i & 2) != 0) {
            b2Var = hVar.f5969b;
        }
        if ((i & 4) != 0) {
            aVar = hVar.f5970c;
        }
        if ((i & 8) != 0) {
            i3Var = hVar.f5971d;
        }
        return hVar.mo7581k(w2Var, b2Var, aVar, i3Var);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219h)) {
            return false;
        }
        C2219h hVar = (C2219h) obj;
        return Intrinsics.areEqual((Object) this.f5968a, (Object) hVar.f5968a) && Intrinsics.areEqual((Object) this.f5969b, (Object) hVar.f5969b) && Intrinsics.areEqual((Object) this.f5970c, (Object) hVar.f5970c) && Intrinsics.areEqual((Object) this.f5971d, (Object) hVar.f5971d);
    }

    /* renamed from: g */
    public final C15403w2 mo7576g() {
        return this.f5968a;
    }

    /* renamed from: h */
    public final C15118b2 mo7577h() {
        return this.f5969b;
    }

    public int hashCode() {
        C15403w2 w2Var = this.f5968a;
        int i = 0;
        int hashCode = (w2Var == null ? 0 : w2Var.hashCode()) * 31;
        C15118b2 b2Var = this.f5969b;
        int hashCode2 = (hashCode + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        C15179a aVar = this.f5970c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C15231i3 i3Var = this.f5971d;
        if (i3Var != null) {
            i = i3Var.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final C15179a mo7579i() {
        return this.f5970c;
    }

    /* renamed from: j */
    public final C15231i3 mo7580j() {
        return this.f5971d;
    }

    @C12579k
    /* renamed from: k */
    public final C2219h mo7581k(@C12580l C15403w2 w2Var, @C12580l C15118b2 b2Var, @C12580l C15179a aVar, @C12580l C15231i3 i3Var) {
        return new C2219h(w2Var, b2Var, aVar, i3Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (androidx.compose.p004ui.graphics.C15410x2.m67286h(r31, r5) != false) goto L_0x004f;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.graphics.C15403w2 mo7582m(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.draw.CacheDrawScope r28, long r29, int r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.graphics.drawscope.C15187e, kotlin.C11079d2> r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r32
            java.lang.String r3 = "$this$drawBorderCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            androidx.compose.ui.graphics.w2 r3 = r27.f5968a
            androidx.compose.ui.graphics.b2 r4 = r27.f5969b
            r5 = 0
            if (r3 == 0) goto L_0x0024
            int r6 = r3.mo42789f()
            androidx.compose.ui.graphics.x2 r6 = androidx.compose.p004ui.graphics.C15410x2.m67284f(r6)
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            androidx.compose.ui.graphics.x2$a r7 = androidx.compose.p004ui.graphics.C15410x2.f38097b
            int r7 = r7.mo43577b()
            r8 = 0
            if (r6 != 0) goto L_0x0030
            r6 = r8
            goto L_0x0038
        L_0x0030:
            int r6 = r6.mo43574m()
            boolean r6 = androidx.compose.p004ui.graphics.C15410x2.m67287i(r6, r7)
        L_0x0038:
            if (r6 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x0044
            int r5 = r3.mo42789f()
            androidx.compose.ui.graphics.x2 r5 = androidx.compose.p004ui.graphics.C15410x2.m67284f(r5)
        L_0x0044:
            r6 = r31
            boolean r5 = androidx.compose.p004ui.graphics.C15410x2.m67286h(r6, r5)
            if (r5 == 0) goto L_0x0050
            goto L_0x004f
        L_0x004d:
            r6 = r31
        L_0x004f:
            r8 = 1
        L_0x0050:
            if (r3 == 0) goto L_0x0078
            if (r4 == 0) goto L_0x0078
            long r9 = r28.mo17089b()
            float r5 = androidx.compose.p004ui.geometry.C15104m.m65023t(r9)
            int r7 = r3.getWidth()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0078
            long r9 = r28.mo17089b()
            float r5 = androidx.compose.p004ui.geometry.C15104m.m65016m(r9)
            int r7 = r3.getHeight()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0078
            if (r8 != 0) goto L_0x0095
        L_0x0078:
            int r9 = androidx.compose.p004ui.unit.C16500q.m74662m(r29)
            int r10 = androidx.compose.p004ui.unit.C16500q.m74659j(r29)
            r12 = 0
            r13 = 0
            r14 = 24
            r15 = 0
            r11 = r31
            androidx.compose.ui.graphics.w2 r3 = androidx.compose.p004ui.graphics.C15417y2.m67304b(r9, r10, r11, r12, r13, r14, r15)
            r0.f5968a = r3
            androidx.compose.ui.graphics.b2 r4 = androidx.compose.p004ui.graphics.C15173d2.m65563a(r3)
            r0.f5969b = r4
        L_0x0095:
            androidx.compose.ui.graphics.drawscope.a r5 = r27.f5970c
            if (r5 != 0) goto L_0x00a3
            androidx.compose.ui.graphics.drawscope.a r5 = new androidx.compose.ui.graphics.drawscope.a
            r5.<init>()
            r0.f5970c = r5
        L_0x00a3:
            long r11 = androidx.compose.p004ui.unit.C16502r.m74673f(r29)
            androidx.compose.ui.unit.LayoutDirection r6 = r28.getLayoutDirection()
            androidx.compose.ui.graphics.drawscope.a$a r7 = r5.mo42656A()
            androidx.compose.ui.unit.d r15 = r7.mo42687a()
            androidx.compose.ui.unit.LayoutDirection r14 = r7.mo42688b()
            androidx.compose.ui.graphics.b2 r13 = r7.mo42689c()
            long r9 = r7.mo42690d()
            androidx.compose.ui.graphics.drawscope.a$a r7 = r5.mo42656A()
            r7.mo42699l(r1)
            r7.mo42700m(r6)
            r7.mo42698k(r4)
            r7.mo42701n(r11)
            r4.mo42422E()
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r7 = r1.mo42841a()
            r16 = 0
            r1 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.graphics.u1$a r6 = androidx.compose.p004ui.graphics.C15325u1.f37708b
            int r20 = r6.mo43017a()
            r21 = 58
            r22 = 0
            r6 = r5
            r23 = r9
            r9 = r16
            r25 = r13
            r13 = r1
            r1 = r14
            r14 = r18
            r26 = r15
            r15 = r19
            r16 = r20
            r17 = r21
            r18 = r22
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65710e5(r6, r7, r9, r11, r13, r14, r15, r16, r17, r18)
            r2.invoke(r5)
            r4.mo42443q()
            androidx.compose.ui.graphics.drawscope.a$a r2 = r5.mo42656A()
            r4 = r26
            r2.mo42699l(r4)
            r2.mo42700m(r1)
            r1 = r25
            r2.mo42698k(r1)
            r4 = r23
            r2.mo42701n(r4)
            r3.mo42786c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C2219h.mo7582m(androidx.compose.ui.draw.CacheDrawScope, long, int, kotlin.jvm.functions.l):androidx.compose.ui.graphics.w2");
    }

    @C12579k
    /* renamed from: n */
    public final C15231i3 mo7583n() {
        C15231i3 i3Var = this.f5971d;
        if (i3Var != null) {
            return i3Var;
        }
        C15231i3 a = C15318t0.m66550a();
        this.f5971d = a;
        return a;
    }

    @C12579k
    public String toString() {
        return "BorderCache(imageBitmap=" + this.f5968a + ", canvas=" + this.f5969b + ", canvasDrawScope=" + this.f5970c + ", borderPath=" + this.f5971d + ')';
    }

    public C2219h(@C12580l C15403w2 w2Var, @C12580l C15118b2 b2Var, @C12580l C15179a aVar, @C12580l C15231i3 i3Var) {
        this.f5968a = w2Var;
        this.f5969b = b2Var;
        this.f5970c = aVar;
        this.f5971d = i3Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2219h(C15403w2 w2Var, C15118b2 b2Var, C15179a aVar, C15231i3 i3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : w2Var, (i & 2) != 0 ? null : b2Var, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : i3Var);
    }
}
