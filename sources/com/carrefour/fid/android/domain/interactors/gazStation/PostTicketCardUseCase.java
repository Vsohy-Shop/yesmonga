package com.carrefour.fid.android.domain.interactors.gazStation;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36185p;
import com.carrefour.fid.android.data.repositories.GazStationRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.models.C38527s;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.p046io.GazStationResponseThrowable;
import java.io.File;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class PostTicketCardUseCase implements C37679f<C37690a, C38527s> {

    /* renamed from: b */
    public static final int f94552b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final GazStationRepository f94553a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$a */
    public static final class C37690a {

        /* renamed from: d */
        public static final int f94554d = 8;
        @C12579k

        /* renamed from: a */
        public final String f94555a;
        @C12579k

        /* renamed from: b */
        public final File f94556b;
        @C12579k

        /* renamed from: c */
        public final String f94557c;

        public C37690a(@C12579k String str, @C12579k File file, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "photoDateTaken");
            Intrinsics.checkNotNullParameter(file, "picture");
            Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            this.f94555a = str;
            this.f94556b = file;
            this.f94557c = str2;
        }

        /* renamed from: e */
        public static /* synthetic */ C37690a m154469e(C37690a aVar, String str, File file, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94555a;
            }
            if ((i & 2) != 0) {
                file = aVar.f94556b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f94557c;
            }
            return aVar.mo114724d(str, file, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114721a() {
            return this.f94555a;
        }

        @C12579k
        /* renamed from: b */
        public final File mo114722b() {
            return this.f94556b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114723c() {
            return this.f94557c;
        }

        @C12579k
        /* renamed from: d */
        public final C37690a mo114724d(@C12579k String str, @C12579k File file, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "photoDateTaken");
            Intrinsics.checkNotNullParameter(file, "picture");
            Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            return new C37690a(str, file, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37690a)) {
                return false;
            }
            C37690a aVar = (C37690a) obj;
            return Intrinsics.areEqual((Object) this.f94555a, (Object) aVar.f94555a) && Intrinsics.areEqual((Object) this.f94556b, (Object) aVar.f94556b) && Intrinsics.areEqual((Object) this.f94557c, (Object) aVar.f94557c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114726f() {
            return this.f94557c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo114727g() {
            return this.f94555a;
        }

        @C12579k
        /* renamed from: h */
        public final File mo114728h() {
            return this.f94556b;
        }

        public int hashCode() {
            return (((this.f94555a.hashCode() * 31) + this.f94556b.hashCode()) * 31) + this.f94557c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94555a;
            File file = this.f94556b;
            String str2 = this.f94557c;
            return "Param(photoDateTaken=" + str + ", picture=" + file + ", loyaltyCardNumber=" + str2 + ")";
        }
    }

    @Inject
    public PostTicketCardUseCase(@C12579k GazStationRepository gazStationRepository) {
        Intrinsics.checkNotNullParameter(gazStationRepository, "repository");
        this.f94553a = gazStationRepository;
    }

    /* renamed from: a */
    public final Object mo114719a(Throwable th) {
        boolean z;
        if (th instanceof GazStationResponseThrowable) {
            String a = ((GazStationResponseThrowable) th).mo83797a();
            if (Intrinsics.areEqual((Object) a, (Object) C36185p.f89339a)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) a, (Object) C36185p.f89340b);
            }
            if (z) {
                Result.C10852a aVar = Result.f28060a;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                return Result.m38702b(new C38527s(true, true, message));
            }
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(th));
        }
        Result.C10852a aVar3 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(th));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172970invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase.C37690a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.presentation.models.C38527s>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase r6 = (com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0058
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.GazStationRepository r7 = r5.f94553a
            java.lang.String r2 = r6.mo114727g()
            java.io.File r4 = r6.mo114728h()
            java.lang.String r6 = r6.mo114726f()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.mo111502d(r2, r4, r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r5
        L_0x0058:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r7)
            if (r0 != 0) goto L_0x0079
            com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse r7 = (com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse) r7
            kotlin.Result$a r6 = kotlin.Result.f28060a
            if (r7 == 0) goto L_0x0069
            java.lang.String r6 = r7.getMoreInformation()
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 != 0) goto L_0x006e
            java.lang.String r6 = ""
        L_0x006e:
            com.carrefour.fid.android.presentation.models.s r7 = new com.carrefour.fid.android.presentation.models.s
            r0 = 0
            r7.<init>(r0, r3, r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            goto L_0x007d
        L_0x0079:
            java.lang.Object r6 = r6.mo114719a(r0)
        L_0x007d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase.m172970invokegIAlus(com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
