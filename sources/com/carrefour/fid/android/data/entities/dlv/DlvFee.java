package com.carrefour.fid.android.data.entities.dlv;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
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
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B%\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\"\u0010#B;\b\u0017\u0012\u0006\u0010$\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/dlv/DlvFee;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "unscaledAmount", "scale", "currency", "copy", "toString", "hashCode", "other", "", "equals", "I", "getUnscaledAmount", "()I", "getUnscaledAmount$annotations", "()V", "getScale", "getScale$annotations", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "getCurrency$annotations", "<init>", "(IILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DlvFee {
    public static final int $stable = 0;
    @C12579k
    public static final C36432b Companion = new C36432b((DefaultConstructorMarker) null);
    @C12580l
    private final String currency;
    private final int scale;
    private final int unscaledAmount;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvFee$a */
    public static final class C36431a implements C12327y<DlvFee> {
        @C12579k

        /* renamed from: a */
        public static final C36431a f90091a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f90092b;

        /* renamed from: c */
        public static final int f90093c = 0;

        static {
            C36431a aVar = new C36431a();
            f90091a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.data.entities.dlv.DlvFee", aVar, 3);
            pluginGeneratedSerialDescriptor.mo24966k("unscaled_amount", false);
            pluginGeneratedSerialDescriptor.mo24966k("scale", true);
            pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78955i, true);
            f90092b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.data.entities.dlv.DlvFee deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                boolean r2 = r0.mo24886p()
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x002c
                int r2 = r0.mo24880i(r1, r5)
                int r4 = r0.mo24880i(r1, r4)
                kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
                java.lang.Object r3 = r0.mo24885n(r1, r3, r5, r6)
                r5 = 7
                r12 = r2
                r13 = r4
                r11 = r5
                goto L_0x0063
            L_0x002c:
                r9 = r4
                r2 = r5
                r7 = r2
                r8 = r6
                r6 = r7
            L_0x0031:
                if (r9 == 0) goto L_0x005f
                int r10 = r0.mo24931o(r1)
                r11 = -1
                if (r10 == r11) goto L_0x005d
                if (r10 == 0) goto L_0x0056
                if (r10 == r4) goto L_0x004f
                if (r10 != r3) goto L_0x0049
                kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
                java.lang.Object r8 = r0.mo24885n(r1, r3, r10, r8)
                r7 = r7 | 4
                goto L_0x0031
            L_0x0049:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r10)
                throw r0
            L_0x004f:
                int r6 = r0.mo24880i(r1, r4)
                r7 = r7 | 2
                goto L_0x0031
            L_0x0056:
                int r2 = r0.mo24880i(r1, r5)
                r7 = r7 | 1
                goto L_0x0031
            L_0x005d:
                r9 = r5
                goto L_0x0031
            L_0x005f:
                r12 = r2
                r13 = r6
                r11 = r7
                r3 = r8
            L_0x0063:
                r0.mo24876c(r1)
                com.carrefour.fid.android.data.entities.dlv.DlvFee r0 = new com.carrefour.fid.android.data.entities.dlv.DlvFee
                r14 = r3
                java.lang.String r14 = (java.lang.String) r14
                r15 = 0
                r10 = r0
                r10.<init>((int) r11, (int) r12, (int) r13, (java.lang.String) r14, (kotlinx.serialization.internal.C12295n1) r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.dlv.DlvFee.C36431a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.data.entities.dlv.DlvFee");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DlvFee dlvFee) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(dlvFee, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            DlvFee.write$Self(dlvFee, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12276h0 h0Var = C12276h0.f30067a;
            return new C12248g[]{h0Var, h0Var, C12197a.m48817q(C12310s1.f30117a)};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f90092b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.dlv.DlvFee$b */
    public static final class C36432b {
        public /* synthetic */ C36432b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DlvFee> serializer() {
            return C36431a.f90091a;
        }

        public C36432b() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DlvFee(int i, @C12438n("unscaled_amount") int i2, @C12438n("scale") int i3, @C12438n("currency") String str, C12295n1 n1Var) {
        if (1 != (i & 1)) {
            C12261c1.m49256b(i, 1, C36431a.f90091a.getDescriptor());
        }
        this.unscaledAmount = i2;
        if ((i & 2) == 0) {
            this.scale = 2;
        } else {
            this.scale = i3;
        }
        if ((i & 4) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
    }

    public static /* synthetic */ DlvFee copy$default(DlvFee dlvFee, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dlvFee.unscaledAmount;
        }
        if ((i3 & 2) != 0) {
            i2 = dlvFee.scale;
        }
        if ((i3 & 4) != 0) {
            str = dlvFee.currency;
        }
        return dlvFee.copy(i, i2, str);
    }

    @C12438n("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @C12438n("scale")
    public static /* synthetic */ void getScale$annotations() {
    }

    @C12438n("unscaled_amount")
    public static /* synthetic */ void getUnscaledAmount$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(DlvFee dlvFee, C12239d dVar, C12217f fVar) {
        boolean z = false;
        dVar.mo24927x(fVar, 0, dlvFee.unscaledAmount);
        if (dVar.mo24897A(fVar, 1) || dlvFee.scale != 2) {
            dVar.mo24927x(fVar, 1, dlvFee.scale);
        }
        if (dVar.mo24897A(fVar, 2) || dlvFee.currency != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, dlvFee.currency);
        }
    }

    public final int component1() {
        return this.unscaledAmount;
    }

    public final int component2() {
        return this.scale;
    }

    @C12580l
    public final String component3() {
        return this.currency;
    }

    @C12579k
    public final DlvFee copy(int i, int i2, @C12580l String str) {
        return new DlvFee(i, i2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlvFee)) {
            return false;
        }
        DlvFee dlvFee = (DlvFee) obj;
        return this.unscaledAmount == dlvFee.unscaledAmount && this.scale == dlvFee.scale && Intrinsics.areEqual((Object) this.currency, (Object) dlvFee.currency);
    }

    @C12580l
    public final String getCurrency() {
        return this.currency;
    }

    public final int getScale() {
        return this.scale;
    }

    public final int getUnscaledAmount() {
        return this.unscaledAmount;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.unscaledAmount) * 31) + Integer.hashCode(this.scale)) * 31;
        String str = this.currency;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    public String toString() {
        int i = this.unscaledAmount;
        int i2 = this.scale;
        String str = this.currency;
        return "DlvFee(unscaledAmount=" + i + ", scale=" + i2 + ", currency=" + str + ")";
    }

    public DlvFee(int i, int i2, @C12580l String str) {
        this.unscaledAmount = i;
        this.scale = i2;
        this.currency = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlvFee(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 2 : i2, (i3 & 4) != 0 ? null : str);
    }
}
