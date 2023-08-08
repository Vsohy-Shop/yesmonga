package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.dlv.GtinWithQty;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 &2\u00020\u0001:\u0002'(B#\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvRequest;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "Lcom/carrefour/fid/android/data/entities/dlv/GtinWithQty;", "component2", "facilityServiceId", "gtinsWithQty", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFacilityServiceId", "()Ljava/lang/String;", "getFacilityServiceId$annotations", "()V", "Ljava/util/List;", "getGtinsWithQty", "()Ljava/util/List;", "getGtinsWithQty$annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DlvRequest {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, new C12269f(GtinWithQty.C36439a.f90104a)};
    public static final int $stable = 8;
    @C12579k
    public static final C36436b Companion = new C36436b((DefaultConstructorMarker) null);
    @C12580l
    private final String facilityServiceId;
    @C12579k
    private final List<GtinWithQty> gtinsWithQty;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvRequest$a */
    public static final class C36435a implements C12327y<DlvRequest> {
        @C12579k

        /* renamed from: a */
        public static final C36435a f90098a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90099b;

        /* renamed from: c */
        public static final int f90100c = 0;

        static {
            C36435a aVar = new C36435a();
            f90098a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.mo24966k("facility_service_id", true);
            pluginGeneratedSerialDescriptor.mo24966k("offers", true);
            f90099b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public DlvRequest deserialize(@C12579k C12241e eVar) {
            int i;
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar.mo24875b(descriptor);
            C12248g[] access$get$childSerializers$cp = DlvRequest.$childSerializers;
            if (b.mo24886p()) {
                obj = b.mo24885n(descriptor, 0, C12310s1.f30117a, null);
                obj2 = b.mo24895y(descriptor, 1, access$get$childSerializers$cp[1], null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                Object obj3 = null;
                Object obj4 = null;
                while (z) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        obj4 = b.mo24885n(descriptor, 0, C12310s1.f30117a, obj4);
                        i2 |= 1;
                    } else if (o == 1) {
                        obj3 = b.mo24895y(descriptor, 1, access$get$childSerializers$cp[1], obj3);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                obj2 = obj3;
                obj = obj4;
                i = i2;
            }
            b.mo24876c(descriptor);
            return new DlvRequest(i, (String) obj, (List) obj2, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvRequest dlvRequest) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvRequest, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            DlvRequest.write$Self(dlvRequest, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[]{C12197a.m48817q(C12310s1.f30117a), DlvRequest.$childSerializers[1]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90099b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvRequest$b */
    public static final class C36436b {
        public /* synthetic */ C36436b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DlvRequest> serializer() {
            return C36435a.f90098a;
        }

        public C36436b() {
        }
    }

    public DlvRequest() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DlvRequest copy$default(DlvRequest dlvRequest, String str, List<GtinWithQty> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlvRequest.facilityServiceId;
        }
        if ((i & 2) != 0) {
            list = dlvRequest.gtinsWithQty;
        }
        return dlvRequest.copy(str, list);
    }

    @C12438n("facility_service_id")
    public static /* synthetic */ void getFacilityServiceId$annotations() {
    }

    @C12438n("offers")
    public static /* synthetic */ void getGtinsWithQty$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(DlvRequest dlvRequest, C12239d dVar, C12217f fVar) {
        boolean z;
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z2 = false;
        if (!dVar.mo24897A(fVar, 0) && Intrinsics.areEqual((Object) dlvRequest.facilityServiceId, (Object) new String())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, dlvRequest.facilityServiceId);
        }
        if (dVar.mo24897A(fVar, 1) || !Intrinsics.areEqual((Object) dlvRequest.gtinsWithQty, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z2 = true;
        }
        if (z2) {
            dVar.mo24899D(fVar, 1, gVarArr[1], dlvRequest.gtinsWithQty);
        }
    }

    @C12580l
    public final String component1() {
        return this.facilityServiceId;
    }

    @C12579k
    public final List<GtinWithQty> component2() {
        return this.gtinsWithQty;
    }

    @C12579k
    public final DlvRequest copy(@C12580l String str, @C12579k List<GtinWithQty> list) {
        Intrinsics.checkNotNullParameter(list, "gtinsWithQty");
        return new DlvRequest(str, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlvRequest)) {
            return false;
        }
        DlvRequest dlvRequest = (DlvRequest) obj;
        return Intrinsics.areEqual((Object) this.facilityServiceId, (Object) dlvRequest.facilityServiceId) && Intrinsics.areEqual((Object) this.gtinsWithQty, (Object) dlvRequest.gtinsWithQty);
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12579k
    public final List<GtinWithQty> getGtinsWithQty() {
        return this.gtinsWithQty;
    }

    public int hashCode() {
        String str = this.facilityServiceId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.gtinsWithQty.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.facilityServiceId;
        List<GtinWithQty> list = this.gtinsWithQty;
        return "DlvRequest(facilityServiceId=" + str + ", gtinsWithQty=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DlvRequest(int i, @C12438n("facility_service_id") String str, @C12438n("offers") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C36435a.f90098a.getDescriptor());
        }
        this.facilityServiceId = (i & 1) == 0 ? new String() : str;
        if ((i & 2) == 0) {
            this.gtinsWithQty = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.gtinsWithQty = list;
        }
    }

    public DlvRequest(@C12580l String str, @C12579k List<GtinWithQty> list) {
        Intrinsics.checkNotNullParameter(list, "gtinsWithQty");
        this.facilityServiceId = str;
        this.gtinsWithQty = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlvRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
