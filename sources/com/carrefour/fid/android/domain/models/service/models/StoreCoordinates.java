package com.carrefour.fid.android.domain.models.service.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.urbanairship.analytics.location.C35563d;
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
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 %2\u00020\u0001:\u0002\n\u000bB\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 B/\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "g", "", "a", "b", "latitude", "longitude", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class StoreCoordinates implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<StoreCoordinates> CREATOR = new C38135c();
    @C12579k
    public static final C38134b Companion = new C38134b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final String f96584a;
    @C12579k

    /* renamed from: b */
    public final String f96585b;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreCoordinates$a */
    public static final class C38133a implements C12327y<StoreCoordinates> {
        @C12579k

        /* renamed from: a */
        public static final C38133a f96586a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96587b;

        static {
            C38133a aVar = new C38133a();
            f96586a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.StoreCoordinates", aVar, 2);
            pluginGeneratedSerialDescriptor.mo24966k(C35563d.f87833T0, true);
            pluginGeneratedSerialDescriptor.mo24966k(C35563d.f87834U0, true);
            f96587b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public StoreCoordinates deserialize(@C12579k C12241e eVar) {
            int i;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar.mo24875b(descriptor);
            if (b.mo24886p()) {
                str2 = b.mo24884m(descriptor, 0);
                str = b.mo24884m(descriptor, 1);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                str2 = null;
                String str3 = null;
                while (z) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        str2 = b.mo24884m(descriptor, 0);
                        i2 |= 1;
                    } else if (o == 1) {
                        str3 = b.mo24884m(descriptor, 1);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                str = str3;
                i = i2;
            }
            b.mo24876c(descriptor);
            return new StoreCoordinates(i, str2, str, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k StoreCoordinates storeCoordinates) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(storeCoordinates, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            StoreCoordinates.m157988g(storeCoordinates, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{s1Var, s1Var};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96587b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreCoordinates$b */
    public static final class C38134b {
        public /* synthetic */ C38134b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<StoreCoordinates> serializer() {
            return C38133a.f96586a;
        }

        public C38134b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreCoordinates$c */
    public static final class C38135c implements Parcelable.Creator<StoreCoordinates> {
        @C12579k
        /* renamed from: a */
        public final StoreCoordinates createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreCoordinates(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final StoreCoordinates[] newArray(int i) {
            return new StoreCoordinates[i];
        }
    }

    public StoreCoordinates() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ StoreCoordinates m157987d(StoreCoordinates storeCoordinates, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeCoordinates.f96584a;
        }
        if ((i & 2) != 0) {
            str2 = storeCoordinates.f96585b;
        }
        return storeCoordinates.mo119143c(str, str2);
    }

    @C11384m
    /* renamed from: g */
    public static final /* synthetic */ void m157988g(StoreCoordinates storeCoordinates, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2 = false;
        if (!dVar.mo24897A(fVar, 0) && Intrinsics.areEqual((Object) storeCoordinates.f96584a, (Object) "")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24929z(fVar, 0, storeCoordinates.f96584a);
        }
        if (dVar.mo24897A(fVar, 1) || !Intrinsics.areEqual((Object) storeCoordinates.f96585b, (Object) "")) {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, storeCoordinates.f96585b);
        }
    }

    @C12579k
    /* renamed from: a */
    public final String mo119141a() {
        return this.f96584a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119142b() {
        return this.f96585b;
    }

    @C12579k
    /* renamed from: c */
    public final StoreCoordinates mo119143c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, C35563d.f87833T0);
        Intrinsics.checkNotNullParameter(str2, C35563d.f87834U0);
        return new StoreCoordinates(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119145e() {
        return this.f96584a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreCoordinates)) {
            return false;
        }
        StoreCoordinates storeCoordinates = (StoreCoordinates) obj;
        return Intrinsics.areEqual((Object) this.f96584a, (Object) storeCoordinates.f96584a) && Intrinsics.areEqual((Object) this.f96585b, (Object) storeCoordinates.f96585b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo119147f() {
        return this.f96585b;
    }

    public int hashCode() {
        return (this.f96584a.hashCode() * 31) + this.f96585b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f96584a;
        String str2 = this.f96585b;
        return "StoreCoordinates(latitude=" + str + ", longitude=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96584a);
        parcel.writeString(this.f96585b);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ StoreCoordinates(int i, String str, String str2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38133a.f96586a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f96584a = "";
        } else {
            this.f96584a = str;
        }
        if ((i & 2) == 0) {
            this.f96585b = "";
        } else {
            this.f96585b = str2;
        }
    }

    public StoreCoordinates(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, C35563d.f87833T0);
        Intrinsics.checkNotNullParameter(str2, C35563d.f87834U0);
        this.f96584a = str;
        this.f96585b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreCoordinates(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
