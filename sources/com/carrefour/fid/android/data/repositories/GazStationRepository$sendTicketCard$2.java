package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse;
import com.carrefour.fid.android.data.service.C36635n;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.File;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$2", mo22502f = "GazStationRepository.kt", mo22503i = {}, mo22504l = {44}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/ServiceStationsTicketCardResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class GazStationRepository$sendTicketCard$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ServiceStationsTicketCardResponse>>, Object> {
    final /* synthetic */ String $loyaltyCardNumber;
    final /* synthetic */ String $photoDateTaken;
    final /* synthetic */ File $pictureFile;
    int label;
    final /* synthetic */ GazStationRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GazStationRepository$sendTicketCard$2(GazStationRepository gazStationRepository, String str, File file, String str2, C11045c<? super GazStationRepository$sendTicketCard$2> cVar) {
        super(1, cVar);
        this.this$0 = gazStationRepository;
        this.$loyaltyCardNumber = str;
        this.$pictureFile = file;
        this.$photoDateTaken = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new GazStationRepository$sendTicketCard$2(this.this$0, this.$loyaltyCardNumber, this.$pictureFile, this.$photoDateTaken, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36635n b = this.this$0.f90381b;
            HashMap<String, String> a = this.this$0.f90380a.mo111448a(this.$loyaltyCardNumber);
            MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
            RequestBody.Companion companion2 = RequestBody.Companion;
            File file = this.$pictureFile;
            MediaType.Companion companion3 = MediaType.Companion;
            MultipartBody.Part createFormData = companion.createFormData("file", C28534f.f69190y, companion2.create(file, companion3.parse(C28534f.f69188x)));
            RequestBody create = companion2.create(this.$photoDateTaken, companion3.parse("text/plain"));
            this.label = 1;
            obj = b.mo111662b(a, createFormData, create, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(wVar.mo30572a());
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148970f(wVar)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<ServiceStationsTicketCardResponse>> cVar) {
        return ((GazStationRepository$sendTicketCard$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
