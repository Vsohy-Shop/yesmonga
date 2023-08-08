package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffTopTerm.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTopTerm;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffTopTerm$$serializer implements C12327y<BffTopTerm> {
    @C12579k
    public static final BffTopTerm$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffTopTerm$$serializer bffTopTerm$$serializer = new BffTopTerm$$serializer();
        INSTANCE = bffTopTerm$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTopTerm", bffTopTerm$$serializer, 3);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78927O, false);
        pluginGeneratedSerialDescriptor.mo24966k("count", false);
        pluginGeneratedSerialDescriptor.mo24966k("selected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffTopTerm$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        return new C12248g[]{C12310s1.f30117a, C12276h0.f30067a, C12278i.f30070a};
    }

    @C12579k
    public BffTopTerm deserialize(@C12579k C12241e eVar) {
        boolean z;
        int i;
        String str;
        int i2;
        C12241e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "decoder");
        C12217f descriptor2 = getDescriptor();
        C12236c b = eVar2.mo24875b(descriptor2);
        if (b.mo24886p()) {
            String m = b.mo24884m(descriptor2, 0);
            int i3 = b.mo24880i(descriptor2, 1);
            str = m;
            z = b.mo24866C(descriptor2, 2);
            i = i3;
            i2 = 7;
        } else {
            String str2 = null;
            boolean z2 = true;
            boolean z3 = false;
            int i4 = 0;
            int i5 = 0;
            while (z2) {
                int o = b.mo24931o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    str2 = b.mo24884m(descriptor2, 0);
                    i5 |= 1;
                } else if (o == 1) {
                    i4 = b.mo24880i(descriptor2, 1);
                    i5 |= 2;
                } else if (o == 2) {
                    z3 = b.mo24866C(descriptor2, 2);
                    i5 |= 4;
                } else {
                    throw new UnknownFieldException(o);
                }
            }
            str = str2;
            z = z3;
            i = i4;
            i2 = i5;
        }
        b.mo24876c(descriptor2);
        return new BffTopTerm(i2, str, i, z, (C12295n1) null);
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffTopTerm bffTopTerm) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffTopTerm, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffTopTerm.write$Self(bffTopTerm, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
