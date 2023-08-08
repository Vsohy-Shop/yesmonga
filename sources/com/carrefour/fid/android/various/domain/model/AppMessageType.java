package com.carrefour.fid.android.various.domain.model;

import androidx.annotation.Keep;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.EnumDescriptor;
import org.jetbrains.annotations.C12579k;

@Keep
@C12439o
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "BROADCAST", "VERSION", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum AppMessageType {
    BROADCAST,
    VERSION;
    
    /* access modifiers changed from: private */
    @C12579k
    public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
    @C12579k
    public static final C22792b Companion = null;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessageType$a */
    public static final class C22791a implements C12327y<AppMessageType> {
        @C12579k

        /* renamed from: a */
        public static final C22791a f58352a = null;

        /* renamed from: b */
        public static final /* synthetic */ EnumDescriptor f58353b = null;

        static {
            f58352a = new C22791a();
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.carrefour.fid.android.various.domain.model.AppMessageType", 2);
            enumDescriptor.mo24966k("BROADCAST", false);
            enumDescriptor.mo24966k("VERSION", false);
            f58353b = enumDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public AppMessageType deserialize(@C12579k C12241e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            return AppMessageType.values()[eVar.mo24877e(getDescriptor())];
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k AppMessageType appMessageType) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(appMessageType, "value");
            gVar.mo24914k(getDescriptor(), appMessageType.ordinal());
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[0];
        }

        @C12579k
        public C12217f getDescriptor() {
            return f58353b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessageType$b */
    public static final class C22792b {
        public /* synthetic */ C22792b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final /* synthetic */ C12248g m103031a() {
            return (C12248g) AppMessageType.$cachedSerializer$delegate.getValue();
        }

        @C12579k
        public final C12248g<AppMessageType> serializer() {
            return m103031a();
        }

        public C22792b() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C22792b((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, AppMessageType$Companion$1.f58354f);
    }
}
