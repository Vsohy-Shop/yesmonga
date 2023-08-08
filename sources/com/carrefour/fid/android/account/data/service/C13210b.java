package com.carrefour.fid.android.account.data.service;

import com.carrefour.fid.android.data.entities.DQEAddressSuggestionEntity;
import com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity;
import com.carrefour.fid.android.data.entities.DQEGeoLocationEntity;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13024c;
import retrofit2.http.C13026e;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jw\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00020\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJw\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00020\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJc\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00020\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/service/b;", "", "", "", "headerMap", "licence", "country", "address", "height", "instance", "proposition", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/DQEAddressSuggestionEntity;", "c", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/DQEAddressVerificationEntity;", "a", "postalCode", "", "alpha", "Lcom/carrefour/fid/android/data/entities/DQEGeoLocationEntity;", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.data.service.b */
public interface C13210b {

    /* renamed from: com.carrefour.fid.android.account.data.service.b$a */
    public static final class C13211a {
        /* renamed from: a */
        public static /* synthetic */ Object m57255a(C13210b bVar, Map map, String str, String str2, String str3, boolean z, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "L86-jo-1tnFi.sQU3n.B~wZanj";
                }
                String str4 = str;
                if ((i & 4) != 0) {
                    str2 = "FRA";
                }
                String str5 = str2;
                if ((i & 16) != 0) {
                    z = true;
                }
                return bVar.mo31368b(map, str4, str5, str3, z, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGeoLocationFromPostalCode");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m57256b(C13210b bVar, Map map, String str, String str2, String str3, String str4, String str5, String str6, C11045c cVar, int i, Object obj) {
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            if (obj == null) {
                if ((i & 2) != 0) {
                    str7 = "L86-jo-1tnFi.sQU3n.B~wZanj";
                } else {
                    str7 = str;
                }
                if ((i & 4) != 0) {
                    str8 = "FRA";
                } else {
                    str8 = str2;
                }
                if ((i & 16) != 0) {
                    str9 = "38";
                } else {
                    str9 = str4;
                }
                if ((i & 32) != 0) {
                    str10 = "1";
                } else {
                    str10 = str5;
                }
                if ((i & 64) != 0) {
                    str11 = "O";
                } else {
                    str11 = str6;
                }
                return bVar.mo31369c(map, str7, str8, str3, str9, str10, str11, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestions");
        }

        /* renamed from: c */
        public static /* synthetic */ Object m57257c(C13210b bVar, Map map, String str, String str2, String str3, String str4, String str5, String str6, C11045c cVar, int i, Object obj) {
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            if (obj == null) {
                if ((i & 2) != 0) {
                    str7 = "L86-jo-1tnFi.sQU3n.B~wZanj";
                } else {
                    str7 = str;
                }
                if ((i & 4) != 0) {
                    str8 = "FRA";
                } else {
                    str8 = str2;
                }
                if ((i & 16) != 0) {
                    str9 = "38";
                } else {
                    str9 = str4;
                }
                if ((i & 32) != 0) {
                    str10 = "1";
                } else {
                    str10 = str5;
                }
                if ((i & 64) != 0) {
                    str11 = "O";
                } else {
                    str11 = str6;
                }
                return bVar.mo31367a(map, str7, str8, str3, str9, str10, str11, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyAddress");
        }
    }

    @C13036o("retail/v1/mof/addresses_management/adresses_verifications")
    @C12580l
    @C13026e
    /* renamed from: a */
    Object mo31367a(@C12579k @C13031j Map<String, String> map, @C13024c("Licence") @C12579k String str, @C13024c("Pays") @C12579k String str2, @C13024c("Adresse") @C12579k String str3, @C13024c("Taille") @C12579k String str4, @C13024c("Instance") @C12579k String str5, @C13024c("Proposition") @C12579k String str6, @C12579k C11045c<? super C13091w<Map<String, DQEAddressVerificationEntity>>> cVar);

    @C13036o("retail/v1/mof/addresses_management/postal_code")
    @C12580l
    @C13026e
    /* renamed from: b */
    Object mo31368b(@C12579k @C13031j Map<String, String> map, @C13024c("Licence") @C12579k String str, @C13024c("Pays") @C12579k String str2, @C13024c("CodePostal") @C12579k String str3, @C13024c("Alpha") boolean z, @C12579k C11045c<? super C13091w<Map<String, DQEGeoLocationEntity>>> cVar);

    @C13036o("retail/v1/mof/addresses_management/adresses_suggestions")
    @C12580l
    @C13026e
    /* renamed from: c */
    Object mo31369c(@C12579k @C13031j Map<String, String> map, @C13024c("Licence") @C12579k String str, @C13024c("Pays") @C12579k String str2, @C13024c("Adresse") @C12579k String str3, @C13024c("Taille") @C12579k String str4, @C13024c("Instance") @C12579k String str5, @C13024c("Proposition") @C12579k String str6, @C12579k C11045c<? super C13091w<Map<String, DQEAddressSuggestionEntity>>> cVar);
}
