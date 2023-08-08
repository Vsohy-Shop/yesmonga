package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.APIMRecommendedNeeds;
import com.carrefour.fid.android.data.entities.APIMRecommendedNeedsBody;
import com.carrefour.fid.android.data.entities.AddToShoppingListRequest;
import com.carrefour.fid.android.data.entities.CreateShoppingListRequest;
import com.carrefour.fid.android.data.entities.ShoppingListContentResponse;
import com.carrefour.fid.android.data.entities.ShoppingListResponse;
import com.carrefour.fid.android.domain.models.MemoToAddDomain;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13023b;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJC\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ9\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/o;", "", "", "", "headerMap", "shoppingListId", "Lcom/carrefour/fid/android/data/entities/AddToShoppingListRequest;", "body", "Lretrofit2/w;", "Lkotlin/d2;", "d", "(Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/AddToShoppingListRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/MemoToAddDomain;", "f", "(Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/MemoToAddDomain;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/CreateShoppingListRequest;", "e", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/CreateShoppingListRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/ShoppingListResponse;", "a", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/ShoppingListContentResponse;", "b", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "itemId", "g", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "itemsIds", "c", "headers", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsBody;", "recommendedNeedsBody", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeeds;", "h", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.o */
public interface C36636o {
    @C12580l
    @C13027f("retail/v1/mof/shopping_lists/me")
    /* renamed from: a */
    Object mo111663a(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<ShoppingListResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/shopping_lists/me/{shopping_list_id}")
    /* renamed from: b */
    Object mo111664b(@C12579k @C13031j Map<String, String> map, @C13040s("shopping_list_id") @C12579k String str, @C12579k C11045c<? super C13091w<ShoppingListContentResponse>> cVar);

    @C12580l
    @C13023b("retail/v1/mof/shopping_lists/me/{shopping_list_id}/items")
    /* renamed from: c */
    Object mo111665c(@C12579k @C13031j Map<String, String> map, @C13040s("shopping_list_id") @C12579k String str, @C13041t("item_id") @C12579k String str2, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C13036o("retail/v1/mof/shopping_lists/me/{shopping_list_id}/items")
    @C12580l
    /* renamed from: d */
    Object mo111666d(@C12579k @C13031j Map<String, String> map, @C13040s("shopping_list_id") @C12579k String str, @C12579k @C13022a AddToShoppingListRequest addToShoppingListRequest, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C13036o("retail/v1/mof/shopping_lists/me")
    @C12580l
    /* renamed from: e */
    Object mo111667e(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a CreateShoppingListRequest createShoppingListRequest, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C13036o("retail/v1/mof/shopping_lists/me/{shopping_list_id}/memos")
    @C12580l
    /* renamed from: f */
    Object mo111668f(@C12579k @C13031j Map<String, String> map, @C13040s("shopping_list_id") @C12579k String str, @C12579k @C13022a MemoToAddDomain memoToAddDomain, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C12580l
    @C13023b("retail/v1/mof/shopping_lists/me/{shopping_list_id}/items/{item_id}")
    /* renamed from: g */
    Object mo111669g(@C12579k @C13031j Map<String, String> map, @C13040s("shopping_list_id") @C12579k String str, @C13040s("item_id") @C12579k String str2, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C13036o("retail/v1/mof/one_smart_services/recommended_needs")
    @C12580l
    /* renamed from: h */
    Object mo111670h(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a APIMRecommendedNeedsBody aPIMRecommendedNeedsBody, @C12579k C11045c<? super C13091w<APIMRecommendedNeeds>> cVar);
}
