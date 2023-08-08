package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.p004ui.geometry.C15098i;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", mo22502f = "ContentInViewModifier.kt", mo22503i = {}, mo22504l = {193}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", mo22502f = "ContentInViewModifier.kt", mo22503i = {}, mo22504l = {198}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/l;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1 */
    public static final class C21311 extends SuspendLambda implements C11304p<C2201l, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21311 r0 = new C21311(contentInViewModifier, B, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C2201l lVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C21311) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C2201l lVar = (C2201l) this.L$0;
                contentInViewModifier.f5839z.mo7527j(contentInViewModifier.mo7339x());
                UpdatableAnimationState g = contentInViewModifier.f5839z;
                final ContentInViewModifier contentInViewModifier = contentInViewModifier;
                final C11723c2 c2Var = B;
                C21321 r3 = new C11300l<Float, C11079d2>() {
                    /* renamed from: a */
                    public final void mo7347a(float f) {
                        float f2;
                        if (contentInViewModifier.f5831d) {
                            f2 = 1.0f;
                        } else {
                            f2 = -1.0f;
                        }
                        float a = f2 * lVar.mo7360a(f2 * f);
                        if (a < f) {
                            C11723c2 c2Var = c2Var;
                            C11968h2.m47690j(c2Var, "Scroll animation cancelled because scroll was not consumed (" + a + " < " + f + ')', (Throwable) null, 2, (Object) null);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo7347a(((Number) obj).floatValue());
                        return C11079d2.f28267a;
                    }
                };
                final ContentInViewModifier contentInViewModifier2 = contentInViewModifier;
                C21332 r7 = new C11289a<C11079d2>() {
                    public final void invoke() {
                        boolean z;
                        boolean z2;
                        BringIntoViewRequestPriorityQueue l = contentInViewModifier2.f5832e;
                        ContentInViewModifier contentInViewModifier = contentInViewModifier2;
                        while (true) {
                            z = true;
                            if (l.f5826a.mo15477m0()) {
                                C15098i invoke = ((ContentInViewModifier.C2129a) l.f5826a.mo15478n0()).mo7343b().invoke();
                                if (invoke == null) {
                                    z2 = true;
                                } else {
                                    z2 = ContentInViewModifier.m9176H(contentInViewModifier, invoke, 0, 1, (Object) null);
                                }
                                if (!z2) {
                                    break;
                                }
                                C12072o<C11079d2> a = ((ContentInViewModifier.C2129a) l.f5826a.mo15437D0(l.f5826a.mo15469h0() - 1)).mo7342a();
                                C11079d2 d2Var = C11079d2.f28267a;
                                Result.C10852a aVar = Result.f28060a;
                                a.resumeWith(Result.m38702b(d2Var));
                            } else {
                                break;
                            }
                        }
                        if (contentInViewModifier2.f5836w) {
                            C15098i m = contentInViewModifier2.mo7329E();
                            if (m == null || !ContentInViewModifier.m9176H(contentInViewModifier2, m, 0, 1, (Object) null)) {
                                z = false;
                            }
                            if (z) {
                                contentInViewModifier2.f5836w = false;
                            }
                        }
                        contentInViewModifier2.f5839z.mo7527j(contentInViewModifier2.mo7339x());
                    }
                };
                this.label = 1;
                if (g.mo7525h(r3, r7, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, C11045c<? super ContentInViewModifier$launchAnimation$1> cVar) {
        super(2, cVar);
        this.this$0 = contentInViewModifier;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, cVar);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        CancellationException cancellationException;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C11723c2 B = C11804f2.m46951B(((C12074o0) this.L$0).getCoroutineContext());
            this.this$0.f5838y = true;
            C2203n o = this.this$0.f5830c;
            final ContentInViewModifier contentInViewModifier = this.this$0;
            C21311 r7 = new C21311((C11045c<? super C21311>) null);
            this.label = 1;
            if (C2203n.m9563c(o, (MutatePriority) null, r7, this, 1, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            } catch (Throwable th) {
                this.this$0.f5838y = false;
                this.this$0.f5832e.mo7319b(cancellationException);
                this.this$0.f5836w = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f5832e.mo7324g();
        this.this$0.f5838y = false;
        this.this$0.f5832e.mo7319b((Throwable) null);
        this.this$0.f5836w = false;
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ContentInViewModifier$launchAnimation$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
