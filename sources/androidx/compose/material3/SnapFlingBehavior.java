package androidx.compose.material3;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.C2570o;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8773n;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16500q;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C11363r0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
public final class SnapFlingBehavior implements C2195g {
    @C12579k

    /* renamed from: a */
    public final LazyListState f19723a;
    @C12579k

    /* renamed from: b */
    public final C2013v<Float> f19724b;
    @C12579k

    /* renamed from: c */
    public final C1968g<Float> f19725c;
    @C12579k

    /* renamed from: d */
    public final C16479d f19726d;

    /* renamed from: e */
    public final float f19727e;
    @C12579k

    /* renamed from: f */
    public C8111a f19728f = new C8111a(this);

    /* renamed from: g */
    public final float f19729g = 1.0f;

    /* renamed from: h */
    public final float f19730h = C16483g.m74435M((float) 400);

    /* renamed from: androidx.compose.material3.SnapFlingBehavior$a */
    public static final class C8111a implements C8773n {

        /* renamed from: a */
        public final /* synthetic */ SnapFlingBehavior f19731a;

        public C8111a(SnapFlingBehavior snapFlingBehavior) {
            this.f19731a = snapFlingBehavior;
        }

        @C12579k
        /* renamed from: Q */
        public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
            return C8773n.C8774a.m32645d(this, coroutineContext);
        }

