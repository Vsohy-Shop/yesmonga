package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.iam.C9259x;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.i */
public final class C27808i implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C27809a f67400d = new C27809a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f67401e = 8;
    @C12580l

    /* renamed from: a */
    public final OfferIdentifier f67402a;

    /* renamed from: b */
    public final int f67403b;
    @C12580l

    /* renamed from: c */
    public final String f67404c;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.i$a */
    public static final class C27809a {
        public /* synthetic */ C27809a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27808i mo80770a(@C12579k Bundle bundle) {
            OfferIdentifier offerIdentifier;
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27808i.class.getClassLoader());
            String str = null;
            if (bundle.containsKey("offerIdentifier")) {
                Class<OfferIdentifier> cls = OfferIdentifier.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    offerIdentifier = (OfferIdentifier) bundle.get("offerIdentifier");
                } else {
                    throw new UnsupportedOperationException(cls.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                offerIdentifier = null;
            }
            if (bundle.containsKey(C9259x.f25239v)) {
                i = bundle.getInt(C9259x.f25239v);
            } else {
                i = 0;
            }
            if (bundle.containsKey(C28547h2.f69321i)) {
                str = bundle.getString(C28547h2.f69321i);
            }
            return new C27808i(offerIdentifier, i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.product.presentation.p039ui.details.C27808i mo80771b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r6) {
            /*
                r5 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "offerIdentifier"
                boolean r1 = r6.mo57647f(r0)
                r2 = 0
                if (r1 == 0) goto L_0x0043
                java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
                java.lang.Class<com.carrefour.fid.android.domain.models.offer.OfferIdentifier> r3 = com.carrefour.fid.android.domain.models.offer.OfferIdentifier.class
                boolean r1 = r1.isAssignableFrom(r3)
                if (r1 != 0) goto L_0x003c
                java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
                boolean r1 = r1.isAssignableFrom(r3)
                if (r1 == 0) goto L_0x0021
                goto L_0x003c
            L_0x0021:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r3.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " must implement Parcelable or Serializable or must be an Enum."
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6.<init>(r0)
                throw r6
            L_0x003c:
                java.lang.Object r0 = r6.mo57648h(r0)
                com.carrefour.fid.android.domain.models.offer.OfferIdentifier r0 = (com.carrefour.fid.android.domain.models.offer.OfferIdentifier) r0
                goto L_0x0044
            L_0x0043:
                r0 = r2
            L_0x0044:
                java.lang.String r1 = "position"
                boolean r3 = r6.mo57647f(r1)
                if (r3 == 0) goto L_0x005d
                java.lang.Object r1 = r6.mo57648h(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x0055
                goto L_0x0062
            L_0x0055:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"position\" of type integer does not support null values"
                r6.<init>(r0)
                throw r6
            L_0x005d:
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            L_0x0062:
                java.lang.String r3 = "product_ean"
                boolean r4 = r6.mo57647f(r3)
                if (r4 == 0) goto L_0x0071
                java.lang.Object r6 = r6.mo57648h(r3)
                r2 = r6
                java.lang.String r2 = (java.lang.String) r2
            L_0x0071:
                com.carrefour.fid.android.product.presentation.ui.details.i r6 = new com.carrefour.fid.android.product.presentation.ui.details.i
                int r1 = r1.intValue()
                r6.<init>(r0, r1, r2)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.C27808i.C27809a.mo80771b(androidx.lifecycle.p0):com.carrefour.fid.android.product.presentation.ui.details.i");
        }

        public C27809a() {
        }
    }

    public C27808i() {
        this((OfferIdentifier) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C27808i m116765e(C27808i iVar, OfferIdentifier offerIdentifier, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offerIdentifier = iVar.f67402a;
        }
        if ((i2 & 2) != 0) {
            i = iVar.f67403b;
        }
        if ((i2 & 4) != 0) {
            str = iVar.f67404c;
        }
        return iVar.mo80761d(offerIdentifier, i, str);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C27808i m116766f(@C12579k C19456p0 p0Var) {
        return f67400d.mo80771b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27808i fromBundle(@C12579k Bundle bundle) {
        return f67400d.mo80770a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final OfferIdentifier mo80758a() {
        return this.f67402a;
    }

    /* renamed from: b */
    public final int mo80759b() {
        return this.f67403b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo80760c() {
        return this.f67404c;
    }

    @C12579k
    /* renamed from: d */
    public final C27808i mo80761d(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
        return new C27808i(offerIdentifier, i, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27808i)) {
            return false;
        }
        C27808i iVar = (C27808i) obj;
        return Intrinsics.areEqual((Object) this.f67402a, (Object) iVar.f67402a) && this.f67403b == iVar.f67403b && Intrinsics.areEqual((Object) this.f67404c, (Object) iVar.f67404c);
    }

    @C12580l
    /* renamed from: g */
    public final OfferIdentifier mo80763g() {
        return this.f67402a;
    }

    /* renamed from: h */
    public final int mo80764h() {
        return this.f67403b;
    }

    public int hashCode() {
        OfferIdentifier offerIdentifier = this.f67402a;
        int i = 0;
        int hashCode = (((offerIdentifier == null ? 0 : offerIdentifier.hashCode()) * 31) + Integer.hashCode(this.f67403b)) * 31;
        String str = this.f67404c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo80766i() {
        return this.f67404c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo80767j() {
        Bundle bundle = new Bundle();
        Class<OfferIdentifier> cls = OfferIdentifier.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("offerIdentifier", this.f67402a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("offerIdentifier", (Serializable) this.f67402a);
        }
        bundle.putInt(C9259x.f25239v, this.f67403b);
        bundle.putString(C28547h2.f69321i, this.f67404c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo80768k() {
        C19456p0 p0Var = new C19456p0();
        Class<OfferIdentifier> cls = OfferIdentifier.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("offerIdentifier", this.f67402a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("offerIdentifier", (Serializable) this.f67402a);
        }
        p0Var.mo57656q(C9259x.f25239v, Integer.valueOf(this.f67403b));
        p0Var.mo57656q(C28547h2.f69321i, this.f67404c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        OfferIdentifier offerIdentifier = this.f67402a;
        int i = this.f67403b;
        String str = this.f67404c;
        return "ProductDetailsFragmentArgs(offerIdentifier=" + offerIdentifier + ", position=" + i + ", productEan=" + str + ")";
    }

    public C27808i(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
        this.f67402a = offerIdentifier;
        this.f67403b = i;
        this.f67404c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27808i(OfferIdentifier offerIdentifier, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : offerIdentifier, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
