package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cB-\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/GtinWithQty;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "gtin", "quantity", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getGtin", "()Ljava/lang/String;", "I", "getQuantity", "()I", "<init>", "(Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class GtinWithQty {
    public static final int $stable = 0;
    @C12579k
    public static final C36440b Companion = new C36440b((DefaultConstructorMarker) null);
    @C12579k
    private final String gtin;
    private final int quantity;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.GtinWithQty$a */
    public static final class C36439a implements C12327y<GtinWithQty> {
        @C12579k

        /* renamed from: a */
        public static final C36439a f90104a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90105b;

        /* renamed from: c */
        public static final int f90106c = 0;

        static {
            C36439a aVar = new C36439a();
            f90104a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.GtinWithQty", aVar, 2);
            pluginGeneratedSerialDescriptor.mo24966k("gtin", false);
            pluginGeneratedSerialDescriptor.mo24966k("quantity", false);
            f90105b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public GtinWithQty deserialize(@C12579k C12241e eVar) {
            int i;
            int i2;
            String str;
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar.mo24875b(descriptor);
            if (b.mo24886p()) {
                str = b.mo24884m(descriptor, 0);
                i2 = b.mo24880i(descriptor, 1);
                i = 3;
            } else {
                boolean z = true;
                int i3 = 0;
                int i4 = 0;
                str = null;
                while (z) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        str = b.mo24884m(descriptor, 0);
                        i4 |= 1;
                    } else if (o == 1) {
                        i3 = b.mo24880i(descriptor, 1);
                        i4 |= 2;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                i2 = i3;
                i = i4;
            }
            b.mo24876c(descriptor);
            return new GtinWithQty(i, str, i2, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k GtinWithQty gtinWithQty) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(gtinWithQty, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            GtinWithQty.write$Self(gtinWithQty, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[]{C12310s1.f30117a, C12276h0.f30067a};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90105b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.GtinWithQty$b */
    public static final class C36440b {
        public /* synthetic */ C36440b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<GtinWithQty> serializer() {
            return C36439a.f90104a;
        }

        public C36440b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ GtinWithQty(int i, String str, int i2, C12295n1 n1Var) {
        if (3 != (i & 3)) {
            C12261c1.m49256b(i, 3, C36439a.f90104a.getDescriptor());
        }
        this.gtin = str;
        this.quantity = i2;
    }

    public static /* synthetic */ GtinWithQty copy$default(GtinWithQty gtinWithQty, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gtinWithQty.gtin;
        }
        if ((i2 & 2) != 0) {
            i = gtinWithQty.quantity;
        }
        return gtinWithQty.copy(str, i);
    }

    @C11384m
    public static final /* synthetic */ void write$Self(GtinWithQty gtinWithQty, C12239d dVar, C12217f fVar) {
        dVar.mo24929z(fVar, 0, gtinWithQty.gtin);
        dVar.mo24927x(fVar, 1, gtinWithQty.quantity);
    }

    @C12579k
    public final String component1() {
        return this.gtin;
    }

    public final int component2() {
        return this.quantity;
    }

    @C12579k
    public final GtinWithQty copy(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        return new GtinWithQty(str, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GtinWithQty)) {
            return false;
        }
        GtinWithQty gtinWithQty = (GtinWithQty) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) gtinWithQty.gtin) && this.quantity == gtinWithQty.quantity;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (this.gtin.hashCode() * 31) + Integer.hashCode(this.quantity);
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        int i = this.quantity;
        return "GtinWithQty(gtin=" + str + ", quantity=" + i + ")";
    }

    public GtinWithQty(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.gtin = str;
        this.quantity = i;
    }
}
