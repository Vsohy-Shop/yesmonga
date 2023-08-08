package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.dlv.DlvOption;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001a\u0010\u001bB-\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/data/entities/dlv/DlvOption;", "component1", "deliveryOptions", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getDeliveryOptions", "()Ljava/util/List;", "getDeliveryOptions$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DlvResponse {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(DlvOption.C36433a.f90095a)};
    public static final int $stable = 8;
    @C12579k
    public static final C36438b Companion = new C36438b((DefaultConstructorMarker) null);
    @C12579k
    private final List<DlvOption> deliveryOptions;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvResponse$a */
    public static final class C36437a implements C12327y<DlvResponse> {
        @C12579k

        /* renamed from: a */
        public static final C36437a f90101a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90102b;

        /* renamed from: c */
        public static final int f90103c = 0;

        static {
            C36437a aVar = new C36437a();
            f90101a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.mo24966k("delivery_options", false);
            f90102b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public DlvResponse deserialize(@C12579k C12241e eVar) {
            Object obj;
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar.mo24875b(descriptor);
            C12248g[] access$get$childSerializers$cp = DlvResponse.$childSerializers;
            int i = 1;
            if (b.mo24886p()) {
                obj = b.mo24895y(descriptor, 0, access$get$childSerializers$cp[0], null);
            } else {
                int i2 = 0;
                Object obj2 = null;
                while (i != 0) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        i = 0;
                    } else if (o == 0) {
                        obj2 = b.mo24895y(descriptor, 0, access$get$childSerializers$cp[0], obj2);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                obj = obj2;
                i = i2;
            }
            b.mo24876c(descriptor);
            return new DlvResponse(i, (List) obj, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvResponse dlvResponse) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvResponse, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            b.mo24899D(descriptor, 0, DlvResponse.$childSerializers[0], dlvResponse.deliveryOptions);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[]{DlvResponse.$childSerializers[0]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90102b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvResponse$b */
    public static final class C36438b {
        public /* synthetic */ C36438b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DlvResponse> serializer() {
            return C36437a.f90101a;
        }

        public C36438b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DlvResponse(int i, @C12438n("delivery_options") List list, C12295n1 n1Var) {
        if (1 != (i & 1)) {
            C12261c1.m49256b(i, 1, C36437a.f90101a.getDescriptor());
        }
        this.deliveryOptions = list;
    }

    public static /* synthetic */ DlvResponse copy$default(DlvResponse dlvResponse, List<DlvOption> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dlvResponse.deliveryOptions;
        }
        return dlvResponse.copy(list);
    }

    @C12438n("delivery_options")
    public static /* synthetic */ void getDeliveryOptions$annotations() {
    }

    @C12579k
    public final List<DlvOption> component1() {
        return this.deliveryOptions;
    }

    @C12579k
    public final DlvResponse copy(@C12579k List<DlvOption> list) {
        Intrinsics.checkNotNullParameter(list, "deliveryOptions");
        return new DlvResponse(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlvResponse) && Intrinsics.areEqual((Object) this.deliveryOptions, (Object) ((DlvResponse) obj).deliveryOptions);
    }

    @C12579k
    public final List<DlvOption> getDeliveryOptions() {
        return this.deliveryOptions;
    }

    public int hashCode() {
        return this.deliveryOptions.hashCode();
    }

    @C12579k
    public String toString() {
        List<DlvOption> list = this.deliveryOptions;
        return "DlvResponse(deliveryOptions=" + list + ")";
    }

    public DlvResponse(@C12579k List<DlvOption> list) {
        Intrinsics.checkNotNullParameter(list, "deliveryOptions");
        this.deliveryOptions = list;
    }
}
