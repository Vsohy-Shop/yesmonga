package com.carrefour.fid.android.domain.models.service.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.C12197a;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 02\u00020\u0001:\u0004!\n12B5\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b*\u0010+BC\b\u0017\u0012\u0006\u0010,\u001a\u00020\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0016HÖ\u0001J\u0019\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b)\u0010'¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "l", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;", "b", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;", "c", "d", "e", "type", "minAmount", "maxAmount", "feesAmount", "f", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "a", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;", "k", "()Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;", "j", "()Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;", "i", "h", "<init>", "(Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;Lkotlinx/serialization/internal/n1;)V", "Companion", "FeeAmount", "FeeType", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class DeliveryFee implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DeliveryFee> CREATOR = new C38127c();
    @C12579k
    public static final C38126b Companion = new C38126b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: e */
    public static final C12248g<Object>[] f96553e = {new EnumSerializer("com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType", FeeType.values()), null, null, null};
    @C12579k

    /* renamed from: a */
    public final FeeType f96554a;
    @C12580l

    /* renamed from: b */
    public final FeeAmount f96555b;
    @C12580l

    /* renamed from: c */
    public final FeeAmount f96556c;
    @C12580l

    /* renamed from: d */
    public final FeeAmount f96557d;

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 12\u00020\u0001:\u0002\n\u000bB%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b+\u0010,B5\b\u0017\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00062"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeAmount;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "k", "", "a", "b", "", "c", "unscaledAmount", "scale", "currency", "d", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "I", "i", "()I", "h", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "", "f", "()D", "amount", "j", "()Z", "isCorrectValue", "<init>", "(IILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class FeeAmount implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<FeeAmount> CREATOR = new C38124c();
        @C12579k
        public static final C38123b Companion = new C38123b((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final int f96558a;

        /* renamed from: b */
        public final int f96559b;
        @C12579k

        /* renamed from: c */
        public final String f96560c;

        @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
        /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$a */
        public static final class C38122a implements C12327y<FeeAmount> {
            @C12579k

            /* renamed from: a */
            public static final C38122a f96561a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f96562b;

            static {
                C38122a aVar = new C38122a();
                f96561a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount", aVar, 3);
                pluginGeneratedSerialDescriptor.mo24966k("unscaledAmount", true);
                pluginGeneratedSerialDescriptor.mo24966k("scale", true);
                pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78955i, true);
                f96562b = pluginGeneratedSerialDescriptor;
            }

            @C12579k
            /* renamed from: a */
            public FeeAmount deserialize(@C12579k C12241e eVar) {
                String str;
                int i;
                int i2;
                int i3;
                C12241e eVar2 = eVar;
                Intrinsics.checkNotNullParameter(eVar2, "decoder");
                C12217f descriptor = getDescriptor();
                C12236c b = eVar2.mo24875b(descriptor);
                if (b.mo24886p()) {
                    int i4 = b.mo24880i(descriptor, 0);
                    int i5 = b.mo24880i(descriptor, 1);
                    i2 = i4;
                    str = b.mo24884m(descriptor, 2);
                    i = i5;
                    i3 = 7;
                } else {
                    String str2 = null;
                    boolean z = true;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (z) {
                        int o = b.mo24931o(descriptor);
                        if (o == -1) {
                            z = false;
                        } else if (o == 0) {
                            i6 = b.mo24880i(descriptor, 0);
                            i8 |= 1;
                        } else if (o == 1) {
                            i7 = b.mo24880i(descriptor, 1);
                            i8 |= 2;
                        } else if (o == 2) {
                            str2 = b.mo24884m(descriptor, 2);
                            i8 |= 4;
                        } else {
                            throw new UnknownFieldException(o);
                        }
                    }
                    i2 = i6;
                    str = str2;
                    i = i7;
                    i3 = i8;
                }
                b.mo24876c(descriptor);
                return new FeeAmount(i3, i2, i, str, (C12295n1) null);
            }

            /* renamed from: b */
            public void serialize(@C12579k C12244g gVar, @C12579k FeeAmount feeAmount) {
                Intrinsics.checkNotNullParameter(gVar, "encoder");
                Intrinsics.checkNotNullParameter(feeAmount, "value");
                C12217f descriptor = getDescriptor();
                C12239d b = gVar.mo24906b(descriptor);
                FeeAmount.m157933k(feeAmount, b, descriptor);
                b.mo24907c(descriptor);
            }

            @C12579k
            public C12248g<?>[] childSerializers() {
                C12276h0 h0Var = C12276h0.f30067a;
                return new C12248g[]{h0Var, h0Var, C12310s1.f30117a};
            }

            @C12579k
            public C12217f getDescriptor() {
                return f96562b;
            }

            @C12579k
            public C12248g<?>[] typeParametersSerializers() {
                return C12327y.C12328a.m49635a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$b */
        public static final class C38123b {
            public /* synthetic */ C38123b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C12248g<FeeAmount> mo119093a() {
                return C38122a.f96561a;
            }

            public C38123b() {
            }
        }

        /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$c */
        public static final class C38124c implements Parcelable.Creator<FeeAmount> {
            @C12579k
            /* renamed from: a */
            public final FeeAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeAmount(parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final FeeAmount[] newArray(int i) {
                return new FeeAmount[i];
            }
        }

        public FeeAmount() {
            this(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ FeeAmount m157932e(FeeAmount feeAmount, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = feeAmount.f96558a;
            }
            if ((i3 & 2) != 0) {
                i2 = feeAmount.f96559b;
            }
            if ((i3 & 4) != 0) {
                str = feeAmount.f96560c;
            }
            return feeAmount.mo119080d(i, i2, str);
        }

        @C11384m
        /* renamed from: k */
        public static final /* synthetic */ void m157933k(FeeAmount feeAmount, C12239d dVar, C12217f fVar) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (!dVar.mo24897A(fVar, 0) && feeAmount.f96558a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                dVar.mo24927x(fVar, 0, feeAmount.f96558a);
            }
            if (!dVar.mo24897A(fVar, 1) && feeAmount.f96559b == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                dVar.mo24927x(fVar, 1, feeAmount.f96559b);
            }
            if (dVar.mo24897A(fVar, 2) || !Intrinsics.areEqual((Object) feeAmount.f96560c, (Object) "")) {
                z3 = true;
            }
            if (z3) {
                dVar.mo24929z(fVar, 2, feeAmount.f96560c);
            }
        }

        /* renamed from: a */
        public final int mo119077a() {
            return this.f96558a;
        }

        /* renamed from: b */
        public final int mo119078b() {
            return this.f96559b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo119079c() {
            return this.f96560c;
        }

        @C12579k
        /* renamed from: d */
        public final FeeAmount mo119080d(int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
            return new FeeAmount(i, i2, str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeeAmount)) {
                return false;
            }
            FeeAmount feeAmount = (FeeAmount) obj;
            return this.f96558a == feeAmount.f96558a && this.f96559b == feeAmount.f96559b && Intrinsics.areEqual((Object) this.f96560c, (Object) feeAmount.f96560c);
        }

        /* renamed from: f */
        public final double mo119083f() {
            return ((double) this.f96558a) / Math.pow(10.0d, (double) this.f96559b);
        }

        @C12579k
        /* renamed from: g */
        public final String mo119084g() {
            return this.f96560c;
        }

        /* renamed from: h */
        public final int mo119085h() {
            return this.f96559b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f96558a) * 31) + Integer.hashCode(this.f96559b)) * 31) + this.f96560c.hashCode();
        }

        /* renamed from: i */
        public final int mo119087i() {
            return this.f96558a;
        }

        /* renamed from: j */
        public final boolean mo119088j() {
            return this.f96558a >= 0;
        }

        @C12579k
        public String toString() {
            int i = this.f96558a;
            int i2 = this.f96559b;
            String str = this.f96560c;
            return "FeeAmount(unscaledAmount=" + i + ", scale=" + i2 + ", currency=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.f96558a);
            parcel.writeInt(this.f96559b);
            parcel.writeString(this.f96560c);
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
        public /* synthetic */ FeeAmount(int i, int i2, int i3, String str, C12295n1 n1Var) {
            if ((i & 0) != 0) {
                C12261c1.m49256b(i, 0, C38122a.f96561a.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.f96558a = 0;
            } else {
                this.f96558a = i2;
            }
            if ((i & 2) == 0) {
                this.f96559b = 0;
            } else {
                this.f96559b = i3;
            }
            if ((i & 4) == 0) {
                this.f96560c = "";
            } else {
                this.f96560c = str;
            }
        }

        public FeeAmount(int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
            this.f96558a = i;
            this.f96559b = i2;
            this.f96560c = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FeeAmount(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee$FeeType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum FeeType {
        Amount,
        Pregnancy
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$a */
    public static final class C38125a implements C12327y<DeliveryFee> {
        @C12579k

        /* renamed from: a */
        public static final C38125a f96566a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96567b;

        static {
            C38125a aVar = new C38125a();
            f96566a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.DeliveryFee", aVar, 4);
            pluginGeneratedSerialDescriptor.mo24966k("type", true);
            pluginGeneratedSerialDescriptor.mo24966k("minAmount", true);
            pluginGeneratedSerialDescriptor.mo24966k("maxAmount", true);
            pluginGeneratedSerialDescriptor.mo24966k("feesAmount", true);
            f96567b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.domain.models.service.models.DeliveryFee deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r15) {
            /*
                r14 = this;
                java.lang.String r0 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                kotlinx.serialization.descriptors.f r0 = r14.getDescriptor()
                kotlinx.serialization.encoding.c r15 = r15.mo24875b(r0)
                kotlinx.serialization.g[] r1 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.f96553e
                boolean r2 = r15.mo24886p()
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                r7 = 0
                if (r2 == 0) goto L_0x0035
                r1 = r1[r6]
                java.lang.Object r1 = r15.mo24895y(r0, r6, r1, r7)
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$a r2 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount.C38122a.f96561a
                java.lang.Object r5 = r15.mo24885n(r0, r5, r2, r7)
                java.lang.Object r4 = r15.mo24885n(r0, r4, r2, r7)
                java.lang.Object r2 = r15.mo24885n(r0, r3, r2, r7)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x007b
            L_0x0035:
                r11 = r5
                r2 = r6
                r8 = r7
                r9 = r8
                r10 = r9
            L_0x003a:
                if (r11 == 0) goto L_0x0077
                int r12 = r15.mo24931o(r0)
                r13 = -1
                if (r12 == r13) goto L_0x0075
                if (r12 == 0) goto L_0x006c
                if (r12 == r5) goto L_0x0063
                if (r12 == r4) goto L_0x005a
                if (r12 != r3) goto L_0x0054
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$a r12 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount.C38122a.f96561a
                java.lang.Object r10 = r15.mo24885n(r0, r3, r12, r10)
                r2 = r2 | 8
                goto L_0x003a
            L_0x0054:
                kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
                r15.<init>((int) r12)
                throw r15
            L_0x005a:
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$a r12 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount.C38122a.f96561a
                java.lang.Object r9 = r15.mo24885n(r0, r4, r12, r9)
                r2 = r2 | 4
                goto L_0x003a
            L_0x0063:
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount$a r12 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount.C38122a.f96561a
                java.lang.Object r8 = r15.mo24885n(r0, r5, r12, r8)
                r2 = r2 | 2
                goto L_0x003a
            L_0x006c:
                r12 = r1[r6]
                java.lang.Object r7 = r15.mo24895y(r0, r6, r12, r7)
                r2 = r2 | 1
                goto L_0x003a
            L_0x0075:
                r11 = r6
                goto L_0x003a
            L_0x0077:
                r4 = r2
                r1 = r7
                r5 = r8
                r2 = r10
            L_0x007b:
                r15.mo24876c(r0)
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee r15 = new com.carrefour.fid.android.domain.models.service.models.DeliveryFee
                r0 = r1
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeType r0 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType) r0
                r6 = r5
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r6 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r6
                r7 = r9
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r7 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r7
                r8 = r2
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r8 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r8
                r9 = 0
                r3 = r15
                r5 = r0
                r3.<init>((int) r4, (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType) r5, (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r6, (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r7, (com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeAmount) r8, (kotlinx.serialization.internal.C12295n1) r9)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.DeliveryFee.C38125a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.domain.models.service.models.DeliveryFee");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k DeliveryFee deliveryFee) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(deliveryFee, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            DeliveryFee.m157922l(deliveryFee, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            FeeAmount.C38122a aVar = FeeAmount.C38122a.f96561a;
            return new C12248g[]{DeliveryFee.f96553e[0], C12197a.m48817q(aVar), C12197a.m48817q(aVar), C12197a.m48817q(aVar)};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96567b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$b */
    public static final class C38126b {
        public /* synthetic */ C38126b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<DeliveryFee> serializer() {
            return C38125a.f96566a;
        }

        public C38126b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.DeliveryFee$c */
    public static final class C38127c implements Parcelable.Creator<DeliveryFee> {
        @C12579k
        /* renamed from: a */
        public final DeliveryFee createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FeeType valueOf = FeeType.valueOf(parcel.readString());
            FeeAmount feeAmount = null;
            FeeAmount createFromParcel = parcel.readInt() == 0 ? null : FeeAmount.CREATOR.createFromParcel(parcel);
            FeeAmount createFromParcel2 = parcel.readInt() == 0 ? null : FeeAmount.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                feeAmount = FeeAmount.CREATOR.createFromParcel(parcel);
            }
            return new DeliveryFee(valueOf, createFromParcel, createFromParcel2, feeAmount);
        }

        @C12579k
        /* renamed from: b */
        public final DeliveryFee[] newArray(int i) {
            return new DeliveryFee[i];
        }
    }

    public DeliveryFee() {
        this((FeeType) null, (FeeAmount) null, (FeeAmount) null, (FeeAmount) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ DeliveryFee m157921g(DeliveryFee deliveryFee, FeeType feeType, FeeAmount feeAmount, FeeAmount feeAmount2, FeeAmount feeAmount3, int i, Object obj) {
        if ((i & 1) != 0) {
            feeType = deliveryFee.f96554a;
        }
        if ((i & 2) != 0) {
            feeAmount = deliveryFee.f96555b;
        }
        if ((i & 4) != 0) {
            feeAmount2 = deliveryFee.f96556c;
        }
        if ((i & 8) != 0) {
            feeAmount3 = deliveryFee.f96557d;
        }
        return deliveryFee.mo119069f(feeType, feeAmount, feeAmount2, feeAmount3);
    }

    @C11384m
    /* renamed from: l */
    public static final /* synthetic */ void m157922l(DeliveryFee deliveryFee, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C12248g<Object>[] gVarArr = f96553e;
        boolean z4 = false;
        if (!dVar.mo24897A(fVar, 0) && deliveryFee.f96554a == FeeType.Amount) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24899D(fVar, 0, gVarArr[0], deliveryFee.f96554a);
        }
        if (!dVar.mo24897A(fVar, 1) && deliveryFee.f96555b == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24912i(fVar, 1, FeeAmount.C38122a.f96561a, deliveryFee.f96555b);
        }
        if (!dVar.mo24897A(fVar, 2) && deliveryFee.f96556c == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24912i(fVar, 2, FeeAmount.C38122a.f96561a, deliveryFee.f96556c);
        }
        if (dVar.mo24897A(fVar, 3) || deliveryFee.f96557d != null) {
            z4 = true;
        }
        if (z4) {
            dVar.mo24912i(fVar, 3, FeeAmount.C38122a.f96561a, deliveryFee.f96557d);
        }
    }

    @C12579k
    /* renamed from: b */
    public final FeeType mo119063b() {
        return this.f96554a;
    }

    @C12580l
    /* renamed from: c */
    public final FeeAmount mo119064c() {
        return this.f96555b;
    }

    @C12580l
    /* renamed from: d */
    public final FeeAmount mo119065d() {
        return this.f96556c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final FeeAmount mo119067e() {
        return this.f96557d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryFee)) {
            return false;
        }
        DeliveryFee deliveryFee = (DeliveryFee) obj;
        return this.f96554a == deliveryFee.f96554a && Intrinsics.areEqual((Object) this.f96555b, (Object) deliveryFee.f96555b) && Intrinsics.areEqual((Object) this.f96556c, (Object) deliveryFee.f96556c) && Intrinsics.areEqual((Object) this.f96557d, (Object) deliveryFee.f96557d);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryFee mo119069f(@C12579k FeeType feeType, @C12580l FeeAmount feeAmount, @C12580l FeeAmount feeAmount2, @C12580l FeeAmount feeAmount3) {
        Intrinsics.checkNotNullParameter(feeType, "type");
        return new DeliveryFee(feeType, feeAmount, feeAmount2, feeAmount3);
    }

    @C12580l
    /* renamed from: h */
    public final FeeAmount mo119070h() {
        return this.f96557d;
    }

    public int hashCode() {
        int hashCode = this.f96554a.hashCode() * 31;
        FeeAmount feeAmount = this.f96555b;
        int i = 0;
        int hashCode2 = (hashCode + (feeAmount == null ? 0 : feeAmount.hashCode())) * 31;
        FeeAmount feeAmount2 = this.f96556c;
        int hashCode3 = (hashCode2 + (feeAmount2 == null ? 0 : feeAmount2.hashCode())) * 31;
        FeeAmount feeAmount3 = this.f96557d;
        if (feeAmount3 != null) {
            i = feeAmount3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final FeeAmount mo119072i() {
        return this.f96556c;
    }

    @C12580l
    /* renamed from: j */
    public final FeeAmount mo119073j() {
        return this.f96555b;
    }

    @C12579k
    /* renamed from: k */
    public final FeeType mo119074k() {
        return this.f96554a;
    }

    @C12579k
    public String toString() {
        FeeType feeType = this.f96554a;
        FeeAmount feeAmount = this.f96555b;
        FeeAmount feeAmount2 = this.f96556c;
        FeeAmount feeAmount3 = this.f96557d;
        return "DeliveryFee(type=" + feeType + ", minAmount=" + feeAmount + ", maxAmount=" + feeAmount2 + ", feesAmount=" + feeAmount3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96554a.name());
        FeeAmount feeAmount = this.f96555b;
        if (feeAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeAmount.writeToParcel(parcel, i);
        }
        FeeAmount feeAmount2 = this.f96556c;
        if (feeAmount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeAmount2.writeToParcel(parcel, i);
        }
        FeeAmount feeAmount3 = this.f96557d;
        if (feeAmount3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        feeAmount3.writeToParcel(parcel, i);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ DeliveryFee(int i, FeeType feeType, FeeAmount feeAmount, FeeAmount feeAmount2, FeeAmount feeAmount3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38125a.f96566a.getDescriptor());
        }
        this.f96554a = (i & 1) == 0 ? FeeType.Amount : feeType;
        if ((i & 2) == 0) {
            this.f96555b = null;
        } else {
            this.f96555b = feeAmount;
        }
        if ((i & 4) == 0) {
            this.f96556c = null;
        } else {
            this.f96556c = feeAmount2;
        }
        if ((i & 8) == 0) {
            this.f96557d = null;
        } else {
            this.f96557d = feeAmount3;
        }
    }

    public DeliveryFee(@C12579k FeeType feeType, @C12580l FeeAmount feeAmount, @C12580l FeeAmount feeAmount2, @C12580l FeeAmount feeAmount3) {
        Intrinsics.checkNotNullParameter(feeType, "type");
        this.f96554a = feeType;
        this.f96555b = feeAmount;
        this.f96556c = feeAmount2;
        this.f96557d = feeAmount3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryFee(FeeType feeType, FeeAmount feeAmount, FeeAmount feeAmount2, FeeAmount feeAmount3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FeeType.Amount : feeType, (i & 2) != 0 ? null : feeAmount, (i & 4) != 0 ? null : feeAmount2, (i & 8) != 0 ? null : feeAmount3);
    }
}
