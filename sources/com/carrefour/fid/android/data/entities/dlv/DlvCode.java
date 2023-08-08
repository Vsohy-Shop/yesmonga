package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
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
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvCode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "AXS", "AXL", "XXL", "PRC", "PRE", "EXS", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum DlvCode {
    AXS,
    AXL,
    XXL,
    PRC,
    PRE,
    EXS;
    
    /* access modifiers changed from: private */
    @C12579k
    public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
    @C12579k
    public static final C36428b Companion = null;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvCode$a */
    public static final class C36427a implements C12327y<DlvCode> {
        @C12579k

        /* renamed from: a */
        public static final C36427a f90084a = null;

        /* renamed from: b */
        public static final /* synthetic */ EnumDescriptor f90085b = null;

        /* renamed from: c */
        public static final int f90086c = 0;

        static {
            f90084a = new C36427a();
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvCode", 6);
            enumDescriptor.mo24966k("AXS", false);
            enumDescriptor.mo24966k("AXL", false);
            enumDescriptor.mo24966k("XXL", false);
            enumDescriptor.mo24966k("PRC", false);
            enumDescriptor.mo24966k("PRE", false);
            enumDescriptor.mo24966k("EXS", false);
            f90085b = enumDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public DlvCode deserialize(@C12579k C12241e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            return DlvCode.values()[eVar.mo24877e(getDescriptor())];
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvCode dlvCode) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvCode, "value");
            gVar.mo24914k(getDescriptor(), dlvCode.ordinal());
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            return new C12248g[0];
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90085b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvCode$b */
    public static final class C36428b {
        public /* synthetic */ C36428b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final /* synthetic */ C12248g m149488a() {
            return (C12248g) DlvCode.$cachedSerializer$delegate.getValue();
        }

        @C12579k
        public final C12248g<DlvCode> serializer() {
            return m149488a();
        }

        public C36428b() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C36428b((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, DlvCode$Companion$1.f90087f);
    }
}
