package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import com.carrefour.fid.android.account.domain.extension.C13242a;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$2", mo22502f = "AccountRepository.kt", mo22503i = {}, mo22504l = {167, 175}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRepository.kt\ncom/carrefour/fid/android/account/data/repositories/AccountRepository$updateAddresses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n288#2,2:292\n288#2,2:294\n1549#2:296\n1620#2,3:297\n*S KotlinDebug\n*F\n+ 1 AccountRepository.kt\ncom/carrefour/fid/android/account/data/repositories/AccountRepository$updateAddresses$2\n*L\n170#1:292,2\n173#1:294,2\n178#1:296\n178#1:297,3\n*E\n"})
public final class AccountRepository$updateAddresses$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ List<AddressUserResponse> $addressList;
    final /* synthetic */ List<PhonesUserResponse> $phoneList;
    int label;
    final /* synthetic */ AccountRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepository$updateAddresses$2(AccountRepository accountRepository, List<AddressUserResponse> list, List<PhonesUserResponse> list2, C11045c<? super AccountRepository$updateAddresses$2> cVar) {
        super(1, cVar);
        this.this$0 = accountRepository;
        this.$addressList = list;
        this.$phoneList = list2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new AccountRepository$updateAddresses$2(this.this$0, this.$addressList, this.$phoneList, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        Address address;
        Object obj4;
        Address address2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            RemoteAccountDataSource d = this.this$0.f32375b;
            List<AddressUserResponse> list = this.$addressList;
            List<PhonesUserResponse> list2 = this.$phoneList;
            this.label = 1;
            obj = d.mo31141d(list, list2, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(C11064a.m42615a(true));
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<AddressUserResponse> list3 = this.$addressList;
        AccountRepository accountRepository = this.this$0;
        List<PhonesUserResponse> list4 = this.$phoneList;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Iterable iterable = list3;
            Iterator it = iterable.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (Intrinsics.areEqual((Object) ((AddressUserResponse) obj3).getCategory(), (Object) AddressCategory.DELIVERY.name())) {
                    break;
                }
            }
            AddressUserResponse addressUserResponse = (AddressUserResponse) obj3;
            if (addressUserResponse != null) {
                address = C13242a.m57374d(addressUserResponse);
            } else {
                address = null;
            }
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it2.next();
                if (Intrinsics.areEqual((Object) ((AddressUserResponse) obj4).getCategory(), (Object) AddressCategory.BILLING.name())) {
                    break;
                }
            }
            AddressUserResponse addressUserResponse2 = (AddressUserResponse) obj4;
            if (addressUserResponse2 != null) {
                address2 = C13242a.m57374d(addressUserResponse2);
            } else {
                address2 = null;
            }
            LocalAccountDataSource c = accountRepository.f32374a;
            if (list4 != null) {
                Iterable<PhonesUserResponse> iterable2 = list4;
                arrayList = new ArrayList(C10978t.m41495Y(iterable2, 10));
                for (PhonesUserResponse phonesUserResponse : iterable2) {
                    arrayList.add(new Phone(phonesUserResponse.getNum(), phonesUserResponse.getPreference()));
                }
            }
            this.label = 2;
            if (c.mo31127f(address, address2, arrayList, this) == h) {
                return h;
            }
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11064a.m42615a(true));
            return Result.m38701a(obj2);
        }
        Result.C10852a aVar3 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error fetching user info ")));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Boolean>> cVar) {
        return ((AccountRepository$updateAddresses$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
