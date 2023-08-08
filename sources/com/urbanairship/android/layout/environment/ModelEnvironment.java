package com.urbanairship.android.layout.environment;

import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.reporting.DisplayTimer;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ModelEnvironment {
    @C12579k

    /* renamed from: a */
    public final C35603k f87988a;
    @C12579k

    /* renamed from: b */
    public final C35606m f87989b;
    @C12579k

    /* renamed from: c */
    public final C35591a f87990c;
    @C12579k

    /* renamed from: d */
    public final DisplayTimer f87991d;
    @C12579k

    /* renamed from: e */
    public final C12074o0 f87992e;
    @C12579k

    /* renamed from: f */
    public final AttributeHandler f87993f;
    @C12579k

    /* renamed from: g */
    public final C35602j f87994g;
    @C12579k

    /* renamed from: h */
    public final C11907e<LayoutEvent> f87995h;

    @C11067d(mo22501c = "com.urbanairship.android.layout.environment.ModelEnvironment$1", mo22502f = "ModelEnvironment.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
    /* renamed from: com.urbanairship.android.layout.environment.ModelEnvironment$1 */
    public static final class C355871 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ ModelEnvironment this$0;

        /* renamed from: com.urbanairship.android.layout.environment.ModelEnvironment$1$a */
        public static final class C35588a<T> implements C11908f {

            /* renamed from: a */
            public final /* synthetic */ ModelEnvironment f87996a;

            public C35588a(ModelEnvironment modelEnvironment) {
                this.f87996a = modelEnvironment;
            }

            @C12580l
            /* renamed from: c */
            public final Object emit(@C12579k LayoutEvent.C35586b bVar, @C12579k C11045c<? super C11079d2> cVar) {
                this.f87996a.mo106634h().mo106647a(bVar.mo106619a(), bVar.mo106620b());
                return C11079d2.f28267a;
            }
        }

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C355871(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e g0 = C11909g.m47451g0(new ModelEnvironment$1$invokeSuspend$$inlined$filterIsInstance$1(this.this$0.mo106631e()));
                C35588a aVar = new C35588a(this.this$0);
                this.label = 1;
                if (g0.collect(aVar, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C355871) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    public ModelEnvironment(@C12579k C35603k kVar, @C12579k C35606m mVar, @C12579k C35591a aVar, @C12579k DisplayTimer displayTimer, @C12579k C12074o0 o0Var, @C12579k AttributeHandler attributeHandler, @C12579k C35602j jVar) {
        Intrinsics.checkNotNullParameter(kVar, "layoutState");
        Intrinsics.checkNotNullParameter(mVar, "reporter");
        Intrinsics.checkNotNullParameter(aVar, "actionsRunner");
        Intrinsics.checkNotNullParameter(displayTimer, "displayTimer");
        Intrinsics.checkNotNullParameter(o0Var, "modelScope");
        Intrinsics.checkNotNullParameter(attributeHandler, "attributeHandler");
        Intrinsics.checkNotNullParameter(jVar, "eventHandler");
        this.f87988a = kVar;
        this.f87989b = mVar;
        this.f87990c = aVar;
        this.f87991d = displayTimer;
        this.f87992e = o0Var;
        this.f87993f = attributeHandler;
        this.f87994g = jVar;
        this.f87995h = jVar.mo106657b();
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C355871(this, (C11045c<? super C355871>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: a */
    public final C35591a mo106627a() {
        return this.f87990c;
    }

    @C12579k
    /* renamed from: b */
    public final AttributeHandler mo106628b() {
        return this.f87993f;
    }

    @C12579k
    /* renamed from: c */
    public final DisplayTimer mo106629c() {
        return this.f87991d;
    }

    @C12579k
    /* renamed from: d */
    public final C35602j mo106630d() {
        return this.f87994g;
    }

    @C12579k
    /* renamed from: e */
    public final C11907e<LayoutEvent> mo106631e() {
        return this.f87995h;
    }

    @C12579k
    /* renamed from: f */
    public final C35603k mo106632f() {
        return this.f87988a;
    }

    @C12579k
    /* renamed from: g */
    public final C12074o0 mo106633g() {
        return this.f87992e;
    }

    @C12579k
    /* renamed from: h */
    public final C35606m mo106634h() {
        return this.f87989b;
    }

    @C12579k
    /* renamed from: i */
    public final ModelEnvironment mo106635i(@C12579k C35603k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "state");
        return new ModelEnvironment(kVar, this.f87989b, this.f87990c, this.f87991d, this.f87992e, this.f87993f, this.f87994g);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModelEnvironment(com.urbanairship.android.layout.environment.C35603k r11, com.urbanairship.android.layout.environment.C35606m r12, com.urbanairship.android.layout.environment.C35591a r13, com.urbanairship.android.layout.reporting.DisplayTimer r14, kotlinx.coroutines.C12074o0 r15, com.urbanairship.android.layout.environment.AttributeHandler r16, com.urbanairship.android.layout.environment.C35602j r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0018
            kotlinx.coroutines.m2 r0 = kotlinx.coroutines.C11768d1.m46783e()
            r2 = 1
            kotlinx.coroutines.a0 r2 = kotlinx.coroutines.C11719b3.m46155c(r1, r2, r1)
            kotlin.coroutines.CoroutineContext r0 = r0.mo7443Q(r2)
            kotlinx.coroutines.o0 r0 = kotlinx.coroutines.C12079p0.m48260a(r0)
            r7 = r0
            goto L_0x0019
        L_0x0018:
            r7 = r15
        L_0x0019:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0025
            com.urbanairship.android.layout.environment.AttributeHandler r0 = new com.urbanairship.android.layout.environment.AttributeHandler
            r2 = 3
            r0.<init>(r1, r1, r2, r1)
            r8 = r0
            goto L_0x0027
        L_0x0025:
            r8 = r16
        L_0x0027:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x0032
            com.urbanairship.android.layout.environment.j r0 = new com.urbanairship.android.layout.environment.j
            r0.<init>(r7)
            r9 = r0
            goto L_0x0034
        L_0x0032:
            r9 = r17
        L_0x0034:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.environment.ModelEnvironment.<init>(com.urbanairship.android.layout.environment.k, com.urbanairship.android.layout.environment.m, com.urbanairship.android.layout.environment.a, com.urbanairship.android.layout.reporting.DisplayTimer, kotlinx.coroutines.o0, com.urbanairship.android.layout.environment.AttributeHandler, com.urbanairship.android.layout.environment.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
