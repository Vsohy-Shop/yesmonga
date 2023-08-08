package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", mo22502f = "Transformable.kt", mo22503i = {}, mo22504l = {91}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TransformableKt$transformable$2$block$1$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11744g<C2205o> $channel;
    final /* synthetic */ C8578k2<Boolean> $updatePanZoomLock;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", mo22502f = "Transformable.kt", mo22503i = {}, mo22504l = {92}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1 */
    public static final class C21781 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21781 r0 = new C21781(e0Var, k2Var, gVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C12074o0 o0Var = (C12074o0) this.L$0;
                C15472e0 e0Var = e0Var;
                final C8578k2<Boolean> k2Var = k2Var;
                final C11744g<C2205o> gVar = gVar;
                C21791 r3 = new C11304p<C15465c, C11045c<? super C11079d2>, Object>((C11045c<? super C21791>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C21791 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TransformableKt$transformable$2$block$1$1(C8578k2<Boolean> k2Var, C11744g<C2205o> gVar, C11045c<? super TransformableKt$transformable$2$block$1$1> cVar) {
                            super(2, cVar);
                            this.$updatePanZoomLock = k2Var;
                            this.$channel = gVar;
                        }

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.$updatePanZoomLock, this.$channel, cVar);
                            transformableKt$transformable$2$block$1$1.L$0 = obj;
                            return transformableKt$transformable$2$block$1$1;
                        }

                        @C12580l
                        /* renamed from: g */
                        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
                            return ((TransformableKt$transformable$2$block$1$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                final C15472e0 e0Var = (C15472e0) this.L$0;
                                final C8578k2<Boolean> k2Var = this.$updatePanZoomLock;
                                final C11744g<C2205o> gVar = this.$channel;
                                C21781 r1 = new C21781((C11045c<? super C21781>) null);
                                this.label = 1;
                                if (C12079p0.m48266g(r1, this) == h) {
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
