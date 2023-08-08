package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.UserCard;
import com.carrefour.fid.android.UserInfo;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveUserCards$2", mo22502f = "LocalAccountDataSource.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/UserInfo;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLocalAccountDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAccountDataSource.kt\ncom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource$saveUserCards$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1549#2:80\n1620#2,3:81\n*S KotlinDebug\n*F\n+ 1 LocalAccountDataSource.kt\ncom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource$saveUserCards$2\n*L\n66#1:80\n66#1:81,3\n*E\n"})
public final class LocalAccountDataSource$saveUserCards$2 extends SuspendLambda implements C11304p<UserInfo, C11045c<? super UserInfo>, Object> {
    final /* synthetic */ List<UserCards> $listCards;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalAccountDataSource$saveUserCards$2(List<UserCards> list, C11045c<? super LocalAccountDataSource$saveUserCards$2> cVar) {
        super(2, cVar);
        this.$listCards = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LocalAccountDataSource$saveUserCards$2 localAccountDataSource$saveUserCards$2 = new LocalAccountDataSource$saveUserCards$2(this.$listCards, cVar);
        localAccountDataSource$saveUserCards$2.L$0 = obj;
        return localAccountDataSource$saveUserCards$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k UserInfo userInfo, @C12580l C11045c<? super UserInfo> cVar) {
        return ((LocalAccountDataSource$saveUserCards$2) create(userInfo, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            UserInfo.C13137b s0 = ((UserInfo.C13137b) ((UserInfo) this.L$0).toBuilder()).mo31103s0();
            Iterable<UserCards> iterable = this.$listCards;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (UserCards userCards : iterable) {
                arrayList.add((UserCard) UserCard.newBuilder().mo31000Z(userCards.mo116761i()).mo31004d0(userCards.mo116763k()).mo30998V(userCards.mo116759h()).mo31002b0(userCards.mo116764l()).mo31003c0(userCards.mo116762j()).mo100473g());
            }
            GeneratedMessageLite B = s0.mo31073V(arrayList).mo100473g();
            Intrinsics.checkNotNullExpressionValue(B, "it.toBuilder()\n         …                ).build()");
            return B;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
