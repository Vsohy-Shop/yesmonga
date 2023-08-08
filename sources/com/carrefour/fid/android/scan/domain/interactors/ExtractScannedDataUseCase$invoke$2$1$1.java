package com.carrefour.fid.android.scan.domain.interactors;

import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nExtractScannedDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractScannedDataUseCase.kt\ncom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase$invoke$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final class ExtractScannedDataUseCase$invoke$2$1$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ C12072o<Result<String>> $continuation;
    final /* synthetic */ ExtractScannedDataUseCase.C28271a $param;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtractScannedDataUseCase$invoke$2$1$1(ExtractScannedDataUseCase.C28271a aVar, C12072o<? super Result<String>> oVar) {
        super(1);
        this.$param = aVar;
        this.$continuation = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        Throwable cause;
        if (!(th == null || (cause = th.getCause()) == null)) {
            C12072o<Result<String>> oVar = this.$continuation;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11661u0.m45734a(cause)));
        }
        this.$param.mo82223e().close();
    }
}
