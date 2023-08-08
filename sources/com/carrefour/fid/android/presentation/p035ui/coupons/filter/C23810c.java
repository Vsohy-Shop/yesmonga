package com.carrefour.fid.android.presentation.p035ui.coupons.filter;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.filter.c */
public final class C23810c implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C23811a f59912d = new C23811a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f59913e = 8;
    @C12579k

    /* renamed from: a */
    public final CouponModel[] f59914a;
    @C12579k

    /* renamed from: b */
    public final CouponsFilter[] f59915b;

    /* renamed from: c */
    public final boolean f59916c;

    @C11363r0({"SMAP\nCouponsFilterFragmentArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsFilterFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/coupons/filter/CouponsFilterFragmentArgs$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,105:1\n11335#2:106\n11670#2,3:107\n11335#2:112\n11670#2,3:113\n11335#2:118\n11670#2,3:119\n11335#2:124\n11670#2,3:125\n37#3,2:110\n37#3,2:116\n37#3,2:122\n37#3,2:128\n*S KotlinDebug\n*F\n+ 1 CouponsFilterFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/coupons/filter/CouponsFilterFragmentArgs$Companion\n*L\n43#1:106\n43#1:107,3\n53#1:112\n53#1:113,3\n74#1:118\n74#1:119,3\n84#1:124\n84#1:125,3\n44#1:110,2\n54#1:116,2\n75#1:122,2\n85#1:128,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.filter.c$a */
    public static final class C23811a {
        public /* synthetic */ C23811a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23810c mo69738a(@C12579k Bundle bundle) {
            CouponModel[] couponModelArr;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23810c.class.getClassLoader());
            if (bundle.containsKey("couponsList")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("couponsList");
                CouponsFilter[] couponsFilterArr = null;
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.CouponModel");
                        arrayList.add((CouponModel) parcelable);
                    }
                    couponModelArr = (CouponModel[]) arrayList.toArray(new CouponModel[0]);
                } else {
                    couponModelArr = null;
                }
                if (couponModelArr == null) {
                    throw new IllegalArgumentException("Argument \"couponsList\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("filtersList")) {
                    Parcelable[] parcelableArray2 = bundle.getParcelableArray("filtersList");
                    if (parcelableArray2 != null) {
                        ArrayList arrayList2 = new ArrayList(parcelableArray2.length);
                        for (Parcelable parcelable2 : parcelableArray2) {
                            Intrinsics.checkNotNull(parcelable2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.CouponsFilter");
                            arrayList2.add((CouponsFilter) parcelable2);
                        }
                        couponsFilterArr = (CouponsFilter[]) arrayList2.toArray(new CouponsFilter[0]);
                    }
                    if (couponsFilterArr != null) {
                        if (bundle.containsKey("isInStore")) {
                            z = bundle.getBoolean("isInStore");
                        } else {
                            z = true;
                        }
                        return new C23810c(couponModelArr, couponsFilterArr, z);
                    }
                    throw new IllegalArgumentException("Argument \"filtersList\" is marked as non-null but was passed a null value.");
                } else {
                    throw new IllegalArgumentException("Required argument \"filtersList\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"couponsList\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23810c mo69739b(@C12579k C19456p0 p0Var) {
            CouponModel[] couponModelArr;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("couponsList")) {
                Parcelable[] parcelableArr = (Parcelable[]) p0Var.mo57648h("couponsList");
                CouponsFilter[] couponsFilterArr = null;
                if (parcelableArr != null) {
                    ArrayList arrayList = new ArrayList(parcelableArr.length);
                    for (Parcelable parcelable : parcelableArr) {
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.CouponModel");
                        arrayList.add((CouponModel) parcelable);
                    }
                    couponModelArr = (CouponModel[]) arrayList.toArray(new CouponModel[0]);
                } else {
                    couponModelArr = null;
                }
                if (couponModelArr == null) {
                    throw new IllegalArgumentException("Argument \"couponsList\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("filtersList")) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) p0Var.mo57648h("filtersList");
                    if (parcelableArr2 != null) {
                        ArrayList arrayList2 = new ArrayList(parcelableArr2.length);
                        for (Parcelable parcelable2 : parcelableArr2) {
                            Intrinsics.checkNotNull(parcelable2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.CouponsFilter");
                            arrayList2.add((CouponsFilter) parcelable2);
                        }
                        couponsFilterArr = (CouponsFilter[]) arrayList2.toArray(new CouponsFilter[0]);
                    }
                    if (couponsFilterArr != null) {
                        if (p0Var.mo57647f("isInStore")) {
                            bool = (Boolean) p0Var.mo57648h("isInStore");
                            if (bool == null) {
                                throw new IllegalArgumentException("Argument \"isInStore\" of type boolean does not support null values");
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        return new C23810c(couponModelArr, couponsFilterArr, bool.booleanValue());
                    }
                    throw new IllegalArgumentException("Argument \"filtersList\" is marked as non-null but was passed a null value");
                } else {
                    throw new IllegalArgumentException("Required argument \"filtersList\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"couponsList\" is missing and does not have an android:defaultValue");
            }
        }

        public C23811a() {
        }
    }

    public C23810c(@C12579k CouponModel[] couponModelArr, @C12579k CouponsFilter[] couponsFilterArr, boolean z) {
        Intrinsics.checkNotNullParameter(couponModelArr, "couponsList");
        Intrinsics.checkNotNullParameter(couponsFilterArr, "filtersList");
        this.f59914a = couponModelArr;
        this.f59915b = couponsFilterArr;
        this.f59916c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C23810c m105490e(C23810c cVar, CouponModel[] couponModelArr, CouponsFilter[] couponsFilterArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            couponModelArr = cVar.f59914a;
        }
        if ((i & 2) != 0) {
            couponsFilterArr = cVar.f59915b;
        }
        if ((i & 4) != 0) {
            z = cVar.f59916c;
        }
        return cVar.mo69729d(couponModelArr, couponsFilterArr, z);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C23810c m105491f(@C12579k C19456p0 p0Var) {
        return f59912d.mo69739b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23810c fromBundle(@C12579k Bundle bundle) {
        return f59912d.mo69738a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final CouponModel[] mo69726a() {
        return this.f59914a;
    }

    @C12579k
    /* renamed from: b */
    public final CouponsFilter[] mo69727b() {
        return this.f59915b;
    }

    /* renamed from: c */
    public final boolean mo69728c() {
        return this.f59916c;
    }

    @C12579k
    /* renamed from: d */
    public final C23810c mo69729d(@C12579k CouponModel[] couponModelArr, @C12579k CouponsFilter[] couponsFilterArr, boolean z) {
        Intrinsics.checkNotNullParameter(couponModelArr, "couponsList");
        Intrinsics.checkNotNullParameter(couponsFilterArr, "filtersList");
        return new C23810c(couponModelArr, couponsFilterArr, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23810c)) {
            return false;
        }
        C23810c cVar = (C23810c) obj;
        return Intrinsics.areEqual((Object) this.f59914a, (Object) cVar.f59914a) && Intrinsics.areEqual((Object) this.f59915b, (Object) cVar.f59915b) && this.f59916c == cVar.f59916c;
    }

    @C12579k
    /* renamed from: g */
    public final CouponModel[] mo69731g() {
        return this.f59914a;
    }

    @C12579k
    /* renamed from: h */
    public final CouponsFilter[] mo69732h() {
        return this.f59915b;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f59914a) * 31) + Arrays.hashCode(this.f59915b)) * 31;
        boolean z = this.f59916c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo69734i() {
        return this.f59916c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo69735j() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("couponsList", (Parcelable[]) this.f59914a);
        bundle.putParcelableArray("filtersList", (Parcelable[]) this.f59915b);
        bundle.putBoolean("isInStore", this.f59916c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo69736k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("couponsList", this.f59914a);
        p0Var.mo57656q("filtersList", this.f59915b);
        p0Var.mo57656q("isInStore", Boolean.valueOf(this.f59916c));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String arrays = Arrays.toString(this.f59914a);
        String arrays2 = Arrays.toString(this.f59915b);
        boolean z = this.f59916c;
        return "CouponsFilterFragmentArgs(couponsList=" + arrays + ", filtersList=" + arrays2 + ", isInStore=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23810c(CouponModel[] couponModelArr, CouponsFilter[] couponsFilterArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(couponModelArr, couponsFilterArr, (i & 4) != 0 ? true : z);
    }
}
