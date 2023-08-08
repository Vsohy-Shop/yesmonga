package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.y */
public final class C24437y implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24438a f60946c = new C24438a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60947d = 8;
    @C12579k

    /* renamed from: a */
    public final DataPrimeCmsResponse[] f60948a;

    /* renamed from: b */
    public final boolean f60949b;

    @C11363r0({"SMAP\nSuccessCreateCardFragmentArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessCreateCardFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/SuccessCreateCardFragmentArgs$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,82:1\n11335#2:83\n11670#2,3:84\n11335#2:89\n11670#2,3:90\n37#3,2:87\n37#3,2:93\n*S KotlinDebug\n*F\n+ 1 SuccessCreateCardFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/SuccessCreateCardFragmentArgs$Companion\n*L\n45#1:83\n45#1:84,3\n70#1:89\n70#1:90,3\n46#1:87,2\n71#1:93,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.y$a */
    public static final class C24438a {
        public /* synthetic */ C24438a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24437y mo71499a(@C12579k Bundle bundle) {
            boolean z;
            DataPrimeCmsResponse[] dataPrimeCmsResponseArr;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24437y.class.getClassLoader());
            if (bundle.containsKey("isFromActiveFid")) {
                z = bundle.getBoolean("isFromActiveFid");
            } else {
                z = false;
            }
            if (bundle.containsKey("primeList")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("primeList");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse");
                        arrayList.add((DataPrimeCmsResponse) parcelable);
                    }
                    dataPrimeCmsResponseArr = (DataPrimeCmsResponse[]) arrayList.toArray(new DataPrimeCmsResponse[0]);
                } else {
                    dataPrimeCmsResponseArr = null;
                }
                if (dataPrimeCmsResponseArr != null) {
                    return new C24437y(dataPrimeCmsResponseArr, z);
                }
                throw new IllegalArgumentException("Argument \"primeList\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"primeList\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24437y mo71500b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            DataPrimeCmsResponse[] dataPrimeCmsResponseArr;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isFromActiveFid")) {
                bool = (Boolean) p0Var.mo57648h("isFromActiveFid");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isFromActiveFid\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f("primeList")) {
                Parcelable[] parcelableArr = (Parcelable[]) p0Var.mo57648h("primeList");
                if (parcelableArr != null) {
                    ArrayList arrayList = new ArrayList(parcelableArr.length);
                    for (Parcelable parcelable : parcelableArr) {
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse");
                        arrayList.add((DataPrimeCmsResponse) parcelable);
                    }
                    dataPrimeCmsResponseArr = (DataPrimeCmsResponse[]) arrayList.toArray(new DataPrimeCmsResponse[0]);
                } else {
                    dataPrimeCmsResponseArr = null;
                }
                if (dataPrimeCmsResponseArr != null) {
                    return new C24437y(dataPrimeCmsResponseArr, bool.booleanValue());
                }
                throw new IllegalArgumentException("Argument \"primeList\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"primeList\" is missing and does not have an android:defaultValue");
        }

        public C24438a() {
        }
    }

    public C24437y(@C12579k DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponseArr, "primeList");
        this.f60948a = dataPrimeCmsResponseArr;
        this.f60949b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C24437y m107214d(C24437y yVar, DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dataPrimeCmsResponseArr = yVar.f60948a;
        }
        if ((i & 2) != 0) {
            z = yVar.f60949b;
        }
        return yVar.mo71491c(dataPrimeCmsResponseArr, z);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24437y m107215e(@C12579k C19456p0 p0Var) {
        return f60946c.mo71500b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24437y fromBundle(@C12579k Bundle bundle) {
        return f60946c.mo71499a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final DataPrimeCmsResponse[] mo71489a() {
        return this.f60948a;
    }

    /* renamed from: b */
    public final boolean mo71490b() {
        return this.f60949b;
    }

    @C12579k
    /* renamed from: c */
    public final C24437y mo71491c(@C12579k DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponseArr, "primeList");
        return new C24437y(dataPrimeCmsResponseArr, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24437y)) {
            return false;
        }
        C24437y yVar = (C24437y) obj;
        return Intrinsics.areEqual((Object) this.f60948a, (Object) yVar.f60948a) && this.f60949b == yVar.f60949b;
    }

    @C12579k
    /* renamed from: f */
    public final DataPrimeCmsResponse[] mo71493f() {
        return this.f60948a;
    }

    /* renamed from: g */
    public final boolean mo71494g() {
        return this.f60949b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo71495h() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromActiveFid", this.f60949b);
        bundle.putParcelableArray("primeList", (Parcelable[]) this.f60948a);
        return bundle;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f60948a) * 31;
        boolean z = this.f60949b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo71497i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60949b));
        p0Var.mo57656q("primeList", this.f60948a);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String arrays = Arrays.toString(this.f60948a);
        boolean z = this.f60949b;
        return "SuccessCreateCardFragmentArgs(primeList=" + arrays + ", isFromActiveFid=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24437y(DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataPrimeCmsResponseArr, (i & 2) != 0 ? false : z);
    }
}
