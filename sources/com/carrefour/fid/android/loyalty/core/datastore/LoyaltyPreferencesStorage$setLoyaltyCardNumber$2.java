package com.carrefour.fid.android.loyalty.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.carrefour.fid.android.shared.data.datastore.pref.C28632f;
import com.carrefour.fid.android.shared.util.C28951s;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$setLoyaltyCardNumber$2", mo22502f = "LoyaltyPreferencesStorage.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyPreferencesStorage$setLoyaltyCardNumber$2 extends SuspendLambda implements C11304p<MutablePreferences, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $loyaltyCardNumber;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoyaltyPreferencesStorage this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyPreferencesStorage$setLoyaltyCardNumber$2(LoyaltyPreferencesStorage loyaltyPreferencesStorage, String str, C11045c<? super LoyaltyPreferencesStorage$setLoyaltyCardNumber$2> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyPreferencesStorage;
        this.$loyaltyCardNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LoyaltyPreferencesStorage$setLoyaltyCardNumber$2 loyaltyPreferencesStorage$setLoyaltyCardNumber$2 = new LoyaltyPreferencesStorage$setLoyaltyCardNumber$2(this.this$0, this.$loyaltyCardNumber, cVar);
        loyaltyPreferencesStorage$setLoyaltyCardNumber$2.L$0 = obj;
        return loyaltyPreferencesStorage$setLoyaltyCardNumber$2;
    }

    @C12580l
    public final Object invoke(@C12579k MutablePreferences mutablePreferences, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyPreferencesStorage$setLoyaltyCardNumber$2) create(mutablePreferences, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            ((MutablePreferences) this.L$0).mo53706o(C28632f.f70212a.mo83525b(), C28951s.f70964a.mo84278d(this.this$0.getContext(), this.$loyaltyCardNumber));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
