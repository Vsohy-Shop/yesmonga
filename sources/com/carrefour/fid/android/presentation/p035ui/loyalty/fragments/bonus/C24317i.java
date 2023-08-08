package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.i */
public final class C24317i implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24318a f60753c = new C24318a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60754d = 8;
    @C12580l

    /* renamed from: a */
    public final LoyaltyBonus[] f60755a;

    /* renamed from: b */
    public final boolean f60756b;

    @C11363r0({"SMAP\nPrimeFidFragmentArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimeFidFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/PrimeFidFragmentArgs$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,75:1\n11335#2:76\n11670#2,3:77\n11335#2:82\n11670#2,3:83\n37#3,2:80\n37#3,2:86\n*S KotlinDebug\n*F\n+ 1 PrimeFidFragmentArgs.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/PrimeFidFragmentArgs$Companion\n*L\n39#1:76\n39#1:77,3\n57#1:82\n57#1:83,3\n40#1:80,2\n58#1:86,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.i$a */
    public static final class C24318a {
        public /* synthetic */ C24318a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24317i mo71146a(@C12579k Bundle bundle) {
            boolean z;
            Parcelable[] parcelableArray;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24317i.class.getClassLoader());
            LoyaltyBonus[] loyaltyBonusArr = null;
            if (bundle.containsKey("primeList") && (parcelableArray = bundle.getParcelableArray("primeList")) != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.cms.domain.models.LoyaltyBonus");
                    arrayList.add((LoyaltyBonus) parcelable);
                }
                loyaltyBonusArr = (LoyaltyBonus[]) arrayList.toArray(new LoyaltyBonus[0]);
            }
            if (bundle.containsKey("isDeepLink")) {
                z = bundle.getBoolean("isDeepLink");
            } else {
                z = true;
            }
            return new C24317i(loyaltyBonusArr, z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24317i mo71147b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Parcelable[] parcelableArr;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            LoyaltyBonus[] loyaltyBonusArr = null;
            if (p0Var.mo57647f("primeList") && (parcelableArr = (Parcelable[]) p0Var.mo57648h("primeList")) != null) {
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.carrefour.fid.android.cms.domain.models.LoyaltyBonus");
                    arrayList.add((LoyaltyBonus) parcelable);
                }
                loyaltyBonusArr = (LoyaltyBonus[]) arrayList.toArray(new LoyaltyBonus[0]);
            }
            if (p0Var.mo57647f("isDeepLink")) {
                bool = (Boolean) p0Var.mo57648h("isDeepLink");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isDeepLink\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.TRUE;
            }
            return new C24317i(loyaltyBonusArr, bool.booleanValue());
        }

        public C24318a() {
        }
    }

    public C24317i() {
        this((LoyaltyBonus[]) null, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C24317i m106875d(C24317i iVar, LoyaltyBonus[] loyaltyBonusArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            loyaltyBonusArr = iVar.f60755a;
        }
        if ((i & 2) != 0) {
            z = iVar.f60756b;
        }
        return iVar.mo71138c(loyaltyBonusArr, z);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24317i m106876e(@C12579k C19456p0 p0Var) {
        return f60753c.mo71147b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24317i fromBundle(@C12579k Bundle bundle) {
        return f60753c.mo71146a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final LoyaltyBonus[] mo71136a() {
        return this.f60755a;
    }

    /* renamed from: b */
    public final boolean mo71137b() {
        return this.f60756b;
    }

    @C12579k
    /* renamed from: c */
    public final C24317i mo71138c(@C12580l LoyaltyBonus[] loyaltyBonusArr, boolean z) {
        return new C24317i(loyaltyBonusArr, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24317i)) {
            return false;
        }
        C24317i iVar = (C24317i) obj;
        return Intrinsics.areEqual((Object) this.f60755a, (Object) iVar.f60755a) && this.f60756b == iVar.f60756b;
    }

    @C12580l
    /* renamed from: f */
    public final LoyaltyBonus[] mo71140f() {
        return this.f60755a;
    }

    /* renamed from: g */
    public final boolean mo71141g() {
        return this.f60756b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo71142h() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("primeList", (Parcelable[]) this.f60755a);
        bundle.putBoolean("isDeepLink", this.f60756b);
        return bundle;
    }

    public int hashCode() {
        LoyaltyBonus[] loyaltyBonusArr = this.f60755a;
        int hashCode = (loyaltyBonusArr == null ? 0 : Arrays.hashCode(loyaltyBonusArr)) * 31;
        boolean z = this.f60756b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo71144i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("primeList", this.f60755a);
        p0Var.mo57656q("isDeepLink", Boolean.valueOf(this.f60756b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String arrays = Arrays.toString(this.f60755a);
        boolean z = this.f60756b;
        return "PrimeFidFragmentArgs(primeList=" + arrays + ", isDeepLink=" + z + ")";
    }

    public C24317i(@C12580l LoyaltyBonus[] loyaltyBonusArr, boolean z) {
        this.f60755a = loyaltyBonusArr;
        this.f60756b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24317i(LoyaltyBonus[] loyaltyBonusArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loyaltyBonusArr, (i & 2) != 0 ? true : z);
    }
}
