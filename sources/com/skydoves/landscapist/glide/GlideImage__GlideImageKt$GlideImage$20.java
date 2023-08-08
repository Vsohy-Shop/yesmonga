package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.request.C22560g;
import com.skydoves.landscapist.C35334h;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.skydoves.landscapist.glide.GlideImage__GlideImageKt$GlideImage$20", mo22502f = "GlideImage.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$20 extends SuspendLambda implements C11300l<C11045c<? super C11907e<? extends C35334h>>, Object> {
    final /* synthetic */ BitmapPalette $bitmapPalette;
    final /* synthetic */ C22090i<Drawable> $builder;
    final /* synthetic */ Object $recomposeKey;
    final /* synthetic */ C22560g<Drawable> $requestListener;
    final /* synthetic */ C22092j $requestManager;
    int label;

    @C11067d(mo22501c = "com.skydoves.landscapist.glide.GlideImage__GlideImageKt$GlideImage$20$1", mo22502f = "GlideImage.kt", mo22503i = {}, mo22504l = {540}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
    /* renamed from: com.skydoves.landscapist.glide.GlideImage__GlideImageKt$GlideImage$20$1 */
    public static final class C353211 extends SuspendLambda implements C11304p<C11760r<? super C35334h>, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C353211 r0 = new C353211(bitmapPalette, obj2, jVar, iVar, gVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11760r<? super C35334h> rVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C353211) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            BitmapPalette bitmapPalette;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11760r rVar = (C11760r) this.L$0;
                C35323a aVar = new C35323a(rVar);
                BitmapPalette bitmapPalette2 = bitmapPalette;
                if (bitmapPalette2 == null) {
                    bitmapPalette = null;
                } else {
                    bitmapPalette = bitmapPalette2.mo105859c(obj2);
                }
                jVar.mo65603s(obj2).mo65688b(iVar).mo65701q1(new C35324b(rVar, bitmapPalette)).mo65701q1(gVar).mo65672H1(aVar);
                C353221 r1 = C353221.f86794f;
                this.label = 1;
                if (ProduceKt.m46525a(rVar, r1, this) == h) {
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
    public GlideImage__GlideImageKt$GlideImage$20(BitmapPalette bitmapPalette, Object obj, C22092j jVar, C22090i<Drawable> iVar, C22560g<Drawable> gVar, C11045c<? super GlideImage__GlideImageKt$GlideImage$20> cVar) {
        super(1, cVar);
        this.$bitmapPalette = bitmapPalette;
        this.$recomposeKey = obj;
        this.$requestManager = jVar;
        this.$builder = iVar;
        this.$requestListener = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new GlideImage__GlideImageKt$GlideImage$20(this.$bitmapPalette, this.$recomposeKey, this.$requestManager, this.$builder, this.$requestListener, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final BitmapPalette bitmapPalette = this.$bitmapPalette;
            final Object obj2 = this.$recomposeKey;
            final C22092j jVar = this.$requestManager;
            final C22090i<Drawable> iVar = this.$builder;
            final C22560g<Drawable> gVar = this.$requestListener;
            return C11909g.m47488s(new C353211((C11045c<? super C353211>) null));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11907e<? extends C35334h>> cVar) {
        return ((GlideImage__GlideImageKt$GlideImage$20) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
