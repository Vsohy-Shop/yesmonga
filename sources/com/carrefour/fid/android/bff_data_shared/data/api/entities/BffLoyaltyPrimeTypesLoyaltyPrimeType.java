package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bg\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b:\u0010;B{\b\u0017\u0012\u0006\u0010<\u001a\u00020\u001e\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010#\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010%R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100R\"\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010.\u0012\u0004\b3\u0010'\u001a\u0004\b2\u00100R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00104\u0012\u0004\b9\u0010'\u001a\u0004\b8\u00106¨\u0006B"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesLoyaltyPrimeType;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;", "component5", "component6", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;", "component7", "component8", "primeId", "name", "description", "text", "urlEdito", "urlEditoNotSelected", "picto", "pictoOff", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPrimeId", "()Ljava/lang/String;", "getPrimeId$annotations", "()V", "getName", "getName$annotations", "getDescription", "getDescription$annotations", "getText", "getText$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;", "getUrlEdito", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;", "getUrlEdito$annotations", "getUrlEditoNotSelected", "getUrlEditoNotSelected$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;", "getPicto", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;", "getPicto$annotations", "getPictoOff", "getPictoOff$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsCta;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffLoyaltyPrimeTypesLoyaltyPrimeType {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String description;
    @C12580l
    private final String name;
    @C12580l
    private final BffCmsPictoPrime picto;
    @C12580l
    private final BffCmsPictoPrime pictoOff;
    @C12580l
    private final String primeId;
    @C12580l
    private final String text;
    @C12580l
    private final BffCmsCta urlEdito;
    @C12580l
    private final BffCmsCta urlEditoNotSelected;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesLoyaltyPrimeType$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesLoyaltyPrimeType;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffLoyaltyPrimeTypesLoyaltyPrimeType> serializer() {
            return BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffLoyaltyPrimeTypesLoyaltyPrimeType() {
        this((String) null, (String) null, (String) null, (String) null, (BffCmsCta) null, (BffCmsCta) null, (BffCmsPictoPrime) null, (BffCmsPictoPrime) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffLoyaltyPrimeTypesLoyaltyPrimeType copy$default(BffLoyaltyPrimeTypesLoyaltyPrimeType bffLoyaltyPrimeTypesLoyaltyPrimeType, String str, String str2, String str3, String str4, BffCmsCta bffCmsCta, BffCmsCta bffCmsCta2, BffCmsPictoPrime bffCmsPictoPrime, BffCmsPictoPrime bffCmsPictoPrime2, int i, Object obj) {
        BffLoyaltyPrimeTypesLoyaltyPrimeType bffLoyaltyPrimeTypesLoyaltyPrimeType2 = bffLoyaltyPrimeTypesLoyaltyPrimeType;
        int i2 = i;
        return bffLoyaltyPrimeTypesLoyaltyPrimeType.copy((i2 & 1) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.primeId : str, (i2 & 2) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.name : str2, (i2 & 4) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.description : str3, (i2 & 8) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.text : str4, (i2 & 16) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.urlEdito : bffCmsCta, (i2 & 32) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.urlEditoNotSelected : bffCmsCta2, (i2 & 64) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.picto : bffCmsPictoPrime, (i2 & 128) != 0 ? bffLoyaltyPrimeTypesLoyaltyPrimeType2.pictoOff : bffCmsPictoPrime2);
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("picto")
    public static /* synthetic */ void getPicto$annotations() {
    }

    @C12438n("picto_off")
    public static /* synthetic */ void getPictoOff$annotations() {
    }

    @C12438n("prime_id")
    public static /* synthetic */ void getPrimeId$annotations() {
    }

    @C12438n("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @C12438n("url_edito")
    public static /* synthetic */ void getUrlEdito$annotations() {
    }

    @C12438n("url_edito_not_selected")
    public static /* synthetic */ void getUrlEditoNotSelected$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffLoyaltyPrimeTypesLoyaltyPrimeType bffLoyaltyPrimeTypesLoyaltyPrimeType, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffLoyaltyPrimeTypesLoyaltyPrimeType.primeId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffLoyaltyPrimeTypesLoyaltyPrimeType.primeId);
        }
        if (dVar.mo24897A(fVar, 1) || bffLoyaltyPrimeTypesLoyaltyPrimeType.name != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffLoyaltyPrimeTypesLoyaltyPrimeType.name);
        }
        if (dVar.mo24897A(fVar, 2) || bffLoyaltyPrimeTypesLoyaltyPrimeType.description != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffLoyaltyPrimeTypesLoyaltyPrimeType.description);
        }
        if (dVar.mo24897A(fVar, 3) || bffLoyaltyPrimeTypesLoyaltyPrimeType.text != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffLoyaltyPrimeTypesLoyaltyPrimeType.text);
        }
        if (dVar.mo24897A(fVar, 4) || bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEdito != null) {
            dVar.mo24912i(fVar, 4, BffCmsCta$$serializer.INSTANCE, bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEdito);
        }
        if (dVar.mo24897A(fVar, 5) || bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEditoNotSelected != null) {
            dVar.mo24912i(fVar, 5, BffCmsCta$$serializer.INSTANCE, bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEditoNotSelected);
        }
        if (dVar.mo24897A(fVar, 6) || bffLoyaltyPrimeTypesLoyaltyPrimeType.picto != null) {
            dVar.mo24912i(fVar, 6, BffCmsPictoPrime$$serializer.INSTANCE, bffLoyaltyPrimeTypesLoyaltyPrimeType.picto);
        }
        if (dVar.mo24897A(fVar, 7) || bffLoyaltyPrimeTypesLoyaltyPrimeType.pictoOff != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 7, BffCmsPictoPrime$$serializer.INSTANCE, bffLoyaltyPrimeTypesLoyaltyPrimeType.pictoOff);
        }
    }

    @C12580l
    public final String component1() {
        return this.primeId;
    }

    @C12580l
    public final String component2() {
        return this.name;
    }

    @C12580l
    public final String component3() {
        return this.description;
    }

    @C12580l
    public final String component4() {
        return this.text;
    }

    @C12580l
    public final BffCmsCta component5() {
        return this.urlEdito;
    }

    @C12580l
    public final BffCmsCta component6() {
        return this.urlEditoNotSelected;
    }

    @C12580l
    public final BffCmsPictoPrime component7() {
        return this.picto;
    }

    @C12580l
    public final BffCmsPictoPrime component8() {
        return this.pictoOff;
    }

    @C12579k
    public final BffLoyaltyPrimeTypesLoyaltyPrimeType copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffCmsCta bffCmsCta, @C12580l BffCmsCta bffCmsCta2, @C12580l BffCmsPictoPrime bffCmsPictoPrime, @C12580l BffCmsPictoPrime bffCmsPictoPrime2) {
        return new BffLoyaltyPrimeTypesLoyaltyPrimeType(str, str2, str3, str4, bffCmsCta, bffCmsCta2, bffCmsPictoPrime, bffCmsPictoPrime2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffLoyaltyPrimeTypesLoyaltyPrimeType)) {
            return false;
        }
        BffLoyaltyPrimeTypesLoyaltyPrimeType bffLoyaltyPrimeTypesLoyaltyPrimeType = (BffLoyaltyPrimeTypesLoyaltyPrimeType) obj;
        return Intrinsics.areEqual((Object) this.primeId, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.primeId) && Intrinsics.areEqual((Object) this.name, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.name) && Intrinsics.areEqual((Object) this.description, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.description) && Intrinsics.areEqual((Object) this.text, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.text) && Intrinsics.areEqual((Object) this.urlEdito, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEdito) && Intrinsics.areEqual((Object) this.urlEditoNotSelected, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.urlEditoNotSelected) && Intrinsics.areEqual((Object) this.picto, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.picto) && Intrinsics.areEqual((Object) this.pictoOff, (Object) bffLoyaltyPrimeTypesLoyaltyPrimeType.pictoOff);
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final BffCmsPictoPrime getPicto() {
        return this.picto;
    }

    @C12580l
    public final BffCmsPictoPrime getPictoOff() {
        return this.pictoOff;
    }

    @C12580l
    public final String getPrimeId() {
        return this.primeId;
    }

    @C12580l
    public final String getText() {
        return this.text;
    }

    @C12580l
    public final BffCmsCta getUrlEdito() {
        return this.urlEdito;
    }

    @C12580l
    public final BffCmsCta getUrlEditoNotSelected() {
        return this.urlEditoNotSelected;
    }

    public int hashCode() {
        String str = this.primeId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BffCmsCta bffCmsCta = this.urlEdito;
        int hashCode5 = (hashCode4 + (bffCmsCta == null ? 0 : bffCmsCta.hashCode())) * 31;
        BffCmsCta bffCmsCta2 = this.urlEditoNotSelected;
        int hashCode6 = (hashCode5 + (bffCmsCta2 == null ? 0 : bffCmsCta2.hashCode())) * 31;
        BffCmsPictoPrime bffCmsPictoPrime = this.picto;
        int hashCode7 = (hashCode6 + (bffCmsPictoPrime == null ? 0 : bffCmsPictoPrime.hashCode())) * 31;
        BffCmsPictoPrime bffCmsPictoPrime2 = this.pictoOff;
        if (bffCmsPictoPrime2 != null) {
            i = bffCmsPictoPrime2.hashCode();
        }
        return hashCode7 + i;
    }

    @C12579k
    public String toString() {
        String str = this.primeId;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.text;
        BffCmsCta bffCmsCta = this.urlEdito;
        BffCmsCta bffCmsCta2 = this.urlEditoNotSelected;
        BffCmsPictoPrime bffCmsPictoPrime = this.picto;
        BffCmsPictoPrime bffCmsPictoPrime2 = this.pictoOff;
        return "BffLoyaltyPrimeTypesLoyaltyPrimeType(primeId=" + str + ", name=" + str2 + ", description=" + str3 + ", text=" + str4 + ", urlEdito=" + bffCmsCta + ", urlEditoNotSelected=" + bffCmsCta2 + ", picto=" + bffCmsPictoPrime + ", pictoOff=" + bffCmsPictoPrime2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffLoyaltyPrimeTypesLoyaltyPrimeType(int i, @C12438n("prime_id") String str, @C12438n("name") String str2, @C12438n("description") String str3, @C12438n("text") String str4, @C12438n("url_edito") BffCmsCta bffCmsCta, @C12438n("url_edito_not_selected") BffCmsCta bffCmsCta2, @C12438n("picto") BffCmsPictoPrime bffCmsPictoPrime, @C12438n("picto_off") BffCmsPictoPrime bffCmsPictoPrime2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.primeId = null;
        } else {
            this.primeId = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i & 16) == 0) {
            this.urlEdito = null;
        } else {
            this.urlEdito = bffCmsCta;
        }
        if ((i & 32) == 0) {
            this.urlEditoNotSelected = null;
        } else {
            this.urlEditoNotSelected = bffCmsCta2;
        }
        if ((i & 64) == 0) {
            this.picto = null;
        } else {
            this.picto = bffCmsPictoPrime;
        }
        if ((i & 128) == 0) {
            this.pictoOff = null;
        } else {
            this.pictoOff = bffCmsPictoPrime2;
        }
    }

    public BffLoyaltyPrimeTypesLoyaltyPrimeType(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffCmsCta bffCmsCta, @C12580l BffCmsCta bffCmsCta2, @C12580l BffCmsPictoPrime bffCmsPictoPrime, @C12580l BffCmsPictoPrime bffCmsPictoPrime2) {
        this.primeId = str;
        this.name = str2;
        this.description = str3;
        this.text = str4;
        this.urlEdito = bffCmsCta;
        this.urlEditoNotSelected = bffCmsCta2;
        this.picto = bffCmsPictoPrime;
        this.pictoOff = bffCmsPictoPrime2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffLoyaltyPrimeTypesLoyaltyPrimeType(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta r14, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta r15, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime r16, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
