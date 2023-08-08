package com.carrefour.fid.android.catalogs.presentation.p065ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.b */
public final class C39490b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C39491a f101002b = new C39491a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101003c = 8;
    @C12579k

    /* renamed from: a */
    public final Catalog f101004a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.b$a */
    public static final class C39491a {
        public /* synthetic */ C39491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39490b mo130646a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39490b.class.getClassLoader());
            if (bundle.containsKey("catalog")) {
                Class<Catalog> cls = Catalog.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    Catalog catalog = (Catalog) bundle.get("catalog");
                    if (catalog != null) {
                        return new C39490b(catalog);
                    }
                    throw new IllegalArgumentException("Argument \"catalog\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"catalog\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C39490b mo130647b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("catalog")) {
                Class<Catalog> cls = Catalog.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    Catalog catalog = (Catalog) p0Var.mo57648h("catalog");
                    if (catalog != null) {
                        return new C39490b(catalog);
                    }
                    throw new IllegalArgumentException("Argument \"catalog\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"catalog\" is missing and does not have an android:defaultValue");
        }

        public C39491a() {
        }
    }

    public C39490b(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        this.f101004a = catalog;
    }

    /* renamed from: c */
    public static /* synthetic */ C39490b m161763c(C39490b bVar, Catalog catalog, int i, Object obj) {
        if ((i & 1) != 0) {
            catalog = bVar.f101004a;
        }
        return bVar.mo130639b(catalog);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C39490b m161764d(@C12579k C19456p0 p0Var) {
        return f101002b.mo130647b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C39490b fromBundle(@C12579k Bundle bundle) {
        return f101002b.mo130646a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final Catalog mo130638a() {
        return this.f101004a;
    }

    @C12579k
    /* renamed from: b */
    public final C39490b mo130639b(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        return new C39490b(catalog);
    }

    @C12579k
    /* renamed from: e */
    public final Catalog mo130640e() {
        return this.f101004a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39490b) && Intrinsics.areEqual((Object) this.f101004a, (Object) ((C39490b) obj).f101004a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo130642f() {
        Bundle bundle = new Bundle();
        Class<Catalog> cls = Catalog.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            Catalog catalog = this.f101004a;
            Intrinsics.checkNotNull(catalog, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("catalog", catalog);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            Catalog catalog2 = this.f101004a;
            Intrinsics.checkNotNull(catalog2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("catalog", (Serializable) catalog2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo130643g() {
        C19456p0 p0Var = new C19456p0();
        Class<Catalog> cls = Catalog.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            Catalog catalog = this.f101004a;
            Intrinsics.checkNotNull(catalog, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("catalog", catalog);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            Catalog catalog2 = this.f101004a;
            Intrinsics.checkNotNull(catalog2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("catalog", (Serializable) catalog2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f101004a.hashCode();
    }

    @C12579k
    public String toString() {
        Catalog catalog = this.f101004a;
        return "CatalogDetailsFragmentArgs(catalog=" + catalog + ")";
    }
}
