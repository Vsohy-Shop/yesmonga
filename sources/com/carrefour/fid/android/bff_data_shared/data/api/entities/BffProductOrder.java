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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 /2\u00020\u0001:\u00020/B=\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010*BQ\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b&\u0010 \u001a\u0004\b$\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010'\u0012\u0004\b(\u0010 \u001a\u0004\b\u0014\u0010\u0010¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "", "component4", "()Ljava/lang/Boolean;", "buttonName", "desktopMultibackground", "products", "isMandatory", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getButtonName", "()Ljava/lang/String;", "getButtonName$annotations", "()V", "getDesktopMultibackground", "getDesktopMultibackground$annotations", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getProducts$annotations", "Ljava/lang/Boolean;", "isMandatory$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffProductOrder {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, new C12269f(C12310s1.f30117a), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String buttonName;
    @C12580l
    private final String desktopMultibackground;
    @C12580l
    private final Boolean isMandatory;
    @C12580l
    private final List<String> products;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffProductOrder> serializer() {
            return BffProductOrder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffProductOrder() {
        this((String) null, (String) null, (List) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffProductOrder copy$default(BffProductOrder bffProductOrder, String str, String str2, List<String> list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffProductOrder.buttonName;
        }
        if ((i & 2) != 0) {
            str2 = bffProductOrder.desktopMultibackground;
        }
        if ((i & 4) != 0) {
            list = bffProductOrder.products;
        }
        if ((i & 8) != 0) {
            bool = bffProductOrder.isMandatory;
        }
        return bffProductOrder.copy(str, str2, list, bool);
    }

    @C12438n("button_name")
    public static /* synthetic */ void getButtonName$annotations() {
    }

    @C12438n("desktop_multibackground")
    public static /* synthetic */ void getDesktopMultibackground$annotations() {
    }

    @C12438n("products")
    public static /* synthetic */ void getProducts$annotations() {
    }

    @C12438n("isMandatory")
    public static /* synthetic */ void isMandatory$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffProductOrder bffProductOrder, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffProductOrder.buttonName != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffProductOrder.buttonName);
        }
        if (dVar.mo24897A(fVar, 1) || bffProductOrder.desktopMultibackground != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffProductOrder.desktopMultibackground);
        }
        if (dVar.mo24897A(fVar, 2) || bffProductOrder.products != null) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffProductOrder.products);
        }
        if (dVar.mo24897A(fVar, 3) || bffProductOrder.isMandatory != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 3, C12278i.f30070a, bffProductOrder.isMandatory);
        }
    }

    @C12580l
    public final String component1() {
        return this.buttonName;
    }

    @C12580l
    public final String component2() {
        return this.desktopMultibackground;
    }

    @C12580l
    public final List<String> component3() {
        return this.products;
    }

    @C12580l
    public final Boolean component4() {
        return this.isMandatory;
    }

    @C12579k
    public final BffProductOrder copy(@C12580l String str, @C12580l String str2, @C12580l List<String> list, @C12580l Boolean bool) {
        return new BffProductOrder(str, str2, list, bool);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffProductOrder)) {
            return false;
        }
        BffProductOrder bffProductOrder = (BffProductOrder) obj;
        return Intrinsics.areEqual((Object) this.buttonName, (Object) bffProductOrder.buttonName) && Intrinsics.areEqual((Object) this.desktopMultibackground, (Object) bffProductOrder.desktopMultibackground) && Intrinsics.areEqual((Object) this.products, (Object) bffProductOrder.products) && Intrinsics.areEqual((Object) this.isMandatory, (Object) bffProductOrder.isMandatory);
    }

    @C12580l
    public final String getButtonName() {
        return this.buttonName;
    }

    @C12580l
    public final String getDesktopMultibackground() {
        return this.desktopMultibackground;
    }

    @C12580l
    public final List<String> getProducts() {
        return this.products;
    }

    public int hashCode() {
        String str = this.buttonName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desktopMultibackground;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.products;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isMandatory;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    public final Boolean isMandatory() {
        return this.isMandatory;
    }

    @C12579k
    public String toString() {
        String str = this.buttonName;
        String str2 = this.desktopMultibackground;
        List<String> list = this.products;
        Boolean bool = this.isMandatory;
        return "BffProductOrder(buttonName=" + str + ", desktopMultibackground=" + str2 + ", products=" + list + ", isMandatory=" + bool + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffProductOrder(int i, @C12438n("button_name") String str, @C12438n("desktop_multibackground") String str2, @C12438n("products") List list, @C12438n("isMandatory") Boolean bool, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffProductOrder$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.buttonName = null;
        } else {
            this.buttonName = str;
        }
        if ((i & 2) == 0) {
            this.desktopMultibackground = null;
        } else {
            this.desktopMultibackground = str2;
        }
        if ((i & 4) == 0) {
            this.products = null;
        } else {
            this.products = list;
        }
        if ((i & 8) == 0) {
            this.isMandatory = null;
        } else {
            this.isMandatory = bool;
        }
    }

    public BffProductOrder(@C12580l String str, @C12580l String str2, @C12580l List<String> list, @C12580l Boolean bool) {
        this.buttonName = str;
        this.desktopMultibackground = str2;
        this.products = list;
        this.isMandatory = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffProductOrder(String str, String str2, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool);
    }
}
