package com.carrefour.fid.android.domain.models.service.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.google.maps.android.data.geojson.C33834i;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 12\u00020\u0001:\u0002\n\fB;\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,BM\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0017HÖ\u0001J\u0019\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b*\u0010'¨\u00062"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreAddress;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "m", "Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;", "a", "", "b", "c", "d", "e", "coordinates", "addressOne", "addressTwo", "cityName", "postCode", "f", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;", "k", "()Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "i", "j", "l", "<init>", "(Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class StoreAddress implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<StoreAddress> CREATOR = new C38132c();
    @C12579k
    public static final C38131b Companion = new C38131b((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: a */
    public final StoreCoordinates f96577a;
    @C12579k

    /* renamed from: b */
    public final String f96578b;
    @C12579k

    /* renamed from: c */
    public final String f96579c;
    @C12579k

    /* renamed from: d */
    public final String f96580d;
    @C12579k

    /* renamed from: e */
    public final String f96581e;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreAddress$a */
    public static final class C38130a implements C12327y<StoreAddress> {
        @C12579k

        /* renamed from: a */
        public static final C38130a f96582a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96583b;

        static {
            C38130a aVar = new C38130a();
            f96582a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.StoreAddress", aVar, 5);
            pluginGeneratedSerialDescriptor.mo24966k(C33834i.f82018j, true);
            pluginGeneratedSerialDescriptor.mo24966k("addressOne", true);
            pluginGeneratedSerialDescriptor.mo24966k("addressTwo", true);
            pluginGeneratedSerialDescriptor.mo24966k("cityName", true);
            pluginGeneratedSerialDescriptor.mo24966k("postCode", true);
            f96583b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public StoreAddress deserialize(@C12579k C12241e eVar) {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            Object obj;
            C12241e eVar2 = eVar;
            Intrinsics.checkNotNullParameter(eVar2, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar2.mo24875b(descriptor);
            Object obj2 = null;
            if (b.mo24886p()) {
                obj = b.mo24885n(descriptor, 0, StoreCoordinates.C38133a.f96586a, null);
                str4 = b.mo24884m(descriptor, 1);
                String m = b.mo24884m(descriptor, 2);
                str2 = b.mo24884m(descriptor, 3);
                str = b.mo24884m(descriptor, 4);
                i = 31;
                str3 = m;
            } else {
                boolean z = true;
                int i2 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                while (z) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        obj2 = b.mo24885n(descriptor, 0, StoreCoordinates.C38133a.f96586a, obj2);
                        i2 |= 1;
                    } else if (o == 1) {
                        str5 = b.mo24884m(descriptor, 1);
                        i2 |= 2;
                    } else if (o == 2) {
                        str6 = b.mo24884m(descriptor, 2);
                        i2 |= 4;
                    } else if (o == 3) {
                        str7 = b.mo24884m(descriptor, 3);
                        i2 |= 8;
                    } else if (o == 4) {
                        str8 = b.mo24884m(descriptor, 4);
                        i2 |= 16;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                i = i2;
                obj = obj2;
                str4 = str5;
                str3 = str6;
                str2 = str7;
                str = str8;
            }
            b.mo24876c(descriptor);
            return new StoreAddress(i, (StoreCoordinates) obj, str4, str3, str2, str, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k StoreAddress storeAddress) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(storeAddress, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            StoreAddress.m157971m(storeAddress, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{C12197a.m48817q(StoreCoordinates.C38133a.f96586a), s1Var, s1Var, s1Var, s1Var};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96583b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreAddress$b */
    public static final class C38131b {
        public /* synthetic */ C38131b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<StoreAddress> serializer() {
            return C38130a.f96582a;
        }

        public C38131b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreAddress$c */
    public static final class C38132c implements Parcelable.Creator<StoreAddress> {
        @C12579k
        /* renamed from: a */
        public final StoreAddress createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreAddress(parcel.readInt() == 0 ? null : StoreCoordinates.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final StoreAddress[] newArray(int i) {
            return new StoreAddress[i];
        }
    }

    public StoreAddress() {
        this((StoreCoordinates) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ StoreAddress m157970g(StoreAddress storeAddress, StoreCoordinates storeCoordinates, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            storeCoordinates = storeAddress.f96577a;
        }
        if ((i & 2) != 0) {
            str = storeAddress.f96578b;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = storeAddress.f96579c;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = storeAddress.f96580d;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = storeAddress.f96581e;
        }
        return storeAddress.mo119125f(storeCoordinates, str5, str6, str7, str4);
    }

    @C11384m
    /* renamed from: m */
    public static final /* synthetic */ void m157971m(StoreAddress storeAddress, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (!dVar.mo24897A(fVar, 0) && storeAddress.f96577a == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, StoreCoordinates.C38133a.f96586a, storeAddress.f96577a);
        }
        if (!dVar.mo24897A(fVar, 1) && Intrinsics.areEqual((Object) storeAddress.f96578b, (Object) "")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, storeAddress.f96578b);
        }
        if (!dVar.mo24897A(fVar, 2) && Intrinsics.areEqual((Object) storeAddress.f96579c, (Object) "")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24929z(fVar, 2, storeAddress.f96579c);
        }
        if (!dVar.mo24897A(fVar, 3) && Intrinsics.areEqual((Object) storeAddress.f96580d, (Object) "")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            dVar.mo24929z(fVar, 3, storeAddress.f96580d);
        }
        if (dVar.mo24897A(fVar, 4) || !Intrinsics.areEqual((Object) storeAddress.f96581e, (Object) "")) {
            z5 = true;
        }
        if (z5) {
            dVar.mo24929z(fVar, 4, storeAddress.f96581e);
        }
    }

    @C12580l
    /* renamed from: a */
    public final StoreCoordinates mo119118a() {
        return this.f96577a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119119b() {
        return this.f96578b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo119120c() {
        return this.f96579c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo119121d() {
        return this.f96580d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119123e() {
        return this.f96581e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreAddress)) {
            return false;
        }
        StoreAddress storeAddress = (StoreAddress) obj;
        return Intrinsics.areEqual((Object) this.f96577a, (Object) storeAddress.f96577a) && Intrinsics.areEqual((Object) this.f96578b, (Object) storeAddress.f96578b) && Intrinsics.areEqual((Object) this.f96579c, (Object) storeAddress.f96579c) && Intrinsics.areEqual((Object) this.f96580d, (Object) storeAddress.f96580d) && Intrinsics.areEqual((Object) this.f96581e, (Object) storeAddress.f96581e);
    }

    @C12579k
    /* renamed from: f */
    public final StoreAddress mo119125f(@C12580l StoreCoordinates storeCoordinates, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "addressOne");
        Intrinsics.checkNotNullParameter(str2, "addressTwo");
        Intrinsics.checkNotNullParameter(str3, "cityName");
        Intrinsics.checkNotNullParameter(str4, "postCode");
        return new StoreAddress(storeCoordinates, str, str2, str3, str4);
    }

    @C12579k
    /* renamed from: h */
    public final String mo119126h() {
        return this.f96578b;
    }

    public int hashCode() {
        StoreCoordinates storeCoordinates = this.f96577a;
        return ((((((((storeCoordinates == null ? 0 : storeCoordinates.hashCode()) * 31) + this.f96578b.hashCode()) * 31) + this.f96579c.hashCode()) * 31) + this.f96580d.hashCode()) * 31) + this.f96581e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo119128i() {
        return this.f96579c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119129j() {
        return this.f96580d;
    }

    @C12580l
    /* renamed from: k */
    public final StoreCoordinates mo119130k() {
        return this.f96577a;
    }

    @C12579k
    /* renamed from: l */
    public final String mo119131l() {
        return this.f96581e;
    }

    @C12579k
    public String toString() {
        StoreCoordinates storeCoordinates = this.f96577a;
        String str = this.f96578b;
        String str2 = this.f96579c;
        String str3 = this.f96580d;
        String str4 = this.f96581e;
        return "StoreAddress(coordinates=" + storeCoordinates + ", addressOne=" + str + ", addressTwo=" + str2 + ", cityName=" + str3 + ", postCode=" + str4 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        StoreCoordinates storeCoordinates = this.f96577a;
        if (storeCoordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeCoordinates.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f96578b);
        parcel.writeString(this.f96579c);
        parcel.writeString(this.f96580d);
        parcel.writeString(this.f96581e);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ StoreAddress(int i, StoreCoordinates storeCoordinates, String str, String str2, String str3, String str4, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38130a.f96582a.getDescriptor());
        }
        this.f96577a = (i & 1) == 0 ? null : storeCoordinates;
        if ((i & 2) == 0) {
            this.f96578b = "";
        } else {
            this.f96578b = str;
        }
        if ((i & 4) == 0) {
            this.f96579c = "";
        } else {
            this.f96579c = str2;
        }
        if ((i & 8) == 0) {
            this.f96580d = "";
        } else {
            this.f96580d = str3;
        }
        if ((i & 16) == 0) {
            this.f96581e = "";
        } else {
            this.f96581e = str4;
        }
    }

    public StoreAddress(@C12580l StoreCoordinates storeCoordinates, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "addressOne");
        Intrinsics.checkNotNullParameter(str2, "addressTwo");
        Intrinsics.checkNotNullParameter(str3, "cityName");
        Intrinsics.checkNotNullParameter(str4, "postCode");
        this.f96577a = storeCoordinates;
        this.f96578b = str;
        this.f96579c = str2;
        this.f96580d = str3;
        this.f96581e = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreAddress(com.carrefour.fid.android.domain.models.service.models.StoreCoordinates r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r7
        L_0x001c:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.StoreAddress.<init>(com.carrefour.fid.android.domain.models.service.models.StoreCoordinates, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