        @C12580l
        /* renamed from: b */
        public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
            return C8773n.C8774a.m32643b(this, bVar);
        }

        @C12579k
        /* renamed from: f */
        public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
            return C8773n.C8774a.m32644c(this, bVar);
        }

        /* renamed from: l */
        public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C8773n.C8774a.m32642a(this, r, pVar);
        }

        /* renamed from: w */
        public float mo7447w() {
            return this.f19731a.f19729g;
        }
    }

    public SnapFlingBehavior(@C12579k LazyListState lazyListState, @C12579k C2013v<Float> vVar, @C12579k C1968g<Float> gVar, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(gVar, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f19723a = lazyListState;
        this.f19724b = vVar;
        this.f19725c = gVar;
        this.f19726d = dVar;
        this.f19727e = dVar.mo7425g5(this.f19730h);
    }

    /* renamed from: m */
    public static final void m26309m(C1964f<Float, C1983k> fVar, C2201l lVar, float f) {
        if (Math.abs(f - lVar.mo7360a(f)) > 0.5f) {
            fVar.mo6822a();
        }
    }

    /* renamed from: t */
    public static final C11457f<Float> m26310t(LazyListState lazyListState, SnapFlingBehavior snapFlingBehavior) {
        C2570o u = lazyListState.mo8343u();
        List<C2517l> i = u.mo8378i();
        int size = i.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < size; i2++) {
            float o = snapFlingBehavior.mo11974o(u, i.get(i2));
            if (o <= 0.0f && o > f) {
                f = o;
            }
            if (o >= 0.0f && o < f2) {
                f2 = o;
            }
        }
        return C11478t.m44305e(f, f2);
    }

    /* renamed from: u */
    public static final boolean m26311u(float f) {
        if (!(f == Float.POSITIVE_INFINITY)) {
            if (!(f == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11968A(androidx.compose.foundation.gestures.C2201l r18, float r19, float r20, kotlin.coroutines.C11045c<? super androidx.compose.material3.C8190e<java.lang.Float, androidx.compose.animation.core.C1983k>> r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.material3.SnapFlingBehavior$runApproach$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = (androidx.compose.material3.SnapFlingBehavior$runApproach$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = new androidx.compose.material3.SnapFlingBehavior$runApproach$1
            r1.<init>(r6, r0)
        L_0x001c:
            r5 = r1
            java.lang.Object r0 = r5.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r1 = r5.L$0
            androidx.compose.material3.SnapFlingBehavior r1 = (androidx.compose.material3.SnapFlingBehavior) r1
            kotlin.C11661u0.m45747n(r0)
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            kotlin.C11661u0.m45747n(r0)
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r20
            androidx.compose.animation.core.i r3 = androidx.compose.animation.core.C1980j.m8428c(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.v<java.lang.Float> r4 = r6.f19724b
            r5.L$0 = r6
            r5.label = r2
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r0 = r0.mo11972l(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0060
            return r7
        L_0x0060:
            r1 = r6
        L_0x0061:
            androidx.compose.material3.e r0 = (androidx.compose.material3.C8190e) r0
            androidx.compose.animation.core.i r0 = r0.mo12553b()
            java.lang.Object r2 = r0.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.foundation.lazy.LazyListState r3 = r1.f19723a
            float r1 = r1.mo11978s(r2, r3)
            androidx.compose.material3.e r2 = new androidx.compose.material3.e
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11968A(androidx.compose.foundation.gestures.l, float, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: B */
    public final Object mo11969B(C2201l lVar, float f, C11045c<? super C8190e<Float, C1983k>> cVar) {
        float s = mo11978s(0.0f, this.f19723a);
        return mo11973n(lVar, s, s, C1980j.m8428c(0.0f, f, 0, 0, false, 28, (Object) null), this.f19725c, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7354a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2201l r5, float r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            r0.label = r3
            java.lang.Object r7 = r4.mo11979v(r5, r6, r0)
            if (r7 != r1) goto L_0x003d
            return r1
        L_0x003d:
            androidx.compose.material3.e r7 = (androidx.compose.material3.C8190e) r7
            java.lang.Object r5 = r7.mo12552a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.i r6 = r7.mo12553b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            java.lang.Object r5 = r6.mo6848i()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L_0x0061:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo7354a(androidx.compose.foundation.gestures.l, float, kotlin.coroutines.c):java.lang.Object");
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!Intrinsics.areEqual((Object) snapFlingBehavior.f19725c, (Object) this.f19725c) || !Intrinsics.areEqual((Object) snapFlingBehavior.f19724b, (Object) this.f19724b) || !Intrinsics.areEqual((Object) snapFlingBehavior.f19723a, (Object) this.f19723a) || !Intrinsics.areEqual((Object) snapFlingBehavior.f19726d, (Object) this.f19726d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((0 + this.f19725c.hashCode()) * 31) + this.f19724b.hashCode()) * 31) + this.f19723a.hashCode()) * 31) + this.f19726d.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11972l(androidx.compose.foundation.gestures.C2201l r6, float r7, androidx.compose.animation.core.C1976i<java.lang.Float, androidx.compose.animation.core.C1983k> r8, androidx.compose.animation.core.C2013v<java.lang.Float> r9, kotlin.coroutines.C11045c<? super androidx.compose.material3.C8190e<java.lang.Float, androidx.compose.animation.core.C1983k>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = (androidx.compose.material3.SnapFlingBehavior$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r7 = r0.F$0
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r6 = (kotlin.jvm.internal.Ref.FloatRef) r6
            java.lang.Object r8 = r0.L$0
            androidx.compose.animation.core.i r8 = (androidx.compose.animation.core.C1976i) r8
            kotlin.C11661u0.m45747n(r10)
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r8.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r2 = r2 ^ r3
            androidx.compose.material3.SnapFlingBehavior$animateDecay$2 r4 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$2
            r4.<init>(r7, r5, r10, r6)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.F$0 = r7
            r0.label = r3
            java.lang.Object r6 = androidx.compose.animation.core.SuspendAnimationKt.m8083j(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r6 = r10
        L_0x006b:
            androidx.compose.material3.e r9 = new androidx.compose.material3.e
            float r6 = r6.element
            float r7 = r7 - r6
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11972l(androidx.compose.foundation.gestures.l, float, androidx.compose.animation.core.i, androidx.compose.animation.core.v, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11973n(androidx.compose.foundation.gestures.C2201l r14, float r15, float r16, androidx.compose.animation.core.C1976i<java.lang.Float, androidx.compose.animation.core.C1983k> r17, androidx.compose.animation.core.C1968g<java.lang.Float> r18, kotlin.coroutines.C11045c<? super androidx.compose.material3.C8190e<java.lang.Float, androidx.compose.animation.core.C1983k>> r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = (androidx.compose.material3.SnapFlingBehavior$animateSnap$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            r2.<init>(r13, r1)
        L_0x001b:
            r8 = r2
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            float r2 = r8.F$1
            float r3 = r8.F$0
            java.lang.Object r4 = r8.L$2
            kotlin.jvm.internal.Ref$FloatRef r4 = (kotlin.jvm.internal.Ref.FloatRef) r4
            java.lang.Object r5 = r8.L$1
            androidx.compose.animation.core.i r5 = (androidx.compose.animation.core.C1976i) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.material3.SnapFlingBehavior r6 = (androidx.compose.material3.SnapFlingBehavior) r6
            kotlin.C11661u0.m45747n(r1)
            r11 = r3
            r1 = r5
            goto L_0x0098
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Object r3 = r17.mo6848i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r15)
            java.lang.Object r3 = r17.mo6848i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x006e
            r3 = r4
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            r6 = r3 ^ 1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$2 r7 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$2
            r3 = r14
            r10 = r16
            r7.<init>(r13, r10, r1, r14)
            r8.L$0 = r0
            r10 = r17
            r8.L$1 = r10
            r8.L$2 = r1
            r11 = r15
            r8.F$0 = r11
            r8.F$1 = r9
            r8.label = r4
            r3 = r17
            r4 = r5
            r5 = r18
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.m8085l(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x0094
            return r2
        L_0x0094:
            r6 = r0
            r4 = r1
            r2 = r9
            r1 = r10
        L_0x0098:
            java.lang.Object r3 = r1.mo6848i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r6.mo11975p(r3, r2)
            androidx.compose.material3.e r12 = new androidx.compose.material3.e
            float r2 = r4.element
            float r11 = r11 - r2
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r11)
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 29
            r10 = 0
            androidx.compose.animation.core.i r1 = androidx.compose.animation.core.C1980j.m8432g(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.<init>(r11, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11973n(androidx.compose.foundation.gestures.l, float, float, androidx.compose.animation.core.i, androidx.compose.animation.core.g, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: o */
    public final float mo11974o(C2570o oVar, C2517l lVar) {
        float x = (float) ((mo11981x(oVar) - oVar.mo8375f()) - oVar.mo8372c());
        float f = (float) 2;
        return ((float) lVar.getOffset()) - ((x / f) - (((float) lVar.getSize()) / f));
    }

    /* renamed from: p */
    public final float mo11975p(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? C11479u.m44310A(f, f2) : C11479u.m44444t(f, f2);
    }

    /* renamed from: q */
    public final <T extends Comparable<? super T>> T mo11976q(C11457f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.getStart();
    }

    /* renamed from: r */
    public final <T extends Comparable<? super T>> T mo11977r(C11457f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.mo23013q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r0)) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo11978s(float r6, androidx.compose.foundation.lazy.LazyListState r7) {
        /*
            r5 = this;
            kotlin.ranges.f r7 = m26310t(r7, r5)
            java.lang.Comparable r0 = r5.mo11976q(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r7 = r5.mo11977r(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = java.lang.Math.signum(r6)
            r1 = 0
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0025
            r2 = r3
            goto L_0x0026
        L_0x0025:
            r2 = r4
        L_0x0026:
            if (r2 == 0) goto L_0x0035
            float r6 = java.lang.Math.abs(r7)
            float r2 = java.lang.Math.abs(r0)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            goto L_0x0040
        L_0x0035:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x003d
            r2 = r3
            goto L_0x003e
        L_0x003d:
            r2 = r4
        L_0x003e:
            if (r2 == 0) goto L_0x0042
        L_0x0040:
            r0 = r7
            goto L_0x004e
        L_0x0042:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r3 = r4
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            boolean r6 = m26311u(r0)
            if (r6 == 0) goto L_0x0055
            r1 = r0
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11978s(float, androidx.compose.foundation.lazy.LazyListState):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11979v(androidx.compose.foundation.gestures.C2201l r6, float r7, kotlin.coroutines.C11045c<? super androidx.compose.material3.C8190e<java.lang.Float, androidx.compose.animation.core.C1983k>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$fling$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r8)
            androidx.compose.material3.SnapFlingBehavior$a r8 = r5.f19728f
            androidx.compose.material3.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.material3.SnapFlingBehavior$fling$result$1
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.C11965h.m47673h(r8, r2, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            androidx.compose.material3.e r8 = (androidx.compose.material3.C8190e) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11979v(androidx.compose.foundation.gestures.l, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: w */
    public final float mo11980w() {
        if (!(!mo11982y().isEmpty())) {
            return 0.0f;
        }
        List<C2517l> y = mo11982y();
        int size = y.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += y.get(i2).getSize();
        }
        return ((float) i) / ((float) mo11982y().size());
    }

    /* renamed from: x */
    public final int mo11981x(C2570o oVar) {
        return oVar.mo8370a() == Orientation.Vertical ? C16500q.m74659j(oVar.mo8371b()) : C16500q.m74662m(oVar.mo8371b());
    }

    /* renamed from: y */
    public final List<C2517l> mo11982y() {
        return this.f19723a.mo8343u().mo8378i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1 A[PHI: r3 
      PHI: (r3v2 java.lang.Object) = (r3v5 java.lang.Object), (r3v1 java.lang.Object) binds: [B:25:0x00ae, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11983z(androidx.compose.foundation.gestures.C2201l r23, float r24, kotlin.coroutines.C11045c<? super androidx.compose.material3.C8190e<java.lang.Float, androidx.compose.animation.core.C1983k>> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof androidx.compose.material3.SnapFlingBehavior$longSnap$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = (androidx.compose.material3.SnapFlingBehavior$longSnap$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = new androidx.compose.material3.SnapFlingBehavior$longSnap$1
            r4.<init>(r0, r3)
        L_0x0020:
            r11 = r4
            java.lang.Object r3 = r11.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r11.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x004b
            if (r5 == r7) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            kotlin.C11661u0.m45747n(r3)
            goto L_0x00b1
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003e:
            java.lang.Object r1 = r11.L$1
            androidx.compose.foundation.gestures.l r1 = (androidx.compose.foundation.gestures.C2201l) r1
            java.lang.Object r2 = r11.L$0
            androidx.compose.material3.SnapFlingBehavior r2 = (androidx.compose.material3.SnapFlingBehavior) r2
            kotlin.C11661u0.m45747n(r3)
            r5 = r2
            goto L_0x007f
        L_0x004b:
            kotlin.C11661u0.m45747n(r3)
            androidx.compose.animation.core.v<java.lang.Float> r3 = r0.f19724b
            r5 = 0
            float r3 = androidx.compose.animation.core.C2017x.m8654a(r3, r5, r2)
            float r3 = java.lang.Math.abs(r3)
            float r8 = r22.mo11980w()
            float r3 = r3 - r8
            float r3 = kotlin.ranges.C11479u.m44444t(r3, r5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0068
            r5 = r7
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            if (r5 == 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            float r5 = java.lang.Math.signum(r24)
            float r3 = r3 * r5
        L_0x0071:
            r11.L$0 = r0
            r11.L$1 = r1
            r11.label = r7
            java.lang.Object r3 = r0.mo11968A(r1, r3, r2, r11)
            if (r3 != r4) goto L_0x007e
            return r4
        L_0x007e:
            r5 = r0
        L_0x007f:
            androidx.compose.material3.e r3 = (androidx.compose.material3.C8190e) r3
            java.lang.Object r2 = r3.mo12552a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            androidx.compose.animation.core.i r12 = r3.mo12553b()
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            androidx.compose.animation.core.i r9 = androidx.compose.animation.core.C1980j.m8432g(r12, r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.animation.core.g<java.lang.Float> r10 = r5.f19725c
            r2 = 0
            r11.L$0 = r2
            r11.L$1 = r2
            r11.label = r6
            r6 = r1
            r7 = r8
            java.lang.Object r3 = r5.mo11973n(r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto L_0x00b1
            return r4
        L_0x00b1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.mo11983z(androidx.compose.foundation.gestures.l, float, kotlin.coroutines.c):java.lang.Object");
    }
}
