package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.core.constants.C36176g;
import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.AddToShoppingListRequest;
import com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest;
import com.carrefour.fid.android.data.service.C36636o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource$addList$2", mo22502f = "MemoRemoteDatasource.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMemoRemoteDatasource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoRemoteDatasource.kt\ncom/carrefour/fid/android/data/repositories/datasource/memos/MemoRemoteDatasource$addList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1549#2:153\n1620#2,3:154\n*S KotlinDebug\n*F\n+ 1 MemoRemoteDatasource.kt\ncom/carrefour/fid/android/data/repositories/datasource/memos/MemoRemoteDatasource$addList$2\n*L\n44#1:153\n44#1:154,3\n*E\n"})
public final class MemoRemoteDatasource$addList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C11079d2>>, Object> {
    final /* synthetic */ List<String> $labels;
    final /* synthetic */ String $memoListId;
    int label;
    final /* synthetic */ MemoRemoteDatasource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoRemoteDatasource$addList$2(MemoRemoteDatasource memoRemoteDatasource, String str, List<String> list, C11045c<? super MemoRemoteDatasource$addList$2> cVar) {
        super(1, cVar);
        this.this$0 = memoRemoteDatasource;
        this.$memoListId = str;
        this.$labels = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new MemoRemoteDatasource$addList$2(this.this$0, this.$memoListId, this.$labels, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36636o b = this.this$0.f90469a;
            HashMap<String, String> a = this.this$0.f90470b.mo111450a(true);
            String str = this.$memoListId;
            Iterable<String> iterable = this.$labels;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (String shoppingListItemToAddRequest : iterable) {
                arrayList.add(new ShoppingListItemToAddRequest(C36176g.f89300e, (String) null, (String) null, C36176g.f89297b, shoppingListItemToAddRequest, 0, (String) null, 102, (DefaultConstructorMarker) null));
            }
            AddToShoppingListRequest addToShoppingListRequest = new AddToShoppingListRequest(arrayList);
            this.label = 1;
            obj2 = b.mo111666d(a, str, addToShoppingListRequest, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = this.$memoListId;
        C13091w wVar = (C13091w) obj2;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj3 = Result.m38702b(C11079d2.f28267a);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj3 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error adding memo(s) to shopping list " + str2)));
        }
        return Result.m38701a(obj3);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C11079d2>> cVar) {
        return ((MemoRemoteDatasource$addList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
