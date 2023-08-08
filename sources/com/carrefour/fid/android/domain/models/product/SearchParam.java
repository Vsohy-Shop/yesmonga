package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0001\u0018\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/SearchParam;", "Landroid/os/Parcelable;", "", "h", "(Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)I", "", "other", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)Z", "c", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "j", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "text", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11288f
@C12187d
public final class SearchParam implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SearchParam> CREATOR = new C38098a();
    @C12579k

    /* renamed from: a */
    public final String f96312a;

    /* renamed from: com.carrefour.fid.android.domain.models.product.SearchParam$a */
    public static final class C38098a implements Parcelable.Creator<SearchParam> {
        @C12579k
        /* renamed from: a */
        public final String mo118601a(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SearchParam.m157478b(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final SearchParam[] newArray(int i) {
            return new SearchParam[i];
        }

        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return SearchParam.m157477a(mo118601a(parcel));
        }
    }

    public /* synthetic */ SearchParam(String str) {
        this.f96312a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchParam m157477a(String str) {
        return new SearchParam(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157478b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        return str;
    }

    /* renamed from: c */
    public static int m157479c(String str) {
        return 0;
    }

    /* renamed from: d */
    public static boolean m157480d(String str, Object obj) {
        return (obj instanceof SearchParam) && Intrinsics.areEqual((Object) str, (Object) ((SearchParam) obj).mo118598i());
    }

    /* renamed from: e */
    public static final boolean m157481e(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: g */
    public static int m157482g(String str) {
        return str.hashCode();
    }

    /* renamed from: h */
    public static String m157483h(String str) {
        return "SearchParam(text=" + str + ")";
    }

    /* renamed from: j */
    public static void m157484j(String str, @C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(str);
    }

    public int describeContents() {
        return m157479c(this.f96312a);
    }

    public boolean equals(Object obj) {
        return m157480d(this.f96312a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final String mo118596f() {
        return this.f96312a;
    }

    public int hashCode() {
        return m157482g(this.f96312a);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo118598i() {
        return this.f96312a;
    }

    public String toString() {
        return m157483h(this.f96312a);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        m157484j(this.f96312a, parcel, i);
    }
}
