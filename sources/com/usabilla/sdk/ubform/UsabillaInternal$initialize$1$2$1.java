package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$2$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {602}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$initialize$1$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ C9848g $callback;
    final /* synthetic */ C10110e $recorder;
    int label;
    final /* synthetic */ UsabillaInternal this$0;

    @C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$2$1$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {395}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lcom/usabilla/sdk/ubform/eventengine/a;", "", "e", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$2$1$1 */
    public static final class C97301 extends SuspendLambda implements C11305q<C11908f<? super List<? extends C9831a>>, Throwable, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11908f<? super List<C9831a>> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
            C97301 r0 = new C97301(eVar, usabillaInternal, str, gVar, cVar);
            r0.L$0 = th;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                String localizedMessage = ((Throwable) this.L$0).getLocalizedMessage();
                Logger.Companion companion = Logger.f26647a;
                Intrinsics.checkNotNullExpressionValue(localizedMessage, C9874a.f27073r);
                companion.logError(localizedMessage);
                eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27809l, localizedMessage));
                eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27808k, C10108c.f27796U));
                eVar.stop();
                usabillaInternal.mo19868m0(str);
                CoroutineDispatcher a = usabillaInternal.f26663b.mo21561a();
                final C9848g gVar = gVar;
                C97311 r1 = new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C97311>) null) {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return 

                        /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$2$1$a */
                        public static final class C9732a implements C11908f<List<? extends C9831a>> {

                            /* renamed from: a */
                            public final /* synthetic */ C10110e f26700a;

                            /* renamed from: b */
                            public final /* synthetic */ UsabillaInternal f26701b;

                            /* renamed from: c */
                            public final /* synthetic */ String f26702c;

                            /* renamed from: d */
                            public final /* synthetic */ C9848g f26703d;

                            public C9732a(C10110e eVar, UsabillaInternal usabillaInternal, String str, C9848g gVar) {
                                this.f26700a = eVar;
                                this.f26701b = usabillaInternal;
                                this.f26702c = str;
                                this.f26703d = gVar;
                            }

                            @C12580l
                            public Object emit(Object obj, @C12579k C11045c cVar) {
                                this.f26700a.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27790O, C11064a.m42620f(((List) obj).size())));
                                this.f26700a.stop();
                                this.f26701b.mo19868m0(this.f26702c);
                                Object h = C11965h.m47673h(this.f26701b.f26663b.mo21561a(), new UsabillaInternal$initialize$1$2$1$2$1(this.f26703d, (C11045c<? super UsabillaInternal$initialize$1$2$1$2$1>) null), cVar);
                                if (h == C11063b.m42612h()) {
                                    return h;
                                }
                                return C11079d2.f28267a;
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public UsabillaInternal$initialize$1$2$1(UsabillaInternal usabillaInternal, C10110e eVar, String str, C9848g gVar, C11045c<? super UsabillaInternal$initialize$1$2$1> cVar) {
                            super(2, cVar);
                            this.this$0 = usabillaInternal;
                            this.$recorder = eVar;
                            this.$appId = str;
                            this.$callback = gVar;
                        }

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            return new UsabillaInternal$initialize$1$2$1(this.this$0, this.$recorder, this.$appId, this.$callback, cVar);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                CampaignManager Z = this.this$0.mo19844Z();
                                Intrinsics.checkNotNull(Z);
                                C11907e<List<C9831a>> g = Z.mo20741g();
                                final C10110e eVar = this.$recorder;
                                final UsabillaInternal usabillaInternal = this.this$0;
                                final String str = this.$appId;
                                final C9848g gVar = this.$callback;
                                C11907e<List<C9831a>> u = C11909g.m47494u(g, new C97301((C11045c<? super C97301>) null));
                                C9732a aVar = new C9732a(this.$recorder, this.this$0, this.$appId, this.$callback);
                                this.label = 1;
                                if (u.collect(aVar, this) == h) {
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
                            return ((UsabillaInternal$initialize$1$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }
                    }
