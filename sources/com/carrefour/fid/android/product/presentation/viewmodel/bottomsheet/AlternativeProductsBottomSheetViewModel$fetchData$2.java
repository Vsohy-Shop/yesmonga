package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$fetchData$2", mo22502f = "AlternativeProductsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {54, 56}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AlternativeProductsBottomSheetViewModel$fetchData$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $gtin;
    int label;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel this$0;

    @C11363r0({"SMAP\nAlternativeProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel$fetchData$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,113:1\n230#2,5:114\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel$fetchData$2$1\n*L\n59#1:114,5\n62#1:119,5\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$fetchData$2$a */
    public static final class C28102a implements C11908f<Result<? extends List<? extends C38114b>>> {

        /* renamed from: a */
        public final /* synthetic */ AlternativeProductsBottomSheetViewModel f68074a;

        public C28102a(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel) {
            this.f68074a = alternativeProductsBottomSheetViewModel;
        }

        @C12580l
        public final Object emit(@C12579k Object obj, @C12579k C11045c<? super C11079d2> cVar) {
            Object value;
            Object value2;
            Object l = ((Result) obj).mo21858l();
            AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel = this.f68074a;
            Throwable e = Result.m38705e(l);
            if (e != null) {
                C11940j g0 = alternativeProductsBottomSheetViewModel.f68073h;
                do {
                    value2 = g0.getValue();
                    C28892e eVar = (C28892e) value2;
                } while (!g0.mo24216e(value2, new C28892e.C28893a(e)));
            }
            AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel2 = this.f68074a;
            if (Result.m38710j(l)) {
                List list = (List) l;
                C11940j g02 = alternativeProductsBottomSheetViewModel2.f68073h;
                do {
                    value = g02.getValue();
                    C28892e eVar2 = (C28892e) value;
                } while (!g02.mo24216e(value, new C28892e.C28895c(list)));
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlternativeProductsBottomSheetViewModel$fetchData$2(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, String str, C11045c<? super AlternativeProductsBottomSheetViewModel$fetchData$2> cVar) {
        super(2, cVar);
        this.this$0 = alternativeProductsBottomSheetViewModel;
        this.$gtin = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AlternativeProductsBottomSheetViewModel$fetchData$2(this.this$0, this.$gtin, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37753d d0 = this.this$0.f68066a;
            C37753d.C37754a aVar = new C37753d.C37754a(this.$gtin, (DefaultConstructorMarker) null);
            this.label = 1;
            obj = d0.invoke(aVar, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C28102a aVar2 = new C28102a(this.this$0);
        this.label = 2;
        if (((C11907e) obj).collect(aVar2, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AlternativeProductsBottomSheetViewModel$fetchData$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
