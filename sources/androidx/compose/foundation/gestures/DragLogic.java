package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DragLogic {
    @C12579k

    /* renamed from: a */
    public final C11305q<C12074o0, C15094f, C11045c<? super C11079d2>, Object> f5876a;
    @C12579k

    /* renamed from: b */
    public final C11305q<C12074o0, C16509w, C11045c<? super C11079d2>, Object> f5877b;
    @C12579k

    /* renamed from: c */
    public final C8700z0<C2230a.C2232b> f5878c;
    @C12580l

    /* renamed from: d */
    public final C2243g f5879d;

    public DragLogic(@C12579k C11305q<? super C12074o0, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11305q<? super C12074o0, ? super C16509w, ? super C11045c<? super C11079d2>, ? extends Object> qVar2, @C12579k C8700z0<C2230a.C2232b> z0Var, @C12580l C2243g gVar) {
        Intrinsics.checkNotNullParameter(qVar, "onDragStarted");
        Intrinsics.checkNotNullParameter(qVar2, "onDragStopped");
        Intrinsics.checkNotNullParameter(z0Var, "dragStartInteraction");
        this.f5876a = qVar;
        this.f5877b = qVar2;
        this.f5878c = z0Var;
        this.f5879d = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8700z0<C2230a.C2232b> mo7387a() {
        return this.f5878c;
    }

    @C12580l
    /* renamed from: b */
    public final C2243g mo7388b() {
        return this.f5879d;
    }

    @C12579k
    /* renamed from: c */
    public final C11305q<C12074o0, C15094f, C11045c<? super C11079d2>, Object> mo7389c() {
        return this.f5876a;
    }

    @C12579k
    /* renamed from: d */
    public final C11305q<C12074o0, C16509w, C11045c<? super C11079d2>, Object> mo7390d() {
        return this.f5877b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7391e(@org.jetbrains.annotations.C12579k kotlinx.coroutines.C12074o0 r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0085
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.o0 r9 = (kotlinx.coroutines.C12074o0) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0065
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r10 = r8.f5878c
            java.lang.Object r10 = r10.getValue()
            androidx.compose.foundation.interaction.a$b r10 = (androidx.compose.foundation.interaction.C2230a.C2232b) r10
            if (r10 == 0) goto L_0x006b
            androidx.compose.foundation.interaction.g r2 = r8.f5879d
            if (r2 == 0) goto L_0x0064
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.mo7604a(r6, r0)
            if (r10 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r8
        L_0x0065:
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r10 = r2.f5878c
            r10.setValue(r5)
            goto L_0x006c
        L_0x006b:
            r2 = r8
        L_0x006c:
            kotlin.jvm.functions.q<kotlinx.coroutines.o0, androidx.compose.ui.unit.w, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r10 = r2.f5877b
            androidx.compose.ui.unit.w$a r2 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r6 = r2.mo47915a()
            androidx.compose.ui.unit.w r2 = androidx.compose.p004ui.unit.C16509w.m74740b(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo7391e(kotlinx.coroutines.o0, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7392f(@org.jetbrains.annotations.C12579k kotlinx.coroutines.C12074o0 r9, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2187d.C2190c r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00c6
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$3
            androidx.compose.foundation.interaction.a$b r9 = (androidx.compose.foundation.interaction.C2230a.C2232b) r9
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.d$c r10 = (androidx.compose.foundation.gestures.C2187d.C2190c) r10
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.d$c r9 = (androidx.compose.foundation.gestures.C2187d.C2190c) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.o0 r10 = (kotlinx.coroutines.C12074o0) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.C11661u0.m45747n(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0085
        L_0x005f:
            kotlin.C11661u0.m45747n(r11)
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r11 = r8.f5878c
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.a$b r11 = (androidx.compose.foundation.interaction.C2230a.C2232b) r11
            if (r11 == 0) goto L_0x0084
            androidx.compose.foundation.interaction.g r2 = r8.f5879d
            if (r2 == 0) goto L_0x0084
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.mo7604a(r6, r0)
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r8
        L_0x0085:
            androidx.compose.foundation.interaction.a$b r11 = new androidx.compose.foundation.interaction.a$b
            r11.<init>()
            androidx.compose.foundation.interaction.g r5 = r2.f5879d
            if (r5 == 0) goto L_0x00a5
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r4 = r5.mo7604a(r11, r0)
            if (r4 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r4 = r2
            r2 = r9
            r9 = r11
        L_0x00a2:
            r11 = r9
            r9 = r2
            r2 = r4
        L_0x00a5:
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r4 = r2.f5878c
            r4.setValue(r11)
            kotlin.jvm.functions.q<kotlinx.coroutines.o0, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r11 = r2.f5876a
            long r4 = r10.mo7535a()
            androidx.compose.ui.geometry.f r10 = androidx.compose.p004ui.geometry.C15094f.m64868d(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo7392f(kotlinx.coroutines.o0, androidx.compose.foundation.gestures.d$c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7393g(@org.jetbrains.annotations.C12579k kotlinx.coroutines.C12074o0 r10, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2187d.C2191d r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r12)
            goto L_0x008e
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.d$d r10 = (androidx.compose.foundation.gestures.C2187d.C2191d) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.o0 r11 = (kotlinx.coroutines.C12074o0) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.C11661u0.m45747n(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x006e
        L_0x0048:
            kotlin.C11661u0.m45747n(r12)
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r12 = r9.f5878c
            java.lang.Object r12 = r12.getValue()
            androidx.compose.foundation.interaction.a$b r12 = (androidx.compose.foundation.interaction.C2230a.C2232b) r12
            if (r12 == 0) goto L_0x0074
            androidx.compose.foundation.interaction.g r2 = r9.f5879d
            if (r2 == 0) goto L_0x006d
            androidx.compose.foundation.interaction.a$c r6 = new androidx.compose.foundation.interaction.a$c
            r6.<init>(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r2.mo7604a(r6, r0)
            if (r12 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r9
        L_0x006e:
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.a$b> r12 = r2.f5878c
            r12.setValue(r5)
            goto L_0x0075
        L_0x0074:
            r2 = r9
        L_0x0075:
            kotlin.jvm.functions.q<kotlinx.coroutines.o0, androidx.compose.ui.unit.w, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r12 = r2.f5877b
            long r6 = r11.mo7536a()
            androidx.compose.ui.unit.w r11 = androidx.compose.p004ui.unit.C16509w.m74740b(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo7393g(kotlinx.coroutines.o0, androidx.compose.foundation.gestures.d$d, kotlin.coroutines.c):java.lang.Object");
    }
}
