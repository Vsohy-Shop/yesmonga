package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8700z0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$CarouselWithPreview$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C8700z0<C36983e> $detailUrl$delegate;
    final /* synthetic */ List<String> $detailedUrls;
    final /* synthetic */ C11300l<Integer, C11079d2> $onImageClick;
    final /* synthetic */ List<String> $urls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$CarouselWithPreview$1(C11300l<? super Integer, C11079d2> lVar, List<String> list, List<String> list2, C8700z0<C36983e> z0Var) {
        super(1);
        this.$onImageClick = lVar;
        this.$detailedUrls = list;
        this.$urls = list2;
        this.$detailUrl$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo111975a(int i) {
        Object obj;
        C8700z0<C36983e> z0Var = this.$detailUrl$delegate;
        List<String> list = this.$detailedUrls;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(new C36983e(list.get(i), i));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        List<String> list2 = this.$urls;
        if (Result.m38705e(obj) != null) {
            obj = new C36983e(list2.get(i), i);
        }
        CarouselComponentKt.m151351d(z0Var, (C36983e) obj);
        C11300l<Integer, C11079d2> lVar = this.$onImageClick;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo111975a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
