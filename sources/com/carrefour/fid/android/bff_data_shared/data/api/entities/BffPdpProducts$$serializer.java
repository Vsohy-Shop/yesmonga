package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpProducts.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpProducts;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffPdpProducts$$serializer implements C12327y<BffPdpProducts> {
    @C12579k
    public static final BffPdpProducts$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffPdpProducts$$serializer bffPdpProducts$$serializer = new BffPdpProducts$$serializer();
        INSTANCE = bffPdpProducts$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpProducts", bffPdpProducts$$serializer, 2);
        pluginGeneratedSerialDescriptor.mo24966k("product", true);
        pluginGeneratedSerialDescriptor.mo24966k("mixed_products", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffPdpProducts$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        return new C12248g[]{C12197a.m48817q(BffCommonProduct$$serializer.INSTANCE), C12197a.m48817q(BffPdpProducts.$childSerializers[1])};
    }

    @C12579k
    public BffPdpProducts deserialize(@C12579k C12241e eVar) {
        int i;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12217f descriptor2 = getDescriptor();
        C12236c b = eVar.mo24875b(descriptor2);
        C12248g[] access$get$childSerializers$cp = BffPdpProducts.$childSerializers;
        if (b.mo24886p()) {
            obj = b.mo24885n(descriptor2, 0, BffCommonProduct$$serializer.INSTANCE, null);
            obj2 = b.mo24885n(descriptor2, 1, access$get$childSerializers$cp[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj3 = null;
            Object obj4 = null;
            while (z) {
                int o = b.mo24931o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj4 = b.mo24885n(descriptor2, 0, BffCommonProduct$$serializer.INSTANCE, obj4);
                    i2 |= 1;
                } else if (o == 1) {
                    obj3 = b.mo24885n(descriptor2, 1, access$get$childSerializers$cp[1], obj3);
                    i2 |= 2;
                } else {
                    throw new UnknownFieldException(o);
                }
            }
            obj2 = obj3;
            obj = obj4;
            i = i2;
        }
        b.mo24876c(descriptor2);
        return new BffPdpProducts(i, (BffCommonProduct) obj, (List) obj2, (C12295n1) null);
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffPdpProducts bffPdpProducts) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffPdpProducts, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffPdpProducts.write$Self(bffPdpProducts, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
