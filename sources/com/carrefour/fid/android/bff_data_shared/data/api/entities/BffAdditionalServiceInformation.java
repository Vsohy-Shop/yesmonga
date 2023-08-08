package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B7\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b%\u0010&BK\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0015\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010!\u0012\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010#¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffContact;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "component2", "", "component3", "contacts", "openingWeekPattern", "additionnalLocation", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getContacts", "()Ljava/util/List;", "getContacts$annotations", "()V", "getOpeningWeekPattern", "getOpeningWeekPattern$annotations", "Ljava/lang/String;", "getAdditionnalLocation", "()Ljava/lang/String;", "getAdditionnalLocation$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffAdditionalServiceInformation {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffContact$$serializer.INSTANCE), new C12269f(BffWeekPattern$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String additionnalLocation;
    @C12580l
    private final List<BffContact> contacts;
    @C12580l
    private final List<BffWeekPattern> openingWeekPattern;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffAdditionalServiceInformation> serializer() {
            return BffAdditionalServiceInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffAdditionalServiceInformation() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffAdditionalServiceInformation copy$default(BffAdditionalServiceInformation bffAdditionalServiceInformation, List<BffContact> list, List<BffWeekPattern> list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffAdditionalServiceInformation.contacts;
        }
        if ((i & 2) != 0) {
            list2 = bffAdditionalServiceInformation.openingWeekPattern;
        }
        if ((i & 4) != 0) {
            str = bffAdditionalServiceInformation.additionnalLocation;
        }
        return bffAdditionalServiceInformation.copy(list, list2, str);
    }

    @C12438n("additionnal_location")
    public static /* synthetic */ void getAdditionnalLocation$annotations() {
    }

    @C12438n("contacts")
    public static /* synthetic */ void getContacts$annotations() {
    }

    @C12438n("opening_week_pattern")
    public static /* synthetic */ void getOpeningWeekPattern$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffAdditionalServiceInformation bffAdditionalServiceInformation, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffAdditionalServiceInformation.contacts != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffAdditionalServiceInformation.contacts);
        }
        if (dVar.mo24897A(fVar, 1) || bffAdditionalServiceInformation.openingWeekPattern != null) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffAdditionalServiceInformation.openingWeekPattern);
        }
        if (dVar.mo24897A(fVar, 2) || bffAdditionalServiceInformation.additionnalLocation != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffAdditionalServiceInformation.additionnalLocation);
        }
    }

    @C12580l
    public final List<BffContact> component1() {
        return this.contacts;
    }

    @C12580l
    public final List<BffWeekPattern> component2() {
        return this.openingWeekPattern;
    }

    @C12580l
    public final String component3() {
        return this.additionnalLocation;
    }

    @C12579k
    public final BffAdditionalServiceInformation copy(@C12580l List<BffContact> list, @C12580l List<BffWeekPattern> list2, @C12580l String str) {
        return new BffAdditionalServiceInformation(list, list2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffAdditionalServiceInformation)) {
            return false;
        }
        BffAdditionalServiceInformation bffAdditionalServiceInformation = (BffAdditionalServiceInformation) obj;
        return Intrinsics.areEqual((Object) this.contacts, (Object) bffAdditionalServiceInformation.contacts) && Intrinsics.areEqual((Object) this.openingWeekPattern, (Object) bffAdditionalServiceInformation.openingWeekPattern) && Intrinsics.areEqual((Object) this.additionnalLocation, (Object) bffAdditionalServiceInformation.additionnalLocation);
    }

    @C12580l
    public final String getAdditionnalLocation() {
        return this.additionnalLocation;
    }

    @C12580l
    public final List<BffContact> getContacts() {
        return this.contacts;
    }

    @C12580l
    public final List<BffWeekPattern> getOpeningWeekPattern() {
        return this.openingWeekPattern;
    }

    public int hashCode() {
        List<BffContact> list = this.contacts;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BffWeekPattern> list2 = this.openingWeekPattern;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.additionnalLocation;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<BffContact> list = this.contacts;
        List<BffWeekPattern> list2 = this.openingWeekPattern;
        String str = this.additionnalLocation;
        return "BffAdditionalServiceInformation(contacts=" + list + ", openingWeekPattern=" + list2 + ", additionnalLocation=" + str + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffAdditionalServiceInformation(int i, @C12438n("contacts") List list, @C12438n("opening_week_pattern") List list2, @C12438n("additionnal_location") String str, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffAdditionalServiceInformation$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.contacts = null;
        } else {
            this.contacts = list;
        }
        if ((i & 2) == 0) {
            this.openingWeekPattern = null;
        } else {
            this.openingWeekPattern = list2;
        }
        if ((i & 4) == 0) {
            this.additionnalLocation = null;
        } else {
            this.additionnalLocation = str;
        }
    }

    public BffAdditionalServiceInformation(@C12580l List<BffContact> list, @C12580l List<BffWeekPattern> list2, @C12580l String str) {
        this.contacts = list;
        this.openingWeekPattern = list2;
        this.additionnalLocation = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffAdditionalServiceInformation(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
