package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBody;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartProduct;
import com.carrefour.fid.android.data.service.C36630i;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.domain.models.OrderProductModel;
import com.carrefour.fid.android.domain.repositories.C38196e;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLuckyCartRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyCartRepository.kt\ncom/carrefour/fid/android/data/repositories/LuckyCartRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 LuckyCartRepository.kt\ncom/carrefour/fid/android/data/repositories/LuckyCartRepository\n*L\n71#1:96\n71#1:97,3\n*E\n"})
public final class LuckyCartRepository implements C28874a, C38196e {

    /* renamed from: e */
    public static final int f90387e = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90388a;
    @C12579k

    /* renamed from: b */
    public final C36630i f90389b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f90390c;
    @C12579k

    /* renamed from: d */
    public final AppEnvironment f90391d;

    @Inject
    public LuckyCartRepository(@C10255b @C12579k Context context, @C12579k C36630i iVar, @C12579k LoginRepository loginRepository, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(iVar, "apiService");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        this.f90388a = context;
        this.f90389b = iVar;
        this.f90390c = loginRepository;
        this.f90391d = appEnvironment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111511b(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.OrderConfirmationModel r5, @org.jetbrains.annotations.C12579k java.util.HashMap<java.lang.String, com.carrefour.fid.android.domain.models.CategoryModel> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.LuckyCartTicketDomain>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$1 r0 = (com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$1 r0 = new com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$2 r7 = new com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.LuckyCartRepository.mo111511b(com.carrefour.fid.android.domain.models.OrderConfirmationModel, java.util.HashMap, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.LUCKY_CART.mo83424q();
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }

    @C12579k
    /* renamed from: h */
    public final Context mo111512h() {
        return this.f90388a;
    }

    /* renamed from: i */
    public final LuckyCartBody mo111513i(OrderConfirmationModel orderConfirmationModel, HashMap<String, CategoryModel> hashMap) {
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String valueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
        String f = orderConfirmationModel.mo116155f();
        String d = this.f90390c.mo31352d();
        Double d2 = orderConfirmationModel.mo116152d();
        Double e = orderConfirmationModel.mo116154e();
        String l = orderConfirmationModel.mo116161l();
        Double m = orderConfirmationModel.mo116162m();
        Double b = orderConfirmationModel.mo116150b();
        String h = DateExtensionsKt.m118762h(orderConfirmationModel.mo116163n());
        List<OrderProductModel> k = orderConfirmationModel.mo116160k();
        if (k != null) {
            Iterable<OrderProductModel> iterable = k;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (OrderProductModel orderProductModel : iterable) {
                CategoryModel categoryModel = hashMap.get(orderProductModel.mo116210a());
                String a = orderProductModel.mo116210a();
                Integer c = orderProductModel.mo116212c();
                Float d3 = orderProductModel.mo116213d();
                Float e2 = orderProductModel.mo116215e();
                if (categoryModel != null) {
                    str2 = categoryModel.mo115681a();
                } else {
                    str2 = null;
                }
                if (categoryModel != null) {
                    str3 = categoryModel.mo115682b();
                } else {
                    str3 = null;
                }
                if (categoryModel != null) {
                    str4 = categoryModel.mo115683c();
                } else {
                    str4 = null;
                }
                if (categoryModel != null) {
                    str5 = categoryModel.mo115684d();
                } else {
                    str5 = null;
                }
                arrayList.add(new LuckyCartProduct(a, c, d3, e2, str2, str3, str4, str5));
            }
        } else {
            arrayList = null;
        }
        String q = orderConfirmationModel.mo116166q();
        String p = orderConfirmationModel.mo116165p();
        if (Intrinsics.areEqual((Object) orderConfirmationModel.mo116158i(), (Object) C36178i.f89321p)) {
            str = C36178i.f89322q;
        } else {
            str = C36178i.f89323r;
        }
        return new LuckyCartBody(f, d, d2, e, l, m, b, h, arrayList, q, p, str, this.f90391d.mo84186z(), StringKt.m118900I(valueOf, this.f90391d.mo84154A()), valueOf, (String) null, (String) null, 98304, (DefaultConstructorMarker) null);
    }
}
