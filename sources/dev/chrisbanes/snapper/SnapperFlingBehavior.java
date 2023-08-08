package dev.chrisbanes.snapper;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10359a
@C8567o(parameters = 0)
public final class SnapperFlingBehavior implements C2195g {

    /* renamed from: g */
    public static final int f28000g = 0;
    @C12579k

    /* renamed from: a */
    public final C10368f f28001a;
    @C12579k

    /* renamed from: b */
    public final C2013v<Float> f28002b;
    @C12579k

    /* renamed from: c */
    public final C1968g<Float> f28003c;
    @C12579k

    /* renamed from: d */
    public final C11305q<C10368f, Integer, Integer, Integer> f28004d;
    @C12579k

    /* renamed from: e */
    public final C11300l<C10368f, Float> f28005e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f28006f;

    public SnapperFlingBehavior(C10368f fVar, C2013v<Float> vVar, C1968g<Float> gVar, C11305q<? super C10368f, ? super Integer, ? super Integer, Integer> qVar, C11300l<? super C10368f, Float> lVar) {
        this.f28001a = fVar;
        this.f28002b = vVar;
        this.f28003c = gVar;
        this.f28004d = qVar;
        this.f28005e = lVar;
        this.f28006f = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: m */
    public static /* synthetic */ Object m38596m(SnapperFlingBehavior snapperFlingBehavior, C2201l lVar, C10369g gVar, int i, float f, boolean z, C11045c cVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return snapperFlingBehavior.mo21779l(lVar, gVar, i, f, z, cVar);
    }

    /* renamed from: p */
    public static /* synthetic */ Object m38597p(SnapperFlingBehavior snapperFlingBehavior, C2201l lVar, C10369g gVar, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return snapperFlingBehavior.mo21781o(lVar, gVar, i, f, cVar);
    }

    @C12580l
    /* renamed from: a */
    public Object mo7354a(@C12579k C2201l lVar, float f, @C12579k C11045c<? super Float> cVar) {
        boolean z;
        int i;
        if (!this.f28001a.mo21753b() || !this.f28001a.mo21752a()) {
            return C11064a.m42619e(f);
        }
        C10370h hVar = C10370h.f28018a;
        float floatValue = this.f28005e.invoke(this.f28001a).floatValue();
        boolean z2 = true;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10369g e = this.f28001a.mo21756e();
            if (e == null) {
                return C11064a.m42619e(f);
            }
            int c = this.f28001a.mo21754c(f, this.f28002b, floatValue);
            C11305q<C10368f, Integer, Integer, Integer> qVar = this.f28004d;
            C10368f fVar = this.f28001a;
            if (f < 0.0f) {
                i = e.mo21792a() + 1;
            } else {
                i = e.mo21792a();
            }
            int intValue = qVar.invoke(fVar, C11064a.m42620f(i), C11064a.m42620f(c)).intValue();
            if (intValue < 0 || intValue >= this.f28001a.mo21759h()) {
                z2 = false;
            }
            if (z2) {
                return mo21777j(lVar, intValue, f, cVar);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
    }

    /* renamed from: g */
    public final int mo21774g(float f, C10369g gVar, int i) {
        if (f > 0.0f && gVar.mo21792a() >= i) {
            return this.f28001a.mo21755d(gVar.mo21792a());
        }
        if (f >= 0.0f || gVar.mo21792a() > i - 1) {
            return 0;
        }
        return this.f28001a.mo21755d(gVar.mo21792a() + 1);
    }

    /* renamed from: h */
    public final boolean mo21775h(C2013v<Float> vVar, float f, C10369g gVar) {
        if (Math.abs(f) < 0.5f) {
            return false;
        }
        float a = C2017x.m8654a(vVar, 0.0f, f);
        C10370h hVar = C10370h.f28018a;
        if (f < 0.0f) {
            if (a > ((float) this.f28001a.mo21755d(gVar.mo21792a()))) {
                return false;
            }
        } else if (a < ((float) this.f28001a.mo21755d(gVar.mo21792a() + 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final float mo21776i(float f) {
        if (f < 0.0f && !this.f28001a.mo21753b()) {
            return f;
        }
        if (f <= 0.0f || this.f28001a.mo21752a()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo21777j(androidx.compose.foundation.gestures.C2201l r17, int r18, float r19, kotlin.coroutines.C11045c<? super java.lang.Float> r20) {
        /*
            r16 = this;
            r9 = r16
            r10 = r18
            r11 = r19
            r0 = r20
            boolean r1 = r0 instanceof dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1
            if (r1 == 0) goto L_0x001b
            r1 = r0
            dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1 r1 = (dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001b
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x0020
        L_0x001b:
            dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1 r1 = new dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1
            r1.<init>(r9, r0)
        L_0x0020:
            r12 = r1
            java.lang.Object r0 = r12.result
            java.lang.Object r13 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r14 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0054
            if (r1 == r2) goto L_0x0042
            if (r1 != r14) goto L_0x003a
            java.lang.Object r1 = r12.L$0
            dev.chrisbanes.snapper.SnapperFlingBehavior r1 = (dev.chrisbanes.snapper.SnapperFlingBehavior) r1
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00e8
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            float r1 = r12.F$0
            int r2 = r12.I$0
            java.lang.Object r3 = r12.L$1
            androidx.compose.foundation.gestures.l r3 = (androidx.compose.foundation.gestures.C2201l) r3
            java.lang.Object r4 = r12.L$0
            dev.chrisbanes.snapper.SnapperFlingBehavior r4 = (dev.chrisbanes.snapper.SnapperFlingBehavior) r4
            kotlin.C11661u0.m45747n(r0)
            r11 = r1
            r15 = r3
            goto L_0x00ac
        L_0x0054:
            kotlin.C11661u0.m45747n(r0)
            dev.chrisbanes.snapper.f r0 = r9.f28001a
            dev.chrisbanes.snapper.g r3 = r0.mo21756e()
            if (r3 != 0) goto L_0x0064
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r19)
            return r0
        L_0x0064:
            int r0 = r3.mo21792a()
            if (r0 != r10) goto L_0x0081
            dev.chrisbanes.snapper.f r0 = r9.f28001a
            int r1 = r3.mo21792a()
            int r0 = r0.mo21755d(r1)
            if (r0 != 0) goto L_0x0081
            dev.chrisbanes.snapper.h r0 = dev.chrisbanes.snapper.C10370h.f28018a
            float r0 = r9.mo21776i(r11)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x0081:
            androidx.compose.animation.core.v<java.lang.Float> r0 = r9.f28002b
            boolean r0 = r9.mo21775h(r0, r11, r3)
            if (r0 == 0) goto L_0x00b7
            r5 = 0
            r7 = 8
            r8 = 0
            r12.L$0 = r9
            r15 = r17
            r12.L$1 = r15
            r12.I$0 = r10
            r12.F$0 = r11
            r12.label = r2
            r0 = r16
            r1 = r17
            r2 = r3
            r3 = r18
            r4 = r19
            r6 = r12
            java.lang.Object r0 = m38596m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r13) goto L_0x00aa
            return r13
        L_0x00aa:
            r4 = r9
            r2 = r10
        L_0x00ac:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r6 = r0
            r5 = r2
            r1 = r4
        L_0x00b5:
            r3 = r15
            goto L_0x00bd
        L_0x00b7:
            r15 = r17
            r1 = r9
            r5 = r10
            r6 = r11
            goto L_0x00b5
        L_0x00bd:
            dev.chrisbanes.snapper.f r0 = r1.f28001a
            dev.chrisbanes.snapper.g r4 = r0.mo21756e()
            if (r4 != 0) goto L_0x00ca
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r11)
            return r0
        L_0x00ca:
            int r0 = r4.mo21792a()
            if (r0 != r5) goto L_0x00d8
            dev.chrisbanes.snapper.f r0 = r1.f28001a
            int r0 = r0.mo21755d(r5)
            if (r0 == 0) goto L_0x00ee
        L_0x00d8:
            r12.L$0 = r1
            r0 = 0
            r12.L$1 = r0
            r12.label = r14
            r2 = r1
            r7 = r12
            java.lang.Object r0 = r2.mo21781o(r3, r4, r5, r6, r7)
            if (r0 != r13) goto L_0x00e8
            return r13
        L_0x00e8:
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
        L_0x00ee:
            float r0 = r1.mo21776i(r6)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.mo21777j(androidx.compose.foundation.gestures.l, int, float, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k */
    public final Integer mo21778k() {
        return (Integer) this.f28006f.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo21779l(androidx.compose.foundation.gestures.C2201l r22, dev.chrisbanes.snapper.C10369g r23, int r24, float r25, boolean r26, kotlin.coroutines.C11045c<? super java.lang.Float> r27) {
        /*
            r21 = this;
            r8 = r21
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1
            if (r3 == 0) goto L_0x001b
            r3 = r2
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1 r3 = (dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x0020
        L_0x001b:
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1 r3 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1
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
            dev.chrisbanes.snapper.SnapperFlingBehavior r1 = (dev.chrisbanes.snapper.SnapperFlingBehavior) r1
            kotlin.C11661u0.m45747n(r2)     // Catch:{ all -> 0x003d }
            r2 = r5
            goto L_0x00d7
        L_0x003d:
            r0 = move-exception
            r2 = r5
            goto L_0x00eb
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            kotlin.C11661u0.m45747n(r2)
            int r2 = r23.mo21792a()
            if (r2 != r0) goto L_0x0069
            dev.chrisbanes.snapper.f r2 = r8.f28001a
            int r3 = r23.mo21792a()
            int r2 = r2.mo21755d(r3)
            if (r2 != 0) goto L_0x0069
            dev.chrisbanes.snapper.h r0 = dev.chrisbanes.snapper.C10370h.f28018a
            float r0 = r8.mo21776i(r1)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x0069:
            dev.chrisbanes.snapper.h r2 = dev.chrisbanes.snapper.C10370h.f28018a
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r3.element = r1
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            r18 = 0
            if (r26 == 0) goto L_0x008b
            int r9 = r23.mo21792a()
            int r9 = r0 - r9
            int r9 = java.lang.Math.abs(r9)
            r10 = 2
            if (r9 < r10) goto L_0x008b
            r19 = r4
            goto L_0x008d
        L_0x008b:
            r19 = r18
        L_0x008d:
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r24)     // Catch:{ all -> 0x00e8 }
            r8.mo21782q(r9)     // Catch:{ all -> 0x00e8 }
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 28
            r17 = 0
            r10 = r25
            androidx.compose.animation.core.i r9 = androidx.compose.animation.core.C1980j.m8428c(r9, r10, r11, r13, r15, r16, r17)     // Catch:{ all -> 0x00e8 }
            androidx.compose.animation.core.v<java.lang.Float> r10 = r8.f28002b     // Catch:{ all -> 0x00e8 }
            r11 = 0
            dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$4 r12 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$4     // Catch:{ all -> 0x00e8 }
            if (r19 == 0) goto L_0x00ad
            r18 = r4
        L_0x00ad:
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
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e5 }
            r0 = 2
            r1 = 0
            r14.L$0 = r8     // Catch:{ all -> 0x00e5 }
            r14.L$1 = r15     // Catch:{ all -> 0x00e5 }
            r14.label = r13     // Catch:{ all -> 0x00e5 }
            r13 = r14
            r2 = 0
            r14 = r0
            r0 = r15
            r15 = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m8084k(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00e3 }
            r3 = r20
            if (r1 != r3) goto L_0x00d6
            return r3
        L_0x00d6:
            r1 = r8
        L_0x00d7:
            r1.mo21782q(r2)
            dev.chrisbanes.snapper.h r1 = dev.chrisbanes.snapper.C10370h.f28018a
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x00e3:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            r2 = 0
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            r2 = r5
        L_0x00ea:
            r1 = r8
        L_0x00eb:
            r1.mo21782q(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.mo21779l(androidx.compose.foundation.gestures.l, dev.chrisbanes.snapper.g, int, float, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n */
    public final boolean mo21780n(C1964f<Float, C1983k> fVar, C10369g gVar, int i, C11300l<? super Float, Float> lVar) {
        C10370h hVar = C10370h.f28018a;
        int g = mo21774g(fVar.mo6829h().floatValue(), gVar, i);
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
    public final java.lang.Object mo21781o(androidx.compose.foundation.gestures.C2201l r26, dev.chrisbanes.snapper.C10369g r27, int r28, float r29, kotlin.coroutines.C11045c<? super java.lang.Float> r30) {
        /*
            r25 = this;
            r7 = r25
            r0 = r28
            r1 = r30
            boolean r2 = r1 instanceof dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1
            if (r2 == 0) goto L_0x0019
            r2 = r1
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1 r2 = (dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001e
        L_0x0019:
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1 r2 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1
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
            dev.chrisbanes.snapper.SnapperFlingBehavior r2 = (dev.chrisbanes.snapper.SnapperFlingBehavior) r2
            kotlin.C11661u0.m45747n(r1)     // Catch:{ all -> 0x003b }
            r3 = r14
            goto L_0x00c7
        L_0x003b:
            r0 = move-exception
            r3 = r14
            goto L_0x00d8
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            dev.chrisbanes.snapper.h r1 = dev.chrisbanes.snapper.C10370h.f28018a
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            int r1 = r27.mo21792a()
            r2 = 0
            if (r0 <= r1) goto L_0x005d
            int r1 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            int r1 = r27.mo21792a()
            if (r0 > r1) goto L_0x0069
            int r1 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0069
        L_0x0067:
            r2 = r29
        L_0x0069:
            r12.element = r2
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r28)     // Catch:{ all -> 0x00d5 }
            r7.mo21782q(r1)     // Catch:{ all -> 0x00d5 }
            float r1 = r2.element     // Catch:{ all -> 0x00d5 }
            float r3 = r12.element     // Catch:{ all -> 0x00d5 }
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 28
            r24 = 0
            r16 = r1
            r17 = r3
            androidx.compose.animation.core.i r9 = androidx.compose.animation.core.C1980j.m8428c(r16, r17, r18, r20, r22, r23, r24)     // Catch:{ all -> 0x00d5 }
            dev.chrisbanes.snapper.f r1 = r7.f28001a     // Catch:{ all -> 0x00d5 }
            int r1 = r1.mo21755d(r0)     // Catch:{ all -> 0x00d5 }
            float r1 = (float) r1     // Catch:{ all -> 0x00d5 }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)     // Catch:{ all -> 0x00d5 }
            androidx.compose.animation.core.g<java.lang.Float> r11 = r7.f28003c     // Catch:{ all -> 0x00d5 }
            r16 = 0
            dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$3 r17 = new dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$3     // Catch:{ all -> 0x00d5 }
            r1 = r17
            r3 = r26
            r4 = r12
            r5 = r25
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00d5 }
            r0 = 4
            r1 = 0
            r13.L$0 = r7     // Catch:{ all -> 0x00d5 }
            r13.L$1 = r12     // Catch:{ all -> 0x00d5 }
            r13.label = r8     // Catch:{ all -> 0x00d5 }
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
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m8086m(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00d3 }
            if (r1 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            r0 = r2
            r2 = r7
        L_0x00c7:
            r2.mo21782q(r3)
            dev.chrisbanes.snapper.h r1 = dev.chrisbanes.snapper.C10370h.f28018a
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r0)
            return r0
        L_0x00d3:
            r0 = move-exception
            goto L_0x00d7
        L_0x00d5:
            r0 = move-exception
            r3 = r14
        L_0x00d7:
            r2 = r7
        L_0x00d8:
            r2.mo21782q(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.mo21781o(androidx.compose.foundation.gestures.l, dev.chrisbanes.snapper.g, int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: q */
    public final void mo21782q(Integer num) {
        this.f28006f.setValue(num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapperFlingBehavior(C10368f fVar, C2013v vVar, C1968g<Float> gVar, C11305q<C10368f, Integer, Integer, Integer> qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (C2013v<Float>) vVar, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.f28007a.mo21789d() : gVar, (C11305q<? super C10368f, ? super Integer, ? super Integer, Integer>) (i & 8) != 0 ? SnapperFlingBehaviorDefaults.f28007a.mo21788c() : qVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior(@C12579k C10368f fVar, @C12579k C2013v<Float> vVar, @C12579k C1968g<Float> gVar, @C12579k C11305q<? super C10368f, ? super Integer, ? super Integer, Integer> qVar) {
        this(fVar, vVar, gVar, qVar, SnapperFlingBehaviorDefaults.f28007a.mo21787a());
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(gVar, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapperFlingBehavior(C10368f fVar, C2013v vVar, C1968g<Float> gVar, C11300l<C10368f, Float> lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (C2013v<Float>) vVar, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.f28007a.mo21789d() : gVar, (C11300l<? super C10368f, Float>) (i & 8) != 0 ? SnapperFlingBehaviorDefaults.f28007a.mo21787a() : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    public SnapperFlingBehavior(@C12579k C10368f fVar, @C12579k C2013v<Float> vVar, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super C10368f, Float> lVar) {
        this(fVar, vVar, gVar, SnapperFlingBehaviorDefaults.f28007a.mo21788c(), lVar);
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(gVar, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(lVar, "maximumFlingDistance");
    }
}
