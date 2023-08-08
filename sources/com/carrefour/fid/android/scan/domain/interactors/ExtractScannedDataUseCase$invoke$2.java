package com.carrefour.fid.android.scan.domain.interactors;

import android.media.Image;
import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31037f;
import com.google.android.gms.tasks.C31047k;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.common.C34025b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2", mo22502f = "ExtractScannedDataUseCase.kt", mo22503i = {0}, mo22504l = {82}, mo22505m = "invokeSuspend", mo22506n = {"inputImage"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nExtractScannedDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractScannedDataUseCase.kt\ncom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase$invoke$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,81:1\n314#2,11:82\n*S KotlinDebug\n*F\n+ 1 ExtractScannedDataUseCase.kt\ncom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase$invoke$2\n*L\n38#1:82,11\n*E\n"})
public final class ExtractScannedDataUseCase$invoke$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Result<? extends String>>, Object> {
    final /* synthetic */ Image $image;
    final /* synthetic */ ExtractScannedDataUseCase.C28271a $param;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ExtractScannedDataUseCase this$0;

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2$a */
    public static final class C28273a implements C31037f {

        /* renamed from: a */
        public final /* synthetic */ C12072o<Result<String>> f68436a;

        public C28273a(C12072o<? super Result<String>> oVar) {
            this.f68436a = oVar;
        }

        public final void onFailure(@C12579k Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "exception");
            C12072o<Result<String>> oVar = this.f68436a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11661u0.m45734a(exc)));
        }
    }

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2$b */
    public static final class C28274b<TResult> implements C31035e {

        /* renamed from: a */
        public final /* synthetic */ ExtractScannedDataUseCase.C28271a f68437a;

        public C28274b(ExtractScannedDataUseCase.C28271a aVar) {
            this.f68437a = aVar;
        }

        public final void onComplete(@C12579k C31047k<List<C33982a>> kVar) {
            Intrinsics.checkNotNullParameter(kVar, "it");
            Image image = this.f68437a.mo82223e().getImage();
            if (image != null) {
                image.close();
            }
            this.f68437a.mo82223e().close();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtractScannedDataUseCase$invoke$2(Image image, ExtractScannedDataUseCase.C28271a aVar, ExtractScannedDataUseCase extractScannedDataUseCase, C11045c<? super ExtractScannedDataUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.$image = image;
        this.$param = aVar;
        this.this$0 = extractScannedDataUseCase;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ExtractScannedDataUseCase$invoke$2(this.$image, this.$param, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C34025b e = C34025b.m136897e(this.$image, this.$param.mo82223e().mo4977q3().mo5102c());
            Intrinsics.checkNotNullExpressionValue(e, "fromMediaImage(\n        …tionDegrees\n            )");
            ExtractScannedDataUseCase extractScannedDataUseCase = this.this$0;
            ExtractScannedDataUseCase.C28271a aVar = this.$param;
            this.L$0 = e;
            this.L$1 = extractScannedDataUseCase;
            this.L$2 = aVar;
            this.label = 1;
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(this), 1);
            pVar.mo24537e0();
            pVar.mo24529C(new ExtractScannedDataUseCase$invoke$2$1$1(aVar, pVar));
            extractScannedDataUseCase.f68431a.mo98914A(e).mo87727k(new ExtractScannedDataUseCase.C28272b(new ExtractScannedDataUseCase$invoke$2$1$2(aVar, pVar))).mo87724h(new C28273a(pVar)).mo87721e(new C28274b(aVar));
            obj = pVar.mo24572y();
            if (obj == C11063b.m42612h()) {
                C11069f.m42638c(this);
            }
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            ExtractScannedDataUseCase.C28271a aVar2 = (ExtractScannedDataUseCase.C28271a) this.L$2;
            ExtractScannedDataUseCase extractScannedDataUseCase2 = (ExtractScannedDataUseCase) this.L$1;
            C34025b bVar = (C34025b) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Result<String>> cVar) {
        return ((ExtractScannedDataUseCase$invoke$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
