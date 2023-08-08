package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.unit.C16476b;
import com.carrefour.fid.android.core.constants.C36187r;
import java.math.BigDecimal;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12196b;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 V2\u00020\u0001:\u0003WVXB£\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bP\u0010QB·\u0001\b\u0017\u0012\u0006\u0010R\u001a\u00020+\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bP\u0010UJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J¬\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b5\u00103\u001a\u0004\b4\u00101R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010/\u0012\u0004\b7\u00103\u001a\u0004\b6\u00101R\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010/\u0012\u0004\b9\u00103\u001a\u0004\b8\u00101R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010/\u0012\u0004\b;\u00103\u001a\u0004\b:\u00101R\"\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010/\u0012\u0004\bA\u00103\u001a\u0004\b@\u00101R\"\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010B\u0012\u0004\bC\u00103\u001a\u0004\b\"\u0010\u0014R\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010/\u0012\u0004\bE\u00103\u001a\u0004\bD\u00101R\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010/\u0012\u0004\bG\u00103\u001a\u0004\bF\u00101R\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010/\u0012\u0004\bI\u00103\u001a\u0004\bH\u00101R\"\u0010&\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010J\u0012\u0004\bM\u00103\u001a\u0004\bK\u0010LR\"\u0010'\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010J\u0012\u0004\bO\u00103\u001a\u0004\bN\u0010L¨\u0006Y"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;", "component6", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "Ljava/math/BigDecimal;", "component12", "component13", "maximalCapacity", "capacityUsed", "dateBegin", "dateEnd", "id", "status", "slice", "isAvailable", "cutOff", "usedDayCapacity", "roundReference", "deliveryFees", "preparationFees", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getMaximalCapacity", "()Ljava/lang/String;", "getMaximalCapacity$annotations", "()V", "getCapacityUsed", "getCapacityUsed$annotations", "getDateBegin", "getDateBegin$annotations", "getDateEnd", "getDateEnd$annotations", "getId", "getId$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;", "getStatus", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;", "getStatus$annotations", "getSlice", "getSlice$annotations", "Ljava/lang/Boolean;", "isAvailable$annotations", "getCutOff", "getCutOff$annotations", "getUsedDayCapacity", "getUsedDayCapacity$annotations", "getRoundReference", "getRoundReference$annotations", "Ljava/math/BigDecimal;", "getDeliveryFees", "()Ljava/math/BigDecimal;", "getDeliveryFees$annotations", "getPreparationFees", "getPreparationFees$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "Status", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSlot {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String capacityUsed;
    @C12580l
    private final String cutOff;
    @C12580l
    private final String dateBegin;
    @C12580l
    private final String dateEnd;
    @C12580l
    private final BigDecimal deliveryFees;
    @C12580l

    /* renamed from: id */
    private final String f100679id;
    @C12580l
    private final Boolean isAvailable;
    @C12580l
    private final String maximalCapacity;
    @C12580l
    private final BigDecimal preparationFees;
    @C12580l
    private final String roundReference;
    @C12580l
    private final String slice;
    @C12580l
    private final Status status;
    @C12580l
    private final String usedDayCapacity;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSlot> serializer() {
            return BffSlot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "oPEN", "cLOSE", "fULL", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum Status {
        oPEN(C36187r.f89350a),
        cLOSE(C36187r.f89352c),
        fULL(C36187r.f89351b),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot$Status;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) Status.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<Status> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393621.INSTANCE);
        }

        private Status(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    static {
        Class<BigDecimal> cls = BigDecimal.class;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, null, null, null, null, null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0])};
    }

    public BffSlot() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Status) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, (int) C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffSlot copy$default(BffSlot bffSlot, String str, String str2, String str3, String str4, String str5, Status status2, String str6, Boolean bool, String str7, String str8, String str9, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        BffSlot bffSlot2 = bffSlot;
        int i2 = i;
        return bffSlot.copy((i2 & 1) != 0 ? bffSlot2.maximalCapacity : str, (i2 & 2) != 0 ? bffSlot2.capacityUsed : str2, (i2 & 4) != 0 ? bffSlot2.dateBegin : str3, (i2 & 8) != 0 ? bffSlot2.dateEnd : str4, (i2 & 16) != 0 ? bffSlot2.f100679id : str5, (i2 & 32) != 0 ? bffSlot2.status : status2, (i2 & 64) != 0 ? bffSlot2.slice : str6, (i2 & 128) != 0 ? bffSlot2.isAvailable : bool, (i2 & 256) != 0 ? bffSlot2.cutOff : str7, (i2 & 512) != 0 ? bffSlot2.usedDayCapacity : str8, (i2 & 1024) != 0 ? bffSlot2.roundReference : str9, (i2 & 2048) != 0 ? bffSlot2.deliveryFees : bigDecimal, (i2 & 4096) != 0 ? bffSlot2.preparationFees : bigDecimal2);
    }

    @C12438n("capacity_used")
    public static /* synthetic */ void getCapacityUsed$annotations() {
    }

    @C12438n("cut_off")
    public static /* synthetic */ void getCutOff$annotations() {
    }

    @C12438n("date_begin")
    public static /* synthetic */ void getDateBegin$annotations() {
    }

    @C12438n("date_end")
    public static /* synthetic */ void getDateEnd$annotations() {
    }

    @C12196b
    @C12438n("delivery_fees")
    public static /* synthetic */ void getDeliveryFees$annotations() {
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("maximal_capacity")
    public static /* synthetic */ void getMaximalCapacity$annotations() {
    }

    @C12196b
    @C12438n("preparation_fees")
    public static /* synthetic */ void getPreparationFees$annotations() {
    }

    @C12438n("round_reference")
    public static /* synthetic */ void getRoundReference$annotations() {
    }

    @C12438n("slice")
    public static /* synthetic */ void getSlice$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C12438n("used_day_capacity")
    public static /* synthetic */ void getUsedDayCapacity$annotations() {
    }

    @C12438n("is_available")
    public static /* synthetic */ void isAvailable$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSlot bffSlot, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffSlot.maximalCapacity != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffSlot.maximalCapacity);
        }
        if (dVar.mo24897A(fVar, 1) || bffSlot.capacityUsed != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffSlot.capacityUsed);
        }
        if (dVar.mo24897A(fVar, 2) || bffSlot.dateBegin != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffSlot.dateBegin);
        }
        if (dVar.mo24897A(fVar, 3) || bffSlot.dateEnd != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffSlot.dateEnd);
        }
        if (dVar.mo24897A(fVar, 4) || bffSlot.f100679id != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffSlot.f100679id);
        }
        if (dVar.mo24897A(fVar, 5) || bffSlot.status != null) {
            dVar.mo24912i(fVar, 5, BffSlot$Status$$serializer.INSTANCE, bffSlot.status);
        }
        if (dVar.mo24897A(fVar, 6) || bffSlot.slice != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffSlot.slice);
        }
        if (dVar.mo24897A(fVar, 7) || bffSlot.isAvailable != null) {
            dVar.mo24912i(fVar, 7, C12278i.f30070a, bffSlot.isAvailable);
        }
        if (dVar.mo24897A(fVar, 8) || bffSlot.cutOff != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffSlot.cutOff);
        }
        if (dVar.mo24897A(fVar, 9) || bffSlot.usedDayCapacity != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffSlot.usedDayCapacity);
        }
        if (dVar.mo24897A(fVar, 10) || bffSlot.roundReference != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffSlot.roundReference);
        }
        if (dVar.mo24897A(fVar, 11) || bffSlot.deliveryFees != null) {
            dVar.mo24912i(fVar, 11, gVarArr[11], bffSlot.deliveryFees);
        }
        if (dVar.mo24897A(fVar, 12) || bffSlot.preparationFees != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 12, gVarArr[12], bffSlot.preparationFees);
        }
    }

    @C12580l
    public final String component1() {
        return this.maximalCapacity;
    }

    @C12580l
    public final String component10() {
        return this.usedDayCapacity;
    }

    @C12580l
    public final String component11() {
        return this.roundReference;
    }

    @C12580l
    public final BigDecimal component12() {
        return this.deliveryFees;
    }

    @C12580l
    public final BigDecimal component13() {
        return this.preparationFees;
    }

    @C12580l
    public final String component2() {
        return this.capacityUsed;
    }

    @C12580l
    public final String component3() {
        return this.dateBegin;
    }

    @C12580l
    public final String component4() {
        return this.dateEnd;
    }

    @C12580l
    public final String component5() {
        return this.f100679id;
    }

    @C12580l
    public final Status component6() {
        return this.status;
    }

    @C12580l
    public final String component7() {
        return this.slice;
    }

    @C12580l
    public final Boolean component8() {
        return this.isAvailable;
    }

    @C12580l
    public final String component9() {
        return this.cutOff;
    }

    @C12579k
    public final BffSlot copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Status status2, @C12580l String str6, @C12580l Boolean bool, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l BigDecimal bigDecimal, @C12580l BigDecimal bigDecimal2) {
        return new BffSlot(str, str2, str3, str4, str5, status2, str6, bool, str7, str8, str9, bigDecimal, bigDecimal2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSlot)) {
            return false;
        }
        BffSlot bffSlot = (BffSlot) obj;
        return Intrinsics.areEqual((Object) this.maximalCapacity, (Object) bffSlot.maximalCapacity) && Intrinsics.areEqual((Object) this.capacityUsed, (Object) bffSlot.capacityUsed) && Intrinsics.areEqual((Object) this.dateBegin, (Object) bffSlot.dateBegin) && Intrinsics.areEqual((Object) this.dateEnd, (Object) bffSlot.dateEnd) && Intrinsics.areEqual((Object) this.f100679id, (Object) bffSlot.f100679id) && this.status == bffSlot.status && Intrinsics.areEqual((Object) this.slice, (Object) bffSlot.slice) && Intrinsics.areEqual((Object) this.isAvailable, (Object) bffSlot.isAvailable) && Intrinsics.areEqual((Object) this.cutOff, (Object) bffSlot.cutOff) && Intrinsics.areEqual((Object) this.usedDayCapacity, (Object) bffSlot.usedDayCapacity) && Intrinsics.areEqual((Object) this.roundReference, (Object) bffSlot.roundReference) && Intrinsics.areEqual((Object) this.deliveryFees, (Object) bffSlot.deliveryFees) && Intrinsics.areEqual((Object) this.preparationFees, (Object) bffSlot.preparationFees);
    }

    @C12580l
    public final String getCapacityUsed() {
        return this.capacityUsed;
    }

    @C12580l
    public final String getCutOff() {
        return this.cutOff;
    }

    @C12580l
    public final String getDateBegin() {
        return this.dateBegin;
    }

    @C12580l
    public final String getDateEnd() {
        return this.dateEnd;
    }

    @C12580l
    public final BigDecimal getDeliveryFees() {
        return this.deliveryFees;
    }

    @C12580l
    public final String getId() {
        return this.f100679id;
    }

    @C12580l
    public final String getMaximalCapacity() {
        return this.maximalCapacity;
    }

    @C12580l
    public final BigDecimal getPreparationFees() {
        return this.preparationFees;
    }

    @C12580l
    public final String getRoundReference() {
        return this.roundReference;
    }

    @C12580l
    public final String getSlice() {
        return this.slice;
    }

    @C12580l
    public final Status getStatus() {
        return this.status;
    }

    @C12580l
    public final String getUsedDayCapacity() {
        return this.usedDayCapacity;
    }

    public int hashCode() {
        String str = this.maximalCapacity;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.capacityUsed;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateBegin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateEnd;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f100679id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Status status2 = this.status;
        int hashCode6 = (hashCode5 + (status2 == null ? 0 : status2.hashCode())) * 31;
        String str6 = this.slice;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isAvailable;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.cutOff;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.usedDayCapacity;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.roundReference;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal = this.deliveryFees;
        int hashCode12 = (hashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.preparationFees;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return hashCode12 + i;
    }

    @C12580l
    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    @C12579k
    public String toString() {
        String str = this.maximalCapacity;
        String str2 = this.capacityUsed;
        String str3 = this.dateBegin;
        String str4 = this.dateEnd;
        String str5 = this.f100679id;
        Status status2 = this.status;
        String str6 = this.slice;
        Boolean bool = this.isAvailable;
        String str7 = this.cutOff;
        String str8 = this.usedDayCapacity;
        String str9 = this.roundReference;
        BigDecimal bigDecimal = this.deliveryFees;
        BigDecimal bigDecimal2 = this.preparationFees;
        return "BffSlot(maximalCapacity=" + str + ", capacityUsed=" + str2 + ", dateBegin=" + str3 + ", dateEnd=" + str4 + ", id=" + str5 + ", status=" + status2 + ", slice=" + str6 + ", isAvailable=" + bool + ", cutOff=" + str7 + ", usedDayCapacity=" + str8 + ", roundReference=" + str9 + ", deliveryFees=" + bigDecimal + ", preparationFees=" + bigDecimal2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSlot(int i, @C12438n("maximal_capacity") String str, @C12438n("capacity_used") String str2, @C12438n("date_begin") String str3, @C12438n("date_end") String str4, @C12438n("id") String str5, @C12438n("status") Status status2, @C12438n("slice") String str6, @C12438n("is_available") Boolean bool, @C12438n("cut_off") String str7, @C12438n("used_day_capacity") String str8, @C12438n("round_reference") String str9, @C12196b @C12438n("delivery_fees") BigDecimal bigDecimal, @C12196b @C12438n("preparation_fees") BigDecimal bigDecimal2, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffSlot$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.maximalCapacity = null;
        } else {
            this.maximalCapacity = str;
        }
        if ((i2 & 2) == 0) {
            this.capacityUsed = null;
        } else {
            this.capacityUsed = str2;
        }
        if ((i2 & 4) == 0) {
            this.dateBegin = null;
        } else {
            this.dateBegin = str3;
        }
        if ((i2 & 8) == 0) {
            this.dateEnd = null;
        } else {
            this.dateEnd = str4;
        }
        if ((i2 & 16) == 0) {
            this.f100679id = null;
        } else {
            this.f100679id = str5;
        }
        if ((i2 & 32) == 0) {
            this.status = null;
        } else {
            this.status = status2;
        }
        if ((i2 & 64) == 0) {
            this.slice = null;
        } else {
            this.slice = str6;
        }
        if ((i2 & 128) == 0) {
            this.isAvailable = null;
        } else {
            this.isAvailable = bool;
        }
        if ((i2 & 256) == 0) {
            this.cutOff = null;
        } else {
            this.cutOff = str7;
        }
        if ((i2 & 512) == 0) {
            this.usedDayCapacity = null;
        } else {
            this.usedDayCapacity = str8;
        }
        if ((i2 & 1024) == 0) {
            this.roundReference = null;
        } else {
            this.roundReference = str9;
        }
        if ((i2 & 2048) == 0) {
            this.deliveryFees = null;
        } else {
            this.deliveryFees = bigDecimal;
        }
        if ((i2 & 4096) == 0) {
            this.preparationFees = null;
        } else {
            this.preparationFees = bigDecimal2;
        }
    }

    public BffSlot(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Status status2, @C12580l String str6, @C12580l Boolean bool, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l BigDecimal bigDecimal, @C12580l BigDecimal bigDecimal2) {
        this.maximalCapacity = str;
        this.capacityUsed = str2;
        this.dateBegin = str3;
        this.dateEnd = str4;
        this.f100679id = str5;
        this.status = status2;
        this.slice = str6;
        this.isAvailable = bool;
        this.cutOff = str7;
        this.usedDayCapacity = str8;
        this.roundReference = str9;
        this.deliveryFees = bigDecimal;
        this.preparationFees = bigDecimal2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffSlot(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot.Status r20, java.lang.String r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.math.BigDecimal r26, java.math.BigDecimal r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
