package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.MemoItem;
import com.carrefour.fid.android.core.type.C36368a;
import com.carrefour.fid.android.shared.data.datastore.proto.C28636c;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.l */
public final class C38495l implements Comparable<C38495l>, C28636c<MemoItem> {
    @C12579k

    /* renamed from: e */
    public static final C38496a f97623e = new C38496a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f97624f = 0;
    @C12579k

    /* renamed from: a */
    public final String f97625a;
    @C12579k

    /* renamed from: b */
    public final String f97626b;
    @C12579k

    /* renamed from: c */
    public final C36368a f97627c;
    @C12579k

    /* renamed from: d */
    public final String f97628d;

    /* renamed from: com.carrefour.fid.android.presentation.models.l$a */
    public static final class C38496a {
        public /* synthetic */ C38496a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C38495l m159720b(C38496a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = new String();
            }
            if ((i & 4) != 0) {
                str3 = new String();
            }
            return aVar.mo122114a(str, str2, str3);
        }

        /* renamed from: d */
        public static /* synthetic */ C38495l m159721d(C38496a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = new String();
            }
            if ((i & 4) != 0) {
                str3 = new String();
            }
            return aVar.mo122115c(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final C38495l mo122114a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            Intrinsics.checkNotNullParameter(str3, "creationDate");
            return new C38495l(str, str2, C36368a.C36369a.f89966c, str3);
        }

        @C12579k
        /* renamed from: c */
        public final C38495l mo122115c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            Intrinsics.checkNotNullParameter(str3, "creationDate");
            return new C38495l(str, str2, C36368a.C36370b.f89968c, str3);
        }

        public C38496a() {
        }
    }

    public C38495l(@C12579k String str, @C12579k String str2, @C12579k C36368a aVar, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "value");
        Intrinsics.checkNotNullParameter(aVar, "type");
        Intrinsics.checkNotNullParameter(str3, "creationDate");
        this.f97625a = str;
        this.f97626b = str2;
        this.f97627c = aVar;
        this.f97628d = str3;
    }

    /* renamed from: M */
    public static /* synthetic */ C38495l m159707M(C38495l lVar, String str, String str2, C36368a aVar, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lVar.f97625a;
        }
        if ((i & 2) != 0) {
            str2 = lVar.f97626b;
        }
        if ((i & 4) != 0) {
            aVar = lVar.f97627c;
        }
        if ((i & 8) != 0) {
            str3 = lVar.f97628d;
        }
        return lVar.mo122113z(str, str2, aVar, str3);
    }

    @C12579k
    /* renamed from: Q */
    public final String mo122099Q() {
        return this.f97628d;
    }

    @C12579k
    /* renamed from: W */
    public final String mo122100W() {
        return this.f97625a;
    }

    @C12579k
    /* renamed from: X */
    public final C36368a mo122101X() {
        return this.f97627c;
    }

    @C12579k
    /* renamed from: Z */
    public final String mo122102Z() {
        return this.f97626b;
    }

    /* renamed from: b */
    public int compareTo(@C12579k C38495l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "other");
        if (Intrinsics.areEqual((Object) this.f97627c, (Object) lVar.f97627c)) {
            return this.f97626b.compareTo(lVar.f97626b);
        }
        if (this.f97627c instanceof C36368a.C36369a) {
            return 1;
        }
        return -1;
    }

    @C12579k
    /* renamed from: e0 */
    public MemoItem mo83534g() {
        GeneratedMessageLite B = MemoItem.newBuilder().mo30822Y(this.f97625a).mo30826c0(this.f97626b).mo30824a0(this.f97627c.mo108613a()).mo30820U(this.f97628d).mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "newBuilder()\n        .se…ionDate)\n        .build()");
        return (MemoItem) B;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38495l)) {
            return false;
        }
        C38495l lVar = (C38495l) obj;
        return Intrinsics.areEqual((Object) this.f97625a, (Object) lVar.f97625a) && Intrinsics.areEqual((Object) this.f97626b, (Object) lVar.f97626b) && Intrinsics.areEqual((Object) this.f97627c, (Object) lVar.f97627c) && Intrinsics.areEqual((Object) this.f97628d, (Object) lVar.f97628d);
    }

    public int hashCode() {
        return (((((this.f97625a.hashCode() * 31) + this.f97626b.hashCode()) * 31) + this.f97627c.hashCode()) * 31) + this.f97628d.hashCode();
    }

    @C12579k
    /* renamed from: q */
    public final String mo122108q() {
        return this.f97625a;
    }

    @C12579k
    /* renamed from: r */
    public final String mo122109r() {
        return this.f97626b;
    }

    @C12579k
    public String toString() {
        String str = this.f97625a;
        String str2 = this.f97626b;
        C36368a aVar = this.f97627c;
        String str3 = this.f97628d;
        return "MemoModel(id=" + str + ", value=" + str2 + ", type=" + aVar + ", creationDate=" + str3 + ")";
    }

    @C12579k
    /* renamed from: w */
    public final C36368a mo122111w() {
        return this.f97627c;
    }

    @C12579k
    /* renamed from: y */
    public final String mo122112y() {
        return this.f97628d;
    }

    @C12579k
    /* renamed from: z */
    public final C38495l mo122113z(@C12579k String str, @C12579k String str2, @C12579k C36368a aVar, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "value");
        Intrinsics.checkNotNullParameter(aVar, "type");
        Intrinsics.checkNotNullParameter(str3, "creationDate");
        return new C38495l(str, str2, aVar, str3);
    }
}
