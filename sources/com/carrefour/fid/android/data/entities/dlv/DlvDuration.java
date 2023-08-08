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
import kotlinx.serialization.C12438n;
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
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB1\b\u0017\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvDuration;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "temporalUnit", "value", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTemporalUnit", "()Ljava/lang/String;", "getTemporalUnit$annotations", "()V", "I", "getValue", "()I", "getValue$annotations", "<init>", "(Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DlvDuration {
    public static final int $stable = 0;
    @C12579k
    public static final C36430b Companion = new C36430b((DefaultConstructorMarker) null);
    @C12579k
    private final String temporalUnit;
    private final int value;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvDuration$a */
    public static final class C36429a implements C12327y<DlvDuration> {
        @C12579k

        /* renamed from: a */
        public static final C36429a f90088a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90089b;

        /* renamed from: c */
        public static final int f90090c = 0;

        static {
            C36429a aVar = new C36429a();
            f90088a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvDuration", aVar, 2);
            pluginGeneratedSerialDescriptor.mo24966k("temporal_unit", false);
            pluginGeneratedSerialDescriptor.mo24966k("value", false);
            f90089b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public DlvDuration deserialize(@C12579k C12241e eVar) {
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
            return new DlvDuration(i, str, i2, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvDuration dlvDuration) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvDuration, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            DlvDuration.write$Self(dlvDuration, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[]{C12310s1.f30117a, C12276h0.f30067a};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90089b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvDuration$b */
    public static final class C36430b {
        public /* synthetic */ C36430b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DlvDuration> serializer() {
            return C36429a.f90088a;
        }

        public C36430b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DlvDuration(int i, @C12438n("temporal_unit") String str, @C12438n("value") int i2, C12295n1 n1Var) {
        if (3 != (i & 3)) {
            C12261c1.m49256b(i, 3, C36429a.f90088a.getDescriptor());
        }
        this.temporalUnit = str;
        this.value = i2;
    }

    public static /* synthetic */ DlvDuration copy$default(DlvDuration dlvDuration, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dlvDuration.temporalUnit;
        }
        if ((i2 & 2) != 0) {
            i = dlvDuration.value;
        }
        return dlvDuration.copy(str, i);
    }

    @C12438n("temporal_unit")
    public static /* synthetic */ void getTemporalUnit$annotations() {
    }

    @C12438n("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(DlvDuration dlvDuration, C12239d dVar, C12217f fVar) {
        dVar.mo24929z(fVar, 0, dlvDuration.temporalUnit);
        dVar.mo24927x(fVar, 1, dlvDuration.value);
    }

    @C12579k
    public final String component1() {
        return this.temporalUnit;
    }

    public final int component2() {
        return this.value;
    }

    @C12579k
    public final DlvDuration copy(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "temporalUnit");
        return new DlvDuration(str, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlvDuration)) {
            return false;
        }
        DlvDuration dlvDuration = (DlvDuration) obj;
        return Intrinsics.areEqual((Object) this.temporalUnit, (Object) dlvDuration.temporalUnit) && this.value == dlvDuration.value;
    }

    @C12579k
    public final String getTemporalUnit() {
        return this.temporalUnit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.temporalUnit.hashCode() * 31) + Integer.hashCode(this.value);
    }

    @C12579k
    public String toString() {
        String str = this.temporalUnit;
        int i = this.value;
        return "DlvDuration(temporalUnit=" + str + ", value=" + i + ")";
    }

    public DlvDuration(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "temporalUnit");
        this.temporalUnit = str;
        this.value = i;
    }
}
