package com.carrefour.fid.android.design.libs.pager.snapper;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSnapperFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapperFlingBehavior.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/SnapperFlingBehavior\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,587:1\n76#2:588\n102#2,2:589\n*S KotlinDebug\n*F\n+ 1 SnapperFlingBehavior.kt\ncom/carrefour/fid/android/design/libs/pager/snapper/SnapperFlingBehavior\n*L\n259#1:588\n259#1:589,2\n*E\n"})
public final class SnapperFlingBehavior implements C2195g {

    /* renamed from: g */
    public static final int f94110g = 0;
    @C12579k

    /* renamed from: a */
    public final C37472d f94111a;
    @C12579k

    /* renamed from: b */
    public final C2013v<Float> f94112b;
    @C12579k

    /* renamed from: c */
    public final C1968g<Float> f94113c;
    @C12579k

    /* renamed from: d */
    public final C11305q<C37472d, Integer, Integer, Integer> f94114d;
    @C12579k

    /* renamed from: e */
    public final C11300l<C37472d, Float> f94115e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f94116f;

    public SnapperFlingBehavior(C37472d dVar, C2013v<Float> vVar, C1968g<Float> gVar, C11305q<? super C37472d, ? super Integer, ? super Integer, Integer> qVar, C11300l<? super C37472d, Float> lVar) {
        this.f94111a = dVar;
        this.f94112b = vVar;
        this.f94113c = gVar;
        this.f94114d = qVar;
        this.f94115e = lVar;
        this.f94116f = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: m */
    public static /* synthetic */ Object m153748m(SnapperFlingBehavior snapperFlingBehavior, C2201l lVar, C37473e eVar, int i, float f, boolean z, C11045c cVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return snapperFlingBehavior.mo114157l(lVar, eVar, i, f, z, cVar);
    }

    /* renamed from: p */
    public static /* synthetic */ Object m153749p(SnapperFlingBehavior snapperFlingBehavior, C2201l lVar, C37473e eVar, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return snapperFlingBehavior.mo114159o(lVar, eVar, i, f, cVar);
    }

    @C12580l
    /* renamed from: a */
    public Object mo7354a(@C12579k C2201l lVar, float f, @C12579k C11045c<? super Float> cVar) {
        boolean z;
        if (!this.f94111a.mo114132b() || !this.f94111a.mo114131a()) {
            return C11064a.m42619e(f);
        }
        float floatValue = this.f94115e.invoke(this.f94111a).floatValue();
        boolean z2 = true;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int c = this.f94111a.mo114133c(f, this.f94112b, floatValue);
            C37473e e = this.f94111a.mo114135e();
            Intrinsics.checkNotNull(e);
            int a = e.mo114170a();
            if (f < 0.0f) {
                a++;
            }
            int intValue = this.f94114d.invoke(this.f94111a, C11064a.m42620f(a), C11064a.m42620f(c)).intValue();
            if (intValue < 0 || intValue >= this.f94111a.mo114138h()) {
                z2 = false;
            }
            if (z2) {
                return mo114155j(lVar, intValue, f, cVar);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
    }

    /* renamed from: g */
    public final int mo114152g(float f, C37473e eVar, int i) {
        if (f > 0.0f && eVar.mo114170a() == i) {
            return this.f94111a.mo114134d(eVar.mo114170a());
        }
        if (f >= 0.0f || eVar.mo114170a() != i - 1) {
            return 0;
        }
        return this.f94111a.mo114134d(eVar.mo114170a() + 1);
    }

    /* renamed from: h */
    public final boolean mo114153h(C2013v<Float> vVar, float f, C37473e eVar) {
        if (Math.abs(f) < 0.5f) {
            return false;
        }
        float a = C2017x.m8654a(vVar, 0.0f, f);
        if (f < 0.0f) {
            if (a > ((float) this.f94111a.mo114134d(eVar.mo114170a()))) {
                return false;
            }
        } else if (a < ((float) this.f94111a.mo114134d(eVar.mo114170a() + 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final float mo114154i(float f) {
        if (f < 0.0f && !this.f94111a.mo114132b()) {
            return f;
        }
        if (f <= 0.0f || this.f94111a.mo114131a()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114155j(androidx.compose.foundation.gestures.C2201l r16, int r17, float r18, kotlin.coroutines.C11045c<? super java.lang.Float> r19) {
        /*
            r15 = this;
            r9 = r15
            r10 = r17
            r4 = r18
            r0 = r19
            boolean r1 = r0 instanceof com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$flingToIndex$1
            if (r1 == 0) goto L_0x001a
            r1 = r0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$flingToIndex$1 r1 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$flingToIndex$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001f
        L_0x001a:
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$flingToIndex$1 r1 = new com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$flingToIndex$1
            r1.<init>(r15, r0)
        L_0x001f:
            r11 = r1
            java.lang.Object r0 = r11.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 == r2) goto L_0x0041
            if (r1 != r13) goto L_0x0039
            java.lang.Object r1 = r11.L$0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior r1 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior) r1
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00db
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            int r1 = r11.I$0
            java.lang.Object r2 = r11.L$1
            androidx.compose.foundation.gestures.l r2 = (androidx.compose.foundation.gestures.C2201l) r2
            java.lang.Object r3 = r11.L$0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior r3 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior) r3
            kotlin.C11661u0.m45747n(r0)
            r14 = r2
            goto L_0x00a3
        L_0x0050:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.design.libs.pager.snapper.d r0 = r9.f94111a
            com.carrefour.fid.android.design.libs.pager.snapper.e r3 = r0.mo114135e()
            if (r3 != 0) goto L_0x0060
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r18)
            return r0
        L_0x0060:
            int r0 = r3.mo114170a()
            if (r0 != r10) goto L_0x007b
            com.carrefour.fid.android.design.libs.pager.snapper.d r0 = r9.f94111a
            int r1 = r3.mo114170a()
            int r0 = r0.mo114134d(r1)
            if (r0 != 0) goto L_0x007b
            float r0 = r15.mo114154i(r4)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x007b:
            androidx.compose.animation.core.v<java.lang.Float> r0 = r9.f94112b
            boolean r0 = r15.mo114153h(r0, r4, r3)
            if (r0 == 0) goto L_0x00ae
            r5 = 0
            r7 = 8
            r8 = 0
            r11.L$0 = r9
            r14 = r16
            r11.L$1 = r14
            r11.I$0 = r10
            r11.label = r2
            r0 = r15
            r1 = r16
            r2 = r3
            r3 = r17
            r4 = r18
            r6 = r11
            java.lang.Object r0 = m153748m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r12) goto L_0x00a1
            return r12
        L_0x00a1:
            r3 = r9
            r1 = r10
        L_0x00a3:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r6 = r0
            r5 = r1
            r1 = r3
        L_0x00ac:
            r3 = r14
            goto L_0x00b4
        L_0x00ae:
            r14 = r16
            r6 = r4
            r1 = r9
            r5 = r10
            goto L_0x00ac
        L_0x00b4:
            com.carrefour.fid.android.design.libs.pager.snapper.d r0 = r1.f94111a
            com.carrefour.fid.android.design.libs.pager.snapper.e r4 = r0.mo114135e()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r0 = r4.mo114170a()
            if (r0 != r5) goto L_0x00cb
            com.carrefour.fid.android.design.libs.pager.snapper.d r0 = r1.f94111a
            int r0 = r0.mo114134d(r5)
            if (r0 == 0) goto L_0x00e1
        L_0x00cb:
            r11.L$0 = r1
            r0 = 0
            r11.L$1 = r0
            r11.label = r13
            r2 = r1
            r7 = r11
            java.lang.Object r0 = r2.mo114159o(r3, r4, r5, r6, r7)
            if (r0 != r12) goto L_0x00db
            return r12
        L_0x00db:
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
        L_0x00e1:
            float r0 = r1.mo114154i(r6)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior.mo114155j(androidx.compose.foundation.gestures.l, int, float, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k */
    public final Integer mo114156k() {
        return (Integer) this.f94116f.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114157l(androidx.compose.foundation.gestures.C2201l r22, com.carrefour.fid.android.design.libs.pager.snapper.C37473e r23, int r24, float r25, boolean r26, kotlin.coroutines.C11045c<? super java.lang.Float> r27) {
        /*
            r21 = this;
            r8 = r21
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$1
            if (r3 == 0) goto L_0x001b
            r3 = r2
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$1 r3 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x0020
        L_0x001b:
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$1 r3 = new com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$1
            r3.<init>(r8, r2)
        L_0x0020:
            r7 = r3
            java.lang.Object r2 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r7.label
            r5 = 0
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r0 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r1 = r7.L$0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior r1 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior) r1
            kotlin.C11661u0.m45747n(r2)     // Catch:{ all -> 0x003d }
            r2 = r5
            goto L_0x00d3
        L_0x003d:
            r0 = move-exception
            r2 = r5
            goto L_0x00e5
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            kotlin.C11661u0.m45747n(r2)
            int r2 = r23.mo114170a()
            if (r2 != r0) goto L_0x0067
            com.carrefour.fid.android.design.libs.pager.snapper.d r2 = r8.f94111a
            int r3 = r23.mo114170a()
            int r2 = r2.mo114134d(r3)
            if (r2 != 0) goto L_0x0067
            float r0 = r8.mo114154i(r1)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x0067:
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r3.element = r1
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            r18 = 0
            if (r26 == 0) goto L_0x0087
            int r9 = r23.mo114170a()
            int r9 = r0 - r9
            int r9 = java.lang.Math.abs(r9)
            r10 = 2
            if (r9 < r10) goto L_0x0087
            r19 = r4
            goto L_0x0089
        L_0x0087:
            r19 = r18
        L_0x0089:
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r24)     // Catch:{ all -> 0x00e2 }
            r8.mo114160q(r9)     // Catch:{ all -> 0x00e2 }
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 28
            r17 = 0
            r10 = r25
            androidx.compose.animation.core.i r9 = androidx.compose.animation.core.C1980j.m8428c(r9, r10, r11, r13, r15, r16, r17)     // Catch:{ all -> 0x00e2 }
            androidx.compose.animation.core.v<java.lang.Float> r10 = r8.f94112b     // Catch:{ all -> 0x00e2 }
            r11 = 0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$2 r12 = new com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performDecayFling$2     // Catch:{ all -> 0x00e2 }
            if (r19 == 0) goto L_0x00a9
            r18 = r4
        L_0x00a9:
            r1 = r12
            r15 = r3
            r3 = r22
            r13 = r4
            r4 = r15
            r14 = r5
            r5 = r21
            r20 = r6
            r6 = r18
            r14 = r7
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00df }
            r0 = 2
            r1 = 0
            r14.L$0 = r8     // Catch:{ all -> 0x00df }
            r14.L$1 = r15     // Catch:{ all -> 0x00df }
            r14.label = r13     // Catch:{ all -> 0x00df }
            r13 = r14
            r2 = 0
            r14 = r0
            r0 = r15
            r15 = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m8084k(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00dd }
            r3 = r20
            if (r1 != r3) goto L_0x00d2
            return r3
        L_0x00d2:
            r1 = r8
        L_0x00d3:
            r1.mo114160q(r2)
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            r2 = 0
            goto L_0x00e4
        L_0x00e2:
            r0 = move-exception
            r2 = r5
        L_0x00e4:
            r1 = r8
        L_0x00e5:
            r1.mo114160q(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior.mo114157l(androidx.compose.foundation.gestures.l, com.carrefour.fid.android.design.libs.pager.snapper.e, int, float, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n */
    public final boolean mo114158n(C1964f<Float, C1983k> fVar, C37473e eVar, int i, C11300l<? super Float, Float> lVar) {
        int g = mo114152g(fVar.mo6829h().floatValue(), eVar, i);
        if (g == 0) {
            return false;
        }
        lVar.invoke(Float.valueOf((float) g));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114159o(androidx.compose.foundation.gestures.C2201l r26, com.carrefour.fid.android.design.libs.pager.snapper.C37473e r27, int r28, float r29, kotlin.coroutines.C11045c<? super java.lang.Float> r30) {
        /*
            r25 = this;
            r7 = r25
            r0 = r28
            r1 = r30
            boolean r2 = r1 instanceof com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$1
            if (r2 == 0) goto L_0x0019
            r2 = r1
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$1 r2 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$1 r2 = new com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$1
            r2.<init>(r7, r1)
        L_0x001e:
            r13 = r2
            java.lang.Object r1 = r13.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r13.label
            r14 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 != r8) goto L_0x003f
            java.lang.Object r0 = r13.L$1
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r2 = r13.L$0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior r2 = (com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior) r2
            kotlin.C11661u0.m45747n(r1)     // Catch:{ all -> 0x003b }
            r3 = r14
            goto L_0x00c5
        L_0x003b:
            r0 = move-exception
            r3 = r14
            goto L_0x00d4
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            int r1 = r27.mo114170a()
            r2 = 0
            if (r0 <= r1) goto L_0x005b
            int r1 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x005b
            goto L_0x0065
        L_0x005b:
            int r1 = r27.mo114170a()
            if (r0 > r1) goto L_0x0067
            int r1 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0067
        L_0x0065:
            r2 = r29
        L_0x0067:
            r12.element = r2
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r28)     // Catch:{ all -> 0x00d1 }
            r7.mo114160q(r1)     // Catch:{ all -> 0x00d1 }
            float r1 = r2.element     // Catch:{ all -> 0x00d1 }
            float r3 = r12.element     // Catch:{ all -> 0x00d1 }
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 28
            r24 = 0
            r16 = r1
            r17 = r3
            androidx.compose.animation.core.i r9 = androidx.compose.animation.core.C1980j.m8428c(r16, r17, r18, r20, r22, r23, r24)     // Catch:{ all -> 0x00d1 }
            com.carrefour.fid.android.design.libs.pager.snapper.d r1 = r7.f94111a     // Catch:{ all -> 0x00d1 }
            int r1 = r1.mo114134d(r0)     // Catch:{ all -> 0x00d1 }
            float r1 = (float) r1     // Catch:{ all -> 0x00d1 }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)     // Catch:{ all -> 0x00d1 }
            androidx.compose.animation.core.g<java.lang.Float> r11 = r7.f94113c     // Catch:{ all -> 0x00d1 }
            r16 = 0
            com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$2 r17 = new com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior$performSpringFling$2     // Catch:{ all -> 0x00d1 }
            r1 = r17
            r3 = r26
            r4 = r12
            r5 = r25
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00d1 }
            r0 = 4
            r1 = 0
            r13.L$0 = r7     // Catch:{ all -> 0x00d1 }
            r13.L$1 = r12     // Catch:{ all -> 0x00d1 }
            r13.label = r8     // Catch:{ all -> 0x00d1 }
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r2 = r12
            r12 = r17
            r3 = r14
            r14 = r0
            r0 = r15
            r15 = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m8086m(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00cf }
            if (r1 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r0 = r2
            r2 = r7
        L_0x00c5:
            r2.mo114160q(r3)
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x00cf:
            r0 = move-exception
            goto L_0x00d3
        L_0x00d1:
            r0 = move-exception
            r3 = r14
        L_0x00d3:
            r2 = r7
        L_0x00d4:
            r2.mo114160q(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior.mo114159o(androidx.compose.foundation.gestures.l, com.carrefour.fid.android.design.libs.pager.snapper.e, int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: q */
    public final void mo114160q(Integer num) {
        this.f94116f.setValue(num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapperFlingBehavior(C37472d dVar, C2013v vVar, C1968g<Float> gVar, C11305q<C37472d, Integer, Integer, Integer> qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (C2013v<Float>) vVar, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.f94117a.mo114167d() : gVar, (C11305q<? super C37472d, ? super Integer, ? super Integer, Integer>) (i & 8) != 0 ? SnapperFlingBehaviorDefaults.f94117a.mo114166c() : qVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior(@C12579k C37472d dVar, @C12579k C2013v<Float> vVar, @C12579k C1968g<Float> gVar, @C12579k C11305q<? super C37472d, ? super Integer, ? super Integer, Integer> qVar) {
        this(dVar, vVar, gVar, qVar, SnapperFlingBehaviorDefaults.f94117a.mo114165a());
        Intrinsics.checkNotNullParameter(dVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(gVar, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapperFlingBehavior(C37472d dVar, C2013v vVar, C1968g<Float> gVar, C11300l<C37472d, Float> lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (C2013v<Float>) vVar, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.f94117a.mo114167d() : gVar, (C11300l<? super C37472d, Float>) (i & 8) != 0 ? SnapperFlingBehaviorDefaults.f94117a.mo114165a() : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    public SnapperFlingBehavior(@C12579k C37472d dVar, @C12579k C2013v<Float> vVar, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super C37472d, Float> lVar) {
        this(dVar, vVar, gVar, SnapperFlingBehaviorDefaults.f94117a.mo114166c(), lVar);
        Intrinsics.checkNotNullParameter(dVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(gVar, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(lVar, "maximumFlingDistance");
    }
}
