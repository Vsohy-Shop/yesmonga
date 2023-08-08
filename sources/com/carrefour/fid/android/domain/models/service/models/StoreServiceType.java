package com.carrefour.fid.android.domain.models.service.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "b", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/n1;)V", "Companion", "Clcv", "a", "Drive", "H1h3", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$Clcv;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$Drive;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$H1h3;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public abstract class StoreServiceType implements Parcelable {
    @C12579k
    public static final C38145a Companion = new C38145a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public static final C11677z<C12248g<Object>> f96617a = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, StoreServiceType$Companion$1.f96624f);

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$Clcv;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lkotlinx/serialization/g;", "serializer", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Clcv extends StoreServiceType {
        @C12579k
        public static final Parcelable.Creator<Clcv> CREATOR = new C38140a();
        @C12579k
        public static final Clcv INSTANCE = new Clcv();

        /* renamed from: b */
        public static final /* synthetic */ C11677z<C12248g<Object>> f96618b = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, C381391.f96619f);

        /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv$a */
        public static final class C38140a implements Parcelable.Creator<Clcv> {
            @C12579k
            /* renamed from: a */
            public final Clcv createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Clcv.INSTANCE;
            }

            @C12579k
            /* renamed from: b */
            public final Clcv[] newArray(int i) {
                return new Clcv[i];
            }
        }

        public Clcv() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        private final /* synthetic */ C12248g m158061c() {
            return f96618b.getValue();
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        public final C12248g<Clcv> serializer() {
            return m158061c();
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$Drive;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lkotlinx/serialization/g;", "serializer", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Drive extends StoreServiceType {
        @C12579k
        public static final Parcelable.Creator<Drive> CREATOR = new C38142a();
        @C12579k
        public static final Drive INSTANCE = new Drive();

        /* renamed from: b */
        public static final /* synthetic */ C11677z<C12248g<Object>> f96620b = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, C381411.f96621f);

        /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive$a */
        public static final class C38142a implements Parcelable.Creator<Drive> {
            @C12579k
            /* renamed from: a */
            public final Drive createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Drive.INSTANCE;
            }

            @C12579k
            /* renamed from: b */
            public final Drive[] newArray(int i) {
                return new Drive[i];
            }
        }

        public Drive() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        private final /* synthetic */ C12248g m158064c() {
            return f96620b.getValue();
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        public final C12248g<Drive> serializer() {
            return m158064c();
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType$H1h3;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lkotlinx/serialization/g;", "serializer", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class H1h3 extends StoreServiceType {
        @C12579k
        public static final Parcelable.Creator<H1h3> CREATOR = new C38144a();
        @C12579k
        public static final H1h3 INSTANCE = new H1h3();

        /* renamed from: b */
        public static final /* synthetic */ C11677z<C12248g<Object>> f96622b = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, C381431.f96623f);

        /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3$a */
        public static final class C38144a implements Parcelable.Creator<H1h3> {
            @C12579k
            /* renamed from: a */
            public final H1h3 createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return H1h3.INSTANCE;
            }

            @C12579k
            /* renamed from: b */
            public final H1h3[] newArray(int i) {
                return new H1h3[i];
            }
        }

        public H1h3() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        private final /* synthetic */ C12248g m158067c() {
            return f96622b.getValue();
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        public final C12248g<H1h3> serializer() {
            return m158067c();
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreServiceType$a */
    public static final class C38145a {
        public /* synthetic */ C38145a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final /* synthetic */ C12248g m158070a() {
            return (C12248g) StoreServiceType.f96617a.getValue();
        }

        @C12579k
        public final C12248g<StoreServiceType> serializer() {
            return m158070a();
        }

        public C38145a() {
        }
    }

    public /* synthetic */ StoreServiceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C11384m
    /* renamed from: b */
    public static final /* synthetic */ void m158060b(StoreServiceType storeServiceType, C12239d dVar, C12217f fVar) {
    }

    public StoreServiceType() {
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ StoreServiceType(int i, C12295n1 n1Var) {
    }
}
