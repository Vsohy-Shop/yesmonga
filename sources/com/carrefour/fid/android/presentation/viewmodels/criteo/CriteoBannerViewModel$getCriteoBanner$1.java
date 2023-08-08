package com.carrefour.fid.android.presentation.viewmodels.criteo;

import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.criteo.CriteoEventType;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoBannerViewModel$getCriteoBanner$1", mo22502f = "CriteoBannerViewModel.kt", mo22503i = {}, mo22504l = {35}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCriteoBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoBannerViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoBannerViewModel$getCriteoBanner$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 CriteoBannerViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoBannerViewModel$getCriteoBanner$1\n*L\n44#1:70\n44#1:71,3\n*E\n"})
public final class CriteoBannerViewModel$getCriteoBanner$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CriteoPageType $pageType;
    int label;
    final /* synthetic */ CriteoBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoBannerViewModel$getCriteoBanner$1(CriteoBannerViewModel criteoBannerViewModel, CriteoPageType criteoPageType, C11045c<? super CriteoBannerViewModel$getCriteoBanner$1> cVar) {
        super(2, cVar);
        this.this$0 = criteoBannerViewModel;
        this.$pageType = criteoPageType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CriteoBannerViewModel$getCriteoBanner$1(this.this$0, this.$pageType, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            GetCriteoBannerUseCase g0 = this.this$0.f64343d;
            C38006h hVar = r5;
            C38006h hVar2 = new C38006h(this.$pageType, CriteoEventType.EVENT_TYPE_VIEW_HOME, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Integer) null, (Integer) null, (Boolean) null, (String) null, false, false, false, 32764, (DefaultConstructorMarker) null);
            GetCriteoBannerUseCase.C37659a aVar = new GetCriteoBannerUseCase.C37659a(hVar);
            this.label = 1;
            Object c = g0.m172963invokegIAlus(aVar, this);
            if (c == h) {
                return h;
            }
            obj2 = c;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CriteoBannerViewModel criteoBannerViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            if (Result.m38709i(obj2)) {
                obj2 = null;
            }
            List list = (List) obj2;
            if (list != null) {
                Iterable<C37999a> iterable = list;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (C37999a add : iterable) {
                    arrayList.add(add);
                }
                criteoBannerViewModel.f64345f.mo57493o(CollectionsKt___CollectionsKt.m40706w2(arrayList));
                criteoBannerViewModel.f64346g.mo57493o(arrayList);
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CriteoBannerViewModel$getCriteoBanner$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
